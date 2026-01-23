package com.robinhood.android.common.onboarding.p085ui;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import dispatch.core.Suspend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1", m3645f = "BaseAgreementFragment.kt", m3646l = {95, 101, 106}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class BaseAgreementFragment4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UiAgreementWithContent $it;
    int label;
    final /* synthetic */ BaseAgreementFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseAgreementFragment4(BaseAgreementFragment baseAgreementFragment, UiAgreementWithContent uiAgreementWithContent, Continuation<? super BaseAgreementFragment4> continuation) {
        super(2, continuation);
        this.this$0 = baseAgreementFragment;
        this.$it = uiAgreementWithContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseAgreementFragment4(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseAgreementFragment4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (dispatch.core.Suspend.withMain$default(null, r14, r13, 1, null) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[PHI: r10
      0x0084: PHI (r10v6 com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1) = 
      (r10v2 com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1)
      (r10v5 com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1)
      (r10v9 com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1)
     binds: [B:28:0x0081, B:21:0x0047, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BaseAgreementFragment4 baseAgreementFragment4;
        AgreementsStore agreementsStore;
        UiAgreementWithContent uiAgreementWithContent;
        Throwable th;
        C112921 c112921;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                agreementsStore = this.this$0.getAgreementsStore();
                uiAgreementWithContent = this.$it;
                this.label = 1;
                baseAgreementFragment4 = this;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    AbsErrorHandler.handleError$default(baseAgreementFragment4.this$0.getActivityErrorHandler(), th, false, 2, null);
                    c112921 = new C112921(baseAgreementFragment4.this$0, null);
                    baseAgreementFragment4.label = 2;
                    if (Suspend.withMain$default(null, c112921, this, 1, null) != coroutine_suspended) {
                        C112932 c112932 = new C112932(baseAgreementFragment4.this$0, null);
                        baseAgreementFragment4.label = 3;
                    }
                    return coroutine_suspended;
                }
            } catch (Throwable th3) {
                th = th3;
                baseAgreementFragment4 = this;
                th = th;
                AbsErrorHandler.handleError$default(baseAgreementFragment4.this$0.getActivityErrorHandler(), th, false, 2, null);
                c112921 = new C112921(baseAgreementFragment4.this$0, null);
                baseAgreementFragment4.label = 2;
                if (Suspend.withMain$default(null, c112921, this, 1, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (AgreementsStore.signAgreement$default(agreementsStore, uiAgreementWithContent, null, null, baseAgreementFragment4, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
                baseAgreementFragment4 = this;
            } catch (Throwable th4) {
                th = th4;
                baseAgreementFragment4 = this;
                AbsErrorHandler.handleError$default(baseAgreementFragment4.this$0.getActivityErrorHandler(), th, false, 2, null);
                c112921 = new C112921(baseAgreementFragment4.this$0, null);
                baseAgreementFragment4.label = 2;
                if (Suspend.withMain$default(null, c112921, this, 1, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            baseAgreementFragment4 = this;
            C112932 c1129322 = new C112932(baseAgreementFragment4.this$0, null);
            baseAgreementFragment4.label = 3;
        }
        baseAgreementFragment4.this$0.getAnalytics().logUserAction(String.valueOf(baseAgreementFragment4.$it.getApiAgreement().getId()));
        baseAgreementFragment4.this$0.onAgreementRecorded();
        C112932 c11293222 = new C112932(baseAgreementFragment4.this$0, null);
        baseAgreementFragment4.label = 3;
    }

    /* compiled from: BaseAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1$1", m3645f = "BaseAgreementFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1$1 */
    static final class C112921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseAgreementFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112921(BaseAgreementFragment baseAgreementFragment, Continuation<? super C112921> continuation) {
            super(2, continuation);
            this.this$0 = baseAgreementFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C112921(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.getAgreementView().reset();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BaseAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1$2", m3645f = "BaseAgreementFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$1$1$2 */
    static final class C112932 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseAgreementFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112932(BaseAgreementFragment baseAgreementFragment, Continuation<? super C112932> continuation) {
            super(2, continuation);
            this.this$0 = baseAgreementFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C112932(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RhToolbar rhToolbar = this.this$0.getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            rhToolbar.setLoadingViewVisible(false);
            return Unit.INSTANCE;
        }
    }
}
