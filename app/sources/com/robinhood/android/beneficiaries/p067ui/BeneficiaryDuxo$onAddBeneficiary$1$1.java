package com.robinhood.android.beneficiaries.p067ui;

import com.robinhood.android.beneficiaries.p067ui.BeneficiaryEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiaryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onAddBeneficiary$1$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class BeneficiaryDuxo$onAddBeneficiary$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    int label;
    final /* synthetic */ BeneficiaryDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryDuxo$onAddBeneficiary$1$1(BeneficiaryDuxo beneficiaryDuxo, String str, Continuation<? super BeneficiaryDuxo$onAddBeneficiary$1$1> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryDuxo;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BeneficiaryDuxo$onAddBeneficiary$1$1(this.this$0, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BeneficiaryDuxo$onAddBeneficiary$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C96601(this.$accountNumber, null));
            this.this$0.submit(new BeneficiaryEvent.NavigateToBeneficiaryIntroFlow(this.$accountNumber));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onAddBeneficiary$1$1$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onAddBeneficiary$1$1$1 */
    static final class C96601 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C96601(String str, Continuation<? super C96601> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96601 c96601 = new C96601(this.$accountNumber, continuation);
            c96601.L$0 = obj;
            return c96601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
            return ((C96601) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, this.$accountNumber, null, null, null, 3, null);
        }
    }
}
