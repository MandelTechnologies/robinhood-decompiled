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

/* compiled from: FuturesPositionContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesPositionContext;", "Lcom/squareup/wire/Message;", "", "num_positions", "", "num_pending_orders", "average_cost", "", "signed_quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(IIDILokio/ByteString;)V", "getNum_positions", "()I", "getNum_pending_orders", "getAverage_cost", "()D", "getSigned_quantity", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class FuturesPositionContext extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesPositionContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "averageCost", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double average_cost;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numPendingOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int num_pending_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numPositions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int num_positions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "signedQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int signed_quantity;

    public FuturesPositionContext() {
        this(0, 0, 0.0d, 0, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24284newBuilder();
    }

    public final int getNum_positions() {
        return this.num_positions;
    }

    public final int getNum_pending_orders() {
        return this.num_pending_orders;
    }

    public final double getAverage_cost() {
        return this.average_cost;
    }

    public final int getSigned_quantity() {
        return this.signed_quantity;
    }

    public /* synthetic */ FuturesPositionContext(int i, int i2, double d, int i3, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0.0d : d, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesPositionContext(int i, int i2, double d, int i3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.num_positions = i;
        this.num_pending_orders = i2;
        this.average_cost = d;
        this.signed_quantity = i3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24284newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesPositionContext)) {
            return false;
        }
        FuturesPositionContext futuresPositionContext = (FuturesPositionContext) other;
        return Intrinsics.areEqual(unknownFields(), futuresPositionContext.unknownFields()) && this.num_positions == futuresPositionContext.num_positions && this.num_pending_orders == futuresPositionContext.num_pending_orders && this.average_cost == futuresPositionContext.average_cost && this.signed_quantity == futuresPositionContext.signed_quantity;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.num_positions)) * 37) + Integer.hashCode(this.num_pending_orders)) * 37) + Double.hashCode(this.average_cost)) * 37) + Integer.hashCode(this.signed_quantity);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("num_positions=" + this.num_positions);
        arrayList.add("num_pending_orders=" + this.num_pending_orders);
        arrayList.add("average_cost=" + this.average_cost);
        arrayList.add("signed_quantity=" + this.signed_quantity);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesPositionContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesPositionContext copy$default(FuturesPositionContext futuresPositionContext, int i, int i2, double d, int i3, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = futuresPositionContext.num_positions;
        }
        if ((i4 & 2) != 0) {
            i2 = futuresPositionContext.num_pending_orders;
        }
        if ((i4 & 4) != 0) {
            d = futuresPositionContext.average_cost;
        }
        if ((i4 & 8) != 0) {
            i3 = futuresPositionContext.signed_quantity;
        }
        if ((i4 & 16) != 0) {
            byteString = futuresPositionContext.unknownFields();
        }
        double d2 = d;
        return futuresPositionContext.copy(i, i2, d2, i3, byteString);
    }

    public final FuturesPositionContext copy(int num_positions, int num_pending_orders, double average_cost, int signed_quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesPositionContext(num_positions, num_pending_orders, average_cost, signed_quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesPositionContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesPositionContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesPositionContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesPositionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getNum_positions() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getNum_positions()));
                }
                if (value.getNum_pending_orders() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getNum_pending_orders()));
                }
                if (!Double.valueOf(value.getAverage_cost()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getAverage_cost()));
                }
                return value.getSigned_quantity() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getSigned_quantity())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesPositionContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNum_positions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNum_positions()));
                }
                if (value.getNum_pending_orders() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getNum_pending_orders()));
                }
                if (!Double.valueOf(value.getAverage_cost()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAverage_cost()));
                }
                if (value.getSigned_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getSigned_quantity()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesPositionContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSigned_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getSigned_quantity()));
                }
                if (!Double.valueOf(value.getAverage_cost()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAverage_cost()));
                }
                if (value.getNum_pending_orders() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getNum_pending_orders()));
                }
                if (value.getNum_positions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getNum_positions()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesPositionContext redact(FuturesPositionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FuturesPositionContext.copy$default(value, 0, 0, 0.0d, 0, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesPositionContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                double dDoubleValue = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesPositionContext(iIntValue, iIntValue2, dDoubleValue, iIntValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 4) {
                        iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
