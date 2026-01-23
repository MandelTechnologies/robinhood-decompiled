package com.robinhood.android.pathfinder.corepages.supportlanding;

import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDataState;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.SupportLandingAccount;
import com.robinhood.models.p355ui.pathfinder.contexts.SupportLandingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SupportLandingStateProvider.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J(\u0010\b\u001a\u00020\t*\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J0\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState;", "<init>", "()V", "reduce", "dataState", "toViewState", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus;", "accountTypeToSelectedAccountNumber", "", "", "selectedAccountType", "getDisplayedAccount", "Lcom/robinhood/models/ui/SupportLandingAccount;", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SupportLandingStateProvider implements StateProvider<SupportLandingDataState, SupportLandingViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SupportLandingViewState reduce(SupportLandingDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SupportLandingContext context = dataState.getContext();
        String heading = context.getHeading();
        ImmutableList immutableList = extensions2.toImmutableList(context.getTabs());
        String selectedAccountType = dataState.getSelectedAccountType();
        Map<String, SupportLandingDataState.TabContentStatus> accountTypeToTabStatus = dataState.getAccountTypeToTabStatus();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(accountTypeToTabStatus.size()));
        Iterator<T> it = accountTypeToTabStatus.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), toViewState((SupportLandingDataState.TabContentStatus) entry.getValue(), dataState.getAccountTypeToSelectedAccountNumber(), dataState.getSelectedAccountType()));
        }
        return new SupportLandingViewState(heading, immutableList, selectedAccountType, linkedHashMap, dataState.isRefreshingInquiry());
    }

    private final SupportLandingViewState.TabContentStatus toViewState(SupportLandingDataState.TabContentStatus tabContentStatus, Map<String, String> map, String str) {
        if (tabContentStatus instanceof SupportLandingDataState.TabContentStatus.Loading) {
            return SupportLandingViewState.TabContentStatus.Loading.INSTANCE;
        }
        if (tabContentStatus instanceof SupportLandingDataState.TabContentStatus.Error) {
            return SupportLandingViewState.TabContentStatus.Error.INSTANCE;
        }
        if (!(tabContentStatus instanceof SupportLandingDataState.TabContentStatus.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        SupportLandingDataState.TabContentStatus.Success success = (SupportLandingDataState.TabContentStatus.Success) tabContentStatus;
        List<SupportLandingAccount> accounts2 = success.getAccounts();
        ArrayList<SupportLandingAccount> arrayList = new ArrayList();
        for (Object obj : accounts2) {
            SupportLandingAccount supportLandingAccount = (SupportLandingAccount) obj;
            if (supportLandingAccount.getDisplayName() != null && supportLandingAccount.getAccountNumber() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (SupportLandingAccount supportLandingAccount2 : arrayList) {
            String displayName = supportLandingAccount2.getDisplayName();
            Intrinsics.checkNotNull(displayName);
            String accountNumber = supportLandingAccount2.getAccountNumber();
            Intrinsics.checkNotNull(accountNumber);
            arrayList2.add(Tuples4.m3642to(displayName, accountNumber));
        }
        return new SupportLandingViewState.TabContentStatus.Success(arrayList2, arrayList2.size() > 1, getDisplayedAccount(success.getAccounts(), map, str));
    }

    private final SupportLandingAccount getDisplayedAccount(List<SupportLandingAccount> list, Map<String, String> map, String str) {
        Object next;
        String accountNumber = map.get(str);
        Object obj = null;
        if (accountNumber == null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                SupportLandingAccount supportLandingAccount = (SupportLandingAccount) next;
                if (supportLandingAccount.getAccountNumber() != null && supportLandingAccount.getDisplayName() != null) {
                    break;
                }
            }
            SupportLandingAccount supportLandingAccount2 = (SupportLandingAccount) next;
            accountNumber = supportLandingAccount2 != null ? supportLandingAccount2.getAccountNumber() : null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual(((SupportLandingAccount) next2).getAccountNumber(), accountNumber)) {
                obj = next2;
                break;
            }
        }
        SupportLandingAccount supportLandingAccount3 = (SupportLandingAccount) obj;
        return supportLandingAccount3 == null ? (SupportLandingAccount) CollectionsKt.firstOrNull((List) list) : supportLandingAccount3;
    }
}
