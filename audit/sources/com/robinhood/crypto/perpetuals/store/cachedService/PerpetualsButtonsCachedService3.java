package com.robinhood.crypto.perpetuals.store.cachedService;

import com.robinhood.coroutines.job.CachedJobManager7;
import contracts.perpetuals.proto.p433v1.GetButtonsRequestDto;
import contracts.perpetuals.proto.p433v1.GetButtonsResponseDto;
import contracts.perpetuals.proto.p433v1.PerpetualsButtonsService;
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

/* compiled from: PerpetualsButtonsCachedService.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0012H\u0096A¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/cachedService/RealPerpetualsButtonsCachedService;", "Lcom/robinhood/crypto/perpetuals/store/cachedService/PerpetualsButtonsCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "componentManager", "Lmicrogram/android/inject/MicrogramCachedComponentManager;", "<init>", "(Lmicrogram/android/inject/MicrogramCachedComponentManager;)V", "perpetualButtonsService", "Lcontracts/perpetuals/proto/v1/PerpetualsButtonsService;", "Lmicrogram/android/inject/MicrogramComponent;", "getPerpetualButtonsService", "(Lmicrogram/android/inject/MicrogramComponent;)Lcontracts/perpetuals/proto/v1/PerpetualsButtonsService;", "getButtons", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "request", "Lcontracts/perpetuals/proto/v1/GetButtonsRequestDto;", "(Lcontracts/perpetuals/proto/v1/GetButtonsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retainUntilCanceled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.store.cachedService.RealPerpetualsButtonsCachedService, reason: use source file name */
/* loaded from: classes15.dex */
public final class PerpetualsButtonsCachedService3 implements PerpetualsButtonsCachedService, CachedJobManager7 {
    private final MicrogramCachedComponentManager componentManager;

    @Override // com.robinhood.coroutines.job.CachedJobManager7
    public Object retainUntilCanceled(Continuation<?> continuation) {
        return this.componentManager.retainUntilCanceled(continuation);
    }

    public PerpetualsButtonsCachedService3(MicrogramCachedComponentManager componentManager) {
        Intrinsics.checkNotNullParameter(componentManager, "componentManager");
        this.componentManager = componentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PerpetualsButtonsService getPerpetualButtonsService(MicrogramComponent microgramComponent) {
        return (PerpetualsButtonsService) microgramComponent.getServiceLocator().getClient(PerpetualsButtonsService.class);
    }

    /* compiled from: PerpetualsButtonsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.cachedService.RealPerpetualsButtonsCachedService$getButtons$2", m3645f = "PerpetualsButtonsCachedService.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.crypto.perpetuals.store.cachedService.RealPerpetualsButtonsCachedService$getButtons$2 */
    static final class C330312 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super GetButtonsResponseDto>, Object> {
        final /* synthetic */ GetButtonsRequestDto $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C330312(GetButtonsRequestDto getButtonsRequestDto, Continuation<? super C330312> continuation) {
            super(3, continuation);
            this.$request = getButtonsRequestDto;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super GetButtonsResponseDto> continuation) {
            C330312 c330312 = PerpetualsButtonsCachedService3.this.new C330312(this.$request, continuation);
            c330312.L$0 = microgramComponent;
            return c330312.invokeSuspend(Unit.INSTANCE);
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
            PerpetualsButtonsService perpetualButtonsService = PerpetualsButtonsCachedService3.this.getPerpetualButtonsService((MicrogramComponent) this.L$0);
            GetButtonsRequestDto getButtonsRequestDto = this.$request;
            this.label = 1;
            Object objGetButtons = perpetualButtonsService.GetButtons(getButtonsRequestDto, this);
            return objGetButtons == coroutine_suspended ? coroutine_suspended : objGetButtons;
        }
    }

    @Override // com.robinhood.crypto.perpetuals.store.cachedService.PerpetualsButtonsCachedService
    public Object getButtons(GetButtonsRequestDto getButtonsRequestDto, Continuation<? super GetButtonsResponseDto> continuation) {
        return this.componentManager.execute(new C330312(getButtonsRequestDto, null), continuation);
    }
}
