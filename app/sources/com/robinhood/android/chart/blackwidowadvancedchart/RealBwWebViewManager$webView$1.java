package com.robinhood.android.chart.blackwidowadvancedchart;

import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: RealBwWebViewManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Landroid/webkit/WebView;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$webView$1", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class RealBwWebViewManager$webView$1 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Flow<? extends WebView>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    RealBwWebViewManager$webView$1(Continuation<? super RealBwWebViewManager$webView$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Flow<? extends WebView>> continuation) {
        RealBwWebViewManager$webView$1 realBwWebViewManager$webView$1 = new RealBwWebViewManager$webView$1(continuation);
        realBwWebViewManager$webView$1.L$0 = bwWebViewComponent;
        return realBwWebViewManager$webView$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return StateFlow4.MutableStateFlow(((BwWebViewComponent) this.L$0).getWebView());
    }
}
