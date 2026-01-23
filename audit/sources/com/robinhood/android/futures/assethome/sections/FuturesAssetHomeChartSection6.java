package com.robinhood.android.futures.assethome.sections;

import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesAssetHomeChartSection.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$MonitorOnChartLoaded$1$1", m3645f = "FuturesAssetHomeChartSection.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$MonitorOnChartLoaded$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesAssetHomeChartSection6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoaded;
    final /* synthetic */ SnapshotState4<Function1<Boolean, Unit>> $latestOnChartLoaded$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FuturesAssetHomeChartSection6(boolean z, SnapshotState4<? extends Function1<? super Boolean, Unit>> snapshotState4, Continuation<? super FuturesAssetHomeChartSection6> continuation) {
        super(2, continuation);
        this.$isLoaded = z;
        this.$latestOnChartLoaded$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAssetHomeChartSection6(this.$isLoaded, this.$latestOnChartLoaded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAssetHomeChartSection6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesAssetHomeChartSection.MonitorOnChartLoaded$lambda$16(this.$latestOnChartLoaded$delegate).invoke(boxing.boxBoolean(this.$isLoaded));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
