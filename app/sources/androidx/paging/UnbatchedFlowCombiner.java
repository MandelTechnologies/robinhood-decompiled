package androidx.paging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: FlowExt.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Bb\u0012[\u0010\u0004\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u000eJ \u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0002\u0010\u001dR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000Re\u0010\u0004\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006\u001e"}, m3636d2 = {"Landroidx/paging/UnbatchedFlowCombiner;", "T1", "T2", "", "send", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function4;)V", "initialDispatched", "Lkotlinx/coroutines/CompletableDeferred;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/jvm/functions/Function4;", "valueReceived", "", "[Lkotlinx/coroutines/CompletableDeferred;", "values", "[Ljava/lang/Object;", "onNext", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "value", "(ILjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UnbatchedFlowCombiner<T1, T2> {
    private final CompletableDeferred<Unit> initialDispatched;
    private final Mutex lock;
    private final Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> send;
    private final CompletableDeferred<Unit>[] valueReceived;
    private final Object[] values;

    /* compiled from: FlowExt.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.UnbatchedFlowCombiner", m3645f = "FlowExt.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "onNext")
    /* renamed from: androidx.paging.UnbatchedFlowCombiner$onNext$1 */
    static final class C27921 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UnbatchedFlowCombiner<T1, T2> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27921(UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, Continuation<? super C27921> continuation) {
            super(continuation);
            this.this$0 = unbatchedFlowCombiner;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onNext(0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnbatchedFlowCombiner(Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super Unit>, ? extends Object> send) {
        Intrinsics.checkNotNullParameter(send, "send");
        this.send = send;
        this.initialDispatched = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        this.lock = Mutex3.Mutex$default(false, 1, null);
        CompletableDeferred<Unit>[] completableDeferredArr = new CompletableDeferred[2];
        for (int i = 0; i < 2; i++) {
            completableDeferredArr[i] = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        }
        this.valueReceived = completableDeferredArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            objArr[i2] = FlowExtKt.NULL;
        }
        this.values = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r2.await(r3) == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:34:0x00ac, B:36:0x00b3, B:43:0x00c4, B:45:0x00cc, B:48:0x00d6, B:50:0x00db, B:54:0x00e5, B:52:0x00e0, B:53:0x00e3, B:39:0x00bd), top: B:64:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:34:0x00ac, B:36:0x00b3, B:43:0x00c4, B:45:0x00cc, B:48:0x00d6, B:50:0x00db, B:54:0x00e5, B:52:0x00e0, B:53:0x00e3, B:39:0x00bd), top: B:64:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:34:0x00ac, B:36:0x00b3, B:43:0x00c4, B:45:0x00cc, B:48:0x00d6, B:50:0x00db, B:54:0x00e5, B:52:0x00e0, B:53:0x00e3, B:39:0x00bd), top: B:64:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNext(int i, Object obj, Continuation<? super Unit> continuation) throws Throwable {
        C27921 c27921;
        Object obj2;
        UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner;
        Object obj3;
        Mutex mutex;
        int i2;
        UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner2;
        Mutex mutex2;
        int length;
        int i3;
        boolean z;
        CombineSource combineSource;
        Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> function4;
        Object obj4;
        Object obj5;
        int i4 = i;
        if (continuation instanceof C27921) {
            c27921 = (C27921) continuation;
            int i5 = c27921.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c27921.label = i5 - Integer.MIN_VALUE;
            } else {
                c27921 = new C27921(this, continuation);
            }
        }
        Object obj6 = c27921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c27921.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj6);
            if (this.valueReceived[i4].isCompleted()) {
                CompletableDeferred<Unit> completableDeferred = this.initialDispatched;
                c27921.L$0 = this;
                obj2 = obj;
                c27921.L$1 = obj2;
                c27921.I$0 = i4;
                c27921.label = 1;
            } else {
                obj2 = obj;
                this.valueReceived[i4].complete(Unit.INSTANCE);
            }
            unbatchedFlowCombiner = this;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) c27921.L$1;
                    unbatchedFlowCombiner2 = (UnbatchedFlowCombiner) c27921.L$0;
                    try {
                        ResultKt.throwOnFailure(obj6);
                        unbatchedFlowCombiner2.initialDispatched.complete(Unit.INSTANCE);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                i4 = c27921.I$0;
                mutex = (Mutex) c27921.L$2;
                obj3 = c27921.L$1;
                unbatchedFlowCombiner = (UnbatchedFlowCombiner) c27921.L$0;
                ResultKt.throwOnFailure(obj6);
                i2 = i4;
                unbatchedFlowCombiner2 = unbatchedFlowCombiner;
                try {
                    Object[] objArr = unbatchedFlowCombiner2.values;
                    length = objArr.length;
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            z = false;
                            break;
                        }
                        if (objArr[i3] == FlowExtKt.NULL) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    Object[] objArr2 = unbatchedFlowCombiner2.values;
                    objArr2[i2] = obj3;
                    for (Object obj7 : objArr2) {
                        if (obj7 == FlowExtKt.NULL) {
                            mutex2 = mutex;
                            break;
                        }
                    }
                    if (!z) {
                        combineSource = CombineSource.INITIAL;
                    } else if (i2 == 0) {
                        combineSource = CombineSource.RECEIVER;
                    } else {
                        combineSource = CombineSource.OTHER;
                    }
                    function4 = unbatchedFlowCombiner2.send;
                    Object[] objArr3 = unbatchedFlowCombiner2.values;
                    obj4 = objArr3[0];
                    obj5 = objArr3[1];
                    c27921.L$0 = unbatchedFlowCombiner2;
                    c27921.L$1 = mutex;
                    c27921.L$2 = null;
                    c27921.label = 3;
                    if (function4.invoke(obj4, obj5, combineSource, c27921) != coroutine_suspended) {
                        mutex2 = mutex;
                        unbatchedFlowCombiner2.initialDispatched.complete(Unit.INSTANCE);
                        Unit unit2 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2 = mutex;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            i4 = c27921.I$0;
            obj2 = c27921.L$1;
            unbatchedFlowCombiner = (UnbatchedFlowCombiner) c27921.L$0;
            ResultKt.throwOnFailure(obj6);
        }
        Mutex mutex3 = unbatchedFlowCombiner.lock;
        c27921.L$0 = unbatchedFlowCombiner;
        c27921.L$1 = obj2;
        c27921.L$2 = mutex3;
        c27921.I$0 = i4;
        c27921.label = 2;
        if (mutex3.lock(null, c27921) != coroutine_suspended) {
            obj3 = obj2;
            mutex = mutex3;
            i2 = i4;
            unbatchedFlowCombiner2 = unbatchedFlowCombiner;
            Object[] objArr4 = unbatchedFlowCombiner2.values;
            length = objArr4.length;
            i3 = 0;
            while (true) {
                if (i3 < length) {
                }
                i3++;
            }
            Object[] objArr22 = unbatchedFlowCombiner2.values;
            objArr22[i2] = obj3;
            while (i < r7) {
            }
            if (!z) {
            }
            function4 = unbatchedFlowCombiner2.send;
            Object[] objArr32 = unbatchedFlowCombiner2.values;
            obj4 = objArr32[0];
            obj5 = objArr32[1];
            c27921.L$0 = unbatchedFlowCombiner2;
            c27921.L$1 = mutex;
            c27921.L$2 = null;
            c27921.label = 3;
            if (function4.invoke(obj4, obj5, combineSource, c27921) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
