package com.robinhood.android.jointaccounts.onboarding.shim;

import com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimEvent;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.identi.ApiIdentiJointAccountApplication;
import com.robinhood.models.p320db.Account;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: JointAccountsShimDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u000e\u0010\r\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/shim/JointAccountsShimDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/jointaccounts/onboarding/shim/JointAccountsShimEvent;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "tryLoadAccountOrApplication", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class JointAccountsShimDuxo extends BaseDuxo5<Unit, JointAccountsShimEvent> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final Identi identi;

    /* compiled from: JointAccountsShimDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimDuxo", m3645f = "JointAccountsShimDuxo.kt", m3646l = {31, 40}, m3647m = "tryLoadAccountOrApplication")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimDuxo$tryLoadAccountOrApplication$1 */
    static final class C201741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C201741(Continuation<? super C201741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JointAccountsShimDuxo.this.tryLoadAccountOrApplication(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountsShimDuxo(AccountProvider accountProvider, Identi identi2, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.identi = identi2;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().launchWhenCreated(new C201731(null));
    }

    /* compiled from: JointAccountsShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimDuxo$onCreate$1", m3645f = "JointAccountsShimDuxo.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.shim.JointAccountsShimDuxo$onCreate$1 */
    static final class C201731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C201731(Continuation<? super C201731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountsShimDuxo.this.new C201731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            JointAccountsShimDuxo jointAccountsShimDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountsShimDuxo jointAccountsShimDuxo2 = JointAccountsShimDuxo.this;
                this.L$0 = jointAccountsShimDuxo2;
                this.label = 1;
                Object objTryLoadAccountOrApplication = jointAccountsShimDuxo2.tryLoadAccountOrApplication(this);
                if (objTryLoadAccountOrApplication == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jointAccountsShimDuxo = jointAccountsShimDuxo2;
                obj = objTryLoadAccountOrApplication;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jointAccountsShimDuxo = (JointAccountsShimDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            jointAccountsShimDuxo.submit(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r6 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryLoadAccountOrApplication(Continuation<? super JointAccountsShimEvent> continuation) {
        C201741 c201741;
        Object next;
        if (continuation instanceof C201741) {
            c201741 = (C201741) continuation;
            int i = c201741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c201741.label = i - Integer.MIN_VALUE;
            } else {
                c201741 = new C201741(continuation);
            }
        }
        Object accountsByTypeForced = c201741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c201741.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(accountsByTypeForced);
                AccountProvider accountProvider = this.accountProvider;
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                c201741.label = 1;
                accountsByTypeForced = accountProvider.getAccountsByTypeForced(brokerageAccountType, c201741);
                if (accountsByTypeForced == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(accountsByTypeForced);
                Iterator it = ((Iterable) accountsByTypeForced).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!((ApiIdentiJointAccountApplication) next).getState().isTerminal()) {
                        break;
                    }
                }
                ApiIdentiJointAccountApplication apiIdentiJointAccountApplication = (ApiIdentiJointAccountApplication) next;
                if (apiIdentiJointAccountApplication != null) {
                    String string2 = apiIdentiJointAccountApplication.getId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    return new JointAccountsShimEvent.Dashboard.ApplicationId(string2);
                }
                return JointAccountsShimEvent.SignUp.INSTANCE;
            }
            ResultKt.throwOnFailure(accountsByTypeForced);
            Account account = (Account) CollectionsKt.firstOrNull((List) accountsByTypeForced);
            if (account != null) {
                return new JointAccountsShimEvent.Dashboard.AccountNumber(account.getAccountNumber());
            }
            Identi identi2 = this.identi;
            c201741.label = 2;
            accountsByTypeForced = identi2.getJointAccountApplications(c201741);
        } catch (Exception e) {
            return new JointAccountsShimEvent.Error(e);
        }
    }
}
