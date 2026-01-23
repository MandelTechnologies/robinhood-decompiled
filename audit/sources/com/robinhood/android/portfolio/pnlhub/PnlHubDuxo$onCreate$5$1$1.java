package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PnlHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$5$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PnlHubDuxo$onCreate$5$1$1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PnlHubDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubDuxo$onCreate$5$1$1(PnlHubDuxo pnlHubDuxo, Continuation<? super PnlHubDuxo$onCreate$5$1$1> continuation) {
        super(2, continuation);
        this.this$0 = pnlHubDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubDuxo$onCreate$5$1$1 pnlHubDuxo$onCreate$5$1$1 = new PnlHubDuxo$onCreate$5$1$1(this.this$0, continuation);
        pnlHubDuxo$onCreate$5$1$1.L$0 = obj;
        return pnlHubDuxo$onCreate$5$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Account account, Continuation<? super Unit> continuation) {
        return ((PnlHubDuxo$onCreate$5$1$1) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$5$1$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$5$1$1$1 */
    static final class C257571 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        final /* synthetic */ Account $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257571(Account account, Continuation<? super C257571> continuation) {
            super(2, continuation);
            this.$account = account;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257571 c257571 = new C257571(this.$account, continuation);
            c257571.L$0 = obj;
            return c257571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257571) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, this.$account, null, null, null, false, null, null, null, false, false, null, false, false, false, null, false, false, false, 2097143, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C257571((Account) this.L$0, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
