package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.regiongate.PerpetualsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.ListContractRequestDto;
import crypto_perpetuals.service.p440v1.ListContractResponseDto;
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

/* compiled from: PerpetualContractStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcrypto_perpetuals/service/v1/ListContractResponseDto;", "it", "Lcrypto_perpetuals/service/v1/ListContractRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualContractStore$listContractsEndpoint$1", m3645f = "PerpetualContractStore.kt", m3646l = {55, 57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualContractStore$listContractsEndpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualContractStore5 extends ContinuationImpl7 implements Function2<ListContractRequestDto, Continuation<? super ListContractResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualContractStore5(PerpetualContractStore perpetualContractStore, Continuation<? super PerpetualContractStore5> continuation) {
        super(2, continuation);
        this.this$0 = perpetualContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualContractStore5 perpetualContractStore5 = new PerpetualContractStore5(this.this$0, continuation);
        perpetualContractStore5.L$0 = obj;
        return perpetualContractStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ListContractRequestDto listContractRequestDto, Continuation<? super ListContractResponseDto> continuation) {
        return ((PerpetualContractStore5) create(listContractRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r8 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ListContractRequestDto listContractRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            listContractRequestDto = (ListContractRequestDto) this.L$0;
            Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, PerpetualsRegionGate.INSTANCE, false, 2, null);
            this.L$0 = listContractRequestDto;
            this.label = 1;
            obj = FlowKt.first(flowStreamRegionGateStateFlow$default, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (ListContractResponseDto) obj;
        }
        listContractRequestDto = (ListContractRequestDto) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            CryptoPerpetualsService cryptoPerpetualsService = this.this$0.service;
            this.L$0 = null;
            this.label = 2;
            obj = cryptoPerpetualsService.ListContract(listContractRequestDto, this);
        } else {
            return new ListContractResponseDto(null, 1, null);
        }
    }
}
