package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Money;
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

/* compiled from: RealizedPnlForOrder.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/ceres/v1/RealizedPnlForOrder;", "Lcom/squareup/wire/Message;", "", "order_id", "", "realized_pnl", "Lcom/robinhood/rosetta/common/Money;", "realized_pnl_without_fees", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getRealized_pnl", "()Lcom/robinhood/rosetta/common/Money;", "getRealized_pnl_without_fees", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class RealizedPnlForOrder extends Message {

    @JvmField
    public static final ProtoAdapter<RealizedPnlForOrder> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "realizedPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money realized_pnl;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "realizedPnlWithoutFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money realized_pnl_without_fees;

    public RealizedPnlForOrder() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20414newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public /* synthetic */ RealizedPnlForOrder(String str, Money money, Money money2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Money getRealized_pnl() {
        return this.realized_pnl;
    }

    public final Money getRealized_pnl_without_fees() {
        return this.realized_pnl_without_fees;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealizedPnlForOrder(String order_id, Money money, Money money2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.realized_pnl = money;
        this.realized_pnl_without_fees = money2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20414newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RealizedPnlForOrder)) {
            return false;
        }
        RealizedPnlForOrder realizedPnlForOrder = (RealizedPnlForOrder) other;
        return Intrinsics.areEqual(unknownFields(), realizedPnlForOrder.unknownFields()) && Intrinsics.areEqual(this.order_id, realizedPnlForOrder.order_id) && Intrinsics.areEqual(this.realized_pnl, realizedPnlForOrder.realized_pnl) && Intrinsics.areEqual(this.realized_pnl_without_fees, realizedPnlForOrder.realized_pnl_without_fees);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37;
        Money money = this.realized_pnl;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.realized_pnl_without_fees;
        int iHashCode3 = iHashCode2 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        Money money = this.realized_pnl;
        if (money != null) {
            arrayList.add("realized_pnl=" + money);
        }
        Money money2 = this.realized_pnl_without_fees;
        if (money2 != null) {
            arrayList.add("realized_pnl_without_fees=" + money2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RealizedPnlForOrder{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RealizedPnlForOrder copy$default(RealizedPnlForOrder realizedPnlForOrder, String str, Money money, Money money2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = realizedPnlForOrder.order_id;
        }
        if ((i & 2) != 0) {
            money = realizedPnlForOrder.realized_pnl;
        }
        if ((i & 4) != 0) {
            money2 = realizedPnlForOrder.realized_pnl_without_fees;
        }
        if ((i & 8) != 0) {
            byteString = realizedPnlForOrder.unknownFields();
        }
        return realizedPnlForOrder.copy(str, money, money2, byteString);
    }

    public final RealizedPnlForOrder copy(String order_id, Money realized_pnl, Money realized_pnl_without_fees, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RealizedPnlForOrder(order_id, realized_pnl, realized_pnl_without_fees, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RealizedPnlForOrder.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RealizedPnlForOrder>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.RealizedPnlForOrder$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RealizedPnlForOrder value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getRealized_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getRealized_pnl());
                }
                return value.getRealized_pnl_without_fees() != null ? size + Money.ADAPTER.encodedSizeWithTag(3, value.getRealized_pnl_without_fees()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RealizedPnlForOrder value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getRealized_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getRealized_pnl());
                }
                if (value.getRealized_pnl_without_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getRealized_pnl_without_fees());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RealizedPnlForOrder value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRealized_pnl_without_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getRealized_pnl_without_fees());
                }
                if (value.getRealized_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getRealized_pnl());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedPnlForOrder redact(RealizedPnlForOrder value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money realized_pnl = value.getRealized_pnl();
                Money moneyRedact = realized_pnl != null ? Money.ADAPTER.redact(realized_pnl) : null;
                Money realized_pnl_without_fees = value.getRealized_pnl_without_fees();
                return RealizedPnlForOrder.copy$default(value, null, moneyRedact, realized_pnl_without_fees != null ? Money.ADAPTER.redact(realized_pnl_without_fees) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RealizedPnlForOrder decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RealizedPnlForOrder(strDecode, moneyDecode, moneyDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
