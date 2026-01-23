package com.robinhood.shared.portfolio.lists.p391ui.modals.create;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistDuxo6;
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

/* compiled from: CreateWatchlistComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$5$1", m3645f = "CreateWatchlistComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$5$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CreateWatchlistComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateWatchlistDuxo $duxo;
    final /* synthetic */ Function1<CuratedList, Unit> $onWatchlistCreated;
    final /* synthetic */ SnapshotState4<CreateWatchlistViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CreateWatchlistComposable2(Function1<? super CuratedList, Unit> function1, CreateWatchlistDuxo createWatchlistDuxo, SnapshotState4<CreateWatchlistViewState> snapshotState4, Continuation<? super CreateWatchlistComposable2> continuation) {
        super(2, continuation);
        this.$onWatchlistCreated = function1;
        this.$duxo = createWatchlistDuxo;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateWatchlistComposable2(this.$onWatchlistCreated, this.$duxo, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateWatchlistComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CreateWatchlistDuxo6 creatingWatchlistState = CreateWatchlistComposable.CreateWatchlistComposable$lambda$0(this.$viewState$delegate).getCreatingWatchlistState();
            if (creatingWatchlistState instanceof CreateWatchlistDuxo6.Success) {
                this.$onWatchlistCreated.invoke(((CreateWatchlistDuxo6.Success) creatingWatchlistState).getCuratedList());
                this.$duxo.reset();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
