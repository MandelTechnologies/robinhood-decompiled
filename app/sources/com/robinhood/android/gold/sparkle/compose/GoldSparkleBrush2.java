package com.robinhood.android.gold.sparkle.compose;

import android.graphics.PointF;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.SnapshotState;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.android.gold.sparkle.SparkleManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GoldSparkleBrush.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt$sparkleBrushAndShaderData$1$1", m3645f = "GoldSparkleBrush.kt", m3646l = {99}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt$sparkleBrushAndShaderData$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSparkleBrush2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ SparkleManager $sparkleManager;
    final /* synthetic */ SnapshotState<Offset> $translationOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldSparkleBrush2(SparkleManager sparkleManager, LifecycleOwner lifecycleOwner, SnapshotState<Offset> snapshotState, Continuation<? super GoldSparkleBrush2> continuation) {
        super(2, continuation);
        this.$sparkleManager = sparkleManager;
        this.$lifecycleOwner = lifecycleOwner;
        this.$translationOffset$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldSparkleBrush2(this.$sparkleManager, this.$lifecycleOwner, this.$translationOffset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldSparkleBrush2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow<PointF> translation = this.$sparkleManager.getTranslation();
            Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(FlowKt.distinctUntilChanged(new Flow<Offset>() { // from class: com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt$sparkleBrushAndShaderData$1$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt$sparkleBrushAndShaderData$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt$sparkleBrushAndShaderData$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "GoldSparkleBrush.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt$sparkleBrushAndShaderData$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        long jM6535constructorimpl;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            PointF pointF = (PointF) obj;
                            if (Float.isNaN(pointF.x) || Float.isNaN(pointF.y)) {
                                jM6535constructorimpl = Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(0.0f)) | (Float.floatToRawIntBits(0.0f) << 32));
                            } else {
                                float fRoundToInt = MathKt.roundToInt(pointF.x);
                                float fRoundToInt2 = MathKt.roundToInt(pointF.y);
                                jM6535constructorimpl = Offset.m6537copydBAh8RU$default(Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(fRoundToInt2)) | (Float.floatToRawIntBits(fRoundToInt) << 32)), 0.0f, 0.0f, 3, null);
                            }
                            Offset offsetM6534boximpl = Offset.m6534boximpl(jM6535constructorimpl);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(offsetM6534boximpl, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Offset> flowCollector, Continuation continuation) {
                    Object objCollect = translation.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }), this.$lifecycleOwner.getLifecycle(), Lifecycle.State.RESUMED);
            final SnapshotState<Offset> snapshotState = this.$translationOffset$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.gold.sparkle.compose.GoldSparkleBrushKt$sparkleBrushAndShaderData$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return m15096emit3MmeM6k(((Offset) obj2).getPackedValue(), continuation);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m15096emit3MmeM6k(long j, Continuation<? super Unit> continuation) {
                    GoldSparkleBrush.sparkleBrushAndShaderData_EPk0efs$lambda$2(snapshotState, j);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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
