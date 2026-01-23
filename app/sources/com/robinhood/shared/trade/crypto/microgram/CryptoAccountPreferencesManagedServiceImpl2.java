package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.models.crypto.p314db.CryptoAccountPreferences;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CryptoAccountPreferencesManagedServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/crypto/db/CryptoAccountPreferences;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.microgram.CryptoAccountPreferencesManagedServiceImpl$StreamCryptoMonetizationModel$2$1", m3645f = "CryptoAccountPreferencesManagedServiceImpl.kt", m3646l = {95}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoAccountPreferencesManagedServiceImpl$StreamCryptoMonetizationModel$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoAccountPreferencesManagedServiceImpl2 extends ContinuationImpl7 implements Function2<FlowCollector<? super CryptoAccountPreferences>, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CryptoAccountPreferencesManagedServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAccountPreferencesManagedServiceImpl2(CryptoAccountPreferencesManagedServiceImpl cryptoAccountPreferencesManagedServiceImpl, Continuation<? super CryptoAccountPreferencesManagedServiceImpl2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoAccountPreferencesManagedServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoAccountPreferencesManagedServiceImpl2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super CryptoAccountPreferences> flowCollector, Continuation<? super Unit> continuation) {
        return ((CryptoAccountPreferencesManagedServiceImpl2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.this$0.cryptoAccountPreferencesStore;
            this.label = 1;
            if (cryptoAccountPreferencesStore.m22601refreshAccountPreferencesIoAF18A(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).getValue();
        }
        return Unit.INSTANCE;
    }
}
