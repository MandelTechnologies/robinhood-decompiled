package com.robinhood.android.cash.disputes.p070ui.question;

import kotlin.Metadata;

/* compiled from: ResponseValidationState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DefaultResponseValidationState;", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationState;", "isValidationRequestLoading", "", "<init>", "(Z)V", "isContinueButtonLoading", "()Z", "isSkipButtonEnabled", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.question.DefaultResponseValidationState, reason: use source file name */
/* loaded from: classes7.dex */
public final class ResponseValidationState2 implements ResponseValidationState {
    public static final int $stable = 0;
    private final boolean isValidationRequestLoading;

    public ResponseValidationState2(boolean z) {
        this.isValidationRequestLoading = z;
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState
    /* renamed from: isContinueButtonLoading, reason: from getter */
    public boolean getIsValidationRequestLoading() {
        return this.isValidationRequestLoading;
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState
    public boolean isSkipButtonEnabled() {
        return !this.isValidationRequestLoading;
    }
}
