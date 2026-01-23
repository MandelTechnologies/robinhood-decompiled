package com.robinhood.signagreements;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.shared.agreements.contracts.SignAgreements;
import com.robinhood.signagreements.SignAgreementsEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SignAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/signagreements/SignAgreementsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/signagreements/SignAgreementsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/agreements/AgreementsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "Companion", "feature-sign-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SignAgreementsDuxo extends BaseDuxo5<Unit, SignAgreementsEvent> implements HasSavedState {
    private final AgreementsStore agreementsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignAgreementsDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AgreementsStore agreementsStore) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        this.savedStateHandle = savedStateHandle;
        this.agreementsStore = agreementsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C412611(null), 3, null);
    }

    /* compiled from: SignAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.signagreements.SignAgreementsDuxo$onStart$1", m3645f = "SignAgreementsDuxo.kt", m3646l = {29, 30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.signagreements.SignAgreementsDuxo$onStart$1 */
    static final class C412611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C412611(Continuation<? super C412611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SignAgreementsDuxo.this.new C412611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C412611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:36|(1:(5:6|7|23|30|31)(2:10|11))(1:12))(5:14|32|15|(1:17)|22)|18|19|34|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            if (com.robinhood.android.agreements.AgreementsStore.signAgreement$default(r3, r4, null, null, r7, 6, null) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            r0 = e;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            C412611 c412611;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    AgreementsStore agreementsStore = SignAgreementsDuxo.this.agreementsStore;
                    String agreementType = ((SignAgreements) SignAgreementsDuxo.INSTANCE.getArgs((HasSavedState) SignAgreementsDuxo.this)).getAgreementType();
                    this.label = 1;
                    obj = agreementsStore.getAgreementWithContent(agreementType, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Exception e) {
                    e = e;
                    c412611 = this;
                    exc = e;
                    SignAgreementsDuxo.this.submit(new SignAgreementsEvent.Error(exc));
                    return Unit.INSTANCE;
                }
            }
            try {
            } catch (Exception e2) {
                exc = e2;
                c412611 = this;
                SignAgreementsDuxo.this.submit(new SignAgreementsEvent.Error(exc));
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c412611 = this;
                SignAgreementsDuxo.this.submit(SignAgreementsEvent.Success.INSTANCE);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            UiAgreementWithContent uiAgreementWithContent = (UiAgreementWithContent) obj;
            AgreementsStore agreementsStore2 = SignAgreementsDuxo.this.agreementsStore;
            this.label = 2;
            c412611 = this;
        }
    }

    /* compiled from: SignAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/signagreements/SignAgreementsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/signagreements/SignAgreementsDuxo;", "Lcom/robinhood/shared/agreements/contracts/SignAgreements;", "<init>", "()V", "feature-sign-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SignAgreementsDuxo, SignAgreements> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SignAgreements getArgs(SavedStateHandle savedStateHandle) {
            return (SignAgreements) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SignAgreements getArgs(SignAgreementsDuxo signAgreementsDuxo) {
            return (SignAgreements) DuxoCompanion.DefaultImpls.getArgs(this, signAgreementsDuxo);
        }
    }
}
