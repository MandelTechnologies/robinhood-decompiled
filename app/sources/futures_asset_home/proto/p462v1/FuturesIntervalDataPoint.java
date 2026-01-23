package futures_asset_home.proto.p462v1;

import com.robinhood.rosetta.common.Date;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FuturesIntervalDataPoint.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,BG\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010*¨\u0006-"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalDataPoint;", "Lcom/squareup/wire/Message;", "", "", "start_time", "end_time", "", "interval_pnl", "Lcom/robinhood/rosetta/common/Date;", "start_trade_date", "end_trade_date", "Lokio/ByteString;", "unknownFields", "<init>", "(JJDLcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Date;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(JJDLcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Date;Lokio/ByteString;)Lfutures_asset_home/proto/v1/FuturesIntervalDataPoint;", "J", "getStart_time", "()J", "getStart_time$annotations", "()V", "getEnd_time", "getEnd_time$annotations", "D", "getInterval_pnl", "()D", "Lcom/robinhood/rosetta/common/Date;", "getStart_trade_date", "()Lcom/robinhood/rosetta/common/Date;", "getEnd_trade_date", "Companion", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FuturesIntervalDataPoint extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesIntervalDataPoint> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "endTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long end_time;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "endTradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Date end_trade_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "intervalPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double interval_pnl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "startTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long start_time;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "startTradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Date start_trade_date;

    public FuturesIntervalDataPoint() {
        this(0L, 0L, 0.0d, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28084newBuilder();
    }

    public final long getStart_time() {
        return this.start_time;
    }

    public final long getEnd_time() {
        return this.end_time;
    }

    public final double getInterval_pnl() {
        return this.interval_pnl;
    }

    public final Date getStart_trade_date() {
        return this.start_trade_date;
    }

    public final Date getEnd_trade_date() {
        return this.end_trade_date;
    }

    public /* synthetic */ FuturesIntervalDataPoint(long j, long j2, double d, Date date, Date date2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : date, (i & 16) != 0 ? null : date2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesIntervalDataPoint(long j, long j2, double d, Date date, Date date2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.start_time = j;
        this.end_time = j2;
        this.interval_pnl = d;
        this.start_trade_date = date;
        this.end_trade_date = date2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28084newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesIntervalDataPoint)) {
            return false;
        }
        FuturesIntervalDataPoint futuresIntervalDataPoint = (FuturesIntervalDataPoint) other;
        return Intrinsics.areEqual(unknownFields(), futuresIntervalDataPoint.unknownFields()) && this.start_time == futuresIntervalDataPoint.start_time && this.end_time == futuresIntervalDataPoint.end_time && this.interval_pnl == futuresIntervalDataPoint.interval_pnl && Intrinsics.areEqual(this.start_trade_date, futuresIntervalDataPoint.start_trade_date) && Intrinsics.areEqual(this.end_trade_date, futuresIntervalDataPoint.end_trade_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + Long.hashCode(this.start_time)) * 37) + Long.hashCode(this.end_time)) * 37) + Double.hashCode(this.interval_pnl)) * 37;
        Date date = this.start_trade_date;
        int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 37;
        Date date2 = this.end_trade_date;
        int iHashCode3 = iHashCode2 + (date2 != null ? date2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("start_time=" + this.start_time);
        arrayList.add("end_time=" + this.end_time);
        arrayList.add("interval_pnl=" + this.interval_pnl);
        Date date = this.start_trade_date;
        if (date != null) {
            arrayList.add("start_trade_date=" + date);
        }
        Date date2 = this.end_trade_date;
        if (date2 != null) {
            arrayList.add("end_trade_date=" + date2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesIntervalDataPoint{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesIntervalDataPoint copy$default(FuturesIntervalDataPoint futuresIntervalDataPoint, long j, long j2, double d, Date date, Date date2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = futuresIntervalDataPoint.start_time;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = futuresIntervalDataPoint.end_time;
        }
        return futuresIntervalDataPoint.copy(j3, j2, (i & 4) != 0 ? futuresIntervalDataPoint.interval_pnl : d, (i & 8) != 0 ? futuresIntervalDataPoint.start_trade_date : date, (i & 16) != 0 ? futuresIntervalDataPoint.end_trade_date : date2, (i & 32) != 0 ? futuresIntervalDataPoint.unknownFields() : byteString);
    }

    public final FuturesIntervalDataPoint copy(long start_time, long end_time, double interval_pnl, Date start_trade_date, Date end_trade_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesIntervalDataPoint(start_time, end_time, interval_pnl, start_trade_date, end_trade_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesIntervalDataPoint.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesIntervalDataPoint>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_asset_home.proto.v1.FuturesIntervalDataPoint$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesIntervalDataPoint value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStart_time() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getStart_time()));
                }
                if (value.getEnd_time() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getEnd_time()));
                }
                if (!Double.valueOf(value.getInterval_pnl()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getInterval_pnl()));
                }
                if (value.getStart_trade_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(4, value.getStart_trade_date());
                }
                return value.getEnd_trade_date() != null ? size + Date.ADAPTER.encodedSizeWithTag(5, value.getEnd_trade_date()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesIntervalDataPoint value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStart_time() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getStart_time()));
                }
                if (value.getEnd_time() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getEnd_time()));
                }
                if (!Double.valueOf(value.getInterval_pnl()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getInterval_pnl()));
                }
                if (value.getStart_trade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 4, (int) value.getStart_trade_date());
                }
                if (value.getEnd_trade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 5, (int) value.getEnd_trade_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesIntervalDataPoint value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEnd_trade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 5, (int) value.getEnd_trade_date());
                }
                if (value.getStart_trade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 4, (int) value.getStart_trade_date());
                }
                if (!Double.valueOf(value.getInterval_pnl()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getInterval_pnl()));
                }
                if (value.getEnd_time() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getEnd_time()));
                }
                if (value.getStart_time() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getStart_time()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesIntervalDataPoint redact(FuturesIntervalDataPoint value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date start_trade_date = value.getStart_trade_date();
                Date dateRedact = start_trade_date != null ? Date.ADAPTER.redact(start_trade_date) : null;
                Date end_trade_date = value.getEnd_trade_date();
                return FuturesIntervalDataPoint.copy$default(value, 0L, 0L, 0.0d, dateRedact, end_trade_date != null ? Date.ADAPTER.redact(end_trade_date) : null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesIntervalDataPoint decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Date dateDecode = null;
                long jLongValue = 0;
                long jLongValue2 = 0;
                double dDoubleValue = 0.0d;
                Date dateDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesIntervalDataPoint(jLongValue, jLongValue2, dDoubleValue, dateDecode, dateDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 2) {
                        jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 4) {
                        dateDecode = Date.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        dateDecode2 = Date.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
