package com.robinhood.shared.security.verify.credentials;

import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.security.verify.credentials.VerifyCredentialsEvent;
import com.robinhood.shared.security.verify.credentials.VerifyCredentialsViewState;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyCredentialsDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;)V", "onBackPressed", "", "state", "onPrimaryCtaClicked", "onSecondaryCtaClicked", "onUpdateEmailSuccess", "email", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class VerifyCredentialsDuxo extends BaseDuxo5<VerifyCredentialsViewState, VerifyCredentialsEvent> {
    public static final int $stable = BaseDuxo5.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyCredentialsDuxo(DuxoBundle duxoBundle) {
        super(VerifyCredentialsViewState.ReviewEmail.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }

    public final void onBackPressed() {
        withDataState(new Function1() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyCredentialsDuxo.onBackPressed$lambda$0(this.f$0, (VerifyCredentialsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$0(VerifyCredentialsDuxo verifyCredentialsDuxo, VerifyCredentialsViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        verifyCredentialsDuxo.onBackPressed(it);
        return Unit.INSTANCE;
    }

    public final void onBackPressed(VerifyCredentialsViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof VerifyCredentialsViewState.ReviewEmail) {
            return;
        }
        if ((state instanceof VerifyCredentialsViewState.UpdateEmail) || (state instanceof VerifyCredentialsViewState.ReviewPassword)) {
            applyMutation(new C396972(null));
        } else if (state instanceof VerifyCredentialsViewState.CheckYourEmail) {
            applyMutation(new C396983(null));
        } else {
            if (!(state instanceof VerifyCredentialsViewState.UpdatePassword)) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C396994(null));
        }
    }

    /* compiled from: VerifyCredentialsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onBackPressed$2", m3645f = "VerifyCredentialsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onBackPressed$2 */
    static final class C396972 extends ContinuationImpl7 implements Function2<VerifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState>, Object> {
        int label;

        C396972(Continuation<? super C396972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C396972(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyCredentialsViewState verifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState> continuation) {
            return ((C396972) create(verifyCredentialsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyCredentialsViewState.ReviewEmail.INSTANCE;
        }
    }

    /* compiled from: VerifyCredentialsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onBackPressed$3", m3645f = "VerifyCredentialsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onBackPressed$3 */
    static final class C396983 extends ContinuationImpl7 implements Function2<VerifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState>, Object> {
        int label;

        C396983(Continuation<? super C396983> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C396983(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyCredentialsViewState verifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState> continuation) {
            return ((C396983) create(verifyCredentialsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyCredentialsViewState.UpdateEmail.INSTANCE;
        }
    }

    /* compiled from: VerifyCredentialsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onBackPressed$4", m3645f = "VerifyCredentialsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onBackPressed$4 */
    static final class C396994 extends ContinuationImpl7 implements Function2<VerifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState>, Object> {
        int label;

        C396994(Continuation<? super C396994> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C396994(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyCredentialsViewState verifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState> continuation) {
            return ((C396994) create(verifyCredentialsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyCredentialsViewState.ReviewPassword.INSTANCE;
        }
    }

    /* compiled from: VerifyCredentialsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onPrimaryCtaClicked$1", m3645f = "VerifyCredentialsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onPrimaryCtaClicked$1 */
    static final class C397001 extends ContinuationImpl7 implements Function2<VerifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState>, Object> {
        int label;

        C397001(Continuation<? super C397001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C397001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyCredentialsViewState verifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState> continuation) {
            return ((C397001) create(verifyCredentialsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyCredentialsViewState.UpdateEmail.INSTANCE;
        }
    }

    public final void onPrimaryCtaClicked(VerifyCredentialsViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof VerifyCredentialsViewState.ReviewEmail) {
            applyMutation(new C397001(null));
            return;
        }
        if (state instanceof VerifyCredentialsViewState.CheckYourEmail) {
            submit(VerifyCredentialsEvent.Finished.INSTANCE);
            return;
        }
        if (state instanceof VerifyCredentialsViewState.ReviewPassword) {
            applyMutation(new C397012(null));
        } else if (state instanceof VerifyCredentialsViewState.UpdatePassword) {
            submit(VerifyCredentialsEvent.Finished.INSTANCE);
        } else {
            if (!(state instanceof VerifyCredentialsViewState.UpdateEmail)) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(state);
            throw new ExceptionsH();
        }
    }

    /* compiled from: VerifyCredentialsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onPrimaryCtaClicked$2", m3645f = "VerifyCredentialsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onPrimaryCtaClicked$2 */
    static final class C397012 extends ContinuationImpl7 implements Function2<VerifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState>, Object> {
        int label;

        C397012(Continuation<? super C397012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C397012(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyCredentialsViewState verifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState> continuation) {
            return ((C397012) create(verifyCredentialsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return VerifyCredentialsViewState.UpdatePassword.INSTANCE;
        }
    }

    public final void onSecondaryCtaClicked(VerifyCredentialsViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof VerifyCredentialsViewState.ReviewEmail) {
            submit(VerifyCredentialsEvent.Finished.INSTANCE);
            return;
        }
        if (state instanceof VerifyCredentialsViewState.ReviewPassword) {
            submit(VerifyCredentialsEvent.Finished.INSTANCE);
        } else {
            if (!(state instanceof VerifyCredentialsViewState.UpdateEmail) && !(state instanceof VerifyCredentialsViewState.CheckYourEmail) && !(state instanceof VerifyCredentialsViewState.UpdatePassword)) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(state);
            throw new ExceptionsH();
        }
    }

    /* compiled from: VerifyCredentialsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onUpdateEmailSuccess$1", m3645f = "VerifyCredentialsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsDuxo$onUpdateEmailSuccess$1 */
    static final class C397021 extends ContinuationImpl7 implements Function2<VerifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397021(String str, Continuation<? super C397021> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C397021(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VerifyCredentialsViewState verifyCredentialsViewState, Continuation<? super VerifyCredentialsViewState> continuation) {
            return ((C397021) create(verifyCredentialsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new VerifyCredentialsViewState.CheckYourEmail(this.$email);
        }
    }

    public final void onUpdateEmailSuccess(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        applyMutation(new C397021(email, null));
    }
}
