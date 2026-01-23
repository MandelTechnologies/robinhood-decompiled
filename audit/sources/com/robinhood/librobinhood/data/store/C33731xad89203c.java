package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$streamLatestPendingUiCryptoOrders$lambda$5$$inlined$flatMapLatest$1", m3645f = "CryptoOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$streamLatestPendingUiCryptoOrders$lambda$5$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C33731xad89203c extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends UiCryptoOrder>>, UUID, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $count$inlined;
    final /* synthetic */ CryptoAccountSwitcherLocation $location$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33731xad89203c(Continuation continuation, CryptoOrderStore cryptoOrderStore, CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation, int i) {
        super(3, continuation);
        this.this$0 = cryptoOrderStore;
        this.$location$inlined = cryptoAccountSwitcherLocation;
        this.$count$inlined = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends UiCryptoOrder>> flowCollector, UUID uuid, Continuation<? super Unit> continuation) {
        C33731xad89203c c33731xad89203c = new C33731xad89203c(continuation, this.this$0, this.$location$inlined, this.$count$inlined);
        c33731xad89203c.L$0 = flowCollector;
        c33731xad89203c.L$1 = uuid;
        return c33731xad89203c.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flowAsFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            UUID uuid = (UUID) this.L$1;
            if (uuid != null) {
                Query query = this.this$0.pendingQuery;
                CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation = this.$location$inlined;
                CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair = cryptoAccountSwitcherLocation instanceof CryptoAccountSwitcherLocation.WithCurrencyPair ? (CryptoAccountSwitcherLocation.WithCurrencyPair) cryptoAccountSwitcherLocation : null;
                flowAsFlow = query.asFlow(new CryptoOrderStore.PendingRequest(withCurrencyPair != null ? withCurrencyPair.getCurrencyPairId() : null, this.$count$inlined, uuid));
            } else {
                flowAsFlow = FlowKt.flowOf(CollectionsKt.emptyList());
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowAsFlow, this) == coroutine_suspended) {
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
