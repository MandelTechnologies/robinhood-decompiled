package com.salesforce.android.smi.core.internal.data.repository;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.database.ConversationEntryStore;
import com.salesforce.android.smi.network.api.rest.QueryDirection;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntryStatus;
import com.salesforce.android.smi.network.data.domain.conversationEntry.CoreConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.NetworkError;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ChoicesFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.StaticContentFormat;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import com.singular.sdk.internal.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ConversationEntryRepository.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\r\u001a\u00020\fH\u0087@¢\u0006\u0004\b\u0015\u0010\u0014JH\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b \u0010!JK\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u00120\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00120\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b&\u0010\u0014JO\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020'2\u0006\u0010\r\u001a\u00020\f2.\u0010,\u001a*\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00120)j\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u0012`+H\u0007¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b0\u0010\u0014J(\u00103\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u00102\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b3\u00104JL\u00103\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u00102\u001a\u00020\u001e2\b\b\u0002\u00105\u001a\u00020\u001e2\u001e\b\u0002\u00108\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020-07\u0012\u0006\u0012\u0004\u0018\u00010\u000106H\u0086@¢\u0006\u0004\b3\u00109J>\u0010=\u001a\u00020\u00182\u0006\u0010:\u001a\u00020*2\u0006\u0010<\u001a\u00020;2\u001c\u00108\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020-07\u0012\u0006\u0012\u0004\u0018\u00010\u000106H\u0086@¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010B¨\u0006D"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "restService", "Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;", "fileRepository", "Lcom/salesforce/android/smi/database/ConversationEntryStore;", "conversationEntryStore", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;Lcom/salesforce/android/smi/database/ConversationEntryStore;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntry", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "getAssets", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)Ljava/util/List;", "Lcom/salesforce/android/smi/common/api/Result;", "addConversationEntry", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendConversationEntry", "Ljava/util/UUID;", "conversationId", "", "limit", "", "timestamp", "Lcom/salesforce/android/smi/network/api/rest/QueryDirection;", "direction", "", "forceRefresh", "getConversationEntries", "(Ljava/util/UUID;ILjava/lang/Long;Lcom/salesforce/android/smi/network/api/rest/QueryDirection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getConversationEntriesFlow", "(Ljava/util/UUID;ILjava/lang/Long;Lcom/salesforce/android/smi/network/api/rest/QueryDirection;Z)Lkotlinx/coroutines/flow/Flow;", "Ljava/io/File;", "saveAttachments", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "files", "", "loadAttachments", "(Lkotlinx/coroutines/CoroutineScope;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Ljava/util/HashMap;)V", "resendConversationEntry", "conversationEntries", "isDirty", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "includeAttachments", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "transactionBlock", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entryId", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "status", "updateStatus", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;", "Lcom/salesforce/android/smi/database/ConversationEntryStore;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ConversationEntryRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;
    private final ConversationEntryStore conversationEntryStore;
    private final FileRepository fileRepository;
    private final CoroutineDispatcher ioDispatcher;
    private final RestService restService;

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository", m3645f = "ConversationEntryRepository.kt", m3646l = {51, 52}, m3647m = "addConversationEntry")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$addConversationEntry$1 */
    static final class C421001 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C421001(Continuation<? super C421001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationEntryRepository.this.addConversationEntry(null, this);
        }
    }

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository", m3645f = "ConversationEntryRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "resendConversationEntry")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$resendConversationEntry$1 */
    static final class C421071 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C421071(Continuation<? super C421071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationEntryRepository.this.resendConversationEntry(null, this);
        }
    }

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository", m3645f = "ConversationEntryRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE)
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$save$1 */
    static final class C421081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C421081(Continuation<? super C421081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationEntryRepository.this.save(null, false, this);
        }
    }

    public /* synthetic */ ConversationEntryRepository(RestService restService, FileRepository fileRepository, ConversationEntryStore conversationEntryStore, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(restService, fileRepository, conversationEntryStore, coroutineDispatcher);
    }

    private ConversationEntryRepository(RestService restService, FileRepository fileRepository, ConversationEntryStore conversationEntryStore, CoroutineDispatcher coroutineDispatcher) {
        this.restService = restService;
        this.fileRepository = fileRepository;
        this.conversationEntryStore = conversationEntryStore;
        this.ioDispatcher = coroutineDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r12 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addConversationEntry(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        C421001 c421001;
        ConversationEntryRepository conversationEntryRepository;
        ConversationEntry conversationEntry2;
        if (continuation instanceof C421001) {
            c421001 = (C421001) continuation;
            int i = c421001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c421001.label = i - Integer.MIN_VALUE;
            } else {
                c421001 = new C421001(continuation);
            }
        }
        C421001 c4210012 = c421001;
        Object objSendConversationEntry = c4210012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4210012.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendConversationEntry);
                c4210012.L$0 = this;
                c4210012.L$1 = conversationEntry;
                c4210012.label = 1;
                if (save$default(this, conversationEntry, false, true, null, c4210012, 10, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                conversationEntryRepository = this;
                conversationEntry2 = conversationEntry;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objSendConversationEntry);
                    return (Result) objSendConversationEntry;
                }
                conversationEntry2 = (ConversationEntry) c4210012.L$1;
                conversationEntryRepository = (ConversationEntryRepository) c4210012.L$0;
                ResultKt.throwOnFailure(objSendConversationEntry);
            }
            c4210012.L$0 = null;
            c4210012.L$1 = null;
            c4210012.label = 2;
            objSendConversationEntry = conversationEntryRepository.sendConversationEntry(conversationEntry2, c4210012);
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3635d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0096@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"com/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository$sendConversationEntry$2", "Lcom/salesforce/android/smi/core/internal/data/repository/AbstractNetworkSentResource;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "sendRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNetworkResponse", "response", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProcessedResult", "result", "handleException", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$sendConversationEntry$2 */
    public static final class C421122 extends AbstractNetworkSentResource<ConversationEntry, ConversationEntry> {
        final /* synthetic */ ConversationEntry $conversationEntry;
        final /* synthetic */ ConversationEntryRepository this$0;

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource
        public Object saveProcessedResult(ConversationEntry conversationEntry, Continuation<? super ConversationEntry> continuation) {
            return conversationEntry;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421122(ConversationEntry conversationEntry, ConversationEntryRepository conversationEntryRepository, CoroutineDispatcher coroutineDispatcher) {
            super(coroutineDispatcher);
            this.$conversationEntry = conversationEntry;
            this.this$0 = conversationEntryRepository;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
        
            if (r14 != r1) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bb -> B:29:0x00c3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d4 -> B:31:0x00d6). Please report as a decompilation issue!!! */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object sendRequest(Continuation<? super ConversationEntry> continuation) throws Exception {
            ConversationEntryRepository8 conversationEntryRepository8;
            C421122 c421122;
            Iterator it;
            ConversationEntryRepository8 conversationEntryRepository82;
            ConversationEntryRepository conversationEntryRepository;
            Collection collection;
            if (continuation instanceof ConversationEntryRepository8) {
                conversationEntryRepository8 = (ConversationEntryRepository8) continuation;
                int i = conversationEntryRepository8.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    conversationEntryRepository8.label = i - Integer.MIN_VALUE;
                } else {
                    conversationEntryRepository8 = new ConversationEntryRepository8(this, continuation);
                }
            }
            Object objSendMessage = conversationEntryRepository8.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = conversationEntryRepository8.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendMessage);
                EntryPayload payload = this.$conversationEntry.getPayload();
                if (!(payload instanceof EntryPayload.MessagePayload)) {
                    throw new Exception("Expected a entryPayload of type: " + EntryPayload.MessagePayload.class);
                }
                if (((EntryPayload.MessagePayload) payload).getAbstractMessage().getContent() instanceof StaticContentFormat.AttachmentsFormat) {
                    List assets = this.this$0.getAssets(this.$conversationEntry);
                    ConversationEntryRepository conversationEntryRepository2 = this.this$0;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assets, 10));
                    it = assets.iterator();
                    conversationEntryRepository82 = conversationEntryRepository8;
                    conversationEntryRepository = conversationEntryRepository2;
                    collection = arrayList;
                    c421122 = this;
                    if (it.hasNext()) {
                    }
                } else {
                    c421122 = this;
                    RestService restService = c421122.this$0.restService;
                    ConversationEntry conversationEntry = c421122.$conversationEntry;
                    conversationEntryRepository8.L$0 = null;
                    conversationEntryRepository8.L$1 = null;
                    conversationEntryRepository8.L$2 = null;
                    conversationEntryRepository8.L$3 = null;
                    conversationEntryRepository8.L$4 = null;
                    conversationEntryRepository8.L$5 = null;
                    conversationEntryRepository8.label = 2;
                    objSendMessage = restService.sendMessage(conversationEntry, conversationEntryRepository8);
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objSendMessage);
                    Result result = (Result) objSendMessage;
                    if (result instanceof Result.Error) {
                        throw ((Result.Error) result).getException();
                    }
                    if (result instanceof Result.Success) {
                        return (ConversationEntry) ((Result.Success) result).getData();
                    }
                    throw new Exception("Unknown error");
                }
                collection = (Collection) conversationEntryRepository8.L$5;
                FileAsset fileAsset = (FileAsset) conversationEntryRepository8.L$4;
                Iterator it2 = (Iterator) conversationEntryRepository8.L$3;
                Collection collection2 = (Collection) conversationEntryRepository8.L$2;
                ConversationEntryRepository conversationEntryRepository3 = (ConversationEntryRepository) conversationEntryRepository8.L$1;
                C421122 c4211222 = (C421122) conversationEntryRepository8.L$0;
                ResultKt.throwOnFailure(objSendMessage);
                Iterator it3 = it2;
                File file = (File) com.salesforce.android.smi.common.api.ResultKt.getData((Result) objSendMessage);
                it = it3;
                C421122 c4211223 = c4211222;
                conversationEntryRepository82 = conversationEntryRepository8;
                conversationEntryRepository = conversationEntryRepository3;
                FileAsset fileAsset2 = fileAsset;
                c421122 = c4211223;
                fileAsset2.setFile(file);
                collection.add(Unit.INSTANCE);
                collection = collection2;
                if (it.hasNext()) {
                    FileAsset fileAsset3 = (FileAsset) it.next();
                    file = fileAsset3.getFile();
                    if (file == null) {
                        FileRepository fileRepository = conversationEntryRepository.fileRepository;
                        conversationEntryRepository82.L$0 = c421122;
                        conversationEntryRepository82.L$1 = conversationEntryRepository;
                        conversationEntryRepository82.L$2 = collection;
                        conversationEntryRepository82.L$3 = it;
                        conversationEntryRepository82.L$4 = fileAsset3;
                        conversationEntryRepository82.L$5 = collection;
                        conversationEntryRepository82.label = 1;
                        Object obj = FileRepository.read$default(fileRepository, fileAsset3, false, (Continuation) conversationEntryRepository82, 2, (Object) null);
                        if (obj != coroutine_suspended) {
                            it2 = it;
                            objSendMessage = obj;
                            conversationEntryRepository3 = conversationEntryRepository;
                            conversationEntryRepository8 = conversationEntryRepository82;
                            c4211222 = c421122;
                            fileAsset = fileAsset3;
                            collection2 = collection;
                            Iterator it32 = it2;
                            File file2 = (File) com.salesforce.android.smi.common.api.ResultKt.getData((Result) objSendMessage);
                            it = it32;
                            C421122 c42112232 = c4211222;
                            conversationEntryRepository82 = conversationEntryRepository8;
                            conversationEntryRepository = conversationEntryRepository3;
                            FileAsset fileAsset22 = fileAsset;
                            c421122 = c42112232;
                            fileAsset22.setFile(file2);
                            collection.add(Unit.INSTANCE);
                            collection = collection2;
                            if (it.hasNext()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    fileAsset22 = fileAsset3;
                    collection2 = collection;
                    fileAsset22.setFile(file2);
                    collection.add(Unit.INSTANCE);
                    collection = collection2;
                    if (it.hasNext()) {
                    }
                } else {
                    conversationEntryRepository8 = conversationEntryRepository82;
                    RestService restService2 = c421122.this$0.restService;
                    ConversationEntry conversationEntry2 = c421122.$conversationEntry;
                    conversationEntryRepository8.L$0 = null;
                    conversationEntryRepository8.L$1 = null;
                    conversationEntryRepository8.L$2 = null;
                    conversationEntryRepository8.L$3 = null;
                    conversationEntryRepository8.L$4 = null;
                    conversationEntryRepository8.L$5 = null;
                    conversationEntryRepository8.label = 2;
                    objSendMessage = restService2.sendMessage(conversationEntry2, conversationEntryRepository8);
                }
            }
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource
        public Object processNetworkResponse(ConversationEntry conversationEntry, Continuation<? super ConversationEntry> continuation) {
            return CoreConversationEntry.copy$default(new CoreConversationEntry(conversationEntry), null, null, null, null, null, null, null, 0L, ConversationEntryStatus.Sent, null, 767, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
        
            if (r9.updateStatus(r10, r2, r0) == r1) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkSentResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object handleException(Exception exc, Continuation<? super Unit> continuation) {
            ConversationEntryRepository7 conversationEntryRepository7;
            C421122 c421122;
            C421122 c4211222;
            if (continuation instanceof ConversationEntryRepository7) {
                conversationEntryRepository7 = (ConversationEntryRepository7) continuation;
                int i = conversationEntryRepository7.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    conversationEntryRepository7.label = i - Integer.MIN_VALUE;
                } else {
                    conversationEntryRepository7 = new ConversationEntryRepository7(this, continuation);
                }
            }
            Object obj = conversationEntryRepository7.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = conversationEntryRepository7.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                conversationEntryRepository7.L$0 = this;
                conversationEntryRepository7.L$1 = exc;
                conversationEntryRepository7.label = 1;
                if (super.handleException(exc, conversationEntryRepository7) != coroutine_suspended) {
                    c421122 = this;
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                exc = (Exception) conversationEntryRepository7.L$1;
                c421122 = (C421122) conversationEntryRepository7.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                c4211222 = (C421122) conversationEntryRepository7.L$0;
                ResultKt.throwOnFailure(obj);
                c421122 = c4211222;
                ConversationEntryStore conversationEntryStore = c421122.this$0.conversationEntryStore;
                String entryId = c421122.$conversationEntry.getEntryId();
                ConversationEntryStatus conversationEntryStatus = ConversationEntryStatus.Error;
                conversationEntryRepository7.L$0 = null;
                conversationEntryRepository7.L$1 = null;
                conversationEntryRepository7.label = 3;
            }
            if (exc instanceof NetworkError) {
                ConversationEntryStore conversationEntryStore2 = c421122.this$0.conversationEntryStore;
                String entryId2 = c421122.$conversationEntry.getEntryId();
                String message = exc.getMessage();
                Integer numBoxInt = boxing.boxInt(((NetworkError) exc).getCode());
                conversationEntryRepository7.L$0 = c421122;
                conversationEntryRepository7.L$1 = null;
                conversationEntryRepository7.label = 2;
                if (conversationEntryStore2.updateError(entryId2, message, numBoxInt, conversationEntryRepository7) != coroutine_suspended) {
                    c4211222 = c421122;
                    c421122 = c4211222;
                    ConversationEntryStore conversationEntryStore3 = c421122.this$0.conversationEntryStore;
                    String entryId3 = c421122.$conversationEntry.getEntryId();
                    ConversationEntryStatus conversationEntryStatus2 = ConversationEntryStatus.Error;
                    conversationEntryRepository7.L$0 = null;
                    conversationEntryRepository7.L$1 = null;
                    conversationEntryRepository7.label = 3;
                }
            } else {
                ConversationEntryStore conversationEntryStore32 = c421122.this$0.conversationEntryStore;
                String entryId32 = c421122.$conversationEntry.getEntryId();
                ConversationEntryStatus conversationEntryStatus22 = ConversationEntryStatus.Error;
                conversationEntryRepository7.L$0 = null;
                conversationEntryRepository7.L$1 = null;
                conversationEntryRepository7.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public final Object sendConversationEntry(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        return new C421122(conversationEntry, this, this.ioDispatcher).invoke(continuation);
    }

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0002\u0010\u0007J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0002\u0010\r¨\u0006\u0010"}, m3636d2 = {"com/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository$getConversationEntries$2", "Lcom/salesforce/android/smi/core/internal/data/repository/AbstractNetworkFetchedResource;", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "forceRefresh", "", "loadFromCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCachedResultDirty", "cachedResult", "sendRequest", "processNetworkResponse", "response", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProcessedResult", "result", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$getConversationEntries$2 */
    public static final class C421012 extends AbstractNetworkFetchedResource<List<? extends ConversationEntry>, List<? extends ConversationEntry>> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ QueryDirection $direction;
        final /* synthetic */ boolean $forceRefresh;
        final /* synthetic */ int $limit;
        final /* synthetic */ Long $timestamp;
        final /* synthetic */ ConversationEntryRepository this$0;

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        public Object processNetworkResponse(List<? extends ConversationEntry> list, Continuation<? super List<? extends ConversationEntry>> continuation) {
            return list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421012(boolean z, ConversationEntryRepository conversationEntryRepository, int i, UUID uuid, Long l, QueryDirection queryDirection, CoroutineDispatcher coroutineDispatcher) {
            super(coroutineDispatcher);
            this.$forceRefresh = z;
            this.this$0 = conversationEntryRepository;
            this.$limit = i;
            this.$conversationId = uuid;
            this.$timestamp = l;
            this.$direction = queryDirection;
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /* renamed from: forceRefresh, reason: from getter */
        public boolean get$forceRefresh() {
            return this.$forceRefresh;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object loadFromCache(Continuation<? super List<? extends ConversationEntry>> continuation) {
            ConversationEntryRepository2 conversationEntryRepository2;
            HashMap<String, Result<File>> map;
            C421012 c421012;
            if (continuation instanceof ConversationEntryRepository2) {
                conversationEntryRepository2 = (ConversationEntryRepository2) continuation;
                int i = conversationEntryRepository2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    conversationEntryRepository2.label = i - Integer.MIN_VALUE;
                } else {
                    conversationEntryRepository2 = new ConversationEntryRepository2(this, continuation);
                }
            }
            ConversationEntryRepository2 conversationEntryRepository22 = conversationEntryRepository2;
            Object obj = conversationEntryRepository22.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = conversationEntryRepository22.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap<String, Result<File>> value = this.this$0.fileRepository.getFlow().getValue();
                ConversationEntryStore conversationEntryStore = this.this$0.conversationEntryStore;
                int i3 = this.$limit;
                UUID uuid = this.$conversationId;
                Long l = this.$timestamp;
                QueryDirection queryDirection = this.$direction;
                conversationEntryRepository22.L$0 = this;
                conversationEntryRepository22.L$1 = value;
                conversationEntryRepository22.label = 1;
                Object list = conversationEntryStore.readList(i3, uuid, l, queryDirection, conversationEntryRepository22);
                if (list == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map = value;
                obj = list;
                c421012 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (HashMap) conversationEntryRepository22.L$1;
                c421012 = (C421012) conversationEntryRepository22.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Iterable iterable = (Iterable) obj;
            ConversationEntryRepository conversationEntryRepository = c421012.this$0;
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                conversationEntryRepository.loadAttachments(CoroutineScope2.CoroutineScope(conversationEntryRepository22.getContext()), (ConversationEntry) it.next(), map);
            }
            return iterable;
        }

        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        public boolean isCachedResultDirty(List<? extends ConversationEntry> cachedResult) {
            if (cachedResult != null) {
                return cachedResult.isEmpty();
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // com.salesforce.android.smi.core.internal.data.repository.AbstractNetworkFetchedResource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object sendRequest(Continuation<? super List<? extends ConversationEntry>> continuation) throws Exception {
            ConversationEntryRepository4 conversationEntryRepository4;
            if (continuation instanceof ConversationEntryRepository4) {
                conversationEntryRepository4 = (ConversationEntryRepository4) continuation;
                int i = conversationEntryRepository4.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    conversationEntryRepository4.label = i - Integer.MIN_VALUE;
                } else {
                    conversationEntryRepository4 = new ConversationEntryRepository4(this, continuation);
                }
            }
            ConversationEntryRepository4 conversationEntryRepository42 = conversationEntryRepository4;
            Object conversationEntries = conversationEntryRepository42.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = conversationEntryRepository42.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(conversationEntries);
                RestService restService = this.this$0.restService;
                UUID uuid = this.$conversationId;
                int i3 = this.$limit;
                Long l = this.$timestamp;
                QueryDirection queryDirection = this.$direction;
                conversationEntryRepository42.label = 1;
                conversationEntries = restService.getConversationEntries(uuid, i3, l, queryDirection, conversationEntryRepository42);
                if (conversationEntries == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(conversationEntries);
            }
            Result result = (Result) conversationEntries;
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
        public Object saveProcessedResult(List<? extends ConversationEntry> list, Continuation<? super List<? extends ConversationEntry>> continuation) {
            ConversationEntryRepository3 conversationEntryRepository3;
            if (continuation instanceof ConversationEntryRepository3) {
                conversationEntryRepository3 = (ConversationEntryRepository3) continuation;
                int i = conversationEntryRepository3.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    conversationEntryRepository3.label = i - Integer.MIN_VALUE;
                } else {
                    conversationEntryRepository3 = new ConversationEntryRepository3(this, continuation);
                }
            }
            Object obj = conversationEntryRepository3.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = conversationEntryRepository3.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) conversationEntryRepository3.L$0;
                ResultKt.throwOnFailure(obj);
                return list2;
            }
            ResultKt.throwOnFailure(obj);
            ConversationEntryRepository conversationEntryRepository = this.this$0;
            conversationEntryRepository3.L$0 = list;
            conversationEntryRepository3.label = 1;
            return conversationEntryRepository.save(list, false, conversationEntryRepository3) == coroutine_suspended ? coroutine_suspended : list;
        }
    }

    public final Object getConversationEntries(UUID uuid, int i, Long l, QueryDirection queryDirection, boolean z, Continuation<? super Result<? extends List<? extends ConversationEntry>>> continuation) {
        return new C421012(z, this, i, uuid, l, queryDirection, this.ioDispatcher).invoke(continuation);
    }

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$getConversationEntriesFlow$1", m3645f = "ConversationEntryRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 147}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$getConversationEntriesFlow$1 */
    static final class C421051 extends ContinuationImpl7 implements Function2<FlowCollector<? super Result<? extends List<? extends ConversationEntry>>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ QueryDirection $direction;
        final /* synthetic */ boolean $forceRefresh;
        final /* synthetic */ int $limit;
        final /* synthetic */ Long $timestamp;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421051(UUID uuid, int i, Long l, QueryDirection queryDirection, boolean z, Continuation<? super C421051> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.$limit = i;
            this.$timestamp = l;
            this.$direction = queryDirection;
            this.$forceRefresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C421051 c421051 = ConversationEntryRepository.this.new C421051(this.$conversationId, this.$limit, this.$timestamp, this.$direction, this.$forceRefresh, continuation);
            c421051.L$0 = obj;
            return c421051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Result<? extends List<? extends ConversationEntry>>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C421051) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r0, r14) != r7) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            CoroutineScope coroutineScope;
            Object conversationEntries;
            FlowCollector flowCollector2;
            CoroutineScope coroutineScope2;
            CoroutineScope coroutineScope3;
            FlowCollector flowCollector3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                CoroutineScope CoroutineScope = CoroutineScope2.CoroutineScope(getContext());
                Result.Loading loading = Result.Loading.INSTANCE;
                this.L$0 = flowCollector4;
                this.L$1 = CoroutineScope;
                this.label = 1;
                if (flowCollector4.emit(loading, this) != coroutine_suspended) {
                    flowCollector = flowCollector4;
                    coroutineScope = CoroutineScope;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$1;
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope4;
                flowCollector = flowCollector5;
            } else {
                if (i == 2) {
                    FlowCollector flowCollector6 = (FlowCollector) this.L$2;
                    coroutineScope2 = (CoroutineScope) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector6;
                    conversationEntries = obj;
                    this.L$0 = flowCollector2;
                    this.L$1 = coroutineScope2;
                    this.L$2 = null;
                    this.label = 3;
                    if (flowCollector.emit(conversationEntries, this) != coroutine_suspended) {
                        coroutineScope3 = coroutineScope2;
                        flowCollector3 = flowCollector2;
                        Flow flowCombine = FlowKt.combine(ConversationEntryRepository.this.conversationEntryStore.readListFlow(this.$limit, this.$conversationId, this.$timestamp, this.$direction), ConversationEntryRepository.this.fileRepository.getFlow(), new ConversationEntryRepository5(ConversationEntryRepository.this, coroutineScope3, null));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                coroutineScope3 = (CoroutineScope) this.L$1;
                flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                Flow flowCombine2 = FlowKt.combine(ConversationEntryRepository.this.conversationEntryStore.readListFlow(this.$limit, this.$conversationId, this.$timestamp, this.$direction), ConversationEntryRepository.this.fileRepository.getFlow(), new ConversationEntryRepository5(ConversationEntryRepository.this, coroutineScope3, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
            }
            ConversationEntryRepository conversationEntryRepository = ConversationEntryRepository.this;
            UUID uuid = this.$conversationId;
            int i2 = this.$limit;
            Long l = this.$timestamp;
            QueryDirection queryDirection = this.$direction;
            boolean z = this.$forceRefresh;
            this.L$0 = flowCollector;
            this.L$1 = coroutineScope;
            this.L$2 = flowCollector;
            this.label = 2;
            conversationEntries = conversationEntryRepository.getConversationEntries(uuid, i2, l, queryDirection, z, this);
            if (conversationEntries != coroutine_suspended) {
                flowCollector2 = flowCollector;
                coroutineScope2 = coroutineScope;
                this.L$0 = flowCollector2;
                this.L$1 = coroutineScope2;
                this.L$2 = null;
                this.label = 3;
                if (flowCollector.emit(conversationEntries, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final Flow<Result<List<ConversationEntry>>> getConversationEntriesFlow(UUID conversationId, int limit, Long timestamp, QueryDirection direction, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return FlowKt.flow(new C421051(conversationId, limit, timestamp, direction, forceRefresh, null));
    }

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/salesforce/android/smi/common/api/Result;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$saveAttachments$2", m3645f = "ConversationEntryRepository.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$saveAttachments$2 */
    static final class C421112 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Result<? extends File>>>, Object> {
        final /* synthetic */ ConversationEntry $conversationEntry;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C421112(ConversationEntry conversationEntry, Continuation<? super C421112> continuation) {
            super(2, continuation);
            this.$conversationEntry = conversationEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationEntryRepository.this.new C421112(this.$conversationEntry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Result<? extends File>>> continuation) {
            return ((C421112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            FileRepository fileRepository = ConversationEntryRepository.this.fileRepository;
            List assets = ConversationEntryRepository.this.getAssets(this.$conversationEntry);
            this.label = 1;
            Object obj2 = FileRepository.read$default(fileRepository, assets, false, (Continuation) this, 2, (Object) null);
            return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
        }
    }

    public final Object saveAttachments(ConversationEntry conversationEntry, Continuation<? super List<? extends Result<? extends File>>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C421112(conversationEntry, null), continuation);
    }

    public final void loadAttachments(CoroutineScope scope, ConversationEntry conversationEntry, HashMap<String, Result<File>> files) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(conversationEntry, "conversationEntry");
        Intrinsics.checkNotNullParameter(files, "files");
        for (FileAsset fileAsset : getAssets(conversationEntry)) {
            Result<File> result = files.get(fileAsset.getId());
            fileAsset.setFile(result != null ? (File) com.salesforce.android.smi.common.api.ResultKt.getData(result) : null);
            BuildersKt__Builders_commonKt.launch$default(scope, this.ioDispatcher, null, new ConversationEntryRepository6(this, fileAsset, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FileAsset> getAssets(ConversationEntry conversationEntry) {
        List<FileAsset> listListOf;
        EntryPayload payload = conversationEntry.getPayload();
        Message message = payload instanceof Message ? (Message) payload : null;
        MessageFormat content = message != null ? message.getContent() : null;
        if (content instanceof StaticContentFormat.AttachmentsFormat) {
            return ((StaticContentFormat.AttachmentsFormat) content).getAttachments();
        }
        if (!(content instanceof StaticContentFormat.RichLinkFormat)) {
            return content instanceof ChoicesFormat.CarouselFormat ? ((ChoicesFormat.CarouselFormat) content).getImages() : CollectionsKt.emptyList();
        }
        FileAsset.ImageAsset.RichLinkImage image = ((StaticContentFormat.RichLinkFormat) content).getImage();
        return (image == null || (listListOf = CollectionsKt.listOf(image)) == null) ? CollectionsKt.emptyList() : listListOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resendConversationEntry(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        C421071 c421071;
        ConversationEntryRepository conversationEntryRepository;
        if (continuation instanceof C421071) {
            c421071 = (C421071) continuation;
            int i = c421071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c421071.label = i - Integer.MIN_VALUE;
            } else {
                c421071 = new C421071(continuation);
            }
        }
        Object objSendConversationEntry = c421071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c421071.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendConversationEntry);
                ConversationEntryStore conversationEntryStore = this.conversationEntryStore;
                String entryId = conversationEntry.getEntryId();
                ConversationEntryStatus conversationEntryStatus = ConversationEntryStatus.Sending;
                c421071.L$0 = this;
                c421071.L$1 = conversationEntry;
                c421071.label = 1;
                if (conversationEntryStore.updateStatus(entryId, conversationEntryStatus, c421071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                conversationEntryRepository = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objSendConversationEntry);
                    return (Result) objSendConversationEntry;
                }
                conversationEntry = (ConversationEntry) c421071.L$1;
                conversationEntryRepository = (ConversationEntryRepository) c421071.L$0;
                ResultKt.throwOnFailure(objSendConversationEntry);
            }
            c421071.L$0 = null;
            c421071.L$1 = null;
            c421071.label = 2;
            objSendConversationEntry = conversationEntryRepository.sendConversationEntry(conversationEntry, c421071);
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object save(List<? extends ConversationEntry> list, boolean z, Continuation<? super Unit> continuation) {
        C421081 c421081;
        ConversationEntryRepository conversationEntryRepository;
        boolean z2;
        C421081 c4210812;
        Iterator it;
        if (continuation instanceof C421081) {
            c421081 = (C421081) continuation;
            int i = c421081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c421081.label = i - Integer.MIN_VALUE;
            } else {
                c421081 = new C421081(continuation);
            }
        }
        Object obj = c421081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c421081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            conversationEntryRepository = this;
            z2 = z;
            c4210812 = c421081;
            it = list.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = c421081.Z$0;
            it = (Iterator) c421081.L$1;
            ConversationEntryRepository conversationEntryRepository2 = (ConversationEntryRepository) c421081.L$0;
            ResultKt.throwOnFailure(obj);
            z2 = z3;
            c4210812 = c421081;
            conversationEntryRepository = conversationEntryRepository2;
        }
        while (it.hasNext()) {
            ConversationEntry conversationEntry = (ConversationEntry) it.next();
            c4210812.L$0 = conversationEntryRepository;
            c4210812.L$1 = it;
            c4210812.Z$0 = z2;
            c4210812.label = 1;
            if (save$default(conversationEntryRepository, conversationEntry, z2, false, null, c4210812, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$save$4", m3645f = "ConversationEntryRepository.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$save$4 */
    public static final class C421094 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C421094(Continuation<? super C421094> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C421094(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C421094) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object save$default(ConversationEntryRepository conversationEntryRepository, ConversationEntry conversationEntry, boolean z, boolean z2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            function1 = new C421094(null);
        }
        return conversationEntryRepository.save(conversationEntry, z3, z4, function1, continuation);
    }

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$save$5", m3645f = "ConversationEntryRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$save$5 */
    static final class C421105 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ ConversationEntry $conversationEntry;
        final /* synthetic */ boolean $includeAttachments;
        final /* synthetic */ boolean $isDirty;
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $transactionBlock;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C421105(ConversationEntry conversationEntry, boolean z, Function1<? super Continuation<? super Unit>, ? extends Object> function1, boolean z2, Continuation<? super C421105> continuation) {
            super(2, continuation);
            this.$conversationEntry = conversationEntry;
            this.$isDirty = z;
            this.$transactionBlock = function1;
            this.$includeAttachments = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationEntryRepository.this.new C421105(this.$conversationEntry, this.$isDirty, this.$transactionBlock, this.$includeAttachments, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C421105) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConversationEntryStore conversationEntryStore = ConversationEntryRepository.this.conversationEntryStore;
                ConversationEntry conversationEntry = this.$conversationEntry;
                boolean z = this.$isDirty;
                Function1<Continuation<? super Unit>, Object> function1 = this.$transactionBlock;
                this.label = 1;
                obj = conversationEntryStore.save(conversationEntry, z, function1, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                return obj2;
            }
            ResultKt.throwOnFailure(obj);
            boolean z2 = this.$includeAttachments;
            ConversationEntryRepository conversationEntryRepository = ConversationEntryRepository.this;
            ConversationEntry conversationEntry2 = this.$conversationEntry;
            if (z2) {
                this.L$0 = obj;
                this.label = 2;
                if (conversationEntryRepository.saveAttachments(conversationEntry2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return obj;
        }
    }

    public final Object save(ConversationEntry conversationEntry, boolean z, boolean z2, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C421105(conversationEntry, z, function1, z2, null), continuation);
    }

    public final Object updateStatus(String str, ConversationEntryStatus conversationEntryStatus, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Integer> continuation) {
        return this.conversationEntryStore.updateStatus(str, conversationEntryStatus, function1, continuation);
    }

    /* compiled from: ConversationEntryRepository.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository$Companion;", "", "<init>", "()V", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "restService", "Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;", "fileRepository", "Lcom/salesforce/android/smi/database/ConversationEntryStore;", "conversationEntryStore", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lcom/salesforce/android/smi/core/internal/data/repository/FileRepository;Lcom/salesforce/android/smi/database/ConversationEntryStore;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ConversationEntryRepository create$default(Companion companion, RestService restService, FileRepository fileRepository, ConversationEntryStore conversationEntryStore, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
            if ((i & 8) != 0) {
                coroutineDispatcher = Dispatchers.getIO();
            }
            return companion.create(restService, fileRepository, conversationEntryStore, coroutineDispatcher);
        }

        public final ConversationEntryRepository create(RestService restService, FileRepository fileRepository, ConversationEntryStore conversationEntryStore, CoroutineDispatcher ioDispatcher) {
            Intrinsics.checkNotNullParameter(restService, "restService");
            Intrinsics.checkNotNullParameter(fileRepository, "fileRepository");
            Intrinsics.checkNotNullParameter(conversationEntryStore, "conversationEntryStore");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            return new ConversationEntryRepository(restService, fileRepository, conversationEntryStore, ioDispatcher, null);
        }
    }

    static {
        String name = ConversationEntryRepository.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
    }
}
