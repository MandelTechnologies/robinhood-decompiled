package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiMessage;
import com.robinhood.models.api.ApiMessagePageWindow;
import com.robinhood.models.api.ApiMessageResult;
import com.robinhood.models.dao.InboxMessageDao;
import com.robinhood.models.p320db.InboxMessageType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Instant;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

/* compiled from: InboxMessageStore.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u00012B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0016J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016J.\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00122\u0006\u0010\u0015\u001a\u00020\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J.\u0010%\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020$J\u0016\u0010*\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010)\u001a\u00020$J\u0016\u0010,\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010-\u001a\u00020$J\u000e\u0010.\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010/\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0018H\u0002J\u0018\u00101\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InboxMessageStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "messageDao", "Lcom/robinhood/models/dao/InboxMessageDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/InboxMessageDao;)V", "saveAction", "Lkotlin/Function1;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiMessageResult;", "", "localMessages", "Lcom/robinhood/librobinhood/data/store/InboxMessageStore$LocalMessages;", "streamMessages", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/db/InboxMessageType$Message;", "threadId", "", "streamLocalMessages", "Lcom/robinhood/models/db/InboxMessageType$LocalMessage;", "fetchMessages", "Lio/reactivex/Maybe;", "beforeMessageId", "afterMessageId", "fetchMessagesResponse", "fetchNewMessages", "fetchNewMessagesResponse", "submitMessage", "Lio/reactivex/Completable;", "text", "mediaId", "Ljava/util/UUID;", "submitResponse", "messageId", "responseAnswer", "responseDisplayText", "localId", "hasSubmittedResponse", "", "retryMessage", "localMessageId", "clearSentLocalMessages", "submitMessageInternal", "localMessage", "submitResponseInternal", "LocalMessages", "lib-store-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InboxMessageStore extends Store {
    private final Brokeback brokeback;
    private final LocalMessages localMessages;
    private final InboxMessageDao messageDao;
    private final Function1<Response<ApiMessageResult>, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageStore(Brokeback brokeback, StoreBundle storeBundle, InboxMessageDao messageDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(messageDao, "messageDao");
        this.brokeback = brokeback;
        this.messageDao = messageDao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<Response<ApiMessageResult>, Unit>() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Response<ApiMessageResult> response) {
                m22655invoke(response);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22655invoke(Response<ApiMessageResult> response) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    ApiMessageResult apiMessageResultBody = response.body();
                    Intrinsics.checkNotNull(apiMessageResultBody);
                    ApiMessageResult apiMessageResult = apiMessageResultBody;
                    InboxMessageDao inboxMessageDao = this.messageDao;
                    ApiMessagePageWindow next = apiMessageResult.getNext();
                    List<ApiMessage> results = apiMessageResult.getResults();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
                    Iterator<T> it = results.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ApiMessage) it.next()).toDbModel());
                    }
                    inboxMessageDao.insert(next, arrayList);
                } catch (IllegalStateException e) {
                    if (logoutKillswitch.isLoggedOut()) {
                        Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                        try {
                            roomDatabase.close();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    throw e;
                }
            }
        };
        this.localMessages = new LocalMessages();
    }

    public final Observable<List<InboxMessageType.Message>> streamMessages(String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        return asObservable(takeWhileLoggedIn(this.messageDao.get(threadId)));
    }

    public final Observable<List<InboxMessageType.LocalMessage>> streamLocalMessages(String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        return asObservable(takeWhileLoggedIn(this.localMessages.streamLocalMessages(threadId)));
    }

    public final Maybe<ApiMessageResult> fetchMessages(String threadId, String beforeMessageId, String afterMessageId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Maybe map = fetchMessagesResponse(threadId, beforeMessageId, afterMessageId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore.fetchMessages.1
            @Override // io.reactivex.functions.Function
            public final ApiMessageResult apply(Response<ApiMessageResult> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ApiMessageResult apiMessageResultBody = it.body();
                Intrinsics.checkNotNull(apiMessageResultBody);
                return apiMessageResultBody;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Maybe<Response<ApiMessageResult>> fetchMessagesResponse(String threadId, String beforeMessageId, String afterMessageId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Single singleDoOnSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new InboxMessageStore5(this, threadId, beforeMessageId, afterMessageId, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore$fetchMessagesResponse$obs$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Response<ApiMessageResult> response) {
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        return refresh(singleDoOnSuccess).force(true).allowErrors(true).saveAction(this.saveAction).toMaybe(getNetworkWrapper());
    }

    public final Observable<ApiMessageResult> fetchNewMessages(String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Observable map = fetchNewMessagesResponse(threadId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore.fetchNewMessages.1
            @Override // io.reactivex.functions.Function
            public final ApiMessageResult apply(Response<ApiMessageResult> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ApiMessageResult apiMessageResultBody = it.body();
                Intrinsics.checkNotNull(apiMessageResultBody);
                return apiMessageResultBody;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<Response<ApiMessageResult>> fetchNewMessagesResponse(final String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Observable observableSwitchMapMaybe = streamMessages(threadId).take(1L).switchMapMaybe(new Function() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore.fetchNewMessagesResponse.1
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends Response<ApiMessageResult>> apply(List<InboxMessageType.Message> messages) {
                Intrinsics.checkNotNullParameter(messages, "messages");
                InboxMessageType.Message message = (InboxMessageType.Message) CollectionsKt.firstOrNull((List) messages);
                return InboxMessageStore.this.fetchMessagesResponse(threadId, null, message != null ? message.getId() : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapMaybe, "switchMapMaybe(...)");
        return observableSwitchMapMaybe;
    }

    public static /* synthetic */ Completable submitMessage$default(InboxMessageStore inboxMessageStore, String str, String str2, UUID uuid, int i, Object obj) {
        if ((i & 4) != 0) {
            uuid = null;
        }
        return inboxMessageStore.submitMessage(str, str2, uuid);
    }

    public final Completable submitMessage(String threadId, String text, UUID mediaId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        if ((text == null || !(!StringsKt.isBlank(text))) && mediaId == null) {
            throw new IllegalStateException("Check failed.");
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNull(uuidRandomUUID);
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        InboxMessageType.LocalMessage localMessage = new InboxMessageType.LocalMessage(uuidRandomUUID, threadId, null, instantNow, new InboxMessageType.LocalMessage.RequestData.Text(text, mediaId), InboxMessageType.LocalMessage.State.SENDING);
        this.localMessages.add(localMessage);
        return submitMessageInternal(threadId, localMessage);
    }

    public final Completable submitResponse(String threadId, String messageId, String responseAnswer, String responseDisplayText, UUID localId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(responseAnswer, "responseAnswer");
        Intrinsics.checkNotNullParameter(responseDisplayText, "responseDisplayText");
        Intrinsics.checkNotNullParameter(localId, "localId");
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        InboxMessageType.LocalMessage localMessage = new InboxMessageType.LocalMessage(localId, threadId, null, instantNow, new InboxMessageType.LocalMessage.RequestData.Response(messageId, responseDisplayText, responseAnswer), InboxMessageType.LocalMessage.State.SENDING);
        this.localMessages.add(localMessage);
        return submitResponseInternal(threadId, localMessage);
    }

    public final boolean hasSubmittedResponse(String threadId, UUID localId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Intrinsics.checkNotNullParameter(localId, "localId");
        return this.localMessages.hasMessage(localId, threadId);
    }

    public final Completable retryMessage(String threadId, UUID localMessageId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Intrinsics.checkNotNullParameter(localMessageId, "localMessageId");
        InboxMessageType.LocalMessage message = this.localMessages.getMessage(localMessageId, threadId);
        Intrinsics.checkNotNull(message);
        this.localMessages.updateState(localMessageId, threadId, InboxMessageType.LocalMessage.State.RESENDING);
        InboxMessageType.LocalMessage.RequestData requestData = message.getRequestData();
        if (requestData instanceof InboxMessageType.LocalMessage.RequestData.Text) {
            return submitMessageInternal(threadId, message);
        }
        if (requestData instanceof InboxMessageType.LocalMessage.RequestData.Response) {
            return submitResponseInternal(threadId, message);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void clearSentLocalMessages(String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        FlowKt.launchIn(FlowKt.onEach(FlowKt.transformLatest(FlowKt.take(this.localMessages.streamLocalMessages(threadId), 1), new C33890xc4c7d048(null, this, threadId)), new C338922(threadId, null)), getStoreScope());
    }

    /* compiled from: InboxMessageStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "localMessagesToRemove", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$2", m3645f = "InboxMessageStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$2 */
    static final class C338922 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $threadId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C338922(String str, Continuation<? super C338922> continuation) {
            super(2, continuation);
            this.$threadId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C338922 c338922 = InboxMessageStore.this.new C338922(this.$threadId, continuation);
            c338922.L$0 = obj;
            return c338922;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super Unit> continuation) {
            return invoke2((List<UUID>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<UUID> list, Continuation<? super Unit> continuation) {
            return ((C338922) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InboxMessageStore.this.localMessages.removeAll((List) this.L$0, this.$threadId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final Completable submitMessageInternal(final String threadId, final InboxMessageType.LocalMessage localMessage) {
        InboxMessageType.LocalMessage.RequestData requestData = localMessage.getRequestData();
        Intrinsics.checkNotNull(requestData, "null cannot be cast to non-null type com.robinhood.models.db.InboxMessageType.LocalMessage.RequestData.Text");
        Observable observableRefCount = RxFactory.DefaultImpls.rxSingle$default(this, null, new InboxMessageStore7(this, threadId, (InboxMessageType.LocalMessage.RequestData.Text) requestData, null), 1, null).toObservable().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        ScopedSubscriptionKt.subscribeIn$default(ObservablesAndroid.observeOnMainThread(observableRefCount), getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InboxMessageStore.submitMessageInternal$lambda$5(this.f$0, localMessage, threadId, (ApiMessage) obj);
            }
        }, new Function1() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InboxMessageStore.submitMessageInternal$lambda$6(this.f$0, localMessage, threadId, (Throwable) obj);
            }
        }, (Function0) null, 8, (Object) null);
        Completable completableIgnoreElements = observableRefCount.ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "ignoreElements(...)");
        return completableIgnoreElements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitMessageInternal$lambda$5(InboxMessageStore inboxMessageStore, InboxMessageType.LocalMessage localMessage, String str, ApiMessage apiMessage) {
        inboxMessageStore.localMessages.onLocalMessageSent(localMessage.getId(), str, apiMessage.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitMessageInternal$lambda$6(InboxMessageStore inboxMessageStore, InboxMessageType.LocalMessage localMessage, String str, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        inboxMessageStore.localMessages.updateState(localMessage.getId(), str, InboxMessageType.LocalMessage.State.FAILED);
        return Unit.INSTANCE;
    }

    private final Completable submitResponseInternal(final String threadId, final InboxMessageType.LocalMessage localMessage) {
        InboxMessageType.LocalMessage.RequestData requestData = localMessage.getRequestData();
        Intrinsics.checkNotNull(requestData, "null cannot be cast to non-null type com.robinhood.models.db.InboxMessageType.LocalMessage.RequestData.Response");
        Observable observableRefCount = RxFactory.DefaultImpls.rxSingle$default(this, null, new InboxMessageStore8(this, threadId, (InboxMessageType.LocalMessage.RequestData.Response) requestData, null), 1, null).toObservable().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        ScopedSubscriptionKt.subscribeIn$default(ObservablesAndroid.observeOnMainThread(observableRefCount), getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InboxMessageStore.submitResponseInternal$lambda$7(this.f$0, localMessage, threadId, (ApiMessage) obj);
            }
        }, new Function1() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InboxMessageStore.submitResponseInternal$lambda$8(this.f$0, localMessage, threadId, (Throwable) obj);
            }
        }, (Function0) null, 8, (Object) null);
        Completable completableIgnoreElements = observableRefCount.ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "ignoreElements(...)");
        return completableIgnoreElements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitResponseInternal$lambda$7(InboxMessageStore inboxMessageStore, InboxMessageType.LocalMessage localMessage, String str, ApiMessage apiMessage) {
        inboxMessageStore.localMessages.onLocalMessageSent(localMessage.getId(), str, apiMessage.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitResponseInternal$lambda$8(InboxMessageStore inboxMessageStore, InboxMessageType.LocalMessage localMessage, String str, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        inboxMessageStore.localMessages.updateState(localMessage.getId(), str, InboxMessageType.LocalMessage.State.FAILED);
        return Unit.INSTANCE;
    }

    /* compiled from: InboxMessageStore.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u001c\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007J\u001e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cJ8\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b*\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002R,\u0010\u0004\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InboxMessageStore$LocalMessages;", "", "<init>", "()V", "localMessagesFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/InboxMessageType$LocalMessage;", "streamLocalMessages", "Lkotlinx/coroutines/flow/Flow;", "", "threadId", "add", "", "localMessage", "hasMessage", "", "id", "getMessage", "removeAll", "ids", "onLocalMessageSent", "serverMessageId", "updateState", "state", "Lcom/robinhood/models/db/InboxMessageType$LocalMessage$State;", "messagesForThread", "lib-store-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class LocalMessages {
        private final StateFlow2<Map<String, Map<UUID, InboxMessageType.LocalMessage>>> localMessagesFlow = StateFlow4.MutableStateFlow(MapsKt.emptyMap());

        public final Flow<List<InboxMessageType.LocalMessage>> streamLocalMessages(final String threadId) {
            Intrinsics.checkNotNullParameter(threadId, "threadId");
            final StateFlow2<Map<String, Map<UUID, InboxMessageType.LocalMessage>>> stateFlow2 = this.localMessagesFlow;
            return new Flow<List<? extends InboxMessageType.LocalMessage>>() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends InboxMessageType.LocalMessage>> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, threadId), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ String $threadId$inlined;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$$inlined$map$1$2", m3645f = "InboxMessageStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, String str) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$threadId$inlined = str;
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
                            Object linkedHashMap = ((Map) obj).get(this.$threadId$inlined);
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            List listSortedWith = CollectionsKt.sortedWith(CollectionsKt.toList(((Map) linkedHashMap).values()), 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0058: INVOKE (r5v9 'listSortedWith' java.util.List) = 
                                  (wrap:java.util.List:0x004d: INVOKE 
                                  (wrap:java.util.Collection:0x0047: INVOKE (wrap:java.util.Map:0x0045: CHECK_CAST (java.util.Map) (r5v3 'linkedHashMap' java.lang.Object)) INTERFACE call: java.util.Map.values():java.util.Collection A[MD:():java.util.Collection<V> (c), WRAPPED] (LINE:54))
                                 STATIC call: kotlin.collections.CollectionsKt.toList(java.lang.Iterable):java.util.List A[MD:<T>:(java.lang.Iterable<? extends T>):java.util.List<T> (m), WRAPPED] (LINE:55))
                                  (wrap:java.util.Comparator:0x0055: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1068) call: com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$lambda$2$$inlined$sortedByDescending$1.<init>():void type: CONSTRUCTOR)
                                 STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:1068) in method: com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes13.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$lambda$2$$inlined$sortedByDescending$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 21 more
                                */
                            /*
                                this = this;
                                boolean r0 = r6 instanceof com.robinhood.librobinhood.data.store.C33888xda7fbdea.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$$inlined$map$1$2$1 r0 = (com.robinhood.librobinhood.data.store.C33888xda7fbdea.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$$inlined$map$1$2$1 r0 = new com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.ResultKt.throwOnFailure(r6)
                                goto L65
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.ResultKt.throwOnFailure(r6)
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                                java.util.Map r5 = (java.util.Map) r5
                                java.lang.String r2 = r4.$threadId$inlined
                                java.lang.Object r5 = r5.get(r2)
                                if (r5 != 0) goto L45
                                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                                r5.<init>()
                            L45:
                                java.util.Map r5 = (java.util.Map) r5
                                java.util.Collection r5 = r5.values()
                                java.lang.Iterable r5 = (java.lang.Iterable) r5
                                java.util.List r5 = kotlin.collections.CollectionsKt.toList(r5)
                                java.lang.Iterable r5 = (java.lang.Iterable) r5
                                com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$lambda$2$$inlined$sortedByDescending$1 r2 = new com.robinhood.librobinhood.data.store.InboxMessageStore$LocalMessages$streamLocalMessages$lambda$2$$inlined$sortedByDescending$1
                                r2.<init>()
                                java.util.List r5 = kotlin.collections.CollectionsKt.sortedWith(r5, r2)
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L65
                                return r1
                            L65:
                                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.librobinhood.data.store.C33888xda7fbdea.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }
                };
            }

            public final void add(InboxMessageType.LocalMessage localMessage) {
                Map<String, Map<UUID, InboxMessageType.LocalMessage>> value;
                Map<String, Map<UUID, InboxMessageType.LocalMessage>> mutableMap;
                Intrinsics.checkNotNullParameter(localMessage, "localMessage");
                StateFlow2<Map<String, Map<UUID, InboxMessageType.LocalMessage>>> stateFlow2 = this.localMessagesFlow;
                do {
                    value = stateFlow2.getValue();
                    UUID id = localMessage.getId();
                    String threadId = localMessage.getThreadId();
                    mutableMap = MapsKt.toMutableMap(value);
                    messagesForThread(mutableMap, threadId).put(id, localMessage);
                } while (!stateFlow2.compareAndSet(value, mutableMap));
            }

            public final boolean hasMessage(UUID id, String threadId) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(threadId, "threadId");
                return getMessage(id, threadId) != null;
            }

            public final InboxMessageType.LocalMessage getMessage(UUID id, String threadId) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(threadId, "threadId");
                return this.localMessagesFlow.getValue().getOrDefault(threadId, MapsKt.emptyMap()).get(id);
            }

            public final void removeAll(List<UUID> ids, String threadId) {
                Map<String, Map<UUID, InboxMessageType.LocalMessage>> value;
                Map<String, Map<UUID, InboxMessageType.LocalMessage>> mutableMap;
                Intrinsics.checkNotNullParameter(ids, "ids");
                Intrinsics.checkNotNullParameter(threadId, "threadId");
                StateFlow2<Map<String, Map<UUID, InboxMessageType.LocalMessage>>> stateFlow2 = this.localMessagesFlow;
                do {
                    value = stateFlow2.getValue();
                    mutableMap = MapsKt.toMutableMap(value);
                    Map<UUID, InboxMessageType.LocalMessage> mapMessagesForThread = messagesForThread(mutableMap, threadId);
                    Iterator<UUID> it = ids.iterator();
                    while (it.hasNext()) {
                        mapMessagesForThread.remove(it.next());
                    }
                } while (!stateFlow2.compareAndSet(value, mutableMap));
            }

            public final void onLocalMessageSent(UUID id, String threadId, String serverMessageId) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(threadId, "threadId");
                String serverMessageId2 = serverMessageId;
                Intrinsics.checkNotNullParameter(serverMessageId2, "serverMessageId");
                StateFlow2<Map<String, Map<UUID, InboxMessageType.LocalMessage>>> stateFlow2 = this.localMessagesFlow;
                while (true) {
                    Map<String, Map<UUID, InboxMessageType.LocalMessage>> value = stateFlow2.getValue();
                    Map<String, Map<UUID, InboxMessageType.LocalMessage>> map = value;
                    Map<String, Map<UUID, InboxMessageType.LocalMessage>> mutableMap = MapsKt.toMutableMap(map);
                    Map<UUID, InboxMessageType.LocalMessage> mapMessagesForThread = messagesForThread(mutableMap, threadId);
                    InboxMessageType.LocalMessage localMessage = mapMessagesForThread.get(id);
                    if (localMessage != null) {
                        mapMessagesForThread.put(id, InboxMessageType.LocalMessage.copy$default(localMessage, null, null, serverMessageId2, null, null, InboxMessageType.LocalMessage.State.SENT, 27, null));
                        map = mutableMap;
                    }
                    if (stateFlow2.compareAndSet(value, map)) {
                        return;
                    } else {
                        serverMessageId2 = serverMessageId;
                    }
                }
            }

            public final void updateState(UUID id, String threadId, InboxMessageType.LocalMessage.State state) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(threadId, "threadId");
                InboxMessageType.LocalMessage.State state2 = state;
                Intrinsics.checkNotNullParameter(state2, "state");
                StateFlow2<Map<String, Map<UUID, InboxMessageType.LocalMessage>>> stateFlow2 = this.localMessagesFlow;
                while (true) {
                    Map<String, Map<UUID, InboxMessageType.LocalMessage>> value = stateFlow2.getValue();
                    Map<String, Map<UUID, InboxMessageType.LocalMessage>> map = value;
                    Map<String, Map<UUID, InboxMessageType.LocalMessage>> mutableMap = MapsKt.toMutableMap(map);
                    Map<UUID, InboxMessageType.LocalMessage> mapMessagesForThread = messagesForThread(mutableMap, threadId);
                    InboxMessageType.LocalMessage localMessage = mapMessagesForThread.get(id);
                    if (localMessage != null) {
                        mapMessagesForThread.put(id, InboxMessageType.LocalMessage.copy$default(localMessage, null, null, null, null, null, state2, 31, null));
                        map = mutableMap;
                    }
                    if (stateFlow2.compareAndSet(value, map)) {
                        return;
                    } else {
                        state2 = state;
                    }
                }
            }

            private final Map<UUID, InboxMessageType.LocalMessage> messagesForThread(Map<String, Map<UUID, InboxMessageType.LocalMessage>> map, String str) {
                Map<UUID, InboxMessageType.LocalMessage> linkedHashMap = map.get(str);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    map.put(str, linkedHashMap);
                }
                return linkedHashMap;
            }
        }
    }
