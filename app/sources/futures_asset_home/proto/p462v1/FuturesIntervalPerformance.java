package futures_asset_home.proto.p462v1;

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
import futures_asset_home.proto.p462v1.FuturesIntervalPerformance;
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

/* compiled from: FuturesIntervalPerformance.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010&\u001a\u00020\u0002H\u0017J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0016Jz\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00061"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformance;", "Lcom/squareup/wire/Message;", "", "futures_performance_interval", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "display_span", "Lfutures_asset_home/proto/v1/DisplaySpan;", "open_pnl", "", "day_pnl", "total_pnl", "net_return", "total_commissions", "total_fees", "market_open", "", "futures_interval_data_points", "", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;Lfutures_asset_home/proto/v1/DisplaySpan;DDDDDDZLjava/util/List;Lokio/ByteString;)V", "getFutures_performance_interval", "()Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "getDisplay_span", "()Lfutures_asset_home/proto/v1/DisplaySpan;", "getOpen_pnl", "()D", "getDay_pnl", "getTotal_pnl", "getNet_return", "getTotal_commissions", "getTotal_fees", "getMarket_open", "()Z", "getFutures_interval_data_points", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "FuturesPerformanceInterval", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FuturesIntervalPerformance extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesIntervalPerformance> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dayPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double day_pnl;

    @WireField(adapter = "futures_asset_home.proto.v1.DisplaySpan#ADAPTER", jsonName = "displaySpan", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final DisplaySpan display_span;

    @WireField(adapter = "futures_asset_home.proto.v1.FuturesIntervalDataPoint#ADAPTER", jsonName = "futuresIntervalDataPoints", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    private final List<FuturesIntervalDataPoint> futures_interval_data_points;

    @WireField(adapter = "futures_asset_home.proto.v1.FuturesIntervalPerformance$FuturesPerformanceInterval#ADAPTER", jsonName = "futuresPerformanceInterval", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesPerformanceInterval futures_performance_interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "marketOpen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean market_open;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "netReturn", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double net_return;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "openPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double open_pnl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalCommissions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double total_commissions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double total_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double total_pnl;

    public FuturesIntervalPerformance() {
        this(null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28086newBuilder();
    }

    public final FuturesPerformanceInterval getFutures_performance_interval() {
        return this.futures_performance_interval;
    }

    public /* synthetic */ FuturesIntervalPerformance(FuturesPerformanceInterval futuresPerformanceInterval, DisplaySpan displaySpan, double d, double d2, double d3, double d4, double d5, double d6, boolean z, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FuturesPerformanceInterval.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED : futuresPerformanceInterval, (i & 2) != 0 ? DisplaySpan.SPAN_UNSPECIFIED : displaySpan, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? 0.0d : d3, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) == 0 ? d6 : 0.0d, (i & 256) != 0 ? false : z, (i & 512) != 0 ? CollectionsKt.emptyList() : list, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final DisplaySpan getDisplay_span() {
        return this.display_span;
    }

    public final double getOpen_pnl() {
        return this.open_pnl;
    }

    public final double getDay_pnl() {
        return this.day_pnl;
    }

    public final double getTotal_pnl() {
        return this.total_pnl;
    }

    public final double getNet_return() {
        return this.net_return;
    }

    public final double getTotal_commissions() {
        return this.total_commissions;
    }

    public final double getTotal_fees() {
        return this.total_fees;
    }

    public final boolean getMarket_open() {
        return this.market_open;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesIntervalPerformance(FuturesPerformanceInterval futures_performance_interval, DisplaySpan display_span, double d, double d2, double d3, double d4, double d5, double d6, boolean z, List<FuturesIntervalDataPoint> futures_interval_data_points, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(futures_performance_interval, "futures_performance_interval");
        Intrinsics.checkNotNullParameter(display_span, "display_span");
        Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.futures_performance_interval = futures_performance_interval;
        this.display_span = display_span;
        this.open_pnl = d;
        this.day_pnl = d2;
        this.total_pnl = d3;
        this.net_return = d4;
        this.total_commissions = d5;
        this.total_fees = d6;
        this.market_open = z;
        this.futures_interval_data_points = Internal.immutableCopyOf("futures_interval_data_points", futures_interval_data_points);
    }

    public final List<FuturesIntervalDataPoint> getFutures_interval_data_points() {
        return this.futures_interval_data_points;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28086newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesIntervalPerformance)) {
            return false;
        }
        FuturesIntervalPerformance futuresIntervalPerformance = (FuturesIntervalPerformance) other;
        return Intrinsics.areEqual(unknownFields(), futuresIntervalPerformance.unknownFields()) && this.futures_performance_interval == futuresIntervalPerformance.futures_performance_interval && this.display_span == futuresIntervalPerformance.display_span && this.open_pnl == futuresIntervalPerformance.open_pnl && this.day_pnl == futuresIntervalPerformance.day_pnl && this.total_pnl == futuresIntervalPerformance.total_pnl && this.net_return == futuresIntervalPerformance.net_return && this.total_commissions == futuresIntervalPerformance.total_commissions && this.total_fees == futuresIntervalPerformance.total_fees && this.market_open == futuresIntervalPerformance.market_open && Intrinsics.areEqual(this.futures_interval_data_points, futuresIntervalPerformance.futures_interval_data_points);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + this.futures_performance_interval.hashCode()) * 37) + this.display_span.hashCode()) * 37) + Double.hashCode(this.open_pnl)) * 37) + Double.hashCode(this.day_pnl)) * 37) + Double.hashCode(this.total_pnl)) * 37) + Double.hashCode(this.net_return)) * 37) + Double.hashCode(this.total_commissions)) * 37) + Double.hashCode(this.total_fees)) * 37) + Boolean.hashCode(this.market_open)) * 37) + this.futures_interval_data_points.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("futures_performance_interval=" + this.futures_performance_interval);
        arrayList.add("display_span=" + this.display_span);
        arrayList.add("open_pnl=" + this.open_pnl);
        arrayList.add("day_pnl=" + this.day_pnl);
        arrayList.add("total_pnl=" + this.total_pnl);
        arrayList.add("net_return=" + this.net_return);
        arrayList.add("total_commissions=" + this.total_commissions);
        arrayList.add("total_fees=" + this.total_fees);
        arrayList.add("market_open=" + this.market_open);
        if (!this.futures_interval_data_points.isEmpty()) {
            arrayList.add("futures_interval_data_points=" + this.futures_interval_data_points);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesIntervalPerformance{", "}", 0, null, null, 56, null);
    }

    public final FuturesIntervalPerformance copy(FuturesPerformanceInterval futures_performance_interval, DisplaySpan display_span, double open_pnl, double day_pnl, double total_pnl, double net_return, double total_commissions, double total_fees, boolean market_open, List<FuturesIntervalDataPoint> futures_interval_data_points, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(futures_performance_interval, "futures_performance_interval");
        Intrinsics.checkNotNullParameter(display_span, "display_span");
        Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesIntervalPerformance(futures_performance_interval, display_span, open_pnl, day_pnl, total_pnl, net_return, total_commissions, total_fees, market_open, futures_interval_data_points, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesIntervalPerformance.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesIntervalPerformance>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_asset_home.proto.v1.FuturesIntervalPerformance$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesIntervalPerformance value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFutures_performance_interval() != FuturesIntervalPerformance.FuturesPerformanceInterval.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED) {
                    size += FuturesIntervalPerformance.FuturesPerformanceInterval.ADAPTER.encodedSizeWithTag(1, value.getFutures_performance_interval());
                }
                if (value.getDisplay_span() != DisplaySpan.SPAN_UNSPECIFIED) {
                    size += DisplaySpan.ADAPTER.encodedSizeWithTag(2, value.getDisplay_span());
                }
                if (!Double.valueOf(value.getOpen_pnl()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getOpen_pnl()));
                }
                if (!Double.valueOf(value.getDay_pnl()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getDay_pnl()));
                }
                if (!Double.valueOf(value.getTotal_pnl()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getTotal_pnl()));
                }
                if (!Double.valueOf(value.getNet_return()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getNet_return()));
                }
                if (!Double.valueOf(value.getTotal_commissions()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getTotal_commissions()));
                }
                if (!Double.valueOf(value.getTotal_fees()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getTotal_fees()));
                }
                if (value.getMarket_open()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getMarket_open()));
                }
                return size + FuturesIntervalDataPoint.ADAPTER.asRepeated().encodedSizeWithTag(10, value.getFutures_interval_data_points());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesIntervalPerformance value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFutures_performance_interval() != FuturesIntervalPerformance.FuturesPerformanceInterval.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED) {
                    FuturesIntervalPerformance.FuturesPerformanceInterval.ADAPTER.encodeWithTag(writer, 1, (int) value.getFutures_performance_interval());
                }
                if (value.getDisplay_span() != DisplaySpan.SPAN_UNSPECIFIED) {
                    DisplaySpan.ADAPTER.encodeWithTag(writer, 2, (int) value.getDisplay_span());
                }
                if (!Double.valueOf(value.getOpen_pnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getOpen_pnl()));
                }
                if (!Double.valueOf(value.getDay_pnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDay_pnl()));
                }
                if (!Double.valueOf(value.getTotal_pnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getTotal_pnl()));
                }
                if (!Double.valueOf(value.getNet_return()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getNet_return()));
                }
                if (!Double.valueOf(value.getTotal_commissions()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getTotal_commissions()));
                }
                if (!Double.valueOf(value.getTotal_fees()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getTotal_fees()));
                }
                if (value.getMarket_open()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getMarket_open()));
                }
                FuturesIntervalDataPoint.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getFutures_interval_data_points());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesIntervalPerformance value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FuturesIntervalDataPoint.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getFutures_interval_data_points());
                if (value.getMarket_open()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getMarket_open()));
                }
                if (!Double.valueOf(value.getTotal_fees()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getTotal_fees()));
                }
                if (!Double.valueOf(value.getTotal_commissions()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getTotal_commissions()));
                }
                if (!Double.valueOf(value.getNet_return()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getNet_return()));
                }
                if (!Double.valueOf(value.getTotal_pnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getTotal_pnl()));
                }
                if (!Double.valueOf(value.getDay_pnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDay_pnl()));
                }
                if (!Double.valueOf(value.getOpen_pnl()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getOpen_pnl()));
                }
                if (value.getDisplay_span() != DisplaySpan.SPAN_UNSPECIFIED) {
                    DisplaySpan.ADAPTER.encodeWithTag(writer, 2, (int) value.getDisplay_span());
                }
                if (value.getFutures_performance_interval() != FuturesIntervalPerformance.FuturesPerformanceInterval.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED) {
                    FuturesIntervalPerformance.FuturesPerformanceInterval.ADAPTER.encodeWithTag(writer, 1, (int) value.getFutures_performance_interval());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002b. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesIntervalPerformance decode(ProtoReader reader) throws IOException {
                ArrayList arrayList;
                double d;
                DisplaySpan displaySpan;
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesIntervalPerformance.FuturesPerformanceInterval futuresPerformanceInterval = FuturesIntervalPerformance.FuturesPerformanceInterval.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED;
                DisplaySpan displaySpan2 = DisplaySpan.SPAN_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                FuturesIntervalPerformance.FuturesPerformanceInterval futuresPerformanceIntervalDecode = futuresPerformanceInterval;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                boolean zBooleanValue = false;
                DisplaySpan displaySpanDecode = displaySpan2;
                double dDoubleValue6 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                arrayList = arrayList2;
                                d = dDoubleValue6;
                                displaySpan = displaySpanDecode;
                                try {
                                    futuresPerformanceIntervalDecode = FuturesIntervalPerformance.FuturesPerformanceInterval.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                displaySpanDecode = displaySpan;
                                dDoubleValue6 = d;
                                break;
                            case 2:
                                try {
                                    displaySpanDecode = DisplaySpan.ADAPTER.decode(reader);
                                    arrayList = arrayList2;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    arrayList = arrayList2;
                                    d = dDoubleValue6;
                                    displaySpan = displaySpanDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 3:
                                dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                arrayList = arrayList2;
                                break;
                            case 4:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                arrayList = arrayList2;
                                break;
                            case 5:
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                arrayList = arrayList2;
                                break;
                            case 6:
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                arrayList = arrayList2;
                                break;
                            case 7:
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                arrayList = arrayList2;
                                break;
                            case 8:
                                dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                arrayList = arrayList2;
                                break;
                            case 9:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                arrayList = arrayList2;
                                break;
                            case 10:
                                arrayList2.add(FuturesIntervalDataPoint.ADAPTER.decode(reader));
                                arrayList = arrayList2;
                                d = dDoubleValue6;
                                displaySpan = displaySpanDecode;
                                displaySpanDecode = displaySpan;
                                dDoubleValue6 = d;
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                arrayList = arrayList2;
                                d = dDoubleValue6;
                                displaySpan = displaySpanDecode;
                                displaySpanDecode = displaySpan;
                                dDoubleValue6 = d;
                                break;
                        }
                        arrayList2 = arrayList;
                    } else {
                        return new FuturesIntervalPerformance(futuresPerformanceIntervalDecode, displaySpanDecode, dDoubleValue6, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, zBooleanValue, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesIntervalPerformance redact(FuturesIntervalPerformance value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((511 & 1) != 0 ? value.futures_performance_interval : null, (511 & 2) != 0 ? value.display_span : null, (511 & 4) != 0 ? value.open_pnl : 0.0d, (511 & 8) != 0 ? value.day_pnl : 0.0d, (511 & 16) != 0 ? value.total_pnl : 0.0d, (511 & 32) != 0 ? value.net_return : 0.0d, (511 & 64) != 0 ? value.total_commissions : 0.0d, (511 & 128) != 0 ? value.total_fees : 0.0d, (511 & 256) != 0 ? value.market_open : false, (511 & 512) != 0 ? value.futures_interval_data_points : Internal.m26823redactElements(value.getFutures_interval_data_points(), FuturesIntervalDataPoint.ADAPTER), (511 & 1024) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesIntervalPerformance.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED", "DAY_INTERVAL", "WEEK_INTERVAL", "Companion", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FuturesPerformanceInterval implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FuturesPerformanceInterval[] $VALUES;

        @JvmField
        public static final ProtoAdapter<FuturesPerformanceInterval> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FuturesPerformanceInterval DAY_INTERVAL;
        public static final FuturesPerformanceInterval FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED;
        public static final FuturesPerformanceInterval WEEK_INTERVAL;
        private final int value;

        private static final /* synthetic */ FuturesPerformanceInterval[] $values() {
            return new FuturesPerformanceInterval[]{FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED, DAY_INTERVAL, WEEK_INTERVAL};
        }

        @JvmStatic
        public static final FuturesPerformanceInterval fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<FuturesPerformanceInterval> getEntries() {
            return $ENTRIES;
        }

        private FuturesPerformanceInterval(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final FuturesPerformanceInterval futuresPerformanceInterval = new FuturesPerformanceInterval("FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED", 0, 0);
            FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED = futuresPerformanceInterval;
            DAY_INTERVAL = new FuturesPerformanceInterval("DAY_INTERVAL", 1, 1);
            WEEK_INTERVAL = new FuturesPerformanceInterval("WEEK_INTERVAL", 2, 2);
            FuturesPerformanceInterval[] futuresPerformanceIntervalArr$values = $values();
            $VALUES = futuresPerformanceIntervalArr$values;
            $ENTRIES = EnumEntries2.enumEntries(futuresPerformanceIntervalArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesPerformanceInterval.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<FuturesPerformanceInterval>(orCreateKotlinClass, syntax, futuresPerformanceInterval) { // from class: futures_asset_home.proto.v1.FuturesIntervalPerformance$FuturesPerformanceInterval$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesIntervalPerformance.FuturesPerformanceInterval fromValue(int value) {
                    return FuturesIntervalPerformance.FuturesPerformanceInterval.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesIntervalPerformance.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "fromValue", "value", "", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final FuturesPerformanceInterval fromValue(int value) {
                if (value == 0) {
                    return FuturesPerformanceInterval.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED;
                }
                if (value == 1) {
                    return FuturesPerformanceInterval.DAY_INTERVAL;
                }
                if (value != 2) {
                    return null;
                }
                return FuturesPerformanceInterval.WEEK_INTERVAL;
            }
        }

        public static FuturesPerformanceInterval valueOf(String str) {
            return (FuturesPerformanceInterval) Enum.valueOf(FuturesPerformanceInterval.class, str);
        }

        public static FuturesPerformanceInterval[] values() {
            return (FuturesPerformanceInterval[]) $VALUES.clone();
        }
    }
}
