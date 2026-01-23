package com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SduiPollableCells.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableCellsKt$SduiPollableScreenerTableItem$1$1", m3645f = "SduiPollableCells.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableCellsKt$SduiPollableScreenerTableItem$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiPollableCells2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UIComponent<ActionT> $component;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ String $defaultColumnValue;
    final /* synthetic */ String $instrumentId;
    final /* synthetic */ SduiPollableScreenerItemsViewModel $pollableViewModel;
    final /* synthetic */ SnapshotState<SduiPollableViewState> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SduiPollableCells2(SduiPollableScreenerItemsViewModel sduiPollableScreenerItemsViewModel, UIComponent<? extends ActionT> uIComponent, String str, String str2, CoroutineScope coroutineScope, SnapshotState<SduiPollableViewState> snapshotState, Continuation<? super SduiPollableCells2> continuation) {
        super(2, continuation);
        this.$pollableViewModel = sduiPollableScreenerItemsViewModel;
        this.$component = uIComponent;
        this.$instrumentId = str;
        this.$defaultColumnValue = str2;
        this.$coroutineScope = coroutineScope;
        this.$state$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiPollableCells2(this.$pollableViewModel, this.$component, this.$instrumentId, this.$defaultColumnValue, this.$coroutineScope, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiPollableCells2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FlowKt.launchIn(FlowKt.onEach(this.$pollableViewModel.pollQuote(this.$component, this.$instrumentId, this.$defaultColumnValue), new C207991(this.$state$delegate, null)), this.$coroutineScope);
        return Unit.INSTANCE;
    }

    /* compiled from: SduiPollableCells.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/SduiPollableViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableCellsKt$SduiPollableScreenerTableItem$1$1$1", m3645f = "SduiPollableCells.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableCellsKt$SduiPollableScreenerTableItem$1$1$1 */
    static final class C207991 extends ContinuationImpl7 implements Function2<SduiPollableViewState, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<SduiPollableViewState> $state$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C207991(SnapshotState<SduiPollableViewState> snapshotState, Continuation<? super C207991> continuation) {
            super(2, continuation);
            this.$state$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C207991 c207991 = new C207991(this.$state$delegate, continuation);
            c207991.L$0 = obj;
            return c207991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SduiPollableViewState sduiPollableViewState, Continuation<? super Unit> continuation) {
            return ((C207991) create(sduiPollableViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$state$delegate.setValue((SduiPollableViewState) this.L$0);
            return Unit.INSTANCE;
        }
    }
}
