package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.shareholderx.ShareholderXApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.librobinhood.data.store.bonfire.QuestionsResponseState;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.dao.bonfire.QaEventMetadataDao;
import com.robinhood.shareholderx.models.api.ApiSayReferenceIdRequest;
import com.robinhood.shareholderx.models.api.ApiShareholderNewQuestionResponse;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestion;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestionsPaginatedResponse;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestionsPaginatedResponse2;
import com.robinhood.shareholderx.models.api.ApiShareholderQuestionsPaginatedResponse3;
import com.robinhood.shareholderx.models.api.ApiVoteButton;
import com.robinhood.shareholderx.models.api.ApiVoteResponse;
import com.robinhood.shareholderx.models.api.ShareholderNewQuestionBody;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestionsResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import dispatch.core.Flow7;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: ShareholderExperienceStore.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001DB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aJ&\u0010#\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010&J0\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u001aJ\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020(0.*\b\u0012\u0004\u0012\u00020/0.H\u0002J(\u00100\u001a\b\u0012\u0004\u0012\u0002H10.\"\u0004\b\u0000\u001012\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H10.03H\u0003J\"\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e050.2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\r05H\u0003J&\u00107\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\rH\u0086@¢\u0006\u0002\u00109J&\u0010:\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010;J\u001e\u0010<\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010=J\u000e\u0010>\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010?J\u0016\u0010@\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010BJ\u0006\u0010C\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore;", "Lcom/robinhood/store/Store;", "shareholderXApi", "Lcom/robinhood/android/api/shareholderx/ShareholderXApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "metadataDao", "Lcom/robinhood/models/dao/bonfire/QaEventMetadataDao;", "<init>", "(Lcom/robinhood/android/api/shareholderx/ShareholderXApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/QaEventMetadataDao;)V", "questionsLookup", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Ljava/util/UUID;", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "refreshFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "metadataEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore$QaMetadataParams;", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "getMetadataQuery", "Lio/reactivex/Observable;", "instrumentId", "eventSlug", "", "metadataQuery", "Lcom/robinhood/android/moria/db/Query;", "questionsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion$OnlyQuestionsRequest;", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion;", "answeredQuestionsEndpoint", "Lcom/robinhood/shareholderx/models/api/ApiShareholderQuestion$QuestionsAndAnswersRequest;", "postQuestion", "Lcom/robinhood/shareholderx/models/api/ApiShareholderNewQuestionResponse;", "question", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamQuestions", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;", "slug", "filter", AnalyticsStrings.BUTTON_LIST_SORT, "streamAnsweredQuestions", "toResponseState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse;", "fetchAllowingRefresh", "T", "request", "Lkotlin/Function0;", "fetchQuestions", "", "ids", "getQuestion", "questionId", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteQuestion", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toggleVote", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptTerms", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "associateSayReferenceId", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "QaMetadataParams", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ShareholderExperienceStore extends Store {
    private final PaginatedEndpoint<ApiShareholderQuestion.QuestionsAndAnswersRequest, ApiShareholderQuestion> answeredQuestionsEndpoint;
    private final QaEventMetadataDao metadataDao;
    private final Endpoint<QaMetadataParams, QaEventMetadata> metadataEndpoint;
    private final Query<QaMetadataParams, QaEventMetadata> metadataQuery;
    private final PaginatedEndpoint<ApiShareholderQuestion.OnlyQuestionsRequest, ApiShareholderQuestion> questionsEndpoint;
    private final StateFlow2<Map<UUID, ShareholderQuestion>> questionsLookup;
    private final SharedFlow2<Unit> refreshFlow;
    private final ShareholderXApi shareholderXApi;

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore", m3645f = "ShareholderExperienceStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE}, m3647m = "acceptTerms")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$acceptTerms$1 */
    static final class C345951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C345951(Continuation<? super C345951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShareholderExperienceStore.this.acceptTerms(this);
        }
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore", m3645f = "ShareholderExperienceStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m3647m = "deleteQuestion")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$deleteQuestion$1 */
    static final class C345961 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C345961(Continuation<? super C345961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShareholderExperienceStore.this.deleteQuestion(null, null, null, this);
        }
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore", m3645f = "ShareholderExperienceStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "getQuestion")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$getQuestion$1 */
    static final class C345981 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C345981(Continuation<? super C345981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShareholderExperienceStore.this.getQuestion(null, null, null, this);
        }
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore", m3645f = "ShareholderExperienceStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "postQuestion")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$postQuestion$1 */
    static final class C345991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C345991(Continuation<? super C345991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShareholderExperienceStore.this.postQuestion(null, null, null, this);
        }
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore", m3645f = "ShareholderExperienceStore.kt", m3646l = {255, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "toggleVote")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$toggleVote$1 */
    static final class C346011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C346011(Continuation<? super C346011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShareholderExperienceStore.this.toggleVote(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean answeredQuestionsEndpoint$lambda$3(Long l) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean questionsEndpoint$lambda$2(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareholderExperienceStore(ShareholderXApi shareholderXApi, StoreBundle storeBundle, QaEventMetadataDao metadataDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(shareholderXApi, "shareholderXApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(metadataDao, "metadataDao");
        this.shareholderXApi = shareholderXApi;
        this.metadataDao = metadataDao;
        this.questionsLookup = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        this.refreshFlow = SharedFlow4.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        this.metadataEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ShareholderExperienceStore$metadataEndpoint$1(this, null), getLogoutKillswitch(), new ShareholderExperienceStore$metadataEndpoint$2(metadataDao), storeBundle.getClock(), null, 16, null);
        this.metadataQuery = Store.create$default(this, Query.INSTANCE, "pollQaEventMetadata", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderExperienceStore.metadataQuery$lambda$0(this.f$0, (ShareholderExperienceStore.QaMetadataParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareholderExperienceStore.metadataQuery$lambda$1(this.f$0, (ShareholderExperienceStore.QaMetadataParams) obj);
            }
        }, false, 8, null);
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        this.questionsEndpoint = companion.createWithParams(new ShareholderExperienceStore$questionsEndpoint$1(this, null), getLogoutKillswitch(), new ShareholderExperienceStore$questionsEndpoint$2(this, null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ShareholderExperienceStore.questionsEndpoint$lambda$2((Long) obj));
            }
        });
        this.answeredQuestionsEndpoint = companion.createWithParams(new ShareholderExperienceStore$answeredQuestionsEndpoint$1(this, null), getLogoutKillswitch(), new ShareholderExperienceStore$answeredQuestionsEndpoint$2(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ShareholderExperienceStore.answeredQuestionsEndpoint$lambda$3((Long) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object metadataEndpoint$insert(QaEventMetadataDao qaEventMetadataDao, QaEventMetadata qaEventMetadata, Continuation continuation) {
        qaEventMetadataDao.insert(qaEventMetadata);
        return Unit.INSTANCE;
    }

    public final Observable<QaEventMetadata> getMetadataQuery(UUID instrumentId, String eventSlug) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
        return this.metadataQuery.asObservable(new QaMetadataParams(instrumentId, eventSlug));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow metadataQuery$lambda$0(ShareholderExperienceStore shareholderExperienceStore, QaMetadataParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(shareholderExperienceStore.metadataEndpoint, params, QaEventMetadata.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow metadataQuery$lambda$1(ShareholderExperienceStore shareholderExperienceStore, QaMetadataParams qaMetadataParams) {
        Intrinsics.checkNotNullParameter(qaMetadataParams, "<destruct>");
        return shareholderExperienceStore.metadataDao.getEventMetadata(qaMetadataParams.getInstrumentId(), qaMetadataParams.getEventSlug());
    }

    private final Flow<QuestionsResponseState> toResponseState(final Flow<? extends ShareholderQuestionsResponse> flow) {
        return FlowKt.m28818catch(new Flow<QuestionsResponseState>() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$toResponseState$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super QuestionsResponseState> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C345942(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$toResponseState$$inlined$map$1$2 */
            public static final class C345942<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$toResponseState$$inlined$map$1$2", m3645f = "ShareholderExperienceStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$toResponseState$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C345942.this.emit(null, this);
                    }
                }

                public C345942(FlowCollector flowCollector) {
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
                        QuestionsResponseState.Success success = new QuestionsResponseState.Success((ShareholderQuestionsResponse) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(success, anonymousClass1) == coroutine_suspended) {
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
        }, new C346004(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postQuestion(UUID uuid, String str, String str2, Continuation<? super ApiShareholderNewQuestionResponse> continuation) {
        C345991 c345991;
        if (continuation instanceof C345991) {
            c345991 = (C345991) continuation;
            int i = c345991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c345991.label = i - Integer.MIN_VALUE;
            } else {
                c345991 = new C345991(continuation);
            }
        }
        Object objSubmitQuestion = c345991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c345991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitQuestion);
            ShareholderXApi shareholderXApi = this.shareholderXApi;
            ShareholderNewQuestionBody shareholderNewQuestionBody = new ShareholderNewQuestionBody(str2);
            c345991.L$0 = uuid;
            c345991.L$1 = str;
            c345991.label = 1;
            objSubmitQuestion = shareholderXApi.submitQuestion(uuid, str, shareholderNewQuestionBody, c345991);
            if (objSubmitQuestion == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c345991.L$1;
            uuid = (UUID) c345991.L$0;
            ResultKt.throwOnFailure(objSubmitQuestion);
        }
        ApiShareholderNewQuestionResponse apiShareholderNewQuestionResponse = (ApiShareholderNewQuestionResponse) objSubmitQuestion;
        Endpoint.DefaultImpls.refresh$default(this.metadataEndpoint, new QaMetadataParams(uuid, str), true, null, 4, null);
        return apiShareholderNewQuestionResponse;
    }

    public final Observable<QuestionsResponseState> streamQuestions(final UUID instrumentId, final String slug, final String filter, final String sort) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(slug, "slug");
        return asObservable(fetchAllowingRefresh(new Function0() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareholderExperienceStore.streamQuestions$lambda$7(this.f$0, instrumentId, slug, filter, sort);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamQuestions$lambda$7(ShareholderExperienceStore shareholderExperienceStore, UUID uuid, String str, String str2, String str3) {
        final Flow<PaginatedResult<ApiShareholderQuestion>> flowFetchAllPages = shareholderExperienceStore.questionsEndpoint.fetchAllPages(new ApiShareholderQuestion.OnlyQuestionsRequest(uuid, str, str2, str3));
        final Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamQuestions$lambda$7$$inlined$filterIsInstance$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object objCollect = flowFetchAllPages.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamQuestions$lambda$7$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamQuestions$lambda$7$$inlined$filterIsInstance$1$2", m3645f = "ShareholderExperienceStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamQuestions$lambda$7$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        if (obj instanceof ApiShareholderQuestionsPaginatedResponse) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        return shareholderExperienceStore.toResponseState(FlowKt.transformLatest(FlowKt.runningReduce(new Flow<ShareholderQuestionsResponse.OnlyQuestions>() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamQuestions$lambda$7$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ShareholderQuestionsResponse.OnlyQuestions> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamQuestions$lambda$7$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamQuestions$lambda$7$$inlined$map$1$2", m3645f = "ShareholderExperienceStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamQuestions$lambda$7$$inlined$map$1$2$1, reason: invalid class name */
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
                        ShareholderQuestionsResponse.OnlyQuestions dbModel = ApiShareholderQuestionsPaginatedResponse3.toDbModel((ApiShareholderQuestionsPaginatedResponse<ApiShareholderQuestion>) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(dbModel, anonymousClass1) == coroutine_suspended) {
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
        }, new ShareholderExperienceStore$streamQuestions$1$2(null)), new C34591xdd3f9715(null, shareholderExperienceStore)));
    }

    public final Observable<QuestionsResponseState> streamAnsweredQuestions(final UUID instrumentId, final String eventSlug) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
        return asObservable(fetchAllowingRefresh(new Function0() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareholderExperienceStore.streamAnsweredQuestions$lambda$9(this.f$0, instrumentId, eventSlug);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamAnsweredQuestions$lambda$9(ShareholderExperienceStore shareholderExperienceStore, UUID uuid, String str) {
        final Flow<PaginatedResult<ApiShareholderQuestion>> flowFetchAllPages = shareholderExperienceStore.answeredQuestionsEndpoint.fetchAllPages(new ApiShareholderQuestion.QuestionsAndAnswersRequest(uuid, str));
        final Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$lambda$9$$inlined$filterIsInstance$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object objCollect = flowFetchAllPages.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$lambda$9$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$lambda$9$$inlined$filterIsInstance$1$2", m3645f = "ShareholderExperienceStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$lambda$9$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        if (obj instanceof ApiShareholderQuestionsPaginatedResponse2) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        return shareholderExperienceStore.toResponseState(FlowKt.runningReduce(new Flow<ShareholderQuestionsResponse.Answered>() { // from class: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$lambda$9$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ShareholderQuestionsResponse.Answered> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$lambda$9$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$lambda$9$$inlined$map$1$2", m3645f = "ShareholderExperienceStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$lambda$9$$inlined$map$1$2$1, reason: invalid class name */
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
                        ShareholderQuestionsResponse.Answered dbModel = ApiShareholderQuestionsPaginatedResponse3.toDbModel((ApiShareholderQuestionsPaginatedResponse2<ApiShareholderQuestion>) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(dbModel, anonymousClass1) == coroutine_suspended) {
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
        }, new ShareholderExperienceStore$streamAnsweredQuestions$1$2(null)));
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/librobinhood/data/store/bonfire/QuestionsResponseState;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$toResponseState$4", m3645f = "ShareholderExperienceStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$toResponseState$4 */
    static final class C346004 extends ContinuationImpl7 implements Function3<FlowCollector<? super QuestionsResponseState>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C346004(Continuation<? super C346004> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super QuestionsResponseState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C346004 c346004 = new C346004(continuation);
            c346004.L$0 = flowCollector;
            return c346004.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                QuestionsResponseState.Error error = QuestionsResponseState.Error.INSTANCE;
                this.label = 1;
                if (flowCollector.emit(error, this) == coroutine_suspended) {
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

    private final <T> Flow<T> fetchAllowingRefresh(Function0<? extends Flow<? extends T>> request) {
        return Flow7.flowOnIO(FlowKt.merge(request.invoke(), FlowKt.transformLatest(this.refreshFlow, new C34587x4922681e(null, request))));
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "lookup", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$fetchQuestions$1", m3645f = "ShareholderExperienceStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$fetchQuestions$1 */
    static final class C345971 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends ShareholderQuestion>, Continuation<? super List<? extends ShareholderQuestion>>, Object> {
        final /* synthetic */ List<UUID> $ids;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345971(List<UUID> list, Continuation<? super C345971> continuation) {
            super(2, continuation);
            this.$ids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C345971 c345971 = new C345971(this.$ids, continuation);
            c345971.L$0 = obj;
            return c345971;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends ShareholderQuestion> map, Continuation<? super List<? extends ShareholderQuestion>> continuation) {
            return invoke2((Map<UUID, ShareholderQuestion>) map, (Continuation<? super List<ShareholderQuestion>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<UUID, ShareholderQuestion> map, Continuation<? super List<ShareholderQuestion>> continuation) {
            return ((C345971) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Map map = (Map) this.L$0;
            List<UUID> list = this.$ids;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ShareholderQuestion shareholderQuestion = (ShareholderQuestion) map.get((UUID) it.next());
                if (shareholderQuestion != null) {
                    arrayList.add(shareholderQuestion);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<ShareholderQuestion>> fetchQuestions(List<UUID> ids) {
        return FlowKt.mapLatest(this.questionsLookup, new C345971(ids, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getQuestion(UUID uuid, String str, UUID uuid2, Continuation<? super ShareholderQuestion> continuation) {
        C345981 c345981;
        if (continuation instanceof C345981) {
            c345981 = (C345981) continuation;
            int i = c345981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c345981.label = i - Integer.MIN_VALUE;
            } else {
                c345981 = new C345981(continuation);
            }
        }
        Object shareholderQuestion = c345981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c345981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(shareholderQuestion);
            ShareholderXApi shareholderXApi = this.shareholderXApi;
            c345981.L$0 = uuid2;
            c345981.label = 1;
            shareholderQuestion = shareholderXApi.getShareholderQuestion(uuid, str, uuid2, c345981);
            if (shareholderQuestion == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid2 = (UUID) c345981.L$0;
            ResultKt.throwOnFailure(shareholderQuestion);
        }
        ShareholderQuestion dbModel = ((ApiShareholderQuestion) shareholderQuestion).toDbModel();
        StateFlow2<Map<UUID, ShareholderQuestion>> stateFlow2 = this.questionsLookup;
        stateFlow2.setValue(MapsKt.plus(stateFlow2.getValue(), MapsKt.mapOf(Tuples4.m3642to(uuid2, dbModel))));
        return dbModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteQuestion(UUID uuid, String str, ShareholderQuestion shareholderQuestion, Continuation<? super Unit> continuation) {
        C345961 c345961;
        if (continuation instanceof C345961) {
            c345961 = (C345961) continuation;
            int i = c345961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c345961.label = i - Integer.MIN_VALUE;
            } else {
                c345961 = new C345961(continuation);
            }
        }
        Object obj = c345961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c345961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ShareholderXApi shareholderXApi = this.shareholderXApi;
            UUID id = shareholderQuestion.getId();
            c345961.L$0 = uuid;
            c345961.L$1 = str;
            c345961.L$2 = shareholderQuestion;
            c345961.label = 1;
            if (shareholderXApi.deleteQuestion(uuid, str, id, c345961) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shareholderQuestion = (ShareholderQuestion) c345961.L$2;
            str = (String) c345961.L$1;
            uuid = (UUID) c345961.L$0;
            ResultKt.throwOnFailure(obj);
        }
        StateFlow2<Map<UUID, ShareholderQuestion>> stateFlow2 = this.questionsLookup;
        Map<UUID, ShareholderQuestion> mutableMap = MapsKt.toMutableMap(stateFlow2.getValue());
        mutableMap.remove(shareholderQuestion.getId());
        stateFlow2.setValue(mutableMap);
        Endpoint.DefaultImpls.refresh$default(this.metadataEndpoint, new QaMetadataParams(uuid, str), true, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r2 == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r2 == r4) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toggleVote(ShareholderQuestion shareholderQuestion, String str, Continuation<? super Unit> continuation) {
        C346011 c346011;
        ApiVoteResponse apiVoteResponse;
        if (continuation instanceof C346011) {
            c346011 = (C346011) continuation;
            int i = c346011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346011.label = i - Integer.MIN_VALUE;
            } else {
                c346011 = new C346011(continuation);
            }
        }
        Object objUpvoteQuestion = c346011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpvoteQuestion);
            ShareholderQuestion.VoteButton voteButton = shareholderQuestion.getVoteButton();
            if (voteButton != null) {
                if (voteButton.getDisabled()) {
                    voteButton = null;
                }
                if (voteButton != null) {
                    if (voteButton.getUpvoted()) {
                        ShareholderXApi shareholderXApi = this.shareholderXApi;
                        UUID id = shareholderQuestion.getId();
                        c346011.label = 1;
                        objUpvoteQuestion = shareholderXApi.removeUpvote(str, id, c346011);
                    } else {
                        ShareholderXApi shareholderXApi2 = this.shareholderXApi;
                        UUID id2 = shareholderQuestion.getId();
                        c346011.label = 2;
                        objUpvoteQuestion = shareholderXApi2.upvoteQuestion(str, id2, c346011);
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objUpvoteQuestion);
            apiVoteResponse = (ApiVoteResponse) objUpvoteQuestion;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpvoteQuestion);
            apiVoteResponse = (ApiVoteResponse) objUpvoteQuestion;
        }
        ShareholderQuestion shareholderQuestion2 = this.questionsLookup.getValue().get(apiVoteResponse.getQuestion_id());
        if (shareholderQuestion2 == null) {
            return Unit.INSTANCE;
        }
        String total_shares = apiVoteResponse.getTotal_shares();
        String total_votes = apiVoteResponse.getTotal_votes();
        ApiVoteButton vote_button = apiVoteResponse.getVote_button();
        ShareholderQuestion shareholderQuestionCopy$default = ShareholderQuestion.copy$default(shareholderQuestion2, null, null, null, null, null, vote_button != null ? vote_button.toDbModel() : null, total_votes, total_shares, null, false, null, null, null, 7967, null);
        StateFlow2<Map<UUID, ShareholderQuestion>> stateFlow2 = this.questionsLookup;
        Map<UUID, ShareholderQuestion> mutableMap = MapsKt.toMutableMap(stateFlow2.getValue());
        mutableMap.put(apiVoteResponse.getQuestion_id(), shareholderQuestionCopy$default);
        stateFlow2.setValue(mutableMap);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acceptTerms(Continuation<? super Unit> continuation) {
        C345951 c345951;
        if (continuation instanceof C345951) {
            c345951 = (C345951) continuation;
            int i = c345951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c345951.label = i - Integer.MIN_VALUE;
            } else {
                c345951 = new C345951(continuation);
            }
        }
        Object obj = c345951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c345951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ShareholderXApi shareholderXApi = this.shareholderXApi;
            c345951.label = 1;
            if (shareholderXApi.acceptShareholderExperienceTerms(c345951) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.metadataDao.deleteAll();
        return Unit.INSTANCE;
    }

    public final Object associateSayReferenceId(String str, Continuation<? super Unit> continuation) {
        Object objAssociateSayReferenceId = this.shareholderXApi.associateSayReferenceId(new ApiSayReferenceIdRequest(str), continuation);
        return objAssociateSayReferenceId == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAssociateSayReferenceId : Unit.INSTANCE;
    }

    public final void refresh() {
        if (!this.refreshFlow.tryEmit(Unit.INSTANCE)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* compiled from: ShareholderExperienceStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore$QaMetadataParams;", "", "instrumentId", "Ljava/util/UUID;", "eventSlug", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getEventSlug", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QaMetadataParams {
        private final String eventSlug;
        private final UUID instrumentId;

        public static /* synthetic */ QaMetadataParams copy$default(QaMetadataParams qaMetadataParams, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = qaMetadataParams.instrumentId;
            }
            if ((i & 2) != 0) {
                str = qaMetadataParams.eventSlug;
            }
            return qaMetadataParams.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEventSlug() {
            return this.eventSlug;
        }

        public final QaMetadataParams copy(UUID instrumentId, String eventSlug) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            return new QaMetadataParams(instrumentId, eventSlug);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QaMetadataParams)) {
                return false;
            }
            QaMetadataParams qaMetadataParams = (QaMetadataParams) other;
            return Intrinsics.areEqual(this.instrumentId, qaMetadataParams.instrumentId) && Intrinsics.areEqual(this.eventSlug, qaMetadataParams.eventSlug);
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.eventSlug.hashCode();
        }

        public String toString() {
            return "QaMetadataParams(instrumentId=" + this.instrumentId + ", eventSlug=" + this.eventSlug + ")";
        }

        public QaMetadataParams(UUID instrumentId, String eventSlug) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(eventSlug, "eventSlug");
            this.instrumentId = instrumentId;
            this.eventSlug = eventSlug;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getEventSlug() {
            return this.eventSlug;
        }
    }
}
