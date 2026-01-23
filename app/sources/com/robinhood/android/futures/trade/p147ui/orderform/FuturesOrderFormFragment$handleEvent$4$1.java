package com.robinhood.android.futures.trade.p147ui.orderform;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.contracts.experiments.FuturesOrderChecksToGuided;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesOrderFormFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormFragment$handleEvent$4$1", m3645f = "FuturesOrderFormFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FuturesOrderFormFragment$handleEvent$4$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransferConfiguration.Standard $transferConfig;
    int label;
    final /* synthetic */ FuturesOrderFormFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderFormFragment$handleEvent$4$1(FuturesOrderFormFragment futuresOrderFormFragment, TransferConfiguration.Standard standard, Continuation<? super FuturesOrderFormFragment$handleEvent$4$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderFormFragment;
        this.$transferConfig = standard;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesOrderFormFragment$handleEvent$4$1(this.this$0, this.$transferConfig, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesOrderFormFragment$handleEvent$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntentKey transfer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.getExperimentsStore(), new Experiment[]{FuturesOrderChecksToGuided.INSTANCE}, false, null, 6, null);
            this.label = 1;
            obj = FlowKt.firstOrNull(flowStreamStateFlow$default, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean zAreEqual = Intrinsics.areEqual(obj, boxing.boxBoolean(true));
        Navigator navigator = this.this$0.getNavigator();
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (zAreEqual) {
            transfer = new TransferV2(TransferDirectionV2.DEPOSIT, this.$transferConfig, null, 4, null);
        } else {
            transfer = new Transfer(this.$transferConfig);
        }
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, transfer, null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
