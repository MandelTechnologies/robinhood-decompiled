package com.robinhood.rosetta.mainst;

import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.Venue;

/* compiled from: NBBODetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0084\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/NBBODetails;", "Lcom/squareup/wire/Message;", "", BidAskDetails3.ASK_PRICE, "Lcom/robinhood/rosetta/mainst/Decimal;", "ask_quantity", "bid_venue", "Lrosetta/mainst/Venue;", BidAskDetails3.BID_PRICE, "bid_quantity", "ask_venue", "exchange_timestamp", "Lcom/robinhood/rosetta/mainst/Time;", "mid_price", "limit_up_price", "limit_down_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Venue;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Venue;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lokio/ByteString;)V", "getAsk_price", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getAsk_quantity", "getBid_venue", "()Lrosetta/mainst/Venue;", "getBid_price", "getBid_quantity", "getAsk_venue", "getExchange_timestamp", "()Lcom/robinhood/rosetta/mainst/Time;", "getMid_price", "getLimit_up_price", "getLimit_down_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class NBBODetails extends Message {

    @JvmField
    public static final ProtoAdapter<NBBODetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Decimal ask_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "askQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Decimal ask_quantity;

    @WireField(adapter = "rosetta.mainst.Venue#ADAPTER", jsonName = "askVenue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Venue ask_venue;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Decimal bid_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "bidQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Decimal bid_quantity;

    @WireField(adapter = "rosetta.mainst.Venue#ADAPTER", jsonName = "bidVenue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Venue bid_venue;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "exchangeTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Time exchange_timestamp;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "limitDownPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Decimal limit_down_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "limitUpPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Decimal limit_up_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "midPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Decimal mid_price;

    public NBBODetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24672newBuilder();
    }

    public final Decimal getAsk_price() {
        return this.ask_price;
    }

    public final Decimal getAsk_quantity() {
        return this.ask_quantity;
    }

    public final Venue getBid_venue() {
        return this.bid_venue;
    }

    public /* synthetic */ NBBODetails(Decimal decimal, Decimal decimal2, Venue venue, Decimal decimal3, Decimal decimal4, Venue venue2, Time time, Decimal decimal5, Decimal decimal6, Decimal decimal7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : decimal, (i & 2) != 0 ? null : decimal2, (i & 4) != 0 ? Venue.VENUE_UNSPECIFIED : venue, (i & 8) != 0 ? null : decimal3, (i & 16) != 0 ? null : decimal4, (i & 32) != 0 ? Venue.VENUE_UNSPECIFIED : venue2, (i & 64) != 0 ? null : time, (i & 128) != 0 ? null : decimal5, (i & 256) != 0 ? null : decimal6, (i & 512) != 0 ? null : decimal7, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Decimal getBid_price() {
        return this.bid_price;
    }

    public final Decimal getBid_quantity() {
        return this.bid_quantity;
    }

    public final Venue getAsk_venue() {
        return this.ask_venue;
    }

    public final Time getExchange_timestamp() {
        return this.exchange_timestamp;
    }

    public final Decimal getMid_price() {
        return this.mid_price;
    }

    public final Decimal getLimit_up_price() {
        return this.limit_up_price;
    }

    public final Decimal getLimit_down_price() {
        return this.limit_down_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NBBODetails(Decimal decimal, Decimal decimal2, Venue bid_venue, Decimal decimal3, Decimal decimal4, Venue ask_venue, Time time, Decimal decimal5, Decimal decimal6, Decimal decimal7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bid_venue, "bid_venue");
        Intrinsics.checkNotNullParameter(ask_venue, "ask_venue");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ask_price = decimal;
        this.ask_quantity = decimal2;
        this.bid_venue = bid_venue;
        this.bid_price = decimal3;
        this.bid_quantity = decimal4;
        this.ask_venue = ask_venue;
        this.exchange_timestamp = time;
        this.mid_price = decimal5;
        this.limit_up_price = decimal6;
        this.limit_down_price = decimal7;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24672newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NBBODetails)) {
            return false;
        }
        NBBODetails nBBODetails = (NBBODetails) other;
        return Intrinsics.areEqual(unknownFields(), nBBODetails.unknownFields()) && Intrinsics.areEqual(this.ask_price, nBBODetails.ask_price) && Intrinsics.areEqual(this.ask_quantity, nBBODetails.ask_quantity) && this.bid_venue == nBBODetails.bid_venue && Intrinsics.areEqual(this.bid_price, nBBODetails.bid_price) && Intrinsics.areEqual(this.bid_quantity, nBBODetails.bid_quantity) && this.ask_venue == nBBODetails.ask_venue && Intrinsics.areEqual(this.exchange_timestamp, nBBODetails.exchange_timestamp) && Intrinsics.areEqual(this.mid_price, nBBODetails.mid_price) && Intrinsics.areEqual(this.limit_up_price, nBBODetails.limit_up_price) && Intrinsics.areEqual(this.limit_down_price, nBBODetails.limit_down_price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Decimal decimal = this.ask_price;
        int iHashCode2 = (iHashCode + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.ask_quantity;
        int iHashCode3 = (((iHashCode2 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37) + this.bid_venue.hashCode()) * 37;
        Decimal decimal3 = this.bid_price;
        int iHashCode4 = (iHashCode3 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        Decimal decimal4 = this.bid_quantity;
        int iHashCode5 = (((iHashCode4 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37) + this.ask_venue.hashCode()) * 37;
        Time time = this.exchange_timestamp;
        int iHashCode6 = (iHashCode5 + (time != null ? time.hashCode() : 0)) * 37;
        Decimal decimal5 = this.mid_price;
        int iHashCode7 = (iHashCode6 + (decimal5 != null ? decimal5.hashCode() : 0)) * 37;
        Decimal decimal6 = this.limit_up_price;
        int iHashCode8 = (iHashCode7 + (decimal6 != null ? decimal6.hashCode() : 0)) * 37;
        Decimal decimal7 = this.limit_down_price;
        int iHashCode9 = iHashCode8 + (decimal7 != null ? decimal7.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Decimal decimal = this.ask_price;
        if (decimal != null) {
            arrayList.add("ask_price=" + decimal);
        }
        Decimal decimal2 = this.ask_quantity;
        if (decimal2 != null) {
            arrayList.add("ask_quantity=" + decimal2);
        }
        arrayList.add("bid_venue=" + this.bid_venue);
        Decimal decimal3 = this.bid_price;
        if (decimal3 != null) {
            arrayList.add("bid_price=" + decimal3);
        }
        Decimal decimal4 = this.bid_quantity;
        if (decimal4 != null) {
            arrayList.add("bid_quantity=" + decimal4);
        }
        arrayList.add("ask_venue=" + this.ask_venue);
        Time time = this.exchange_timestamp;
        if (time != null) {
            arrayList.add("exchange_timestamp=" + time);
        }
        Decimal decimal5 = this.mid_price;
        if (decimal5 != null) {
            arrayList.add("mid_price=" + decimal5);
        }
        Decimal decimal6 = this.limit_up_price;
        if (decimal6 != null) {
            arrayList.add("limit_up_price=" + decimal6);
        }
        Decimal decimal7 = this.limit_down_price;
        if (decimal7 != null) {
            arrayList.add("limit_down_price=" + decimal7);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NBBODetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NBBODetails copy$default(NBBODetails nBBODetails, Decimal decimal, Decimal decimal2, Venue venue, Decimal decimal3, Decimal decimal4, Venue venue2, Time time, Decimal decimal5, Decimal decimal6, Decimal decimal7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            decimal = nBBODetails.ask_price;
        }
        if ((i & 2) != 0) {
            decimal2 = nBBODetails.ask_quantity;
        }
        if ((i & 4) != 0) {
            venue = nBBODetails.bid_venue;
        }
        if ((i & 8) != 0) {
            decimal3 = nBBODetails.bid_price;
        }
        if ((i & 16) != 0) {
            decimal4 = nBBODetails.bid_quantity;
        }
        if ((i & 32) != 0) {
            venue2 = nBBODetails.ask_venue;
        }
        if ((i & 64) != 0) {
            time = nBBODetails.exchange_timestamp;
        }
        if ((i & 128) != 0) {
            decimal5 = nBBODetails.mid_price;
        }
        if ((i & 256) != 0) {
            decimal6 = nBBODetails.limit_up_price;
        }
        if ((i & 512) != 0) {
            decimal7 = nBBODetails.limit_down_price;
        }
        if ((i & 1024) != 0) {
            byteString = nBBODetails.unknownFields();
        }
        Decimal decimal8 = decimal7;
        ByteString byteString2 = byteString;
        Decimal decimal9 = decimal5;
        Decimal decimal10 = decimal6;
        Venue venue3 = venue2;
        Time time2 = time;
        Decimal decimal11 = decimal4;
        Venue venue4 = venue;
        return nBBODetails.copy(decimal, decimal2, venue4, decimal3, decimal11, venue3, time2, decimal9, decimal10, decimal8, byteString2);
    }

    public final NBBODetails copy(Decimal ask_price, Decimal ask_quantity, Venue bid_venue, Decimal bid_price, Decimal bid_quantity, Venue ask_venue, Time exchange_timestamp, Decimal mid_price, Decimal limit_up_price, Decimal limit_down_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bid_venue, "bid_venue");
        Intrinsics.checkNotNullParameter(ask_venue, "ask_venue");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NBBODetails(ask_price, ask_quantity, bid_venue, bid_price, bid_quantity, ask_venue, exchange_timestamp, mid_price, limit_up_price, limit_down_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NBBODetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NBBODetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.NBBODetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NBBODetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAsk_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(1, value.getAsk_price());
                }
                if (value.getAsk_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(2, value.getAsk_quantity());
                }
                Venue bid_venue = value.getBid_venue();
                Venue venue = Venue.VENUE_UNSPECIFIED;
                if (bid_venue != venue) {
                    size += Venue.ADAPTER.encodedSizeWithTag(3, value.getBid_venue());
                }
                if (value.getBid_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(4, value.getBid_price());
                }
                if (value.getBid_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(5, value.getBid_quantity());
                }
                if (value.getAsk_venue() != venue) {
                    size += Venue.ADAPTER.encodedSizeWithTag(6, value.getAsk_venue());
                }
                if (value.getExchange_timestamp() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(7, value.getExchange_timestamp());
                }
                if (value.getMid_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(8, value.getMid_price());
                }
                if (value.getLimit_up_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(9, value.getLimit_up_price());
                }
                return value.getLimit_down_price() != null ? size + Decimal.ADAPTER.encodedSizeWithTag(10, value.getLimit_down_price()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NBBODetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAsk_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsk_price());
                }
                if (value.getAsk_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsk_quantity());
                }
                Venue bid_venue = value.getBid_venue();
                Venue venue = Venue.VENUE_UNSPECIFIED;
                if (bid_venue != venue) {
                    Venue.ADAPTER.encodeWithTag(writer, 3, (int) value.getBid_venue());
                }
                if (value.getBid_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getBid_price());
                }
                if (value.getBid_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getBid_quantity());
                }
                if (value.getAsk_venue() != venue) {
                    Venue.ADAPTER.encodeWithTag(writer, 6, (int) value.getAsk_venue());
                }
                if (value.getExchange_timestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getExchange_timestamp());
                }
                if (value.getMid_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getMid_price());
                }
                if (value.getLimit_up_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getLimit_up_price());
                }
                if (value.getLimit_down_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 10, (int) value.getLimit_down_price());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NBBODetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLimit_down_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 10, (int) value.getLimit_down_price());
                }
                if (value.getLimit_up_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getLimit_up_price());
                }
                if (value.getMid_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getMid_price());
                }
                if (value.getExchange_timestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getExchange_timestamp());
                }
                Venue ask_venue = value.getAsk_venue();
                Venue venue = Venue.VENUE_UNSPECIFIED;
                if (ask_venue != venue) {
                    Venue.ADAPTER.encodeWithTag(writer, 6, (int) value.getAsk_venue());
                }
                if (value.getBid_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getBid_quantity());
                }
                if (value.getBid_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getBid_price());
                }
                if (value.getBid_venue() != venue) {
                    Venue.ADAPTER.encodeWithTag(writer, 3, (int) value.getBid_venue());
                }
                if (value.getAsk_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsk_quantity());
                }
                if (value.getAsk_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsk_price());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NBBODetails decode(ProtoReader reader) throws IOException {
                Venue venue;
                Venue venue2;
                Decimal decimal;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Venue venue3 = Venue.VENUE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Venue venueDecode = venue3;
                Decimal decimalDecode = null;
                Decimal decimalDecode2 = null;
                Decimal decimalDecode3 = null;
                Decimal decimalDecode4 = null;
                Time timeDecode = null;
                Decimal decimalDecode5 = null;
                Decimal decimalDecode6 = null;
                Decimal decimalDecode7 = null;
                Venue venueDecode2 = venueDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                break;
                            case 2:
                                decimalDecode2 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 3:
                                venue = venueDecode2;
                                venue2 = venueDecode;
                                try {
                                    venueDecode2 = Venue.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    decimal = decimalDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                venueDecode = venue2;
                                break;
                            case 4:
                                decimalDecode3 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 5:
                                decimalDecode4 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 6:
                                try {
                                    venueDecode = Venue.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    venue = venueDecode2;
                                    venue2 = venueDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 8:
                                decimalDecode5 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 9:
                                decimalDecode6 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 10:
                                decimalDecode7 = Decimal.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                venue = venueDecode2;
                                venue2 = venueDecode;
                                decimal = decimalDecode;
                                decimalDecode = decimal;
                                venueDecode2 = venue;
                                venueDecode = venue2;
                                break;
                        }
                    } else {
                        return new NBBODetails(decimalDecode, decimalDecode2, venueDecode2, decimalDecode3, decimalDecode4, venueDecode, timeDecode, decimalDecode5, decimalDecode6, decimalDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NBBODetails redact(NBBODetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Decimal ask_price = value.getAsk_price();
                Decimal decimalRedact = ask_price != null ? Decimal.ADAPTER.redact(ask_price) : null;
                Decimal ask_quantity = value.getAsk_quantity();
                Decimal decimalRedact2 = ask_quantity != null ? Decimal.ADAPTER.redact(ask_quantity) : null;
                Decimal bid_price = value.getBid_price();
                Decimal decimalRedact3 = bid_price != null ? Decimal.ADAPTER.redact(bid_price) : null;
                Decimal bid_quantity = value.getBid_quantity();
                Decimal decimalRedact4 = bid_quantity != null ? Decimal.ADAPTER.redact(bid_quantity) : null;
                Time exchange_timestamp = value.getExchange_timestamp();
                Time timeRedact = exchange_timestamp != null ? Time.ADAPTER.redact(exchange_timestamp) : null;
                Decimal mid_price = value.getMid_price();
                Decimal decimalRedact5 = mid_price != null ? Decimal.ADAPTER.redact(mid_price) : null;
                Decimal limit_up_price = value.getLimit_up_price();
                Decimal decimalRedact6 = limit_up_price != null ? Decimal.ADAPTER.redact(limit_up_price) : null;
                Decimal limit_down_price = value.getLimit_down_price();
                return NBBODetails.copy$default(value, decimalRedact, decimalRedact2, null, decimalRedact3, decimalRedact4, null, timeRedact, decimalRedact5, decimalRedact6, limit_down_price != null ? Decimal.ADAPTER.redact(limit_down_price) : null, ByteString.EMPTY, 36, null);
            }
        };
    }
}
