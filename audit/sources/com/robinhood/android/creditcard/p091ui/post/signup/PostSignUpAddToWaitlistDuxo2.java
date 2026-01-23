package com.robinhood.android.creditcard.p091ui.post.signup;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.p091ui.post.signup.PostSignUpAddToWaitlistDuxo7;
import com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import com.robinhood.models.api.bonfire.waitlist.EmailWaitlistSpotStatus;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PostSignUpAddToWaitlistDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, 106}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PostSignUpAddToWaitlistDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PostSignUpAddToWaitlistState $state;
    int label;
    final /* synthetic */ PostSignUpAddToWaitlistDuxo this$0;

    /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailWaitlistSpotStatus.values().length];
            try {
                iArr[EmailWaitlistSpotStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostSignUpAddToWaitlistDuxo2(PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo, PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = postSignUpAddToWaitlistDuxo;
        this.$state = postSignUpAddToWaitlistState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostSignUpAddToWaitlistDuxo2(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PostSignUpAddToWaitlistDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1$1", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1$1 */
    static final class C126331 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126331(Continuation<? super C126331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126331 c126331 = new C126331(continuation);
            c126331.L$0 = obj;
            return c126331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
            return ((C126331) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, null, true, false, false, false, null, null, 125, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r11 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r11 != r0) goto L24;
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
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            this.this$0.applyMutation(new C126353(null));
            this.this$0.submit(PostSignUpAddToWaitlistDuxo7.Error.INSTANCE);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C126331(null));
            User user = this.$state.getUser();
            if (user == null || (email = user.getEmail()) == null) {
                Observable<User> user2 = this.this$0.userStore.getUser();
                this.label = 1;
                obj = RxAwait3.awaitFirst(user2, this);
            } else {
                CreditCardWaitlistStore creditCardWaitlistStore = this.this$0.waitlistStore;
                this.label = 2;
                obj = creditCardWaitlistStore.joinWaitlist(email, "RH_ONBOARDING", this);
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (WhenMappings.$EnumSwitchMapping$0[((ApiEmailWaitlistSpot) obj).getState().ordinal()] != 1) {
                this.this$0.applyMutation(new C126342(null));
                this.this$0.submit(PostSignUpAddToWaitlistDuxo7.Error.INSTANCE);
            } else {
                this.this$0.toNextScreen$feature_credit_card_externalDebug(PostSignUpAddToWaitlistDuxo9.CONFIRMATION);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        String email = ((User) obj).getEmail();
        CreditCardWaitlistStore creditCardWaitlistStore2 = this.this$0.waitlistStore;
        this.label = 2;
        obj = creditCardWaitlistStore2.joinWaitlist(email, "RH_ONBOARDING", this);
    }

    /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1$2", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1$2 */
    static final class C126342 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126342(Continuation<? super C126342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126342 c126342 = new C126342(continuation);
            c126342.L$0 = obj;
            return c126342;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
            return ((C126342) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, null, false, false, false, false, null, null, 125, null);
        }
    }

    /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1$3", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$joinWaitlist$1$1$3 */
    static final class C126353 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126353(Continuation<? super C126353> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126353 c126353 = new C126353(continuation);
            c126353.L$0 = obj;
            return c126353;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
            return ((C126353) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, null, false, false, false, false, null, null, 125, null);
        }
    }
}
