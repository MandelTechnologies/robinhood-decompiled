package com.robinhood.rosetta.cashier;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.cashier.BankBalanceDetails;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.RHEntity;
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
import com.squareup.wire.internal.Internal;
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

/* compiled from: BankBalanceDetails.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetails;", "Lcom/squareup/wire/Message;", "", "ach_relationship_id", "", "available_balance", "Lcom/robinhood/rosetta/common/Money;", "present_balance", "ach_transfer_id", "source", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "entity", "Lcom/robinhood/rosetta/common/RHEntity;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;Lcom/robinhood/rosetta/common/RHEntity;Lokio/ByteString;)V", "getAch_relationship_id", "()Ljava/lang/String;", "getAvailable_balance", "()Lcom/robinhood/rosetta/common/Money;", "getPresent_balance", "getAch_transfer_id", "getSource", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "getEntity", "()Lcom/robinhood/rosetta/common/RHEntity;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Source", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BankBalanceDetails extends Message {

    @JvmField
    public static final ProtoAdapter<BankBalanceDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "achRelationshipId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ach_relationship_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "achTransferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String ach_transfer_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "availableBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money available_balance;

    @WireField(adapter = "com.robinhood.rosetta.common.RHEntity#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final RHEntity entity;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "presentBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money present_balance;

    @WireField(adapter = "com.robinhood.rosetta.cashier.BankBalanceDetails$Source#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Source source;

    public BankBalanceDetails() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ BankBalanceDetails(String str, Money money, Money money2, String str2, Source source, RHEntity rHEntity, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? Source.OTHER : source, (i & 32) != 0 ? RHEntity.ENTITY_TYPE_UNSPECIFIED : rHEntity, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23961newBuilder();
    }

    public final String getAch_relationship_id() {
        return this.ach_relationship_id;
    }

    public final Money getAvailable_balance() {
        return this.available_balance;
    }

    public final Money getPresent_balance() {
        return this.present_balance;
    }

    public final String getAch_transfer_id() {
        return this.ach_transfer_id;
    }

    public final Source getSource() {
        return this.source;
    }

    public final RHEntity getEntity() {
        return this.entity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankBalanceDetails(String ach_relationship_id, Money money, Money money2, String ach_transfer_id, Source source, RHEntity entity, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
        Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ach_relationship_id = ach_relationship_id;
        this.available_balance = money;
        this.present_balance = money2;
        this.ach_transfer_id = ach_transfer_id;
        this.source = source;
        this.entity = entity;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23961newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BankBalanceDetails)) {
            return false;
        }
        BankBalanceDetails bankBalanceDetails = (BankBalanceDetails) other;
        return Intrinsics.areEqual(unknownFields(), bankBalanceDetails.unknownFields()) && Intrinsics.areEqual(this.ach_relationship_id, bankBalanceDetails.ach_relationship_id) && Intrinsics.areEqual(this.available_balance, bankBalanceDetails.available_balance) && Intrinsics.areEqual(this.present_balance, bankBalanceDetails.present_balance) && Intrinsics.areEqual(this.ach_transfer_id, bankBalanceDetails.ach_transfer_id) && this.source == bankBalanceDetails.source && this.entity == bankBalanceDetails.entity;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.ach_relationship_id.hashCode()) * 37;
        Money money = this.available_balance;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.present_balance;
        int iHashCode3 = ((((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.ach_transfer_id.hashCode()) * 37) + this.source.hashCode()) * 37) + this.entity.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ach_relationship_id=" + Internal.sanitize(this.ach_relationship_id));
        Money money = this.available_balance;
        if (money != null) {
            arrayList.add("available_balance=" + money);
        }
        Money money2 = this.present_balance;
        if (money2 != null) {
            arrayList.add("present_balance=" + money2);
        }
        arrayList.add("ach_transfer_id=" + Internal.sanitize(this.ach_transfer_id));
        arrayList.add("source=" + this.source);
        arrayList.add("entity=" + this.entity);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BankBalanceDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BankBalanceDetails copy$default(BankBalanceDetails bankBalanceDetails, String str, Money money, Money money2, String str2, Source source, RHEntity rHEntity, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankBalanceDetails.ach_relationship_id;
        }
        if ((i & 2) != 0) {
            money = bankBalanceDetails.available_balance;
        }
        if ((i & 4) != 0) {
            money2 = bankBalanceDetails.present_balance;
        }
        if ((i & 8) != 0) {
            str2 = bankBalanceDetails.ach_transfer_id;
        }
        if ((i & 16) != 0) {
            source = bankBalanceDetails.source;
        }
        if ((i & 32) != 0) {
            rHEntity = bankBalanceDetails.entity;
        }
        if ((i & 64) != 0) {
            byteString = bankBalanceDetails.unknownFields();
        }
        RHEntity rHEntity2 = rHEntity;
        ByteString byteString2 = byteString;
        Source source2 = source;
        Money money3 = money2;
        return bankBalanceDetails.copy(str, money, money3, str2, source2, rHEntity2, byteString2);
    }

    public final BankBalanceDetails copy(String ach_relationship_id, Money available_balance, Money present_balance, String ach_transfer_id, Source source, RHEntity entity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ach_relationship_id, "ach_relationship_id");
        Intrinsics.checkNotNullParameter(ach_transfer_id, "ach_transfer_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BankBalanceDetails(ach_relationship_id, available_balance, present_balance, ach_transfer_id, source, entity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BankBalanceDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BankBalanceDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.BankBalanceDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BankBalanceDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAch_relationship_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAch_relationship_id());
                }
                if (value.getAvailable_balance() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getAvailable_balance());
                }
                if (value.getPresent_balance() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getPresent_balance());
                }
                if (!Intrinsics.areEqual(value.getAch_transfer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAch_transfer_id());
                }
                if (value.getSource() != BankBalanceDetails.Source.OTHER) {
                    size += BankBalanceDetails.Source.ADAPTER.encodedSizeWithTag(5, value.getSource());
                }
                return value.getEntity() != RHEntity.ENTITY_TYPE_UNSPECIFIED ? size + RHEntity.ADAPTER.encodedSizeWithTag(6, value.getEntity()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BankBalanceDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAch_relationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAch_relationship_id());
                }
                if (value.getAvailable_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAvailable_balance());
                }
                if (value.getPresent_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getPresent_balance());
                }
                if (!Intrinsics.areEqual(value.getAch_transfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAch_transfer_id());
                }
                if (value.getSource() != BankBalanceDetails.Source.OTHER) {
                    BankBalanceDetails.Source.ADAPTER.encodeWithTag(writer, 5, (int) value.getSource());
                }
                if (value.getEntity() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    RHEntity.ADAPTER.encodeWithTag(writer, 6, (int) value.getEntity());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BankBalanceDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEntity() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    RHEntity.ADAPTER.encodeWithTag(writer, 6, (int) value.getEntity());
                }
                if (value.getSource() != BankBalanceDetails.Source.OTHER) {
                    BankBalanceDetails.Source.ADAPTER.encodeWithTag(writer, 5, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getAch_transfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAch_transfer_id());
                }
                if (value.getPresent_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getPresent_balance());
                }
                if (value.getAvailable_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAvailable_balance());
                }
                if (Intrinsics.areEqual(value.getAch_relationship_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAch_relationship_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BankBalanceDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BankBalanceDetails.Source sourceDecode = BankBalanceDetails.Source.OTHER;
                RHEntity rHEntity = RHEntity.ENTITY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                RHEntity rHEntityDecode = rHEntity;
                String strDecode2 = strDecode;
                while (true) {
                    BankBalanceDetails.Source source = sourceDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    moneyDecode = Money.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    moneyDecode2 = Money.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        sourceDecode = BankBalanceDetails.Source.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        rHEntityDecode = RHEntity.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new BankBalanceDetails(strDecode2, moneyDecode, moneyDecode2, strDecode, source, rHEntityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BankBalanceDetails redact(BankBalanceDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money available_balance = value.getAvailable_balance();
                Money moneyRedact = available_balance != null ? Money.ADAPTER.redact(available_balance) : null;
                Money present_balance = value.getPresent_balance();
                return BankBalanceDetails.copy$default(value, null, moneyRedact, present_balance != null ? Money.ADAPTER.redact(present_balance) : null, null, null, null, ByteString.EMPTY, 57, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BankBalanceDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OTHER", "ASYNC_RUNNER", "BANK_LINK", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Source implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Source> ADAPTER;
        public static final Source ASYNC_RUNNER;
        public static final Source BANK_LINK;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Source OTHER;
        private final int value;

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{OTHER, ASYNC_RUNNER, BANK_LINK};
        }

        @JvmStatic
        public static final Source fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Source source = new Source("OTHER", 0, 0);
            OTHER = source;
            ASYNC_RUNNER = new Source("ASYNC_RUNNER", 1, 1);
            BANK_LINK = new Source("BANK_LINK", 2, 2);
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Source>(orCreateKotlinClass, syntax, source) { // from class: com.robinhood.rosetta.cashier.BankBalanceDetails$Source$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public BankBalanceDetails.Source fromValue(int value) {
                    return BankBalanceDetails.Source.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: BankBalanceDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails$Source;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Source fromValue(int value) {
                if (value == 0) {
                    return Source.OTHER;
                }
                if (value == 1) {
                    return Source.ASYNC_RUNNER;
                }
                if (value != 2) {
                    return null;
                }
                return Source.BANK_LINK;
            }
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }
}
