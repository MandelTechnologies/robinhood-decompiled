package com.robinhood.android.mcw.cashbalancedetails;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.store.mcw.McwStore;
import com.robinhood.android.lib.store.mcw.data.CashBalancesDetailsPageData;
import com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsState;
import com.robinhood.android.mcw.contracts.CashBalanceDetailsKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CashBalanceDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$Data;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View;", "Lcom/robinhood/android/udf/HasSavedState;", "mcwStore", "Lcom/robinhood/android/lib/store/mcw/McwStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/store/mcw/McwStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CashBalanceDetailsDuxo extends BaseDuxo<CashBalanceDetailsState.Data, CashBalanceDetailsState.View> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CashBalanceDetailsDuxo(McwStore mcwStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new CashBalanceDetailsState.Data(null, 1, 0 == true ? 1 : 0), CashBalanceDetailsState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(mcwStore, "mcwStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C216581(mcwStore, null));
    }

    /* compiled from: CashBalanceDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsDuxo$1", m3645f = "CashBalanceDetailsDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsDuxo$1 */
    static final class C216581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ McwStore $mcwStore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216581(McwStore mcwStore, Continuation<? super C216581> continuation) {
            super(2, continuation);
            this.$mcwStore = mcwStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CashBalanceDetailsDuxo.this.new C216581(this.$mcwStore, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C216581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String accountNumber = ((CashBalanceDetailsKey) CashBalanceDetailsDuxo.INSTANCE.getArgs((HasSavedState) CashBalanceDetailsDuxo.this)).getAccountNumber();
                if (accountNumber == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                McwStore mcwStore = this.$mcwStore;
                this.label = 1;
                obj = mcwStore.fetchCashBalancesDetailsPage(accountNumber, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CashBalanceDetailsDuxo.this.applyMutation(new AnonymousClass1((CashBalancesDetailsPageData) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CashBalanceDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$Data;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsDuxo$1$1", m3645f = "CashBalanceDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.cashbalancedetails.CashBalanceDetailsDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CashBalanceDetailsState.Data, Continuation<? super CashBalanceDetailsState.Data>, Object> {
            final /* synthetic */ CashBalancesDetailsPageData $data;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CashBalancesDetailsPageData cashBalancesDetailsPageData, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$data = cashBalancesDetailsPageData;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CashBalanceDetailsState.Data data, Continuation<? super CashBalanceDetailsState.Data> continuation) {
                return ((AnonymousClass1) create(data, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CashBalanceDetailsState.Data) this.L$0).copy(this.$data);
            }
        }
    }

    /* compiled from: CashBalanceDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsDuxo;", "Lcom/robinhood/android/mcw/contracts/CashBalanceDetailsKey;", "<init>", "()V", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CashBalanceDetailsDuxo, CashBalanceDetailsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CashBalanceDetailsKey getArgs(SavedStateHandle savedStateHandle) {
            return (CashBalanceDetailsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CashBalanceDetailsKey getArgs(CashBalanceDetailsDuxo cashBalanceDetailsDuxo) {
            return (CashBalanceDetailsKey) DuxoCompanion.DefaultImpls.getArgs(this, cashBalanceDetailsDuxo);
        }
    }
}
