package com.robinhood.android.feature.linking;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MobileLinkingHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/linking/MobileLinkingHostState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$1$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MobileLinkingHostDuxo2 extends ContinuationImpl7 implements Function2<MobileLinkingHostState, Continuation<? super MobileLinkingHostState>, Object> {
    final /* synthetic */ String $selectedGroupId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileLinkingHostDuxo2(String str, Continuation<? super MobileLinkingHostDuxo2> continuation) {
        super(2, continuation);
        this.$selectedGroupId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MobileLinkingHostDuxo2 mobileLinkingHostDuxo2 = new MobileLinkingHostDuxo2(this.$selectedGroupId, continuation);
        mobileLinkingHostDuxo2.L$0 = obj;
        return mobileLinkingHostDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MobileLinkingHostState mobileLinkingHostState, Continuation<? super MobileLinkingHostState> continuation) {
        return ((MobileLinkingHostDuxo2) create(mobileLinkingHostState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MobileLinkingHostState.copy$default((MobileLinkingHostState) this.L$0, null, this.$selectedGroupId, null, null, 13, null);
    }
}
