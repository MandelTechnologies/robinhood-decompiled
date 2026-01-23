package com.robinhood.android.common.history.p082ui.format;

import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import java.util.List;
import kotlin.Metadata;

/* compiled from: HistoryTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0013J.\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J$\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\fH&J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J!\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010 J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010$J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\"2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010$J\u0015\u0010'\u001a\u00020(2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010)J\u0015\u0010*\u001a\u00020+2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010,¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/HistoryTransactionFormatter;", "T", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "", "getPrimaryText", "", "transaction", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Ljava/lang/CharSequence;", "getSecondaryText", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "hasCompletedExceptionally", "", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Z", "getMerchantName", "getMetadataPrimaryText", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "withholding", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;Lcom/robinhood/models/db/bonfire/WithholdingAmount;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "getAmountText", "hideDebitPrefix", "hideCreditPrefix", "(Lcom/robinhood/shared/models/history/MinervaTransaction;Lcom/robinhood/models/db/bonfire/WithholdingAmount;)Ljava/lang/CharSequence;", "getMetadataPrimaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "isAmountTextDisabled", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Ljava/util/List;", "getSecondarySummaryRows", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "getLayoutType", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;", "transformTransactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/shared/models/history/shared/TransactionReference;", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface HistoryTransactionFormatter<T extends MinervaTransaction> {
    CharSequence getAmountText(T transaction);

    CharSequence getAmountText(T transaction, WithholdingAmount withholding);

    CharSequence getAmountText(HistoryEvent historyEvent, boolean hideDebitPrefix, boolean hideCreditPrefix);

    CharSequence getAmountText(HistoryEvent historyEvent, boolean hideDebitPrefix, boolean hideCreditPrefix, WithholdingAmount withholding);

    TransactionSummary.LayoutType getLayoutType(T transaction);

    /* renamed from: getLineItems */
    List<TransactionLineItem> mo25632getLineItems(T transaction);

    CharSequence getMerchantName(T transaction);

    TransactionSummary.MetadataPrimaryComponent getMetadataPrimaryText(T transaction, WithholdingAmount withholding);

    TransactionSummary.Icon getMetadataPrimaryTextIcon(T transaction);

    CharSequence getMetadataSecondaryText(T transaction);

    TransactionSummary.Icon getMetadataSecondaryTextIcon(T transaction);

    CharSequence getPrimaryText(T transaction);

    List<TransactionSummary.SecondarySummary> getSecondarySummaryRows(T transaction);

    CharSequence getSecondaryText(T transaction);

    CharSequence getSecondaryText(HistoryEvent historyEvent);

    TransactionSummary.Badge getSummaryBadge(T transaction);

    boolean hasCompletedExceptionally(T transaction);

    boolean isAmountTextDisabled(T transaction);

    TransactionReference transformTransactionReference(T transaction);

    /* compiled from: HistoryTransactionFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ TransactionSummary.MetadataPrimaryComponent getMetadataPrimaryText$default(HistoryTransactionFormatter historyTransactionFormatter, MinervaTransaction minervaTransaction, WithholdingAmount withholdingAmount, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMetadataPrimaryText");
            }
            if ((i & 2) != 0) {
                withholdingAmount = null;
            }
            return historyTransactionFormatter.getMetadataPrimaryText(minervaTransaction, withholdingAmount);
        }

        public static /* synthetic */ CharSequence getAmountText$default(HistoryTransactionFormatter historyTransactionFormatter, HistoryEvent historyEvent, boolean z, boolean z2, WithholdingAmount withholdingAmount, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAmountText");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return historyTransactionFormatter.getAmountText(historyEvent, z, z2, withholdingAmount);
        }

        public static /* synthetic */ CharSequence getAmountText$default(HistoryTransactionFormatter historyTransactionFormatter, HistoryEvent historyEvent, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAmountText");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return historyTransactionFormatter.getAmountText(historyEvent, z, z2);
        }

        public static /* synthetic */ CharSequence getAmountText$default(HistoryTransactionFormatter historyTransactionFormatter, MinervaTransaction minervaTransaction, WithholdingAmount withholdingAmount, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAmountText");
            }
            if ((i & 2) != 0) {
                withholdingAmount = null;
            }
            return historyTransactionFormatter.getAmountText(minervaTransaction, withholdingAmount);
        }
    }
}
