package com.robinhood.microgram.experimentation;

import com.robinhood.microgram.experimentation.MicrogramExperimentManager;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramExperimentManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"has", "", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;", "experimentName", "", "(Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram-common-services"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.experimentation.MicrogramExperimentManagerKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class MicrogramExperimentManager2 {

    /* compiled from: MicrogramExperimentManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.experimentation.MicrogramExperimentManagerKt", m3645f = "MicrogramExperimentManager.kt", m3646l = {55}, m3647m = "has")
    /* renamed from: com.robinhood.microgram.experimentation.MicrogramExperimentManagerKt$has$1 */
    static final class C349611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349611(Continuation<? super C349611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MicrogramExperimentManager2.has(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object has(MicrogramExperimentManager microgramExperimentManager, String str, Continuation<? super Boolean> continuation) {
        C349611 c349611;
        if (continuation instanceof C349611) {
            c349611 = (C349611) continuation;
            int i = c349611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349611.label = i - Integer.MIN_VALUE;
            } else {
                c349611 = new C349611(continuation);
            }
        }
        C349611 c3496112 = c349611;
        Object objVariationForExperiment$default = c3496112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3496112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objVariationForExperiment$default);
            c3496112.label = 1;
            objVariationForExperiment$default = MicrogramExperimentManager.DefaultImpls.variationForExperiment$default(microgramExperimentManager, str, false, c3496112, 2, null);
            if (objVariationForExperiment$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objVariationForExperiment$default);
        }
        return boxing.boxBoolean(!Intrinsics.areEqual(objVariationForExperiment$default, KaizenExperiment.VARIATION_CONTROL));
    }
}
