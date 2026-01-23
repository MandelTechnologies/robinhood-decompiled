package com.robinhood.rosetta.brokerage;

import com.robinhood.rosetta.common.Money;
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
import p479j$.time.Instant;

/* compiled from: CashLimitation.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BG\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u001fR\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashLimitation;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/common/Money;", "amount_held_from_buying_power", "amount_held_from_withdrawable_cash", "amount_held_from_portfolio_cash", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "automatic_release_datetime", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/rosetta/brokerage/CashLimitation;", "Lcom/robinhood/rosetta/common/Money;", "getAmount_held_from_buying_power", "()Lcom/robinhood/rosetta/common/Money;", "getAmount_held_from_withdrawable_cash", "getAmount_held_from_portfolio_cash", "Lj$/time/Instant;", "getAutomatic_release_datetime", "()Lj$/time/Instant;", "Companion", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CashLimitation extends Message {

    @JvmField
    public static final ProtoAdapter<CashLimitation> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "amountHeldFromBuyingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money amount_held_from_buying_power;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "amountHeldFromPortfolioCash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money amount_held_from_portfolio_cash;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "amountHeldFromWithdrawableCash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money amount_held_from_withdrawable_cash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "automaticReleaseDatetime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant automatic_release_datetime;

    public CashLimitation() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23950newBuilder();
    }

    public final Money getAmount_held_from_buying_power() {
        return this.amount_held_from_buying_power;
    }

    public final Money getAmount_held_from_withdrawable_cash() {
        return this.amount_held_from_withdrawable_cash;
    }

    public final Money getAmount_held_from_portfolio_cash() {
        return this.amount_held_from_portfolio_cash;
    }

    public final Instant getAutomatic_release_datetime() {
        return this.automatic_release_datetime;
    }

    public /* synthetic */ CashLimitation(Money money, Money money2, Money money3, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLimitation(Money money, Money money2, Money money3, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.amount_held_from_buying_power = money;
        this.amount_held_from_withdrawable_cash = money2;
        this.amount_held_from_portfolio_cash = money3;
        this.automatic_release_datetime = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23950newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CashLimitation)) {
            return false;
        }
        CashLimitation cashLimitation = (CashLimitation) other;
        return Intrinsics.areEqual(unknownFields(), cashLimitation.unknownFields()) && Intrinsics.areEqual(this.amount_held_from_buying_power, cashLimitation.amount_held_from_buying_power) && Intrinsics.areEqual(this.amount_held_from_withdrawable_cash, cashLimitation.amount_held_from_withdrawable_cash) && Intrinsics.areEqual(this.amount_held_from_portfolio_cash, cashLimitation.amount_held_from_portfolio_cash) && Intrinsics.areEqual(this.automatic_release_datetime, cashLimitation.automatic_release_datetime);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.amount_held_from_buying_power;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.amount_held_from_withdrawable_cash;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.amount_held_from_portfolio_cash;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Instant instant = this.automatic_release_datetime;
        int iHashCode5 = iHashCode4 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount_held_from_buying_power;
        if (money != null) {
            arrayList.add("amount_held_from_buying_power=" + money);
        }
        Money money2 = this.amount_held_from_withdrawable_cash;
        if (money2 != null) {
            arrayList.add("amount_held_from_withdrawable_cash=" + money2);
        }
        Money money3 = this.amount_held_from_portfolio_cash;
        if (money3 != null) {
            arrayList.add("amount_held_from_portfolio_cash=" + money3);
        }
        Instant instant = this.automatic_release_datetime;
        if (instant != null) {
            arrayList.add("automatic_release_datetime=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLimitation{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CashLimitation copy$default(CashLimitation cashLimitation, Money money, Money money2, Money money3, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = cashLimitation.amount_held_from_buying_power;
        }
        if ((i & 2) != 0) {
            money2 = cashLimitation.amount_held_from_withdrawable_cash;
        }
        if ((i & 4) != 0) {
            money3 = cashLimitation.amount_held_from_portfolio_cash;
        }
        if ((i & 8) != 0) {
            instant = cashLimitation.automatic_release_datetime;
        }
        if ((i & 16) != 0) {
            byteString = cashLimitation.unknownFields();
        }
        ByteString byteString2 = byteString;
        Money money4 = money3;
        return cashLimitation.copy(money, money2, money4, instant, byteString2);
    }

    public final CashLimitation copy(Money amount_held_from_buying_power, Money amount_held_from_withdrawable_cash, Money amount_held_from_portfolio_cash, Instant automatic_release_datetime, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CashLimitation(amount_held_from_buying_power, amount_held_from_withdrawable_cash, amount_held_from_portfolio_cash, automatic_release_datetime, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashLimitation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CashLimitation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.brokerage.CashLimitation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CashLimitation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAmount_held_from_buying_power() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getAmount_held_from_buying_power());
                }
                if (value.getAmount_held_from_withdrawable_cash() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getAmount_held_from_withdrawable_cash());
                }
                if (value.getAmount_held_from_portfolio_cash() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getAmount_held_from_portfolio_cash());
                }
                return value.getAutomatic_release_datetime() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getAutomatic_release_datetime()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CashLimitation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAmount_held_from_buying_power() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getAmount_held_from_buying_power());
                }
                if (value.getAmount_held_from_withdrawable_cash() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount_held_from_withdrawable_cash());
                }
                if (value.getAmount_held_from_portfolio_cash() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount_held_from_portfolio_cash());
                }
                if (value.getAutomatic_release_datetime() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getAutomatic_release_datetime());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CashLimitation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAutomatic_release_datetime() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getAutomatic_release_datetime());
                }
                if (value.getAmount_held_from_portfolio_cash() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount_held_from_portfolio_cash());
                }
                if (value.getAmount_held_from_withdrawable_cash() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount_held_from_withdrawable_cash());
                }
                if (value.getAmount_held_from_buying_power() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getAmount_held_from_buying_power());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CashLimitation redact(CashLimitation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount_held_from_buying_power = value.getAmount_held_from_buying_power();
                Money moneyRedact = amount_held_from_buying_power != null ? Money.ADAPTER.redact(amount_held_from_buying_power) : null;
                Money amount_held_from_withdrawable_cash = value.getAmount_held_from_withdrawable_cash();
                Money moneyRedact2 = amount_held_from_withdrawable_cash != null ? Money.ADAPTER.redact(amount_held_from_withdrawable_cash) : null;
                Money amount_held_from_portfolio_cash = value.getAmount_held_from_portfolio_cash();
                Money moneyRedact3 = amount_held_from_portfolio_cash != null ? Money.ADAPTER.redact(amount_held_from_portfolio_cash) : null;
                Instant automatic_release_datetime = value.getAutomatic_release_datetime();
                return value.copy(moneyRedact, moneyRedact2, moneyRedact3, automatic_release_datetime != null ? ProtoAdapter.INSTANT.redact(automatic_release_datetime) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CashLimitation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CashLimitation(moneyDecode, moneyDecode2, moneyDecode3, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
