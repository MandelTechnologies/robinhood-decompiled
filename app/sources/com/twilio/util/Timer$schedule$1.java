package com.twilio.util;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: Timer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
@DebugMetadata(m3644c = "com.twilio.util.Timer$schedule$1", m3645f = "Timer.kt", m3646l = {26}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class Timer$schedule$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    final /* synthetic */ Function0<Unit> $task;
    int label;
    final /* synthetic */ Timer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timer$schedule$1(long j, Timer timer, Function0<Unit> function0, Continuation<? super Timer$schedule$1> continuation) {
        super(2, continuation);
        this.$duration = j;
        this.this$0 = timer;
        this.$task = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Timer$schedule$1(this.$duration, this.this$0, this.$task, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Timer$schedule$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.$duration;
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.setJob(null);
        this.$task.invoke();
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        long j = this.$duration;
        InlineMarker.mark(0);
        DelayKt.m28786delayVtjQ1oo(j, this);
        InlineMarker.mark(1);
        this.this$0.setJob(null);
        this.$task.invoke();
        return Unit.INSTANCE;
    }
}
