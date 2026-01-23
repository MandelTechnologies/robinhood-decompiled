package androidx.room;

import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: InvalidationTracker.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u001c\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0086@¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Landroidx/room/ObservedTableVersions;", "", "size", "", "<init>", "(I)V", "versions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "increment", "", "tableIds", "", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ObservedTableVersions {
    private final StateFlow2<int[]> versions;

    /* compiled from: InvalidationTracker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.ObservedTableVersions", m3645f = "InvalidationTracker.kt", m3646l = {602}, m3647m = "collect")
    /* renamed from: androidx.room.ObservedTableVersions$collect$1 */
    static final class C28841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C28841(Continuation<? super C28841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ObservedTableVersions.this.collect(null, this);
        }
    }

    public ObservedTableVersions(int i) {
        this.versions = StateFlow4.MutableStateFlow(new int[i]);
    }

    public final void increment(Set<Integer> tableIds) {
        int[] value;
        int[] iArr;
        int i;
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        StateFlow2<int[]> stateFlow2 = this.versions;
        do {
            value = stateFlow2.getValue();
            int[] iArr2 = value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                if (tableIds.contains(Integer.valueOf(i2))) {
                    i = iArr2[i2] + 1;
                } else {
                    i = iArr2[i2];
                }
                iArr[i2] = i;
            }
        } while (!stateFlow2.compareAndSet(value, iArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector<? super int[]> flowCollector, Continuation<?> continuation) {
        C28841 c28841;
        if (continuation instanceof C28841) {
            c28841 = (C28841) continuation;
            int i = c28841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28841.label = i - Integer.MIN_VALUE;
            } else {
                c28841 = new C28841(continuation);
            }
        }
        Object obj = c28841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow2<int[]> stateFlow2 = this.versions;
            c28841.label = 1;
            if (stateFlow2.collect(flowCollector, c28841) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new ExceptionsH();
    }
}
