package com.robinhood.trader.singpass;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.trader.singpass.SingpassRetrievingComposable3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SingpassRetrievingComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.trader.singpass.SingpassRetrievingComposableKt$SingpassRetrievingComposable$2$1$2$2$1", m3645f = "SingpassRetrievingComposable.kt", m3646l = {102}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.trader.singpass.SingpassRetrievingComposableKt$SingpassRetrievingComposable$2$1$2$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class SingpassRetrievingComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $showErrorMessage$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingpassRetrievingComposable5(SnapshotState<Boolean> snapshotState, Continuation<? super SingpassRetrievingComposable5> continuation) {
        super(2, continuation);
        this.$showErrorMessage$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingpassRetrievingComposable5(this.$showErrorMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingpassRetrievingComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.INSTANCE;
            long duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SingpassRetrievingComposable3.C417532.invoke$lambda$6$lambda$5$lambda$3(this.$showErrorMessage$delegate, true);
        return Unit.INSTANCE;
    }
}
