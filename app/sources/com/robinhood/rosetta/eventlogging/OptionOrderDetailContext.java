package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
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

/* compiled from: OptionOrderDetailContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010$\u001a\u00020\u0002H\u0017J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\nH\u0016J\b\u0010)\u001a\u00020\u0004H\u0016Jt\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;", "Lcom/squareup/wire/Message;", "", "order_id", "", "limit_price", "", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "total_quantity", "", "filled_quantity", "is_stop_order", "", "order_state", "chain_symbol", "source", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;FFFIIZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getLimit_price", "()F", "getBid_price", "getAsk_price", "getTotal_quantity", "()I", "getFilled_quantity", "()Z", "getOrder_state", "getChain_symbol", "getSource", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionOrderDetailContext extends Message {

    @JvmField
    public static final ProtoAdapter<OptionOrderDetailContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chainSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String chain_symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "filledQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int filled_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isStopOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean is_stop_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float limit_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String order_state;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionOrderMeta$Source#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final OptionOrderMeta.Source source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int total_quantity;

    public OptionOrderDetailContext() {
        this(null, 0.0f, 0.0f, 0.0f, 0, 0, false, null, null, null, null, 2047, null);
    }

    public /* synthetic */ OptionOrderDetailContext(String str, float f, float f2, float f3, int i, int i2, boolean z, String str2, String str3, OptionOrderMeta.Source source, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0.0f : f, (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? "" : str2, (i3 & 256) != 0 ? "" : str3, (i3 & 512) != 0 ? OptionOrderMeta.Source.SOURCE_UNSPECIFIED : source, (i3 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24427newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final float getLimit_price() {
        return this.limit_price;
    }

    public final float getBid_price() {
        return this.bid_price;
    }

    public final float getAsk_price() {
        return this.ask_price;
    }

    public final int getTotal_quantity() {
        return this.total_quantity;
    }

    public final int getFilled_quantity() {
        return this.filled_quantity;
    }

    /* renamed from: is_stop_order, reason: from getter */
    public final boolean getIs_stop_order() {
        return this.is_stop_order;
    }

    public final String getOrder_state() {
        return this.order_state;
    }

    public final String getChain_symbol() {
        return this.chain_symbol;
    }

    public final OptionOrderMeta.Source getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderDetailContext(String order_id, float f, float f2, float f3, int i, int i2, boolean z, String order_state, String chain_symbol, OptionOrderMeta.Source source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.limit_price = f;
        this.bid_price = f2;
        this.ask_price = f3;
        this.total_quantity = i;
        this.filled_quantity = i2;
        this.is_stop_order = z;
        this.order_state = order_state;
        this.chain_symbol = chain_symbol;
        this.source = source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24427newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionOrderDetailContext)) {
            return false;
        }
        OptionOrderDetailContext optionOrderDetailContext = (OptionOrderDetailContext) other;
        return Intrinsics.areEqual(unknownFields(), optionOrderDetailContext.unknownFields()) && Intrinsics.areEqual(this.order_id, optionOrderDetailContext.order_id) && this.limit_price == optionOrderDetailContext.limit_price && this.bid_price == optionOrderDetailContext.bid_price && this.ask_price == optionOrderDetailContext.ask_price && this.total_quantity == optionOrderDetailContext.total_quantity && this.filled_quantity == optionOrderDetailContext.filled_quantity && this.is_stop_order == optionOrderDetailContext.is_stop_order && Intrinsics.areEqual(this.order_state, optionOrderDetailContext.order_state) && Intrinsics.areEqual(this.chain_symbol, optionOrderDetailContext.chain_symbol) && this.source == optionOrderDetailContext.source;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + Float.hashCode(this.limit_price)) * 37) + Float.hashCode(this.bid_price)) * 37) + Float.hashCode(this.ask_price)) * 37) + Integer.hashCode(this.total_quantity)) * 37) + Integer.hashCode(this.filled_quantity)) * 37) + java.lang.Boolean.hashCode(this.is_stop_order)) * 37) + this.order_state.hashCode()) * 37) + this.chain_symbol.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("limit_price=" + this.limit_price);
        arrayList.add("bid_price=" + this.bid_price);
        arrayList.add("ask_price=" + this.ask_price);
        arrayList.add("total_quantity=" + this.total_quantity);
        arrayList.add("filled_quantity=" + this.filled_quantity);
        arrayList.add("is_stop_order=" + this.is_stop_order);
        arrayList.add("order_state=" + Internal.sanitize(this.order_state));
        arrayList.add("chain_symbol=" + Internal.sanitize(this.chain_symbol));
        arrayList.add("source=" + this.source);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderDetailContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionOrderDetailContext copy$default(OptionOrderDetailContext optionOrderDetailContext, String str, float f, float f2, float f3, int i, int i2, boolean z, String str2, String str3, OptionOrderMeta.Source source, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = optionOrderDetailContext.order_id;
        }
        if ((i3 & 2) != 0) {
            f = optionOrderDetailContext.limit_price;
        }
        if ((i3 & 4) != 0) {
            f2 = optionOrderDetailContext.bid_price;
        }
        if ((i3 & 8) != 0) {
            f3 = optionOrderDetailContext.ask_price;
        }
        if ((i3 & 16) != 0) {
            i = optionOrderDetailContext.total_quantity;
        }
        if ((i3 & 32) != 0) {
            i2 = optionOrderDetailContext.filled_quantity;
        }
        if ((i3 & 64) != 0) {
            z = optionOrderDetailContext.is_stop_order;
        }
        if ((i3 & 128) != 0) {
            str2 = optionOrderDetailContext.order_state;
        }
        if ((i3 & 256) != 0) {
            str3 = optionOrderDetailContext.chain_symbol;
        }
        if ((i3 & 512) != 0) {
            source = optionOrderDetailContext.source;
        }
        if ((i3 & 1024) != 0) {
            byteString = optionOrderDetailContext.unknownFields();
        }
        OptionOrderMeta.Source source2 = source;
        ByteString byteString2 = byteString;
        String str4 = str2;
        String str5 = str3;
        int i4 = i2;
        boolean z2 = z;
        int i5 = i;
        float f4 = f2;
        return optionOrderDetailContext.copy(str, f, f4, f3, i5, i4, z2, str4, str5, source2, byteString2);
    }

    public final OptionOrderDetailContext copy(String order_id, float limit_price, float bid_price, float ask_price, int total_quantity, int filled_quantity, boolean is_stop_order, String order_state, String chain_symbol, OptionOrderMeta.Source source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionOrderDetailContext(order_id, limit_price, bid_price, ask_price, total_quantity, filled_quantity, is_stop_order, order_state, chain_symbol, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderDetailContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionOrderDetailContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionOrderDetailContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionOrderDetailContext value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (!Float.valueOf(value.getLimit_price()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getLimit_price()));
                }
                if (!Float.valueOf(value.getBid_price()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getBid_price()));
                }
                if (!Float.valueOf(value.getAsk_price()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getAsk_price()));
                }
                if (value.getTotal_quantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getTotal_quantity()));
                }
                if (value.getFilled_quantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getFilled_quantity()));
                }
                if (value.getIs_stop_order()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(7, java.lang.Boolean.valueOf(value.getIs_stop_order()));
                }
                if (!Intrinsics.areEqual(value.getOrder_state(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getOrder_state());
                }
                if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getChain_symbol());
                }
                return value.getSource() != OptionOrderMeta.Source.SOURCE_UNSPECIFIED ? size + OptionOrderMeta.Source.ADAPTER.encodedSizeWithTag(10, value.getSource()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionOrderDetailContext value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (!Float.valueOf(value.getLimit_price()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getLimit_price()));
                }
                if (!Float.valueOf(value.getBid_price()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getBid_price()));
                }
                if (!Float.valueOf(value.getAsk_price()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getAsk_price()));
                }
                if (value.getTotal_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTotal_quantity()));
                }
                if (value.getFilled_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getFilled_quantity()));
                }
                if (value.getIs_stop_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) java.lang.Boolean.valueOf(value.getIs_stop_order()));
                }
                if (!Intrinsics.areEqual(value.getOrder_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getOrder_state());
                }
                if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getChain_symbol());
                }
                if (value.getSource() != OptionOrderMeta.Source.SOURCE_UNSPECIFIED) {
                    OptionOrderMeta.Source.ADAPTER.encodeWithTag(writer, 10, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionOrderDetailContext value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSource() != OptionOrderMeta.Source.SOURCE_UNSPECIFIED) {
                    OptionOrderMeta.Source.ADAPTER.encodeWithTag(writer, 10, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getChain_symbol());
                }
                if (!Intrinsics.areEqual(value.getOrder_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getOrder_state());
                }
                if (value.getIs_stop_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) java.lang.Boolean.valueOf(value.getIs_stop_order()));
                }
                if (value.getFilled_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getFilled_quantity()));
                }
                if (value.getTotal_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTotal_quantity()));
                }
                if (!Float.valueOf(value.getAsk_price()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getAsk_price()));
                }
                if (!Float.valueOf(value.getBid_price()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getBid_price()));
                }
                if (!Float.valueOf(value.getLimit_price()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getLimit_price()));
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderDetailContext decode(ProtoReader reader) throws IOException {
                OptionOrderMeta.Source source;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                OptionOrderMeta.Source source2 = OptionOrderMeta.Source.SOURCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                int iIntValue = 0;
                int iIntValue2 = 0;
                boolean zBooleanValue = false;
                OptionOrderMeta.Source sourceDecode = source2;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                continue;
                            case 3:
                                fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                continue;
                            case 4:
                                fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                continue;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 6:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 7:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                try {
                                    sourceDecode = OptionOrderMeta.Source.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    source = sourceDecode;
                                    str = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                source = sourceDecode;
                                str = strDecode2;
                                break;
                        }
                        strDecode2 = str;
                        sourceDecode = source;
                    } else {
                        return new OptionOrderDetailContext(strDecode2, fFloatValue, fFloatValue2, fFloatValue3, iIntValue, iIntValue2, zBooleanValue, strDecode3, strDecode, sourceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderDetailContext redact(OptionOrderDetailContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionOrderDetailContext.copy$default(value, null, 0.0f, 0.0f, 0.0f, 0, 0, false, null, null, null, ByteString.EMPTY, 1023, null);
            }
        };
    }
}
