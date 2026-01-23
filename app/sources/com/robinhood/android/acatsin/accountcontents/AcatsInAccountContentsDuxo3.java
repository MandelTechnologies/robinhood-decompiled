package com.robinhood.android.acatsin.accountcontents;

import android.graphics.drawable.Drawable;
import com.robinhood.utils.p409ui.view.Drawables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInAccountContentsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$brokerageLogoTarget$1$onSuccess$1", m3645f = "AcatsInAccountContentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$brokerageLogoTarget$1$onSuccess$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAccountContentsDuxo3 extends ContinuationImpl7 implements Function2<AcatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState>, Object> {
    final /* synthetic */ Drawable $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInAccountContentsDuxo3(Drawable drawable, Continuation<? super AcatsInAccountContentsDuxo3> continuation) {
        super(2, continuation);
        this.$result = drawable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInAccountContentsDuxo3 acatsInAccountContentsDuxo3 = new AcatsInAccountContentsDuxo3(this.$result, continuation);
        acatsInAccountContentsDuxo3.L$0 = obj;
        return acatsInAccountContentsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInAccountContentsDataState acatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState> continuation) {
        return ((AcatsInAccountContentsDuxo3) create(acatsInAccountContentsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsInAccountContentsDataState.copy$default((AcatsInAccountContentsDataState) this.L$0, null, Drawables.toBitmap$default(this.$result, 0, 0, null, 7, null), false, null, null, null, null, 125, null);
    }
}
