package com.robinhood.android.p273ui;

import com.robinhood.models.p320db.sheriff.User;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MainTabBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$1$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class MainTabBarDuxo2 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
    final /* synthetic */ User $user;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainTabBarDuxo2(User user, Continuation<? super MainTabBarDuxo2> continuation) {
        super(2, continuation);
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainTabBarDuxo2 mainTabBarDuxo2 = new MainTabBarDuxo2(this.$user, continuation);
        mainTabBarDuxo2.L$0 = obj;
        return mainTabBarDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
        return ((MainTabBarDuxo2) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MainTabBarDataState.copy$default((MainTabBarDataState) this.L$0, null, null, null, this.$user.getOrigin().getLocality(), null, null, false, false, false, false, null, 2039, null);
    }
}
