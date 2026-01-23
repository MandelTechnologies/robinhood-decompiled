package com.robinhood.android.pathfinder.corepages.simpleinput;

import com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputDuxo;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.shared.support.contracts.pathfinder.SimpleInputFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SimpleInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputDuxo$sendInput$1", m3645f = "SimpleInputDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputDuxo$sendInput$1, reason: use source file name */
/* loaded from: classes11.dex */
final class SimpleInputDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $input;
    int label;
    final /* synthetic */ SimpleInputDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleInputDuxo2(SimpleInputDuxo simpleInputDuxo, String str, Continuation<? super SimpleInputDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = simpleInputDuxo;
        this.$input = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SimpleInputDuxo2(this.this$0, this.$input, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SimpleInputDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SimpleInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/simpleinput/SimpleInputViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputDuxo$sendInput$1$1", m3645f = "SimpleInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputDuxo$sendInput$1$1 */
    static final class C253561 extends ContinuationImpl7 implements Function2<SimpleInputViewState, Continuation<? super SimpleInputViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C253561(Continuation<? super C253561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253561 c253561 = new C253561(continuation);
            c253561.L$0 = obj;
            return c253561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SimpleInputViewState simpleInputViewState, Continuation<? super SimpleInputViewState> continuation) {
            return ((C253561) create(simpleInputViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SimpleInputViewState.copy$default((SimpleInputViewState) this.L$0, null, true, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SimpleInputDuxo2 simpleInputDuxo2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C253561(null));
            PathfinderStore pathfinderStore = this.this$0.pathfinderStore;
            SimpleInputDuxo.Companion companion = SimpleInputDuxo.INSTANCE;
            UUID inquiryId = ((SimpleInputFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getInquiryId();
            int sequence = ((SimpleInputFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getUserViewState().getSequence();
            UserViewInput.SimpleInput simpleInput = new UserViewInput.SimpleInput(this.$input);
            final SimpleInputDuxo simpleInputDuxo = this.this$0;
            Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputDuxo$sendInput$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(simpleInputDuxo.handleInputError$feature_pathfinder_core_pages_externalDebug((Throwable) obj2));
                }
            };
            this.label = 1;
            simpleInputDuxo2 = this;
            if (pathfinderStore.handleUserInput(inquiryId, sequence, simpleInput, function1, simpleInputDuxo2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            simpleInputDuxo2 = this;
        }
        simpleInputDuxo2.this$0.applyMutation(new C253573(null));
        return Unit.INSTANCE;
    }

    /* compiled from: SimpleInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/simpleinput/SimpleInputViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputDuxo$sendInput$1$3", m3645f = "SimpleInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputDuxo$sendInput$1$3 */
    static final class C253573 extends ContinuationImpl7 implements Function2<SimpleInputViewState, Continuation<? super SimpleInputViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C253573(Continuation<? super C253573> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253573 c253573 = new C253573(continuation);
            c253573.L$0 = obj;
            return c253573;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SimpleInputViewState simpleInputViewState, Continuation<? super SimpleInputViewState> continuation) {
            return ((C253573) create(simpleInputViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SimpleInputViewState.copy$default((SimpleInputViewState) this.L$0, null, false, 1, null);
        }
    }
}
