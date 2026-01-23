package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo9;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeSubmitResponse;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: PhoneOtpDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpDuxo$onContinue$2", m3645f = "PhoneOtpDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpDuxo$onContinue$2, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneOtpDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ String $phone;
    int label;
    final /* synthetic */ PhoneOtpDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneOtpDuxo4(PhoneOtpDuxo phoneOtpDuxo, String str, String str2, Continuation<? super PhoneOtpDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = phoneOtpDuxo;
        this.$phone = str;
        this.$code = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PhoneOtpDuxo4(this.this$0, this.$phone, this.$code, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PhoneOtpDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardStore creditCardStore = this.this$0.creditCardStore;
                String str = "+1" + this.$phone;
                String str2 = this.$code;
                this.label = 1;
                obj = creditCardStore.submitFraudAlertChallenge(str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FraudAlertChallengeSubmitResponse fraudAlertChallengeSubmitResponse = (FraudAlertChallengeSubmitResponse) obj;
            if (fraudAlertChallengeSubmitResponse != null) {
                if (!fraudAlertChallengeSubmitResponse.getFraudAlertChallengeSubmit().getSuccess()) {
                    this.this$0.applyMutation(new C123821(null));
                } else {
                    this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Underwrite.INSTANCE));
                }
            } else {
                Timber.INSTANCE.mo3353e("fraudAlertChallengeSubmit was null", new Object[0]);
                this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
            }
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            Timber.INSTANCE.mo3355e(th, "fraudAlertChallengeSubmit error", new Object[0]);
            this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PhoneOtpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneotp/PhoneOtpViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpDuxo$onContinue$2$1", m3645f = "PhoneOtpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpDuxo$onContinue$2$1 */
    static final class C123821 extends ContinuationImpl7 implements Function2<PhoneOtpViewState, Continuation<? super PhoneOtpViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C123821(Continuation<? super C123821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C123821 c123821 = new C123821(continuation);
            c123821.L$0 = obj;
            return c123821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PhoneOtpViewState phoneOtpViewState, Continuation<? super PhoneOtpViewState> continuation) {
            return ((C123821) create(phoneOtpViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PhoneOtpViewState.copy$default((PhoneOtpViewState) this.L$0, false, null, 2, null);
        }
    }
}
