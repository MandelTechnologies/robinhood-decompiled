package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel;

import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel.RhyOverviewCarouselViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RhyOverviewCarouselStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselDataState;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;", "<init>", "()V", "reduce", "dataState", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyOverviewCarouselStateProvider implements StateProvider<RhyOverviewCarouselDataState, RhyOverviewCarouselViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RhyOverviewCarouselViewState reduce(RhyOverviewCarouselDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Boolean boolIsActiveAccount = dataState.isActiveAccount();
        if (boolIsActiveAccount == null) {
            return RhyOverviewCarouselViewState.Loading.INSTANCE;
        }
        if (Intrinsics.areEqual(boolIsActiveAccount, Boolean.FALSE)) {
            return RhyOverviewCarouselViewState.Hidden.INSTANCE;
        }
        if (Intrinsics.areEqual(boolIsActiveAccount, Boolean.TRUE)) {
            return dataState.getCarouselItems() == null ? RhyOverviewCarouselViewState.Loading.INSTANCE : dataState.getCarouselItems().isEmpty() ? RhyOverviewCarouselViewState.Hidden.INSTANCE : new RhyOverviewCarouselViewState.Loaded(extensions2.toImmutableList(dataState.getCarouselItems()), dataState.getCreditCardWaitlistFlowSimplified());
        }
        throw new NoWhenBranchMatchedException();
    }
}
