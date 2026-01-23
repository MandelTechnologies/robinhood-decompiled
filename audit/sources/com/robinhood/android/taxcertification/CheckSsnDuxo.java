package com.robinhood.android.taxcertification;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.identi.ApiVerifySsnRequest;
import com.robinhood.models.api.identi.ApiVerifySsnResponse;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CheckSsnDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/CheckSsnDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/taxcertification/CheckSsnViewState;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;)V", "verifySsn", "", "ssn", "", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CheckSsnDuxo extends OldBaseDuxo<CheckSsnViewState> {
    private final Identi identi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckSsnDuxo(Identi identi2) {
        super(new CheckSsnViewState(false, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        this.identi = identi2;
    }

    public final void verifySsn(String ssn) {
        Intrinsics.checkNotNullParameter(ssn, "ssn");
        applyMutation(new Function1() { // from class: com.robinhood.android.taxcertification.CheckSsnDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckSsnDuxo.verifySsn$lambda$0((CheckSsnViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C292782(ssn, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.taxcertification.CheckSsnDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckSsnDuxo.verifySsn$lambda$2(this.f$0, (CheckSsnViewState2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckSsnViewState verifySsn$lambda$0(CheckSsnViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CheckSsnViewState.copy$default(applyMutation, true, null, 2, null);
    }

    /* compiled from: CheckSsnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/taxcertification/SsnVerifyResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.taxcertification.CheckSsnDuxo$verifySsn$2", m3645f = "CheckSsnDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.taxcertification.CheckSsnDuxo$verifySsn$2 */
    static final class C292782 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CheckSsnViewState2>, Object> {
        final /* synthetic */ String $ssn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C292782(String str, Continuation<? super C292782> continuation) {
            super(2, continuation);
            this.$ssn = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckSsnDuxo.this.new C292782(this.$ssn, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CheckSsnViewState2> continuation) {
            return ((C292782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Identi identi2 = CheckSsnDuxo.this.identi;
                    ApiVerifySsnRequest apiVerifySsnRequest = new ApiVerifySsnRequest(this.$ssn);
                    this.label = 1;
                    obj = identi2.verifySsn(apiVerifySsnRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((ApiVerifySsnResponse) obj).is_verified()) {
                    return CheckSsnViewState2.PASSED;
                }
                return CheckSsnViewState2.FAILED;
            } catch (Exception e) {
                Integer httpStatusCode = Throwables.getHttpStatusCode(e);
                if (httpStatusCode != null && httpStatusCode.intValue() == 429) {
                    return CheckSsnViewState2.LOCKED_OUT;
                }
                return CheckSsnViewState2.OTHER_ERROR;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifySsn$lambda$2(CheckSsnDuxo checkSsnDuxo, final CheckSsnViewState2 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        checkSsnDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.taxcertification.CheckSsnDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckSsnDuxo.verifySsn$lambda$2$lambda$1(result, (CheckSsnViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckSsnViewState verifySsn$lambda$2$lambda$1(CheckSsnViewState2 checkSsnViewState2, CheckSsnViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(false, new UiEvent<>(checkSsnViewState2));
    }
}
