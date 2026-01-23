package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.api.ApiSlipOnboardingLegacy;
import com.robinhood.models.p320db.SlipFaqs;
import com.robinhood.models.p320db.SlipFaqs2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/SlipFaqs;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipOnboardingStore$faqsEndpoint$1", m3645f = "SlipOnboardingStore.kt", m3646l = {22}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipOnboardingStore$faqsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipOnboardingStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super SlipFaqs>, Object> {
    final /* synthetic */ SlipApi $slipApi;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipOnboardingStore2(SlipApi slipApi, Continuation<? super SlipOnboardingStore2> continuation) {
        super(2, continuation);
        this.$slipApi = slipApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SlipOnboardingStore2(this.$slipApi, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super SlipFaqs> continuation) {
        return ((SlipOnboardingStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SlipApi slipApi = this.$slipApi;
            this.label = 1;
            obj = SlipApi.DefaultImpls.getSlipOnboardingLegacy$default(slipApi, false, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return SlipFaqs2.toFaqs((ApiSlipOnboardingLegacy) obj);
    }
}
