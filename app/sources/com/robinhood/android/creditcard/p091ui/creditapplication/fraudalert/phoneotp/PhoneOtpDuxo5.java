package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo9;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeManualReviewResponse;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: PhoneOtpDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpDuxo$onLandline$1", m3645f = "PhoneOtpDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpDuxo$onLandline$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneOtpDuxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $dismiss;
    final /* synthetic */ Function0<Unit> $onLandlinePressCallback;
    int label;
    final /* synthetic */ PhoneOtpDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneOtpDuxo5(PhoneOtpDuxo phoneOtpDuxo, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super PhoneOtpDuxo5> continuation) {
        super(2, continuation);
        this.this$0 = phoneOtpDuxo;
        this.$dismiss = function0;
        this.$onLandlinePressCallback = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PhoneOtpDuxo5(this.this$0, this.$dismiss, this.$onLandlinePressCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PhoneOtpDuxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardStore creditCardStore = this.this$0.creditCardStore;
                this.label = 1;
                obj = creditCardStore.submitFraudAlertChallengeManualReview(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FraudAlertChallengeManualReviewResponse fraudAlertChallengeManualReviewResponse = (FraudAlertChallengeManualReviewResponse) obj;
            if (fraudAlertChallengeManualReviewResponse != null) {
                if (fraudAlertChallengeManualReviewResponse.getFraudAlertChallengeManualReview().getSuccess()) {
                    this.$dismiss.invoke();
                    this.$onLandlinePressCallback.invoke();
                } else {
                    this.$dismiss.invoke();
                    this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
                }
            } else {
                Timber.INSTANCE.mo3353e("fraudAlertChallengeManualReview was null", new Object[0]);
                this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
            }
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            Timber.INSTANCE.mo3355e(th, "fraudAlertChallengeManualReview error", new Object[0]);
            this.this$0.submit(new CreditApplicationDuxo9.Run(CreditApplicationDuxo8.Error.INSTANCE));
        }
        return Unit.INSTANCE;
    }
}
