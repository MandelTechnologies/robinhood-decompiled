package com.robinhood.android.matcha.p177ui.confirmation;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.models.matcha.api.MatchaAdditionalPagesResponse;
import com.robinhood.android.social.contracts.matcha.MatchaAdditionalPagesKey;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransactionSuccessStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessDataState;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessViewState;", "<init>", "()V", "reduce", "dataState", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaTransactionSuccessStateProvider implements StateProvider<MatchaTransactionSuccessDataState, MatchaTransactionSuccessViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MatchaTransactionSuccessViewState reduce(MatchaTransactionSuccessDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Result<MatchaAdditionalPagesResponse> resultM16325getMatchaAdditionalPagesxLWZpok = dataState.m16325getMatchaAdditionalPagesxLWZpok();
        if (resultM16325getMatchaAdditionalPagesxLWZpok == null) {
            return new MatchaTransactionSuccessViewState(null, null, 3, null);
        }
        Object value = resultM16325getMatchaAdditionalPagesxLWZpok.getValue();
        if (Result.m28553exceptionOrNullimpl(value) == null) {
            MatchaAdditionalPagesResponse matchaAdditionalPagesResponse = (MatchaAdditionalPagesResponse) value;
            if (!matchaAdditionalPagesResponse.getPages().isEmpty()) {
                return new MatchaTransactionSuccessViewState(new MatchaAdditionalPagesKey(matchaAdditionalPagesResponse), Integer.valueOf(C11048R.string.general_label_continue));
            }
            return new MatchaTransactionSuccessViewState(null, Integer.valueOf(C11048R.string.general_label_done));
        }
        return new MatchaTransactionSuccessViewState(null, Integer.valueOf(C11048R.string.general_label_done));
    }
}
