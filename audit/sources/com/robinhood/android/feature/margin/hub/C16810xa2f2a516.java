package com.robinhood.android.feature.margin.hub;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.hub.p168db.models.BuyingPowerHubView;
import com.robinhood.android.margin.contracts.BuyingPowerHubFragmentKey;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
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

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onResume$1$invokeSuspend$$inlined$flatMapLatest$2", m3645f = "BuyingPowerHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onResume$1$invokeSuspend$$inlined$flatMapLatest$2 */
/* loaded from: classes3.dex */
public final class C16810xa2f2a516 extends ContinuationImpl7 implements Function3<FlowCollector<? super BuyingPowerHubView>, DisplayCurrency, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BuyingPowerHubDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16810xa2f2a516(Continuation continuation, BuyingPowerHubDuxo buyingPowerHubDuxo) {
        super(3, continuation);
        this.this$0 = buyingPowerHubDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super BuyingPowerHubView> flowCollector, DisplayCurrency displayCurrency, Continuation<? super Unit> continuation) {
        C16810xa2f2a516 c16810xa2f2a516 = new C16810xa2f2a516(continuation, this.this$0);
        c16810xa2f2a516.L$0 = flowCollector;
        c16810xa2f2a516.L$1 = displayCurrency;
        return c16810xa2f2a516.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r8, r1, r7) != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        DisplayCurrency displayCurrency;
        String accountNumber;
        FlowCollector flowCollector2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            displayCurrency = (DisplayCurrency) this.L$1;
            accountNumber = ((BuyingPowerHubFragmentKey) BuyingPowerHubDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
            if (accountNumber == null) {
                AccountProvider accountProvider = this.this$0.accountProvider;
                this.L$0 = flowCollector;
                this.L$1 = displayCurrency;
                this.label = 1;
                Object individualAccountNumberForced = accountProvider.getIndividualAccountNumberForced(this);
                if (individualAccountNumberForced != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    obj = individualAccountNumberForced;
                }
            } else {
                Flow<BuyingPowerHubView> flowStreamBuyingPowerHub = this.this$0.marginHubStore.streamBuyingPowerHub(accountNumber, displayCurrency);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        displayCurrency = (DisplayCurrency) this.L$1;
        flowCollector2 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        accountNumber = (String) obj;
        flowCollector = flowCollector2;
        Flow<BuyingPowerHubView> flowStreamBuyingPowerHub2 = this.this$0.marginHubStore.streamBuyingPowerHub(accountNumber, displayCurrency);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
