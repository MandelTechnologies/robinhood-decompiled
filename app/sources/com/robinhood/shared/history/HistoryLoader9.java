package com.robinhood.shared.history;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HistoryLoader.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0014\b\u0004\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0004\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00010\tH\u0086\bø\u0001\u0000\u001aF\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0001\"\u0004\b\u0000\u0010\u000f*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001a\b\u0004\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000e0\u00010\tH\u0086\bø\u0001\u0000\u001aN\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u0002H\u00022\u0014\b\u0004\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00110\tH\u0082\b¢\u0006\u0002\u0010\u0016\u001a7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0011*\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0004\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\tH\u0082\b\u001aI\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0011\"\u0004\b\u0000\u0010\u000f*\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001a\b\u0004\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000e0\u00110\tH\u0082\b\u001a2\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u001a0\u000e0\u0001\"\b\b\u0000\u0010\u000f*\u00020\u001b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, m3636d2 = {"loadOnlyState", "Lkotlinx/coroutines/flow/Flow;", "R", "", "Lcom/robinhood/shared/history/HistoryLoader$Filter;", "desiredState", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "defaultValue", "flow", "Lkotlin/Function0;", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;", "loadOnlyStateCount", "", "loadOnlyStateList", "", "T", "loadOnlySupportedBrokerageAccountTypes", "Lio/reactivex/Observable;", "supportedBrokerageAccountTypes", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "observable", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Ljava/util/Set;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lio/reactivex/Observable;", "loadOnlySupportedBrokerageAccountTypesCount", "loadOnlySupportedBrokerageAccountTypesList", "toStatefulHistoryEvents", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "lib-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.history.HistoryLoaderKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HistoryLoader9 {
    public static final <T extends HistoryEvent> Flow<List<StatefulHistoryEvent<T>>> toStatefulHistoryEvents(final Flow<? extends List<? extends T>> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return (Flow<List<StatefulHistoryEvent<T>>>) new Flow<List<? extends StatefulHistoryEvent<? extends T>>>() { // from class: com.robinhood.shared.history.HistoryLoaderKt$toStatefulHistoryEvents$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C389672(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.history.HistoryLoaderKt$toStatefulHistoryEvents$$inlined$map$1$2 */
            public static final class C389672<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.history.HistoryLoaderKt$toStatefulHistoryEvents$$inlined$map$1$2", m3645f = "HistoryLoader.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.history.HistoryLoaderKt$toStatefulHistoryEvents$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C389672.this.emit(null, this);
                    }
                }

                public C389672(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(StatefulHistoryEvent.INSTANCE.m2830of((HistoryEvent) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
    }

    public static final <R> Flow<R> loadOnlyState(HistoryLoader.Filter filter, HistoryEvent.State desiredState, R defaultValue, Function0<? extends Flow<? extends R>> flow) {
        Intrinsics.checkNotNullParameter(filter, "<this>");
        Intrinsics.checkNotNullParameter(desiredState, "desiredState");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return (filter.getState() == null || filter.getState() == desiredState) ? flow.invoke() : FlowKt.flowOf(defaultValue);
    }

    public static final Flow<Integer> loadOnlyStateCount(HistoryLoader.Filter filter, HistoryEvent.State desiredState, Function0<? extends Flow<Integer>> flow) {
        Intrinsics.checkNotNullParameter(filter, "<this>");
        Intrinsics.checkNotNullParameter(desiredState, "desiredState");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return (filter.getState() == null || filter.getState() == desiredState) ? flow.invoke() : FlowKt.flowOf(0);
    }

    public static final <T> Flow<List<T>> loadOnlyStateList(HistoryLoader.Filter filter, HistoryEvent.State desiredState, Function0<? extends Flow<? extends List<? extends T>>> flow) {
        Intrinsics.checkNotNullParameter(filter, "<this>");
        Intrinsics.checkNotNullParameter(desiredState, "desiredState");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return (filter.getState() == null || filter.getState() == desiredState) ? flow.invoke() : FlowKt.flowOf(CollectionsKt.emptyList());
    }

    private static final <R> Observable<R> loadOnlySupportedBrokerageAccountTypes(HistoryLoader.Filter filter, Set<? extends BrokerageAccountType> set, R r, Function0<? extends Observable<R>> function0) {
        HistoryStaticFilter staticFilter = filter.getStaticFilter();
        Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
        if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, set).isEmpty()) {
            return function0.invoke();
        }
        Observable<R> observableJust = Observable.just(r);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    private static final Observable<Integer> loadOnlySupportedBrokerageAccountTypesCount(HistoryLoader.Filter filter, Set<? extends BrokerageAccountType> set, Function0<? extends Observable<Integer>> function0) {
        HistoryStaticFilter staticFilter = filter.getStaticFilter();
        Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
        if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, set).isEmpty()) {
            return function0.invoke();
        }
        Observable<Integer> observableJust = Observable.just(0);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    private static final <T> Observable<List<T>> loadOnlySupportedBrokerageAccountTypesList(HistoryLoader.Filter filter, Set<? extends BrokerageAccountType> set, Function0<? extends Observable<List<T>>> function0) {
        List listEmptyList = CollectionsKt.emptyList();
        HistoryStaticFilter staticFilter = filter.getStaticFilter();
        Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
        if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, set).isEmpty()) {
            return function0.invoke();
        }
        Observable<List<T>> observableJust = Observable.just(listEmptyList);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }
}
