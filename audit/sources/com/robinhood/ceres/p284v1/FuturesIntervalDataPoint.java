package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Date;
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

/* compiled from: FuturesIntervalDataPoint.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\tH\u0016JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesIntervalDataPoint;", "Lcom/squareup/wire/Message;", "", "interval", "Lcom/robinhood/ceres/v1/FuturesInterval;", "start_trade_date", "Lcom/robinhood/rosetta/common/Date;", "end_trade_date", "interval_pnl", "", "start_time", "end_time", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesInterval;Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getInterval", "()Lcom/robinhood/ceres/v1/FuturesInterval;", "getStart_trade_date", "()Lcom/robinhood/rosetta/common/Date;", "getEnd_trade_date", "getInterval_pnl", "()Ljava/lang/String;", "getStart_time", "getEnd_time", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesIntervalDataPoint extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesIntervalDataPoint> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String end_time;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "endTradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Date end_trade_date;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesInterval#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesInterval interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "intervalPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String interval_pnl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String start_time;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "startTradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Date start_trade_date;

    public FuturesIntervalDataPoint() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20321newBuilder();
    }

    public final FuturesInterval getInterval() {
        return this.interval;
    }

    public /* synthetic */ FuturesIntervalDataPoint(FuturesInterval futuresInterval, Date date, Date date2, String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED : futuresInterval, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : date2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Date getStart_trade_date() {
        return this.start_trade_date;
    }

    public final Date getEnd_trade_date() {
        return this.end_trade_date;
    }

    public final String getInterval_pnl() {
        return this.interval_pnl;
    }

    public final String getStart_time() {
        return this.start_time;
    }

    public final String getEnd_time() {
        return this.end_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesIntervalDataPoint(FuturesInterval interval, Date date, Date date2, String interval_pnl, String start_time, String end_time, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(interval_pnl, "interval_pnl");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.interval = interval;
        this.start_trade_date = date;
        this.end_trade_date = date2;
        this.interval_pnl = interval_pnl;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20321newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), futuresIntervalDataPoint.unknownFields()) && this.interval == futuresIntervalDataPoint.interval && Intrinsics.areEqual(this.start_trade_date, futuresIntervalDataPoint.start_trade_date) && Intrinsics.areEqual(this.end_trade_date, futuresIntervalDataPoint.end_trade_date) && Intrinsics.areEqual(this.interval_pnl, futuresIntervalDataPoint.interval_pnl) && Intrinsics.areEqual(this.start_time, futuresIntervalDataPoint.start_time) && Intrinsics.areEqual(this.end_time, futuresIntervalDataPoint.end_time);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.interval.hashCode()) * 37;
        Date date = this.start_trade_date;
        int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 37;
        Date date2 = this.end_trade_date;
        int iHashCode3 = ((((((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 37) + this.interval_pnl.hashCode()) * 37) + this.start_time.hashCode()) * 37) + this.end_time.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("interval=" + this.interval);
        Date date = this.start_trade_date;
        if (date != null) {
            arrayList.add("start_trade_date=" + date);
        }
        Date date2 = this.end_trade_date;
        if (date2 != null) {
            arrayList.add("end_trade_date=" + date2);
        }
        arrayList.add("interval_pnl=" + Internal.sanitize(this.interval_pnl));
        arrayList.add("start_time=" + Internal.sanitize(this.start_time));
        arrayList.add("end_time=" + Internal.sanitize(this.end_time));
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesIntervalDataPoint{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesIntervalDataPoint copy$default(FuturesIntervalDataPoint futuresIntervalDataPoint, FuturesInterval futuresInterval, Date date, Date date2, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresInterval = futuresIntervalDataPoint.interval;
        }
        if ((i & 2) != 0) {
            date = futuresIntervalDataPoint.start_trade_date;
        }
        if ((i & 4) != 0) {
            date2 = futuresIntervalDataPoint.end_trade_date;
        }
        if ((i & 8) != 0) {
            str = futuresIntervalDataPoint.interval_pnl;
        }
        if ((i & 16) != 0) {
            str2 = futuresIntervalDataPoint.start_time;
        }
        if ((i & 32) != 0) {
            str3 = futuresIntervalDataPoint.end_time;
        }
        if ((i & 64) != 0) {
            byteString = futuresIntervalDataPoint.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        String str5 = str2;
        Date date3 = date2;
        return futuresIntervalDataPoint.copy(futuresInterval, date, date3, str, str5, str4, byteString2);
    }

    public final FuturesIntervalDataPoint copy(FuturesInterval interval, Date start_trade_date, Date end_trade_date, String interval_pnl, String start_time, String end_time, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(interval_pnl, "interval_pnl");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesIntervalDataPoint(interval, start_trade_date, end_trade_date, interval_pnl, start_time, end_time, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesIntervalDataPoint.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesIntervalDataPoint>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesIntervalDataPoint$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesIntervalDataPoint value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getInterval() != FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED) {
                    size += FuturesInterval.ADAPTER.encodedSizeWithTag(1, value.getInterval());
                }
                if (value.getStart_trade_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(2, value.getStart_trade_date());
                }
                if (value.getEnd_trade_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(3, value.getEnd_trade_date());
                }
                if (!Intrinsics.areEqual(value.getInterval_pnl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getInterval_pnl());
                }
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getStart_time());
                }
                return !Intrinsics.areEqual(value.getEnd_time(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getEnd_time()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesIntervalDataPoint value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getInterval() != FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED) {
                    FuturesInterval.ADAPTER.encodeWithTag(writer, 1, (int) value.getInterval());
                }
                if (value.getStart_trade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 2, (int) value.getStart_trade_date());
                }
                if (value.getEnd_trade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnd_trade_date());
                }
                if (!Intrinsics.areEqual(value.getInterval_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInterval_pnl());
                }
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getStart_time());
                }
                if (!Intrinsics.areEqual(value.getEnd_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEnd_time());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesIntervalDataPoint value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getEnd_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEnd_time());
                }
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getStart_time());
                }
                if (!Intrinsics.areEqual(value.getInterval_pnl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInterval_pnl());
                }
                if (value.getEnd_trade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnd_trade_date());
                }
                if (value.getStart_trade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 2, (int) value.getStart_trade_date());
                }
                if (value.getInterval() != FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED) {
                    FuturesInterval.ADAPTER.encodeWithTag(writer, 1, (int) value.getInterval());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesIntervalDataPoint decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesInterval futuresInterval = FuturesInterval.FUTURES_INTERVAL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Date dateDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                FuturesInterval futuresIntervalDecode = futuresInterval;
                Date dateDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    futuresIntervalDecode = FuturesInterval.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                dateDecode2 = Date.ADAPTER.decode(reader);
                                break;
                            case 3:
                                dateDecode = Date.ADAPTER.decode(reader);
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
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new FuturesIntervalDataPoint(futuresIntervalDecode, dateDecode2, dateDecode, strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesIntervalDataPoint redact(FuturesIntervalDataPoint value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date start_trade_date = value.getStart_trade_date();
                Date dateRedact = start_trade_date != null ? Date.ADAPTER.redact(start_trade_date) : null;
                Date end_trade_date = value.getEnd_trade_date();
                return FuturesIntervalDataPoint.copy$default(value, null, dateRedact, end_trade_date != null ? Date.ADAPTER.redact(end_trade_date) : null, null, null, null, ByteString.EMPTY, 57, null);
            }
        };
    }
}
