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

/* compiled from: OrderSummaryNbbo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderSummaryNbbo;", "Lcom/squareup/wire/Message;", "", "nbbo_prices_copy", "", "nbbo_refresh_copy", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getNbbo_prices_copy", "()Ljava/lang/String;", "getNbbo_refresh_copy", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OrderSummaryNbbo extends Message {

    @JvmField
    public static final ProtoAdapter<OrderSummaryNbbo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nbboPricesCopy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String nbbo_prices_copy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nbboRefreshCopy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String nbbo_refresh_copy;

    public OrderSummaryNbbo() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ OrderSummaryNbbo(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24454newBuilder();
    }

    public final String getNbbo_prices_copy() {
        return this.nbbo_prices_copy;
    }

    public final String getNbbo_refresh_copy() {
        return this.nbbo_refresh_copy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSummaryNbbo(String nbbo_prices_copy, String nbbo_refresh_copy, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(nbbo_prices_copy, "nbbo_prices_copy");
        Intrinsics.checkNotNullParameter(nbbo_refresh_copy, "nbbo_refresh_copy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.nbbo_prices_copy = nbbo_prices_copy;
        this.nbbo_refresh_copy = nbbo_refresh_copy;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24454newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderSummaryNbbo)) {
            return false;
        }
        OrderSummaryNbbo orderSummaryNbbo = (OrderSummaryNbbo) other;
        return Intrinsics.areEqual(unknownFields(), orderSummaryNbbo.unknownFields()) && Intrinsics.areEqual(this.nbbo_prices_copy, orderSummaryNbbo.nbbo_prices_copy) && Intrinsics.areEqual(this.nbbo_refresh_copy, orderSummaryNbbo.nbbo_refresh_copy);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.nbbo_prices_copy.hashCode()) * 37) + this.nbbo_refresh_copy.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("nbbo_prices_copy=" + Internal.sanitize(this.nbbo_prices_copy));
        arrayList.add("nbbo_refresh_copy=" + Internal.sanitize(this.nbbo_refresh_copy));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSummaryNbbo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderSummaryNbbo copy$default(OrderSummaryNbbo orderSummaryNbbo, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderSummaryNbbo.nbbo_prices_copy;
        }
        if ((i & 2) != 0) {
            str2 = orderSummaryNbbo.nbbo_refresh_copy;
        }
        if ((i & 4) != 0) {
            byteString = orderSummaryNbbo.unknownFields();
        }
        return orderSummaryNbbo.copy(str, str2, byteString);
    }

    public final OrderSummaryNbbo copy(String nbbo_prices_copy, String nbbo_refresh_copy, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(nbbo_prices_copy, "nbbo_prices_copy");
        Intrinsics.checkNotNullParameter(nbbo_refresh_copy, "nbbo_refresh_copy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderSummaryNbbo(nbbo_prices_copy, nbbo_refresh_copy, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSummaryNbbo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderSummaryNbbo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OrderSummaryNbbo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderSummaryNbbo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNbbo_prices_copy(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNbbo_prices_copy());
                }
                return !Intrinsics.areEqual(value.getNbbo_refresh_copy(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNbbo_refresh_copy()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderSummaryNbbo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNbbo_prices_copy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNbbo_prices_copy());
                }
                if (!Intrinsics.areEqual(value.getNbbo_refresh_copy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNbbo_refresh_copy());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderSummaryNbbo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getNbbo_refresh_copy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNbbo_refresh_copy());
                }
                if (Intrinsics.areEqual(value.getNbbo_prices_copy(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNbbo_prices_copy());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderSummaryNbbo redact(OrderSummaryNbbo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OrderSummaryNbbo.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderSummaryNbbo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderSummaryNbbo(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
