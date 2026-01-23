package com.robinhood.android.common.history.p082ui.format;

import android.content.res.Resources;
import com.robinhood.android.common.format.AbstractFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.historyformatter.C18451R;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: AbstractMinervaTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u001f\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017J*\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J \u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u001bJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0017\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00020*2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010+J\u0015\u0010,\u001a\u00020-2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "T", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "Lcom/robinhood/android/common/format/AbstractFormatter;", "Lcom/robinhood/android/common/history/ui/format/HistoryTransactionFormatter;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getSecondaryText", "", "transaction", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Ljava/lang/CharSequence;", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "hasCompletedExceptionally", "", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Z", "getMerchantName", "getMetadataPrimaryText", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "withholding", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;Lcom/robinhood/models/db/bonfire/WithholdingAmount;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$MetadataPrimaryComponent;", "getAmountText", "hideDebitPrefix", "hideCreditPrefix", "(Lcom/robinhood/shared/models/history/MinervaTransaction;Lcom/robinhood/models/db/bonfire/WithholdingAmount;)Ljava/lang/CharSequence;", "getMetadataPrimaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "isAmountTextDisabled", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getSecondarySummaryRows", "", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Ljava/util/List;", "getLayoutType", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$LayoutType;", "transformTransactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/shared/models/history/shared/TransactionReference;", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class AbstractMinervaTransactionFormatter<T extends MinervaTransaction> extends AbstractFormatter implements HistoryTransactionFormatter<T> {
    public static final int $stable = AbstractFormatter.$stable;

    /* compiled from: AbstractMinervaTransactionFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoryEvent.State.values().length];
            try {
                iArr[HistoryEvent.State.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryEvent.State.SETTLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CharSequence getMerchantName(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return null;
    }

    public TransactionSummary.Icon getMetadataPrimaryTextIcon(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return null;
    }

    public CharSequence getMetadataSecondaryText(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return null;
    }

    public TransactionSummary.Icon getMetadataSecondaryTextIcon(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return null;
    }

    public boolean hasCompletedExceptionally(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return false;
    }

    public boolean isAmountTextDisabled(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMinervaTransactionFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    public CharSequence getSecondaryText(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return getSecondaryText(transaction.getEvent());
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        Instant initiatedAt = historyEvent.getInitiatedAt();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR.format((LocalDateFormatter) Instants.toLocalDate(initiatedAt, zoneIdSystemDefault));
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.MetadataPrimaryComponent getMetadataPrimaryText(T transaction, WithholdingAmount withholding) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CharSequence amountText = getAmountText(transaction, withholding);
        TransactionSummary.Icon metadataPrimaryTextIcon = getMetadataPrimaryTextIcon(transaction);
        if (StringsKt.isBlank(amountText) && metadataPrimaryTextIcon != null) {
            return metadataPrimaryTextIcon;
        }
        if (!StringsKt.isBlank(amountText) && metadataPrimaryTextIcon != null) {
            return new TransactionSummary.MetadataPrimaryComponent.IconText(metadataPrimaryTextIcon, amountText);
        }
        return new TransactionSummary.MetadataPrimaryComponent.Text(amountText);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence getAmountText(HistoryEvent historyEvent, boolean hideDebitPrefix, boolean hideCreditPrefix, WithholdingAmount withholding) {
        Money.Adjustment adjustment;
        Money amount;
        Money moneyAbs;
        Money amount2;
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        if (withholding != null && (amount2 = withholding.getAmount()) != null) {
            Money.Adjustment adjustment2 = historyEvent.getAdjustment();
            adjustment = adjustment2 != null ? adjustment2.minus(amount2) : null;
            if (adjustment == null) {
            }
        } else {
            adjustment = historyEvent.getAdjustment();
        }
        if ((adjustment != null ? adjustment.getDirection() : null) != Money.Direction.DEBIT || !hideDebitPrefix) {
            str = adjustment != null ? Money.Adjustment.format$default(adjustment, !hideCreditPrefix, null, 2, null) : null;
            return str == null ? "" : str;
        }
        if (adjustment != null && (amount = adjustment.getAmount()) != null && (moneyAbs = amount.abs()) != null) {
            str = Money.format$default(moneyAbs, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        return str == null ? "" : str;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(HistoryEvent historyEvent, boolean hideDebitPrefix, boolean hideCreditPrefix) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        return getAmountText(historyEvent, hideDebitPrefix, hideCreditPrefix, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return HistoryTransactionFormatter.DefaultImpls.getAmountText$default(this, transaction.getEvent(), false, false, 6, null);
    }

    public CharSequence getAmountText(T transaction, WithholdingAmount withholding) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return HistoryTransactionFormatter.DefaultImpls.getAmountText$default(this, transaction.getEvent(), false, false, withholding, 6, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getHistoryState().ordinal()];
        if (i == 1) {
            return new TransactionSummary.Badge(getString(C18451R.string.transaction_badge_pending), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (i == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public List<TransactionSummary.SecondarySummary> getSecondarySummaryRows(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return CollectionsKt.emptyList();
    }

    public TransactionSummary.LayoutType getLayoutType(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return TransactionSummary.LayoutType.DEFAULT;
    }

    public TransactionReference transformTransactionReference(T transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getTransactionReference();
    }
}
