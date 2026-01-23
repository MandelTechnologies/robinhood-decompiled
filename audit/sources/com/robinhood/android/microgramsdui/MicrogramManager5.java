package com.robinhood.android.microgramsdui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import microgram.android.MicrogramLaunchId;

/* compiled from: MicrogramManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance$1$2", m3645f = "MicrogramManager.kt", m3646l = {88}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance$1$2, reason: use source file name */
/* loaded from: classes8.dex */
final class MicrogramManager5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MicrogramLaunchId $id;
    final /* synthetic */ Duration $shutDownDebounce;
    int label;
    final /* synthetic */ MicrogramManager4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramManager5(Duration duration, MicrogramManager4 microgramManager4, MicrogramLaunchId microgramLaunchId, Continuation<? super MicrogramManager5> continuation) {
        super(2, continuation);
        this.$shutDownDebounce = duration;
        this.this$0 = microgramManager4;
        this.$id = microgramLaunchId;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MicrogramManager5(this.$shutDownDebounce, this.this$0, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MicrogramManager5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long rawValue = this.$shutDownDebounce.getRawValue();
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(rawValue, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.referenceManager.release(this.$id, new Function1() { // from class: com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance$1$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MicrogramManager5.invokeSuspend$lambda$0((MicrogramManager2) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MicrogramManager2 microgramManager2) {
        return Unit.INSTANCE;
    }
}
