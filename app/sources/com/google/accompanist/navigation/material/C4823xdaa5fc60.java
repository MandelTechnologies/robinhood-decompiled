package com.google.accompanist.navigation.material;

import androidx.compose.material.ModalBottomSheetState;
import androidx.navigation.NavBackStackEntry;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Emitters.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, m3637k = 3, m3638mv = {1, 9, 0})
@DebugMetadata(m3644c = "com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1", m3645f = "BottomSheetNavigator.kt", m3646l = {40}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1 */
/* loaded from: classes16.dex */
public final class C4823xdaa5fc60 extends ContinuationImpl7 implements Function2<FlowCollector<? super NavBackStackEntry>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BottomSheetNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4823xdaa5fc60(Flow flow, Continuation continuation, BottomSheetNavigator bottomSheetNavigator) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = bottomSheetNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C4823xdaa5fc60 c4823xdaa5fc60 = new C4823xdaa5fc60(this.$this_transform, continuation, this.this$0);
        c4823xdaa5fc60.L$0 = obj;
        return c4823xdaa5fc60;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super NavBackStackEntry> flowCollector, Continuation<? super Unit> continuation) {
        return ((C4823xdaa5fc60) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<NavBackStackEntry> $$this$flow;
        final /* synthetic */ BottomSheetNavigator this$0;

        /* compiled from: Emitters.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1", m3645f = "BottomSheetNavigator.kt", m3646l = {224, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m3647m = "emit")
        @SourceDebugExtension
        /* renamed from: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C494841 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C494841(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, BottomSheetNavigator bottomSheetNavigator) {
            this.this$0 = bottomSheetNavigator;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        
            if (r10.emit(r11, r0) != r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        
            if (r10.emit(r11, r0) == r1) goto L40;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) throws Throwable {
            C494841 c494841;
            FlowCollector flowCollector;
            List list;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            Object objLastOrNull;
            if (continuation instanceof C494841) {
                c494841 = (C494841) continuation;
                int i = c494841.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c494841.label = i - Integer.MIN_VALUE;
                } else {
                    c494841 = new C494841(continuation);
                }
            }
            Object obj = c494841.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c494841.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = this.$$this$flow;
                list = (List) t;
                try {
                    ModalBottomSheetState sheetState = this.this$0.getSheetState();
                    c494841.L$0 = list;
                    c494841.L$1 = flowCollector;
                    c494841.label = 1;
                    if (sheetState.hide(c494841) != coroutine_suspended) {
                        flowCollector3 = flowCollector;
                        Object objLastOrNull2 = CollectionsKt.lastOrNull((List<? extends Object>) list);
                        c494841.L$0 = null;
                        c494841.L$1 = null;
                        c494841.label = 2;
                    }
                } catch (CancellationException unused) {
                    flowCollector2 = flowCollector;
                    Object objLastOrNull3 = CollectionsKt.lastOrNull((List<? extends Object>) list);
                    c494841.L$0 = null;
                    c494841.L$1 = null;
                    c494841.label = 3;
                } catch (Throwable th) {
                    th = th;
                    objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
                    c494841.L$0 = th;
                    c494841.L$1 = null;
                    c494841.label = 4;
                    if (flowCollector.emit(objLastOrNull, c494841) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) c494841.L$0;
                ResultKt.throwOnFailure(obj);
                throw th2;
            }
            flowCollector2 = (FlowCollector) c494841.L$1;
            list = (List) c494841.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                flowCollector3 = flowCollector2;
                Object objLastOrNull22 = CollectionsKt.lastOrNull((List<? extends Object>) list);
                c494841.L$0 = null;
                c494841.L$1 = null;
                c494841.label = 2;
            } catch (CancellationException unused2) {
                Object objLastOrNull32 = CollectionsKt.lastOrNull((List<? extends Object>) list);
                c494841.L$0 = null;
                c494841.L$1 = null;
                c494841.label = 3;
            } catch (Throwable th3) {
                flowCollector = flowCollector2;
                th = th3;
                objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
                c494841.L$0 = th;
                c494841.L$1 = null;
                c494841.label = 4;
                if (flowCollector.emit(objLastOrNull, c494841) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th;
            }
        }
    }
}
