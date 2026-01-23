package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectTransferAccountBundle.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003Ji\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010 \u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/SelectTransferAccountBundle;", "", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "amount", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "mode", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "isInInterEntityMatchExperiment", "", "isOutgoingWire", "locked", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;Lcom/robinhood/models/api/bonfire/IraContributionType;ZZZ)V", "getDirection", "()Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "getAmount", "()Ljava/math/BigDecimal;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "getMode", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "()Z", "getLocked", "selectedAccount", "getSelectedAccount", "otherAccount", "getOtherAccount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SelectTransferAccountBundle {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final TransferAccountDirection direction;
    private final IraContributionType iraContributionType;
    private final boolean isInInterEntityMatchExperiment;
    private final boolean isOutgoingWire;
    private final boolean locked;
    private final CreateTransferViewState.Mode mode;
    private final TransferAccount sinkAccount;
    private final TransferAccount sourceAccount;

    /* compiled from: SelectTransferAccountBundle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ SelectTransferAccountBundle copy$default(SelectTransferAccountBundle selectTransferAccountBundle, TransferAccountDirection transferAccountDirection, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, CreateTransferViewState.Mode mode, IraContributionType iraContributionType, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccountDirection = selectTransferAccountBundle.direction;
        }
        if ((i & 2) != 0) {
            bigDecimal = selectTransferAccountBundle.amount;
        }
        if ((i & 4) != 0) {
            transferAccount = selectTransferAccountBundle.sourceAccount;
        }
        if ((i & 8) != 0) {
            transferAccount2 = selectTransferAccountBundle.sinkAccount;
        }
        if ((i & 16) != 0) {
            mode = selectTransferAccountBundle.mode;
        }
        if ((i & 32) != 0) {
            iraContributionType = selectTransferAccountBundle.iraContributionType;
        }
        if ((i & 64) != 0) {
            z = selectTransferAccountBundle.isInInterEntityMatchExperiment;
        }
        if ((i & 128) != 0) {
            z2 = selectTransferAccountBundle.isOutgoingWire;
        }
        if ((i & 256) != 0) {
            z3 = selectTransferAccountBundle.locked;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        IraContributionType iraContributionType2 = iraContributionType;
        boolean z6 = z;
        CreateTransferViewState.Mode mode2 = mode;
        TransferAccount transferAccount3 = transferAccount;
        return selectTransferAccountBundle.copy(transferAccountDirection, bigDecimal, transferAccount3, transferAccount2, mode2, iraContributionType2, z6, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferAccountDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final CreateTransferViewState.Mode getMode() {
        return this.mode;
    }

    /* renamed from: component6, reason: from getter */
    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInInterEntityMatchExperiment() {
        return this.isInInterEntityMatchExperiment;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsOutgoingWire() {
        return this.isOutgoingWire;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    public final SelectTransferAccountBundle copy(TransferAccountDirection direction, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount, CreateTransferViewState.Mode mode, IraContributionType iraContributionType, boolean isInInterEntityMatchExperiment, boolean isOutgoingWire, boolean locked) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new SelectTransferAccountBundle(direction, amount, sourceAccount, sinkAccount, mode, iraContributionType, isInInterEntityMatchExperiment, isOutgoingWire, locked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectTransferAccountBundle)) {
            return false;
        }
        SelectTransferAccountBundle selectTransferAccountBundle = (SelectTransferAccountBundle) other;
        return this.direction == selectTransferAccountBundle.direction && Intrinsics.areEqual(this.amount, selectTransferAccountBundle.amount) && Intrinsics.areEqual(this.sourceAccount, selectTransferAccountBundle.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, selectTransferAccountBundle.sinkAccount) && this.mode == selectTransferAccountBundle.mode && this.iraContributionType == selectTransferAccountBundle.iraContributionType && this.isInInterEntityMatchExperiment == selectTransferAccountBundle.isInInterEntityMatchExperiment && this.isOutgoingWire == selectTransferAccountBundle.isOutgoingWire && this.locked == selectTransferAccountBundle.locked;
    }

    public int hashCode() {
        int iHashCode = ((this.direction.hashCode() * 31) + this.amount.hashCode()) * 31;
        TransferAccount transferAccount = this.sourceAccount;
        int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
        TransferAccount transferAccount2 = this.sinkAccount;
        int iHashCode3 = (((iHashCode2 + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31) + this.mode.hashCode()) * 31;
        IraContributionType iraContributionType = this.iraContributionType;
        return ((((((iHashCode3 + (iraContributionType != null ? iraContributionType.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInInterEntityMatchExperiment)) * 31) + Boolean.hashCode(this.isOutgoingWire)) * 31) + Boolean.hashCode(this.locked);
    }

    public String toString() {
        return "SelectTransferAccountBundle(direction=" + this.direction + ", amount=" + this.amount + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", mode=" + this.mode + ", iraContributionType=" + this.iraContributionType + ", isInInterEntityMatchExperiment=" + this.isInInterEntityMatchExperiment + ", isOutgoingWire=" + this.isOutgoingWire + ", locked=" + this.locked + ")";
    }

    public SelectTransferAccountBundle(TransferAccountDirection direction, BigDecimal amount, TransferAccount transferAccount, TransferAccount transferAccount2, CreateTransferViewState.Mode mode, IraContributionType iraContributionType, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.direction = direction;
        this.amount = amount;
        this.sourceAccount = transferAccount;
        this.sinkAccount = transferAccount2;
        this.mode = mode;
        this.iraContributionType = iraContributionType;
        this.isInInterEntityMatchExperiment = z;
        this.isOutgoingWire = z2;
        this.locked = z3;
    }

    public final TransferAccountDirection getDirection() {
        return this.direction;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final CreateTransferViewState.Mode getMode() {
        return this.mode;
    }

    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    public final boolean isInInterEntityMatchExperiment() {
        return this.isInInterEntityMatchExperiment;
    }

    public final boolean isOutgoingWire() {
        return this.isOutgoingWire;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final TransferAccount getSelectedAccount() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            return this.sourceAccount;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.sinkAccount;
    }

    public final TransferAccount getOtherAccount() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
        if (i == 1) {
            return this.sinkAccount;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.sourceAccount;
    }
}
