package crypto_perpetuals.settlement.p441v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import crypto_perpetuals.common.p435v1.Money;
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

/* compiled from: SettlementFees.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J@\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementFees;", "Lcom/squareup/wire/Message;", "", "total_fees", "Lcrypto_perpetuals/common/v1/Money;", "robinhood_fees", "liquidation_fees", "trading_fees", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lokio/ByteString;)V", "getTotal_fees", "()Lcrypto_perpetuals/common/v1/Money;", "getRobinhood_fees", "getLiquidation_fees", "getTrading_fees", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SettlementFees extends Message {

    @JvmField
    public static final ProtoAdapter<SettlementFees> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "liquidationFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money liquidation_fees;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "robinhoodFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money robinhood_fees;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "totalFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money total_fees;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "tradingFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money trading_fees;

    public SettlementFees() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27893newBuilder();
    }

    public final Money getTotal_fees() {
        return this.total_fees;
    }

    public final Money getRobinhood_fees() {
        return this.robinhood_fees;
    }

    public final Money getLiquidation_fees() {
        return this.liquidation_fees;
    }

    public final Money getTrading_fees() {
        return this.trading_fees;
    }

    public /* synthetic */ SettlementFees(Money money, Money money2, Money money3, Money money4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : money4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettlementFees(Money money, Money money2, Money money3, Money money4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_fees = money;
        this.robinhood_fees = money2;
        this.liquidation_fees = money3;
        this.trading_fees = money4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27893newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SettlementFees)) {
            return false;
        }
        SettlementFees settlementFees = (SettlementFees) other;
        return Intrinsics.areEqual(unknownFields(), settlementFees.unknownFields()) && Intrinsics.areEqual(this.total_fees, settlementFees.total_fees) && Intrinsics.areEqual(this.robinhood_fees, settlementFees.robinhood_fees) && Intrinsics.areEqual(this.liquidation_fees, settlementFees.liquidation_fees) && Intrinsics.areEqual(this.trading_fees, settlementFees.trading_fees);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.total_fees;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.robinhood_fees;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.liquidation_fees;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.trading_fees;
        int iHashCode5 = iHashCode4 + (money4 != null ? money4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.total_fees;
        if (money != null) {
            arrayList.add("total_fees=" + money);
        }
        Money money2 = this.robinhood_fees;
        if (money2 != null) {
            arrayList.add("robinhood_fees=" + money2);
        }
        Money money3 = this.liquidation_fees;
        if (money3 != null) {
            arrayList.add("liquidation_fees=" + money3);
        }
        Money money4 = this.trading_fees;
        if (money4 != null) {
            arrayList.add("trading_fees=" + money4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SettlementFees{", "}", 0, null, null, 56, null);
    }

    public final SettlementFees copy(Money total_fees, Money robinhood_fees, Money liquidation_fees, Money trading_fees, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SettlementFees(total_fees, robinhood_fees, liquidation_fees, trading_fees, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SettlementFees.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SettlementFees>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.settlement.v1.SettlementFees$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SettlementFees value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_fees() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getTotal_fees());
                }
                if (value.getRobinhood_fees() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getRobinhood_fees());
                }
                if (value.getLiquidation_fees() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getLiquidation_fees());
                }
                return value.getTrading_fees() != null ? size + Money.ADAPTER.encodedSizeWithTag(4, value.getTrading_fees()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SettlementFees value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTotal_fees());
                }
                if (value.getRobinhood_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getRobinhood_fees());
                }
                if (value.getLiquidation_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getLiquidation_fees());
                }
                if (value.getTrading_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrading_fees());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SettlementFees value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTrading_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrading_fees());
                }
                if (value.getLiquidation_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getLiquidation_fees());
                }
                if (value.getRobinhood_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getRobinhood_fees());
                }
                if (value.getTotal_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTotal_fees());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SettlementFees redact(SettlementFees value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money total_fees = value.getTotal_fees();
                Money moneyRedact = total_fees != null ? Money.ADAPTER.redact(total_fees) : null;
                Money robinhood_fees = value.getRobinhood_fees();
                Money moneyRedact2 = robinhood_fees != null ? Money.ADAPTER.redact(robinhood_fees) : null;
                Money liquidation_fees = value.getLiquidation_fees();
                Money moneyRedact3 = liquidation_fees != null ? Money.ADAPTER.redact(liquidation_fees) : null;
                Money trading_fees = value.getTrading_fees();
                return value.copy(moneyRedact, moneyRedact2, moneyRedact3, trading_fees != null ? Money.ADAPTER.redact(trading_fees) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SettlementFees decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SettlementFees(moneyDecode, moneyDecode2, moneyDecode3, moneyDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        moneyDecode4 = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
