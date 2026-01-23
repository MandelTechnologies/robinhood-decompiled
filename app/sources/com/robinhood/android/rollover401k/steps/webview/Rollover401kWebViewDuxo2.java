package com.robinhood.android.rollover401k.steps.webview;

import bff_retirement.service.p020v1.CapitalizeWebViewAllowedUrlsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Rollover401kWebViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$onCreate$2$1", m3645f = "Rollover401kWebViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class Rollover401kWebViewDuxo2 extends ContinuationImpl7 implements Function2<Rollover401kWebViewViewState, Continuation<? super Rollover401kWebViewViewState>, Object> {
    final /* synthetic */ CapitalizeWebViewAllowedUrlsResponseDto $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Rollover401kWebViewDuxo2(CapitalizeWebViewAllowedUrlsResponseDto capitalizeWebViewAllowedUrlsResponseDto, Continuation<? super Rollover401kWebViewDuxo2> continuation) {
        super(2, continuation);
        this.$response = capitalizeWebViewAllowedUrlsResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Rollover401kWebViewDuxo2 rollover401kWebViewDuxo2 = new Rollover401kWebViewDuxo2(this.$response, continuation);
        rollover401kWebViewDuxo2.L$0 = obj;
        return rollover401kWebViewDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Rollover401kWebViewViewState rollover401kWebViewViewState, Continuation<? super Rollover401kWebViewViewState> continuation) {
        return ((Rollover401kWebViewDuxo2) create(rollover401kWebViewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((Rollover401kWebViewViewState) this.L$0).copy(false, extensions2.toImmutableList(this.$response.getAllowed_urls()), extensions2.toImmutableList(this.$response.getHosts_to_open_externally()));
    }
}
