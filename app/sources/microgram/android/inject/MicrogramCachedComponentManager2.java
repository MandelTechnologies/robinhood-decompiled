package microgram.android.inject;

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
import microgram.android.Monitoring;

/* compiled from: MicrogramCachedComponentManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/android/MicrogramState;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.inject.MicrogramCachedComponentManager$microgramStateFlow$1", m3645f = "MicrogramCachedComponentManager.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: microgram.android.inject.MicrogramCachedComponentManager$microgramStateFlow$1, reason: use source file name */
/* loaded from: classes14.dex */
final class MicrogramCachedComponentManager2 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends Monitoring>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    MicrogramCachedComponentManager2(Continuation<? super MicrogramCachedComponentManager2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends Monitoring>> continuation) {
        MicrogramCachedComponentManager2 microgramCachedComponentManager2 = new MicrogramCachedComponentManager2(continuation);
        microgramCachedComponentManager2.L$0 = microgramComponent;
        return microgramCachedComponentManager2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((MicrogramComponent) this.L$0).getMicrogramMonitor().getState();
    }
}
