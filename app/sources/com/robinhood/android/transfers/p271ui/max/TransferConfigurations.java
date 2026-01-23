package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConfigurations.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"initialMode", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getInitialMode", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "initialModeByPromotion", "getInitialModeByPromotion", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.TransferConfigurationsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferConfigurations {
    public static final CreateTransferViewState.Mode getInitialMode(TransferConfiguration transferConfiguration) {
        Intrinsics.checkNotNullParameter(transferConfiguration, "<this>");
        if (transferConfiguration instanceof TransferConfiguration.PdtPrevention) {
            return CreateTransferViewState.Mode.EDIT;
        }
        if (transferConfiguration instanceof TransferConfiguration.UpdateRecurringDeposit) {
            return CreateTransferViewState.Mode.EDIT;
        }
        BigDecimal amount = transferConfiguration.getAmount();
        if (amount == null) {
            amount = BigDecimal.ZERO;
        }
        return BigDecimals7.isZero(amount) ? CreateTransferViewState.Mode.EDIT : CreateTransferViewState.Mode.REVIEW;
    }

    public static final CreateTransferViewState.Mode getInitialModeByPromotion(TransferConfiguration transferConfiguration) {
        Intrinsics.checkNotNullParameter(transferConfiguration, "<this>");
        BigDecimal amount = transferConfiguration.getAmount();
        if (amount == null) {
            amount = BigDecimal.ZERO;
        }
        if (!BigDecimals7.isZero(amount) && (transferConfiguration.getEntryPoint() == MAXTransferContext.EntryPoint.INCENTIVE_PRE_DEPOSIT || transferConfiguration.getEntryPoint() == MAXTransferContext.EntryPoint.INCENTIVE_POST_DEPOSIT)) {
            return CreateTransferViewState.Mode.REVIEW;
        }
        return CreateTransferViewState.Mode.EDIT;
    }
}
