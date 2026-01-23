package com.robinhood.android.common.gold;

import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldPostUpgradeCelebrationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.gold.GoldPostUpgradeCelebrationDuxo$fetchPostUpgradeCelebration$2$1", m3645f = "GoldPostUpgradeCelebrationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationDuxo$fetchPostUpgradeCelebration$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class GoldPostUpgradeCelebrationDuxo3 extends ContinuationImpl7 implements Function2<GoldPostUpgradeCelebrationViewState, Continuation<? super GoldPostUpgradeCelebrationViewState>, Object> {
    final /* synthetic */ Throwable $error;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldPostUpgradeCelebrationDuxo3(Throwable th, Continuation<? super GoldPostUpgradeCelebrationDuxo3> continuation) {
        super(2, continuation);
        this.$error = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldPostUpgradeCelebrationDuxo3(this.$error, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldPostUpgradeCelebrationViewState goldPostUpgradeCelebrationViewState, Continuation<? super GoldPostUpgradeCelebrationViewState> continuation) {
        return ((GoldPostUpgradeCelebrationDuxo3) create(goldPostUpgradeCelebrationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new GoldPostUpgradeCelebrationViewState.Error(this.$error);
    }
}
