package com.robinhood.android.dashboard.lib.buyingpower;

import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PortfolioBuyingPowerNavigationDestinationProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider;", "", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountAccessStore;)V", "getPortfolioBuyingPowerNavigationDestination", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;", "accountNumber", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PortfolioBuyingPowerNavigationDestinationProvider {
    public static final int $stable = 8;
    private final AccountAccessStore accountAccessStore;

    public PortfolioBuyingPowerNavigationDestinationProvider(AccountAccessStore accountAccessStore) {
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        this.accountAccessStore = accountAccessStore;
    }

    public final Flow<PortfolioBuyingPowerNavigationDestinationProvider2> getPortfolioBuyingPowerNavigationDestination(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final Flow<Boolean> featureAccess = this.accountAccessStore.getFeatureAccess(accountNumber, AccountFeature.FUTURES);
        return FlowKt.distinctUntilChanged(new Flow<PortfolioBuyingPowerNavigationDestinationProvider2>() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerNavigationDestinationProvider$getPortfolioBuyingPowerNavigationDestination$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerNavigationDestinationProvider$getPortfolioBuyingPowerNavigationDestination$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerNavigationDestinationProvider$getPortfolioBuyingPowerNavigationDestination$$inlined$map$1$2", m3645f = "PortfolioBuyingPowerNavigationDestinationProvider.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerNavigationDestinationProvider$getPortfolioBuyingPowerNavigationDestination$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider2;
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
                        if (((Boolean) obj).booleanValue()) {
                            portfolioBuyingPowerNavigationDestinationProvider2 = PortfolioBuyingPowerNavigationDestinationProvider2.CHECK_BUYING_POWER_DEFICIT_ACTIVITY;
                        } else {
                            portfolioBuyingPowerNavigationDestinationProvider2 = PortfolioBuyingPowerNavigationDestinationProvider2.BUYING_POWER_HUB_ACTIVITY;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(portfolioBuyingPowerNavigationDestinationProvider2, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PortfolioBuyingPowerNavigationDestinationProvider2> flowCollector, Continuation continuation) {
                Object objCollect = featureAccess.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}
