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

/* compiled from: MarginCallMarketOrderDataMismatch.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginCallMarketOrderDataMismatch;", "Lcom/squareup/wire/Message;", "", "expected_close_positions_count", "", "actual_close_positions_count", "expected_estimated_value", "", "actual_estimated_value", "unknownFields", "Lokio/ByteString;", "<init>", "(IIDDLokio/ByteString;)V", "getExpected_close_positions_count", "()I", "getActual_close_positions_count", "getExpected_estimated_value", "()D", "getActual_estimated_value", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class MarginCallMarketOrderDataMismatch extends Message {

    @JvmField
    public static final ProtoAdapter<MarginCallMarketOrderDataMismatch> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "actualClosePositionsCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int actual_close_positions_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "actualEstimatedValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double actual_estimated_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "expectedClosePositionsCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int expected_close_positions_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "expectedEstimatedValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double expected_estimated_value;

    public MarginCallMarketOrderDataMismatch() {
        this(0, 0, 0.0d, 0.0d, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24376newBuilder();
    }

    public final int getExpected_close_positions_count() {
        return this.expected_close_positions_count;
    }

    public final int getActual_close_positions_count() {
        return this.actual_close_positions_count;
    }

    public final double getExpected_estimated_value() {
        return this.expected_estimated_value;
    }

    public final double getActual_estimated_value() {
        return this.actual_estimated_value;
    }

    public /* synthetic */ MarginCallMarketOrderDataMismatch(int i, int i2, double d, double d2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) != 0 ? 0.0d : d2, (i3 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginCallMarketOrderDataMismatch(int i, int i2, double d, double d2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.expected_close_positions_count = i;
        this.actual_close_positions_count = i2;
        this.expected_estimated_value = d;
        this.actual_estimated_value = d2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24376newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginCallMarketOrderDataMismatch)) {
            return false;
        }
        MarginCallMarketOrderDataMismatch marginCallMarketOrderDataMismatch = (MarginCallMarketOrderDataMismatch) other;
        return Intrinsics.areEqual(unknownFields(), marginCallMarketOrderDataMismatch.unknownFields()) && this.expected_close_positions_count == marginCallMarketOrderDataMismatch.expected_close_positions_count && this.actual_close_positions_count == marginCallMarketOrderDataMismatch.actual_close_positions_count && this.expected_estimated_value == marginCallMarketOrderDataMismatch.expected_estimated_value && this.actual_estimated_value == marginCallMarketOrderDataMismatch.actual_estimated_value;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.expected_close_positions_count)) * 37) + Integer.hashCode(this.actual_close_positions_count)) * 37) + Double.hashCode(this.expected_estimated_value)) * 37) + Double.hashCode(this.actual_estimated_value);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("expected_close_positions_count=" + this.expected_close_positions_count);
        arrayList.add("actual_close_positions_count=" + this.actual_close_positions_count);
        arrayList.add("expected_estimated_value=" + this.expected_estimated_value);
        arrayList.add("actual_estimated_value=" + this.actual_estimated_value);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginCallMarketOrderDataMismatch{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginCallMarketOrderDataMismatch copy$default(MarginCallMarketOrderDataMismatch marginCallMarketOrderDataMismatch, int i, int i2, double d, double d2, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = marginCallMarketOrderDataMismatch.expected_close_positions_count;
        }
        if ((i3 & 2) != 0) {
            i2 = marginCallMarketOrderDataMismatch.actual_close_positions_count;
        }
        if ((i3 & 4) != 0) {
            d = marginCallMarketOrderDataMismatch.expected_estimated_value;
        }
        if ((i3 & 8) != 0) {
            d2 = marginCallMarketOrderDataMismatch.actual_estimated_value;
        }
        if ((i3 & 16) != 0) {
            byteString = marginCallMarketOrderDataMismatch.unknownFields();
        }
        ByteString byteString2 = byteString;
        double d3 = d2;
        return marginCallMarketOrderDataMismatch.copy(i, i2, d, d3, byteString2);
    }

    public final MarginCallMarketOrderDataMismatch copy(int expected_close_positions_count, int actual_close_positions_count, double expected_estimated_value, double actual_estimated_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginCallMarketOrderDataMismatch(expected_close_positions_count, actual_close_positions_count, expected_estimated_value, actual_estimated_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginCallMarketOrderDataMismatch.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginCallMarketOrderDataMismatch>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MarginCallMarketOrderDataMismatch$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginCallMarketOrderDataMismatch value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getExpected_close_positions_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getExpected_close_positions_count()));
                }
                if (value.getActual_close_positions_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getActual_close_positions_count()));
                }
                if (!Double.valueOf(value.getExpected_estimated_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getExpected_estimated_value()));
                }
                return !Double.valueOf(value.getActual_estimated_value()).equals(dValueOf) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getActual_estimated_value())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginCallMarketOrderDataMismatch value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getExpected_close_positions_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getExpected_close_positions_count()));
                }
                if (value.getActual_close_positions_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getActual_close_positions_count()));
                }
                if (!Double.valueOf(value.getExpected_estimated_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getExpected_estimated_value()));
                }
                if (!Double.valueOf(value.getActual_estimated_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getActual_estimated_value()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginCallMarketOrderDataMismatch value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getActual_estimated_value());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getActual_estimated_value()));
                }
                if (!Double.valueOf(value.getExpected_estimated_value()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getExpected_estimated_value()));
                }
                if (value.getActual_close_positions_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getActual_close_positions_count()));
                }
                if (value.getExpected_close_positions_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getExpected_close_positions_count()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginCallMarketOrderDataMismatch redact(MarginCallMarketOrderDataMismatch value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MarginCallMarketOrderDataMismatch.copy$default(value, 0, 0, 0.0d, 0.0d, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginCallMarketOrderDataMismatch decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginCallMarketOrderDataMismatch(iIntValue, iIntValue2, dDoubleValue, dDoubleValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 4) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
