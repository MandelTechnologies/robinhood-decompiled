package com.robinhood.android.equities.companyfinancials;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.microgram.CompanyFinancialsCachedService;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import equity_company_financials.proto.p457v1.StreamCompanyFinancialsSectionResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CompanyFinancialsSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001d\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionDataState;", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "companyFinancialsService", "Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stateProvider", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "scrubJob", "Lkotlinx/coroutines/Job;", "bind", "instrumentId", "Ljava/util/UUID;", "onTimePeriodSelected", "", "timePeriodType", "", "onScrubIndexChanged", "scrubIndex", "", "(Ljava/util/UUID;Ljava/lang/Integer;)V", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CompanyFinancialsSectionDuxo extends BaseDuxo<CompanyFinancialsSectionDataState, CompanyFinancialsSectionViewState> {
    public static final int $stable = 8;
    private final CompanyFinancialsCachedService companyFinancialsService;
    private final ExperimentsStore experimentsStore;
    private Job scrubJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompanyFinancialsSectionDuxo(CompanyFinancialsCachedService companyFinancialsService, ExperimentsStore experimentsStore, CompanyFinancialsSectionStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CompanyFinancialsSectionDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(companyFinancialsService, "companyFinancialsService");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.companyFinancialsService = companyFinancialsService;
        this.experimentsStore = experimentsStore;
    }

    /* compiled from: CompanyFinancialsSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$bind$1", m3645f = "CompanyFinancialsSectionDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$bind$1 */
    static final class C146041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146041(UUID uuid, Continuation<? super C146041> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CompanyFinancialsSectionDuxo.this.new C146041(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CompanyFinancialsSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$bind$1$1", m3645f = "CompanyFinancialsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CompanyFinancialsSectionDataState, Continuation<? super CompanyFinancialsSectionDataState>, Object> {
            final /* synthetic */ UUID $instrumentId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instrumentId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CompanyFinancialsSectionDataState companyFinancialsSectionDataState, Continuation<? super CompanyFinancialsSectionDataState> continuation) {
                return ((AnonymousClass1) create(companyFinancialsSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CompanyFinancialsSectionDataState.copy$default((CompanyFinancialsSectionDataState) this.L$0, this.$instrumentId, null, 2, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompanyFinancialsSectionDuxo.this.applyMutation(new AnonymousClass1(this.$instrumentId, null));
                Flow flowTransformLatest = FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(CompanyFinancialsSectionDuxo.this.experimentsStore, new Experiment[]{CompanyFinancialsExperiment.INSTANCE}, false, null, 6, null), new C14603xb5761076(null, CompanyFinancialsSectionDuxo.this, this.$instrumentId));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CompanyFinancialsSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CompanyFinancialsSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "section", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$bind$1$3", m3645f = "CompanyFinancialsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<StreamCompanyFinancialsSectionResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CompanyFinancialsSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CompanyFinancialsSectionDuxo companyFinancialsSectionDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = companyFinancialsSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamCompanyFinancialsSectionResponseDto streamCompanyFinancialsSectionResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(streamCompanyFinancialsSectionResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CompanyFinancialsSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$bind$1$3$1", m3645f = "CompanyFinancialsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$bind$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CompanyFinancialsSectionDataState, Continuation<? super CompanyFinancialsSectionDataState>, Object> {
                final /* synthetic */ StreamCompanyFinancialsSectionResponseDto $section;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StreamCompanyFinancialsSectionResponseDto streamCompanyFinancialsSectionResponseDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$section = streamCompanyFinancialsSectionResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$section, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CompanyFinancialsSectionDataState companyFinancialsSectionDataState, Continuation<? super CompanyFinancialsSectionDataState> continuation) {
                    return ((AnonymousClass1) create(companyFinancialsSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CompanyFinancialsSectionDataState.copy$default((CompanyFinancialsSectionDataState) this.L$0, null, this.$section, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((StreamCompanyFinancialsSectionResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C146041(instrumentId, null), 3, null);
    }

    /* compiled from: CompanyFinancialsSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$onTimePeriodSelected$1", m3645f = "CompanyFinancialsSectionDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$onTimePeriodSelected$1 */
    static final class C146061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $timePeriodType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146061(String str, Continuation<? super C146061> continuation) {
            super(2, continuation);
            this.$timePeriodType = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CompanyFinancialsSectionDuxo.this.new C146061(this.$timePeriodType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompanyFinancialsCachedService companyFinancialsCachedService = CompanyFinancialsSectionDuxo.this.companyFinancialsService;
                String str = this.$timePeriodType;
                this.label = 1;
                if (companyFinancialsCachedService.setSelectedTimePeriod(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onTimePeriodSelected(String timePeriodType) {
        Intrinsics.checkNotNullParameter(timePeriodType, "timePeriodType");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C146061(timePeriodType, null), 3, null);
    }

    /* compiled from: CompanyFinancialsSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$onScrubIndexChanged$1", m3645f = "CompanyFinancialsSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo$onScrubIndexChanged$1 */
    static final class C146051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ Integer $scrubIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146051(UUID uuid, Integer num, Continuation<? super C146051> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$scrubIndex = num;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CompanyFinancialsSectionDuxo.this.new C146051(this.$instrumentId, this.$scrubIndex, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompanyFinancialsCachedService companyFinancialsCachedService = CompanyFinancialsSectionDuxo.this.companyFinancialsService;
                UUID uuid = this.$instrumentId;
                Integer num = this.$scrubIndex;
                this.label = 1;
                if (companyFinancialsCachedService.setScrubIndex(uuid, num, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onScrubIndexChanged(UUID instrumentId, Integer scrubIndex) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Job job = this.scrubJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.scrubJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C146051(instrumentId, scrubIndex, null), 3, null);
    }
}
