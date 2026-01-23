package com.robinhood.android.indexes.detail;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDataState;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageViewState;", "<init>", "()V", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageStateProvider implements StateProvider<IndexDetailPageDataState, IndexDetailPageViewState> {
    public static final int $stable = 0;

    /* compiled from: IndexDetailPageStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public IndexDetailPageViewState reduce(IndexDetailPageDataState dataState) {
        BentoTheme4 bentoTheme4;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getPageDirection().ordinal()];
        if (i == 1) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        return new IndexDetailPageViewState(bentoTheme4, dataState.getTradeBarHeight(), dataState.getPnlUpdatesEnabled(), dataState.getAccountNumber(), dataState.getInstrumentId(), dataState.getSymbol());
    }
}
