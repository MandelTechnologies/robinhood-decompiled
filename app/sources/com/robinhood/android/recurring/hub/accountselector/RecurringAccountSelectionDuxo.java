package com.robinhood.android.recurring.hub.accountselector;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RecurringAccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionDataState;", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionViewState;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "stateProvider", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecurringAccountSelectionDuxo extends BaseDuxo<RecurringAccountSelectionDataState, RecurringAccountSelectionViewState> {
    public static final int $stable = 8;
    private final AccountAccessStore accountAccessStore;
    private final UnifiedAccountStore unifiedAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringAccountSelectionDuxo(UnifiedAccountStore unifiedAccountStore, AccountAccessStore accountAccessStore, RecurringAccountSelectionState3 stateProvider, DuxoBundle duxoBundle) {
        super(new RecurringAccountSelectionDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.unifiedAccountStore = unifiedAccountStore;
        this.accountAccessStore = accountAccessStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C262401(null));
    }

    /* compiled from: RecurringAccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionDuxo$onCreate$1", m3645f = "RecurringAccountSelectionDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionDuxo$onCreate$1 */
    static final class C262401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C262401(Continuation<? super C262401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringAccountSelectionDuxo.this.new C262401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C262401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UnifiedAccountStore.refresh$default(RecurringAccountSelectionDuxo.this.unifiedAccountStore, false, 1, null);
                Flow flowTransformLatest = FlowKt.transformLatest(RecurringAccountSelectionDuxo.this.unifiedAccountStore.streamAllSelfDirectedAccounts(), new C26237x17c50e56(null, RecurringAccountSelectionDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringAccountSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: RecurringAccountSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accounts", "", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionDuxo$onCreate$1$2", m3645f = "RecurringAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends RecurringAccount>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringAccountSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringAccountSelectionDuxo recurringAccountSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringAccountSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends RecurringAccount> list, Continuation<? super Unit> continuation) {
                return invoke2((List<RecurringAccount>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<RecurringAccount> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: RecurringAccountSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionDuxo$onCreate$1$2$1", m3645f = "RecurringAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.recurring.hub.accountselector.RecurringAccountSelectionDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RecurringAccountSelectionDataState, Continuation<? super RecurringAccountSelectionDataState>, Object> {
                final /* synthetic */ List<RecurringAccount> $accounts;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<RecurringAccount> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$accounts = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accounts, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RecurringAccountSelectionDataState recurringAccountSelectionDataState, Continuation<? super RecurringAccountSelectionDataState> continuation) {
                    return ((AnonymousClass1) create(recurringAccountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((RecurringAccountSelectionDataState) this.L$0).copy(extensions2.toImmutableList(this.$accounts));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
