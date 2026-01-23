package com.robinhood.android.chart.blackwidowadvancedchart;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;

/* compiled from: BwWebViewComponent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "shortingEnabled", "macShorting"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$chartFeatures$1", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$chartFeatures$1, reason: use source file name */
/* loaded from: classes7.dex */
final class BwWebViewComponent3 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    BwWebViewComponent3(Continuation<? super BwWebViewComponent3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
        BwWebViewComponent3 bwWebViewComponent3 = new BwWebViewComponent3(continuation);
        bwWebViewComponent3.Z$0 = z;
        bwWebViewComponent3.Z$1 = z2;
        return bwWebViewComponent3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(this.Z$0 && this.Z$1);
    }
}
