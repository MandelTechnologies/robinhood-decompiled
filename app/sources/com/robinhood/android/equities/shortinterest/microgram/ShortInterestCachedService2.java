package com.robinhood.android.equities.shortinterest.microgram;

import com.robinhood.coroutines.job.CachedJobManager5;
import com.robinhood.coroutines.job.CachedJobManager7;
import java.util.UUID;
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
import kotlinx.coroutines.flow.Flow;
import microgram.android.inject.MicrogramCachedComponentManager;
import microgram.android.inject.MicrogramComponent;
import microgram.contracts.equity_short_interest.proto.p488v1.EquityShortInterestService;
import microgram.contracts.equity_short_interest.proto.p488v1.StreamShortInterestSectionRequestDto;
import microgram.contracts.equity_short_interest.proto.p488v1.StreamShortInterestSectionResponseDto;

/* compiled from: ShortInterestCachedService.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u0012H\u0096A¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equities/shortinterest/microgram/RealShortInterestCachedService;", "Lcom/robinhood/android/equities/shortinterest/microgram/ShortInterestCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "componentManager", "Lmicrogram/android/inject/MicrogramCachedComponentManager;", "<init>", "(Lmicrogram/android/inject/MicrogramCachedComponentManager;)V", "equityShortInterestService", "Lmicrogram/contracts/equity_short_interest/proto/v1/EquityShortInterestService;", "Lmicrogram/android/inject/MicrogramComponent;", "getEquityShortInterestService", "(Lmicrogram/android/inject/MicrogramComponent;)Lmicrogram/contracts/equity_short_interest/proto/v1/EquityShortInterestService;", "streamShortInterestSection", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;", "instrumentId", "Ljava/util/UUID;", "retainUntilCanceled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-short-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.shortinterest.microgram.RealShortInterestCachedService, reason: use source file name */
/* loaded from: classes3.dex */
public final class ShortInterestCachedService2 implements ShortInterestCachedService, CachedJobManager7 {
    public static final int $stable = 8;
    private final MicrogramCachedComponentManager componentManager;

    @Override // com.robinhood.coroutines.job.CachedJobManager7
    public Object retainUntilCanceled(Continuation<?> continuation) {
        return this.componentManager.retainUntilCanceled(continuation);
    }

    public ShortInterestCachedService2(MicrogramCachedComponentManager componentManager) {
        Intrinsics.checkNotNullParameter(componentManager, "componentManager");
        this.componentManager = componentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityShortInterestService getEquityShortInterestService(MicrogramComponent microgramComponent) {
        return (EquityShortInterestService) microgramComponent.getServiceLocator().getClient(EquityShortInterestService.class);
    }

    /* compiled from: ShortInterestCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.shortinterest.microgram.RealShortInterestCachedService$streamShortInterestSection$1", m3645f = "ShortInterestCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.shortinterest.microgram.RealShortInterestCachedService$streamShortInterestSection$1 */
    static final class C147881 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamShortInterestSectionResponseDto>>, Object> {
        final /* synthetic */ UUID $instrumentId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C147881(UUID uuid, Continuation<? super C147881> continuation) {
            super(3, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamShortInterestSectionResponseDto>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamShortInterestSectionResponseDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamShortInterestSectionResponseDto>> continuation) {
            C147881 c147881 = ShortInterestCachedService2.this.new C147881(this.$instrumentId, continuation);
            c147881.L$0 = microgramComponent;
            return c147881.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityShortInterestService equityShortInterestService = ShortInterestCachedService2.this.getEquityShortInterestService((MicrogramComponent) this.L$0);
                String string2 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return equityShortInterestService.StreamShortInterestSection(new StreamShortInterestSectionRequestDto(string2));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.equities.shortinterest.microgram.ShortInterestCachedService
    public Flow<StreamShortInterestSectionResponseDto> streamShortInterestSection(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return CachedJobManager5.flowFrom(this.componentManager, new C147881(instrumentId, null));
    }
}
