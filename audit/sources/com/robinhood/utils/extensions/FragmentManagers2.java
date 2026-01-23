package com.robinhood.utils.extensions;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.utils.extensions.FragmentManagers;
import com.robinhood.utils.extensions.FragmentManagers2;
import dispatch.core.Flow7;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FragmentManagers.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\b"}, m3636d2 = {"fragmentLifecycleEvents", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/extensions/FragmentLifecycleEvent;", "Landroidx/fragment/app/FragmentManager;", "recursive", "", "fragmentLifecycleEventsFlow", "Lkotlinx/coroutines/flow/Flow;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.FragmentManagersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FragmentManagers2 {
    public static final Observable<FragmentManagers> fragmentLifecycleEvents(final FragmentManager fragmentManager, final boolean z) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Observable<FragmentManagers> observableCreate = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.utils.extensions.FragmentManagersKt.fragmentLifecycleEvents.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks, com.robinhood.utils.extensions.FragmentManagersKt$fragmentLifecycleEvents$1$callbacks$1] */
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<FragmentManagers> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final ?? r0 = new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.robinhood.utils.extensions.FragmentManagersKt$fragmentLifecycleEvents$1$callbacks$1
                    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                    public void onFragmentResumed(FragmentManager fm, Fragment f) {
                        Intrinsics.checkNotNullParameter(fm, "fm");
                        Intrinsics.checkNotNullParameter(f, "f");
                        emitter.onNext(new FragmentManagers.Resumed(f));
                    }
                };
                final FragmentManager fragmentManager2 = fragmentManager;
                emitter.setDisposable(Disposables.fromRunnable(new Runnable() { // from class: com.robinhood.utils.extensions.FragmentManagersKt.fragmentLifecycleEvents.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        fragmentManager2.unregisterFragmentLifecycleCallbacks(r0);
                    }
                }));
                if (emitter.getDisposed()) {
                    return;
                }
                fragmentManager.registerFragmentLifecycleCallbacks(r0, z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        return observableCreate;
    }

    /* compiled from: FragmentManagers.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/utils/extensions/FragmentLifecycleEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.extensions.FragmentManagersKt$fragmentLifecycleEventsFlow$1", m3645f = "FragmentManagers.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.extensions.FragmentManagersKt$fragmentLifecycleEventsFlow$1 */
    static final class C419171 extends ContinuationImpl7 implements Function2<Produce4<? super FragmentManagers>, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $recursive;
        final /* synthetic */ FragmentManager $this_fragmentLifecycleEventsFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C419171(FragmentManager fragmentManager, boolean z, Continuation<? super C419171> continuation) {
            super(2, continuation);
            this.$this_fragmentLifecycleEventsFlow = fragmentManager;
            this.$recursive = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C419171 c419171 = new C419171(this.$this_fragmentLifecycleEventsFlow, this.$recursive, continuation);
            c419171.L$0 = obj;
            return c419171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super FragmentManagers> produce4, Continuation<? super Unit> continuation) {
            return ((C419171) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks, com.robinhood.utils.extensions.FragmentManagersKt$fragmentLifecycleEventsFlow$1$callbacks$1] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Produce4 produce4 = (Produce4) this.L$0;
                final ?? r1 = new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.robinhood.utils.extensions.FragmentManagersKt$fragmentLifecycleEventsFlow$1$callbacks$1
                    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                    public void onFragmentResumed(FragmentManager fm, Fragment f) {
                        Intrinsics.checkNotNullParameter(fm, "fm");
                        Intrinsics.checkNotNullParameter(f, "f");
                        produce4.mo8337trySendJP2dKIU(new FragmentManagers.Resumed(f));
                    }
                };
                this.$this_fragmentLifecycleEventsFlow.registerFragmentLifecycleCallbacks(r1, this.$recursive);
                final FragmentManager fragmentManager = this.$this_fragmentLifecycleEventsFlow;
                Function0 function0 = new Function0() { // from class: com.robinhood.utils.extensions.FragmentManagersKt$fragmentLifecycleEventsFlow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FragmentManagers2.C419171.invokeSuspend$lambda$0(fragmentManager, r1);
                    }
                };
                this.label = 1;
                if (Produce.awaitClose(produce4, function0, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FragmentManager fragmentManager, FragmentManagers4 fragmentManagers4) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(fragmentManagers4);
            return Unit.INSTANCE;
        }
    }

    public static final Flow<FragmentManagers> fragmentLifecycleEventsFlow(FragmentManager fragmentManager, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        return Flow7.flowOnMainImmediate(FlowKt.callbackFlow(new C419171(fragmentManager, z, null)));
    }
}
