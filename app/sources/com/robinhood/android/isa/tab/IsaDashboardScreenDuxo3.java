package com.robinhood.android.isa.tab;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions2;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions4;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaDashboardScreenDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaDashboardScreenStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/isa/tab/IsaDashboardScreenDataState;", "Lcom/robinhood/android/isa/tab/IsaDashboardScreenViewState;", "<init>", "()V", "reduce", "dataState", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.tab.IsaDashboardScreenStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaDashboardScreenDuxo3 implements StateProvider<IsaDashboardScreenDataState, IsaDashboardScreenViewState> {
    public static final int $stable = 0;

    /* compiled from: IsaDashboardScreenDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.isa.tab.IsaDashboardScreenStateProvider$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IsaContributions2.values().length];
            try {
                iArr[IsaContributions2.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IsaContributions2.SOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public IsaDashboardScreenViewState reduce(IsaDashboardScreenDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        IsaContributions contributions = dataState.getContributions();
        IsaContributions2 contributionState = IsaContributions4.getContributionState(contributions != null ? IsaContributions4.findCurrentTaxYear(contributions) : null);
        int i = contributionState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contributionState.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        return new IsaDashboardScreenViewState(z);
    }
}
