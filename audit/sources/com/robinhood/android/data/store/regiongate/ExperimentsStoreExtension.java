package com.robinhood.android.data.store.regiongate;

import com.robinhood.android.regiongate.ExperimentTarget;
import com.robinhood.enums.RhEnum;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ExperimentsStoreExtension.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n2\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/data/store/regiongate/ExperimentsStoreExtension;", "", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "streamInAnyTargetVariant", "Lkotlinx/coroutines/flow/Flow;", "", "experimentTargets", "", "Lcom/robinhood/android/regiongate/ExperimentTarget;", "trigger", "lib-store-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ExperimentsStoreExtension {
    private final ExperimentsStore experimentsStore;

    public ExperimentsStoreExtension(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.experimentsStore = experimentsStore;
    }

    public final Flow<Boolean> streamInAnyTargetVariant(final List<? extends ExperimentTarget<?>> experimentTargets, boolean trigger) {
        Intrinsics.checkNotNullParameter(experimentTargets, "experimentTargets");
        if (experimentTargets.isEmpty()) {
            return FlowKt.flowOf(Boolean.FALSE);
        }
        ExperimentsStore experimentsStore = this.experimentsStore;
        List<? extends ExperimentTarget<?>> list = experimentTargets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExperimentTarget) it.next()).getExperiment());
        }
        final Flow<List<String>> flowCoStreamVariations = experimentsStore.coStreamVariations(arrayList, trigger);
        return new Flow<Boolean>() { // from class: com.robinhood.android.data.store.regiongate.ExperimentsStoreExtension$streamInAnyTargetVariant$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.data.store.regiongate.ExperimentsStoreExtension$streamInAnyTargetVariant$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ List $experimentTargets$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.data.store.regiongate.ExperimentsStoreExtension$streamInAnyTargetVariant$$inlined$map$1$2", m3645f = "ExperimentsStoreExtension.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.data.store.regiongate.ExperimentsStoreExtension$streamInAnyTargetVariant$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, List list) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$experimentTargets$inlined = list;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    boolean z;
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
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        boolean z2 = false;
                        int i3 = 0;
                        for (T t : list) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            String str = (String) t;
                            List memberVariants = ((ExperimentTarget) this.$experimentTargets$inlined.get(i3)).getMemberVariants();
                            if ((memberVariants instanceof Collection) && memberVariants.isEmpty()) {
                                z = false;
                            } else {
                                Iterator<T> it = memberVariants.iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.areEqual(((RhEnum) it.next()).getServerValue(), str)) {
                                        z = true;
                                        break;
                                    }
                                }
                                z = false;
                            }
                            arrayList.add(boxing.boxBoolean(z));
                            i3 = i4;
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator<T> it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((Boolean) it2.next()).booleanValue()) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        Boolean boolBoxBoolean = boxing.boxBoolean(z2);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowCoStreamVariations.collect(new AnonymousClass2(flowCollector, experimentTargets), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
