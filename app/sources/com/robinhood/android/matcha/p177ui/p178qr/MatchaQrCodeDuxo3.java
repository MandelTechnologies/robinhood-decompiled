package com.robinhood.android.matcha.p177ui.p178qr;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaQrCodeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$onStart$3$1", m3645f = "MatchaQrCodeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaQrCodeDuxo3 extends ContinuationImpl7 implements Function2<MatchaQrCodeDataState, Continuation<? super MatchaQrCodeDataState>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaQrCodeDuxo3(Bitmap bitmap, Continuation<? super MatchaQrCodeDuxo3> continuation) {
        super(2, continuation);
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaQrCodeDuxo3 matchaQrCodeDuxo3 = new MatchaQrCodeDuxo3(this.$bitmap, continuation);
        matchaQrCodeDuxo3.L$0 = obj;
        return matchaQrCodeDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaQrCodeDataState matchaQrCodeDataState, Continuation<? super MatchaQrCodeDataState> continuation) {
        return ((MatchaQrCodeDuxo3) create(matchaQrCodeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MatchaQrCodeDataState.copy$default((MatchaQrCodeDataState) this.L$0, null, null, this.$bitmap, null, 11, null);
    }
}
