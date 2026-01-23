package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.api.rewards.ApiCryptoClawbackDetails;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoClawbackStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/rewards/ApiCryptoClawbackDetails;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoClawbackStore$endpoint$1", m3645f = "CryptoClawbackStore.kt", m3646l = {55, 57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoClawbackStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoClawbackStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Optional<? extends ApiCryptoClawbackDetails>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoClawbackStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoClawbackStore2(CryptoClawbackStore cryptoClawbackStore, Continuation<? super CryptoClawbackStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoClawbackStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoClawbackStore2 cryptoClawbackStore2 = new CryptoClawbackStore2(this.this$0, continuation);
        cryptoClawbackStore2.L$0 = obj;
        return cryptoClawbackStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super Optional<? extends ApiCryptoClawbackDetails>> continuation) {
        return invoke2(uuid, (Continuation<? super Optional<ApiCryptoClawbackDetails>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, Continuation<? super Optional<ApiCryptoClawbackDetails>> continuation) {
        return ((CryptoClawbackStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            uuid = (UUID) this.L$0;
            Flow<Boolean> flowStreamDepositMatchEuExperiment = this.this$0.cryptoExperimentsStore.streamDepositMatchEuExperiment();
            this.L$0 = uuid;
            this.label = 1;
            obj = FlowKt.first(flowStreamDepositMatchEuExperiment, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Optional3.asOptional(obj);
        }
        uuid = (UUID) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            NummusApi nummusApi = this.this$0.nummus;
            this.L$0 = null;
            this.label = 2;
            obj = nummusApi.getClawback(uuid, this);
        } else {
            return Optional2.INSTANCE;
        }
    }
}
