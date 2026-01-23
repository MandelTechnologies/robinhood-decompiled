package com.robinhood.rosetta.cashier;

import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2StateProvider2;
import com.robinhood.rosetta.cashier.ACHDepositScheduleDetails;
import com.robinhood.rosetta.common.AccountType;
import com.robinhood.rosetta.common.Date;
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

/* compiled from: ACHDepositScheduleDetails.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+,B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016JZ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails;", "Lcom/squareup/wire/Message;", "", "ach_deposit_schedule_id", "", "ach_relationship_master_id", "state", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;", "rh_account_type", "Lcom/robinhood/rosetta/common/AccountType;", "amount", "Lcom/robinhood/rosetta/common/Money;", "frequency", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "last_attempt_date", "Lcom/robinhood/rosetta/common/Date;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;Lcom/robinhood/rosetta/common/AccountType;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;Lcom/robinhood/rosetta/common/Date;Lokio/ByteString;)V", "getAch_deposit_schedule_id", "()Ljava/lang/String;", "getAch_relationship_master_id", "getState", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountType;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getFrequency", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "getLast_attempt_date", "()Lcom/robinhood/rosetta/common/Date;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "State", CreateTransferV2StateProvider2.FrequencyRowTag, "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ACHDepositScheduleDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ACHDepositScheduleDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "achDepositScheduleId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ach_deposit_schedule_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "achRelationshipMasterId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ach_relationship_master_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money amount;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHDepositScheduleDetails$Frequency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Frequency frequency;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "lastAttemptDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Date last_attempt_date;

    @WireField(adapter = "com.robinhood.rosetta.common.AccountType#ADAPTER", jsonName = "rhAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AccountType rh_account_type;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHDepositScheduleDetails$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final State state;

    public ACHDepositScheduleDetails() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ ACHDepositScheduleDetails(String str, String str2, State state, AccountType accountType, Money money, Frequency frequency, Date date, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? State.ACTIVE : state, (i & 8) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 16) != 0 ? null : money, (i & 32) != 0 ? Frequency.WEEKLY : frequency, (i & 64) != 0 ? null : date, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23953newBuilder();
    }

    public final String getAch_deposit_schedule_id() {
        return this.ach_deposit_schedule_id;
    }

    public final String getAch_relationship_master_id() {
        return this.ach_relationship_master_id;
    }

    public final State getState() {
        return this.state;
    }

    public final AccountType getRh_account_type() {
        return this.rh_account_type;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Frequency getFrequency() {
        return this.frequency;
    }

    public final Date getLast_attempt_date() {
        return this.last_attempt_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ACHDepositScheduleDetails(String ach_deposit_schedule_id, String ach_relationship_master_id, State state, AccountType rh_account_type, Money money, Frequency frequency, Date date, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ach_deposit_schedule_id, "ach_deposit_schedule_id");
        Intrinsics.checkNotNullParameter(ach_relationship_master_id, "ach_relationship_master_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ach_deposit_schedule_id = ach_deposit_schedule_id;
        this.ach_relationship_master_id = ach_relationship_master_id;
        this.state = state;
        this.rh_account_type = rh_account_type;
        this.amount = money;
        this.frequency = frequency;
        this.last_attempt_date = date;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23953newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ACHDepositScheduleDetails)) {
            return false;
        }
        ACHDepositScheduleDetails aCHDepositScheduleDetails = (ACHDepositScheduleDetails) other;
        return Intrinsics.areEqual(unknownFields(), aCHDepositScheduleDetails.unknownFields()) && Intrinsics.areEqual(this.ach_deposit_schedule_id, aCHDepositScheduleDetails.ach_deposit_schedule_id) && Intrinsics.areEqual(this.ach_relationship_master_id, aCHDepositScheduleDetails.ach_relationship_master_id) && this.state == aCHDepositScheduleDetails.state && this.rh_account_type == aCHDepositScheduleDetails.rh_account_type && Intrinsics.areEqual(this.amount, aCHDepositScheduleDetails.amount) && this.frequency == aCHDepositScheduleDetails.frequency && Intrinsics.areEqual(this.last_attempt_date, aCHDepositScheduleDetails.last_attempt_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.ach_deposit_schedule_id.hashCode()) * 37) + this.ach_relationship_master_id.hashCode()) * 37) + this.state.hashCode()) * 37) + this.rh_account_type.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.frequency.hashCode()) * 37;
        Date date = this.last_attempt_date;
        int iHashCode3 = iHashCode2 + (date != null ? date.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ach_deposit_schedule_id=" + Internal.sanitize(this.ach_deposit_schedule_id));
        arrayList.add("ach_relationship_master_id=" + Internal.sanitize(this.ach_relationship_master_id));
        arrayList.add("state=" + this.state);
        arrayList.add("rh_account_type=" + this.rh_account_type);
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("frequency=" + this.frequency);
        Date date = this.last_attempt_date;
        if (date != null) {
            arrayList.add("last_attempt_date=" + date);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ACHDepositScheduleDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ACHDepositScheduleDetails copy$default(ACHDepositScheduleDetails aCHDepositScheduleDetails, String str, String str2, State state, AccountType accountType, Money money, Frequency frequency, Date date, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aCHDepositScheduleDetails.ach_deposit_schedule_id;
        }
        if ((i & 2) != 0) {
            str2 = aCHDepositScheduleDetails.ach_relationship_master_id;
        }
        if ((i & 4) != 0) {
            state = aCHDepositScheduleDetails.state;
        }
        if ((i & 8) != 0) {
            accountType = aCHDepositScheduleDetails.rh_account_type;
        }
        if ((i & 16) != 0) {
            money = aCHDepositScheduleDetails.amount;
        }
        if ((i & 32) != 0) {
            frequency = aCHDepositScheduleDetails.frequency;
        }
        if ((i & 64) != 0) {
            date = aCHDepositScheduleDetails.last_attempt_date;
        }
        if ((i & 128) != 0) {
            byteString = aCHDepositScheduleDetails.unknownFields();
        }
        Date date2 = date;
        ByteString byteString2 = byteString;
        Money money2 = money;
        Frequency frequency2 = frequency;
        return aCHDepositScheduleDetails.copy(str, str2, state, accountType, money2, frequency2, date2, byteString2);
    }

    public final ACHDepositScheduleDetails copy(String ach_deposit_schedule_id, String ach_relationship_master_id, State state, AccountType rh_account_type, Money amount, Frequency frequency, Date last_attempt_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ach_deposit_schedule_id, "ach_deposit_schedule_id");
        Intrinsics.checkNotNullParameter(ach_relationship_master_id, "ach_relationship_master_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ACHDepositScheduleDetails(ach_deposit_schedule_id, ach_relationship_master_id, state, rh_account_type, amount, frequency, last_attempt_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ACHDepositScheduleDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ACHDepositScheduleDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.ACHDepositScheduleDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ACHDepositScheduleDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAch_deposit_schedule_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAch_deposit_schedule_id());
                }
                if (!Intrinsics.areEqual(value.getAch_relationship_master_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAch_relationship_master_id());
                }
                if (value.getState() != ACHDepositScheduleDetails.State.ACTIVE) {
                    size += ACHDepositScheduleDetails.State.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += AccountType.ADAPTER.encodedSizeWithTag(4, value.getRh_account_type());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getAmount());
                }
                if (value.getFrequency() != ACHDepositScheduleDetails.Frequency.WEEKLY) {
                    size += ACHDepositScheduleDetails.Frequency.ADAPTER.encodedSizeWithTag(6, value.getFrequency());
                }
                return value.getLast_attempt_date() != null ? size + Date.ADAPTER.encodedSizeWithTag(7, value.getLast_attempt_date()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ACHDepositScheduleDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAch_deposit_schedule_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAch_deposit_schedule_id());
                }
                if (!Intrinsics.areEqual(value.getAch_relationship_master_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAch_relationship_master_id());
                }
                if (value.getState() != ACHDepositScheduleDetails.State.ACTIVE) {
                    ACHDepositScheduleDetails.State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 4, (int) value.getRh_account_type());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getAmount());
                }
                if (value.getFrequency() != ACHDepositScheduleDetails.Frequency.WEEKLY) {
                    ACHDepositScheduleDetails.Frequency.ADAPTER.encodeWithTag(writer, 6, (int) value.getFrequency());
                }
                if (value.getLast_attempt_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 7, (int) value.getLast_attempt_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ACHDepositScheduleDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLast_attempt_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 7, (int) value.getLast_attempt_date());
                }
                if (value.getFrequency() != ACHDepositScheduleDetails.Frequency.WEEKLY) {
                    ACHDepositScheduleDetails.Frequency.ADAPTER.encodeWithTag(writer, 6, (int) value.getFrequency());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getAmount());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 4, (int) value.getRh_account_type());
                }
                if (value.getState() != ACHDepositScheduleDetails.State.ACTIVE) {
                    ACHDepositScheduleDetails.State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getAch_relationship_master_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAch_relationship_master_id());
                }
                if (Intrinsics.areEqual(value.getAch_deposit_schedule_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAch_deposit_schedule_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ACHDepositScheduleDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ACHDepositScheduleDetails.State stateDecode = ACHDepositScheduleDetails.State.ACTIVE;
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                ACHDepositScheduleDetails.Frequency frequency = ACHDepositScheduleDetails.Frequency.WEEKLY;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                Date dateDecode = null;
                ACHDepositScheduleDetails.Frequency frequencyDecode = frequency;
                String strDecode2 = strDecode;
                AccountType accountTypeDecode = accountType;
                while (true) {
                    ACHDepositScheduleDetails.State state = stateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    try {
                                        stateDecode = ACHDepositScheduleDetails.State.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        accountTypeDecode = AccountType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    moneyDecode = Money.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        frequencyDecode = ACHDepositScheduleDetails.Frequency.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 7:
                                    dateDecode = Date.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ACHDepositScheduleDetails(strDecode2, strDecode, state, accountTypeDecode, moneyDecode, frequencyDecode, dateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ACHDepositScheduleDetails redact(ACHDepositScheduleDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Date last_attempt_date = value.getLast_attempt_date();
                return ACHDepositScheduleDetails.copy$default(value, null, null, null, null, moneyRedact, null, last_attempt_date != null ? Date.ADAPTER.redact(last_attempt_date) : null, ByteString.EMPTY, 47, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHDepositScheduleDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACTIVE", "INACTIVE", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ACTIVE;

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State INACTIVE;
        private final int value;

        private static final /* synthetic */ State[] $values() {
            return new State[]{ACTIVE, INACTIVE};
        }

        @JvmStatic
        public static final State fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final State state = new State("ACTIVE", 0, 0);
            ACTIVE = state;
            INACTIVE = new State("INACTIVE", 1, 1);
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: com.robinhood.rosetta.cashier.ACHDepositScheduleDetails$State$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHDepositScheduleDetails.State fromValue(int value) {
                    return ACHDepositScheduleDetails.State.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHDepositScheduleDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$State;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final State fromValue(int value) {
                if (value == 0) {
                    return State.ACTIVE;
                }
                if (value != 1) {
                    return null;
                }
                return State.INACTIVE;
            }
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHDepositScheduleDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WEEKLY", "BIWEEKLY", "MONTHLY", "QUARTERLY", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Frequency implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Frequency[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Frequency> ADAPTER;
        public static final Frequency BIWEEKLY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Frequency MONTHLY;
        public static final Frequency QUARTERLY;
        public static final Frequency WEEKLY;
        private final int value;

        private static final /* synthetic */ Frequency[] $values() {
            return new Frequency[]{WEEKLY, BIWEEKLY, MONTHLY, QUARTERLY};
        }

        @JvmStatic
        public static final Frequency fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Frequency> getEntries() {
            return $ENTRIES;
        }

        private Frequency(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Frequency frequency = new Frequency("WEEKLY", 0, 0);
            WEEKLY = frequency;
            BIWEEKLY = new Frequency("BIWEEKLY", 1, 1);
            MONTHLY = new Frequency("MONTHLY", 2, 2);
            QUARTERLY = new Frequency("QUARTERLY", 3, 3);
            Frequency[] frequencyArr$values = $values();
            $VALUES = frequencyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(frequencyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Frequency.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Frequency>(orCreateKotlinClass, syntax, frequency) { // from class: com.robinhood.rosetta.cashier.ACHDepositScheduleDetails$Frequency$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHDepositScheduleDetails.Frequency fromValue(int value) {
                    return ACHDepositScheduleDetails.Frequency.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHDepositScheduleDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails$Frequency;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Frequency fromValue(int value) {
                if (value == 0) {
                    return Frequency.WEEKLY;
                }
                if (value == 1) {
                    return Frequency.BIWEEKLY;
                }
                if (value == 2) {
                    return Frequency.MONTHLY;
                }
                if (value != 3) {
                    return null;
                }
                return Frequency.QUARTERLY;
            }
        }

        public static Frequency valueOf(String str) {
            return (Frequency) Enum.valueOf(Frequency.class, str);
        }

        public static Frequency[] values() {
            return (Frequency[]) $VALUES.clone();
        }
    }
}
