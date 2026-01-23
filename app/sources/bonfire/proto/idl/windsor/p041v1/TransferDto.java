package bonfire.proto.idl.windsor.p041v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.windsor.p041v1.TransferFailureReasonDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;
import windsor.transactions.p552v1.IsaCashTransferDetail;
import windsor.transactions.p552v1.IsaCashTransferDetailDto;
import windsor.transactions.p552v1.TransactionDirection;
import windsor.transactions.p552v1.TransactionDirectionDto;
import windsor.transactions.p552v1.TransactionState;
import windsor.transactions.p552v1.TransactionStateDto;
import windsor.transactions.p552v1.TransferType;
import windsor.transactions.p552v1.TransferTypeDto;

/* compiled from: TransferDto.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005FEGHIB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0006\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b;\u0010(R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0019\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168F¢\u0006\u0006\u001a\u0004\b>\u0010=R\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010D\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006J"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/windsor/v1/Transfer;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/windsor/v1/TransferDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/windsor/v1/TransferDto$Surrogate;)V", "", "id", "account_number", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lwindsor/transactions/v1/TransactionDirectionDto;", "direction", "Lwindsor/transactions/v1/TransactionStateDto;", "state", "Lwindsor/transactions/v1/TransferTypeDto;", "transfer_type", "", "tax_year", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lbonfire/proto/idl/windsor/v1/TransferFailureReasonDto;", "transfer_failure_reason", "Lbonfire/proto/idl/windsor/v1/TransferDto$TransferDetailsDto;", "transfer_details", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lwindsor/transactions/v1/TransactionDirectionDto;Lwindsor/transactions/v1/TransactionStateDto;Lwindsor/transactions/v1/TransferTypeDto;ILj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/windsor/v1/TransferFailureReasonDto;Lbonfire/proto/idl/windsor/v1/TransferDto$TransferDetailsDto;)V", "toProto", "()Lbonfire/proto/idl/windsor/v1/Transfer;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/windsor/v1/TransferDto$Surrogate;", "getId", "getAccount_number", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getDirection", "()Lwindsor/transactions/v1/TransactionDirectionDto;", "getState", "()Lwindsor/transactions/v1/TransactionStateDto;", "getTransfer_type", "()Lwindsor/transactions/v1/TransferTypeDto;", "getTax_year", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "getTransfer_failure_reason", "()Lbonfire/proto/idl/windsor/v1/TransferFailureReasonDto;", "Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "getIsa_cash_transfer_details", "()Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "isa_cash_transfer_details", "Companion", "Surrogate", "TransferDetailsDto", "Serializer", "MultibindingModule", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class TransferDto implements Dto3<Transfer>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TransferDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferDto, Transfer>> binaryBase64Serializer$delegate;
    private static final TransferDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TransferDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransferDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final TransactionDirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final TransactionStateDto getState() {
        return this.surrogate.getState();
    }

    public final TransferTypeDto getTransfer_type() {
        return this.surrogate.getTransfer_type();
    }

    public final int getTax_year() {
        return this.surrogate.getTax_year();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final TransferFailureReasonDto getTransfer_failure_reason() {
        return this.surrogate.getTransfer_failure_reason();
    }

    public final IsaCashTransferDetailDto getIsa_cash_transfer_details() {
        return this.surrogate.getIsa_cash_transfer_details();
    }

    public /* synthetic */ TransferDto(String str, String str2, MoneyDto moneyDto, TransactionDirectionDto transactionDirectionDto, TransactionStateDto transactionStateDto, TransferTypeDto transferTypeDto, int i, Instant instant, Instant instant2, TransferFailureReasonDto transferFailureReasonDto, TransferDetailsDto transferDetailsDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : moneyDto, (i2 & 8) != 0 ? TransactionDirectionDto.INSTANCE.getZeroValue() : transactionDirectionDto, (i2 & 16) != 0 ? TransactionStateDto.INSTANCE.getZeroValue() : transactionStateDto, (i2 & 32) != 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : instant, (i2 & 256) != 0 ? null : instant2, (i2 & 512) != 0 ? TransferFailureReasonDto.INSTANCE.getZeroValue() : transferFailureReasonDto, (i2 & 1024) != 0 ? null : transferDetailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransferDto(String id, String account_number, MoneyDto moneyDto, TransactionDirectionDto direction, TransactionStateDto state, TransferTypeDto transfer_type, int i, Instant instant, Instant instant2, TransferFailureReasonDto transfer_failure_reason, TransferDetailsDto transferDetailsDto) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_failure_reason, "transfer_failure_reason");
        TransferDetailsDto.IsaCashTransferDetails isaCashTransferDetails = transferDetailsDto instanceof TransferDetailsDto.IsaCashTransferDetails ? (TransferDetailsDto.IsaCashTransferDetails) transferDetailsDto : null;
        this(new Surrogate(id, account_number, moneyDto, direction, state, transfer_type, i, instant, instant2, transfer_failure_reason, isaCashTransferDetails != null ? isaCashTransferDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Transfer toProto() {
        String id = this.surrogate.getId();
        String account_number = this.surrogate.getAccount_number();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        TransactionDirection transactionDirection = (TransactionDirection) this.surrogate.getDirection().toProto();
        TransactionState transactionState = (TransactionState) this.surrogate.getState().toProto();
        TransferType transferType = (TransferType) this.surrogate.getTransfer_type().toProto();
        int tax_year = this.surrogate.getTax_year();
        Instant created_at = this.surrogate.getCreated_at();
        Instant updated_at = this.surrogate.getUpdated_at();
        TransferFailureReason transferFailureReason = (TransferFailureReason) this.surrogate.getTransfer_failure_reason().toProto();
        IsaCashTransferDetailDto isa_cash_transfer_details = this.surrogate.getIsa_cash_transfer_details();
        return new Transfer(id, account_number, proto, transactionDirection, transactionState, transferType, tax_year, created_at, updated_at, isa_cash_transfer_details != null ? isa_cash_transfer_details.toProto() : null, transferFailureReason, null, 2048, null);
    }

    public String toString() {
        return "[TransferDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TransferDto) && Intrinsics.areEqual(((TransferDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b,\b\u0083\b\u0018\u0000 Y2\u00020\u0001:\u0002ZYBÔ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0087\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J'\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010+R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010+R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\b;\u00105\u001a\u0004\b9\u0010:R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\b?\u00105\u001a\u0004\b=\u0010>R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bC\u00105\u001a\u0004\bA\u0010BR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010D\u0012\u0004\bG\u00105\u001a\u0004\bE\u0010FR/\u0010\u0011\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010H\u0012\u0004\bJ\u00105\u001a\u0004\bI\u0010-RF\u0010\u0015\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010K\u0012\u0004\bN\u00105\u001a\u0004\bL\u0010MRF\u0010\u0016\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010K\u0012\u0004\bP\u00105\u001a\u0004\bO\u0010MR \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010Q\u0012\u0004\bT\u00105\u001a\u0004\bR\u0010SR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010U\u0012\u0004\bX\u00105\u001a\u0004\bV\u0010W¨\u0006["}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto$Surrogate;", "", "", "id", "account_number", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lwindsor/transactions/v1/TransactionDirectionDto;", "direction", "Lwindsor/transactions/v1/TransactionStateDto;", "state", "Lwindsor/transactions/v1/TransferTypeDto;", "transfer_type", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "tax_year", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "Lbonfire/proto/idl/windsor/v1/TransferFailureReasonDto;", "transfer_failure_reason", "Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "isa_cash_transfer_details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lwindsor/transactions/v1/TransactionDirectionDto;Lwindsor/transactions/v1/TransactionStateDto;Lwindsor/transactions/v1/TransferTypeDto;ILj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/windsor/v1/TransferFailureReasonDto;Lwindsor/transactions/v1/IsaCashTransferDetailDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lwindsor/transactions/v1/TransactionDirectionDto;Lwindsor/transactions/v1/TransactionStateDto;Lwindsor/transactions/v1/TransferTypeDto;ILj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/windsor/v1/TransferFailureReasonDto;Lwindsor/transactions/v1/IsaCashTransferDetailDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$windsor_v1_externalRelease", "(Lbonfire/proto/idl/windsor/v1/TransferDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_number", "getAccount_number$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount$annotations", "Lwindsor/transactions/v1/TransactionDirectionDto;", "getDirection", "()Lwindsor/transactions/v1/TransactionDirectionDto;", "getDirection$annotations", "Lwindsor/transactions/v1/TransactionStateDto;", "getState", "()Lwindsor/transactions/v1/TransactionStateDto;", "getState$annotations", "Lwindsor/transactions/v1/TransferTypeDto;", "getTransfer_type", "()Lwindsor/transactions/v1/TransferTypeDto;", "getTransfer_type$annotations", "I", "getTax_year", "getTax_year$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "Lbonfire/proto/idl/windsor/v1/TransferFailureReasonDto;", "getTransfer_failure_reason", "()Lbonfire/proto/idl/windsor/v1/TransferFailureReasonDto;", "getTransfer_failure_reason$annotations", "Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "getIsa_cash_transfer_details", "()Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "getIsa_cash_transfer_details$annotations", "Companion", "$serializer", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final MoneyDto amount;
        private final Instant created_at;
        private final TransactionDirectionDto direction;
        private final String id;
        private final IsaCashTransferDetailDto isa_cash_transfer_details;
        private final TransactionStateDto state;
        private final int tax_year;
        private final TransferFailureReasonDto transfer_failure_reason;
        private final TransferTypeDto transfer_type;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (String) null, (MoneyDto) null, (TransactionDirectionDto) null, (TransactionStateDto) null, (TransferTypeDto) null, 0, (Instant) null, (Instant) null, (TransferFailureReasonDto) null, (IsaCashTransferDetailDto) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.amount, surrogate.amount) && this.direction == surrogate.direction && this.state == surrogate.state && this.transfer_type == surrogate.transfer_type && this.tax_year == surrogate.tax_year && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.transfer_failure_reason == surrogate.transfer_failure_reason && Intrinsics.areEqual(this.isa_cash_transfer_details, surrogate.isa_cash_transfer_details);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.account_number.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (((((((((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.direction.hashCode()) * 31) + this.state.hashCode()) * 31) + this.transfer_type.hashCode()) * 31) + Integer.hashCode(this.tax_year)) * 31;
            Instant instant = this.created_at;
            int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode4 = (((iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.transfer_failure_reason.hashCode()) * 31;
            IsaCashTransferDetailDto isaCashTransferDetailDto = this.isa_cash_transfer_details;
            return iHashCode4 + (isaCashTransferDetailDto != null ? isaCashTransferDetailDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_number=" + this.account_number + ", amount=" + this.amount + ", direction=" + this.direction + ", state=" + this.state + ", transfer_type=" + this.transfer_type + ", tax_year=" + this.tax_year + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", transfer_failure_reason=" + this.transfer_failure_reason + ", isa_cash_transfer_details=" + this.isa_cash_transfer_details + ")";
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/windsor/v1/TransferDto$Surrogate;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TransferDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, MoneyDto moneyDto, TransactionDirectionDto transactionDirectionDto, TransactionStateDto transactionStateDto, TransferTypeDto transferTypeDto, int i2, Instant instant, Instant instant2, TransferFailureReasonDto transferFailureReasonDto, IsaCashTransferDetailDto isaCashTransferDetailDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 4) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 8) == 0) {
                this.direction = TransactionDirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = transactionDirectionDto;
            }
            if ((i & 16) == 0) {
                this.state = TransactionStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = transactionStateDto;
            }
            if ((i & 32) == 0) {
                this.transfer_type = TransferTypeDto.INSTANCE.getZeroValue();
            } else {
                this.transfer_type = transferTypeDto;
            }
            if ((i & 64) == 0) {
                this.tax_year = 0;
            } else {
                this.tax_year = i2;
            }
            if ((i & 128) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 256) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 512) == 0) {
                this.transfer_failure_reason = TransferFailureReasonDto.INSTANCE.getZeroValue();
            } else {
                this.transfer_failure_reason = transferFailureReasonDto;
            }
            if ((i & 1024) == 0) {
                this.isa_cash_transfer_details = null;
            } else {
                this.isa_cash_transfer_details = isaCashTransferDetailDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$windsor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (self.direction != TransactionDirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TransactionDirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (self.state != TransactionStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, TransactionStateDto.Serializer.INSTANCE, self.state);
            }
            if (self.transfer_type != TransferTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, TransferTypeDto.Serializer.INSTANCE, self.transfer_type);
            }
            int i = self.tax_year;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant2);
            }
            if (self.transfer_failure_reason != TransferFailureReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, TransferFailureReasonDto.Serializer.INSTANCE, self.transfer_failure_reason);
            }
            IsaCashTransferDetailDto isaCashTransferDetailDto = self.isa_cash_transfer_details;
            if (isaCashTransferDetailDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, IsaCashTransferDetailDto.Serializer.INSTANCE, isaCashTransferDetailDto);
            }
        }

        public Surrogate(String id, String account_number, MoneyDto moneyDto, TransactionDirectionDto direction, TransactionStateDto state, TransferTypeDto transfer_type, int i, Instant instant, Instant instant2, TransferFailureReasonDto transfer_failure_reason, IsaCashTransferDetailDto isaCashTransferDetailDto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
            Intrinsics.checkNotNullParameter(transfer_failure_reason, "transfer_failure_reason");
            this.id = id;
            this.account_number = account_number;
            this.amount = moneyDto;
            this.direction = direction;
            this.state = state;
            this.transfer_type = transfer_type;
            this.tax_year = i;
            this.created_at = instant;
            this.updated_at = instant2;
            this.transfer_failure_reason = transfer_failure_reason;
            this.isa_cash_transfer_details = isaCashTransferDetailDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, MoneyDto moneyDto, TransactionDirectionDto transactionDirectionDto, TransactionStateDto transactionStateDto, TransferTypeDto transferTypeDto, int i, Instant instant, Instant instant2, TransferFailureReasonDto transferFailureReasonDto, IsaCashTransferDetailDto isaCashTransferDetailDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : moneyDto, (i2 & 8) != 0 ? TransactionDirectionDto.INSTANCE.getZeroValue() : transactionDirectionDto, (i2 & 16) != 0 ? TransactionStateDto.INSTANCE.getZeroValue() : transactionStateDto, (i2 & 32) != 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : instant, (i2 & 256) != 0 ? null : instant2, (i2 & 512) != 0 ? TransferFailureReasonDto.INSTANCE.getZeroValue() : transferFailureReasonDto, (i2 & 1024) != 0 ? null : isaCashTransferDetailDto);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final TransactionDirectionDto getDirection() {
            return this.direction;
        }

        public final TransactionStateDto getState() {
            return this.state;
        }

        public final TransferTypeDto getTransfer_type() {
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

        public final TransferFailureReasonDto getTransfer_failure_reason() {
            return this.transfer_failure_reason;
        }

        public final IsaCashTransferDetailDto getIsa_cash_transfer_details() {
            return this.isa_cash_transfer_details;
        }
    }

    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/windsor/v1/TransferDto;", "Lbonfire/proto/idl/windsor/v1/Transfer;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/windsor/v1/TransferDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TransferDto, Transfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferDto> getBinaryBase64Serializer() {
            return (KSerializer) TransferDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Transfer> getProtoAdapter() {
            return Transfer.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferDto getZeroValue() {
            return TransferDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferDto fromProto(Transfer proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_number = proto.getAccount_number();
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            TransactionDirectionDto transactionDirectionDtoFromProto = TransactionDirectionDto.INSTANCE.fromProto(proto.getDirection());
            TransactionStateDto transactionStateDtoFromProto = TransactionStateDto.INSTANCE.fromProto(proto.getState());
            TransferTypeDto transferTypeDtoFromProto = TransferTypeDto.INSTANCE.fromProto(proto.getTransfer_type());
            int tax_year = proto.getTax_year();
            Instant created_at = proto.getCreated_at();
            Instant updated_at = proto.getUpdated_at();
            TransferFailureReasonDto transferFailureReasonDtoFromProto = TransferFailureReasonDto.INSTANCE.fromProto(proto.getTransfer_failure_reason());
            IsaCashTransferDetail isa_cash_transfer_details = proto.getIsa_cash_transfer_details();
            return new TransferDto(new Surrogate(id, account_number, moneyDtoFromProto, transactionDirectionDtoFromProto, transactionStateDtoFromProto, transferTypeDtoFromProto, tax_year, created_at, updated_at, transferFailureReasonDtoFromProto, isa_cash_transfer_details != null ? IsaCashTransferDetailDto.INSTANCE.fromProto(isa_cash_transfer_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.windsor.v1.TransferDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TransferDto(null, null, null, null, null, null, 0, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto$TransferDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "IsaCashTransferDetails", "Companion", "Lbonfire/proto/idl/windsor/v1/TransferDto$TransferDetailsDto$IsaCashTransferDetails;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class TransferDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ TransferDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TransferDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto$TransferDetailsDto$IsaCashTransferDetails;", "Lbonfire/proto/idl/windsor/v1/TransferDto$TransferDetailsDto;", "Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "value", "<init>", "(Lwindsor/transactions/v1/IsaCashTransferDetailDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "getValue", "()Lwindsor/transactions/v1/IsaCashTransferDetailDto;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IsaCashTransferDetails extends TransferDetailsDto {
            private final IsaCashTransferDetailDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IsaCashTransferDetails) && Intrinsics.areEqual(this.value, ((IsaCashTransferDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "IsaCashTransferDetails(value=" + this.value + ")";
            }

            public final IsaCashTransferDetailDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IsaCashTransferDetails(IsaCashTransferDetailDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto$TransferDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/windsor/v1/TransferDto$TransferDetailsDto;", "Lbonfire/proto/idl/windsor/v1/Transfer;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<TransferDetailsDto, Transfer> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Transfer> getProtoAdapter() {
                return Transfer.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferDetailsDto fromProto(Transfer proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getIsa_cash_transfer_details() != null) {
                    return new IsaCashTransferDetails(IsaCashTransferDetailDto.INSTANCE.fromProto(proto.getIsa_cash_transfer_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/windsor/v1/TransferDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/windsor/v1/TransferDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TransferDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.windsor.v1.Transfer", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransferDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TransferDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TransferDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/TransferDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.windsor.v1.TransferDto";
        }
    }
}
