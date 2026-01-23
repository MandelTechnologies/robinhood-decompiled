package com.robinhood.rosetta.cashier;

import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
import com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetails;
import com.robinhood.rosetta.common.Money;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CheckoutCardDisputeFeeDetails.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails;", "Lcom/squareup/wire/Message;", "", "type", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "original_amount", "Lcom/robinhood/rosetta/common/Money;", "settle_amount", "brokerage_accounting_details", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lokio/ByteString;)V", "getType", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "getOriginal_amount", "()Lcom/robinhood/rosetta/common/Money;", "getSettle_amount", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CheckoutCardDisputeFeeType", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CheckoutCardDisputeFeeDetails extends Message {

    @JvmField
    public static final ProtoAdapter<CheckoutCardDisputeFeeDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.BrokerageAccountingDetails#ADAPTER", jsonName = "brokerageAccountingDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 11)
    private final BrokerageAccountingDetails brokerage_accounting_details;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "originalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money original_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "settleAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money settle_amount;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CheckoutCardDisputeFeeType type;

    public CheckoutCardDisputeFeeDetails() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23964newBuilder();
    }

    public final CheckoutCardDisputeFeeType getType() {
        return this.type;
    }

    public /* synthetic */ CheckoutCardDisputeFeeDetails(CheckoutCardDisputeFeeType checkoutCardDisputeFeeType, Money money, Money money2, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CheckoutCardDisputeFeeType.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED : checkoutCardDisputeFeeType, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? null : brokerageAccountingDetails, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Money getOriginal_amount() {
        return this.original_amount;
    }

    public final Money getSettle_amount() {
        return this.settle_amount;
    }

    public final BrokerageAccountingDetails getBrokerage_accounting_details() {
        return this.brokerage_accounting_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCardDisputeFeeDetails(CheckoutCardDisputeFeeType type2, Money money, Money money2, BrokerageAccountingDetails brokerageAccountingDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.original_amount = money;
        this.settle_amount = money2;
        this.brokerage_accounting_details = brokerageAccountingDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23964newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CheckoutCardDisputeFeeDetails)) {
            return false;
        }
        CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails = (CheckoutCardDisputeFeeDetails) other;
        return Intrinsics.areEqual(unknownFields(), checkoutCardDisputeFeeDetails.unknownFields()) && this.type == checkoutCardDisputeFeeDetails.type && Intrinsics.areEqual(this.original_amount, checkoutCardDisputeFeeDetails.original_amount) && Intrinsics.areEqual(this.settle_amount, checkoutCardDisputeFeeDetails.settle_amount) && Intrinsics.areEqual(this.brokerage_accounting_details, checkoutCardDisputeFeeDetails.brokerage_accounting_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37;
        Money money = this.original_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.settle_amount;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        int iHashCode4 = iHashCode3 + (brokerageAccountingDetails != null ? brokerageAccountingDetails.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        Money money = this.original_amount;
        if (money != null) {
            arrayList.add("original_amount=" + money);
        }
        Money money2 = this.settle_amount;
        if (money2 != null) {
            arrayList.add("settle_amount=" + money2);
        }
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        if (brokerageAccountingDetails != null) {
            arrayList.add("brokerage_accounting_details=" + brokerageAccountingDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckoutCardDisputeFeeDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CheckoutCardDisputeFeeDetails copy$default(CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails, CheckoutCardDisputeFeeType checkoutCardDisputeFeeType, Money money, Money money2, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutCardDisputeFeeType = checkoutCardDisputeFeeDetails.type;
        }
        if ((i & 2) != 0) {
            money = checkoutCardDisputeFeeDetails.original_amount;
        }
        if ((i & 4) != 0) {
            money2 = checkoutCardDisputeFeeDetails.settle_amount;
        }
        if ((i & 8) != 0) {
            brokerageAccountingDetails = checkoutCardDisputeFeeDetails.brokerage_accounting_details;
        }
        if ((i & 16) != 0) {
            byteString = checkoutCardDisputeFeeDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        Money money3 = money2;
        return checkoutCardDisputeFeeDetails.copy(checkoutCardDisputeFeeType, money, money3, brokerageAccountingDetails, byteString2);
    }

    public final CheckoutCardDisputeFeeDetails copy(CheckoutCardDisputeFeeType type2, Money original_amount, Money settle_amount, BrokerageAccountingDetails brokerage_accounting_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CheckoutCardDisputeFeeDetails(type2, original_amount, settle_amount, brokerage_accounting_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardDisputeFeeDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CheckoutCardDisputeFeeDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CheckoutCardDisputeFeeDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED) {
                    size += CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                if (value.getOriginal_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getOriginal_amount());
                }
                if (value.getSettle_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getSettle_amount());
                }
                return value.getBrokerage_accounting_details() != null ? size + BrokerageAccountingDetails.ADAPTER.encodedSizeWithTag(11, value.getBrokerage_accounting_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CheckoutCardDisputeFeeDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED) {
                    CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (value.getOriginal_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getOriginal_amount());
                }
                if (value.getSettle_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getSettle_amount());
                }
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CheckoutCardDisputeFeeDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                if (value.getSettle_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getSettle_amount());
                }
                if (value.getOriginal_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getOriginal_amount());
                }
                if (value.getType() != CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED) {
                    CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardDisputeFeeDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType checkoutCardDisputeFeeTypeDecode = CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                BrokerageAccountingDetails brokerageAccountingDetailsDecode = null;
                while (true) {
                    CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType checkoutCardDisputeFeeType = checkoutCardDisputeFeeTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CheckoutCardDisputeFeeDetails(checkoutCardDisputeFeeType, moneyDecode, moneyDecode2, brokerageAccountingDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                checkoutCardDisputeFeeTypeDecode = CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            moneyDecode = Money.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            moneyDecode2 = Money.ADAPTER.decode(reader);
                        } else if (iNextTag == 11) {
                            brokerageAccountingDetailsDecode = BrokerageAccountingDetails.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardDisputeFeeDetails redact(CheckoutCardDisputeFeeDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money original_amount = value.getOriginal_amount();
                Money moneyRedact = original_amount != null ? Money.ADAPTER.redact(original_amount) : null;
                Money settle_amount = value.getSettle_amount();
                Money moneyRedact2 = settle_amount != null ? Money.ADAPTER.redact(settle_amount) : null;
                BrokerageAccountingDetails brokerage_accounting_details = value.getBrokerage_accounting_details();
                return CheckoutCardDisputeFeeDetails.copy$default(value, null, moneyRedact, moneyRedact2, brokerage_accounting_details != null ? BrokerageAccountingDetails.ADAPTER.redact(brokerage_accounting_details) : null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardDisputeFeeDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED", "CHARGEBACK_FEE", "SCHEME_CHARGEBACK_FIXED_FEE", "SCHEME_CHARGEBACK_VARIABLE_FEE", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckoutCardDisputeFeeType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardDisputeFeeType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CheckoutCardDisputeFeeType> ADAPTER;
        public static final CheckoutCardDisputeFeeType CHARGEBACK_FEE;
        public static final CheckoutCardDisputeFeeType CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CheckoutCardDisputeFeeType SCHEME_CHARGEBACK_FIXED_FEE;
        public static final CheckoutCardDisputeFeeType SCHEME_CHARGEBACK_VARIABLE_FEE;
        private final int value;

        private static final /* synthetic */ CheckoutCardDisputeFeeType[] $values() {
            return new CheckoutCardDisputeFeeType[]{CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED, CHARGEBACK_FEE, SCHEME_CHARGEBACK_FIXED_FEE, SCHEME_CHARGEBACK_VARIABLE_FEE};
        }

        @JvmStatic
        public static final CheckoutCardDisputeFeeType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CheckoutCardDisputeFeeType> getEntries() {
            return $ENTRIES;
        }

        private CheckoutCardDisputeFeeType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CheckoutCardDisputeFeeType checkoutCardDisputeFeeType = new CheckoutCardDisputeFeeType("CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED", 0, 0);
            CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED = checkoutCardDisputeFeeType;
            CHARGEBACK_FEE = new CheckoutCardDisputeFeeType("CHARGEBACK_FEE", 1, 1);
            SCHEME_CHARGEBACK_FIXED_FEE = new CheckoutCardDisputeFeeType("SCHEME_CHARGEBACK_FIXED_FEE", 2, 2);
            SCHEME_CHARGEBACK_VARIABLE_FEE = new CheckoutCardDisputeFeeType("SCHEME_CHARGEBACK_VARIABLE_FEE", 3, 3);
            CheckoutCardDisputeFeeType[] checkoutCardDisputeFeeTypeArr$values = $values();
            $VALUES = checkoutCardDisputeFeeTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardDisputeFeeTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardDisputeFeeType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CheckoutCardDisputeFeeType>(orCreateKotlinClass, syntax, checkoutCardDisputeFeeType) { // from class: com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType fromValue(int value) {
                    return CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CheckoutCardDisputeFeeDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CheckoutCardDisputeFeeType fromValue(int value) {
                if (value == 0) {
                    return CheckoutCardDisputeFeeType.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CheckoutCardDisputeFeeType.CHARGEBACK_FEE;
                }
                if (value == 2) {
                    return CheckoutCardDisputeFeeType.SCHEME_CHARGEBACK_FIXED_FEE;
                }
                if (value != 3) {
                    return null;
                }
                return CheckoutCardDisputeFeeType.SCHEME_CHARGEBACK_VARIABLE_FEE;
            }
        }

        public static CheckoutCardDisputeFeeType valueOf(String str) {
            return (CheckoutCardDisputeFeeType) Enum.valueOf(CheckoutCardDisputeFeeType.class, str);
        }

        public static CheckoutCardDisputeFeeType[] values() {
            return (CheckoutCardDisputeFeeType[]) $VALUES.clone();
        }
    }
}
