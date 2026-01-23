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

/* compiled from: OptionOrderBidAskBarContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderBidAskBarContext;", "Lcom/squareup/wire/Message;", "", "bid", "", "mark", "ask", "selected_price", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDDLokio/ByteString;)V", "getBid", "()D", "getMark", "getAsk", "getSelected_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionOrderBidAskBarContext extends Message {

    @JvmField
    public static final ProtoAdapter<OptionOrderBidAskBarContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double ask;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double bid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double mark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "selectedPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double selected_price;

    public OptionOrderBidAskBarContext() {
        this(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24425newBuilder();
    }

    public final double getBid() {
        return this.bid;
    }

    public final double getMark() {
        return this.mark;
    }

    public final double getAsk() {
        return this.ask;
    }

    public final double getSelected_price() {
        return this.selected_price;
    }

    public /* synthetic */ OptionOrderBidAskBarContext(double d, double d2, double d3, double d4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderBidAskBarContext(double d, double d2, double d3, double d4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bid = d;
        this.mark = d2;
        this.ask = d3;
        this.selected_price = d4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24425newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionOrderBidAskBarContext)) {
            return false;
        }
        OptionOrderBidAskBarContext optionOrderBidAskBarContext = (OptionOrderBidAskBarContext) other;
        return Intrinsics.areEqual(unknownFields(), optionOrderBidAskBarContext.unknownFields()) && this.bid == optionOrderBidAskBarContext.bid && this.mark == optionOrderBidAskBarContext.mark && this.ask == optionOrderBidAskBarContext.ask && this.selected_price == optionOrderBidAskBarContext.selected_price;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Double.hashCode(this.bid)) * 37) + Double.hashCode(this.mark)) * 37) + Double.hashCode(this.ask)) * 37) + Double.hashCode(this.selected_price);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bid=" + this.bid);
        arrayList.add("mark=" + this.mark);
        arrayList.add("ask=" + this.ask);
        arrayList.add("selected_price=" + this.selected_price);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderBidAskBarContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionOrderBidAskBarContext copy$default(OptionOrderBidAskBarContext optionOrderBidAskBarContext, double d, double d2, double d3, double d4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = optionOrderBidAskBarContext.bid;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = optionOrderBidAskBarContext.mark;
        }
        return optionOrderBidAskBarContext.copy(d5, d2, (i & 4) != 0 ? optionOrderBidAskBarContext.ask : d3, (i & 8) != 0 ? optionOrderBidAskBarContext.selected_price : d4, (i & 16) != 0 ? optionOrderBidAskBarContext.unknownFields() : byteString);
    }

    public final OptionOrderBidAskBarContext copy(double bid, double mark, double ask, double selected_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionOrderBidAskBarContext(bid, mark, ask, selected_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderBidAskBarContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionOrderBidAskBarContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionOrderBidAskBarContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionOrderBidAskBarContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getBid());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getBid()));
                }
                if (!Double.valueOf(value.getMark()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getMark()));
                }
                if (!Double.valueOf(value.getAsk()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getAsk()));
                }
                return !Double.valueOf(value.getSelected_price()).equals(dValueOf2) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getSelected_price())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionOrderBidAskBarContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getBid());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getBid()));
                }
                if (!Double.valueOf(value.getMark()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getMark()));
                }
                if (!Double.valueOf(value.getAsk()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAsk()));
                }
                if (!Double.valueOf(value.getSelected_price()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getSelected_price()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionOrderBidAskBarContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getSelected_price());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getSelected_price()));
                }
                if (!Double.valueOf(value.getAsk()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAsk()));
                }
                if (!Double.valueOf(value.getMark()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getMark()));
                }
                if (Double.valueOf(value.getBid()).equals(dValueOf2)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getBid()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderBidAskBarContext redact(OptionOrderBidAskBarContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionOrderBidAskBarContext.copy$default(value, 0.0d, 0.0d, 0.0d, 0.0d, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderBidAskBarContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionOrderBidAskBarContext(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 4) {
                        dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
