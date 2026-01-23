package com.robinhood.android.dashboard.lib;

import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AccountUtils.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u00020\b2\u0006\u0010\t\u001a\u00020\n\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m3636d2 = {"dashboardTitle", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "getDashboardTitle", "(Lcom/robinhood/models/api/BrokerageAccountType;)I", "streamAccountForDashboardType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Account;", "Lcom/robinhood/android/lib/account/AccountProvider;", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.AccountUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AccountUtils {

    /* compiled from: AccountUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboard.lib.AccountUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getDashboardTitle(BrokerageAccountType brokerageAccountType) {
        switch (brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case -1:
            case 7:
            case 8:
                return C13691R.string.individual_investing_title;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
                return C13691R.string.custodial_investing_title;
            case 3:
                return C8179R.string.account_type_ira_roth;
            case 4:
                return C8179R.string.account_type_ira_traditional;
            case 5:
                return C13691R.string.joint_investing_title;
            case 6:
                return C8179R.string.account_type_stocks_and_shares_isa;
        }
    }

    public static final Flow<Account> streamAccountForDashboardType(AccountProvider accountProvider, HomeDashboardType dashboardType) {
        Intrinsics.checkNotNullParameter(accountProvider, "<this>");
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        if (dashboardType instanceof HomeDashboardType.Account) {
            return Context7.buffer$default(RxConvert.asFlow(accountProvider.streamAccount(((HomeDashboardType.Account) dashboardType).getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
        }
        if (dashboardType instanceof HomeDashboardType.Nux) {
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(accountProvider.streamIndividualAccountOptional()), Integer.MAX_VALUE, null, 2, null);
            return new Flow<Account>() { // from class: com.robinhood.android.dashboard.lib.AccountUtilsKt$streamAccountForDashboardType$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.dashboard.lib.AccountUtilsKt$streamAccountForDashboardType$$inlined$map$1$2 */
                public static final class C136722<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.AccountUtilsKt$streamAccountForDashboardType$$inlined$map$1$2", m3645f = "AccountUtils.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.dashboard.lib.AccountUtilsKt$streamAccountForDashboardType$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C136722.this.emit(null, this);
                        }
                    }

                    public C136722(FlowCollector flowCollector) {
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
                            Account account = (Account) ((Optional) obj).component1();
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new C136722(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        if (dashboardType instanceof HomeDashboardType.PendingApplication) {
            return FlowKt.flowOf((Object) null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
