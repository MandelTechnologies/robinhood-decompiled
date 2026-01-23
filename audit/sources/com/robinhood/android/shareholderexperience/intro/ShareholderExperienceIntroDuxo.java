package com.robinhood.android.shareholderexperience.intro;

import com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.udf.UiEvent;
import io.reactivex.Single;
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

/* compiled from: ShareholderExperienceIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroViewState;", "shareholderExperienceStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore;)V", "acceptTerms", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ShareholderExperienceIntroDuxo extends OldBaseDuxo<ShareholderExperienceIntroViewState> {
    public static final int $stable = 8;
    private final ShareholderExperienceStore shareholderExperienceStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShareholderExperienceIntroDuxo(ShareholderExperienceStore shareholderExperienceStore) {
        super(new ShareholderExperienceIntroViewState(false, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(shareholderExperienceStore, "shareholderExperienceStore");
        this.shareholderExperienceStore = shareholderExperienceStore;
    }

    public final void acceptTerms() {
        applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderExperienceIntroDuxo.acceptTerms$lambda$0((ShareholderExperienceIntroViewState) obj);
            }
        });
        Single singleOnErrorReturnItem = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C285042(null), 1, null).toSingleDefault(ShareholderExperienceIntroViewState.Event.ACCEPTED).onErrorReturnItem(ShareholderExperienceIntroViewState.Event.ERROR);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SingleDelay2.minTimeInFlight$default(singleOnErrorReturnItem, 1000L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderExperienceIntroDuxo.acceptTerms$lambda$2(this.f$0, (ShareholderExperienceIntroViewState.Event) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareholderExperienceIntroViewState acceptTerms$lambda$0(ShareholderExperienceIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ShareholderExperienceIntroViewState.copy$default(applyMutation, true, null, 2, null);
    }

    /* compiled from: ShareholderExperienceIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroDuxo$acceptTerms$2", m3645f = "ShareholderExperienceIntroDuxo.kt", m3646l = {22}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroDuxo$acceptTerms$2 */
    static final class C285042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C285042(Continuation<? super C285042> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShareholderExperienceIntroDuxo.this.new C285042(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C285042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ShareholderExperienceStore shareholderExperienceStore = ShareholderExperienceIntroDuxo.this.shareholderExperienceStore;
                this.label = 1;
                if (shareholderExperienceStore.acceptTerms(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptTerms$lambda$2(ShareholderExperienceIntroDuxo shareholderExperienceIntroDuxo, final ShareholderExperienceIntroViewState.Event event) {
        shareholderExperienceIntroDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.intro.ShareholderExperienceIntroDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderExperienceIntroDuxo.acceptTerms$lambda$2$lambda$1(event, (ShareholderExperienceIntroViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareholderExperienceIntroViewState acceptTerms$lambda$2$lambda$1(ShareholderExperienceIntroViewState.Event event, ShareholderExperienceIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(false, new UiEvent<>(event));
    }
}
