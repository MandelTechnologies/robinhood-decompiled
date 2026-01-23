package com.robinhood.ceres.p284v1;

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

/* compiled from: GetFuturesIntervalPerformanceResponse.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\bH\u0016J\u0084\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010$R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00060"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponse;", "Lcom/squareup/wire/Message;", "", "span", "Lcom/robinhood/ceres/v1/Span;", "interval", "Lcom/robinhood/ceres/v1/FuturesInterval;", "open_pnl", "", "day_pnl", "gross_pnl", "total_commissions", "total_fees", "net_pnl", "time_zone", "is_market_open", "", "futures_interval_data_points", "", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/Span;Lcom/robinhood/ceres/v1/FuturesInterval;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lokio/ByteString;)V", "getSpan", "()Lcom/robinhood/ceres/v1/Span;", "getInterval", "()Lcom/robinhood/ceres/v1/FuturesInterval;", "getOpen_pnl", "()Ljava/lang/String;", "getDay_pnl", "getGross_pnl", "getTotal_commissions", "getTotal_fees", "getNet_pnl", "getTime_zone", "()Z", "getFutures_interval_data_points", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetFuturesIntervalPerformanceResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFuturesIntervalPerformanceResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dayPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String day_pnl;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesIntervalDataPoint#ADAPTER", jsonName = "futuresIntervalDataPoints", label = WireField.Label.REPEATED, schemaIndex = 10, tag = 11)
    private final List<FuturesIntervalDataPoint> futures_interval_data_points;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "grossPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String gross_pnl;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesInterval#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FuturesInterval interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMarketOpen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean is_market_open;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "netPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String net_pnl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String open_pnl;

    @WireField(adapter = "com.robinhood.ceres.v1.Span#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Span span;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timeZone", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String time_zone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalCommissions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String total_commissions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String total_fees;

    public GetFuturesIntervalPerformanceResponse() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20366newBuilder();
    }

    public final Span getSpan() {
        return this.span;
    }

    public /* synthetic */ GetFuturesIntervalPerformanceResponse(Span span, FuturesInterval futuresInterval, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Span.SPAN_UNSPECIFIED : span, (i & 2) != 0 ? FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED : futuresInterval, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final FuturesInterval getInterval() {
        return this.interval;
    }

    public final String getOpen_pnl() {
        return this.open_pnl;
    }

    public final String getDay_pnl() {
        return this.day_pnl;
    }

    public final String getGross_pnl() {
        return this.gross_pnl;
    }

    public final String getTotal_commissions() {
        return this.total_commissions;
    }

    public final String getTotal_fees() {
        return this.total_fees;
    }

    public final String getNet_pnl() {
        return this.net_pnl;
    }

    public final String getTime_zone() {
        return this.time_zone;
    }

    /* renamed from: is_market_open, reason: from getter */
    public final boolean getIs_market_open() {
        return this.is_market_open;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFuturesIntervalPerformanceResponse(Span span, FuturesInterval interval, String open_pnl, String day_pnl, String gross_pnl, String total_commissions, String total_fees, String net_pnl, String time_zone, boolean z, List<FuturesIntervalDataPoint> futures_interval_data_points, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(open_pnl, "open_pnl");
        Intrinsics.checkNotNullParameter(day_pnl, "day_pnl");
        Intrinsics.checkNotNullParameter(gross_pnl, "gross_pnl");
        Intrinsics.checkNotNullParameter(total_commissions, "total_commissions");
        Intrinsics.checkNotNullParameter(total_fees, "total_fees");
        Intrinsics.checkNotNullParameter(net_pnl, "net_pnl");
        Intrinsics.checkNotNullParameter(time_zone, "time_zone");
        Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.span = span;
        this.interval = interval;
        this.open_pnl = open_pnl;
        this.day_pnl = day_pnl;
        this.gross_pnl = gross_pnl;
        this.total_commissions = total_commissions;
        this.total_fees = total_fees;
        this.net_pnl = net_pnl;
        this.time_zone = time_zone;
        this.is_market_open = z;
        this.futures_interval_data_points = Internal.immutableCopyOf("futures_interval_data_points", futures_interval_data_points);
    }

    public final List<FuturesIntervalDataPoint> getFutures_interval_data_points() {
        return this.futures_interval_data_points;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20366newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFuturesIntervalPerformanceResponse)) {
            return false;
        }
        GetFuturesIntervalPerformanceResponse getFuturesIntervalPerformanceResponse = (GetFuturesIntervalPerformanceResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFuturesIntervalPerformanceResponse.unknownFields()) && this.span == getFuturesIntervalPerformanceResponse.span && this.interval == getFuturesIntervalPerformanceResponse.interval && Intrinsics.areEqual(this.open_pnl, getFuturesIntervalPerformanceResponse.open_pnl) && Intrinsics.areEqual(this.day_pnl, getFuturesIntervalPerformanceResponse.day_pnl) && Intrinsics.areEqual(this.gross_pnl, getFuturesIntervalPerformanceResponse.gross_pnl) && Intrinsics.areEqual(this.total_commissions, getFuturesIntervalPerformanceResponse.total_commissions) && Intrinsics.areEqual(this.total_fees, getFuturesIntervalPerformanceResponse.total_fees) && Intrinsics.areEqual(this.net_pnl, getFuturesIntervalPerformanceResponse.net_pnl) && Intrinsics.areEqual(this.time_zone, getFuturesIntervalPerformanceResponse.time_zone) && this.is_market_open == getFuturesIntervalPerformanceResponse.is_market_open && Intrinsics.areEqual(this.futures_interval_data_points, getFuturesIntervalPerformanceResponse.futures_interval_data_points);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((unknownFields().hashCode() * 37) + this.span.hashCode()) * 37) + this.interval.hashCode()) * 37) + this.open_pnl.hashCode()) * 37) + this.day_pnl.hashCode()) * 37) + this.gross_pnl.hashCode()) * 37) + this.total_commissions.hashCode()) * 37) + this.total_fees.hashCode()) * 37) + this.net_pnl.hashCode()) * 37) + this.time_zone.hashCode()) * 37) + Boolean.hashCode(this.is_market_open)) * 37) + this.futures_interval_data_points.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("span=" + this.span);
        arrayList.add("interval=" + this.interval);
        arrayList.add("open_pnl=" + Internal.sanitize(this.open_pnl));
        arrayList.add("day_pnl=" + Internal.sanitize(this.day_pnl));
        arrayList.add("gross_pnl=" + Internal.sanitize(this.gross_pnl));
        arrayList.add("total_commissions=" + Internal.sanitize(this.total_commissions));
        arrayList.add("total_fees=" + Internal.sanitize(this.total_fees));
        arrayList.add("net_pnl=" + Internal.sanitize(this.net_pnl));
        arrayList.add("time_zone=" + Internal.sanitize(this.time_zone));
        arrayList.add("is_market_open=" + this.is_market_open);
        if (!this.futures_interval_data_points.isEmpty()) {
            arrayList.add("futures_interval_data_points=" + this.futures_interval_data_points);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFuturesIntervalPerformanceResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFuturesIntervalPerformanceResponse copy$default(GetFuturesIntervalPerformanceResponse getFuturesIntervalPerformanceResponse, Span span, FuturesInterval futuresInterval, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            span = getFuturesIntervalPerformanceResponse.span;
        }
        if ((i & 2) != 0) {
            futuresInterval = getFuturesIntervalPerformanceResponse.interval;
        }
        if ((i & 4) != 0) {
            str = getFuturesIntervalPerformanceResponse.open_pnl;
        }
        if ((i & 8) != 0) {
            str2 = getFuturesIntervalPerformanceResponse.day_pnl;
        }
        if ((i & 16) != 0) {
            str3 = getFuturesIntervalPerformanceResponse.gross_pnl;
        }
        if ((i & 32) != 0) {
            str4 = getFuturesIntervalPerformanceResponse.total_commissions;
        }
        if ((i & 64) != 0) {
            str5 = getFuturesIntervalPerformanceResponse.total_fees;
        }
        if ((i & 128) != 0) {
            str6 = getFuturesIntervalPerformanceResponse.net_pnl;
        }
        if ((i & 256) != 0) {
            str7 = getFuturesIntervalPerformanceResponse.time_zone;
        }
        if ((i & 512) != 0) {
            z = getFuturesIntervalPerformanceResponse.is_market_open;
        }
        if ((i & 1024) != 0) {
            list = getFuturesIntervalPerformanceResponse.futures_interval_data_points;
        }
        if ((i & 2048) != 0) {
            byteString = getFuturesIntervalPerformanceResponse.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        String str8 = str7;
        boolean z2 = z;
        String str9 = str5;
        String str10 = str6;
        String str11 = str3;
        String str12 = str4;
        return getFuturesIntervalPerformanceResponse.copy(span, futuresInterval, str, str2, str11, str12, str9, str10, str8, z2, list2, byteString2);
    }

    public final GetFuturesIntervalPerformanceResponse copy(Span span, FuturesInterval interval, String open_pnl, String day_pnl, String gross_pnl, String total_commissions, String total_fees, String net_pnl, String time_zone, boolean is_market_open, List<FuturesIntervalDataPoint> futures_interval_data_points, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(open_pnl, "open_pnl");
        Intrinsics.checkNotNullParameter(day_pnl, "day_pnl");
        Intrinsics.checkNotNullParameter(gross_pnl, "gross_pnl");
        Intrinsics.checkNotNullParameter(total_commissions, "total_commissions");
        Intrinsics.checkNotNullParameter(total_fees, "total_fees");
        Intrinsics.checkNotNullParameter(net_pnl, "net_pnl");
        Intrinsics.checkNotNullParameter(time_zone, "time_zone");
        Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFuturesIntervalPerformanceResponse(span, interval, open_pnl, day_pnl, gross_pnl, total_commissions, total_fees, net_pnl, time_zone, is_market_open, futures_interval_data_points, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFuturesIntervalPerformanceResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFuturesIntervalPerformanceResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetFuturesIntervalPerformanceResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFuturesIntervalPerformanceResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    size += Span.ADAPTER.encodedSizeWithTag(1, value.getSpan());
                }
                if (value.getInterval() != FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED) {
                    size += FuturesInterval.ADAPTER.encodedSizeWithTag(2, value.getInterval());
                }
                if (!Intrinsics.areEqual(value.getOpen_pnl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getOpen_pnl());
                }
                if (!Intrinsics.areEqual(value.getDay_pnl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDay_pnl());
                }
                if (!Intrinsics.areEqual(value.getGross_pnl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getGross_pnl());
                }
                if (!Intrinsics.areEqual(value.getTotal_commissions(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTotal_commissions());
                }
                if (!Intrinsics.areEqual(value.getTotal_fees(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getTotal_fees());
                }
                if (!Intrinsics.areEqual(value.getNet_pnl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getNet_pnl());
                }
                if (!Intrinsics.areEqual(value.getTime_zone(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getTime_zone());
                }
                if (value.getIs_market_open()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getIs_market_open()));
                }
                return size + FuturesIntervalDataPoint.ADAPTER.asRepeated().encodedSizeWithTag(11, value.getFutures_interval_data_points());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFuturesIntervalPerformanceResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan());
                }
                if (value.getInterval() != FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED) {
                    FuturesInterval.ADAPTER.encodeWithTag(writer, 2, (int) value.getInterval());
                }
                if (!Intrinsics.areEqual(value.getOpen_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOpen_pnl());
                }
                if (!Intrinsics.areEqual(value.getDay_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDay_pnl());
                }
                if (!Intrinsics.areEqual(value.getGross_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getGross_pnl());
                }
                if (!Intrinsics.areEqual(value.getTotal_commissions(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTotal_commissions());
                }
                if (!Intrinsics.areEqual(value.getTotal_fees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getTotal_fees());
                }
                if (!Intrinsics.areEqual(value.getNet_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getNet_pnl());
                }
                if (!Intrinsics.areEqual(value.getTime_zone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getTime_zone());
                }
                if (value.getIs_market_open()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getIs_market_open()));
                }
                FuturesIntervalDataPoint.ADAPTER.asRepeated().encodeWithTag(writer, 11, (int) value.getFutures_interval_data_points());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFuturesIntervalPerformanceResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FuturesIntervalDataPoint.ADAPTER.asRepeated().encodeWithTag(writer, 11, (int) value.getFutures_interval_data_points());
                if (value.getIs_market_open()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getIs_market_open()));
                }
                if (!Intrinsics.areEqual(value.getTime_zone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getTime_zone());
                }
                if (!Intrinsics.areEqual(value.getNet_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getNet_pnl());
                }
                if (!Intrinsics.areEqual(value.getTotal_fees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getTotal_fees());
                }
                if (!Intrinsics.areEqual(value.getTotal_commissions(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTotal_commissions());
                }
                if (!Intrinsics.areEqual(value.getGross_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getGross_pnl());
                }
                if (!Intrinsics.areEqual(value.getDay_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDay_pnl());
                }
                if (!Intrinsics.areEqual(value.getOpen_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOpen_pnl());
                }
                if (value.getInterval() != FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED) {
                    FuturesInterval.ADAPTER.encodeWithTag(writer, 2, (int) value.getInterval());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesIntervalPerformanceResponse decode(ProtoReader reader) throws IOException {
                Span span;
                FuturesInterval futuresInterval;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Span span2 = Span.SPAN_UNSPECIFIED;
                FuturesInterval futuresInterval2 = FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                boolean zBooleanValue = false;
                FuturesInterval futuresIntervalDecode = futuresInterval2;
                String strDecode7 = strDecode6;
                Span spanDecode = span2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                span = spanDecode;
                                futuresInterval = futuresIntervalDecode;
                                str = strDecode7;
                                try {
                                    spanDecode = Span.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode7 = str;
                                futuresIntervalDecode = futuresInterval;
                                break;
                            case 2:
                                try {
                                    futuresIntervalDecode = FuturesInterval.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    span = spanDecode;
                                    futuresInterval = futuresIntervalDecode;
                                    str = strDecode7;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 11:
                                arrayList.add(FuturesIntervalDataPoint.ADAPTER.decode(reader));
                                span = spanDecode;
                                futuresInterval = futuresIntervalDecode;
                                str = strDecode7;
                                spanDecode = span;
                                strDecode7 = str;
                                futuresIntervalDecode = futuresInterval;
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                span = spanDecode;
                                futuresInterval = futuresIntervalDecode;
                                str = strDecode7;
                                spanDecode = span;
                                strDecode7 = str;
                                futuresIntervalDecode = futuresInterval;
                                break;
                        }
                    } else {
                        return new GetFuturesIntervalPerformanceResponse(spanDecode, futuresIntervalDecode, strDecode7, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, zBooleanValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesIntervalPerformanceResponse redact(GetFuturesIntervalPerformanceResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetFuturesIntervalPerformanceResponse.copy$default(value, null, null, null, null, null, null, null, null, null, false, Internal.m26823redactElements(value.getFutures_interval_data_points(), FuturesIntervalDataPoint.ADAPTER), ByteString.EMPTY, 1023, null);
            }
        };
    }
}
