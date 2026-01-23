package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$streamCryptoBuyingPowerAlert$$inlined$flatMapLatest$1", m3645f = "CryptoBuyingPowerStore.kt", m3646l = {200, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$streamCryptoBuyingPowerAlert$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C33685x8044987f extends ContinuationImpl7 implements Function3<FlowCollector<? super String>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $currencyPairId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33685x8044987f(Continuation continuation, CryptoBuyingPowerStore cryptoBuyingPowerStore, UUID uuid) {
        super(3, continuation);
        this.this$0 = cryptoBuyingPowerStore;
        this.$currencyPairId$inlined = uuid;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super String> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        C33685x8044987f c33685x8044987f = new C33685x8044987f(continuation, this.this$0, this.$currencyPairId$inlined);
        c33685x8044987f.L$0 = flowCollector;
        c33685x8044987f.L$1 = bool;
        return c33685x8044987f.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r7, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Flow<String> flowStreamAccountNumber;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                flowStreamAccountNumber = this.this$0.cryptoAccountProvider.streamAccountNumber(new CryptoAccountSwitcherLocation.Buy(this.$currencyPairId$inlined));
                this.L$0 = null;
                this.label = 2;
            } else {
                Single<Optional<String>> individualAccountNumber = this.this$0.accountProvider.getIndividualAccountNumber();
                this.L$0 = flowCollector;
                this.label = 1;
                obj = RxAwait3.await(individualAccountNumber, this);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Optional optional = (Optional) obj;
        flowStreamAccountNumber = FlowKt.flowOf(optional != null ? (String) optional.getOrNull() : null);
        this.L$0 = null;
        this.label = 2;
    }
}
