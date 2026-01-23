package com.robinhood.transfers.accounts.contracts;

import com.robinhood.transfers.accounts.contracts.model.CreateTransferState;
import com.robinhood.transfers.accounts.contracts.model.CreateTransferState2;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import com.robinhood.transfers.accounts.contracts.model.TransferEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AccountSelectionBottomSheetService.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetArgs;", "", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "transferState", "Lcom/robinhood/transfers/accounts/contracts/model/CreateTransferState;", "entryPoint", "Lcom/robinhood/transfers/accounts/contracts/model/TransferEntryPoint;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lcom/robinhood/transfers/accounts/contracts/model/CreateTransferState;Lcom/robinhood/transfers/accounts/contracts/model/TransferEntryPoint;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lcom/robinhood/transfers/accounts/contracts/model/CreateTransferState;Lcom/robinhood/transfers/accounts/contracts/model/TransferEntryPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDirection", "()Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "getTransferState", "()Lcom/robinhood/transfers/accounts/contracts/model/CreateTransferState;", "getEntryPoint", "()Lcom/robinhood/transfers/accounts/contracts/model/TransferEntryPoint;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class AccountSelectionBottomSheetArgs {
    private final TransferAccountDirection direction;
    private final TransferEntryPoint entryPoint;
    private final CreateTransferState transferState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {TransferAccountDirection.INSTANCE.serializer(), null, TransferEntryPoint.INSTANCE.serializer()};

    public static /* synthetic */ AccountSelectionBottomSheetArgs copy$default(AccountSelectionBottomSheetArgs accountSelectionBottomSheetArgs, TransferAccountDirection transferAccountDirection, CreateTransferState createTransferState, TransferEntryPoint transferEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccountDirection = accountSelectionBottomSheetArgs.direction;
        }
        if ((i & 2) != 0) {
            createTransferState = accountSelectionBottomSheetArgs.transferState;
        }
        if ((i & 4) != 0) {
            transferEntryPoint = accountSelectionBottomSheetArgs.entryPoint;
        }
        return accountSelectionBottomSheetArgs.copy(transferAccountDirection, createTransferState, transferEntryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferAccountDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final CreateTransferState getTransferState() {
        return this.transferState;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final AccountSelectionBottomSheetArgs copy(TransferAccountDirection direction, CreateTransferState transferState, TransferEntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferState, "transferState");
        return new AccountSelectionBottomSheetArgs(direction, transferState, entryPoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectionBottomSheetArgs)) {
            return false;
        }
        AccountSelectionBottomSheetArgs accountSelectionBottomSheetArgs = (AccountSelectionBottomSheetArgs) other;
        return this.direction == accountSelectionBottomSheetArgs.direction && Intrinsics.areEqual(this.transferState, accountSelectionBottomSheetArgs.transferState) && this.entryPoint == accountSelectionBottomSheetArgs.entryPoint;
    }

    public int hashCode() {
        int iHashCode = ((this.direction.hashCode() * 31) + this.transferState.hashCode()) * 31;
        TransferEntryPoint transferEntryPoint = this.entryPoint;
        return iHashCode + (transferEntryPoint == null ? 0 : transferEntryPoint.hashCode());
    }

    public String toString() {
        return "AccountSelectionBottomSheetArgs(direction=" + this.direction + ", transferState=" + this.transferState + ", entryPoint=" + this.entryPoint + ")";
    }

    /* compiled from: AccountSelectionBottomSheetService.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetArgs$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetArgs;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountSelectionBottomSheetArgs> serializer() {
            return AccountSelectionBottomSheetService3.INSTANCE;
        }
    }

    public /* synthetic */ AccountSelectionBottomSheetArgs(int i, TransferAccountDirection transferAccountDirection, CreateTransferState createTransferState, TransferEntryPoint transferEntryPoint, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, AccountSelectionBottomSheetService3.INSTANCE.getDescriptor());
        }
        this.direction = transferAccountDirection;
        this.transferState = createTransferState;
        this.entryPoint = transferEntryPoint;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(AccountSelectionBottomSheetArgs self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.direction);
        output.encodeSerializableElement(serialDesc, 1, CreateTransferState2.INSTANCE, self.transferState);
        output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.entryPoint);
    }

    public AccountSelectionBottomSheetArgs(TransferAccountDirection direction, CreateTransferState transferState, TransferEntryPoint transferEntryPoint) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferState, "transferState");
        this.direction = direction;
        this.transferState = transferState;
        this.entryPoint = transferEntryPoint;
    }

    public final TransferAccountDirection getDirection() {
        return this.direction;
    }

    public final CreateTransferState getTransferState() {
        return this.transferState;
    }

    public final TransferEntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
