package com.robinhood.utils.sensor;

import android.hardware.Sensor;
import android.os.SystemClock;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.math.Quaternion;
import java.util.concurrent.TimeUnit;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SensorManagers.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0003\u001a\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001\u001a\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"DEFAULT_SAMPLING_PERIOD", "", "DEFAULT_ALPHA", "", "eventsFromDefault", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/utils/sensor/SensorManager;", "type", "samplingPeriodUs", "gravity", "lowPassFilter", "resultVector", "alpha", "relativeRotation", "relativeRotationalVelocity", "rotationVector", "Lcom/robinhood/utils/math/Quaternion;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.sensor.SensorManagersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SensorManagers {
    private static final float DEFAULT_ALPHA = 0.8f;
    public static final int DEFAULT_SAMPLING_PERIOD = 10000;

    @JvmOverloads
    public static final Flow<float[]> gravity(SensorManager sensorManager) {
        Intrinsics.checkNotNullParameter(sensorManager, "<this>");
        return gravity$default(sensorManager, 0, 1, null);
    }

    public static /* synthetic */ Flow eventsFromDefault$default(SensorManager sensorManager, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 10000;
        }
        return eventsFromDefault(sensorManager, i, i2);
    }

    public static final Flow<float[]> eventsFromDefault(SensorManager sensorManager, int i, int i2) {
        Intrinsics.checkNotNullParameter(sensorManager, "<this>");
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        return defaultSensor == null ? FlowKt.emptyFlow() : sensorManager.events(defaultSensor, i2);
    }

    public static /* synthetic */ Flow gravity$default(SensorManager sensorManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 10000;
        }
        return gravity(sensorManager, i);
    }

    /* compiled from: SensorManagers.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.sensor.SensorManagersKt$gravity$1", m3645f = "SensorManagers.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$gravity$1 */
    static final class C419971 extends ContinuationImpl7 implements Function2<Produce4<? super float[]>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $samplingPeriodUs;
        final /* synthetic */ SensorManager $this_gravity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C419971(SensorManager sensorManager, int i, Continuation<? super C419971> continuation) {
            super(2, continuation);
            this.$this_gravity = sensorManager;
            this.$samplingPeriodUs = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C419971 c419971 = new C419971(this.$this_gravity, this.$samplingPeriodUs, continuation);
            c419971.L$0 = obj;
            return c419971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super float[]> produce4, Continuation<? super Unit> continuation) {
            return ((C419971) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Flow<float[]> flowEvents;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                Sensor defaultSensor = this.$this_gravity.getDefaultSensor(9);
                Sensor defaultSensor2 = this.$this_gravity.getDefaultSensor(1);
                if (defaultSensor2 == null) {
                    return Unit.INSTANCE;
                }
                if (defaultSensor == null) {
                    flowEvents = SensorManagers.lowPassFilter$default(this.$this_gravity.events(defaultSensor2, this.$samplingPeriodUs), new float[3], 0.0f, 2, null);
                } else {
                    flowEvents = this.$this_gravity.events(defaultSensor, this.$samplingPeriodUs);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(produce4);
                this.label = 1;
                if (flowEvents.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SensorManagers.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$gravity$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ Produce4<float[]> $tmp0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Produce4<? super float[]> produce4) {
                this.$tmp0 = produce4;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, Produce4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((float[]) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(float[] fArr, Continuation<? super Unit> continuation) {
                Object objSend = this.$tmp0.send(fArr, continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
            }
        }
    }

    @JvmOverloads
    public static final Flow<float[]> gravity(SensorManager sensorManager, int i) {
        Intrinsics.checkNotNullParameter(sensorManager, "<this>");
        return FlowKt.flowOn(FlowKt.channelFlow(new C419971(sensorManager, i, null)), Dispatchers.getDefault());
    }

    public static /* synthetic */ Flow lowPassFilter$default(Flow flow, float[] fArr, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.8f;
        }
        return lowPassFilter(flow, fArr, f);
    }

    public static /* synthetic */ Flow relativeRotation$default(SensorManager sensorManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 10000;
        }
        return relativeRotation(sensorManager, i);
    }

    /* compiled from: SensorManagers.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.sensor.SensorManagersKt$relativeRotation$1", m3645f = "SensorManagers.kt", m3646l = {117}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$relativeRotation$1 */
    static final class C419981 extends ContinuationImpl7 implements Function2<Produce4<? super float[]>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $samplingPeriodUs;
        final /* synthetic */ SensorManager $this_relativeRotation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C419981(int i, SensorManager sensorManager, Continuation<? super C419981> continuation) {
            super(2, continuation);
            this.$samplingPeriodUs = i;
            this.$this_relativeRotation = sensorManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C419981 c419981 = new C419981(this.$samplingPeriodUs, this.$this_relativeRotation, continuation);
            c419981.L$0 = obj;
            return c419981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super float[]> produce4, Continuation<? super Unit> continuation) {
            return ((C419981) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                final Ref.LongRef longRef = new Ref.LongRef();
                longRef.element = -1L;
                final Quaternion quaternion = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                final Quaternion quaternionInverse = quaternion.inverse();
                final Quaternion quaternion2 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                final Quaternion quaternion3 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                final long jConvert = TimeUnit.MILLISECONDS.convert(this.$samplingPeriodUs, TimeUnit.MICROSECONDS);
                final float[] fArr = new float[3];
                final Flow<Quaternion> flowRotationVector = SensorManagers.rotationVector(this.$this_relativeRotation, this.$samplingPeriodUs);
                Flow<float[]> flow = new Flow<float[]>() { // from class: com.robinhood.utils.sensor.SensorManagersKt$relativeRotation$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$relativeRotation$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C419942<T> implements FlowCollector {
                        final /* synthetic */ Quaternion $forward$inlined;
                        final /* synthetic */ Quaternion $forwardInverse$inlined;
                        final /* synthetic */ Quaternion $initialRotationInverse$inlined;
                        final /* synthetic */ Ref.LongRef $previousTime$inlined;
                        final /* synthetic */ float[] $rotation$inlined;
                        final /* synthetic */ long $samplingPeriodMs$inlined;
                        final /* synthetic */ Quaternion $temp1$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.utils.sensor.SensorManagersKt$relativeRotation$1$invokeSuspend$$inlined$map$1$2", m3645f = "SensorManagers.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$relativeRotation$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C419942.this.emit(null, this);
                            }
                        }

                        public C419942(FlowCollector flowCollector, Ref.LongRef longRef, Quaternion quaternion, float[] fArr, long j, Quaternion quaternion2, Quaternion quaternion3, Quaternion quaternion4) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$previousTime$inlined = longRef;
                            this.$initialRotationInverse$inlined = quaternion;
                            this.$rotation$inlined = fArr;
                            this.$samplingPeriodMs$inlined = j;
                            this.$temp1$inlined = quaternion2;
                            this.$forward$inlined = quaternion3;
                            this.$forwardInverse$inlined = quaternion4;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            float[] fArr;
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
                                Quaternion quaternion = (Quaternion) obj;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                long j = this.$previousTime$inlined.element;
                                if (j == -1) {
                                    Quaternion quaternion2 = this.$initialRotationInverse$inlined;
                                    quaternion2.set(quaternion);
                                    quaternion2.invert();
                                    this.$previousTime$inlined.element = jElapsedRealtime;
                                    fArr = this.$rotation$inlined;
                                } else if (jElapsedRealtime - j < this.$samplingPeriodMs$inlined) {
                                    fArr = this.$rotation$inlined;
                                } else {
                                    Quaternion quaternion3 = this.$temp1$inlined;
                                    quaternion3.set(this.$forward$inlined);
                                    quaternion3.multiply(this.$initialRotationInverse$inlined);
                                    quaternion3.multiply(quaternion);
                                    quaternion3.multiply(this.$forwardInverse$inlined);
                                    this.$rotation$inlined[0] = quaternion3.getPitch();
                                    this.$rotation$inlined[1] = quaternion3.getYaw();
                                    this.$rotation$inlined[2] = quaternion3.getRoll();
                                    this.$previousTime$inlined.element = jElapsedRealtime;
                                    fArr = this.$rotation$inlined;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(fArr, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super float[]> flowCollector, Continuation continuation) {
                        Object objCollect = flowRotationVector.collect(new C419942(flowCollector, longRef, quaternion2, fArr, jConvert, quaternion3, quaternion, quaternionInverse), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(produce4);
                this.label = 1;
                if (flow.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SensorManagers.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$relativeRotation$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ Produce4<float[]> $tmp0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Produce4<? super float[]> produce4) {
                this.$tmp0 = produce4;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, Produce4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((float[]) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(float[] fArr, Continuation<? super Unit> continuation) {
                Object objSend = this.$tmp0.send(fArr, continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
            }
        }
    }

    public static final Flow<float[]> relativeRotation(SensorManager sensorManager, int i) {
        Intrinsics.checkNotNullParameter(sensorManager, "<this>");
        return FlowKt.channelFlow(new C419981(i, sensorManager, null));
    }

    public static final Flow<float[]> lowPassFilter(final Flow<float[]> flow, final float[] resultVector, final float f) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(resultVector, "resultVector");
        return new Flow<float[]>() { // from class: com.robinhood.utils.sensor.SensorManagersKt$lowPassFilter$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$lowPassFilter$$inlined$map$1$2 */
            public static final class C419932<T> implements FlowCollector {
                final /* synthetic */ float $alpha$inlined;
                final /* synthetic */ float[] $resultVector$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.utils.sensor.SensorManagersKt$lowPassFilter$$inlined$map$1$2", m3645f = "SensorManagers.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$lowPassFilter$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C419932.this.emit(null, this);
                    }
                }

                public C419932(FlowCollector flowCollector, float[] fArr, float f) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$resultVector$inlined = fArr;
                    this.$alpha$inlined = f;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
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
                        float[] fArr = (float[]) obj;
                        int lastIndex = ArraysKt.getLastIndex(this.$resultVector$inlined);
                        if (lastIndex >= 0) {
                            int i3 = 0;
                            while (true) {
                                float[] fArr2 = this.$resultVector$inlined;
                                float f = this.$alpha$inlined;
                                fArr2[i3] = (fArr2[i3] * f) + ((1.0f - f) * fArr[i3]);
                                if (i3 == lastIndex) {
                                    break;
                                }
                                i3++;
                            }
                        }
                        float[] fArr3 = this.$resultVector$inlined;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(fArr3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super float[]> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C419932(flowCollector, resultVector, f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ Flow relativeRotationalVelocity$default(SensorManager sensorManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 10000;
        }
        return relativeRotationalVelocity(sensorManager, i);
    }

    /* compiled from: SensorManagers.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.sensor.SensorManagersKt$relativeRotationalVelocity$1", m3645f = "SensorManagers.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$relativeRotationalVelocity$1 */
    static final class C419991 extends ContinuationImpl7 implements Function2<Produce4<? super float[]>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $samplingPeriodUs;
        final /* synthetic */ SensorManager $this_relativeRotationalVelocity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C419991(int i, SensorManager sensorManager, Continuation<? super C419991> continuation) {
            super(2, continuation);
            this.$samplingPeriodUs = i;
            this.$this_relativeRotationalVelocity = sensorManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C419991 c419991 = new C419991(this.$samplingPeriodUs, this.$this_relativeRotationalVelocity, continuation);
            c419991.L$0 = obj;
            return c419991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super float[]> produce4, Continuation<? super Unit> continuation) {
            return ((C419991) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                final Ref.LongRef longRef = new Ref.LongRef();
                longRef.element = -1L;
                final Quaternion quaternion = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                final Quaternion quaternion2 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                final Quaternion quaternionInverse = quaternion2.inverse();
                final Quaternion quaternion3 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                final Quaternion quaternion4 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                final long jConvert = TimeUnit.MILLISECONDS.convert(this.$samplingPeriodUs, TimeUnit.MICROSECONDS);
                final float[] fArr = new float[3];
                final Flow<Quaternion> flowRotationVector = SensorManagers.rotationVector(this.$this_relativeRotationalVelocity, this.$samplingPeriodUs);
                Flow<float[]> flow = new Flow<float[]>() { // from class: com.robinhood.utils.sensor.SensorManagersKt$relativeRotationalVelocity$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super float[]> flowCollector, Continuation continuation) {
                        Object objCollect = flowRotationVector.collect(new AnonymousClass2(flowCollector, longRef, quaternion, fArr, jConvert, quaternion3, quaternion4, quaternion2, quaternionInverse), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$relativeRotationalVelocity$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ Quaternion $forward$inlined;
                        final /* synthetic */ Quaternion $forwardInverse$inlined;
                        final /* synthetic */ Quaternion $previousRotation$inlined;
                        final /* synthetic */ Ref.LongRef $previousTime$inlined;
                        final /* synthetic */ long $samplingPeriodMs$inlined;
                        final /* synthetic */ Quaternion $temp1$inlined;
                        final /* synthetic */ Quaternion $temp2$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ float[] $velocity$inlined;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.utils.sensor.SensorManagersKt$relativeRotationalVelocity$1$invokeSuspend$$inlined$map$1$2", m3645f = "SensorManagers.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$relativeRotationalVelocity$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, Ref.LongRef longRef, Quaternion quaternion, float[] fArr, long j, Quaternion quaternion2, Quaternion quaternion3, Quaternion quaternion4, Quaternion quaternion5) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$previousTime$inlined = longRef;
                            this.$previousRotation$inlined = quaternion;
                            this.$velocity$inlined = fArr;
                            this.$samplingPeriodMs$inlined = j;
                            this.$temp1$inlined = quaternion2;
                            this.$temp2$inlined = quaternion3;
                            this.$forward$inlined = quaternion4;
                            this.$forwardInverse$inlined = quaternion5;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            float[] fArr;
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
                                Quaternion quaternion = (Quaternion) obj;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                long j = this.$previousTime$inlined.element;
                                if (j == -1) {
                                    this.$previousRotation$inlined.set(quaternion);
                                    this.$previousTime$inlined.element = jElapsedRealtime;
                                    fArr = this.$velocity$inlined;
                                } else {
                                    long j2 = jElapsedRealtime - j;
                                    if (j2 < this.$samplingPeriodMs$inlined) {
                                        fArr = this.$velocity$inlined;
                                    } else {
                                        float f = j2 / 1000.0f;
                                        Quaternion quaternion2 = this.$temp1$inlined;
                                        quaternion2.set(this.$previousRotation$inlined);
                                        quaternion2.invert();
                                        Quaternion quaternion3 = this.$temp2$inlined;
                                        quaternion3.set(this.$forward$inlined);
                                        quaternion3.multiply(quaternion2);
                                        quaternion3.multiply(quaternion);
                                        quaternion3.multiply(this.$forwardInverse$inlined);
                                        this.$velocity$inlined[0] = quaternion3.getPitch() / f;
                                        this.$velocity$inlined[1] = quaternion3.getYaw() / f;
                                        this.$velocity$inlined[2] = quaternion3.getRoll() / f;
                                        this.$previousRotation$inlined.set(quaternion);
                                        this.$previousTime$inlined.element = jElapsedRealtime;
                                        fArr = this.$velocity$inlined;
                                    }
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(fArr, anonymousClass1) == coroutine_suspended) {
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
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(produce4);
                this.label = 1;
                if (flow.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SensorManagers.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$relativeRotationalVelocity$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ Produce4<float[]> $tmp0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Produce4<? super float[]> produce4) {
                this.$tmp0 = produce4;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, Produce4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((float[]) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(float[] fArr, Continuation<? super Unit> continuation) {
                Object objSend = this.$tmp0.send(fArr, continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
            }
        }
    }

    public static final Flow<float[]> relativeRotationalVelocity(SensorManager sensorManager, int i) {
        Intrinsics.checkNotNullParameter(sensorManager, "<this>");
        return FlowKt.channelFlow(new C419991(i, sensorManager, null));
    }

    public static /* synthetic */ Flow rotationVector$default(SensorManager sensorManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 10000;
        }
        return rotationVector(sensorManager, i);
    }

    /* compiled from: SensorManagers.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/utils/math/Quaternion;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.sensor.SensorManagersKt$rotationVector$1", m3645f = "SensorManagers.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$rotationVector$1 */
    static final class C420001 extends ContinuationImpl7 implements Function2<Produce4<? super Quaternion>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $samplingPeriodUs;
        final /* synthetic */ SensorManager $this_rotationVector;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420001(SensorManager sensorManager, int i, Continuation<? super C420001> continuation) {
            super(2, continuation);
            this.$this_rotationVector = sensorManager;
            this.$samplingPeriodUs = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C420001 c420001 = new C420001(this.$this_rotationVector, this.$samplingPeriodUs, continuation);
            c420001.L$0 = obj;
            return c420001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super Quaternion> produce4, Continuation<? super Unit> continuation) {
            return ((C420001) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                final float[] fArr = new float[4];
                final Quaternion quaternion = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                final Flow<float[]> flowEventsFromDefault = SensorManagers.eventsFromDefault(this.$this_rotationVector, 11, this.$samplingPeriodUs);
                final SensorManager sensorManager = this.$this_rotationVector;
                Flow<Quaternion> flow = new Flow<Quaternion>() { // from class: com.robinhood.utils.sensor.SensorManagersKt$rotationVector$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Quaternion> flowCollector, Continuation continuation) {
                        Object objCollect = flowEventsFromDefault.collect(new C419962(flowCollector, sensorManager, fArr, quaternion), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$rotationVector$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C419962<T> implements FlowCollector {
                        final /* synthetic */ float[] $quaternionValues$inlined;
                        final /* synthetic */ Quaternion $rotation$inlined;
                        final /* synthetic */ SensorManager $this_rotationVector$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.utils.sensor.SensorManagersKt$rotationVector$1$invokeSuspend$$inlined$map$1$2", m3645f = "SensorManagers.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$rotationVector$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C419962.this.emit(null, this);
                            }
                        }

                        public C419962(FlowCollector flowCollector, SensorManager sensorManager, float[] fArr, Quaternion quaternion) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$this_rotationVector$inlined = sensorManager;
                            this.$quaternionValues$inlined = fArr;
                            this.$rotation$inlined = quaternion;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
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
                                this.$this_rotationVector$inlined.getQuaternionFromVector(this.$quaternionValues$inlined, (float[]) obj);
                                Quaternion quaternion = this.$rotation$inlined;
                                quaternion.set(this.$quaternionValues$inlined);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(quaternion, anonymousClass1) == coroutine_suspended) {
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
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(produce4);
                this.label = 1;
                if (flow.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SensorManagers.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.utils.sensor.SensorManagersKt$rotationVector$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ Produce4<Quaternion> $tmp0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Produce4<? super Quaternion> produce4) {
                this.$tmp0 = produce4;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, Produce4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Quaternion quaternion, Continuation<? super Unit> continuation) {
                Object objSend = this.$tmp0.send(quaternion, continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Quaternion) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    public static final Flow<Quaternion> rotationVector(SensorManager sensorManager, int i) {
        Intrinsics.checkNotNullParameter(sensorManager, "<this>");
        return FlowKt.channelFlow(new C420001(sensorManager, i, null));
    }
}
