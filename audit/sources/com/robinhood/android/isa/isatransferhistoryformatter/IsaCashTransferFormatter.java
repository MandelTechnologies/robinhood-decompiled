package com.robinhood.android.isa.isatransferhistoryformatter;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaCashTransferDetails;
import com.robinhood.android.isa.models.isa.p163db.entity.TransactionState;
import com.robinhood.common.strings.C32428R;
import com.robinhood.shared.models.history.IsaCashTransferTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaCashTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferhistoryformatter/IsaCashTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/IsaCashTransferTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getAmountText", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "lib-isa-transfer-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaCashTransferFormatter extends AbstractMinervaTransactionFormatter<IsaCashTransferTransaction> {

    /* compiled from: IsaCashTransferFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionState.values().length];
            try {
                iArr[TransactionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionState.PENDING_TRANSFER_INITIATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionState.TRANSFER_INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionState.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransactionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransactionState.PENDING_REVERSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransactionState.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransactionState.PENDING_CANCEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransactionState.CANCEL_REQUESTED_UNCONFIRMED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((IsaCashTransferTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaCashTransferFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(IsaCashTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        IsaCashTransferDetails isaCashTransferDetails = transaction.getEvent().getIsaCashTransferDetails();
        String providerName = isaCashTransferDetails != null ? isaCashTransferDetails.getProviderName() : null;
        if (providerName == null) {
            providerName = "";
        }
        return getString(C19941R.string.isa_cash_transfer_primary_text, providerName);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(IsaCashTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return "";
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(IsaCashTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        switch (WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getState().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new TransactionSummary.Badge(getString(C32428R.string.order_state_pending), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
            case 4:
                return null;
            case 5:
            case 6:
                return new TransactionSummary.Badge(getString(C32428R.string.order_state_failed), TransactionSummary.Tint.NEGATIVE, false, 4, null);
            case 7:
                return new TransactionSummary.Badge(getString(C19941R.string.canceled_label), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
            case 8:
            case 9:
                return new TransactionSummary.Badge(getString(C32428R.string.order_state_pending_cancel), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public Void getLineItems(IsaCashTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("ISA cash transfers currently have their own history");
    }
}
