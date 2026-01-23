package com.robinhood.android.pathfinder.corepages.multiselect;

import com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectDuxo;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.shared.support.contracts.pathfinder.MultiSelectFragmentKey;
import java.util.List;
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

/* compiled from: MultiSelectDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectDuxo$sendInput$1", m3645f = "MultiSelectDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectDuxo$sendInput$1, reason: use source file name */
/* loaded from: classes11.dex */
final class MultiSelectDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $options;
    int label;
    final /* synthetic */ MultiSelectDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiSelectDuxo2(MultiSelectDuxo multiSelectDuxo, List<String> list, Continuation<? super MultiSelectDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = multiSelectDuxo;
        this.$options = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiSelectDuxo2(this.this$0, this.$options, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiSelectDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: MultiSelectDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectDuxo$sendInput$1$1", m3645f = "MultiSelectDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectDuxo$sendInput$1$1 */
    static final class C253231 extends ContinuationImpl7 implements Function2<MultiSelectViewState, Continuation<? super MultiSelectViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C253231(Continuation<? super C253231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253231 c253231 = new C253231(continuation);
            c253231.L$0 = obj;
            return c253231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MultiSelectViewState multiSelectViewState, Continuation<? super MultiSelectViewState> continuation) {
            return ((C253231) create(multiSelectViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MultiSelectViewState.copy$default((MultiSelectViewState) this.L$0, null, true, null, 5, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        MultiSelectDuxo2 multiSelectDuxo2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C253231(null));
            PathfinderStore pathfinderStore = this.this$0.pathfinderStore;
            MultiSelectDuxo.Companion companion = MultiSelectDuxo.INSTANCE;
            UUID inquiryId = ((MultiSelectFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getInquiryId();
            int sequence = ((MultiSelectFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getUserViewState().getSequence();
            UserViewInput.MultiSelect multiSelect = new UserViewInput.MultiSelect(this.$options);
            final MultiSelectDuxo multiSelectDuxo = this.this$0;
            Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectDuxo$sendInput$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(multiSelectDuxo.handleInputError$feature_pathfinder_core_pages_externalDebug((Throwable) obj2));
                }
            };
            this.label = 1;
            multiSelectDuxo2 = this;
            if (pathfinderStore.handleUserInput(inquiryId, sequence, multiSelect, function1, multiSelectDuxo2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            multiSelectDuxo2 = this;
        }
        multiSelectDuxo2.this$0.applyMutation(new C253243(null));
        return Unit.INSTANCE;
    }

    /* compiled from: MultiSelectDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectDuxo$sendInput$1$3", m3645f = "MultiSelectDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectDuxo$sendInput$1$3 */
    static final class C253243 extends ContinuationImpl7 implements Function2<MultiSelectViewState, Continuation<? super MultiSelectViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C253243(Continuation<? super C253243> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253243 c253243 = new C253243(continuation);
            c253243.L$0 = obj;
            return c253243;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MultiSelectViewState multiSelectViewState, Continuation<? super MultiSelectViewState> continuation) {
            return ((C253243) create(multiSelectViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MultiSelectViewState.copy$default((MultiSelectViewState) this.L$0, null, false, null, 5, null);
        }
    }
}
