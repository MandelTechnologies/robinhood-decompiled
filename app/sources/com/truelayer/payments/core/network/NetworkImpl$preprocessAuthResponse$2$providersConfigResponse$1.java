package com.truelayer.payments.core.network;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.ProviderConfig;
import com.truelayer.payments.core.domain.utils.Outcome;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NetworkImpl.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$preprocessAuthResponse$2$providersConfigResponse$1", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class NetworkImpl$preprocessAuthResponse$2$providersConfigResponse$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends List<? extends ProviderConfig>, ? extends CoreError>>, Object> {
    final /* synthetic */ PaymentContext $paymentContext;
    int label;
    final /* synthetic */ NetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkImpl$preprocessAuthResponse$2$providersConfigResponse$1(NetworkImpl networkImpl, PaymentContext paymentContext, Continuation<? super NetworkImpl$preprocessAuthResponse$2$providersConfigResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = networkImpl;
        this.$paymentContext = paymentContext;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkImpl$preprocessAuthResponse$2$providersConfigResponse$1(this.this$0, this.$paymentContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends List<? extends ProviderConfig>, ? extends CoreError>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Outcome<? extends List<ProviderConfig>, ? extends CoreError>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends List<ProviderConfig>, ? extends CoreError>> continuation) {
        return ((NetworkImpl$preprocessAuthResponse$2$providersConfigResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        NetworkImpl networkImpl = this.this$0;
        PaymentContext paymentContext = this.$paymentContext;
        this.label = 1;
        Object providersConfig = networkImpl.getProvidersConfig(paymentContext, this);
        return providersConfig == coroutine_suspended ? coroutine_suspended : providersConfig;
    }
}
