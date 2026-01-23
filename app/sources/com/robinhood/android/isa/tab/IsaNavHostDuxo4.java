package com.robinhood.android.isa.tab;

import com.robinhood.android.isa.tab.IsaNavHostDuxo2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IsaNavHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaLoadingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/isa/tab/IsaLoadingDataState;", "Lcom/robinhood/android/isa/tab/IsaLoadingViewState;", "<init>", "()V", "reduce", "dataState", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.tab.IsaLoadingStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaNavHostDuxo4 implements StateProvider<IsaLoadingDataState, IsaLoadingViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public IsaLoadingViewState reduce(IsaLoadingDataState dataState) {
        IsaNavHostDuxo2 dashboard;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAccounts() == null) {
            dashboard = IsaNavHostDuxo2.Loading.INSTANCE;
        } else {
            List<Account> accounts2 = dataState.getAccounts();
            if ((accounts2 instanceof Collection) && accounts2.isEmpty()) {
                dashboard = IsaNavHostDuxo2.SignUp.INSTANCE;
            } else {
                Iterator<T> it = accounts2.iterator();
                while (it.hasNext()) {
                    if (!((Account) it.next()).getDeactivated()) {
                        dashboard = new IsaNavHostDuxo2.Dashboard(dataState.getAccounts());
                        break;
                    }
                }
                dashboard = IsaNavHostDuxo2.SignUp.INSTANCE;
            }
        }
        return new IsaLoadingViewState(dashboard);
    }
}
