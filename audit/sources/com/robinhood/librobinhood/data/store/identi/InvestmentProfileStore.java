package com.robinhood.librobinhood.data.store.identi;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.onboarding.investmentprofilesettings.InvestmentProfileApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireCompletedResponse;
import com.robinhood.android.questionnaire.p219db.QuestionnaireCompleted;
import com.robinhood.api.investorprofile.InvestorProfileApi;
import com.robinhood.api.questionnaire.QuestionnaireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.ApiInvestmentProfileSettingsRequest;
import com.robinhood.models.api.bonfire.investmentprofilesettings.ApiInvestmentProfileSettingsResponse;
import com.robinhood.models.api.identi.ApiInvestmentProfileRefresh;
import com.robinhood.models.dao.bonfire.QuestionnaireCompletedDao;
import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileSettingsResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;

/* compiled from: InvestmentProfileStore.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\"J\u0012\u0010&\u001a\u00020'2\b\b\u0002\u0010%\u001a\u00020\"H\u0003J\"\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110)2\b\u0010*\u001a\u0004\u0018\u00010\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u001dJ\"\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010%\u001a\u00020\"J$\u0010.\u001a\u00020'2\u0006\u0010-\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010%\u001a\u00020\"H\u0007J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\"0)2\u0006\u0010-\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u001dJ\u000e\u00100\u001a\u000201H\u0086@¢\u0006\u0002\u00102J.\u00103\u001a\b\u0012\u0004\u0012\u00020\"042\u001e\u00105\u001a\u001a\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\f\u0012\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001f0\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0012\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011 \u0015*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u001c\u001a&\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\f\u0012\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001f0\u0014\u0012\u0004\u0012\u00020 0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010!\u001a&\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\f\u0012\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001f0\u0014\u0012\u0004\u0012\u00020\"0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "Lcom/robinhood/store/Store;", "investorProfileApi", "Lcom/robinhood/api/investorprofile/InvestorProfileApi;", "investmentProfileApi", "Lcom/robinhood/android/api/onboarding/investmentprofilesettings/InvestmentProfileApi;", "questionnaireApi", "Lcom/robinhood/api/questionnaire/QuestionnaireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "questionnaireCompletedDao", "Lcom/robinhood/models/dao/bonfire/QuestionnaireCompletedDao;", "<init>", "(Lcom/robinhood/api/investorprofile/InvestorProfileApi;Lcom/robinhood/android/api/onboarding/investmentprofilesettings/InvestmentProfileApi;Lcom/robinhood/api/questionnaire/QuestionnaireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/QuestionnaireCompletedDao;)V", "investmentProfileCache", "", "Lcom/robinhood/models/api/bonfire/ApiInvestmentProfileSettingsRequest;", "Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileSettings;", "investmentProfileRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "bonfireInvestmentProfileEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/bonfire/investmentprofilesettings/ApiInvestmentProfileSettingsResponse;", "streamInvestmentProfile", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "questionnaireCompletedEndpoint", "", "Lcom/robinhood/librobinhood/data/store/identi/Context;", "Lcom/robinhood/librobinhood/data/store/identi/AccountNumber;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireCompletedResponse;", "streamQuestionnaireCompleted", "", "refreshInvestmentProfile", "", "force", "fetchInvestmentProfileForAllCompletedQuestions", "Lio/reactivex/Completable;", "getInvestmentProfile", "Lio/reactivex/Observable;", "productContext", "accountNumber", "refreshQuestionnaireCompleted", "context", "fetchQuestionnaireCompleted", "getQuestionnaireCompleted", "checkForRefresh", "Lcom/robinhood/models/api/identi/ApiInvestmentProfileRefresh;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestionnaireCompletedFunction", "Lkotlinx/coroutines/flow/Flow;", "params", "Companion", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InvestmentProfileStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Duration normalStaleTimeout = Durations.INSTANCE.getONE_DAY();
    private final Endpoint<ApiInvestmentProfileSettingsRequest, ApiInvestmentProfileSettingsResponse> bonfireInvestmentProfileEndpoint;
    private final InvestmentProfileApi investmentProfileApi;
    private final Map<ApiInvestmentProfileSettingsRequest, UiInvestmentProfileSettingsResponse> investmentProfileCache;
    private final BehaviorRelay<Tuples2<ApiInvestmentProfileSettingsRequest, UiInvestmentProfileSettingsResponse>> investmentProfileRelay;
    private final InvestorProfileApi investorProfileApi;
    private final QuestionnaireApi questionnaireApi;
    private final QuestionnaireCompletedDao questionnaireCompletedDao;
    private final Endpoint<Tuples2<String, String>, ApiQuestionnaireCompletedResponse> questionnaireCompletedEndpoint;
    private final Query<ApiInvestmentProfileSettingsRequest, Optional<UiInvestmentProfileSettingsResponse>> streamInvestmentProfile;
    private final Query<Tuples2<String, String>, Boolean> streamQuestionnaireCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentProfileStore(InvestorProfileApi investorProfileApi, InvestmentProfileApi investmentProfileApi, QuestionnaireApi questionnaireApi, StoreBundle storeBundle, QuestionnaireCompletedDao questionnaireCompletedDao) {
        super(storeBundle, INSTANCE);
        Intrinsics.checkNotNullParameter(investorProfileApi, "investorProfileApi");
        Intrinsics.checkNotNullParameter(investmentProfileApi, "investmentProfileApi");
        Intrinsics.checkNotNullParameter(questionnaireApi, "questionnaireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(questionnaireCompletedDao, "questionnaireCompletedDao");
        this.investorProfileApi = investorProfileApi;
        this.investmentProfileApi = investmentProfileApi;
        this.questionnaireApi = questionnaireApi;
        this.questionnaireCompletedDao = questionnaireCompletedDao;
        this.investmentProfileCache = new LinkedHashMap();
        BehaviorRelay<Tuples2<ApiInvestmentProfileSettingsRequest, UiInvestmentProfileSettingsResponse>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.investmentProfileRelay = behaviorRelayCreate;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.bonfireInvestmentProfileEndpoint = Endpoint.Companion.createWithParams$default(companion, new InvestmentProfileStore2(this, null), getLogoutKillswitch(), new InvestmentProfileStore3(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.streamInvestmentProfile = Store.createOptional$default(this, companion2, "streamInvestmentProfile", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentProfileStore.streamInvestmentProfile$lambda$0(this.f$0, (ApiInvestmentProfileSettingsRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentProfileStore.streamInvestmentProfile$lambda$2(this.f$0, (ApiInvestmentProfileSettingsRequest) obj);
            }
        }, false, 8, null);
        this.questionnaireCompletedEndpoint = Endpoint.Companion.create$default(companion, new InvestmentProfileStore4(this, null), getLogoutKillswitch(), new InvestmentProfileStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.streamQuestionnaireCompleted = Store.create$default(this, companion2, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentProfileStore.streamQuestionnaireCompleted$lambda$3(this.f$0, (Tuples2) obj);
            }
        })), new InvestmentProfileStore8(this), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentProfile$lambda$0(InvestmentProfileStore investmentProfileStore, ApiInvestmentProfileSettingsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(investmentProfileStore.bonfireInvestmentProfileEndpoint, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentProfile$lambda$2(InvestmentProfileStore investmentProfileStore, final ApiInvestmentProfileSettingsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Observable observableStartWith = investmentProfileStore.investmentProfileRelay.hide().filter(new Predicate() { // from class: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$streamInvestmentProfile$2$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples2<ApiInvestmentProfileSettingsRequest, ? extends UiInvestmentProfileSettingsResponse> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return Intrinsics.areEqual(request, tuples2.component1());
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$streamInvestmentProfile$2$2
            @Override // io.reactivex.functions.Function
            public final Optional<UiInvestmentProfileSettingsResponse> apply(Tuples2<ApiInvestmentProfileSettingsRequest, ? extends UiInvestmentProfileSettingsResponse> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return Optional3.asOptional(tuples2.component2());
            }
        }).startWith((Observable<R>) Optional3.asOptional(investmentProfileStore.investmentProfileCache.get(request)));
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableStartWith), Integer.MAX_VALUE, null, 2, null);
        return new Flow<UiInvestmentProfileSettingsResponse>() { // from class: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$streamInvestmentProfile$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$streamInvestmentProfile$lambda$2$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$streamInvestmentProfile$lambda$2$$inlined$map$1$2", m3645f = "InvestmentProfileStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$streamInvestmentProfile$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiInvestmentProfileSettingsResponse> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamQuestionnaireCompleted$lambda$3(InvestmentProfileStore investmentProfileStore, Tuples2 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(investmentProfileStore.questionnaireCompletedEndpoint, params, null, null, 6, null);
    }

    public static /* synthetic */ void refreshInvestmentProfile$default(InvestmentProfileStore investmentProfileStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investmentProfileStore.refreshInvestmentProfile(z);
    }

    public final void refreshInvestmentProfile(boolean force) {
        ScopedSubscriptionKt.subscribeIn(fetchInvestmentProfileForAllCompletedQuestions(force), getStoreScope());
    }

    /* compiled from: InvestmentProfileStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$fetchInvestmentProfileForAllCompletedQuestions$1", m3645f = "InvestmentProfileStore.kt", m3646l = {120}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$fetchInvestmentProfileForAllCompletedQuestions$1 */
    static final class C348361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348361(boolean z, Continuation<? super C348361> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentProfileStore.this.new C348361(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job jobRefresh$default = Endpoint.DefaultImpls.refresh$default(InvestmentProfileStore.this.bonfireInvestmentProfileEndpoint, new ApiInvestmentProfileSettingsRequest(null, null, 3, null), this.$force, null, 4, null);
                this.label = 1;
                if (jobRefresh$default.join(this) == coroutine_suspended) {
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

    static /* synthetic */ Completable fetchInvestmentProfileForAllCompletedQuestions$default(InvestmentProfileStore investmentProfileStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return investmentProfileStore.fetchInvestmentProfileForAllCompletedQuestions(z);
    }

    private final Completable fetchInvestmentProfileForAllCompletedQuestions(boolean force) {
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C348361(force, null), 1, null);
    }

    public final Observable<? extends UiInvestmentProfileSettingsResponse> getInvestmentProfile(String productContext, String accountNumber) {
        return ObservablesKt.filterIsPresent(this.streamInvestmentProfile.asObservable(new ApiInvestmentProfileSettingsRequest(productContext, accountNumber)));
    }

    public static /* synthetic */ void refreshQuestionnaireCompleted$default(InvestmentProfileStore investmentProfileStore, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        investmentProfileStore.refreshQuestionnaireCompleted(str, str2, z);
    }

    public final void refreshQuestionnaireCompleted(String context, String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(context, "context");
        ScopedSubscriptionKt.subscribeIn(fetchQuestionnaireCompleted(context, accountNumber, force), getStoreScope());
    }

    public static /* synthetic */ Completable fetchQuestionnaireCompleted$default(InvestmentProfileStore investmentProfileStore, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return investmentProfileStore.fetchQuestionnaireCompleted(str, str2, z);
    }

    /* compiled from: InvestmentProfileStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$fetchQuestionnaireCompleted$1", m3645f = "InvestmentProfileStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$fetchQuestionnaireCompleted$1 */
    static final class C348371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $context;
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348371(String str, String str2, boolean z, Continuation<? super C348371> continuation) {
            super(2, continuation);
            this.$context = str;
            this.$accountNumber = str2;
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentProfileStore.this.new C348371(this.$context, this.$accountNumber, this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job jobRefresh$default = Endpoint.DefaultImpls.refresh$default(InvestmentProfileStore.this.questionnaireCompletedEndpoint, Tuples4.m3642to(this.$context, this.$accountNumber), this.$force, null, 4, null);
                this.label = 1;
                if (jobRefresh$default.join(this) == coroutine_suspended) {
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

    public final Completable fetchQuestionnaireCompleted(String context, String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C348371(context, accountNumber, force, null), 1, null);
    }

    public final Observable<Boolean> getQuestionnaireCompleted(String context, String accountNumber) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.streamQuestionnaireCompleted.asObservable(Tuples4.m3642to(context, accountNumber));
    }

    public final Object checkForRefresh(Continuation<? super ApiInvestmentProfileRefresh> continuation) {
        return this.investorProfileApi.checkInvestmentProfileRefresh(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> getQuestionnaireCompletedFunction(Tuples2<String, String> params) {
        final Flow flowFilterNotNull = FlowKt.filterNotNull(this.questionnaireCompletedDao.getQuestionnaireCompleted(params.getFirst()));
        return new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$getQuestionnaireCompletedFunction$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$getQuestionnaireCompletedFunction$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$getQuestionnaireCompletedFunction$$inlined$map$1$2", m3645f = "InvestmentProfileStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$getQuestionnaireCompletedFunction$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = boxing.boxBoolean(((QuestionnaireCompleted) obj).getCompleted());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* compiled from: InvestmentProfileStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore$Companion;", "Lcom/robinhood/models/db/StaleConfig;", "<init>", "()V", "j$/time/Duration", "normalStaleTimeout", "Lj$/time/Duration;", "getNormalStaleTimeout", "()Lj$/time/Duration;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StaleConfig {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getShortStaleTimeout() {
            return StaleConfig.DefaultImpls.getShortStaleTimeout(this);
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getNormalStaleTimeout() {
            return InvestmentProfileStore.normalStaleTimeout;
        }
    }
}
