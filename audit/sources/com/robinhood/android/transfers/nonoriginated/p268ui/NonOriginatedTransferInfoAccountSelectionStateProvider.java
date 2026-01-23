package com.robinhood.android.transfers.nonoriginated.p268ui;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData2;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtils4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;

/* compiled from: NonOriginatedTransferInfoAccountSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDataState;", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionViewState;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "dataState", "reduce", "(Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDataState;)Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionViewState;", "Lj$/time/Clock;", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class NonOriginatedTransferInfoAccountSelectionStateProvider implements StateProvider<NonOriginatedTransferInfoAccountSelectionDataState, NonOriginatedTransferInfoAccountSelectionViewState> {
    public static final int $stable = 8;
    private final Clock clock;

    public NonOriginatedTransferInfoAccountSelectionStateProvider(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public NonOriginatedTransferInfoAccountSelectionViewState reduce(NonOriginatedTransferInfoAccountSelectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<Account> listFilterByTransferType = NonOriginatedTransferInfoAccountSelectionStateProvider2.filterByTransferType(AccountSwitcherUtils4.filterDeactivatedForSwitcher(dataState.getAccounts()), dataState.getTransferType());
        List arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterByTransferType, 10));
        Iterator<T> it = listFilterByTransferType.iterator();
        while (it.hasNext()) {
            arrayList.add(AccountSelectorData2.toAccountSelectorRowData$default((Account) it.next(), null, null, null, false, null, 31, null));
        }
        RhyAccount rhyAccount = dataState.getRhyAccount();
        if ((rhyAccount != null ? NonOriginatedTransferInfoAccountSelectionStateProvider2.filterByTransferType(rhyAccount, dataState.getTransferType()) : null) != null) {
            arrayList = CollectionsKt.toMutableList((Collection) arrayList);
            arrayList.add(NonOriginatedTransferInfoAccountSelectionStateProvider2.toAccountSelectorRowData(dataState.getRhyAccount(), this.clock));
        }
        return new NonOriginatedTransferInfoAccountSelectionViewState(NonOriginatedTransferInfoAccountSelectionStateProvider2.title(dataState), extensions2.toImmutableList(arrayList));
    }
}
