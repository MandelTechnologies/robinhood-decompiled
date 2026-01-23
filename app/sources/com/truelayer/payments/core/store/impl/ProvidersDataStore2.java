package com.truelayer.payments.core.store.impl;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.core.PaymentsCoreStore;
import com.truelayer.payments.core.domain.payments.RecentProvider;
import com.truelayer.payments.core.domain.utils.Outcome;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProvidersDataStore.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/PaymentsCoreStore;", PlaceTypes.STORE}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore$addOrUpdate$2$store$1", m3645f = "ProvidersDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$addOrUpdate$2$store$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ProvidersDataStore2 extends ContinuationImpl7 implements Function2<PaymentsCoreStore, Continuation<? super PaymentsCoreStore>, Object> {
    final /* synthetic */ RecentProvider $provider;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProvidersDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProvidersDataStore2(ProvidersDataStore providersDataStore, RecentProvider recentProvider, Continuation<? super ProvidersDataStore2> continuation) {
        super(2, continuation);
        this.this$0 = providersDataStore;
        this.$provider = recentProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProvidersDataStore2 providersDataStore2 = new ProvidersDataStore2(this.this$0, this.$provider, continuation);
        providersDataStore2.L$0 = obj;
        return providersDataStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaymentsCoreStore paymentsCoreStore, Continuation<? super PaymentsCoreStore> continuation) {
        return ((ProvidersDataStore2) create(paymentsCoreStore, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentsCoreStore paymentsCoreStore = (PaymentsCoreStore) this.L$0;
            Outcome.expect$default(ProvidersDataStore3.removeExcessProviders(paymentsCoreStore, this.this$0.maxRecordLimit), null, 1, null);
            PaymentsCoreStore paymentsCoreStoreBuild = paymentsCoreStore.toBuilder().putProviders(this.$provider.getId(), ProvidersDataStore3.intoRecentProvider(this.$provider)).build();
            Intrinsics.checkNotNullExpressionValue(paymentsCoreStoreBuild, "build(...)");
            return paymentsCoreStoreBuild;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
