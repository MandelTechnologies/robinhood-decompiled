package com.robinhood.shared.recurring.history;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.common.recurring.StringsKt;
import com.robinhood.android.crypto.lib.UiCurrencyPairs;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.models.history.InvestmentScheduleTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.utils.datetime.LocalDates;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleFormatter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/recurring/history/InvestmentScheduleFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Landroid/content/res/Resources;Lj$/time/Clock;)V", "transaction", "", "getPrimaryText", "(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/lang/String;", "getSecondaryText", "", "getAmountText", "(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/lang/CharSequence;", "", "isAmountTextDisabled", "(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Z", "", "getSummaryBadge", "(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/lang/Void;", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getLineItems", "(Lcom/robinhood/shared/models/history/InvestmentScheduleTransaction;)Ljava/util/List;", "Lj$/time/Clock;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InvestmentScheduleFormatter extends AbstractMinervaTransactionFormatter<InvestmentScheduleTransaction> {
    private final Clock clock;

    /* compiled from: InvestmentScheduleFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiInvestmentSchedule.State.values().length];
            try {
                iArr2[ApiInvestmentSchedule.State.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiInvestmentSchedule.State.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiInvestmentSchedule.State.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Void getSummaryBadge(InvestmentScheduleTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return null;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public /* bridge */ /* synthetic */ TransactionSummary.Badge getSummaryBadge(MinervaTransaction minervaTransaction) {
        return (TransactionSummary.Badge) getSummaryBadge((InvestmentScheduleTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentScheduleFormatter(Resources resources, Clock clock) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public String getPrimaryText(InvestmentScheduleTransaction transaction) {
        CharSequence instrumentSymbol;
        StringResource symbolWithTypeSingular;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = C39555R.string.investment_schedule_history_item_title_center_frequency;
        UiCurrencyPair currencyPair = transaction.getCurrencyPair();
        if (currencyPair == null || (symbolWithTypeSingular = UiCurrencyPairs.getSymbolWithTypeSingular(currencyPair)) == null || (instrumentSymbol = symbolWithTypeSingular.getText(getResources())) == null) {
            instrumentSymbol = transaction.getEvent().getInvestmentTarget().getInstrumentSymbol();
        }
        return getString(i, instrumentSymbol, getString(StringsKt.getLabelResIdLowercase(transaction.getEvent().getFrequency())));
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public String getSecondaryText(InvestmentScheduleTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        InvestmentSchedule event = transaction.getEvent();
        int i = WhenMappings.$EnumSwitchMapping$1[event.getState().ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                return getString(C39555R.string.investment_schedule_secondary_text_paused, getString(StringsKt.labelResId(transaction.getEvent().getFrequency(), transaction.getEvent().isCrypto())));
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return getString(C39555R.string.investment_schedule_secondary_text_deleted, getString(StringsKt.labelResId(transaction.getEvent().getFrequency(), transaction.getEvent().isCrypto())));
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[event.getFrequency().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return getString(C39555R.string.investment_schedule_secondary_text_active, getString(StringsKt.labelResId(transaction.getEvent().getFrequency(), transaction.getEvent().isCrypto())));
        }
        LocalDate nextInvestmentDate = transaction.getEvent().getNextInvestmentDate();
        String recent$default = null;
        LocalDate localDateCurrentDateInEst$default = LocalDates.currentDateInEst$default(null, 1, null);
        if (!Intrinsics.areEqual(nextInvestmentDate, localDateCurrentDateInEst$default.plusDays(-1L)) && !Intrinsics.areEqual(nextInvestmentDate, localDateCurrentDateInEst$default) && !Intrinsics.areEqual(nextInvestmentDate, localDateCurrentDateInEst$default.plusDays(1L))) {
            z = false;
        }
        if (nextInvestmentDate != null) {
            recent$default = LocalDates4.formatRecent$default(nextInvestmentDate, getResources(), LocalDateFormatter.MEDIUM, z ? null : Integer.valueOf(C39555R.string.investment_schedule_secondary_text_date), true, false, false, false, false, this.clock, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        }
        return recent$default == null ? getString(StringsKt.labelResId(transaction.getEvent().getFrequency(), transaction.getEvent().isCrypto())) : recent$default;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(InvestmentScheduleTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getInvestmentScheduleAmount().format();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean isAmountTextDisabled(InvestmentScheduleTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return !transaction.getEvent().isActive();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(InvestmentScheduleTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("Investment schedule currently have their own history detail"), false, null, 4, null);
        return CollectionsKt.emptyList();
    }
}
