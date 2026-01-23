package com.robinhood.rosetta.eventlogging;

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

/* compiled from: ComboOrderDetailContext.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContext;", "Lcom/squareup/wire/Message;", "", "order_id", "", "underlying_symbol", "limit_price", "", "quantity", "", "order_state", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getUnderlying_symbol", "getLimit_price", "()F", "getQuantity", "()I", "getOrder_state", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ComboOrderDetailContext extends Message {

    @JvmField
    public static final ProtoAdapter<ComboOrderDetailContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float limit_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String order_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "underlyingSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String underlying_symbol;

    public ComboOrderDetailContext() {
        this(null, null, 0.0f, 0, null, null, 63, null);
    }

    public /* synthetic */ ComboOrderDetailContext(String str, String str2, float f, int i, String str3, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24130newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getUnderlying_symbol() {
        return this.underlying_symbol;
    }

    public final float getLimit_price() {
        return this.limit_price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getOrder_state() {
        return this.order_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboOrderDetailContext(String order_id, String underlying_symbol, float f, int i, String order_state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(underlying_symbol, "underlying_symbol");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.underlying_symbol = underlying_symbol;
        this.limit_price = f;
        this.quantity = i;
        this.order_state = order_state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24130newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ComboOrderDetailContext)) {
            return false;
        }
        ComboOrderDetailContext comboOrderDetailContext = (ComboOrderDetailContext) other;
        return Intrinsics.areEqual(unknownFields(), comboOrderDetailContext.unknownFields()) && Intrinsics.areEqual(this.order_id, comboOrderDetailContext.order_id) && Intrinsics.areEqual(this.underlying_symbol, comboOrderDetailContext.underlying_symbol) && this.limit_price == comboOrderDetailContext.limit_price && this.quantity == comboOrderDetailContext.quantity && Intrinsics.areEqual(this.order_state, comboOrderDetailContext.order_state);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + this.underlying_symbol.hashCode()) * 37) + Float.hashCode(this.limit_price)) * 37) + Integer.hashCode(this.quantity)) * 37) + this.order_state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("underlying_symbol=" + Internal.sanitize(this.underlying_symbol));
        arrayList.add("limit_price=" + this.limit_price);
        arrayList.add("quantity=" + this.quantity);
        arrayList.add("order_state=" + Internal.sanitize(this.order_state));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ComboOrderDetailContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ComboOrderDetailContext copy$default(ComboOrderDetailContext comboOrderDetailContext, String str, String str2, float f, int i, String str3, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = comboOrderDetailContext.order_id;
        }
        if ((i2 & 2) != 0) {
            str2 = comboOrderDetailContext.underlying_symbol;
        }
        if ((i2 & 4) != 0) {
            f = comboOrderDetailContext.limit_price;
        }
        if ((i2 & 8) != 0) {
            i = comboOrderDetailContext.quantity;
        }
        if ((i2 & 16) != 0) {
            str3 = comboOrderDetailContext.order_state;
        }
        if ((i2 & 32) != 0) {
            byteString = comboOrderDetailContext.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return comboOrderDetailContext.copy(str, str2, f, i, str4, byteString2);
    }

    public final ComboOrderDetailContext copy(String order_id, String underlying_symbol, float limit_price, int quantity, String order_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(underlying_symbol, "underlying_symbol");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ComboOrderDetailContext(order_id, underlying_symbol, limit_price, quantity, order_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ComboOrderDetailContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ComboOrderDetailContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ComboOrderDetailContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ComboOrderDetailContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getUnderlying_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUnderlying_symbol());
                }
                if (!Float.valueOf(value.getLimit_price()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getLimit_price()));
                }
                if (value.getQuantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getQuantity()));
                }
                return !Intrinsics.areEqual(value.getOrder_state(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getOrder_state()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ComboOrderDetailContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getUnderlying_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUnderlying_symbol());
                }
                if (!Float.valueOf(value.getLimit_price()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getLimit_price()));
                }
                if (value.getQuantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getQuantity()));
                }
                if (!Intrinsics.areEqual(value.getOrder_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOrder_state());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ComboOrderDetailContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOrder_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOrder_state());
                }
                if (value.getQuantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getQuantity()));
                }
                if (!Float.valueOf(value.getLimit_price()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getLimit_price()));
                }
                if (!Intrinsics.areEqual(value.getUnderlying_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUnderlying_symbol());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ComboOrderDetailContext redact(ComboOrderDetailContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ComboOrderDetailContext.copy$default(value, null, null, 0.0f, 0, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ComboOrderDetailContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                int iIntValue = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ComboOrderDetailContext(strDecode, strDecode2, fFloatValue, iIntValue, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 4) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 5) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
