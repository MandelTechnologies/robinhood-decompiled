package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: PageFetcherSnapshot.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", m3645f = "PageFetcherSnapshot.kt", m3646l = {646, EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$2, reason: use source file name */
/* loaded from: classes4.dex */
final class PageFetcherSnapshot6<Value> extends ContinuationImpl7 implements Function2<FlowCollector<? super PageEvent<Value>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot6(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super PageFetcherSnapshot6> continuation) {
        super(2, continuation);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageFetcherSnapshot6 pageFetcherSnapshot6 = new PageFetcherSnapshot6(this.this$0, continuation);
        pageFetcherSnapshot6.L$0 = obj;
        return pageFetcherSnapshot6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super PageEvent<Value>> flowCollector, Continuation<? super Unit> continuation) {
        return ((PageFetcherSnapshot6) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1.emit(r2, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        PageFetcherSnapshotState.Holder holder;
        Mutex mutex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                holder = ((PageFetcherSnapshot) this.this$0).stateHolder;
                Mutex mutex2 = holder.lock;
                this.L$0 = holder;
                this.L$1 = mutex2;
                this.L$2 = flowCollector;
                this.label = 1;
                if (mutex2.lock(null, this) != coroutine_suspended) {
                    mutex = mutex2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$2;
            mutex = (Mutex) this.L$1;
            holder = (PageFetcherSnapshotState.Holder) this.L$0;
            ResultKt.throwOnFailure(obj);
            LoadStates loadStatesSnapshot = holder.state.getSourceLoadStates().snapshot();
            mutex.unlock(null);
            PageEvent.LoadStateUpdate loadStateUpdate = new PageEvent.LoadStateUpdate(loadStatesSnapshot, null, 2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
