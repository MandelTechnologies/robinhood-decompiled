package com.salesforce.android.smi.core.internal.data.repository;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.database.ConversationStore;
import com.salesforce.android.smi.network.data.domain.conversation.Conversation;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: ConversationRepository.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJF\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u001e\u0010!J>\u0010(\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u001c\u0010'\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0086@¢\u0006\u0004\b(\u0010)J>\u0010*\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u001c\u0010'\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0086@¢\u0006\u0004\b*\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "restService", "Lcom/salesforce/android/smi/database/ConversationStore;", "conversationStore", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lcom/salesforce/android/smi/database/ConversationStore;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "limit", "", "timestamp", "Ljava/util/UUID;", "conversationId", "", "forceRefresh", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;", "getConversations", "(ILjava/lang/Long;Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversation", "(Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getConversationFlow", "(Ljava/util/UUID;Z)Lkotlinx/coroutines/flow/Flow;", "conversations", "", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conversation", "(Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "entryId", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "transactionBlock", "updateInboundWatermark", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOutboundWatermark", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "Lcom/salesforce/android/smi/database/ConversationStore;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ConversationRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ConversationStore conversationStore;
    private final CoroutineDispatcher ioDispatcher;
    private final Mutex mutex;
    private final RestService restService;

    /* compiled from: ConversationRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository", m3645f = "ConversationRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "getConversation")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversation$1 */
    static final class C421161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C421161(Continuation<? super C421161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationRepository.this.getConversation(null, false, this);
        }
    }

    /* compiled from: ConversationRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository", m3645f = "ConversationRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE)
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$save$3 */
    static final class C421203 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C421203(Continuation<? super C421203> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationRepository.this.save((List<? extends Conversation>) null, this);
        }
    }

    public /* synthetic */ ConversationRepository(RestService restService, ConversationStore conversationStore, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(restService, conversationStore, coroutineDispatcher);
    }

    private ConversationRepository(RestService restService, ConversationStore conversationStore, CoroutineDispatcher coroutineDispatcher) {
        this.restService = restService;
        this.conversationStore = conversationStore;
        this.ioDispatcher = coroutineDispatcher;
        this.mutex = Mutex3.Mutex$default(false, 1, null);
    }

    /* compiled from: ConversationRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0002\u0010\tJ\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0002\u0010\r¨\u0006\u0010"}, m3636d2 = {"com/salesforce/android/smi/core/internal/data/repository/ConversationRepository$getConversations$2", "Lcom/salesforce/android/smi/core/internal/data/repository/AbstractNetworkFetchedResource;", "", "Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;", "forceRefresh", "", "isCachedResultDirty", "cachedResult", "loadFromCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendRequest", "processNetworkResponse", "response", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProcessedResult", "result", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversations$2 */
    public static final class C421192 extends AbstractNetworkFetchedResource<List<? extends Conversation>, List<? extends Conversation>> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ boolean $forceRefresh;
        final /* synthetic */ int $limit;
        final /* synthetic */ Long $timestamp;
        final /* synthetic */ ConversationRepository this$0;

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        public Object processNetworkResponse(List<? extends Conversation> list, Continuation<? super List<? extends Conversation>> continuation) {
            return list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421192(boolean z, ConversationRepository conversationRepository, int i, UUID uuid, Long l, CoroutineDispatcher coroutineDispatcher) {
            super(coroutineDispatcher);
            this.$forceRefresh = z;
            this.this$0 = conversationRepository;
            this.$limit = i;
            this.$conversationId = uuid;
            this.$timestamp = l;
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /* renamed from: forceRefresh, reason: from getter */
        public boolean get$forceRefresh() {
            return this.$forceRefresh;
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        public boolean isCachedResultDirty(List<? extends Conversation> cachedResult) {
            if (cachedResult != null) {
                return cachedResult.isEmpty();
            }
            return true;
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        public Object loadFromCache(Continuation<? super List<? extends Conversation>> continuation) {
            return ConversationStore.DefaultImpls.readList$default(this.this$0.conversationStore, this.$limit, this.$conversationId, this.$timestamp, false, continuation, 8, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object sendRequest(Continuation<? super List<? extends Conversation>> continuation) throws Exception {
            ConversationRepository3 conversationRepository3;
            if (continuation instanceof ConversationRepository3) {
                conversationRepository3 = (ConversationRepository3) continuation;
                int i = conversationRepository3.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    conversationRepository3.label = i - Integer.MIN_VALUE;
                } else {
                    conversationRepository3 = new ConversationRepository3(this, continuation);
                }
            }
            Object conversations = conversationRepository3.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = conversationRepository3.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(conversations);
                RestService restService = this.this$0.restService;
                UUID uuid = this.$conversationId;
                int i3 = this.$limit;
                Long l = this.$timestamp;
                conversationRepository3.label = 1;
                conversations = restService.getConversations(uuid, i3, l, conversationRepository3);
                if (conversations == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(conversations);
            }
            Result result = (Result) conversations;
            if (result instanceof Result.Success) {
                return (List) ((Result.Success) result).getData();
            }
            if (result instanceof Result.Error) {
                throw ((Result.Error) result).getException();
            }
            if (result instanceof Result.Empty) {
                return CollectionsKt.emptyList();
            }
            throw new Exception("Unknown error");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object saveProcessedResult(List<? extends Conversation> list, Continuation<? super List<? extends Conversation>> continuation) {
            ConversationRepository2 conversationRepository2;
            if (continuation instanceof ConversationRepository2) {
                conversationRepository2 = (ConversationRepository2) continuation;
                int i = conversationRepository2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    conversationRepository2.label = i - Integer.MIN_VALUE;
                } else {
                    conversationRepository2 = new ConversationRepository2(this, continuation);
                }
            }
            Object obj = conversationRepository2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = conversationRepository2.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) conversationRepository2.L$0;
                ResultKt.throwOnFailure(obj);
                return list2;
            }
            ResultKt.throwOnFailure(obj);
            ConversationRepository conversationRepository = this.this$0;
            conversationRepository2.L$0 = list;
            conversationRepository2.label = 1;
            return conversationRepository.save(list, conversationRepository2) == coroutine_suspended ? coroutine_suspended : list;
        }
    }

    public final Object getConversations(int i, Long l, UUID uuid, boolean z, Continuation<? super Result<? extends List<? extends Conversation>>> continuation) {
        return new C421192(z, this, i, uuid, l, this.ioDispatcher).invoke(continuation);
    }

    public static /* synthetic */ Object getConversation$default(ConversationRepository conversationRepository, UUID uuid, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return conversationRepository.getConversation(uuid, z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getConversation(UUID uuid, boolean z, Continuation<? super Result<? extends Conversation>> continuation) {
        C421161 c421161;
        ConversationRepository conversationRepository;
        UUID uuid2;
        Mutex mutex;
        if (continuation instanceof C421161) {
            c421161 = (C421161) continuation;
            int i = c421161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c421161.label = i - Integer.MIN_VALUE;
            } else {
                c421161 = new C421161(continuation);
            }
        }
        C421161 c4211612 = c421161;
        Object conversations = c4211612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4211612.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(conversations);
                Mutex mutex2 = this.mutex;
                c4211612.L$0 = this;
                c4211612.L$1 = uuid;
                c4211612.L$2 = mutex2;
                c4211612.Z$0 = z;
                c4211612.label = 1;
                if (mutex2.lock(null, c4211612) != coroutine_suspended) {
                    conversationRepository = this;
                    uuid2 = uuid;
                    mutex = mutex2;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex3 = (Mutex) c4211612.L$0;
                ResultKt.throwOnFailure(conversations);
                uuid = mutex3;
                Result map = com.salesforce.android.smi.common.api.ResultKt.map((Result) conversations, new Function1() { // from class: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ConversationRepository.getConversation$lambda$2$lambda$1((List) obj);
                    }
                });
                uuid.unlock(null);
                return map;
            }
            z = c4211612.Z$0;
            Mutex mutex4 = (Mutex) c4211612.L$2;
            UUID uuid3 = (UUID) c4211612.L$1;
            ConversationRepository conversationRepository2 = (ConversationRepository) c4211612.L$0;
            ResultKt.throwOnFailure(conversations);
            uuid2 = uuid3;
            conversationRepository = conversationRepository2;
            mutex = mutex4;
            boolean z2 = z;
            c4211612.L$0 = mutex;
            c4211612.L$1 = null;
            c4211612.L$2 = null;
            c4211612.label = 2;
            conversations = conversationRepository.getConversations(1, null, uuid2, z2, c4211612);
            uuid = mutex;
        } catch (Throwable th) {
            uuid.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Result getConversation$lambda$2$lambda$1(List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Conversation conversation = (Conversation) CollectionsKt.firstOrNull(data);
        return conversation != null ? new Result.Success(conversation) : Result.Empty.INSTANCE;
    }

    public static /* synthetic */ Flow getConversationFlow$default(ConversationRepository conversationRepository, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return conversationRepository.getConversationFlow(uuid, z);
    }

    /* compiled from: ConversationRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1", m3645f = "ConversationRepository.kt", m3646l = {101, 102, 104, 107}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1 */
    static final class C421171 extends ContinuationImpl7 implements Function2<FlowCollector<? super Result<? extends Conversation>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ boolean $forceRefresh;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421171(UUID uuid, boolean z, Continuation<? super C421171> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.$forceRefresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C421171 c421171 = ConversationRepository.this.new C421171(this.$conversationId, this.$forceRefresh, continuation);
            c421171.L$0 = obj;
            return c421171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Result<? extends Conversation>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C421171) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r3, r10) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Result result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Result.Loading loading = Result.Loading.INSTANCE;
                this.L$0 = flowCollector;
                this.label = 1;
                if (flowCollector.emit(loading, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                result = (Result) obj;
                if (!(result instanceof Result.Success)) {
                    this.L$0 = flowCollector;
                    this.L$1 = obj;
                    this.label = 3;
                    if (flowCollector.emit(result, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                final Flow listAsFlow$default = ConversationStore.DefaultImpls.readListAsFlow$default(ConversationRepository.this.conversationStore, 1, this.$conversationId, null, false, 8, null);
                Flow<Result<? extends Conversation>> flow = new Flow<Result<? extends Conversation>>() { // from class: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2", m3645f = "ConversationRepository.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
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
                                Conversation conversation = (Conversation) CollectionsKt.firstOrNull((List) obj);
                                Result success = conversation != null ? new Result.Success(conversation) : Result.Empty.INSTANCE;
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Result<? extends Conversation>> flowCollector2, Continuation continuation) {
                        Object objCollect = listAsFlow$default.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                final Flow listAsFlow$default2 = ConversationStore.DefaultImpls.readListAsFlow$default(ConversationRepository.this.conversationStore, 1, this.$conversationId, null, false, 8, null);
                Flow<Result<? extends Conversation>> flow2 = new Flow<Result<? extends Conversation>>() { // from class: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2", m3645f = "ConversationRepository.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
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
                                Conversation conversation = (Conversation) CollectionsKt.firstOrNull((List) obj);
                                Result success = conversation != null ? new Result.Success(conversation) : Result.Empty.INSTANCE;
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Result<? extends Conversation>> flowCollector2, Continuation continuation) {
                        Object objCollect = listAsFlow$default2.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
            }
            ConversationRepository conversationRepository = ConversationRepository.this;
            UUID uuid = this.$conversationId;
            boolean z = this.$forceRefresh;
            this.L$0 = flowCollector;
            this.label = 2;
            obj = conversationRepository.getConversation(uuid, z, this);
            if (obj != coroutine_suspended) {
                result = (Result) obj;
                if (!(result instanceof Result.Success)) {
                }
                final Flow listAsFlow$default22 = ConversationStore.DefaultImpls.readListAsFlow$default(ConversationRepository.this.conversationStore, 1, this.$conversationId, null, false, 8, null);
                Flow<Result<? extends Conversation>> flow22 = new Flow<Result<? extends Conversation>>() { // from class: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2", m3645f = "ConversationRepository.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
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
                                Conversation conversation = (Conversation) CollectionsKt.firstOrNull((List) obj);
                                Result success = conversation != null ? new Result.Success(conversation) : Result.Empty.INSTANCE;
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Result<? extends Conversation>> flowCollector2, Continuation continuation) {
                        Object objCollect = listAsFlow$default22.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
            }
            return coroutine_suspended;
        }
    }

    public final Flow<Result<Conversation>> getConversationFlow(UUID conversationId, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return FlowKt.m28818catch(FlowKt.flow(new C421171(conversationId, forceRefresh, null)), new C421182(null));
    }

    /* compiled from: ConversationRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;", "throwable", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$2", m3645f = "ConversationRepository.kt", m3646l = {113}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversationFlow$2 */
    static final class C421182 extends ContinuationImpl7 implements Function3<FlowCollector<? super Result<? extends Conversation>>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C421182(Continuation<? super C421182> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Result<? extends Conversation>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C421182 c421182 = new C421182(continuation);
            c421182.L$0 = flowCollector;
            c421182.L$1 = th;
            return c421182.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                Result.Error error = new Result.Error(new Exception(th.getMessage(), th));
                this.L$0 = null;
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object save(List<? extends Conversation> list, Continuation<? super Unit> continuation) {
        C421203 c421203;
        Iterator it;
        ConversationRepository conversationRepository;
        if (continuation instanceof C421203) {
            c421203 = (C421203) continuation;
            int i = c421203.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c421203.label = i - Integer.MIN_VALUE;
            } else {
                c421203 = new C421203(continuation);
            }
        }
        Object obj = c421203.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c421203.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            it = list.iterator();
            conversationRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c421203.L$1;
            conversationRepository = (ConversationRepository) c421203.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            c421203.L$0 = conversationRepository;
            c421203.L$1 = it;
            c421203.label = 1;
            if (conversationRepository.save(conversation, c421203) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ConversationRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/util/UUID;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$save$6", m3645f = "ConversationRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$save$6 */
    static final class C421216 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UUID>, Object> {
        final /* synthetic */ Conversation $conversation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421216(Conversation conversation, Continuation<? super C421216> continuation) {
            super(2, continuation);
            this.$conversation = conversation;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationRepository.this.new C421216(this.$conversation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UUID> continuation) {
            return ((C421216) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ConversationStore conversationStore = ConversationRepository.this.conversationStore;
            Conversation conversation = this.$conversation;
            this.label = 1;
            Object objSave = conversationStore.save(conversation, this);
            return objSave == coroutine_suspended ? coroutine_suspended : objSave;
        }
    }

    public final Object save(Conversation conversation, Continuation<? super UUID> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C421216(conversation, null), continuation);
    }

    public final Object updateInboundWatermark(UUID uuid, String str, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Integer> continuation) {
        return this.conversationStore.updateInboundWatermark(uuid, str, function1, continuation);
    }

    public final Object updateOutboundWatermark(UUID uuid, String str, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Integer> continuation) {
        return this.conversationStore.updateOutboundWatermark(uuid, str, function1, continuation);
    }

    /* compiled from: ConversationRepository.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "restService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "conversationStore", "Lcom/salesforce/android/smi/database/ConversationStore;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ConversationRepository create$default(Companion companion, RestService restService, ConversationStore conversationStore, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
            if ((i & 4) != 0) {
                coroutineDispatcher = Dispatchers.getIO();
            }
            return companion.create(restService, conversationStore, coroutineDispatcher);
        }

        public final ConversationRepository create(RestService restService, ConversationStore conversationStore, CoroutineDispatcher ioDispatcher) {
            Intrinsics.checkNotNullParameter(restService, "restService");
            Intrinsics.checkNotNullParameter(conversationStore, "conversationStore");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            return new ConversationRepository(restService, conversationStore, ioDispatcher, null);
        }
    }
}
