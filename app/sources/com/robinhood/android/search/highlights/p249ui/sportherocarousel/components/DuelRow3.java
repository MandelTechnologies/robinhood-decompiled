package com.robinhood.android.search.highlights.p249ui.sportherocarousel.components;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.SharedFlow2;
import p479j$.time.Instant;

/* compiled from: DuelRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$FloatingOpenInterest$1$1$1", m3645f = "DuelRow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$FloatingOpenInterest$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class DuelRow3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SharedFlow2<Instant> $timeFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DuelRow3(SharedFlow2<Instant> sharedFlow2, Continuation<? super DuelRow3> continuation) {
        super(2, continuation);
        this.$timeFlow = sharedFlow2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DuelRow3(this.$timeFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DuelRow3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            SharedFlow2<Instant> sharedFlow2 = this.$timeFlow;
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            sharedFlow2.tryEmit(instantNow);
            this.label = 1;
        } while (DelayKt.delay(10L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
