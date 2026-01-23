package com.robinhood.android.redesign.accounttab.duxo;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.redesign.accounttab.AccountTabType;
import com.robinhood.android.redesign.accounttab.C26320R;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.store.AccountPerformance;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.models.home.api.HomeAccountSwitcherAccountIdentifier;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamJointAccountDetails$$inlined$flatMapLatest$1", m3645f = "AccountTabDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamJointAccountDetails$$inlined$flatMapLatest$1 */
/* loaded from: classes5.dex */
public final class C26332xd401c1d3 extends ContinuationImpl7 implements Function3<FlowCollector<? super AccountTabInfo.Account>, Account, Continuation<? super Unit>, Object> {
    final /* synthetic */ List $pendingAccounts$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AccountTabDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26332xd401c1d3(Continuation continuation, List list, AccountTabDuxo accountTabDuxo) {
        super(3, continuation);
        this.$pendingAccounts$inlined = list;
        this.this$0 = accountTabDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super AccountTabInfo.Account> flowCollector, Account account, Continuation<? super Unit> continuation) {
        C26332xd401c1d3 c26332xd401c1d3 = new C26332xd401c1d3(continuation, this.$pendingAccounts$inlined, this.this$0);
        c26332xd401c1d3.L$0 = flowCollector;
        c26332xd401c1d3.L$1 = account;
        return c26332xd401c1d3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<AccountTabInfo.Account> flowFlowOf;
        Object next;
        AccountTabInfo.Account account;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final Account account2 = (Account) this.L$1;
            if (account2 != null) {
                final Flow<AccountPerformance> flowStreamDefaultPerformanceChart = this.this$0.accountTabStore.streamDefaultPerformanceChart(account2.getAccountNumber(), this.this$0.getHasPortfolioPrivacy());
                flowFlowOf = new Flow<AccountTabInfo.Account>() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamJointAccountDetails$lambda$34$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AccountTabInfo.Account> flowCollector2, Continuation continuation) {
                        Object objCollect = flowStreamDefaultPerformanceChart.collect(new AnonymousClass2(flowCollector2, account2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamJointAccountDetails$lambda$34$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ Account $account$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamJointAccountDetails$lambda$34$$inlined$map$1$2", m3645f = "AccountTabDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamJointAccountDetails$lambda$34$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, Account account) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$account$inlined = account;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
                                AccountPerformance accountPerformance = (AccountPerformance) obj;
                                accountPerformance.getDirection();
                                AccountTabInfo.Account account = new AccountTabInfo.Account(AccountTabType.JOINT, this.$account$inlined.getBrokerageAccountType(), StringResource.INSTANCE.invoke(C26320R.string.account_joint, new Object[0]), null, null, this.$account$inlined.getAccountNumber(), accountPerformance.getBalance(), accountPerformance.getDirection(), accountPerformance.getPercentageDelta(), false, false, null, false, 7704, null);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(account, anonymousClass1) == coroutine_suspended) {
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
            } else {
                Iterator it = this.$pendingAccounts$inlined.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((HomeAccountSwitcher.Account) next).getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                        break;
                    }
                }
                HomeAccountSwitcher.Account account3 = (HomeAccountSwitcher.Account) next;
                if (account3 == null || account3.getBrokerageAccountType() != BrokerageAccountType.JOINT_TENANCY_WITH_ROS || account3.getIdentifierType() != HomeAccountSwitcherAccountIdentifier.APPLICATION_ID) {
                    account3 = null;
                }
                String identifier = account3 != null ? account3.getIdentifier() : null;
                if (identifier != null) {
                    StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C26320R.string.account_joint, new Object[0]);
                    AccountTabType accountTabType = AccountTabType.JOINT_PENDING;
                    BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                    account = new AccountTabInfo.Account(accountTabType, brokerageAccountType, stringResourceInvoke, null, null, "does-not-exist", null, null, null, false, false, new AccountTabInfo.Account.PendingApplication(identifier, brokerageAccountType), false, 5592, null);
                } else {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    account = new AccountTabInfo.Account(AccountTabType.JOINT_SIGN_UP, BrokerageAccountType.JOINT_TENANCY_WITH_ROS, companion.invoke(C26320R.string.account_joint, new Object[0]), companion.invoke(C26320R.string.subtitle_joint, new Object[0]), null, "does-not-exist", null, null, null, false, true, null, false, 6608, null);
                }
                flowFlowOf = FlowKt.flowOf(account);
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
