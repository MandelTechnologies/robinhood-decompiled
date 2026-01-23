package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.ApiUserInvestmentProfile;
import com.robinhood.models.p320db.AppointmentData;
import com.robinhood.models.p320db.AppointmentData2;
import com.robinhood.models.p320db.ChatData;
import com.robinhood.models.p320db.ChatData2;
import com.robinhood.models.p320db.OptionsStatus;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Completable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import options_product.service.CreateChatRequestDto;
import options_product.service.CreateChatResponseDto;
import options_product.service.GetAppointmentDataRequestDto;
import options_product.service.GetAppointmentDataResponseDto;
import options_product.service.GetNextOnboardingScreensRequestDto;
import options_product.service.GetNextOnboardingScreensResponseDto;
import options_product.service.GetOptionsStatusRequestDto;
import options_product.service.GetOptionsStatusResponseDto;
import options_product.service.OnboardingService;
import options_product.service.UpdateOptionsSuitabilityInfoRequestDto;

/* compiled from: OptionOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\"J\f\u0010%\u001a\u00020&*\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "onboardingService", "Loptions_product/service/OnboardingService;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Loptions_product/service/OnboardingService;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "getNextScreensEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Loptions_product/service/GetNextOnboardingScreensRequestDto;", "Loptions_product/service/GetNextOnboardingScreensResponseDto;", "getNextScreens", "request", "(Loptions_product/service/GetNextOnboardingScreensRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optionOnboardingStatusCache", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/db/OptionsStatus;", "getOptionsStatusEndpoint", "Loptions_product/service/GetOptionsStatusRequestDto;", "Loptions_product/service/GetOptionsStatusResponseDto;", "optionsStatusQuery", "Lcom/robinhood/android/moria/db/Query;", "streamOptionOnboardingOptionsStatus", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "updateOptionsInvestmentProfile", "Lio/reactivex/Completable;", "Lcom/robinhood/models/api/ApiUserInvestmentProfile$Request;", "getAppointmentData", "Lcom/robinhood/models/db/AppointmentData;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChat", "Lcom/robinhood/models/db/ChatData;", "toOptionsProductRequest", "Loptions_product/service/UpdateOptionsSuitabilityInfoRequestDto;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionOnboardingStore extends Store {
    private final ExperimentsStore experimentsStore;
    private final Endpoint<GetNextOnboardingScreensRequestDto, GetNextOnboardingScreensResponseDto> getNextScreensEndpoint;
    private final Endpoint<GetOptionsStatusRequestDto, GetOptionsStatusResponseDto> getOptionsStatusEndpoint;
    private final OnboardingService onboardingService;
    private final StateFlow2<OptionsStatus> optionOnboardingStatusCache;
    private final Query<GetOptionsStatusRequestDto, OptionsStatus> optionsStatusQuery;

    /* compiled from: OptionOnboardingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOnboardingStore", m3645f = "OptionOnboardingStore.kt", m3646l = {97}, m3647m = "createChat")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOnboardingStore$createChat$1 */
    static final class C340501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C340501(Continuation<? super C340501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionOnboardingStore.this.createChat(null, this);
        }
    }

    /* compiled from: OptionOnboardingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOnboardingStore", m3645f = "OptionOnboardingStore.kt", m3646l = {91}, m3647m = "getAppointmentData")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOnboardingStore$getAppointmentData$1 */
    static final class C340511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C340511(Continuation<? super C340511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionOnboardingStore.this.getAppointmentData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOnboardingStore(StoreBundle storeBundle, OnboardingService onboardingService, ExperimentsStore experimentsStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(onboardingService, "onboardingService");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.onboardingService = onboardingService;
        this.experimentsStore = experimentsStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getNextScreensEndpoint = Endpoint.Companion.create$default(companion, new OptionOnboardingStore2(this, null), getLogoutKillswitch(), new OptionOnboardingStore3(null), storeBundle.getClock(), null, 16, null);
        this.optionOnboardingStatusCache = StateFlow4.MutableStateFlow(null);
        Endpoint<GetOptionsStatusRequestDto, GetOptionsStatusResponseDto> endpointCreate$default = Endpoint.Companion.create$default(companion, new OptionOnboardingStore4(this, null), getLogoutKillswitch(), new OptionOnboardingStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.getOptionsStatusEndpoint = endpointCreate$default;
        this.optionsStatusQuery = Store.create$default(this, Query.INSTANCE, "optionStatusQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new OptionOnboardingStore6(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionOnboardingStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingStore.optionsStatusQuery$lambda$0(this.f$0, (GetOptionsStatusRequestDto) obj);
            }
        }, false, 8, null);
    }

    public final Object getNextScreens(GetNextOnboardingScreensRequestDto getNextOnboardingScreensRequestDto, Continuation<? super GetNextOnboardingScreensResponseDto> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getNextScreensEndpoint, getNextOnboardingScreensRequestDto, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow optionsStatusQuery$lambda$0(OptionOnboardingStore optionOnboardingStore, GetOptionsStatusRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.asStateFlow(optionOnboardingStore.optionOnboardingStatusCache);
    }

    public final Flow<OptionsStatus> streamOptionOnboardingOptionsStatus(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.coStreamVariation$default((ExperimentsProvider) this.experimentsStore, (Experiment) Experiments.OptionsKnowledgeCheckM1Experiment.INSTANCE, false, 2, (Object) null), new C34049x70427f1(null, this, accountNumber));
    }

    /* compiled from: OptionOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOnboardingStore$updateOptionsInvestmentProfile$1", m3645f = "OptionOnboardingStore.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOnboardingStore$updateOptionsInvestmentProfile$1 */
    static final class C340521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiUserInvestmentProfile.Request $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340521(ApiUserInvestmentProfile.Request request, Continuation<? super C340521> continuation) {
            super(2, continuation);
            this.$request = request;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingStore.this.new C340521(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C340521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OnboardingService onboardingService = OptionOnboardingStore.this.onboardingService;
                UpdateOptionsSuitabilityInfoRequestDto optionsProductRequest = OptionOnboardingStore.this.toOptionsProductRequest(this.$request);
                this.label = 1;
                if (onboardingService.UpdateOptionsSuitabilityInfo(optionsProductRequest, this) == coroutine_suspended) {
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

    public final Completable updateOptionsInvestmentProfile(ApiUserInvestmentProfile.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C340521(request, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAppointmentData(String str, Continuation<? super AppointmentData> continuation) {
        C340511 c340511;
        if (continuation instanceof C340511) {
            c340511 = (C340511) continuation;
            int i = c340511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c340511.label = i - Integer.MIN_VALUE;
            } else {
                c340511 = new C340511(continuation);
            }
        }
        Object objGetAppointmentData = c340511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c340511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAppointmentData);
            OnboardingService onboardingService = this.onboardingService;
            GetAppointmentDataRequestDto getAppointmentDataRequestDto = new GetAppointmentDataRequestDto(str);
            c340511.label = 1;
            objGetAppointmentData = onboardingService.GetAppointmentData(getAppointmentDataRequestDto, c340511);
            if (objGetAppointmentData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAppointmentData);
        }
        return AppointmentData2.toDbModel((GetAppointmentDataResponseDto) objGetAppointmentData);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createChat(String str, Continuation<? super ChatData> continuation) {
        C340501 c340501;
        if (continuation instanceof C340501) {
            c340501 = (C340501) continuation;
            int i = c340501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c340501.label = i - Integer.MIN_VALUE;
            } else {
                c340501 = new C340501(continuation);
            }
        }
        Object objCreateChat = c340501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c340501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateChat);
            OnboardingService onboardingService = this.onboardingService;
            CreateChatRequestDto createChatRequestDto = new CreateChatRequestDto(str, null, null, null, null, 30, null);
            c340501.label = 1;
            objCreateChat = onboardingService.CreateChat(createChatRequestDto, c340501);
            if (objCreateChat == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateChat);
        }
        return ChatData2.toDbModel((CreateChatResponseDto) objCreateChat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateOptionsSuitabilityInfoRequestDto toOptionsProductRequest(ApiUserInvestmentProfile.Request request) {
        return new UpdateOptionsSuitabilityInfoRequestDto(request.getIdentiOptionsTradingExperience(), request.getUnderstand_option_spreads(), request.getProfessional_trader());
    }
}
