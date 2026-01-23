package com.robinhood.android.crypto.tab.p093ui.recurring;

import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.recurring.CryptoRecurringViewState;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import com.robinhood.utils.Preconditions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoRecurringDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003J\t\u0010,\u001a\u00020\nHÂ\u0003J;\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010.\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0016HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` 0\u001d¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "accountNumber", "", "recurringCryptos", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getAccountNumber", "()Ljava/lang/String;", "loading", "", "getLoading", "()Z", "title", "", "getTitle", "()I", "description", "getDescription", "()Ljava/lang/Integer;", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "ctaText", "getCtaText", "navigationAction", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;", "getNavigationAction", "()Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoRecurringDataState {
    public static final int MAX_RECURRING_ITEMS = 3;
    private final String accountNumber;
    private final AppType appType;
    private final InvestmentScheduleKeyResolver investmentScheduleKeyResolver;
    private final ImmutableList<StatefulHistoryEvent<HistoryEvent>> items;
    private final List<InvestmentSchedule> recurringCryptos;
    public static final int $stable = 8;

    /* compiled from: CryptoRecurringDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final List<InvestmentSchedule> component3() {
        return this.recurringCryptos;
    }

    /* renamed from: component4, reason: from getter */
    private final InvestmentScheduleKeyResolver getInvestmentScheduleKeyResolver() {
        return this.investmentScheduleKeyResolver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoRecurringDataState copy$default(CryptoRecurringDataState cryptoRecurringDataState, AppType appType, String str, List list, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoRecurringDataState.appType;
        }
        if ((i & 2) != 0) {
            str = cryptoRecurringDataState.accountNumber;
        }
        if ((i & 4) != 0) {
            list = cryptoRecurringDataState.recurringCryptos;
        }
        if ((i & 8) != 0) {
            investmentScheduleKeyResolver = cryptoRecurringDataState.investmentScheduleKeyResolver;
        }
        return cryptoRecurringDataState.copy(appType, str, list, investmentScheduleKeyResolver);
    }

    /* renamed from: component1, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final CryptoRecurringDataState copy(AppType appType, String accountNumber, List<InvestmentSchedule> recurringCryptos, InvestmentScheduleKeyResolver investmentScheduleKeyResolver) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
        return new CryptoRecurringDataState(appType, accountNumber, recurringCryptos, investmentScheduleKeyResolver);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoRecurringDataState)) {
            return false;
        }
        CryptoRecurringDataState cryptoRecurringDataState = (CryptoRecurringDataState) other;
        return this.appType == cryptoRecurringDataState.appType && Intrinsics.areEqual(this.accountNumber, cryptoRecurringDataState.accountNumber) && Intrinsics.areEqual(this.recurringCryptos, cryptoRecurringDataState.recurringCryptos) && Intrinsics.areEqual(this.investmentScheduleKeyResolver, cryptoRecurringDataState.investmentScheduleKeyResolver);
    }

    public int hashCode() {
        int iHashCode = this.appType.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<InvestmentSchedule> list = this.recurringCryptos;
        return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.investmentScheduleKeyResolver.hashCode();
    }

    public String toString() {
        return "CryptoRecurringDataState(appType=" + this.appType + ", accountNumber=" + this.accountNumber + ", recurringCryptos=" + this.recurringCryptos + ", investmentScheduleKeyResolver=" + this.investmentScheduleKeyResolver + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CryptoRecurringDataState(AppType appType, String str, List<InvestmentSchedule> list, InvestmentScheduleKeyResolver investmentScheduleKeyResolver) {
        ImmutableList<StatefulHistoryEvent<HistoryEvent>> immutableListPersistentListOf;
        List listTake;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
        this.appType = appType;
        this.accountNumber = str;
        this.recurringCryptos = list;
        this.investmentScheduleKeyResolver = investmentScheduleKeyResolver;
        if (list != null) {
            final Comparator comparator = new Comparator() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDataState$special$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Boolean.valueOf(((InvestmentSchedule) t).isPaused()), Boolean.valueOf(((InvestmentSchedule) t2).isPaused()));
                }
            };
            final Comparator comparator2 = new Comparator() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDataState$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator.compare(t, t2);
                    return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(((InvestmentSchedule) t).getNextInvestmentDate(), ((InvestmentSchedule) t2).getNextInvestmentDate());
                }
            };
            final Comparator comparator3 = new Comparator() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDataState$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator2.compare(t, t2);
                    return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(((InvestmentSchedule) t).getFrequency(), ((InvestmentSchedule) t2).getFrequency());
                }
            };
            List listSortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDataState$special$$inlined$thenBy$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator3.compare(t, t2);
                    return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(((InvestmentSchedule) t).getInvestmentTarget().getInstrumentSymbol(), ((InvestmentSchedule) t2).getInvestmentTarget().getInstrumentSymbol());
                }
            });
            if (listSortedWith == null || (listTake = CollectionsKt.take(listSortedWith, 3)) == null) {
                immutableListPersistentListOf = extensions2.persistentListOf();
            } else {
                List list2 = listTake;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InvestmentSchedule) it.next()).toStatefulHistoryEvent());
                }
                immutableListPersistentListOf = extensions2.toImmutableList(arrayList);
                if (immutableListPersistentListOf == null) {
                }
            }
        }
        this.items = immutableListPersistentListOf;
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getLoading() {
        return this.accountNumber == null || this.recurringCryptos == null;
    }

    public final int getTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            Preconditions.INSTANCE.failUnknownEnumKotlin(null);
            throw new ExceptionsH();
        }
        if (i == 2) {
            return C13013R.string.rhc_recurring_title;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C13013R.string.crypto_recurring_title;
    }

    public final Integer getDescription() {
        List<InvestmentSchedule> list;
        if (this.appType == AppType.RHC && (list = this.recurringCryptos) != null && list.isEmpty()) {
            return Integer.valueOf(C13013R.string.rhc_nux_description_v2);
        }
        return null;
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getItems() {
        return this.items;
    }

    public final int getCtaText() {
        if (!this.items.isEmpty()) {
            return C13013R.string.crypto_recurring_cta;
        }
        return C13013R.string.crypto_recurring_create_cta;
    }

    public final CryptoRecurringViewState.RecurringNavigationAction getNavigationAction() {
        String str = this.accountNumber;
        if (str == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            Preconditions.INSTANCE.failUnknownEnumKotlin(null);
            throw new ExceptionsH();
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return new CryptoRecurringViewState.RecurringNavigationAction.ShowFragment(new RecurringHubFragmentKey(str));
        }
        if (!this.items.isEmpty()) {
            return new CryptoRecurringViewState.RecurringNavigationAction.ShowFragment(new RecurringHubFragmentKey(str));
        }
        return new CryptoRecurringViewState.RecurringNavigationAction.ShowFragmentInStandaloneRdsActivity(this.investmentScheduleKeyResolver.getRecurringSelectionKey());
    }
}
