package com.robinhood.android.beneficiaries.p067ui.selectaccount;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryList;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryListsForAllAccounts;
import com.robinhood.android.beneficiaries.p067ui.selectaccount.BeneficiarySelectAccountEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiarySelectAccountDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountDataState;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountEvent;", "beneficiaryListStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;", "stateProvider", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiarySelectAccountDuxo extends BaseDuxo3<BeneficiarySelectAccountDataState, BeneficiarySelectAccountViewState, BeneficiarySelectAccountEvent> {
    public static final int $stable = 8;
    private final BeneficiaryListStore beneficiaryListStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiarySelectAccountDuxo(BeneficiaryListStore beneficiaryListStore, BeneficiarySelectAccountStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new BeneficiarySelectAccountDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(beneficiaryListStore, "beneficiaryListStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.beneficiaryListStore = beneficiaryListStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C97921(null));
    }

    /* compiled from: BeneficiarySelectAccountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.selectaccount.BeneficiarySelectAccountDuxo$onCreate$1", m3645f = "BeneficiarySelectAccountDuxo.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.selectaccount.BeneficiarySelectAccountDuxo$onCreate$1 */
    static final class C97921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C97921(Continuation<? super C97921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiarySelectAccountDuxo.this.new C97921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BeneficiaryListStore beneficiaryListStore = BeneficiarySelectAccountDuxo.this.beneficiaryListStore;
                    this.label = 1;
                    obj = beneficiaryListStore.getBeneficiaryListForAllAccounts(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiBeneficiaryListsForAllAccounts apiBeneficiaryListsForAllAccounts = (ApiBeneficiaryListsForAllAccounts) obj;
                ApiBeneficiaryList single_account_beneficiary_list = apiBeneficiaryListsForAllAccounts.getSingle_account_beneficiary_list();
                if (single_account_beneficiary_list == null) {
                    BeneficiarySelectAccountDuxo.this.applyMutation(new AnonymousClass1(apiBeneficiaryListsForAllAccounts, null));
                } else {
                    BeneficiarySelectAccountDuxo.this.submit(new BeneficiarySelectAccountEvent.SingleAccount(single_account_beneficiary_list.getAccount_number()));
                }
            } catch (Throwable th) {
                BeneficiarySelectAccountDuxo.this.submit(new BeneficiarySelectAccountEvent.Error(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BeneficiarySelectAccountDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.selectaccount.BeneficiarySelectAccountDuxo$onCreate$1$1", m3645f = "BeneficiarySelectAccountDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.selectaccount.BeneficiarySelectAccountDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BeneficiarySelectAccountDataState, Continuation<? super BeneficiarySelectAccountDataState>, Object> {
            final /* synthetic */ ApiBeneficiaryListsForAllAccounts $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiBeneficiaryListsForAllAccounts apiBeneficiaryListsForAllAccounts, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = apiBeneficiaryListsForAllAccounts;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiarySelectAccountDataState beneficiarySelectAccountDataState, Continuation<? super BeneficiarySelectAccountDataState> continuation) {
                return ((AnonymousClass1) create(beneficiarySelectAccountDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((BeneficiarySelectAccountDataState) this.L$0).copy(this.$response.getTitle(), this.$response.getSubtitle_markdown(), this.$response.getAccount_selector_viewmodel());
            }
        }
    }
}
