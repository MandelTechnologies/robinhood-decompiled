package com.robinhood.android.dashboard;

import com.robinhood.WatchlistFragmentCallbacks;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeDashboardFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.HomeDashboardFragment$ComposeContent$positionNavigator$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class HomeDashboardFragment4 extends FunctionReferenceImpl implements Function1<LegacyFragmentKey.EquityInstrumentDetail, Unit> {
    HomeDashboardFragment4(Object obj) {
        super(1, obj, WatchlistFragmentCallbacks.class, "showEquityDetail", "showEquityDetail(Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EquityInstrumentDetail;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LegacyFragmentKey.EquityInstrumentDetail equityInstrumentDetail) {
        invoke2(equityInstrumentDetail);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LegacyFragmentKey.EquityInstrumentDetail p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((WatchlistFragmentCallbacks) this.receiver).showEquityDetail(p0);
    }
}
