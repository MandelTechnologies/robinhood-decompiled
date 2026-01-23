package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker2;
import androidx.work.impl.constraints.controllers.ContraintControllers;
import androidx.work.impl.constraints.controllers.ContraintControllers2;
import androidx.work.impl.constraints.controllers.ContraintControllers3;
import androidx.work.impl.constraints.controllers.ContraintControllers5;
import androidx.work.impl.constraints.controllers.ContraintControllers6;
import androidx.work.impl.constraints.controllers.ContraintControllers7;
import androidx.work.impl.constraints.controllers.ContraintControllers8;
import androidx.work.impl.constraints.controllers.ContraintControllers9;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import com.plaid.internal.EnumC7081g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "trackers", "Landroidx/work/impl/constraints/trackers/Trackers;", "(Landroidx/work/impl/constraints/trackers/Trackers;)V", "controllers", "", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "(Ljava/util/List;)V", "areAllConstraintsMet", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "track", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "spec", "work-runtime_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WorkConstraintsTracker {
    private final List<ContraintControllers3<?>> controllers;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ContraintControllers3<?>> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.controllers = controllers;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this((List<? extends ContraintControllers3<?>>) CollectionsKt.listOf((Object[]) new ContraintControllers3[]{new ContraintControllers(trackers.getBatteryChargingTracker()), new ContraintControllers2(trackers.getBatteryNotLowTracker()), new ContraintControllers9(trackers.getStorageNotLowTracker()), new ContraintControllers5(trackers.getNetworkStateTracker()), new ContraintControllers8(trackers.getNetworkStateTracker()), new ContraintControllers7(trackers.getNetworkStateTracker()), new ContraintControllers6(trackers.getNetworkStateTracker())}));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }

    public final Flow<WorkConstraintsTracker2> track(WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List<ContraintControllers3<?>> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ContraintControllers3) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ContraintControllers3) it.next()).track());
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
        return FlowKt.distinctUntilChanged(new Flow<WorkConstraintsTracker2>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super WorkConstraintsTracker2> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<WorkConstraintsTracker2[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final WorkConstraintsTracker2[] invoke() {
                        return new WorkConstraintsTracker2[flowArr2.length];
                    }
                }, new C30613(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
            @DebugMetadata(m3644c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", m3645f = "WorkConstraintsTracker.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3 */
            public static final class C30613 extends ContinuationImpl7 implements Function3<FlowCollector<? super WorkConstraintsTracker2>, WorkConstraintsTracker2[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C30613(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super WorkConstraintsTracker2> flowCollector, WorkConstraintsTracker2[] workConstraintsTracker2Arr, Continuation<? super Unit> continuation) {
                    C30613 c30613 = new C30613(continuation);
                    c30613.L$0 = flowCollector;
                    c30613.L$1 = workConstraintsTracker2Arr;
                    return c30613.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    WorkConstraintsTracker2 workConstraintsTracker2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        WorkConstraintsTracker2[] workConstraintsTracker2Arr = (WorkConstraintsTracker2[]) ((Object[]) this.L$1);
                        int length = workConstraintsTracker2Arr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                workConstraintsTracker2 = null;
                                break;
                            }
                            workConstraintsTracker2 = workConstraintsTracker2Arr[i2];
                            if (!Intrinsics.areEqual(workConstraintsTracker2, WorkConstraintsTracker2.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i2++;
                        }
                        if (workConstraintsTracker2 == null) {
                            workConstraintsTracker2 = WorkConstraintsTracker2.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (flowCollector.emit(workConstraintsTracker2, this) == coroutine_suspended) {
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
        });
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        List<ContraintControllers3<?>> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ContraintControllers3) obj).isConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.get().debug(WorkConstraintsTracker4.TAG, "Work " + workSpec.id + " constrained by " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<ContraintControllers3<?>, CharSequence>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(ContraintControllers3<?> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    String simpleName = it.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
                    return simpleName;
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }
}
