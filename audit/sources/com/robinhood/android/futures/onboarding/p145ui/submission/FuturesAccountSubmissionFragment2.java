package com.robinhood.android.futures.onboarding.p145ui.submission;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesAccountSubmissionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesAccountSubmissionFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesAccountSubmissionFragment2(Object obj) {
        super(0, obj, FuturesAccountSubmissionDuxo.class, "retrySubmission", "retrySubmission()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesAccountSubmissionDuxo) this.receiver).retrySubmission();
    }
}
