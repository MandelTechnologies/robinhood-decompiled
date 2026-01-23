package com.robinhood.android.mcduckling.p180ui;

import com.robinhood.android.common.mcduckling.requirements.McDucklingDeepLinkHandler;
import com.robinhood.android.common.mcduckling.requirements.McDucklingDeepLinkHandler2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpendingTabFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcduckling.ui.SpendingTabFragment$setupDeepLinkListeners$1$1", m3645f = "SpendingTabFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.mcduckling.ui.SpendingTabFragment$setupDeepLinkListeners$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SpendingTabFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    SpendingTabFragment3(Continuation<? super SpendingTabFragment3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpendingTabFragment3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpendingTabFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        McDucklingDeepLinkHandler.INSTANCE.getShowCardSettings().tryEmit(McDucklingDeepLinkHandler2.m12258boximpl(McDucklingDeepLinkHandler2.m12259constructorimpl(true)));
        return Unit.INSTANCE;
    }
}
