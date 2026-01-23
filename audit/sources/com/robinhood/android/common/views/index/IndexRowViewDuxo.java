package com.robinhood.android.common.views.index;

import android.view.View;
import com.robinhood.android.common.data.prefs.ViewModePref;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.prefs.StringPreference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: IndexRowViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/views/index/IndexRowViewDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/common/views/index/IndexRowViewState;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "viewModePreference", "Lcom/robinhood/prefs/StringPreference;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/prefs/StringPreference;Landroid/view/View;)V", "getViewModePreference", "()Lcom/robinhood/prefs/StringPreference;", "onResume", "", "updateViewMode", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "setData", "indexId", "Ljava/util/UUID;", "displayName", "", "symbol", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IndexRowViewDuxo extends ViewDuxo<IndexRowViewState> {
    public static final int $stable = 8;
    private final IndexStore indexStore;
    private final StringPreference viewModePreference;

    public final StringPreference getViewModePreference() {
        return this.viewModePreference;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public IndexRowViewDuxo(IndexStore indexStore, @ViewModePref StringPreference viewModePreference, View hostView) {
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        String str = viewModePreference.get();
        if (str != null) {
            Object[] objArr = 0 == true ? 1 : 0;
            super(hostView, new IndexRowViewState(null, null, null, null, null, SecurityViewMode.valueOf(str), 31, null), objArr, 4, 0 == true ? 1 : 0);
            this.indexStore = indexStore;
            this.viewModePreference = viewModePreference;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        final StateFlow<IndexRowViewState> statesFlow = getStatesFlow();
        Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.common.views.index.IndexRowViewDuxo$onResume$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.views.index.IndexRowViewDuxo$onResume$$inlined$map$1$2 */
            public static final class C119162<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.views.index.IndexRowViewDuxo$onResume$$inlined$map$1$2", m3645f = "IndexRowViewDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.views.index.IndexRowViewDuxo$onResume$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C119162.this.emit(null, this);
                    }
                }

                public C119162(FlowCollector flowCollector) {
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
                        UUID indexId = ((IndexRowViewState) obj).getIndexId();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(indexId, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = statesFlow.collect(new C119162(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }));
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(FlowKt.transformLatest(flowFilterNotNull, new IndexRowViewDuxo$onResume$$inlined$flatMapLatest$1(null, this))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowViewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowViewDuxo.onResume$lambda$3(this.f$0, (IndexValue) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(FlowKt.transformLatest(flowFilterNotNull, new IndexRowViewDuxo$onResume$$inlined$flatMapLatest$2(null, this))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowViewDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowViewDuxo.onResume$lambda$6(this.f$0, (IndexCloseValue) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(IndexRowViewDuxo indexRowViewDuxo, final IndexValue indexValue) {
        Intrinsics.checkNotNullParameter(indexValue, "indexValue");
        indexRowViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowViewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowViewDuxo.onResume$lambda$3$lambda$2(indexValue, (IndexRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndexRowViewState onResume$lambda$3$lambda$2(IndexValue indexValue, IndexRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return IndexRowViewState.copy$default(applyMutation, null, null, null, indexValue, null, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(IndexRowViewDuxo indexRowViewDuxo, final IndexCloseValue indexCloseValue) {
        Intrinsics.checkNotNullParameter(indexCloseValue, "indexCloseValue");
        indexRowViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowViewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowViewDuxo.onResume$lambda$6$lambda$5(indexCloseValue, (IndexRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndexRowViewState onResume$lambda$6$lambda$5(IndexCloseValue indexCloseValue, IndexRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return IndexRowViewState.copy$default(applyMutation, null, null, null, null, indexCloseValue, null, 47, null);
    }

    public final void updateViewMode(final SecurityViewMode viewMode) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowViewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowViewDuxo.updateViewMode$lambda$7(viewMode, this, (IndexRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndexRowViewState updateViewMode$lambda$7(SecurityViewMode securityViewMode, IndexRowViewDuxo indexRowViewDuxo, IndexRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (securityViewMode == null) {
            String str = indexRowViewDuxo.viewModePreference.get();
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            securityViewMode = SecurityViewMode.valueOf(str);
        }
        return IndexRowViewState.copy$default(applyMutation, null, null, null, null, null, securityViewMode, 31, null);
    }

    public final void setData(final UUID indexId, final String displayName, final String symbol) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowViewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowViewDuxo.setData$lambda$8(indexId, displayName, symbol, (IndexRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndexRowViewState setData$lambda$8(UUID uuid, String str, String str2, IndexRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (Intrinsics.areEqual(applyMutation.getIndexId(), uuid)) {
            return applyMutation;
        }
        return new IndexRowViewState(uuid, str, str2, null, null, applyMutation.getViewMode(), 24, null);
    }
}
