package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AboutV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$onAboutTextOverflow$1", m3645f = "AboutV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$onAboutTextOverflow$1, reason: use source file name */
/* loaded from: classes3.dex */
final class AboutV2Duxo6 extends ContinuationImpl7 implements Function2<AboutV2DataState, Continuation<? super AboutV2DataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AboutV2Duxo6(Continuation<? super AboutV2Duxo6> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AboutV2Duxo6 aboutV2Duxo6 = new AboutV2Duxo6(continuation);
        aboutV2Duxo6.L$0 = obj;
        return aboutV2Duxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AboutV2DataState aboutV2DataState, Continuation<? super AboutV2DataState> continuation) {
        return ((AboutV2Duxo6) create(aboutV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AboutV2DataState.copy$default((AboutV2DataState) this.L$0, null, null, null, null, null, true, null, false, false, 479, null);
    }
}
