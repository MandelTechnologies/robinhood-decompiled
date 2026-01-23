package com.robinhood.android.cortex.store.feedback;

import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DigestFeedbackStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$submitFeedbackEndpoint$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DigestFeedbackStore9 extends FunctionReferenceImpl implements Function2<DigestFeedback, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    DigestFeedbackStore9(Object obj) {
        super(2, obj, DigestFeedbackStore.class, "saveAction", "saveAction(Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DigestFeedback digestFeedback, Continuation<? super Unit> continuation) {
        return ((DigestFeedbackStore) this.receiver).saveAction(digestFeedback, continuation);
    }
}
