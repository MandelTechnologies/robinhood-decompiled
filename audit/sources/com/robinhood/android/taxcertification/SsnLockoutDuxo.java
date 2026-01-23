package com.robinhood.android.taxcertification;

import com.robinhood.android.taxcertification.SsnLockoutViewState2;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest2;
import com.robinhood.udf.UiEvent;
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

/* compiled from: SsnLockoutDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnLockoutDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/taxcertification/SsnLockoutViewState;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;)V", "makeNationalIdRequest", "", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SsnLockoutDuxo extends OldBaseDuxo<SsnLockoutViewState> {
    private final Identi identi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SsnLockoutDuxo(Identi identi2) {
        super(new SsnLockoutViewState(false, null, 2, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        this.identi = identi2;
    }

    public final void makeNationalIdRequest() {
        applyMutation(new Function1() { // from class: com.robinhood.android.taxcertification.SsnLockoutDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SsnLockoutDuxo.makeNationalIdRequest$lambda$0((SsnLockoutViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C292872(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.taxcertification.SsnLockoutDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SsnLockoutDuxo.makeNationalIdRequest$lambda$2(this.f$0, (DocumentRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.taxcertification.SsnLockoutDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SsnLockoutDuxo.makeNationalIdRequest$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SsnLockoutViewState makeNationalIdRequest$lambda$0(SsnLockoutViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SsnLockoutViewState.copy$default(applyMutation, true, null, 2, null);
    }

    /* compiled from: SsnLockoutDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/DocumentRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.taxcertification.SsnLockoutDuxo$makeNationalIdRequest$2", m3645f = "SsnLockoutDuxo.kt", m3646l = {22}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.taxcertification.SsnLockoutDuxo$makeNationalIdRequest$2 */
    static final class C292872 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DocumentRequest>, Object> {
        int label;

        C292872(Continuation<? super C292872> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SsnLockoutDuxo.this.new C292872(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DocumentRequest> continuation) {
            return ((C292872) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = SsnLockoutDuxo.this.identi;
                this.label = 1;
                obj = identi2.getSsnLockoutNationalIdRequest(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return DocumentRequest2.toUiModel((ApiDocumentRequest) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeNationalIdRequest$lambda$2(SsnLockoutDuxo ssnLockoutDuxo, final DocumentRequest docRequest) {
        Intrinsics.checkNotNullParameter(docRequest, "docRequest");
        ssnLockoutDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.taxcertification.SsnLockoutDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SsnLockoutDuxo.makeNationalIdRequest$lambda$2$lambda$1(docRequest, (SsnLockoutViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SsnLockoutViewState makeNationalIdRequest$lambda$2$lambda$1(DocumentRequest documentRequest, SsnLockoutViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(false, new UiEvent<>(new SsnLockoutViewState2.NationalIdRequest(documentRequest)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeNationalIdRequest$lambda$4(SsnLockoutDuxo ssnLockoutDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ssnLockoutDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.taxcertification.SsnLockoutDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SsnLockoutDuxo.makeNationalIdRequest$lambda$4$lambda$3(throwable, (SsnLockoutViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SsnLockoutViewState makeNationalIdRequest$lambda$4$lambda$3(Throwable th, SsnLockoutViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(false, new UiEvent<>(new SsnLockoutViewState2.Error(th)));
    }
}
