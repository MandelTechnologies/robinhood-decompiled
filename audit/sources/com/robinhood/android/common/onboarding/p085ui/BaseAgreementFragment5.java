package com.robinhood.android.common.onboarding.p085ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.librobinhood.data.store.UserInfoStore;
import com.robinhood.models.api.AgreementAcceptRequest;
import com.robinhood.staticcontent.model.Agreement;
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
@DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$2$1", m3645f = "BaseAgreementFragment.kt", m3646l = {113, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 131}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class BaseAgreementFragment5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Agreement $it;
    int label;
    final /* synthetic */ BaseAgreementFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseAgreementFragment5(BaseAgreementFragment baseAgreementFragment, Agreement agreement, Continuation<? super BaseAgreementFragment5> continuation) {
        super(2, continuation);
        this.this$0 = baseAgreementFragment;
        this.$it = agreement;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseAgreementFragment5(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseAgreementFragment5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (dispatch.core.Suspend.withMain$default(null, r9, r8, 1, null) != r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            AbsErrorHandler.handleError$default(this.this$0.getActivityErrorHandler(), th, false, 2, null);
            C112941 c112941 = new C112941(this.this$0, null);
            this.label = 2;
            if (Suspend.withMain$default(null, c112941, this, 1, null) != coroutine_suspended) {
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserInfoStore userInfoStore = this.this$0.getUserInfoStore();
            AgreementAcceptRequest agreementAcceptRequest = new AgreementAcceptRequest(this.$it.getAgreementId(), this.$it.getVersion());
            this.label = 1;
            if (userInfoStore.acceptAgreement(agreementAcceptRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C112952 c112952 = new C112952(this.this$0, null);
            this.label = 3;
        }
        this.this$0.getAnalytics().logUserAction(this.$it.getAgreementId() + this.$it.getVersion());
        this.this$0.onAgreementRecorded();
        C112952 c1129522 = new C112952(this.this$0, null);
        this.label = 3;
    }

    /* compiled from: BaseAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$2$1$1", m3645f = "BaseAgreementFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$2$1$1 */
    static final class C112941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseAgreementFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112941(BaseAgreementFragment baseAgreementFragment, Continuation<? super C112941> continuation) {
            super(2, continuation);
            this.this$0 = baseAgreementFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C112941(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$2$1$2", m3645f = "BaseAgreementFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$onAgreementAccepted$2$1$2 */
    static final class C112952 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseAgreementFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112952(BaseAgreementFragment baseAgreementFragment, Continuation<? super C112952> continuation) {
            super(2, continuation);
            this.this$0 = baseAgreementFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C112952(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
