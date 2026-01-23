package com.robinhood.android.feature.custodial.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.store.onboarding.AccountOnboardingStore;
import com.robinhood.android.custodial.contracts.CustodialOnboardingKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustodialOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountOnboardingStore", "Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "createCustodialApplication", "", "managementType", "Lcom/robinhood/models/api/ManagementType;", "Companion", "feature-custodial-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CustodialOnboardingDuxo extends BaseDuxo4<CustodialOnboardingViewState> implements HasSavedState {
    private final AccountOnboardingStore accountOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustodialOnboardingDuxo(AccountOnboardingStore accountOnboardingStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new CustodialOnboardingViewState(), duxoBundle);
        Intrinsics.checkNotNullParameter(accountOnboardingStore, "accountOnboardingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountOnboardingStore = accountOnboardingStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: CustodialOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.custodial.onboarding.CustodialOnboardingDuxo$createCustodialApplication$1", m3645f = "CustodialOnboardingDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.custodial.onboarding.CustodialOnboardingDuxo$createCustodialApplication$1 */
    static final class C166871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ManagementType $managementType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C166871(ManagementType managementType, Continuation<? super C166871> continuation) {
            super(2, continuation);
            this.$managementType = managementType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustodialOnboardingDuxo.this.new C166871(this.$managementType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C166871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountOnboardingStore accountOnboardingStore = CustodialOnboardingDuxo.this.accountOnboardingStore;
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.CUSTODIAL_UTMA;
                ManagementType managementType = this.$managementType;
                this.label = 1;
                obj = AccountOnboardingStore.createApplication$default(accountOnboardingStore, null, brokerageAccountType, managementType, this, 1, null);
                if (obj == coroutine_suspended) {
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

    public final void createCustodialApplication(ManagementType managementType) {
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C166871(managementType, null), 3, null);
    }

    /* compiled from: CustodialOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingDuxo;", "Lcom/robinhood/android/custodial/contracts/CustodialOnboardingKey;", "<init>", "()V", "feature-custodial-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CustodialOnboardingDuxo, CustodialOnboardingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CustodialOnboardingKey getArgs(SavedStateHandle savedStateHandle) {
            return (CustodialOnboardingKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CustodialOnboardingKey getArgs(CustodialOnboardingDuxo custodialOnboardingDuxo) {
            return (CustodialOnboardingKey) DuxoCompanion.DefaultImpls.getArgs(this, custodialOnboardingDuxo);
        }
    }
}
