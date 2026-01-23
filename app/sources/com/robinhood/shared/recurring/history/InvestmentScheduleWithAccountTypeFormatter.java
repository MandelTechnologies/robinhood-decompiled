package com.robinhood.shared.recurring.history;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.shared.models.history.InvestmentScheduleTransaction;
import com.robinhood.shared.models.history.InvestmentScheduleWithAccountTypeTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleWithAccountTypeFormatter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J+\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u0016*\u00020\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002H\u00160\u0018H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/recurring/history/InvestmentScheduleWithAccountTypeFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/InvestmentScheduleWithAccountTypeTransaction;", "resources", "Landroid/content/res/Resources;", "investmentScheduleFormatter", "Lcom/robinhood/shared/recurring/history/InvestmentScheduleFormatter;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/shared/recurring/history/InvestmentScheduleFormatter;)V", "getPrimaryText", "", "transaction", "getSecondaryText", "getAmountText", "isAmountTextDisabled", "", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "transform", "T", "transformer", "Lkotlin/Function1;", "Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;", "(Lcom/robinhood/shared/models/history/InvestmentScheduleWithAccountTypeTransaction;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InvestmentScheduleWithAccountTypeFormatter extends AbstractMinervaTransactionFormatter<InvestmentScheduleWithAccountTypeTransaction> {
    private final InvestmentScheduleFormatter investmentScheduleFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentScheduleWithAccountTypeFormatter(Resources resources, InvestmentScheduleFormatter investmentScheduleFormatter) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(investmentScheduleFormatter, "investmentScheduleFormatter");
        this.investmentScheduleFormatter = investmentScheduleFormatter;
    }

    /* compiled from: InvestmentScheduleWithAccountTypeFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.recurring.history.InvestmentScheduleWithAccountTypeFormatter$getPrimaryText$1 */
    /* synthetic */ class C395511 extends FunctionReferenceImpl implements Function1<InvestmentScheduleTransaction, String> {
        C395511(Object obj) {
            super(1, obj, InvestmentScheduleFormatter.class, "getPrimaryText", "getPrimaryText(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(InvestmentScheduleTransaction p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InvestmentScheduleFormatter) this.receiver).getPrimaryText(p0);
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(InvestmentScheduleWithAccountTypeTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return (CharSequence) transform(transaction, new C395511(this.investmentScheduleFormatter));
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(InvestmentScheduleWithAccountTypeTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return getString(C39555R.string.history_row_preprended_secondary_text, transaction.getEvent().getAccountDisplayName().getText(getResources()), transform(transaction, new C395521(this.investmentScheduleFormatter)));
    }

    /* compiled from: InvestmentScheduleWithAccountTypeFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.recurring.history.InvestmentScheduleWithAccountTypeFormatter$getSecondaryText$1 */
    /* synthetic */ class C395521 extends FunctionReferenceImpl implements Function1<InvestmentScheduleTransaction, String> {
        C395521(Object obj) {
            super(1, obj, InvestmentScheduleFormatter.class, "getSecondaryText", "getSecondaryText(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(InvestmentScheduleTransaction p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InvestmentScheduleFormatter) this.receiver).getSecondaryText(p0);
        }
    }

    /* compiled from: InvestmentScheduleWithAccountTypeFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.recurring.history.InvestmentScheduleWithAccountTypeFormatter$getAmountText$1 */
    /* synthetic */ class C395491 extends FunctionReferenceImpl implements Function1<InvestmentScheduleTransaction, CharSequence> {
        C395491(Object obj) {
            super(1, obj, InvestmentScheduleFormatter.class, "getAmountText", "getAmountText(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/lang/CharSequence;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(InvestmentScheduleTransaction p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InvestmentScheduleFormatter) this.receiver).getAmountText(p0);
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(InvestmentScheduleWithAccountTypeTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return (CharSequence) transform(transaction, new C395491(this.investmentScheduleFormatter));
    }

    /* compiled from: InvestmentScheduleWithAccountTypeFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.recurring.history.InvestmentScheduleWithAccountTypeFormatter$isAmountTextDisabled$1 */
    /* synthetic */ class C395541 extends FunctionReferenceImpl implements Function1<InvestmentScheduleTransaction, Boolean> {
        C395541(Object obj) {
            super(1, obj, InvestmentScheduleFormatter.class, "isAmountTextDisabled", "isAmountTextDisabled(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(InvestmentScheduleTransaction p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(((InvestmentScheduleFormatter) this.receiver).isAmountTextDisabled(p0));
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean isAmountTextDisabled(InvestmentScheduleWithAccountTypeTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return ((Boolean) transform(transaction, new C395541(this.investmentScheduleFormatter))).booleanValue();
    }

    /* compiled from: InvestmentScheduleWithAccountTypeFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.recurring.history.InvestmentScheduleWithAccountTypeFormatter$getSummaryBadge$1 */
    /* synthetic */ class C395531 extends FunctionReferenceImpl implements Function1 {
        C395531(Object obj) {
            super(1, obj, InvestmentScheduleFormatter.class, "getSummaryBadge", "getSummaryBadge(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/lang/Void;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(InvestmentScheduleTransaction p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InvestmentScheduleFormatter) this.receiver).getSummaryBadge(p0);
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(InvestmentScheduleWithAccountTypeTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return (TransactionSummary.Badge) transform(transaction, new C395531(this.investmentScheduleFormatter));
    }

    /* compiled from: InvestmentScheduleWithAccountTypeFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.recurring.history.InvestmentScheduleWithAccountTypeFormatter$getLineItems$1 */
    /* synthetic */ class C395501 extends FunctionReferenceImpl implements Function1<InvestmentScheduleTransaction, List<? extends TransactionLineItem>> {
        C395501(Object obj) {
            super(1, obj, InvestmentScheduleFormatter.class, "getLineItems", "getLineItems(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<TransactionLineItem> invoke(InvestmentScheduleTransaction p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InvestmentScheduleFormatter) this.receiver).mo25632getLineItems(p0);
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(InvestmentScheduleWithAccountTypeTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return (List) transform(transaction, new C395501(this.investmentScheduleFormatter));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T transform(InvestmentScheduleWithAccountTypeTransaction investmentScheduleWithAccountTypeTransaction, Function1<? super InvestmentScheduleTransaction, ? extends T> function1) {
        return function1.invoke(new InvestmentScheduleTransaction(investmentScheduleWithAccountTypeTransaction.getEvent().getInvestmentSchedule(), null, 2, 0 == true ? 1 : 0));
    }
}
