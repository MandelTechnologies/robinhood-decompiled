package com.robinhood.rosetta.mainst;

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

/* compiled from: RhfMarketdata.kt */
@kotlin.Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/RhfMarketdata;", "Lcom/squareup/wire/Message;", "", "bid", "Lcom/robinhood/rosetta/mainst/Decimal;", "ask", "timestamp", "Lcom/robinhood/rosetta/mainst/Time;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Time;Lokio/ByteString;)V", "getBid", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getAsk", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/Time;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RhfMarketdata extends Message {

    @JvmField
    public static final ProtoAdapter<RhfMarketdata> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Decimal ask;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Decimal bid;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Time timestamp;

    public RhfMarketdata() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24703newBuilder();
    }

    public final Decimal getBid() {
        return this.bid;
    }

    public final Decimal getAsk() {
        return this.ask;
    }

    public final Time getTimestamp() {
        return this.timestamp;
    }

    public /* synthetic */ RhfMarketdata(Decimal decimal, Decimal decimal2, Time time, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : decimal, (i & 2) != 0 ? null : decimal2, (i & 4) != 0 ? null : time, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhfMarketdata(Decimal decimal, Decimal decimal2, Time time, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bid = decimal;
        this.ask = decimal2;
        this.timestamp = time;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24703newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RhfMarketdata)) {
            return false;
        }
        RhfMarketdata rhfMarketdata = (RhfMarketdata) other;
        return Intrinsics.areEqual(unknownFields(), rhfMarketdata.unknownFields()) && Intrinsics.areEqual(this.bid, rhfMarketdata.bid) && Intrinsics.areEqual(this.ask, rhfMarketdata.ask) && Intrinsics.areEqual(this.timestamp, rhfMarketdata.timestamp);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Decimal decimal = this.bid;
        int iHashCode2 = (iHashCode + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.ask;
        int iHashCode3 = (iHashCode2 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Time time = this.timestamp;
        int iHashCode4 = iHashCode3 + (time != null ? time.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Decimal decimal = this.bid;
        if (decimal != null) {
            arrayList.add("bid=" + decimal);
        }
        Decimal decimal2 = this.ask;
        if (decimal2 != null) {
            arrayList.add("ask=" + decimal2);
        }
        Time time = this.timestamp;
        if (time != null) {
            arrayList.add("timestamp=" + time);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RhfMarketdata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RhfMarketdata copy$default(RhfMarketdata rhfMarketdata, Decimal decimal, Decimal decimal2, Time time, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            decimal = rhfMarketdata.bid;
        }
        if ((i & 2) != 0) {
            decimal2 = rhfMarketdata.ask;
        }
        if ((i & 4) != 0) {
            time = rhfMarketdata.timestamp;
        }
        if ((i & 8) != 0) {
            byteString = rhfMarketdata.unknownFields();
        }
        return rhfMarketdata.copy(decimal, decimal2, time, byteString);
    }

    public final RhfMarketdata copy(Decimal bid, Decimal ask, Time timestamp, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RhfMarketdata(bid, ask, timestamp, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RhfMarketdata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RhfMarketdata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.RhfMarketdata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RhfMarketdata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBid() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(1, value.getBid());
                }
                if (value.getAsk() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(2, value.getAsk());
                }
                return value.getTimestamp() != null ? size + Time.ADAPTER.encodedSizeWithTag(3, value.getTimestamp()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RhfMarketdata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBid() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 1, (int) value.getBid());
                }
                if (value.getAsk() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsk());
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RhfMarketdata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (value.getAsk() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsk());
                }
                if (value.getBid() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 1, (int) value.getBid());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RhfMarketdata redact(RhfMarketdata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Decimal bid = value.getBid();
                Decimal decimalRedact = bid != null ? Decimal.ADAPTER.redact(bid) : null;
                Decimal ask = value.getAsk();
                Decimal decimalRedact2 = ask != null ? Decimal.ADAPTER.redact(ask) : null;
                Time timestamp = value.getTimestamp();
                return value.copy(decimalRedact, decimalRedact2, timestamp != null ? Time.ADAPTER.redact(timestamp) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RhfMarketdata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Decimal decimalDecode = null;
                Decimal decimalDecode2 = null;
                Time timeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RhfMarketdata(decimalDecode, decimalDecode2, timeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        decimalDecode = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        decimalDecode2 = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        timeDecode = Time.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
