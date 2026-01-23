package kotlinx.coroutines.rx2;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RxScheduler.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.rx2.RxSchedulerKt", m3645f = "RxScheduler.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "scheduleTask$task")
/* renamed from: kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1, reason: use source file name */
/* loaded from: classes14.dex */
final class RxScheduler5 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RxScheduler5(Continuation<? super RxScheduler5> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RxScheduler4.scheduleTask$task(null, null, null, this);
    }
}
