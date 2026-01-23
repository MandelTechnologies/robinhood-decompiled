package com.robinhood.android.gold.hub.boost;

import com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldDepositBoostHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$switchTab$1$1", m3645f = "GoldDepositBoostHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubDuxo$switchTab$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldDepositBoostHubDuxo2 extends ContinuationImpl7 implements Function2<GoldDepositBoostHubViewState, Continuation<? super GoldDepositBoostHubViewState>, Object> {
    final /* synthetic */ GoldDepositBoostHubViewState $it;
    final /* synthetic */ GoldDepositBoostTab $newTab;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldDepositBoostHubDuxo2(GoldDepositBoostHubViewState goldDepositBoostHubViewState, GoldDepositBoostTab goldDepositBoostTab, Continuation<? super GoldDepositBoostHubDuxo2> continuation) {
        super(2, continuation);
        this.$it = goldDepositBoostHubViewState;
        this.$newTab = goldDepositBoostTab;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldDepositBoostHubDuxo2(this.$it, this.$newTab, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldDepositBoostHubViewState goldDepositBoostHubViewState, Continuation<? super GoldDepositBoostHubViewState> continuation) {
        return ((GoldDepositBoostHubDuxo2) create(goldDepositBoostHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return GoldDepositBoostHubViewState.Loaded.copy$default((GoldDepositBoostHubViewState.Loaded) this.$it, null, null, this.$newTab, 3, null);
    }
}
