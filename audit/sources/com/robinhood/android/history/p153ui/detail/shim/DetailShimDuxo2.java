package com.robinhood.android.history.p153ui.detail.shim;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DetailShimDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/history/ui/detail/shim/DetailShimViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.history.ui.detail.shim.DetailShimDuxo$onStart$2$1", m3645f = "DetailShimDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.history.ui.detail.shim.DetailShimDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class DetailShimDuxo2 extends ContinuationImpl7 implements Function2<DetailShimViewState, Continuation<? super DetailShimViewState>, Object> {
    final /* synthetic */ FragmentKey $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DetailShimDuxo2(FragmentKey fragmentKey, Continuation<? super DetailShimDuxo2> continuation) {
        super(2, continuation);
        this.$it = fragmentKey;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailShimDuxo2 detailShimDuxo2 = new DetailShimDuxo2(this.$it, continuation);
        detailShimDuxo2.L$0 = obj;
        return detailShimDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DetailShimViewState detailShimViewState, Continuation<? super DetailShimViewState> continuation) {
        return ((DetailShimDuxo2) create(detailShimViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((DetailShimViewState) this.L$0).copy(this.$it);
    }
}
