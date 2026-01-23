package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: TimeSpanIntervals.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanIntervals;", "Lcom/squareup/wire/Message;", "", "span", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpan;", "intervals", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/Interval;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpan;Ljava/util/List;Lokio/ByteString;)V", "getSpan", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpan;", "getIntervals", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TimeSpanIntervals extends Message {

    @JvmField
    public static final ProtoAdapter<TimeSpanIntervals> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.Interval#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Interval> intervals;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.TimeSpan#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TimeSpan span;

    public TimeSpanIntervals() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8679newBuilder();
    }

    public final TimeSpan getSpan() {
        return this.span;
    }

    public /* synthetic */ TimeSpanIntervals(TimeSpan timeSpan, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : timeSpan, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSpanIntervals(TimeSpan timeSpan, List<Interval> intervals, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.span = timeSpan;
        this.intervals = Internal.immutableCopyOf("intervals", intervals);
    }

    public final List<Interval> getIntervals() {
        return this.intervals;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8679newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TimeSpanIntervals)) {
            return false;
        }
        TimeSpanIntervals timeSpanIntervals = (TimeSpanIntervals) other;
        return Intrinsics.areEqual(unknownFields(), timeSpanIntervals.unknownFields()) && Intrinsics.areEqual(this.span, timeSpanIntervals.span) && Intrinsics.areEqual(this.intervals, timeSpanIntervals.intervals);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TimeSpan timeSpan = this.span;
        int iHashCode2 = ((iHashCode + (timeSpan != null ? timeSpan.hashCode() : 0)) * 37) + this.intervals.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TimeSpan timeSpan = this.span;
        if (timeSpan != null) {
            arrayList.add("span=" + timeSpan);
        }
        if (!this.intervals.isEmpty()) {
            arrayList.add("intervals=" + this.intervals);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimeSpanIntervals{", "}", 0, null, null, 56, null);
    }

    public final TimeSpanIntervals copy(TimeSpan span, List<Interval> intervals, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TimeSpanIntervals(span, intervals, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimeSpanIntervals.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TimeSpanIntervals>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.TimeSpanIntervals$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TimeSpanIntervals value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSpan() != null) {
                    size += TimeSpan.ADAPTER.encodedSizeWithTag(1, value.getSpan());
                }
                return size + Interval.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getIntervals());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TimeSpanIntervals value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSpan() != null) {
                    TimeSpan.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan());
                }
                Interval.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getIntervals());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TimeSpanIntervals value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Interval.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getIntervals());
                if (value.getSpan() != null) {
                    TimeSpan.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TimeSpanIntervals decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                TimeSpan timeSpanDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TimeSpanIntervals(timeSpanDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        timeSpanDecode = TimeSpan.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(Interval.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TimeSpanIntervals redact(TimeSpanIntervals value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TimeSpan span = value.getSpan();
                return value.copy(span != null ? TimeSpan.ADAPTER.redact(span) : null, Internal.m26823redactElements(value.getIntervals(), Interval.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
