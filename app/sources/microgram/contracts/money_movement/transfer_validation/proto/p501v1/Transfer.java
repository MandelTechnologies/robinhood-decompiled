package microgram.contracts.money_movement.transfer_validation.proto.p501v1;

import bff_money_movement.service.p019v1.GetServiceFeeResponse;
import bff_money_movement.service.p019v1.TransferAccountType;
import bff_money_movement.service.p019v1.TransferFrequency;
import com.plaid.internal.EnumC7081g;
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
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.Transfer;
import okio.ByteString;
import rosetta.payment_hub.p540v1.service.TransferType;

/* compiled from: Transfer.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00042345Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0004H\u0016Jr\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00066"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer;", "Lcom/squareup/wire/Message;", "", "id", "", "state", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "amount", "Lcom/robinhood/rosetta/common/Money;", "source", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$Account;", "sink", "frequency", "Lbff_money_movement/service/v1/TransferFrequency;", "type", "Lrosetta/payment_hub/v1/service/TransferType;", "entry_point", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "service_fee", "Lbff_money_movement/service/v1/GetServiceFeeResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;Lcom/robinhood/rosetta/common/Money;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$Account;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$Account;Lbff_money_movement/service/v1/TransferFrequency;Lrosetta/payment_hub/v1/service/TransferType;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;Lbff_money_movement/service/v1/GetServiceFeeResponse;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getState", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getSource", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$Account;", "getSink", "getFrequency", "()Lbff_money_movement/service/v1/TransferFrequency;", "getType", "()Lrosetta/payment_hub/v1/service/TransferType;", "getEntry_point", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "getService_fee", "()Lbff_money_movement/service/v1/GetServiceFeeResponse;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "State", "Account", "EntryPoint", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class Transfer extends Message {

    @JvmField
    public static final ProtoAdapter<Transfer> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money amount;

    @WireField(adapter = "microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final EntryPoint entry_point;

    @WireField(adapter = "bff_money_movement.service.v1.TransferFrequency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final TransferFrequency frequency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "bff_money_movement.service.v1.GetServiceFeeResponse#ADAPTER", jsonName = "serviceFee", schemaIndex = 8, tag = 9)
    private final GetServiceFeeResponse service_fee;

    @WireField(adapter = "microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer$Account#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Account sink;

    @WireField(adapter = "microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer$Account#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Account source;

    @WireField(adapter = "microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final State state;

    @WireField(adapter = "rosetta.payment_hub.v1.service.TransferType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final TransferType type;

    public Transfer() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29201newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ Transfer(String str, State state, Money money, Account account, Account account2, TransferFrequency transferFrequency, TransferType transferType, EntryPoint entryPoint, GetServiceFeeResponse getServiceFeeResponse, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? State.STATE_UNSPECIFIED : state, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : account, (i & 16) != 0 ? null : account2, (i & 32) != 0 ? TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED : transferFrequency, (i & 64) != 0 ? TransferType.TRANSFER_TYPE__UNSPECIFIED : transferType, (i & 128) != 0 ? EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 256) != 0 ? null : getServiceFeeResponse, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final State getState() {
        return this.state;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Account getSource() {
        return this.source;
    }

    public final Account getSink() {
        return this.sink;
    }

    public final TransferFrequency getFrequency() {
        return this.frequency;
    }

    public final TransferType getType() {
        return this.type;
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final GetServiceFeeResponse getService_fee() {
        return this.service_fee;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer(String id, State state, Money money, Account account, Account account2, TransferFrequency frequency, TransferType type2, EntryPoint entry_point, GetServiceFeeResponse getServiceFeeResponse, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.state = state;
        this.amount = money;
        this.source = account;
        this.sink = account2;
        this.frequency = frequency;
        this.type = type2;
        this.entry_point = entry_point;
        this.service_fee = getServiceFeeResponse;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29201newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Transfer)) {
            return false;
        }
        Transfer transfer = (Transfer) other;
        return Intrinsics.areEqual(unknownFields(), transfer.unknownFields()) && Intrinsics.areEqual(this.id, transfer.id) && this.state == transfer.state && Intrinsics.areEqual(this.amount, transfer.amount) && Intrinsics.areEqual(this.source, transfer.source) && Intrinsics.areEqual(this.sink, transfer.sink) && this.frequency == transfer.frequency && this.type == transfer.type && this.entry_point == transfer.entry_point && Intrinsics.areEqual(this.service_fee, transfer.service_fee);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.state.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Account account = this.source;
        int iHashCode3 = (iHashCode2 + (account != null ? account.hashCode() : 0)) * 37;
        Account account2 = this.sink;
        int iHashCode4 = (((((((iHashCode3 + (account2 != null ? account2.hashCode() : 0)) * 37) + this.frequency.hashCode()) * 37) + this.type.hashCode()) * 37) + this.entry_point.hashCode()) * 37;
        GetServiceFeeResponse getServiceFeeResponse = this.service_fee;
        int iHashCode5 = iHashCode4 + (getServiceFeeResponse != null ? getServiceFeeResponse.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("state=" + this.state);
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        Account account = this.source;
        if (account != null) {
            arrayList.add("source=" + account);
        }
        Account account2 = this.sink;
        if (account2 != null) {
            arrayList.add("sink=" + account2);
        }
        arrayList.add("frequency=" + this.frequency);
        arrayList.add("type=" + this.type);
        arrayList.add("entry_point=" + this.entry_point);
        GetServiceFeeResponse getServiceFeeResponse = this.service_fee;
        if (getServiceFeeResponse != null) {
            arrayList.add("service_fee=" + getServiceFeeResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Transfer{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Transfer copy$default(Transfer transfer, String str, State state, Money money, Account account, Account account2, TransferFrequency transferFrequency, TransferType transferType, EntryPoint entryPoint, GetServiceFeeResponse getServiceFeeResponse, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transfer.id;
        }
        if ((i & 2) != 0) {
            state = transfer.state;
        }
        if ((i & 4) != 0) {
            money = transfer.amount;
        }
        if ((i & 8) != 0) {
            account = transfer.source;
        }
        if ((i & 16) != 0) {
            account2 = transfer.sink;
        }
        if ((i & 32) != 0) {
            transferFrequency = transfer.frequency;
        }
        if ((i & 64) != 0) {
            transferType = transfer.type;
        }
        if ((i & 128) != 0) {
            entryPoint = transfer.entry_point;
        }
        if ((i & 256) != 0) {
            getServiceFeeResponse = transfer.service_fee;
        }
        if ((i & 512) != 0) {
            byteString = transfer.unknownFields();
        }
        GetServiceFeeResponse getServiceFeeResponse2 = getServiceFeeResponse;
        ByteString byteString2 = byteString;
        TransferType transferType2 = transferType;
        EntryPoint entryPoint2 = entryPoint;
        Account account3 = account2;
        TransferFrequency transferFrequency2 = transferFrequency;
        return transfer.copy(str, state, money, account, account3, transferFrequency2, transferType2, entryPoint2, getServiceFeeResponse2, byteString2);
    }

    public final Transfer copy(String id, State state, Money amount, Account source, Account sink, TransferFrequency frequency, TransferType type2, EntryPoint entry_point, GetServiceFeeResponse service_fee, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Transfer(id, state, amount, source, sink, frequency, type2, entry_point, service_fee, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Transfer.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Transfer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Transfer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getState() != Transfer.State.STATE_UNSPECIFIED) {
                    size += Transfer.State.ADAPTER.encodedSizeWithTag(2, value.getState());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getAmount());
                }
                if (value.getSource() != null) {
                    size += Transfer.Account.ADAPTER.encodedSizeWithTag(4, value.getSource());
                }
                if (value.getSink() != null) {
                    size += Transfer.Account.ADAPTER.encodedSizeWithTag(5, value.getSink());
                }
                if (value.getFrequency() != TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED) {
                    size += TransferFrequency.ADAPTER.encodedSizeWithTag(6, value.getFrequency());
                }
                if (value.getType() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    size += TransferType.ADAPTER.encodedSizeWithTag(7, value.getType());
                }
                if (value.getEntry_point() != Transfer.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    size += Transfer.EntryPoint.ADAPTER.encodedSizeWithTag(8, value.getEntry_point());
                }
                return size + GetServiceFeeResponse.ADAPTER.encodedSizeWithTag(9, value.getService_fee());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Transfer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getState() != Transfer.State.STATE_UNSPECIFIED) {
                    Transfer.State.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (value.getSource() != null) {
                    Transfer.Account.ADAPTER.encodeWithTag(writer, 4, (int) value.getSource());
                }
                if (value.getSink() != null) {
                    Transfer.Account.ADAPTER.encodeWithTag(writer, 5, (int) value.getSink());
                }
                if (value.getFrequency() != TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED) {
                    TransferFrequency.ADAPTER.encodeWithTag(writer, 6, (int) value.getFrequency());
                }
                if (value.getType() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    TransferType.ADAPTER.encodeWithTag(writer, 7, (int) value.getType());
                }
                if (value.getEntry_point() != Transfer.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    Transfer.EntryPoint.ADAPTER.encodeWithTag(writer, 8, (int) value.getEntry_point());
                }
                GetServiceFeeResponse.ADAPTER.encodeWithTag(writer, 9, (int) value.getService_fee());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Transfer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetServiceFeeResponse.ADAPTER.encodeWithTag(writer, 9, (int) value.getService_fee());
                if (value.getEntry_point() != Transfer.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    Transfer.EntryPoint.ADAPTER.encodeWithTag(writer, 8, (int) value.getEntry_point());
                }
                if (value.getType() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    TransferType.ADAPTER.encodeWithTag(writer, 7, (int) value.getType());
                }
                if (value.getFrequency() != TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED) {
                    TransferFrequency.ADAPTER.encodeWithTag(writer, 6, (int) value.getFrequency());
                }
                if (value.getSink() != null) {
                    Transfer.Account.ADAPTER.encodeWithTag(writer, 5, (int) value.getSink());
                }
                if (value.getSource() != null) {
                    Transfer.Account.ADAPTER.encodeWithTag(writer, 4, (int) value.getSource());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (value.getState() != Transfer.State.STATE_UNSPECIFIED) {
                    Transfer.State.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Transfer decode(ProtoReader reader) throws IOException {
                Transfer.State state;
                TransferFrequency transferFrequency;
                TransferType transferType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Transfer.State state2 = Transfer.State.STATE_UNSPECIFIED;
                TransferFrequency transferFrequency2 = TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED;
                TransferType transferType2 = TransferType.TRANSFER_TYPE__UNSPECIFIED;
                Transfer.EntryPoint entryPoint = Transfer.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Transfer.Account accountDecode = null;
                Transfer.Account accountDecode2 = null;
                GetServiceFeeResponse getServiceFeeResponseDecode = null;
                String strDecode = "";
                Transfer.EntryPoint entryPointDecode = entryPoint;
                TransferType transferTypeDecode = transferType2;
                TransferFrequency transferFrequencyDecode = transferFrequency2;
                Transfer.State stateDecode = state2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                state = stateDecode;
                                transferFrequency = transferFrequencyDecode;
                                transferType = transferTypeDecode;
                                try {
                                    stateDecode = Transfer.State.ADAPTER.decode(reader);
                                    transferTypeDecode = transferType;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                transferFrequencyDecode = transferFrequency;
                                break;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                accountDecode = Transfer.Account.ADAPTER.decode(reader);
                                break;
                            case 5:
                                accountDecode2 = Transfer.Account.ADAPTER.decode(reader);
                                break;
                            case 6:
                                state = stateDecode;
                                transferFrequency = transferFrequencyDecode;
                                transferType = transferTypeDecode;
                                try {
                                    transferFrequencyDecode = TransferFrequency.ADAPTER.decode(reader);
                                    transferTypeDecode = transferType;
                                    stateDecode = state;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                state = stateDecode;
                                transferFrequency = transferFrequencyDecode;
                                try {
                                    transferTypeDecode = TransferType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    transferType = transferTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                stateDecode = state;
                                transferFrequencyDecode = transferFrequency;
                                break;
                            case 8:
                                try {
                                    entryPointDecode = Transfer.EntryPoint.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    state = stateDecode;
                                    transferFrequency = transferFrequencyDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 9:
                                getServiceFeeResponseDecode = GetServiceFeeResponse.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                state = stateDecode;
                                transferFrequency = transferFrequencyDecode;
                                transferType = transferTypeDecode;
                                transferTypeDecode = transferType;
                                stateDecode = state;
                                transferFrequencyDecode = transferFrequency;
                                break;
                        }
                    } else {
                        return new Transfer(strDecode, stateDecode, moneyDecode, accountDecode, accountDecode2, transferFrequencyDecode, transferTypeDecode, entryPointDecode, getServiceFeeResponseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Transfer redact(Transfer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Transfer.Account source = value.getSource();
                Transfer.Account accountRedact = source != null ? Transfer.Account.ADAPTER.redact(source) : null;
                Transfer.Account sink = value.getSink();
                Transfer.Account accountRedact2 = sink != null ? Transfer.Account.ADAPTER.redact(sink) : null;
                GetServiceFeeResponse service_fee = value.getService_fee();
                return Transfer.copy$default(value, null, null, moneyRedact, accountRedact, accountRedact2, null, null, null, service_fee != null ? GetServiceFeeResponse.ADAPTER.redact(service_fee) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Transfer.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "STATE_CREATE", "STATE_REVIEW", "Companion", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State STATE_CREATE;
        public static final State STATE_REVIEW;
        public static final State STATE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_UNSPECIFIED, STATE_CREATE, STATE_REVIEW};
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
            final State state = new State("STATE_UNSPECIFIED", 0, 0);
            STATE_UNSPECIFIED = state;
            STATE_CREATE = new State("STATE_CREATE", 1, 1);
            STATE_REVIEW = new State("STATE_REVIEW", 2, 2);
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer$State$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Transfer.State fromValue(int value) {
                    return Transfer.State.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Transfer.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "fromValue", "value", "", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final State fromValue(int value) {
                if (value == 0) {
                    return State.STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return State.STATE_CREATE;
                }
                if (value != 2) {
                    return null;
                }
                return State.STATE_REVIEW;
            }
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: Transfer.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$Account;", "Lcom/squareup/wire/Message;", "", "id", "", "type", "Lbff_money_movement/service/v1/TransferAccountType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/TransferAccountType;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getType", "()Lbff_money_movement/service/v1/TransferAccountType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Account extends Message {

        @JvmField
        public static final ProtoAdapter<Account> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String id;

        @WireField(adapter = "bff_money_movement.service.v1.TransferAccountType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final TransferAccountType type;

        public Account() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29202newBuilder();
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ Account(String str, TransferAccountType transferAccountType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED : transferAccountType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final TransferAccountType getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Account(String id, TransferAccountType type2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.id = id;
            this.type = type2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29202newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Account)) {
                return false;
            }
            Account account = (Account) other;
            return Intrinsics.areEqual(unknownFields(), account.unknownFields()) && Intrinsics.areEqual(this.id, account.id) && this.type == account.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.type.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("id=" + Internal.sanitize(this.id));
            arrayList.add("type=" + this.type);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Account{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Account copy$default(Account account, String str, TransferAccountType transferAccountType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = account.id;
            }
            if ((i & 2) != 0) {
                transferAccountType = account.type;
            }
            if ((i & 4) != 0) {
                byteString = account.unknownFields();
            }
            return account.copy(str, transferAccountType, byteString);
        }

        public final Account copy(String id, TransferAccountType type2, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Account(id, type2, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Account.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Account>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer$Account$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Transfer.Account value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                    }
                    return value.getType() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED ? size + TransferAccountType.ADAPTER.encodedSizeWithTag(2, value.getType()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Transfer.Account value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                    }
                    if (value.getType() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                        TransferAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Transfer.Account value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getType() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                        TransferAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (Intrinsics.areEqual(value.getId(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Transfer.Account decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    TransferAccountType transferAccountTypeDecode = TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Transfer.Account(strDecode, transferAccountTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                transferAccountTypeDecode = TransferAccountType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Transfer.Account redact(Transfer.Account value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return Transfer.Account.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Transfer.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "ENTRY_POINT_RECURRING_DEPOSIT_UPSELL", "ENTRY_POINT_RECURRING_TRANSFER_HUB", "Companion", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint ENTRY_POINT_RECURRING_DEPOSIT_UPSELL;
        public static final EntryPoint ENTRY_POINT_RECURRING_TRANSFER_HUB;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, ENTRY_POINT_RECURRING_DEPOSIT_UPSELL, ENTRY_POINT_RECURRING_TRANSFER_HUB};
        }

        @JvmStatic
        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryPoint entryPoint = new EntryPoint("ENTRY_POINT_UNSPECIFIED", 0, 0);
            ENTRY_POINT_UNSPECIFIED = entryPoint;
            ENTRY_POINT_RECURRING_DEPOSIT_UPSELL = new EntryPoint("ENTRY_POINT_RECURRING_DEPOSIT_UPSELL", 1, 1);
            ENTRY_POINT_RECURRING_TRANSFER_HUB = new EntryPoint("ENTRY_POINT_RECURRING_TRANSFER_HUB", 2, 2);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Transfer.EntryPoint fromValue(int value) {
                    return Transfer.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Transfer.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "fromValue", "value", "", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                if (value == 0) {
                    return EntryPoint.ENTRY_POINT_UNSPECIFIED;
                }
                if (value == 1) {
                    return EntryPoint.ENTRY_POINT_RECURRING_DEPOSIT_UPSELL;
                }
                if (value != 2) {
                    return null;
                }
                return EntryPoint.ENTRY_POINT_RECURRING_TRANSFER_HUB;
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}
