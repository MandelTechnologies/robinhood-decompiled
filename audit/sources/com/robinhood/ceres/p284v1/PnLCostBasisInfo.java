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

/* compiled from: PnLCostBasisInfo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016JH\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PnLCostBasisInfo;", "Lcom/squareup/wire/Message;", "", "open_pnl_cost_basis", "Lcom/robinhood/rosetta/common/Money;", "day_pnl_cost_basis", "signed_quantity", "", "avg_trade_price", "day_open_pnl_cost_basis", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getOpen_pnl_cost_basis", "()Lcom/robinhood/rosetta/common/Money;", "getDay_pnl_cost_basis", "getSigned_quantity", "()Ljava/lang/String;", "getAvg_trade_price", "getDay_open_pnl_cost_basis", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PnLCostBasisInfo extends Message {

    @JvmField
    public static final ProtoAdapter<PnLCostBasisInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "avgTradePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String avg_trade_price;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dayOpenPnlCostBasis", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money day_open_pnl_cost_basis;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dayPnlCostBasis", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money day_pnl_cost_basis;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "openPnlCostBasis", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money open_pnl_cost_basis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "signedQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String signed_quantity;

    public PnLCostBasisInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ PnLCostBasisInfo(Money money, Money money2, String str, String str2, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : money3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20404newBuilder();
    }

    public final Money getOpen_pnl_cost_basis() {
        return this.open_pnl_cost_basis;
    }

    public final Money getDay_pnl_cost_basis() {
        return this.day_pnl_cost_basis;
    }

    public final String getSigned_quantity() {
        return this.signed_quantity;
    }

    public final String getAvg_trade_price() {
        return this.avg_trade_price;
    }

    public final Money getDay_open_pnl_cost_basis() {
        return this.day_open_pnl_cost_basis;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnLCostBasisInfo(Money money, Money money2, String signed_quantity, String avg_trade_price, Money money3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(signed_quantity, "signed_quantity");
        Intrinsics.checkNotNullParameter(avg_trade_price, "avg_trade_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.open_pnl_cost_basis = money;
        this.day_pnl_cost_basis = money2;
        this.signed_quantity = signed_quantity;
        this.avg_trade_price = avg_trade_price;
        this.day_open_pnl_cost_basis = money3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20404newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PnLCostBasisInfo)) {
            return false;
        }
        PnLCostBasisInfo pnLCostBasisInfo = (PnLCostBasisInfo) other;
        return Intrinsics.areEqual(unknownFields(), pnLCostBasisInfo.unknownFields()) && Intrinsics.areEqual(this.open_pnl_cost_basis, pnLCostBasisInfo.open_pnl_cost_basis) && Intrinsics.areEqual(this.day_pnl_cost_basis, pnLCostBasisInfo.day_pnl_cost_basis) && Intrinsics.areEqual(this.signed_quantity, pnLCostBasisInfo.signed_quantity) && Intrinsics.areEqual(this.avg_trade_price, pnLCostBasisInfo.avg_trade_price) && Intrinsics.areEqual(this.day_open_pnl_cost_basis, pnLCostBasisInfo.day_open_pnl_cost_basis);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.open_pnl_cost_basis;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.day_pnl_cost_basis;
        int iHashCode3 = (((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.signed_quantity.hashCode()) * 37) + this.avg_trade_price.hashCode()) * 37;
        Money money3 = this.day_open_pnl_cost_basis;
        int iHashCode4 = iHashCode3 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.open_pnl_cost_basis;
        if (money != null) {
            arrayList.add("open_pnl_cost_basis=" + money);
        }
        Money money2 = this.day_pnl_cost_basis;
        if (money2 != null) {
            arrayList.add("day_pnl_cost_basis=" + money2);
        }
        arrayList.add("signed_quantity=" + Internal.sanitize(this.signed_quantity));
        arrayList.add("avg_trade_price=" + Internal.sanitize(this.avg_trade_price));
        Money money3 = this.day_open_pnl_cost_basis;
        if (money3 != null) {
            arrayList.add("day_open_pnl_cost_basis=" + money3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PnLCostBasisInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PnLCostBasisInfo copy$default(PnLCostBasisInfo pnLCostBasisInfo, Money money, Money money2, String str, String str2, Money money3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = pnLCostBasisInfo.open_pnl_cost_basis;
        }
        if ((i & 2) != 0) {
            money2 = pnLCostBasisInfo.day_pnl_cost_basis;
        }
        if ((i & 4) != 0) {
            str = pnLCostBasisInfo.signed_quantity;
        }
        if ((i & 8) != 0) {
            str2 = pnLCostBasisInfo.avg_trade_price;
        }
        if ((i & 16) != 0) {
            money3 = pnLCostBasisInfo.day_open_pnl_cost_basis;
        }
        if ((i & 32) != 0) {
            byteString = pnLCostBasisInfo.unknownFields();
        }
        Money money4 = money3;
        ByteString byteString2 = byteString;
        return pnLCostBasisInfo.copy(money, money2, str, str2, money4, byteString2);
    }

    public final PnLCostBasisInfo copy(Money open_pnl_cost_basis, Money day_pnl_cost_basis, String signed_quantity, String avg_trade_price, Money day_open_pnl_cost_basis, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(signed_quantity, "signed_quantity");
        Intrinsics.checkNotNullParameter(avg_trade_price, "avg_trade_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PnLCostBasisInfo(open_pnl_cost_basis, day_pnl_cost_basis, signed_quantity, avg_trade_price, day_open_pnl_cost_basis, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PnLCostBasisInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PnLCostBasisInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.PnLCostBasisInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PnLCostBasisInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOpen_pnl_cost_basis() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getOpen_pnl_cost_basis());
                }
                if (value.getDay_pnl_cost_basis() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getDay_pnl_cost_basis());
                }
                if (!Intrinsics.areEqual(value.getSigned_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSigned_quantity());
                }
                if (!Intrinsics.areEqual(value.getAvg_trade_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAvg_trade_price());
                }
                return value.getDay_open_pnl_cost_basis() != null ? size + Money.ADAPTER.encodedSizeWithTag(5, value.getDay_open_pnl_cost_basis()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PnLCostBasisInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOpen_pnl_cost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getOpen_pnl_cost_basis());
                }
                if (value.getDay_pnl_cost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getDay_pnl_cost_basis());
                }
                if (!Intrinsics.areEqual(value.getSigned_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSigned_quantity());
                }
                if (!Intrinsics.areEqual(value.getAvg_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAvg_trade_price());
                }
                if (value.getDay_open_pnl_cost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getDay_open_pnl_cost_basis());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PnLCostBasisInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDay_open_pnl_cost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getDay_open_pnl_cost_basis());
                }
                if (!Intrinsics.areEqual(value.getAvg_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAvg_trade_price());
                }
                if (!Intrinsics.areEqual(value.getSigned_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSigned_quantity());
                }
                if (value.getDay_pnl_cost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getDay_pnl_cost_basis());
                }
                if (value.getOpen_pnl_cost_basis() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getOpen_pnl_cost_basis());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PnLCostBasisInfo redact(PnLCostBasisInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money open_pnl_cost_basis = value.getOpen_pnl_cost_basis();
                Money moneyRedact = open_pnl_cost_basis != null ? Money.ADAPTER.redact(open_pnl_cost_basis) : null;
                Money day_pnl_cost_basis = value.getDay_pnl_cost_basis();
                Money moneyRedact2 = day_pnl_cost_basis != null ? Money.ADAPTER.redact(day_pnl_cost_basis) : null;
                Money day_open_pnl_cost_basis = value.getDay_open_pnl_cost_basis();
                return PnLCostBasisInfo.copy$default(value, moneyRedact, moneyRedact2, null, null, day_open_pnl_cost_basis != null ? Money.ADAPTER.redact(day_open_pnl_cost_basis) : null, ByteString.EMPTY, 12, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PnLCostBasisInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                Money moneyDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PnLCostBasisInfo(moneyDecode, moneyDecode3, strDecode, strDecode2, moneyDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
