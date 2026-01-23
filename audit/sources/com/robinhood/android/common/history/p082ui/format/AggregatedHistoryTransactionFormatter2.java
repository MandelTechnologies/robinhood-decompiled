package com.robinhood.android.common.history.p082ui.format;

import android.content.res.Resources;
import com.robinhood.android.common.format.AbstractFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AggregatedHistoryTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\n*\u00020\u0002\"\u0004\b\u0001\u0010\t2\u0006\u0010\u000b\u001a\u0002H\n2#\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\t0\r¢\u0006\u0002\b\u000fH\u0082\b¢\u0006\u0002\u0010\u0010J]\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\n*\u00020\u0002\"\u0004\b\u0001\u0010\t2\u0006\u0010\u000b\u001a\u0002H\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122+\u0010\f\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u0002H\t0\u0013¢\u0006\u0002\b\u000fH\u0082\b¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\"2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001a\u0010.\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/AbstractAggregatedHistoryTransactionFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "Lcom/robinhood/android/common/history/ui/format/AggregatedHistoryTransactionFormatter;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "format", "R", "T", "transaction", "func", "Lkotlin/Function2;", "Lcom/robinhood/android/common/history/ui/format/HistoryTransactionFormatter;", "Lkotlin/ExtensionFunctionType;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "withholding", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "Lkotlin/Function3;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;Lcom/robinhood/models/db/bonfire/WithholdingAmount;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "hasCompletedExceptionally", "", "getPrimaryText", "", "getSecondaryText", "getAmountText", "getMetadataPrimaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "isAmountTextDisabled", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "getMerchantName", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getSecondarySummaryRows", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "getPlaceholderSummary", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "getLayoutType", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;", "transformTransactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getSummary", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.format.AbstractAggregatedHistoryTransactionFormatter, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class AggregatedHistoryTransactionFormatter2 extends AbstractMinervaTransactionFormatter<MinervaTransaction> implements AggregatedHistoryTransactionFormatter {
    public static final int $stable = AbstractFormatter.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedHistoryTransactionFormatter2(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    private final <T extends MinervaTransaction, R> R format(T transaction, Function2<? super HistoryTransactionFormatter<? super T>, ? super T, ? extends R> func) {
        return func.invoke(get(transaction), transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(MinervaTransaction transaction, WithholdingAmount withholding) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (withholding == null) {
            return get(transaction).getAmountText(transaction);
        }
        return get(transaction).getAmountText(transaction, withholding);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.LayoutType getLayoutType(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).getLayoutType(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public List<TransactionLineItem> mo25632getLineItems(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).mo25632getLineItems(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMerchantName(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).getMerchantName(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataPrimaryTextIcon(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).getMetadataPrimaryTextIcon(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).getMetadataSecondaryText(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).getMetadataSecondaryTextIcon(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).getPrimaryText(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public List<TransactionSummary.SecondarySummary> getSecondarySummaryRows(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).getSecondarySummaryRows(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).getSecondaryText((HistoryTransactionFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).hasCompletedExceptionally(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean isAmountTextDisabled(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).isAmountTextDisabled(transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionReference transformTransactionReference(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return get(transaction).transformTransactionReference(transaction);
    }

    private final <T extends MinervaTransaction, R> R format(T transaction, WithholdingAmount withholding, Function3<? super HistoryTransactionFormatter<? super T>, ? super T, ? super WithholdingAmount, ? extends R> func) {
        return func.invoke(get(transaction), transaction, withholding);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter
    public TransactionSummary getPlaceholderSummary(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        return new TransactionSummary(false, (CharSequence) "", getSecondaryText(historyEvent), HistoryTransactionFormatter.DefaultImpls.getAmountText$default(this, historyEvent, false, false, 6, null), false, (CharSequence) null, (TransactionSummary.Icon) null, (TransactionReference) null, (TransactionSummary.Badge) null, (List) null, (TransactionSummary.LayoutType) null, 2032, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter
    public TransactionSummary getSummary(MinervaTransaction transaction, WithholdingAmount withholding) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        boolean zHasCompletedExceptionally = hasCompletedExceptionally(transaction);
        CharSequence primaryText = getPrimaryText(transaction);
        CharSequence secondaryText = getSecondaryText(transaction);
        TransactionSummary.MetadataPrimaryComponent metadataPrimaryText = getMetadataPrimaryText(transaction, withholding);
        boolean zIsAmountTextDisabled = isAmountTextDisabled(transaction);
        CharSequence metadataSecondaryText = getMetadataSecondaryText(transaction);
        TransactionSummary.Icon metadataSecondaryTextIcon = getMetadataSecondaryTextIcon(transaction);
        List<TransactionSummary.SecondarySummary> secondarySummaryRows = getSecondarySummaryRows(transaction);
        return new TransactionSummary(zHasCompletedExceptionally, primaryText, secondaryText, metadataPrimaryText, zIsAmountTextDisabled, metadataSecondaryText, metadataSecondaryTextIcon, transformTransactionReference(transaction), get(transaction).getSummaryBadge(transaction), secondarySummaryRows, getLayoutType(transaction));
    }
}
