package com.robinhood.android.equityscreener.filters;

import com.robinhood.utils.compose.TargetedScrollColumnScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScreenerFilterComponents.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$PrimarySingleSelectFilter$1$1$2$1$1", m3645f = "ScreenerFilterComponents.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$PrimarySingleSelectFilter$1$1$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ScreenerFilterComponents5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ TargetedScrollColumnScope<Integer> $this_TargetedScrollColumn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenerFilterComponents5(TargetedScrollColumnScope<Integer> targetedScrollColumnScope, int i, Continuation<? super ScreenerFilterComponents5> continuation) {
        super(2, continuation);
        this.$this_TargetedScrollColumn = targetedScrollColumnScope;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScreenerFilterComponents5(this.$this_TargetedScrollColumn, this.$index, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScreenerFilterComponents5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$this_TargetedScrollColumn.centerOn(boxing.boxInt(this.$index));
        return Unit.INSTANCE;
    }
}
