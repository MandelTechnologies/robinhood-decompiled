package com.robinhood.android.transfers.international.p266ui.memo;

import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.transfers.international.p266ui.memo.MemoInputEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
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
import kotlin.text.StringsKt;

/* compiled from: MemoInputDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/memo/MemoInputDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/international/ui/memo/MemoInputDataState;", "Lcom/robinhood/android/transfers/international/ui/memo/MemoInputViewState;", "Lcom/robinhood/android/transfers/international/ui/memo/MemoInputEvent;", "stateProvider", "Lcom/robinhood/android/transfers/international/ui/memo/MemoInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/memo/MemoInputStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "updateMemo", "", MemoInputActivity.EXTRA_MEMO, "", "saveButtonClicked", "skipButtonClicked", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MemoInputDuxo extends BaseDuxo3<MemoInputDataState, MemoInputViewState, MemoInputEvent> {
    public static final int $stable = BaseDuxo3.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoInputDuxo(MemoInputStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new MemoInputDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }

    /* compiled from: MemoInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/memo/MemoInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.memo.MemoInputDuxo$updateMemo$1", m3645f = "MemoInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.memo.MemoInputDuxo$updateMemo$1 */
    static final class C303601 extends ContinuationImpl7 implements Function2<MemoInputDataState, Continuation<? super MemoInputDataState>, Object> {
        final /* synthetic */ String $memo;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C303601(String str, Continuation<? super C303601> continuation) {
            super(2, continuation);
            this.$memo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303601 c303601 = new C303601(this.$memo, continuation);
            c303601.L$0 = obj;
            return c303601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MemoInputDataState memoInputDataState, Continuation<? super MemoInputDataState> continuation) {
            return ((C303601) create(memoInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((MemoInputDataState) this.L$0).copy(StringsKt.take(this.$memo, 125));
        }
    }

    public final void updateMemo(String memo) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        applyMutation(new C303601(memo, null));
    }

    public final void saveButtonClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.international.ui.memo.MemoInputDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemoInputDuxo.saveButtonClicked$lambda$0(this.f$0, (MemoInputDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveButtonClicked$lambda$0(MemoInputDuxo memoInputDuxo, MemoInputDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        memoInputDuxo.submit(new MemoInputEvent.ButtonClicked(state.getMemo()));
        return Unit.INSTANCE;
    }

    public final void skipButtonClicked() {
        submit(new MemoInputEvent.ButtonClicked(null));
    }
}
