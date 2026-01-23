package com.robinhood.android.slip.onboarding.agreements.previouslysigned;

import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipPreviouslySignedAgreementsStore;
import com.robinhood.models.api.ApiPreviouslySignedAgreements;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipPreviouslySignedAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/previouslysigned/SlipPreviouslySignedAgreementsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/slip/onboarding/agreements/previouslysigned/SlipPreviouslySignedAgreementsViewState;", "Lcom/robinhood/android/slip/onboarding/agreements/previouslysigned/SlipPreviouslySignedAgreementsError;", "previouslySignedAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPreviouslySignedAgreementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPreviouslySignedAgreementsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipPreviouslySignedAgreementsDuxo extends BaseDuxo5<SlipPreviouslySignedAgreementsViewState, SlipPreviouslySignedAgreementsViewState2> {
    public static final int $stable = 8;
    private final SlipPreviouslySignedAgreementsStore previouslySignedAgreementsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipPreviouslySignedAgreementsDuxo(SlipPreviouslySignedAgreementsStore previouslySignedAgreementsStore, DuxoBundle duxoBundle) {
        super(new SlipPreviouslySignedAgreementsViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(previouslySignedAgreementsStore, "previouslySignedAgreementsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.previouslySignedAgreementsStore = previouslySignedAgreementsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C286171(null), 3, null);
    }

    /* compiled from: SlipPreviouslySignedAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsDuxo$onStart$1", m3645f = "SlipPreviouslySignedAgreementsDuxo.kt", m3646l = {23}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsDuxo$onStart$1 */
    static final class C286171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C286171(Continuation<? super C286171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286171 c286171 = SlipPreviouslySignedAgreementsDuxo.this.new C286171(continuation);
            c286171.L$0 = obj;
            return c286171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SlipPreviouslySignedAgreementsDuxo slipPreviouslySignedAgreementsDuxo = SlipPreviouslySignedAgreementsDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    SlipPreviouslySignedAgreementsStore slipPreviouslySignedAgreementsStore = slipPreviouslySignedAgreementsDuxo.previouslySignedAgreementsStore;
                    this.label = 1;
                    obj = slipPreviouslySignedAgreementsStore.getPreviouslySignedAgreements(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiPreviouslySignedAgreements) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            SlipPreviouslySignedAgreementsDuxo slipPreviouslySignedAgreementsDuxo2 = SlipPreviouslySignedAgreementsDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                slipPreviouslySignedAgreementsDuxo2.applyMutation(new SlipPreviouslySignedAgreementsDuxo2((ApiPreviouslySignedAgreements) objM28550constructorimpl, null));
            } else {
                slipPreviouslySignedAgreementsDuxo2.submit(new SlipPreviouslySignedAgreementsViewState2(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }
}
