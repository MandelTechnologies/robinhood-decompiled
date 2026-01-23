package com.robinhood.shared.crypto.microgram.service;

import com.robinhood.coroutines.job.CachedJobManager7;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.shared.crypto.microgram.service.CryptoRewardsCachedService;
import contracts.crypto.rewards.proto.p430v1.CryptoRewardsService;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonRequestDto;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonResponseDto;
import contracts.crypto.rewards.proto.p430v1.GetHomeRewardsButtonResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.inject.MicrogramCachedComponentManager;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CryptoRewardsCachedService.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0019H\u0096A¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/microgram/service/RealCryptoRewardsCachedService;", "Lcom/robinhood/shared/crypto/microgram/service/CryptoRewardsCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "componentManager", "Lmicrogram/android/inject/MicrogramCachedComponentManager;", "<init>", "(Lmicrogram/android/inject/MicrogramCachedComponentManager;)V", "cryptoRewardsService", "Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;", "Lmicrogram/android/inject/MicrogramComponent;", "getCryptoRewardsService", "(Lmicrogram/android/inject/MicrogramComponent;)Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;", "GetHomeRewardsButton", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "request", "Lcom/robinhood/idl/Request;", "", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCryptoDetailRewardButton", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;", "(Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retainUntilCanceled", "", "lib-crypto-microgram-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.microgram.service.RealCryptoRewardsCachedService, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoRewardsCachedService2 implements CryptoRewardsCachedService, CachedJobManager7 {
    private final MicrogramCachedComponentManager componentManager;

    @Override // com.robinhood.coroutines.job.CachedJobManager7
    public Object retainUntilCanceled(Continuation<?> continuation) {
        return this.componentManager.retainUntilCanceled(continuation);
    }

    @Override // com.robinhood.shared.crypto.microgram.service.CryptoRewardsCachedService
    public Object GetCryptoDetailRewardButton(Request<GetCryptoDetailRewardButtonRequestDto> request, Continuation<? super Response<GetCryptoDetailRewardButtonResponseDto>> continuation) {
        return CryptoRewardsCachedService.DefaultImpls.GetCryptoDetailRewardButton(this, request, continuation);
    }

    public CryptoRewardsCachedService2(MicrogramCachedComponentManager componentManager) {
        Intrinsics.checkNotNullParameter(componentManager, "componentManager");
        this.componentManager = componentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoRewardsService getCryptoRewardsService(MicrogramComponent microgramComponent) {
        return (CryptoRewardsService) microgramComponent.getServiceLocator().getClient(CryptoRewardsService.class);
    }

    /* compiled from: CryptoRewardsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.microgram.service.RealCryptoRewardsCachedService$GetHomeRewardsButton$2", m3645f = "CryptoRewardsCachedService.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.microgram.service.RealCryptoRewardsCachedService$GetHomeRewardsButton$2 */
    static final class C377192 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super GetHomeRewardsButtonResponseDto>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C377192(Continuation<? super C377192> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super GetHomeRewardsButtonResponseDto> continuation) {
            C377192 c377192 = CryptoRewardsCachedService2.this.new C377192(continuation);
            c377192.L$0 = microgramComponent;
            return c377192.invokeSuspend(Unit.INSTANCE);
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
            CryptoRewardsService cryptoRewardsService = CryptoRewardsCachedService2.this.getCryptoRewardsService((MicrogramComponent) this.L$0);
            this.label = 1;
            Object objGetHomeRewardsButton = cryptoRewardsService.GetHomeRewardsButton(this);
            return objGetHomeRewardsButton == coroutine_suspended ? coroutine_suspended : objGetHomeRewardsButton;
        }
    }

    @Override // com.robinhood.shared.crypto.microgram.service.CryptoRewardsCachedService, contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    public Object GetHomeRewardsButton(Continuation<? super GetHomeRewardsButtonResponseDto> continuation) {
        return this.componentManager.execute(new C377192(null), continuation);
    }

    /* compiled from: CryptoRewardsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.microgram.service.RealCryptoRewardsCachedService$GetHomeRewardsButton$4", m3645f = "CryptoRewardsCachedService.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.microgram.service.RealCryptoRewardsCachedService$GetHomeRewardsButton$4 */
    static final class C377204 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Response<? extends GetHomeRewardsButtonResponseDto>>, Object> {
        final /* synthetic */ Request<Unit> $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C377204(Request<Unit> request, Continuation<? super C377204> continuation) {
            super(3, continuation);
            this.$request = request;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Response<? extends GetHomeRewardsButtonResponseDto>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Response<GetHomeRewardsButtonResponseDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Response<GetHomeRewardsButtonResponseDto>> continuation) {
            C377204 c377204 = CryptoRewardsCachedService2.this.new C377204(this.$request, continuation);
            c377204.L$0 = microgramComponent;
            return c377204.invokeSuspend(Unit.INSTANCE);
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
            CryptoRewardsService cryptoRewardsService = CryptoRewardsCachedService2.this.getCryptoRewardsService((MicrogramComponent) this.L$0);
            Request<Unit> request = this.$request;
            this.label = 1;
            Object objGetHomeRewardsButton = cryptoRewardsService.GetHomeRewardsButton(request, this);
            return objGetHomeRewardsButton == coroutine_suspended ? coroutine_suspended : objGetHomeRewardsButton;
        }
    }

    @Override // com.robinhood.shared.crypto.microgram.service.CryptoRewardsCachedService, contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    public Object GetHomeRewardsButton(Request<Unit> request, Continuation<? super Response<GetHomeRewardsButtonResponseDto>> continuation) {
        return this.componentManager.execute(new C377204(request, null), continuation);
    }

    /* compiled from: CryptoRewardsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.microgram.service.RealCryptoRewardsCachedService$GetCryptoDetailRewardButton$2", m3645f = "CryptoRewardsCachedService.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.microgram.service.RealCryptoRewardsCachedService$GetCryptoDetailRewardButton$2 */
    static final class C377182 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super GetCryptoDetailRewardButtonResponseDto>, Object> {
        final /* synthetic */ GetCryptoDetailRewardButtonRequestDto $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C377182(GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto, Continuation<? super C377182> continuation) {
            super(3, continuation);
            this.$request = getCryptoDetailRewardButtonRequestDto;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super GetCryptoDetailRewardButtonResponseDto> continuation) {
            C377182 c377182 = CryptoRewardsCachedService2.this.new C377182(this.$request, continuation);
            c377182.L$0 = microgramComponent;
            return c377182.invokeSuspend(Unit.INSTANCE);
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
            CryptoRewardsService cryptoRewardsService = CryptoRewardsCachedService2.this.getCryptoRewardsService((MicrogramComponent) this.L$0);
            GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto = this.$request;
            this.label = 1;
            Object objGetCryptoDetailRewardButton = cryptoRewardsService.GetCryptoDetailRewardButton(getCryptoDetailRewardButtonRequestDto, this);
            return objGetCryptoDetailRewardButton == coroutine_suspended ? coroutine_suspended : objGetCryptoDetailRewardButton;
        }
    }

    @Override // com.robinhood.shared.crypto.microgram.service.CryptoRewardsCachedService, contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    public Object GetCryptoDetailRewardButton(GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto, Continuation<? super GetCryptoDetailRewardButtonResponseDto> continuation) {
        return this.componentManager.execute(new C377182(getCryptoDetailRewardButtonRequestDto, null), continuation);
    }
}
