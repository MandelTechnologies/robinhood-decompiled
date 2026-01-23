package com.robinhood.rosetta.eventlogging;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
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
import rosetta.order.Side;

/* compiled from: CryptoQuickTradeButtonContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoQuickTradeButtonContext;", "Lcom/squareup/wire/Message;", "", "order_side", "Lrosetta/order/Side;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "value", "", "is_recurring", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/order/Side;ILjava/lang/String;ZLokio/ByteString;)V", "getOrder_side", "()Lrosetta/order/Side;", "getIndex", "()I", "getValue", "()Ljava/lang/String;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoQuickTradeButtonContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoQuickTradeButtonContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRecurring", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_recurring;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Side order_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String value;

    public CryptoQuickTradeButtonContext() {
        this(null, 0, null, false, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24162newBuilder();
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    public /* synthetic */ CryptoQuickTradeButtonContext(Side side, int i, String str, boolean z, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getValue() {
        return this.value;
    }

    /* renamed from: is_recurring, reason: from getter */
    public final boolean getIs_recurring() {
        return this.is_recurring;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoQuickTradeButtonContext(Side order_side, int i, String value, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_side = order_side;
        this.index = i;
        this.value = value;
        this.is_recurring = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24162newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoQuickTradeButtonContext)) {
            return false;
        }
        CryptoQuickTradeButtonContext cryptoQuickTradeButtonContext = (CryptoQuickTradeButtonContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoQuickTradeButtonContext.unknownFields()) && this.order_side == cryptoQuickTradeButtonContext.order_side && this.index == cryptoQuickTradeButtonContext.index && Intrinsics.areEqual(this.value, cryptoQuickTradeButtonContext.value) && this.is_recurring == cryptoQuickTradeButtonContext.is_recurring;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.order_side.hashCode()) * 37) + Integer.hashCode(this.index)) * 37) + this.value.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_recurring);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("index=" + this.index);
        arrayList.add("value=" + Internal.sanitize(this.value));
        arrayList.add("is_recurring=" + this.is_recurring);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoQuickTradeButtonContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoQuickTradeButtonContext copy$default(CryptoQuickTradeButtonContext cryptoQuickTradeButtonContext, Side side, int i, String str, boolean z, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            side = cryptoQuickTradeButtonContext.order_side;
        }
        if ((i2 & 2) != 0) {
            i = cryptoQuickTradeButtonContext.index;
        }
        if ((i2 & 4) != 0) {
            str = cryptoQuickTradeButtonContext.value;
        }
        if ((i2 & 8) != 0) {
            z = cryptoQuickTradeButtonContext.is_recurring;
        }
        if ((i2 & 16) != 0) {
            byteString = cryptoQuickTradeButtonContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str2 = str;
        return cryptoQuickTradeButtonContext.copy(side, i, str2, z, byteString2);
    }

    public final CryptoQuickTradeButtonContext copy(Side order_side, int index, String value, boolean is_recurring, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoQuickTradeButtonContext(order_side, index, value, is_recurring, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoQuickTradeButtonContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoQuickTradeButtonContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoQuickTradeButtonContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoQuickTradeButtonContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(1, value.getOrder_side());
                }
                if (value.getIndex() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getIndex()));
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getValue());
                }
                return value.getIs_recurring() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(4, java.lang.Boolean.valueOf(value.getIs_recurring())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoQuickTradeButtonContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_side());
                }
                if (value.getIndex() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getIndex()));
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                if (value.getIs_recurring()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getIs_recurring()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoQuickTradeButtonContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_recurring()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getIs_recurring()));
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                }
                if (value.getIndex() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getIndex()));
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_side());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoQuickTradeButtonContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side sideDecode = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                boolean zBooleanValue = false;
                while (true) {
                    Side side = sideDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CryptoQuickTradeButtonContext(side, iIntValue, strDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoQuickTradeButtonContext redact(CryptoQuickTradeButtonContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoQuickTradeButtonContext.copy$default(value, null, 0, null, false, ByteString.EMPTY, 15, null);
            }
        };
    }
}
