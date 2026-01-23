package bonfire.proto.idl.windsor.p041v1;

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
import p479j$.time.Instant;
import windsor.transactions.p552v1.IsaCashTransferDetail;
import windsor.transactions.p552v1.TransactionDirection;
import windsor.transactions.p552v1.TransactionState;
import windsor.transactions.p552v1.TransferType;

/* compiled from: Transfer.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB\u0093\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u0099\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010&R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010$R\"\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0013\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b=\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/Transfer;", "Lcom/squareup/wire/Message;", "", "", "id", "account_number", "Lcom/robinhood/rosetta/common/Money;", "amount", "Lwindsor/transactions/v1/TransactionDirection;", "direction", "Lwindsor/transactions/v1/TransactionState;", "state", "Lwindsor/transactions/v1/TransferType;", "transfer_type", "", "tax_year", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lwindsor/transactions/v1/IsaCashTransferDetail;", "isa_cash_transfer_details", "Lbonfire/proto/idl/windsor/v1/TransferFailureReason;", "transfer_failure_reason", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lwindsor/transactions/v1/TransactionDirection;Lwindsor/transactions/v1/TransactionState;Lwindsor/transactions/v1/TransferType;ILj$/time/Instant;Lj$/time/Instant;Lwindsor/transactions/v1/IsaCashTransferDetail;Lbonfire/proto/idl/windsor/v1/TransferFailureReason;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lwindsor/transactions/v1/TransactionDirection;Lwindsor/transactions/v1/TransactionState;Lwindsor/transactions/v1/TransferType;ILj$/time/Instant;Lj$/time/Instant;Lwindsor/transactions/v1/IsaCashTransferDetail;Lbonfire/proto/idl/windsor/v1/TransferFailureReason;Lokio/ByteString;)Lbonfire/proto/idl/windsor/v1/Transfer;", "Ljava/lang/String;", "getId", "getAccount_number", "Lcom/robinhood/rosetta/common/Money;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "Lwindsor/transactions/v1/TransactionDirection;", "getDirection", "()Lwindsor/transactions/v1/TransactionDirection;", "Lwindsor/transactions/v1/TransactionState;", "getState", "()Lwindsor/transactions/v1/TransactionState;", "Lwindsor/transactions/v1/TransferType;", "getTransfer_type", "()Lwindsor/transactions/v1/TransferType;", "I", "getTax_year", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "Lwindsor/transactions/v1/IsaCashTransferDetail;", "getIsa_cash_transfer_details", "()Lwindsor/transactions/v1/IsaCashTransferDetail;", "Lbonfire/proto/idl/windsor/v1/TransferFailureReason;", "getTransfer_failure_reason", "()Lbonfire/proto/idl/windsor/v1/TransferFailureReason;", "Companion", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Transfer extends Message {

    @JvmField
    public static final ProtoAdapter<Transfer> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant created_at;

    @WireField(adapter = "windsor.transactions.v1.TransactionDirection#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final TransactionDirection direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "windsor.transactions.v1.IsaCashTransferDetail#ADAPTER", jsonName = "isaCashTransferDetails", oneofName = "transfer_details", schemaIndex = 9, tag = 10)
    private final IsaCashTransferDetail isa_cash_transfer_details;

    @WireField(adapter = "windsor.transactions.v1.TransactionState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final TransactionState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "taxYear", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int tax_year;

    @WireField(adapter = "bonfire.proto.idl.windsor.v1.TransferFailureReason#ADAPTER", jsonName = "transferFailureReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final TransferFailureReason transfer_failure_reason;

    @WireField(adapter = "windsor.transactions.v1.TransferType#ADAPTER", jsonName = "transferType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final TransferType transfer_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant updated_at;

    public Transfer() {
        this(null, null, null, null, null, null, 0, null, null, null, null, null, 4095, null);
    }

    public /* synthetic */ Transfer(String str, String str2, Money money, TransactionDirection transactionDirection, TransactionState transactionState, TransferType transferType, int i, Instant instant, Instant instant2, IsaCashTransferDetail isaCashTransferDetail, TransferFailureReason transferFailureReason, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : money, (i2 & 8) != 0 ? TransactionDirection.DIRECTION_UNSPECIFIED : transactionDirection, (i2 & 16) != 0 ? TransactionState.STATUS_UNSPECIFIED : transactionState, (i2 & 32) != 0 ? TransferType.TRANSFER_TYPE_UNSPECIFIED : transferType, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : instant, (i2 & 256) != 0 ? null : instant2, (i2 & 512) != 0 ? null : isaCashTransferDetail, (i2 & 1024) != 0 ? TransferFailureReason.TRANSFER_FAILURE_UNSPECIFIED : transferFailureReason, (i2 & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9065newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final TransactionDirection getDirection() {
        return this.direction;
    }

    public final TransactionState getState() {
        return this.state;
    }

    public final TransferType getTransfer_type() {
        return this.transfer_type;
    }

    public final int getTax_year() {
        return this.tax_year;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final IsaCashTransferDetail getIsa_cash_transfer_details() {
        return this.isa_cash_transfer_details;
    }

    public final TransferFailureReason getTransfer_failure_reason() {
        return this.transfer_failure_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer(String id, String account_number, Money money, TransactionDirection direction, TransactionState state, TransferType transfer_type, int i, Instant instant, Instant instant2, IsaCashTransferDetail isaCashTransferDetail, TransferFailureReason transfer_failure_reason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_failure_reason, "transfer_failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_number = account_number;
        this.amount = money;
        this.direction = direction;
        this.state = state;
        this.transfer_type = transfer_type;
        this.tax_year = i;
        this.created_at = instant;
        this.updated_at = instant2;
        this.isa_cash_transfer_details = isaCashTransferDetail;
        this.transfer_failure_reason = transfer_failure_reason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9065newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), transfer.unknownFields()) && Intrinsics.areEqual(this.id, transfer.id) && Intrinsics.areEqual(this.account_number, transfer.account_number) && Intrinsics.areEqual(this.amount, transfer.amount) && this.direction == transfer.direction && this.state == transfer.state && this.transfer_type == transfer.transfer_type && this.tax_year == transfer.tax_year && Intrinsics.areEqual(this.created_at, transfer.created_at) && Intrinsics.areEqual(this.updated_at, transfer.updated_at) && Intrinsics.areEqual(this.isa_cash_transfer_details, transfer.isa_cash_transfer_details) && this.transfer_failure_reason == transfer.transfer_failure_reason;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (((((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.direction.hashCode()) * 37) + this.state.hashCode()) * 37) + this.transfer_type.hashCode()) * 37) + Integer.hashCode(this.tax_year)) * 37;
        Instant instant = this.created_at;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        IsaCashTransferDetail isaCashTransferDetail = this.isa_cash_transfer_details;
        int iHashCode5 = ((iHashCode4 + (isaCashTransferDetail != null ? isaCashTransferDetail.hashCode() : 0)) * 37) + this.transfer_failure_reason.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("direction=" + this.direction);
        arrayList.add("state=" + this.state);
        arrayList.add("transfer_type=" + this.transfer_type);
        arrayList.add("tax_year=" + this.tax_year);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        IsaCashTransferDetail isaCashTransferDetail = this.isa_cash_transfer_details;
        if (isaCashTransferDetail != null) {
            arrayList.add("isa_cash_transfer_details=" + isaCashTransferDetail);
        }
        arrayList.add("transfer_failure_reason=" + this.transfer_failure_reason);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Transfer{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Transfer copy$default(Transfer transfer, String str, String str2, Money money, TransactionDirection transactionDirection, TransactionState transactionState, TransferType transferType, int i, Instant instant, Instant instant2, IsaCashTransferDetail isaCashTransferDetail, TransferFailureReason transferFailureReason, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transfer.id;
        }
        if ((i2 & 2) != 0) {
            str2 = transfer.account_number;
        }
        if ((i2 & 4) != 0) {
            money = transfer.amount;
        }
        if ((i2 & 8) != 0) {
            transactionDirection = transfer.direction;
        }
        if ((i2 & 16) != 0) {
            transactionState = transfer.state;
        }
        if ((i2 & 32) != 0) {
            transferType = transfer.transfer_type;
        }
        if ((i2 & 64) != 0) {
            i = transfer.tax_year;
        }
        if ((i2 & 128) != 0) {
            instant = transfer.created_at;
        }
        if ((i2 & 256) != 0) {
            instant2 = transfer.updated_at;
        }
        if ((i2 & 512) != 0) {
            isaCashTransferDetail = transfer.isa_cash_transfer_details;
        }
        if ((i2 & 1024) != 0) {
            transferFailureReason = transfer.transfer_failure_reason;
        }
        if ((i2 & 2048) != 0) {
            byteString = transfer.unknownFields();
        }
        TransferFailureReason transferFailureReason2 = transferFailureReason;
        ByteString byteString2 = byteString;
        Instant instant3 = instant2;
        IsaCashTransferDetail isaCashTransferDetail2 = isaCashTransferDetail;
        int i3 = i;
        Instant instant4 = instant;
        TransactionState transactionState2 = transactionState;
        TransferType transferType2 = transferType;
        return transfer.copy(str, str2, money, transactionDirection, transactionState2, transferType2, i3, instant4, instant3, isaCashTransferDetail2, transferFailureReason2, byteString2);
    }

    public final Transfer copy(String id, String account_number, Money amount, TransactionDirection direction, TransactionState state, TransferType transfer_type, int tax_year, Instant created_at, Instant updated_at, IsaCashTransferDetail isa_cash_transfer_details, TransferFailureReason transfer_failure_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_failure_reason, "transfer_failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Transfer(id, account_number, amount, direction, state, transfer_type, tax_year, created_at, updated_at, isa_cash_transfer_details, transfer_failure_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Transfer.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Transfer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.windsor.v1.Transfer$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Transfer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getAmount());
                }
                if (value.getDirection() != TransactionDirection.DIRECTION_UNSPECIFIED) {
                    size += TransactionDirection.ADAPTER.encodedSizeWithTag(4, value.getDirection());
                }
                if (value.getState() != TransactionState.STATUS_UNSPECIFIED) {
                    size += TransactionState.ADAPTER.encodedSizeWithTag(5, value.getState());
                }
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    size += TransferType.ADAPTER.encodedSizeWithTag(6, value.getTransfer_type());
                }
                if (value.getTax_year() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getTax_year()));
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getUpdated_at());
                }
                int iEncodedSizeWithTag = size + IsaCashTransferDetail.ADAPTER.encodedSizeWithTag(10, value.getIsa_cash_transfer_details());
                return value.getTransfer_failure_reason() != TransferFailureReason.TRANSFER_FAILURE_UNSPECIFIED ? iEncodedSizeWithTag + TransferFailureReason.ADAPTER.encodedSizeWithTag(11, value.getTransfer_failure_reason()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Transfer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (value.getDirection() != TransactionDirection.DIRECTION_UNSPECIFIED) {
                    TransactionDirection.ADAPTER.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (value.getState() != TransactionState.STATUS_UNSPECIFIED) {
                    TransactionState.ADAPTER.encodeWithTag(writer, 5, (int) value.getState());
                }
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    TransferType.ADAPTER.encodeWithTag(writer, 6, (int) value.getTransfer_type());
                }
                if (value.getTax_year() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getTax_year()));
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getUpdated_at());
                }
                if (value.getTransfer_failure_reason() != TransferFailureReason.TRANSFER_FAILURE_UNSPECIFIED) {
                    TransferFailureReason.ADAPTER.encodeWithTag(writer, 11, (int) value.getTransfer_failure_reason());
                }
                IsaCashTransferDetail.ADAPTER.encodeWithTag(writer, 10, (int) value.getIsa_cash_transfer_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Transfer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                IsaCashTransferDetail.ADAPTER.encodeWithTag(writer, 10, (int) value.getIsa_cash_transfer_details());
                if (value.getTransfer_failure_reason() != TransferFailureReason.TRANSFER_FAILURE_UNSPECIFIED) {
                    TransferFailureReason.ADAPTER.encodeWithTag(writer, 11, (int) value.getTransfer_failure_reason());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCreated_at());
                }
                if (value.getTax_year() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getTax_year()));
                }
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    TransferType.ADAPTER.encodeWithTag(writer, 6, (int) value.getTransfer_type());
                }
                if (value.getState() != TransactionState.STATUS_UNSPECIFIED) {
                    TransactionState.ADAPTER.encodeWithTag(writer, 5, (int) value.getState());
                }
                if (value.getDirection() != TransactionDirection.DIRECTION_UNSPECIFIED) {
                    TransactionDirection.ADAPTER.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Transfer decode(ProtoReader reader) throws IOException {
                TransactionDirection transactionDirection;
                TransactionState transactionState;
                TransferType transferType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                TransactionDirection transactionDirection2 = TransactionDirection.DIRECTION_UNSPECIFIED;
                TransactionState transactionState2 = TransactionState.STATUS_UNSPECIFIED;
                TransferType transferType2 = TransferType.TRANSFER_TYPE_UNSPECIFIED;
                TransferFailureReason transferFailureReason = TransferFailureReason.TRANSFER_FAILURE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                IsaCashTransferDetail isaCashTransferDetailDecode = null;
                int iIntValue = 0;
                String strDecode = "";
                String strDecode2 = strDecode;
                TransferFailureReason transferFailureReasonDecode = transferFailureReason;
                TransferType transferTypeDecode = transferType2;
                TransactionState transactionStateDecode = transactionState2;
                TransactionDirection transactionDirectionDecode = transactionDirection2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                transactionDirection = transactionDirectionDecode;
                                transactionState = transactionStateDecode;
                                transferType = transferTypeDecode;
                                try {
                                    transactionDirectionDecode = TransactionDirection.ADAPTER.decode(reader);
                                    transferTypeDecode = transferType;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                transactionStateDecode = transactionState;
                                break;
                            case 5:
                                transactionDirection = transactionDirectionDecode;
                                transactionState = transactionStateDecode;
                                transferType = transferTypeDecode;
                                try {
                                    transactionStateDecode = TransactionState.ADAPTER.decode(reader);
                                    transferTypeDecode = transferType;
                                    transactionDirectionDecode = transactionDirection;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 6:
                                transactionDirection = transactionDirectionDecode;
                                transactionState = transactionStateDecode;
                                try {
                                    transferTypeDecode = TransferType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    transferType = transferTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                transactionDirectionDecode = transactionDirection;
                                transactionStateDecode = transactionState;
                                break;
                            case 7:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 8:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 9:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 10:
                                isaCashTransferDetailDecode = IsaCashTransferDetail.ADAPTER.decode(reader);
                                break;
                            case 11:
                                try {
                                    transferFailureReasonDecode = TransferFailureReason.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    transactionDirection = transactionDirectionDecode;
                                    transactionState = transactionStateDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                transactionDirection = transactionDirectionDecode;
                                transactionState = transactionStateDecode;
                                transferType = transferTypeDecode;
                                transferTypeDecode = transferType;
                                transactionDirectionDecode = transactionDirection;
                                transactionStateDecode = transactionState;
                                break;
                        }
                    } else {
                        return new Transfer(strDecode, strDecode2, moneyDecode, transactionDirectionDecode, transactionStateDecode, transferTypeDecode, iIntValue, instantDecode, instantDecode2, isaCashTransferDetailDecode, transferFailureReasonDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Transfer redact(Transfer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact2 = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                IsaCashTransferDetail isa_cash_transfer_details = value.getIsa_cash_transfer_details();
                return Transfer.copy$default(value, null, null, moneyRedact, null, null, null, 0, instantRedact, instantRedact2, isa_cash_transfer_details != null ? IsaCashTransferDetail.ADAPTER.redact(isa_cash_transfer_details) : null, null, ByteString.EMPTY, 1147, null);
            }
        };
    }
}
