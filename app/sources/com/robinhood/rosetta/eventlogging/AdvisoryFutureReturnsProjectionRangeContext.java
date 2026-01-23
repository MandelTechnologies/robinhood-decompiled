package com.robinhood.rosetta.eventlogging;

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

/* compiled from: AdvisoryFutureReturnsProjectionRangeContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvisoryFutureReturnsProjectionRangeContext;", "Lcom/squareup/wire/Message;", "", "percentile_5", "", "percentile_95", "median", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDLokio/ByteString;)V", "getPercentile_5", "()D", "getPercentile_95", "getMedian", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AdvisoryFutureReturnsProjectionRangeContext extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryFutureReturnsProjectionRangeContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double median;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "percentile5", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double percentile_5;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "percentile95", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double percentile_95;

    public AdvisoryFutureReturnsProjectionRangeContext() {
        this(0.0d, 0.0d, 0.0d, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24003newBuilder();
    }

    public final double getPercentile_5() {
        return this.percentile_5;
    }

    public final double getPercentile_95() {
        return this.percentile_95;
    }

    public final double getMedian() {
        return this.median;
    }

    public /* synthetic */ AdvisoryFutureReturnsProjectionRangeContext(double d, double d2, double d3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryFutureReturnsProjectionRangeContext(double d, double d2, double d3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.percentile_5 = d;
        this.percentile_95 = d2;
        this.median = d3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24003newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryFutureReturnsProjectionRangeContext)) {
            return false;
        }
        AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext = (AdvisoryFutureReturnsProjectionRangeContext) other;
        return Intrinsics.areEqual(unknownFields(), advisoryFutureReturnsProjectionRangeContext.unknownFields()) && this.percentile_5 == advisoryFutureReturnsProjectionRangeContext.percentile_5 && this.percentile_95 == advisoryFutureReturnsProjectionRangeContext.percentile_95 && this.median == advisoryFutureReturnsProjectionRangeContext.median;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Double.hashCode(this.percentile_5)) * 37) + Double.hashCode(this.percentile_95)) * 37) + Double.hashCode(this.median);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("percentile_5=" + this.percentile_5);
        arrayList.add("percentile_95=" + this.percentile_95);
        arrayList.add("median=" + this.median);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryFutureReturnsProjectionRangeContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryFutureReturnsProjectionRangeContext copy$default(AdvisoryFutureReturnsProjectionRangeContext advisoryFutureReturnsProjectionRangeContext, double d, double d2, double d3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = advisoryFutureReturnsProjectionRangeContext.percentile_5;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = advisoryFutureReturnsProjectionRangeContext.percentile_95;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = advisoryFutureReturnsProjectionRangeContext.median;
        }
        double d6 = d3;
        if ((i & 8) != 0) {
            byteString = advisoryFutureReturnsProjectionRangeContext.unknownFields();
        }
        return advisoryFutureReturnsProjectionRangeContext.copy(d4, d5, d6, byteString);
    }

    public final AdvisoryFutureReturnsProjectionRangeContext copy(double percentile_5, double percentile_95, double median, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryFutureReturnsProjectionRangeContext(percentile_5, percentile_95, median, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryFutureReturnsProjectionRangeContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryFutureReturnsProjectionRangeContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsProjectionRangeContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryFutureReturnsProjectionRangeContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getPercentile_5());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getPercentile_5()));
                }
                if (!Double.valueOf(value.getPercentile_95()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getPercentile_95()));
                }
                return !Double.valueOf(value.getMedian()).equals(dValueOf2) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getMedian())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryFutureReturnsProjectionRangeContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getPercentile_5());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getPercentile_5()));
                }
                if (!Double.valueOf(value.getPercentile_95()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getPercentile_95()));
                }
                if (!Double.valueOf(value.getMedian()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getMedian()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryFutureReturnsProjectionRangeContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getMedian());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getMedian()));
                }
                if (!Double.valueOf(value.getPercentile_95()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getPercentile_95()));
                }
                if (Double.valueOf(value.getPercentile_5()).equals(dValueOf2)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getPercentile_5()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryFutureReturnsProjectionRangeContext redact(AdvisoryFutureReturnsProjectionRangeContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisoryFutureReturnsProjectionRangeContext.copy$default(value, 0.0d, 0.0d, 0.0d, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryFutureReturnsProjectionRangeContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisoryFutureReturnsProjectionRangeContext(dDoubleValue, dDoubleValue2, dDoubleValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
