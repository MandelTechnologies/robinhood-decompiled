package com.robinhood.android.snacks.p257ui;

import com.robinhood.models.p320db.sheriff.User;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SnacksSubscribeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$onCreate$1$1", m3645f = "SnacksSubscribeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SnacksSubscribeDuxo2 extends ContinuationImpl7 implements Function2<SnacksSubscribeViewState, Continuation<? super SnacksSubscribeViewState>, Object> {
    final /* synthetic */ User $user;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnacksSubscribeDuxo2(User user, Continuation<? super SnacksSubscribeDuxo2> continuation) {
        super(2, continuation);
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SnacksSubscribeDuxo2 snacksSubscribeDuxo2 = new SnacksSubscribeDuxo2(this.$user, continuation);
        snacksSubscribeDuxo2.L$0 = obj;
        return snacksSubscribeDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SnacksSubscribeViewState snacksSubscribeViewState, Continuation<? super SnacksSubscribeViewState> continuation) {
        return ((SnacksSubscribeDuxo2) create(snacksSubscribeViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SnacksSubscribeViewState.copy$default((SnacksSubscribeViewState) this.L$0, this.$user.getEmail(), null, 2, null);
    }
}
