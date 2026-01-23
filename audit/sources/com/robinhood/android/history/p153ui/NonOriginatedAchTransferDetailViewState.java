package com.robinhood.android.history.p153ui;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.NonOriginatedAchTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: NonOriginatedAchTransferDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u001eHÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailViewState;", "", "transfer", "Lcom/robinhood/models/db/NonOriginatedAchTransfer;", "<init>", "(Lcom/robinhood/models/db/NonOriginatedAchTransfer;)V", "getTransfer", "()Lcom/robinhood/models/db/NonOriginatedAchTransfer;", "transferAmountValueText", "", "getTransferAmountValueText", "()Ljava/lang/String;", "transferGrantDateValueText", "getTransferGrantDateValueText", "transferOriginatorText", "Lcom/robinhood/utils/resource/StringResource;", "getTransferOriginatorText", "()Lcom/robinhood/utils/resource/StringResource;", "transferReceiverText", "getTransferReceiverText", "robinhoodAccountText", "getRobinhoodAccountText", "goldDepositBoost", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "getGoldDepositBoost", "()Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "isGoldDepositBoostSectionVisible", "", "()Z", "goldDepositBoostIconRes", "", "getGoldDepositBoostIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "equals", "other", "hashCode", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class NonOriginatedAchTransferDetailViewState {
    public static final int $stable = 8;
    private final GoldDepositBoostTransferDetail goldDepositBoost;
    private final Integer goldDepositBoostIconRes;
    private final boolean isGoldDepositBoostSectionVisible;
    private final NonOriginatedAchTransfer transfer;

    /* compiled from: NonOriginatedAchTransferDetailViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Money.Direction.values().length];
            try {
                iArr[Money.Direction.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Money.Direction.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NonOriginatedAchTransferDetailViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NonOriginatedAchTransferDetailViewState copy$default(NonOriginatedAchTransferDetailViewState nonOriginatedAchTransferDetailViewState, NonOriginatedAchTransfer nonOriginatedAchTransfer, int i, Object obj) {
        if ((i & 1) != 0) {
            nonOriginatedAchTransfer = nonOriginatedAchTransferDetailViewState.transfer;
        }
        return nonOriginatedAchTransferDetailViewState.copy(nonOriginatedAchTransfer);
    }

    /* renamed from: component1, reason: from getter */
    public final NonOriginatedAchTransfer getTransfer() {
        return this.transfer;
    }

    public final NonOriginatedAchTransferDetailViewState copy(NonOriginatedAchTransfer transfer) {
        return new NonOriginatedAchTransferDetailViewState(transfer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NonOriginatedAchTransferDetailViewState) && Intrinsics.areEqual(this.transfer, ((NonOriginatedAchTransferDetailViewState) other).transfer);
    }

    public int hashCode() {
        NonOriginatedAchTransfer nonOriginatedAchTransfer = this.transfer;
        if (nonOriginatedAchTransfer == null) {
            return 0;
        }
        return nonOriginatedAchTransfer.hashCode();
    }

    public String toString() {
        return "NonOriginatedAchTransferDetailViewState(transfer=" + this.transfer + ")";
    }

    public NonOriginatedAchTransferDetailViewState(NonOriginatedAchTransfer nonOriginatedAchTransfer) {
        ServerToBentoAssetMapper2 iconAsset;
        this.transfer = nonOriginatedAchTransfer;
        Integer numValueOf = null;
        GoldDepositBoostTransferDetail goldDepositBoost = nonOriginatedAchTransfer != null ? nonOriginatedAchTransfer.getGoldDepositBoost() : null;
        this.goldDepositBoost = goldDepositBoost;
        this.isGoldDepositBoostSectionVisible = ((goldDepositBoost != null ? goldDepositBoost.getAmountText() : null) == null || goldDepositBoost.getAmountTitle() == null) ? false : true;
        if (goldDepositBoost != null && (iconAsset = goldDepositBoost.getIconAsset()) != null) {
            numValueOf = Integer.valueOf(iconAsset.getResourceId());
        }
        this.goldDepositBoostIconRes = numValueOf;
    }

    public /* synthetic */ NonOriginatedAchTransferDetailViewState(NonOriginatedAchTransfer nonOriginatedAchTransfer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nonOriginatedAchTransfer);
    }

    public final NonOriginatedAchTransfer getTransfer() {
        return this.transfer;
    }

    public final String getTransferAmountValueText() {
        Money amount;
        NonOriginatedAchTransfer nonOriginatedAchTransfer = this.transfer;
        if (nonOriginatedAchTransfer == null || (amount = nonOriginatedAchTransfer.getAmount()) == null) {
            return null;
        }
        return Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getTransferGrantDateValueText() {
        LocalDate grantDate;
        NonOriginatedAchTransfer nonOriginatedAchTransfer = this.transfer;
        if (nonOriginatedAchTransfer == null || (grantDate = nonOriginatedAchTransfer.getGrantDate()) == null) {
            return null;
        }
        return LocalDateFormatter.MEDIUM.format((LocalDateFormatter) grantDate);
    }

    public final StringResource getTransferOriginatorText() {
        NonOriginatedAchTransfer nonOriginatedAchTransfer = this.transfer;
        Money.Direction direction = nonOriginatedAchTransfer != null ? nonOriginatedAchTransfer.getDirection() : null;
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return StringResource.INSTANCE.invoke(this.transfer.getOriginatorName());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getRobinhoodAccountText();
    }

    public final StringResource getTransferReceiverText() {
        NonOriginatedAchTransfer nonOriginatedAchTransfer = this.transfer;
        Money.Direction direction = nonOriginatedAchTransfer != null ? nonOriginatedAchTransfer.getDirection() : null;
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return getRobinhoodAccountText();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(this.transfer.getOriginatorName());
    }

    private final StringResource getRobinhoodAccountText() {
        int i;
        NonOriginatedAchTransfer nonOriginatedAchTransfer = this.transfer;
        if (nonOriginatedAchTransfer == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        if (Intrinsics.areEqual(nonOriginatedAchTransfer.isRedirected(), Boolean.TRUE)) {
            i = C39006R.string.payment_transfer_account_type_rhy;
        } else {
            i = C39006R.string.payment_transfer_account_type_individual;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final GoldDepositBoostTransferDetail getGoldDepositBoost() {
        return this.goldDepositBoost;
    }

    /* renamed from: isGoldDepositBoostSectionVisible, reason: from getter */
    public final boolean getIsGoldDepositBoostSectionVisible() {
        return this.isGoldDepositBoostSectionVisible;
    }

    public final Integer getGoldDepositBoostIconRes() {
        return this.goldDepositBoostIconRes;
    }
}
