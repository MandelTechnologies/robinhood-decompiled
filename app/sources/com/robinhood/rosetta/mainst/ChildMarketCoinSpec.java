package com.robinhood.rosetta.mainst;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ChildMarketCoinSpec.kt */
@kotlin.Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ChildMarketCoinSpec;", "Lcom/squareup/wire/Message;", "", "min_order_size", "Lcom/robinhood/rosetta/mainst/Decimal;", "max_order_size", "min_order_price_increment", "min_order_quantity_increment", "is_valid_spec", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;ZLokio/ByteString;)V", "getMin_order_size", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getMax_order_size", "getMin_order_price_increment", "getMin_order_quantity_increment", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ChildMarketCoinSpec extends Message {

    @JvmField
    public static final ProtoAdapter<ChildMarketCoinSpec> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isValidSpec", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_valid_spec;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "maxOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Decimal max_order_size;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minOrderPriceIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Decimal min_order_price_increment;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minOrderQuantityIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Decimal min_order_quantity_increment;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Decimal min_order_size;

    public ChildMarketCoinSpec() {
        this(null, null, null, null, false, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24642newBuilder();
    }

    public final Decimal getMin_order_size() {
        return this.min_order_size;
    }

    public final Decimal getMax_order_size() {
        return this.max_order_size;
    }

    public final Decimal getMin_order_price_increment() {
        return this.min_order_price_increment;
    }

    public final Decimal getMin_order_quantity_increment() {
        return this.min_order_quantity_increment;
    }

    /* renamed from: is_valid_spec, reason: from getter */
    public final boolean getIs_valid_spec() {
        return this.is_valid_spec;
    }

    public /* synthetic */ ChildMarketCoinSpec(Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : decimal, (i & 2) != 0 ? null : decimal2, (i & 4) != 0 ? null : decimal3, (i & 8) != 0 ? null : decimal4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChildMarketCoinSpec(Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.min_order_size = decimal;
        this.max_order_size = decimal2;
        this.min_order_price_increment = decimal3;
        this.min_order_quantity_increment = decimal4;
        this.is_valid_spec = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24642newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChildMarketCoinSpec)) {
            return false;
        }
        ChildMarketCoinSpec childMarketCoinSpec = (ChildMarketCoinSpec) other;
        return Intrinsics.areEqual(unknownFields(), childMarketCoinSpec.unknownFields()) && Intrinsics.areEqual(this.min_order_size, childMarketCoinSpec.min_order_size) && Intrinsics.areEqual(this.max_order_size, childMarketCoinSpec.max_order_size) && Intrinsics.areEqual(this.min_order_price_increment, childMarketCoinSpec.min_order_price_increment) && Intrinsics.areEqual(this.min_order_quantity_increment, childMarketCoinSpec.min_order_quantity_increment) && this.is_valid_spec == childMarketCoinSpec.is_valid_spec;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Decimal decimal = this.min_order_size;
        int iHashCode2 = (iHashCode + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.max_order_size;
        int iHashCode3 = (iHashCode2 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.min_order_price_increment;
        int iHashCode4 = (iHashCode3 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        Decimal decimal4 = this.min_order_quantity_increment;
        int iHashCode5 = ((iHashCode4 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_valid_spec);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Decimal decimal = this.min_order_size;
        if (decimal != null) {
            arrayList.add("min_order_size=" + decimal);
        }
        Decimal decimal2 = this.max_order_size;
        if (decimal2 != null) {
            arrayList.add("max_order_size=" + decimal2);
        }
        Decimal decimal3 = this.min_order_price_increment;
        if (decimal3 != null) {
            arrayList.add("min_order_price_increment=" + decimal3);
        }
        Decimal decimal4 = this.min_order_quantity_increment;
        if (decimal4 != null) {
            arrayList.add("min_order_quantity_increment=" + decimal4);
        }
        arrayList.add("is_valid_spec=" + this.is_valid_spec);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChildMarketCoinSpec{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ChildMarketCoinSpec copy$default(ChildMarketCoinSpec childMarketCoinSpec, Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            decimal = childMarketCoinSpec.min_order_size;
        }
        if ((i & 2) != 0) {
            decimal2 = childMarketCoinSpec.max_order_size;
        }
        if ((i & 4) != 0) {
            decimal3 = childMarketCoinSpec.min_order_price_increment;
        }
        if ((i & 8) != 0) {
            decimal4 = childMarketCoinSpec.min_order_quantity_increment;
        }
        if ((i & 16) != 0) {
            z = childMarketCoinSpec.is_valid_spec;
        }
        if ((i & 32) != 0) {
            byteString = childMarketCoinSpec.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        return childMarketCoinSpec.copy(decimal, decimal2, decimal3, decimal4, z2, byteString2);
    }

    public final ChildMarketCoinSpec copy(Decimal min_order_size, Decimal max_order_size, Decimal min_order_price_increment, Decimal min_order_quantity_increment, boolean is_valid_spec, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChildMarketCoinSpec(min_order_size, max_order_size, min_order_price_increment, min_order_quantity_increment, is_valid_spec, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChildMarketCoinSpec.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChildMarketCoinSpec>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.ChildMarketCoinSpec$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChildMarketCoinSpec value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMin_order_size() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(1, value.getMin_order_size());
                }
                if (value.getMax_order_size() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(2, value.getMax_order_size());
                }
                if (value.getMin_order_price_increment() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(3, value.getMin_order_price_increment());
                }
                if (value.getMin_order_quantity_increment() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(4, value.getMin_order_quantity_increment());
                }
                return value.getIs_valid_spec() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_valid_spec())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChildMarketCoinSpec value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMin_order_size() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 1, (int) value.getMin_order_size());
                }
                if (value.getMax_order_size() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getMax_order_size());
                }
                if (value.getMin_order_price_increment() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getMin_order_price_increment());
                }
                if (value.getMin_order_quantity_increment() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getMin_order_quantity_increment());
                }
                if (value.getIs_valid_spec()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_valid_spec()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChildMarketCoinSpec value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_valid_spec()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_valid_spec()));
                }
                if (value.getMin_order_quantity_increment() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getMin_order_quantity_increment());
                }
                if (value.getMin_order_price_increment() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getMin_order_price_increment());
                }
                if (value.getMax_order_size() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getMax_order_size());
                }
                if (value.getMin_order_size() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 1, (int) value.getMin_order_size());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChildMarketCoinSpec redact(ChildMarketCoinSpec value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Decimal min_order_size = value.getMin_order_size();
                Decimal decimalRedact = min_order_size != null ? Decimal.ADAPTER.redact(min_order_size) : null;
                Decimal max_order_size = value.getMax_order_size();
                Decimal decimalRedact2 = max_order_size != null ? Decimal.ADAPTER.redact(max_order_size) : null;
                Decimal min_order_price_increment = value.getMin_order_price_increment();
                Decimal decimalRedact3 = min_order_price_increment != null ? Decimal.ADAPTER.redact(min_order_price_increment) : null;
                Decimal min_order_quantity_increment = value.getMin_order_quantity_increment();
                return ChildMarketCoinSpec.copy$default(value, decimalRedact, decimalRedact2, decimalRedact3, min_order_quantity_increment != null ? Decimal.ADAPTER.redact(min_order_quantity_increment) : null, false, ByteString.EMPTY, 16, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChildMarketCoinSpec decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Decimal decimalDecode = null;
                Decimal decimalDecode2 = null;
                Decimal decimalDecode3 = null;
                boolean zBooleanValue = false;
                Decimal decimalDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ChildMarketCoinSpec(decimalDecode, decimalDecode4, decimalDecode2, decimalDecode3, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        decimalDecode = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        decimalDecode4 = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        decimalDecode2 = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        decimalDecode3 = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
