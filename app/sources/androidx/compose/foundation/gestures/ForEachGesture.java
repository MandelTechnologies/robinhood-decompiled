package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobKt;

/* compiled from: ForEachGesture.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0080@¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\bH\u0080@¢\u0006\u0002\u0010\t\u001a;\u0010\n\u001a\u00020\u0004*\u00020\b2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0002\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\u0004*\u00020\b2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0087@¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"allPointersUp", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitAllPointersUp", "", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitEachGesture", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forEachGesture", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class ForEachGesture {

    /* compiled from: ForEachGesture.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ForEachGestureKt", m3645f = "ForEachGesture.kt", m3646l = {84}, m3647m = "awaitAllPointersUp")
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 */
    static final class C11103 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11103(Continuation<? super C11103> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGesture.awaitAllPointersUp(null, null, this);
        }
    }

    /* compiled from: ForEachGesture.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ForEachGestureKt", m3645f = "ForEachGesture.kt", m3646l = {48, 51, 56}, m3647m = "forEachGesture")
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 */
    static final class C11121 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11121(Continuation<? super C11121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGesture.forEachGesture(null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please report as a decompilation issue!!! */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object forEachGesture(PointerInputScope pointerInputScope, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C11121 c11121;
        CoroutineContext coroutineContext;
        PointerInputScope pointerInputScope2;
        CoroutineContext coroutineContext2;
        PointerInputScope pointerInputScope3;
        if (continuation instanceof C11121) {
            c11121 = (C11121) continuation;
            int i = c11121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11121.label = i - Integer.MIN_VALUE;
            } else {
                c11121 = new C11121(continuation);
            }
        }
        Object obj = c11121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c11121.label;
        try {
        } catch (CancellationException e) {
            e = e;
            if (!JobKt.isActive(pointerInputScope)) {
            }
        }
        if (r2 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineContext = c11121.getContext();
            pointerInputScope2 = pointerInputScope;
            if (!JobKt.isActive(coroutineContext)) {
            }
        } else {
            if (r2 != 1) {
                if (r2 == 2) {
                    CoroutineContext coroutineContext3 = (CoroutineContext) c11121.L$2;
                    function2 = (Function2) c11121.L$1;
                    PointerInputScope pointerInputScope4 = (PointerInputScope) c11121.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputScope3 = pointerInputScope4;
                    coroutineContext2 = coroutineContext3;
                } else {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CoroutineContext coroutineContext4 = (CoroutineContext) c11121.L$2;
                    function2 = (Function2) c11121.L$1;
                    PointerInputScope pointerInputScope5 = (PointerInputScope) c11121.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputScope3 = pointerInputScope5;
                    coroutineContext2 = coroutineContext4;
                }
                coroutineContext = coroutineContext2;
                pointerInputScope2 = pointerInputScope3;
                if (!JobKt.isActive(coroutineContext)) {
                    try {
                    } catch (CancellationException e2) {
                        r2 = pointerInputScope2;
                        pointerInputScope = coroutineContext;
                        e = e2;
                        if (!JobKt.isActive(pointerInputScope)) {
                            c11121.L$0 = r2;
                            c11121.L$1 = function2;
                            c11121.L$2 = pointerInputScope;
                            c11121.label = 3;
                            Object objAwaitAllPointersUp = awaitAllPointersUp(r2, c11121);
                            pointerInputScope3 = r2;
                            coroutineContext2 = pointerInputScope;
                        } else {
                            throw e;
                        }
                    }
                    c11121.L$0 = pointerInputScope2;
                    c11121.L$1 = function2;
                    c11121.L$2 = coroutineContext;
                    c11121.label = 1;
                    if (function2.invoke(pointerInputScope2, c11121) != coroutine_suspended) {
                        r2 = pointerInputScope2;
                        pointerInputScope = coroutineContext;
                        c11121.L$0 = r2;
                        c11121.L$1 = function2;
                        c11121.L$2 = pointerInputScope;
                        c11121.label = 2;
                        Object objAwaitAllPointersUp2 = awaitAllPointersUp(r2, c11121);
                        pointerInputScope3 = r2;
                        coroutineContext2 = pointerInputScope;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            CoroutineContext coroutineContext5 = (CoroutineContext) c11121.L$2;
            function2 = (Function2) c11121.L$1;
            PointerInputScope pointerInputScope6 = (PointerInputScope) c11121.L$0;
            ResultKt.throwOnFailure(obj);
            r2 = pointerInputScope6;
            pointerInputScope = coroutineContext5;
            c11121.L$0 = r2;
            c11121.L$1 = function2;
            c11121.L$2 = pointerInputScope;
            c11121.label = 2;
            Object objAwaitAllPointersUp22 = awaitAllPointersUp(r2, c11121);
            pointerInputScope3 = r2;
            coroutineContext2 = pointerInputScope;
        }
    }

    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (changes.get(i).getPressed()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* compiled from: ForEachGesture.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", m3645f = "ForEachGesture.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 */
    static final class C11092 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C11092(Continuation<? super C11092> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11092 c11092 = new C11092(continuation);
            c11092.L$0 = obj;
            return c11092;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C11092) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                if (ForEachGesture.awaitAllPointersUp$default(awaitPointerEventScope, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C11092(null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (allPointersUp(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUp(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation<? super Unit> continuation) {
        C11103 c11103;
        if (continuation instanceof C11103) {
            c11103 = (C11103) continuation;
            int i = c11103.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11103.label = i - Integer.MIN_VALUE;
            } else {
                c11103 = new C11103(continuation);
            }
        }
        Object objAwaitPointerEvent = c11103.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11103.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PointerEventPass pointerEventPass2 = (PointerEventPass) c11103.L$1;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) c11103.L$0;
            ResultKt.throwOnFailure(objAwaitPointerEvent);
            pointerEventPass = pointerEventPass2;
            awaitPointerEventScope = awaitPointerEventScope2;
            List<PointerInputChange> changes = ((PointerEvent) objAwaitPointerEvent).getChanges();
            int size = changes.size();
            int i3 = 0;
            while (i3 < size) {
                if (changes.get(i3).getPressed()) {
                    c11103.L$0 = awaitPointerEventScope;
                    c11103.L$1 = pointerEventPass;
                    c11103.label = 1;
                    objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, c11103);
                    if (objAwaitPointerEvent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List<PointerInputChange> changes2 = ((PointerEvent) objAwaitPointerEvent).getChanges();
                    int size2 = changes2.size();
                    int i32 = 0;
                    while (i32 < size2) {
                    }
                } else {
                    i32++;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objAwaitPointerEvent);
    }

    public static /* synthetic */ Object awaitAllPointersUp$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Final;
        }
        return awaitAllPointersUp(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* compiled from: ForEachGesture.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m3645f = "ForEachGesture.kt", m3646l = {102, 105, 110}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2 */
    static final class C11112 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ CoroutineContext $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11112(CoroutineContext coroutineContext, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C11112> continuation) {
            super(2, continuation);
            this.$currentContext = coroutineContext;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11112 c11112 = new C11112(this.$currentContext, this.$block, continuation);
            c11112.L$0 = obj;
            return c11112;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C11112) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
        
            if (r9 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:12:0x0029). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:12:0x0029). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
            } catch (CancellationException e) {
                e = e;
                if (!JobKt.isActive(this.$currentContext)) {
                    this.L$0 = r1;
                    this.label = 3;
                    Object objAwaitAllPointersUp$default = ForEachGesture.awaitAllPointersUp$default(r1, null, this, 1, null);
                    awaitPointerEventScope2 = r1;
                } else {
                    throw e;
                }
            }
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                if (!JobKt.isActive(this.$currentContext)) {
                }
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                    } else {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    if (!JobKt.isActive(this.$currentContext)) {
                        try {
                        } catch (CancellationException e2) {
                            r1 = awaitPointerEventScope;
                            e = e2;
                            if (!JobKt.isActive(this.$currentContext)) {
                            }
                        }
                        Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = this.$block;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        if (function2.invoke(awaitPointerEventScope, this) != coroutine_suspended) {
                            r1 = awaitPointerEventScope;
                            this.L$0 = r1;
                            this.label = 2;
                            Object objAwaitAllPointersUp$default2 = ForEachGesture.awaitAllPointersUp$default(r1, null, this, 1, null);
                            awaitPointerEventScope2 = r1;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = awaitPointerEventScope5;
                this.L$0 = r1;
                this.label = 2;
                Object objAwaitAllPointersUp$default22 = ForEachGesture.awaitAllPointersUp$default(r1, null, this, 1, null);
                awaitPointerEventScope2 = r1;
            }
        }
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C11112(continuation.getContext(), function2, null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }
}
