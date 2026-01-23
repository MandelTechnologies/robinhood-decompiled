package com.robinhood.android.equities.companyfinancials.microgram;

import com.robinhood.coroutines.job.CachedJobManager5;
import com.robinhood.coroutines.job.CachedJobManager7;
import equity_company_financials.proto.p457v1.EquityCompanyFinancialsService;
import equity_company_financials.proto.p457v1.SetScrubIndexRequestDto;
import equity_company_financials.proto.p457v1.SetScrubIndexResponseDto;
import equity_company_financials.proto.p457v1.SetSelectedTimePeriodRequestDto;
import equity_company_financials.proto.p457v1.SetSelectedTimePeriodResponseDto;
import equity_company_financials.proto.p457v1.StreamCompanyFinancialsSectionRequestDto;
import equity_company_financials.proto.p457v1.StreamCompanyFinancialsSectionResponseDto;
import equity_company_financials.proto.p457v1.StreamSupportedInstrumentsRequestDto;
import equity_company_financials.proto.p457v1.StreamSupportedInstrumentsResponseDto;
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

/* compiled from: CompanyFinancialsCachedService.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\rH\u0016J\u000e\u0010\u001d\u001a\u00020\u001eH\u0096A¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/microgram/RealCompanyFinancialsCachedService;", "Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "componentManager", "Lmicrogram/android/inject/MicrogramCachedComponentManager;", "<init>", "(Lmicrogram/android/inject/MicrogramCachedComponentManager;)V", "companyFinancialsService", "Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;", "Lmicrogram/android/inject/MicrogramComponent;", "getCompanyFinancialsService", "(Lmicrogram/android/inject/MicrogramComponent;)Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;", "streamCompanyFinancialsSection", "Lkotlinx/coroutines/flow/Flow;", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "instrumentId", "Ljava/util/UUID;", "setSelectedTimePeriod", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodResponseDto;", "selectedTimePeriodType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setScrubIndex", "Lequity_company_financials/proto/v1/SetScrubIndexResponseDto;", "scrubIndex", "", "(Ljava/util/UUID;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamSupportedInstruments", "Lequity_company_financials/proto/v1/StreamSupportedInstrumentsResponseDto;", "retainUntilCanceled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsCachedService3 implements CompanyFinancialsCachedService, CachedJobManager7 {
    public static final int $stable = 8;
    private final MicrogramCachedComponentManager componentManager;

    @Override // com.robinhood.coroutines.job.CachedJobManager7
    public Object retainUntilCanceled(Continuation<?> continuation) {
        return this.componentManager.retainUntilCanceled(continuation);
    }

    public CompanyFinancialsCachedService3(MicrogramCachedComponentManager componentManager) {
        Intrinsics.checkNotNullParameter(componentManager, "componentManager");
        this.componentManager = componentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityCompanyFinancialsService getCompanyFinancialsService(MicrogramComponent microgramComponent) {
        return (EquityCompanyFinancialsService) microgramComponent.getServiceLocator().getClient(EquityCompanyFinancialsService.class);
    }

    /* compiled from: CompanyFinancialsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService$streamCompanyFinancialsSection$1", m3645f = "CompanyFinancialsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService$streamCompanyFinancialsSection$1 */
    static final class C146111 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamCompanyFinancialsSectionResponseDto>>, Object> {
        final /* synthetic */ UUID $instrumentId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146111(UUID uuid, Continuation<? super C146111> continuation) {
            super(3, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamCompanyFinancialsSectionResponseDto>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamCompanyFinancialsSectionResponseDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamCompanyFinancialsSectionResponseDto>> continuation) {
            C146111 c146111 = CompanyFinancialsCachedService3.this.new C146111(this.$instrumentId, continuation);
            c146111.L$0 = microgramComponent;
            return c146111.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityCompanyFinancialsService companyFinancialsService = CompanyFinancialsCachedService3.this.getCompanyFinancialsService((MicrogramComponent) this.L$0);
                String string2 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return companyFinancialsService.StreamCompanyFinancialsSection(new StreamCompanyFinancialsSectionRequestDto(string2));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.equities.companyfinancials.microgram.CompanyFinancialsCachedService
    public Flow<StreamCompanyFinancialsSectionResponseDto> streamCompanyFinancialsSection(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return CachedJobManager5.flowFrom(this.componentManager, new C146111(instrumentId, null));
    }

    /* compiled from: CompanyFinancialsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService$setSelectedTimePeriod$2", m3645f = "CompanyFinancialsCachedService.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService$setSelectedTimePeriod$2 */
    static final class C146102 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super SetSelectedTimePeriodResponseDto>, Object> {
        final /* synthetic */ String $selectedTimePeriodType;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146102(String str, Continuation<? super C146102> continuation) {
            super(3, continuation);
            this.$selectedTimePeriodType = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super SetSelectedTimePeriodResponseDto> continuation) {
            C146102 c146102 = CompanyFinancialsCachedService3.this.new C146102(this.$selectedTimePeriodType, continuation);
            c146102.L$0 = microgramComponent;
            return c146102.invokeSuspend(Unit.INSTANCE);
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
            EquityCompanyFinancialsService companyFinancialsService = CompanyFinancialsCachedService3.this.getCompanyFinancialsService((MicrogramComponent) this.L$0);
            SetSelectedTimePeriodRequestDto setSelectedTimePeriodRequestDto = new SetSelectedTimePeriodRequestDto(this.$selectedTimePeriodType);
            this.label = 1;
            Object objSetSelectedTimePeriod = companyFinancialsService.SetSelectedTimePeriod(setSelectedTimePeriodRequestDto, this);
            return objSetSelectedTimePeriod == coroutine_suspended ? coroutine_suspended : objSetSelectedTimePeriod;
        }
    }

    @Override // com.robinhood.android.equities.companyfinancials.microgram.CompanyFinancialsCachedService
    public Object setSelectedTimePeriod(String str, Continuation<? super SetSelectedTimePeriodResponseDto> continuation) {
        return this.componentManager.execute(new C146102(str, null), continuation);
    }

    /* compiled from: CompanyFinancialsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lequity_company_financials/proto/v1/SetScrubIndexResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService$setScrubIndex$2", m3645f = "CompanyFinancialsCachedService.kt", m3646l = {83}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService$setScrubIndex$2 */
    static final class C146092 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super SetScrubIndexResponseDto>, Object> {
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ Integer $scrubIndex;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146092(UUID uuid, Integer num, Continuation<? super C146092> continuation) {
            super(3, continuation);
            this.$instrumentId = uuid;
            this.$scrubIndex = num;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super SetScrubIndexResponseDto> continuation) {
            C146092 c146092 = CompanyFinancialsCachedService3.this.new C146092(this.$instrumentId, this.$scrubIndex, continuation);
            c146092.L$0 = microgramComponent;
            return c146092.invokeSuspend(Unit.INSTANCE);
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
            EquityCompanyFinancialsService companyFinancialsService = CompanyFinancialsCachedService3.this.getCompanyFinancialsService((MicrogramComponent) this.L$0);
            String string2 = this.$instrumentId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            SetScrubIndexRequestDto setScrubIndexRequestDto = new SetScrubIndexRequestDto(string2, this.$scrubIndex);
            this.label = 1;
            Object objSetScrubIndex = companyFinancialsService.SetScrubIndex(setScrubIndexRequestDto, this);
            return objSetScrubIndex == coroutine_suspended ? coroutine_suspended : objSetScrubIndex;
        }
    }

    @Override // com.robinhood.android.equities.companyfinancials.microgram.CompanyFinancialsCachedService
    public Object setScrubIndex(UUID uuid, Integer num, Continuation<? super SetScrubIndexResponseDto> continuation) {
        return this.componentManager.execute(new C146092(uuid, num, null), continuation);
    }

    /* compiled from: CompanyFinancialsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lequity_company_financials/proto/v1/StreamSupportedInstrumentsResponseDto;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService$streamSupportedInstruments$1", m3645f = "CompanyFinancialsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.microgram.RealCompanyFinancialsCachedService$streamSupportedInstruments$1 */
    static final class C146121 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamSupportedInstrumentsResponseDto>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C146121(Continuation<? super C146121> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamSupportedInstrumentsResponseDto>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamSupportedInstrumentsResponseDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamSupportedInstrumentsResponseDto>> continuation) {
            C146121 c146121 = CompanyFinancialsCachedService3.this.new C146121(continuation);
            c146121.L$0 = microgramComponent;
            return c146121.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CompanyFinancialsCachedService3.this.getCompanyFinancialsService((MicrogramComponent) this.L$0).StreamSupportedInstruments(new StreamSupportedInstrumentsRequestDto());
        }
    }

    @Override // com.robinhood.android.equities.companyfinancials.microgram.CompanyFinancialsCachedService
    public Flow<StreamSupportedInstrumentsResponseDto> streamSupportedInstruments() {
        return CachedJobManager5.flowFrom(this.componentManager, new C146121(null));
    }
}
