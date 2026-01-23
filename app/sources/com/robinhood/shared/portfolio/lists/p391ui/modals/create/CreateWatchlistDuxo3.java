package com.robinhood.shared.portfolio.lists.p391ui.modals.create;

import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistDuxo6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CreateWatchlistDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$createNewWatchlist$2$1$2$1", m3645f = "CreateWatchlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistDuxo$createNewWatchlist$2$1$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CreateWatchlistDuxo3 extends ContinuationImpl7 implements Function2<CreateWatchlistViewState, Continuation<? super CreateWatchlistViewState>, Object> {
    final /* synthetic */ String $message;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateWatchlistDuxo3(String str, Continuation<? super CreateWatchlistDuxo3> continuation) {
        super(2, continuation);
        this.$message = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateWatchlistDuxo3 createWatchlistDuxo3 = new CreateWatchlistDuxo3(this.$message, continuation);
        createWatchlistDuxo3.L$0 = obj;
        return createWatchlistDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateWatchlistViewState createWatchlistViewState, Continuation<? super CreateWatchlistViewState> continuation) {
        return ((CreateWatchlistDuxo3) create(createWatchlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CreateWatchlistViewState.copy$default((CreateWatchlistViewState) this.L$0, null, null, false, new BentoTextInput8.Message.Error(this.$message), CreateWatchlistDuxo6.NotStarted.INSTANCE, 7, null);
    }
}
