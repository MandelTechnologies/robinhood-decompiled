package com.robinhood.android.feature.margin.hub;

import com.robinhood.android.feature.margin.hub.MarginStatusDetailState3;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginStatusDetailView;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginStatusDetailState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailDataState;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class MarginStatusDetailState2 implements StateProvider<MarginStatusDetailDataState, MarginStatusDetailState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MarginStatusDetailState3 reduce(MarginStatusDetailDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MarginStatusDetailView marginStatusDetailResponse = dataState.getMarginStatusDetailResponse();
        if (marginStatusDetailResponse != null) {
            if (marginStatusDetailResponse instanceof MarginStatusDetailView.Success) {
                return new MarginStatusDetailState3.Loaded((MarginStatusDetailView.Success) marginStatusDetailResponse);
            }
            if (marginStatusDetailResponse instanceof MarginStatusDetailView.Error) {
                return new MarginStatusDetailState3.Failure(((MarginStatusDetailView.Error) marginStatusDetailResponse).getException());
            }
            throw new NoWhenBranchMatchedException();
        }
        return MarginStatusDetailState3.Loading.INSTANCE;
    }
}
