package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.compose.bidask.BidAskDetails3;
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

/* compiled from: PendingOptionOrderContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PendingOptionOrderContext;", "Lcom/squareup/wire/Message;", "", "order_id", "", "limit_price", "", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "chain_symbol", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;FFFLjava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getLimit_price", "()F", "getBid_price", "getAsk_price", "getChain_symbol", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PendingOptionOrderContext extends Message {

    @JvmField
    public static final ProtoAdapter<PendingOptionOrderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chainSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String chain_symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float limit_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    public PendingOptionOrderContext() {
        this(null, 0.0f, 0.0f, 0.0f, null, null, 63, null);
    }

    public /* synthetic */ PendingOptionOrderContext(String str, float f, float f2, float f3, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24469newBuilder();
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

    public final String getChain_symbol() {
        return this.chain_symbol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingOptionOrderContext(String order_id, float f, float f2, float f3, String chain_symbol, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.limit_price = f;
        this.bid_price = f2;
        this.ask_price = f3;
        this.chain_symbol = chain_symbol;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24469newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PendingOptionOrderContext)) {
            return false;
        }
        PendingOptionOrderContext pendingOptionOrderContext = (PendingOptionOrderContext) other;
        return Intrinsics.areEqual(unknownFields(), pendingOptionOrderContext.unknownFields()) && Intrinsics.areEqual(this.order_id, pendingOptionOrderContext.order_id) && this.limit_price == pendingOptionOrderContext.limit_price && this.bid_price == pendingOptionOrderContext.bid_price && this.ask_price == pendingOptionOrderContext.ask_price && Intrinsics.areEqual(this.chain_symbol, pendingOptionOrderContext.chain_symbol);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + Float.hashCode(this.limit_price)) * 37) + Float.hashCode(this.bid_price)) * 37) + Float.hashCode(this.ask_price)) * 37) + this.chain_symbol.hashCode();
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
        arrayList.add("chain_symbol=" + Internal.sanitize(this.chain_symbol));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PendingOptionOrderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PendingOptionOrderContext copy$default(PendingOptionOrderContext pendingOptionOrderContext, String str, float f, float f2, float f3, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingOptionOrderContext.order_id;
        }
        if ((i & 2) != 0) {
            f = pendingOptionOrderContext.limit_price;
        }
        if ((i & 4) != 0) {
            f2 = pendingOptionOrderContext.bid_price;
        }
        if ((i & 8) != 0) {
            f3 = pendingOptionOrderContext.ask_price;
        }
        if ((i & 16) != 0) {
            str2 = pendingOptionOrderContext.chain_symbol;
        }
        if ((i & 32) != 0) {
            byteString = pendingOptionOrderContext.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        return pendingOptionOrderContext.copy(str, f, f2, f3, str3, byteString2);
    }

    public final PendingOptionOrderContext copy(String order_id, float limit_price, float bid_price, float ask_price, String chain_symbol, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PendingOptionOrderContext(order_id, limit_price, bid_price, ask_price, chain_symbol, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PendingOptionOrderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PendingOptionOrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PendingOptionOrderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PendingOptionOrderContext value) {
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
                return !Intrinsics.areEqual(value.getChain_symbol(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getChain_symbol()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PendingOptionOrderContext value) throws IOException {
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
                if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getChain_symbol());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PendingOptionOrderContext value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getChain_symbol());
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

            @Override // com.squareup.wire.ProtoAdapter
            public PendingOptionOrderContext redact(PendingOptionOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PendingOptionOrderContext.copy$default(value, null, 0.0f, 0.0f, 0.0f, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PendingOptionOrderContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PendingOptionOrderContext(strDecode, fFloatValue, fFloatValue2, fFloatValue3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 3) {
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 4) {
                        fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 5) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
