package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.additional.verification;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo4;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdditionalVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1", m3645f = "AdditionalVerificationDuxo.kt", m3646l = {29, 37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AdditionalVerificationDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdditionalVerificationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalVerificationDuxo3(AdditionalVerificationDuxo additionalVerificationDuxo, Continuation<? super AdditionalVerificationDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = additionalVerificationDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdditionalVerificationDuxo3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdditionalVerificationDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AdditionalVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1$1", m3645f = "AdditionalVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1$1 */
    static final class C125121 extends ContinuationImpl7 implements Function2<AdditionalVerificationViewState, Continuation<? super AdditionalVerificationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125121(Continuation<? super C125121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125121 c125121 = new C125121(continuation);
            c125121.L$0 = obj;
            return c125121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdditionalVerificationViewState additionalVerificationViewState, Continuation<? super AdditionalVerificationViewState> continuation) {
            return ((C125121) create(additionalVerificationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdditionalVerificationViewState.copy$default((AdditionalVerificationViewState) this.L$0, true, false, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C125121(null));
            CreditCardStore creditCardStore = this.this$0.creditCardStore;
            this.label = 1;
            obj = creditCardStore.getAccounts(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            this.this$0.applyMutation(new C125143(null));
            if (str == null) {
                this.this$0.submit(new AdditionalVerificationDuxo4.Run(CreditApplicationDuxo8.Error.INSTANCE));
            } else {
                this.this$0.submit(new AdditionalVerificationDuxo4.Run(new CreditApplicationDuxo8.PlaidSdkScreen(str, null, null)));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) obj;
        if (list == null) {
            this.this$0.applyMutation(new C125132(null));
            this.this$0.submit(new AdditionalVerificationDuxo4.Run(CreditApplicationDuxo8.Error.INSTANCE));
        } else if (list.isEmpty()) {
            CreditCardStore creditCardStore2 = this.this$0.creditCardStore;
            this.label = 2;
            obj = creditCardStore2.getPlaidLinkToken(this);
        } else {
            this.this$0.applyMutation(new C125154(null));
            this.this$0.submit(new AdditionalVerificationDuxo4.AccountSelection(list));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdditionalVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1$2", m3645f = "AdditionalVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1$2 */
    static final class C125132 extends ContinuationImpl7 implements Function2<AdditionalVerificationViewState, Continuation<? super AdditionalVerificationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125132(Continuation<? super C125132> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125132 c125132 = new C125132(continuation);
            c125132.L$0 = obj;
            return c125132;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdditionalVerificationViewState additionalVerificationViewState, Continuation<? super AdditionalVerificationViewState> continuation) {
            return ((C125132) create(additionalVerificationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdditionalVerificationViewState.copy$default((AdditionalVerificationViewState) this.L$0, false, false, 2, null);
        }
    }

    /* compiled from: AdditionalVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1$3", m3645f = "AdditionalVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1$3 */
    static final class C125143 extends ContinuationImpl7 implements Function2<AdditionalVerificationViewState, Continuation<? super AdditionalVerificationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125143(Continuation<? super C125143> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125143 c125143 = new C125143(continuation);
            c125143.L$0 = obj;
            return c125143;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdditionalVerificationViewState additionalVerificationViewState, Continuation<? super AdditionalVerificationViewState> continuation) {
            return ((C125143) create(additionalVerificationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdditionalVerificationViewState.copy$default((AdditionalVerificationViewState) this.L$0, false, false, 2, null);
        }
    }

    /* compiled from: AdditionalVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1$4", m3645f = "AdditionalVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationDuxo$onContinue$1$4 */
    static final class C125154 extends ContinuationImpl7 implements Function2<AdditionalVerificationViewState, Continuation<? super AdditionalVerificationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125154(Continuation<? super C125154> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125154 c125154 = new C125154(continuation);
            c125154.L$0 = obj;
            return c125154;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdditionalVerificationViewState additionalVerificationViewState, Continuation<? super AdditionalVerificationViewState> continuation) {
            return ((C125154) create(additionalVerificationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdditionalVerificationViewState.copy$default((AdditionalVerificationViewState) this.L$0, false, false, 2, null);
        }
    }
}
