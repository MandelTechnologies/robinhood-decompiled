package com.robinhood.store.questionnaire;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireConfirmRequest;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireProfileResponse;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireReview;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitRequest;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitResponse;
import com.robinhood.android.questionnaire.api.ReviewQueryParams;
import com.robinhood.android.questionnaire.p219db.QuestionGraphResponse;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import com.robinhood.api.questionnaire.QuestionnaireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: QuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003DEFB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010&\u001a\u00020\u000eH\u0002J:\u0010'\u001a\u00020(2\u0006\u0010&\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0+2\b\b\u0002\u0010,\u001a\u00020-H\u0086@¢\u0006\u0002\u0010.J(\u0010/\u001a\u00020(2\u0006\u0010&\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u00101J(\u00102\u001a\u00020(2\u0006\u0010&\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000e2\u0006\u0010,\u001a\u00020-H\u0086@¢\u0006\u0002\u00103J(\u00104\u001a\u0002052\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u00106J\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u001f082\u0006\u00109\u001a\u00020\u001eJ\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100;2\u0006\u0010<\u001a\u00020!J\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>082\u0006\u0010?\u001a\u00020!J.\u0010@\u001a\u00020>2\u0006\u0010&\u001a\u00020\u000e2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0+2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010CR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "questionnaireApi", "Lcom/robinhood/api/questionnaire/QuestionnaireApi;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/api/questionnaire/QuestionnaireApi;Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;Lcom/robinhood/store/StoreBundle;)V", "questionnaireReviewRelayMap", "", "", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;", "questionGraphDao", "Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionGraphQueryParams;", "Lcom/robinhood/android/questionnaire/db/QuestionGraphResponse;", "getQuestionsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionnaireQuestionsQueryParams;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion;", "getQuestionGraphEndpoint", "getQuestionEndpoint", "Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionnaireSingleQuestionQueryParams;", "submitQuestionnaireEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitRequest;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse;", "getReviewEndpoint", "Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview;", "streamReview", "Lcom/robinhood/android/moria/db/Query;", "getQuestionnaireReviewRelay", "context", "getQuestions", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "accountNumber", "questionKeys", "", "includeQuestionsAlreadyAnswered", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestion", "questionKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamQuestionGraph", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfile", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireProfileResponse;", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitAnswers", "Lio/reactivex/Single;", "request", "streamQuestionnaireReview", "Lkotlinx/coroutines/flow/Flow;", "reviewPageQueryParams", "fetchQuestionnaireReview", "", "queryParams", "confirmAnswers", "list", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetQuestionnaireQuestionsQueryParams", "GetQuestionnaireSingleQuestionQueryParams", "GetQuestionGraphQueryParams", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class QuestionnaireStore extends Store {
    private final AccountProvider accountProvider;
    private final Endpoint<GetQuestionnaireSingleQuestionQueryParams, ApiQuestionnaireQuestion> getQuestionEndpoint;
    private final Endpoint<GetQuestionGraphQueryParams, QuestionGraphResponse> getQuestionGraphEndpoint;
    private final Endpoint<GetQuestionnaireQuestionsQueryParams, PaginatedResult<ApiQuestionnaireQuestion>> getQuestionsEndpoint;
    private final Endpoint<ReviewQueryParams, ApiQuestionnaireReview> getReviewEndpoint;
    private final InvestmentProfileStore investmentProfileStore;
    private final Map<GetQuestionGraphQueryParams, QuestionGraphResponse> questionGraphDao;
    private final QuestionnaireApi questionnaireApi;
    private final Map<String, BehaviorRelay<UiQuestionnaireReview>> questionnaireReviewRelayMap;
    private final Query<ReviewQueryParams, UiQuestionnaireReview> streamReview;
    private final PostEndpoint<ApiQuestionnaireSubmitRequest, ApiQuestionnaireSubmitResponse> submitQuestionnaireEndpoint;

    /* compiled from: QuestionnaireStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore", m3645f = "QuestionnaireStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC7081g.f2778x3356acf6}, m3647m = "getQuestion")
    /* renamed from: com.robinhood.store.questionnaire.QuestionnaireStore$getQuestion$1 */
    static final class C415411 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C415411(Continuation<? super C415411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QuestionnaireStore.this.getQuestion(null, null, null, this);
        }
    }

    /* compiled from: QuestionnaireStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore", m3645f = "QuestionnaireStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "getQuestions")
    /* renamed from: com.robinhood.store.questionnaire.QuestionnaireStore$getQuestions$1 */
    static final class C415421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C415421(Continuation<? super C415421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QuestionnaireStore.this.getQuestions(null, null, null, false, this);
        }
    }

    /* compiled from: QuestionnaireStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore", m3645f = "QuestionnaireStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "streamQuestionGraph")
    /* renamed from: com.robinhood.store.questionnaire.QuestionnaireStore$streamQuestionGraph$1 */
    static final class C415431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C415431(Continuation<? super C415431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QuestionnaireStore.this.streamQuestionGraph(null, null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionnaireStore(AccountProvider accountProvider, QuestionnaireApi questionnaireApi, InvestmentProfileStore investmentProfileStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(questionnaireApi, "questionnaireApi");
        Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.questionnaireApi = questionnaireApi;
        this.investmentProfileStore = investmentProfileStore;
        this.questionnaireReviewRelayMap = new LinkedHashMap();
        this.questionGraphDao = new LinkedHashMap();
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getQuestionsEndpoint = Endpoint.Companion.create$default(companion, new QuestionnaireStore$getQuestionsEndpoint$1(this, null), getLogoutKillswitch(), new QuestionnaireStore$getQuestionsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.getQuestionGraphEndpoint = Endpoint.Companion.createWithParams$default(companion, new QuestionnaireStore$getQuestionGraphEndpoint$1(this, null), getLogoutKillswitch(), new QuestionnaireStore$getQuestionGraphEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getQuestionEndpoint = Endpoint.Companion.create$default(companion, new QuestionnaireStore$getQuestionEndpoint$1(this, null), getLogoutKillswitch(), new QuestionnaireStore$getQuestionEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.submitQuestionnaireEndpoint = PostEndpoint.INSTANCE.create(new QuestionnaireStore$submitQuestionnaireEndpoint$1(this, null), new QuestionnaireStore$submitQuestionnaireEndpoint$2(null));
        this.getReviewEndpoint = Endpoint.Companion.createWithParams$default(companion, new QuestionnaireStore$getReviewEndpoint$1(this, null), getLogoutKillswitch(), new QuestionnaireStore$getReviewEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.streamReview = Store.create$default(this, Query.INSTANCE, "streamReviewPage", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.questionnaire.QuestionnaireStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionnaireStore.streamReview$lambda$0(this.f$0, (ReviewQueryParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.questionnaire.QuestionnaireStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionnaireStore.streamReview$lambda$1(this.f$0, (ReviewQueryParams) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamReview$lambda$0(QuestionnaireStore questionnaireStore, ReviewQueryParams it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(questionnaireStore.getReviewEndpoint, it, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamReview$lambda$1(QuestionnaireStore questionnaireStore, ReviewQueryParams reviewQueryParams) {
        Intrinsics.checkNotNullParameter(reviewQueryParams, "<destruct>");
        return Context7.buffer$default(RxConvert.asFlow(questionnaireStore.getQuestionnaireReviewRelay(reviewQueryParams.getContext())), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BehaviorRelay<UiQuestionnaireReview> getQuestionnaireReviewRelay(String context) {
        Map<String, BehaviorRelay<UiQuestionnaireReview>> map = this.questionnaireReviewRelayMap;
        BehaviorRelay<UiQuestionnaireReview> behaviorRelayCreate = map.get(context);
        if (behaviorRelayCreate == null) {
            behaviorRelayCreate = BehaviorRelay.create();
            Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
            map.put(context, behaviorRelayCreate);
        }
        return behaviorRelayCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getQuestions(String str, String str2, List<String> list, boolean z, Continuation<? super QuestionnaireQuestionsResult> continuation) {
        C415421 c415421;
        ArrayList arrayList;
        Account account;
        ArrayList arrayList2;
        if (continuation instanceof C415421) {
            c415421 = (C415421) continuation;
            int i = c415421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415421.label = i - Integer.MIN_VALUE;
            } else {
                c415421 = new C415421(continuation);
            }
        }
        C415421 c4154212 = c415421;
        Object objForceFetch$default = c4154212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4154212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<GetQuestionnaireQuestionsQueryParams, PaginatedResult<ApiQuestionnaireQuestion>> endpoint = this.getQuestionsEndpoint;
            GetQuestionnaireQuestionsQueryParams getQuestionnaireQuestionsQueryParams = new GetQuestionnaireQuestionsQueryParams(str, str2, list, z);
            c4154212.L$0 = str2;
            c4154212.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, getQuestionnaireQuestionsQueryParams, null, c4154212, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r10 = (List) c4154212.L$0;
            ResultKt.throwOnFailure(objForceFetch$default);
            arrayList2 = r10;
            arrayList = arrayList2;
            account = (Account) objForceFetch$default;
            return QuestionnaireQuestionsResult.INSTANCE.from(arrayList, account);
        }
        str2 = (String) c4154212.L$0;
        ResultKt.throwOnFailure(objForceFetch$default);
        List results = ((PaginatedResult) objForceFetch$default).getResults();
        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiQuestionnaireQuestion) it.next()).toUiModel());
        }
        account = null;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
                Observable<Account> observableStreamAccount = this.accountProvider.streamAccount(str2);
                c4154212.L$0 = arrayList;
                c4154212.label = 2;
                objForceFetch$default = RxAwait3.awaitFirstOrNull(observableStreamAccount, c4154212);
                if (objForceFetch$default != coroutine_suspended) {
                    arrayList2 = arrayList;
                    arrayList = arrayList2;
                    account = (Account) objForceFetch$default;
                }
                return coroutine_suspended;
            }
        }
        return QuestionnaireQuestionsResult.INSTANCE.from(arrayList, account);
    }

    public static /* synthetic */ Object getQuestions$default(QuestionnaireStore questionnaireStore, String str, String str2, List list, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.listOf("");
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = false;
        }
        return questionnaireStore.getQuestions(str, str2, list2, z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r13 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getQuestion(String str, String str2, String str3, Continuation<? super QuestionnaireQuestionsResult> continuation) {
        C415411 c415411;
        UiQuestionnaireQuestion uiModel;
        Account account;
        if (continuation instanceof C415411) {
            c415411 = (C415411) continuation;
            int i = c415411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415411.label = i - Integer.MIN_VALUE;
            } else {
                c415411 = new C415411(continuation);
            }
        }
        C415411 c4154112 = c415411;
        Object objForceFetch$default = c4154112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4154112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            GetQuestionnaireSingleQuestionQueryParams getQuestionnaireSingleQuestionQueryParams = new GetQuestionnaireSingleQuestionQueryParams(str2, str, str3);
            Endpoint<GetQuestionnaireSingleQuestionQueryParams, ApiQuestionnaireQuestion> endpoint = this.getQuestionEndpoint;
            c4154112.L$0 = str3;
            c4154112.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, getQuestionnaireSingleQuestionQueryParams, null, c4154112, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uiModel = (UiQuestionnaireQuestion) c4154112.L$0;
            ResultKt.throwOnFailure(objForceFetch$default);
            account = (Account) objForceFetch$default;
            return QuestionnaireQuestionsResult.INSTANCE.from(CollectionsKt.listOf(uiModel), account);
        }
        str3 = (String) c4154112.L$0;
        ResultKt.throwOnFailure(objForceFetch$default);
        uiModel = ((ApiQuestionnaireQuestion) objForceFetch$default).toUiModel();
        account = null;
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null) {
                AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
                Observable<Account> observableStreamAccount = this.accountProvider.streamAccount(str3);
                c4154112.L$0 = uiModel;
                c4154112.label = 2;
                objForceFetch$default = RxAwait3.awaitFirstOrNull(observableStreamAccount, c4154112);
            }
        }
        return QuestionnaireQuestionsResult.INSTANCE.from(CollectionsKt.listOf(uiModel), account);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object streamQuestionGraph(String str, String str2, boolean z, Continuation<? super QuestionnaireQuestionsResult> continuation) {
        C415431 c415431;
        if (continuation instanceof C415431) {
            c415431 = (C415431) continuation;
            int i = c415431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415431.label = i - Integer.MIN_VALUE;
            } else {
                c415431 = new C415431(continuation);
            }
        }
        C415431 c4154312 = c415431;
        Object objForceFetch$default = c4154312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4154312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            GetQuestionGraphQueryParams getQuestionGraphQueryParams = new GetQuestionGraphQueryParams(str, str2, z);
            Endpoint<GetQuestionGraphQueryParams, QuestionGraphResponse> endpoint = this.getQuestionGraphEndpoint;
            c4154312.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, getQuestionGraphQueryParams, null, c4154312, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return QuestionnaireQuestionsResult.INSTANCE.from((QuestionGraphResponse) objForceFetch$default);
    }

    public final Object getProfile(String str, boolean z, String str2, Continuation<? super ApiQuestionnaireProfileResponse> continuation) {
        return this.questionnaireApi.getQuestionnaireProfile(str, z, str2, continuation);
    }

    /* compiled from: QuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore$submitAnswers$1", m3645f = "QuestionnaireStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.questionnaire.QuestionnaireStore$submitAnswers$1 */
    static final class C415441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiQuestionnaireSubmitResponse>, Object> {
        final /* synthetic */ ApiQuestionnaireSubmitRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C415441(ApiQuestionnaireSubmitRequest apiQuestionnaireSubmitRequest, Continuation<? super C415441> continuation) {
            super(2, continuation);
            this.$request = apiQuestionnaireSubmitRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuestionnaireStore.this.new C415441(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiQuestionnaireSubmitResponse> continuation) {
            return ((C415441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = QuestionnaireStore.this.submitQuestionnaireEndpoint;
            ApiQuestionnaireSubmitRequest apiQuestionnaireSubmitRequest = this.$request;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiQuestionnaireSubmitRequest, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiQuestionnaireSubmitResponse> submitAnswers(final ApiQuestionnaireSubmitRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<ApiQuestionnaireSubmitResponse> singleDoOnSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C415441(request, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.store.questionnaire.QuestionnaireStore.submitAnswers.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiQuestionnaireSubmitResponse apiQuestionnaireSubmitResponse) {
                QuestionnaireStore.this.investmentProfileStore.refreshInvestmentProfile(true);
                QuestionnaireStore.this.investmentProfileStore.refreshQuestionnaireCompleted(request.getContext(), request.getAccount_number(), true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        return singleDoOnSuccess;
    }

    public final Flow<UiQuestionnaireReview> streamQuestionnaireReview(ReviewQueryParams reviewPageQueryParams) {
        Intrinsics.checkNotNullParameter(reviewPageQueryParams, "reviewPageQueryParams");
        return this.streamReview.asFlow(reviewPageQueryParams);
    }

    /* compiled from: QuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore$fetchQuestionnaireReview$1", m3645f = "QuestionnaireStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.questionnaire.QuestionnaireStore$fetchQuestionnaireReview$1 */
    static final class C415401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReviewQueryParams $queryParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C415401(ReviewQueryParams reviewQueryParams, Continuation<? super C415401> continuation) {
            super(2, continuation);
            this.$queryParams = reviewQueryParams;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuestionnaireStore.this.new C415401(this.$queryParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C415401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job jobRefresh$default = Endpoint.DefaultImpls.refresh$default(QuestionnaireStore.this.getReviewEndpoint, this.$queryParams, true, null, 4, null);
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

    public final Single<Unit> fetchQuestionnaireReview(ReviewQueryParams queryParams) {
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C415401(queryParams, null), 1, null);
    }

    public final Object confirmAnswers(String str, List<UiQuestionnaireReview.QuestionAnswer> list, String str2, Continuation<? super Unit> continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            UiQuestionnaireReview.Answer answer = ((UiQuestionnaireReview.QuestionAnswer) it.next()).getAnswer();
            UUID id = answer != null ? answer.getId() : null;
            if (id != null) {
                arrayList.add(id);
            }
        }
        Object objConfirmUserAnswers = this.questionnaireApi.confirmUserAnswers(new ApiQuestionnaireConfirmRequest(str, str2, arrayList), continuation);
        return objConfirmUserAnswers == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objConfirmUserAnswers : Unit.INSTANCE;
    }

    /* compiled from: QuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionnaireQuestionsQueryParams;", "", "context", "", "accountNumber", "questionKeys", "", "includeQuestionsAlreadyAnswered", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getContext", "()Ljava/lang/String;", "getAccountNumber", "getQuestionKeys", "()Ljava/util/List;", "getIncludeQuestionsAlreadyAnswered", "()Z", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetQuestionnaireQuestionsQueryParams {
        private final String accountNumber;
        private final String context;
        private final boolean includeQuestionsAlreadyAnswered;
        private final List<String> questionKeys;

        public GetQuestionnaireQuestionsQueryParams(String context, String str, List<String> questionKeys, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(questionKeys, "questionKeys");
            this.context = context;
            this.accountNumber = str;
            this.questionKeys = questionKeys;
            this.includeQuestionsAlreadyAnswered = z;
        }

        public final String getContext() {
            return this.context;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final List<String> getQuestionKeys() {
            return this.questionKeys;
        }

        public final boolean getIncludeQuestionsAlreadyAnswered() {
            return this.includeQuestionsAlreadyAnswered;
        }
    }

    /* compiled from: QuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionnaireSingleQuestionQueryParams;", "", "questionKey", "", "context", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuestionKey", "()Ljava/lang/String;", "getContext", "getAccountNumber", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetQuestionnaireSingleQuestionQueryParams {
        private final String accountNumber;
        private final String context;
        private final String questionKey;

        public GetQuestionnaireSingleQuestionQueryParams(String questionKey, String context, String str) {
            Intrinsics.checkNotNullParameter(questionKey, "questionKey");
            Intrinsics.checkNotNullParameter(context, "context");
            this.questionKey = questionKey;
            this.context = context;
            this.accountNumber = str;
        }

        public final String getQuestionKey() {
            return this.questionKey;
        }

        public final String getContext() {
            return this.context;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: QuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionGraphQueryParams;", "", "context", "", "accountNumber", "includeQuestionsAlreadyAnswered", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getContext", "()Ljava/lang/String;", "getAccountNumber", "getIncludeQuestionsAlreadyAnswered", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetQuestionGraphQueryParams {
        private final String accountNumber;
        private final String context;
        private final boolean includeQuestionsAlreadyAnswered;

        public static /* synthetic */ GetQuestionGraphQueryParams copy$default(GetQuestionGraphQueryParams getQuestionGraphQueryParams, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getQuestionGraphQueryParams.context;
            }
            if ((i & 2) != 0) {
                str2 = getQuestionGraphQueryParams.accountNumber;
            }
            if ((i & 4) != 0) {
                z = getQuestionGraphQueryParams.includeQuestionsAlreadyAnswered;
            }
            return getQuestionGraphQueryParams.copy(str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIncludeQuestionsAlreadyAnswered() {
            return this.includeQuestionsAlreadyAnswered;
        }

        public final GetQuestionGraphQueryParams copy(String context, String accountNumber, boolean includeQuestionsAlreadyAnswered) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new GetQuestionGraphQueryParams(context, accountNumber, includeQuestionsAlreadyAnswered);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetQuestionGraphQueryParams)) {
                return false;
            }
            GetQuestionGraphQueryParams getQuestionGraphQueryParams = (GetQuestionGraphQueryParams) other;
            return Intrinsics.areEqual(this.context, getQuestionGraphQueryParams.context) && Intrinsics.areEqual(this.accountNumber, getQuestionGraphQueryParams.accountNumber) && this.includeQuestionsAlreadyAnswered == getQuestionGraphQueryParams.includeQuestionsAlreadyAnswered;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            String str = this.accountNumber;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.includeQuestionsAlreadyAnswered);
        }

        public String toString() {
            return "GetQuestionGraphQueryParams(context=" + this.context + ", accountNumber=" + this.accountNumber + ", includeQuestionsAlreadyAnswered=" + this.includeQuestionsAlreadyAnswered + ")";
        }

        public GetQuestionGraphQueryParams(String context, String str, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.accountNumber = str;
            this.includeQuestionsAlreadyAnswered = z;
        }

        public final String getContext() {
            return this.context;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getIncludeQuestionsAlreadyAnswered() {
            return this.includeQuestionsAlreadyAnswered;
        }
    }
}
