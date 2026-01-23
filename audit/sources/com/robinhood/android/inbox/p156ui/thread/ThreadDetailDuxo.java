package com.robinhood.android.inbox.p156ui.thread;

import android.graphics.Bitmap;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailEvent;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InboxMessageStore;
import com.robinhood.librobinhood.data.store.InboxThreadStore;
import com.robinhood.librobinhood.data.store.InboxUserInputStore;
import com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore;
import com.robinhood.models.api.ApiMessageResult;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.models.api.media.ApiMediaMetadata;
import com.robinhood.models.p320db.InboxThread;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.common.store.media.MediaStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.Maybes2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.http.BackendPoll;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ThreadDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001>BQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0016J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001aJ\u001e\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(J\u0016\u0010*\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020 J\u000e\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u001aJ\u0014\u00103\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u00020)0(J\u000e\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020)J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020)H\u0002J\b\u0010;\u001a\u00020 H\u0002J\b\u0010<\u001a\u00020 H\u0002J\b\u0010=\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailViewState;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "inboxMessageStore", "Lcom/robinhood/librobinhood/data/store/InboxMessageStore;", "inboxThreadStore", "Lcom/robinhood/librobinhood/data/store/InboxThreadStore;", "inboxUserInputStore", "Lcom/robinhood/librobinhood/data/store/InboxUserInputStore;", "mediaStore", "Lcom/robinhood/shared/common/store/media/MediaStore;", "threadNotificationSettingsStore", "Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InboxMessageStore;Lcom/robinhood/librobinhood/data/store/InboxThreadStore;Lcom/robinhood/librobinhood/data/store/InboxUserInputStore;Lcom/robinhood/shared/common/store/media/MediaStore;Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/inbox/ui/thread/ThreadDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "threadId", "", "getThreadId", "()Ljava/lang/String;", "setThreadId", "(Ljava/lang/String;)V", "onCreate", "", "onResume", "onPause", "fetchPreviousMessages", "messageId", "submitMessage", "text", "imagesToSend", "", "Landroid/graphics/Bitmap;", "retryMessage", "localMessageId", "Ljava/util/UUID;", "submitResponse", "response", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Response;", "markThreadAsRead", "saveUserInput", "input", "addImagesToSend", "images", "removeImageToSend", "image", "uploadMedia", "Lio/reactivex/Maybe;", "Lcom/robinhood/models/api/media/ApiMediaMetadata;", "bitmap", "fetchLatestMessages", "pollLatestMessages", "requireThreadId", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ThreadDetailDuxo extends BaseDuxo3<ThreadDetailDataState, ThreadDetailViewState, ThreadDetailEvent> {
    private static final long DEFAULT_MESSAGE_POLL_INTERVAL = 5;
    private final ExperimentsStore experimentsStore;
    private final InboxMessageStore inboxMessageStore;
    private final InboxThreadStore inboxThreadStore;
    private final InboxUserInputStore inboxUserInputStore;
    private final MediaStore mediaStore;
    private String threadId;
    private final ThreadNotificationSettingsStore threadNotificationSettingsStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadDetailDuxo(ExperimentsStore experimentsStore, InboxMessageStore inboxMessageStore, InboxThreadStore inboxThreadStore, InboxUserInputStore inboxUserInputStore, MediaStore mediaStore, ThreadNotificationSettingsStore threadNotificationSettingsStore, UserStore userStore, ThreadDetailStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new ThreadDetailDataState(null, null, null, false, null, false, false, false, null, null, null, 2047, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(inboxMessageStore, "inboxMessageStore");
        Intrinsics.checkNotNullParameter(inboxThreadStore, "inboxThreadStore");
        Intrinsics.checkNotNullParameter(inboxUserInputStore, "inboxUserInputStore");
        Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
        Intrinsics.checkNotNullParameter(threadNotificationSettingsStore, "threadNotificationSettingsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.inboxMessageStore = inboxMessageStore;
        this.inboxThreadStore = inboxThreadStore;
        this.inboxUserInputStore = inboxUserInputStore;
        this.mediaStore = mediaStore;
        this.threadNotificationSettingsStore = threadNotificationSettingsStore;
        this.userStore = userStore;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final void setThreadId(String str) {
        this.threadId = str;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable observableTake = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.INBOX_MEDIA_UPLOAD.INSTANCE}, false, null, 6, null).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.onCreate$lambda$0(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.onCreate$lambda$1(this.f$0, (User) obj);
            }
        });
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.threadNotificationSettingsStore.streamThreadNotificationStatus(requireThreadId()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.onCreate$lambda$2(this.f$0, (ApiNotificationThreadSettingsItem) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.onCreate$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(ThreadDetailDuxo threadDetailDuxo, Boolean bool) {
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$onCreate$1$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(ThreadDetailDuxo threadDetailDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$onCreate$2$1(user, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(ThreadDetailDuxo threadDetailDuxo, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem) {
        Intrinsics.checkNotNullParameter(apiNotificationThreadSettingsItem, "apiNotificationThreadSettingsItem");
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$onCreate$3$1(apiNotificationThreadSettingsItem, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(ThreadDetailDuxo threadDetailDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        threadDetailDuxo.submit(new ThreadDetailEvent.NotificationSettingError(throwable));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        final String strRequireThreadId = requireThreadId();
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, this.inboxThreadStore.pollThread(strRequireThreadId), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable<InboxThread> observableRefCount = this.inboxThreadStore.streamThread(strRequireThreadId).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Completable completableFlatMapCompletable = observableRefCount.firstOrError().flatMapCompletable(new Function() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(InboxThread inboxThread) {
                Intrinsics.checkNotNullParameter(inboxThread, "inboxThread");
                if (inboxThread.getOptions().getHasSettings()) {
                    return Completables.ignoreNetworkExceptions(ThreadDetailDuxo.this.threadNotificationSettingsStore.refreshThreadNotificationStatus(strRequireThreadId));
                }
                return Completable.complete();
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableFlatMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.onResume$lambda$4(this.f$0, (InboxThread) obj);
            }
        });
        pollLatestMessages();
        LifecycleHost.DefaultImpls.bind$default(this, this.inboxMessageStore.streamMessages(strRequireThreadId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.onResume$lambda$5(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.inboxMessageStore.streamLocalMessages(strRequireThreadId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.onResume$lambda$6(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.inboxUserInputStore.getSavedInput(strRequireThreadId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.onResume$lambda$7(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(ThreadDetailDuxo threadDetailDuxo, InboxThread inboxThread) {
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$onResume$2$1(inboxThread, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(ThreadDetailDuxo threadDetailDuxo, List messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$onResume$3$1(messages, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(ThreadDetailDuxo threadDetailDuxo, List localMessages) {
        Intrinsics.checkNotNullParameter(localMessages, "localMessages");
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$onResume$4$1(localMessages, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(ThreadDetailDuxo threadDetailDuxo, String savedUserInput) {
        Intrinsics.checkNotNullParameter(savedUserInput, "savedUserInput");
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$onResume$5$1(savedUserInput, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onPause() {
        super.onPause();
        this.inboxMessageStore.clearSentLocalMessages(requireThreadId());
    }

    /* compiled from: ThreadDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$fetchPreviousMessages$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$fetchPreviousMessages$1 */
    static final class C187601 extends ContinuationImpl7 implements Function2<ThreadDetailDataState, Continuation<? super ThreadDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C187601(Continuation<? super C187601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187601 c187601 = new C187601(continuation);
            c187601.L$0 = obj;
            return c187601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThreadDetailDataState threadDetailDataState, Continuation<? super ThreadDetailDataState> continuation) {
            return ((C187601) create(threadDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ThreadDetailDataState.copy$default((ThreadDetailDataState) this.L$0, null, null, null, false, null, false, true, false, null, null, null, 1983, null);
        }
    }

    public final void fetchPreviousMessages(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        applyMutation(new C187601(null));
        LifecycleHost.DefaultImpls.bind$default(this, Maybes2.ignoreNetworkExceptions(this.inboxMessageStore.fetchMessages(requireThreadId(), messageId, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.fetchPreviousMessages$lambda$8(this.f$0, (ApiMessageResult) obj);
            }
        }, RxErrorCheckpoint.HANDLER_UNHANDLED, new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadDetailDuxo.fetchPreviousMessages$lambda$9(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchPreviousMessages$lambda$8(ThreadDetailDuxo threadDetailDuxo, ApiMessageResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResults().isEmpty()) {
            threadDetailDuxo.applyMutation(new ThreadDetailDuxo$fetchPreviousMessages$2$1(null));
        }
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$fetchPreviousMessages$2$2(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchPreviousMessages$lambda$9(ThreadDetailDuxo threadDetailDuxo) {
        threadDetailDuxo.applyMutation(new ThreadDetailDuxo$fetchPreviousMessages$3$1(null));
        return Unit.INSTANCE;
    }

    public final void submitMessage(final String text, List<Bitmap> imagesToSend) {
        Maybe maybeJust;
        Intrinsics.checkNotNullParameter(imagesToSend, "imagesToSend");
        final String strRequireThreadId = requireThreadId();
        Bitmap bitmap = (Bitmap) CollectionsKt.firstOrNull((List) imagesToSend);
        if (bitmap != null) {
            maybeJust = uploadMedia(bitmap).map(new Function() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$submitMessage$uploadObs$1
                @Override // io.reactivex.functions.Function
                public final Optional<ApiMediaMetadata> apply(ApiMediaMetadata it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(it);
                }
            });
            Intrinsics.checkNotNull(maybeJust);
        } else {
            maybeJust = Maybe.just(Optional2.INSTANCE);
            Intrinsics.checkNotNull(maybeJust);
        }
        Maybe map = maybeJust.map(new Function() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo.submitMessage.1
            @Override // io.reactivex.functions.Function
            public final Maybe<Unit> apply(Optional<ApiMediaMetadata> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                ApiMediaMetadata apiMediaMetadataComponent1 = optional.component1();
                return ThreadDetailDuxo.this.inboxMessageStore.submitMessage(strRequireThreadId, text, apiMediaMetadataComponent1 != null ? apiMediaMetadataComponent1.getId() : null).toMaybe().defaultIfEmpty(Unit.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        bind(Maybes2.ignoreNetworkExceptions(map), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.submitMessage$lambda$10(this.f$0, strRequireThreadId, (Maybe) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailDuxo.submitMessage$lambda$11((Throwable) obj);
            }
        }, new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitMessage$lambda$10(ThreadDetailDuxo threadDetailDuxo, String str, Maybe maybe) {
        threadDetailDuxo.submit(ThreadDetailEvent.ClearInputEvent.INSTANCE);
        threadDetailDuxo.fetchLatestMessages();
        threadDetailDuxo.inboxThreadStore.refreshThread(str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitMessage$lambda$11(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void retryMessage(String threadId, UUID localMessageId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Intrinsics.checkNotNullParameter(localMessageId, "localMessageId");
        bind(Completables.ignoreNetworkExceptions(this.inboxMessageStore.retryMessage(threadId, localMessageId)), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    public final void submitResponse(ThreadDetailViewState4.Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        final String strRequireThreadId = requireThreadId();
        UUID localId = response.getLocalId();
        if (this.inboxMessageStore.hasSubmittedResponse(strRequireThreadId, localId)) {
            return;
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.INBOX_THREAD_RESPONSE, true);
        Completable completableDelay = this.inboxMessageStore.submitResponse(strRequireThreadId, response.getMessageId(), response.getAnswer(), response.getText().toString(), localId).delay(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(completableDelay, "delay(...)");
        bind(CompletablesAndroid.observeOnMainThread(Completables.ignoreNetworkExceptions(completableDelay)), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadDetailDuxo.submitResponse$lambda$13(this.f$0, strRequireThreadId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitResponse$lambda$13(ThreadDetailDuxo threadDetailDuxo, String str) {
        threadDetailDuxo.fetchLatestMessages();
        threadDetailDuxo.inboxThreadStore.refreshThread(str, true);
        IdlingResourceCounters2.setBusy(IdlingResourceType.INBOX_THREAD_RESPONSE, false);
        return Unit.INSTANCE;
    }

    /* compiled from: ThreadDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$markThreadAsRead$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$markThreadAsRead$1 */
    static final class C187611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C187611(Continuation<? super C187611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThreadDetailDuxo.this.new C187611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InboxThreadStore inboxThreadStore = ThreadDetailDuxo.this.inboxThreadStore;
                List<String> listListOf = CollectionsKt.listOf(ThreadDetailDuxo.this.requireThreadId());
                this.label = 1;
                if (inboxThreadStore.markThreadsAsRead(listListOf, this) == coroutine_suspended) {
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

    public final void markThreadAsRead() {
        Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C187611(null), 1, null).onErrorComplete();
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "onErrorComplete(...)");
        bind(completableOnErrorComplete, LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    public final void saveUserInput(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.inboxUserInputStore.saveInput(requireThreadId(), input);
    }

    /* compiled from: ThreadDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$addImagesToSend$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$addImagesToSend$1 */
    static final class C187581 extends ContinuationImpl7 implements Function2<ThreadDetailDataState, Continuation<? super ThreadDetailDataState>, Object> {
        final /* synthetic */ List<Bitmap> $images;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187581(List<Bitmap> list, Continuation<? super C187581> continuation) {
            super(2, continuation);
            this.$images = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187581 c187581 = new C187581(this.$images, continuation);
            c187581.L$0 = obj;
            return c187581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThreadDetailDataState threadDetailDataState, Continuation<? super ThreadDetailDataState> continuation) {
            return ((C187581) create(threadDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ThreadDetailDataState threadDetailDataState = (ThreadDetailDataState) this.L$0;
            return ThreadDetailDataState.copy$default(threadDetailDataState, null, null, null, false, null, false, false, false, null, null, CollectionsKt.plus((Collection) threadDetailDataState.getImagesToSend(), (Iterable) this.$images), 1023, null);
        }
    }

    public final void addImagesToSend(List<Bitmap> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        applyMutation(new C187581(images, null));
    }

    /* compiled from: ThreadDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$removeImageToSend$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$removeImageToSend$1 */
    static final class C187631 extends ContinuationImpl7 implements Function2<ThreadDetailDataState, Continuation<? super ThreadDetailDataState>, Object> {
        final /* synthetic */ Bitmap $image;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187631(Bitmap bitmap, Continuation<? super C187631> continuation) {
            super(2, continuation);
            this.$image = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187631 c187631 = new C187631(this.$image, continuation);
            c187631.L$0 = obj;
            return c187631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThreadDetailDataState threadDetailDataState, Continuation<? super ThreadDetailDataState> continuation) {
            return ((C187631) create(threadDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ThreadDetailDataState threadDetailDataState = (ThreadDetailDataState) this.L$0;
            return ThreadDetailDataState.copy$default(threadDetailDataState, null, null, null, false, null, false, false, false, null, null, CollectionsKt.minus(threadDetailDataState.getImagesToSend(), this.$image), 1023, null);
        }
    }

    public final void removeImageToSend(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        applyMutation(new C187631(image, null));
    }

    /* compiled from: ThreadDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/media/ApiMediaMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$uploadMedia$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$uploadMedia$1 */
    static final class C187651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMediaMetadata>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187651(Bitmap bitmap, Continuation<? super C187651> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThreadDetailDuxo.this.new C187651(this.$bitmap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMediaMetadata> continuation) {
            return ((C187651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MediaStore mediaStore = ThreadDetailDuxo.this.mediaStore;
            Bitmap bitmap = this.$bitmap;
            this.label = 1;
            Object objUploadImage = mediaStore.uploadImage(bitmap, this);
            return objUploadImage == coroutine_suspended ? coroutine_suspended : objUploadImage;
        }
    }

    private final Maybe<ApiMediaMetadata> uploadMedia(final Bitmap bitmap) {
        Maybe<ApiMediaMetadata> maybeOnErrorResumeNext = RxFactory.DefaultImpls.rxSingle$default(this, null, new C187651(bitmap, null), 1, null).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo.uploadMedia.2

            /* compiled from: ThreadDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$uploadMedia$2$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$uploadMedia$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ThreadDetailDataState, Continuation<? super ThreadDetailDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ThreadDetailDataState threadDetailDataState, Continuation<? super ThreadDetailDataState> continuation) {
                    return ((AnonymousClass1) create(threadDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ThreadDetailDataState.copy$default((ThreadDetailDataState) this.L$0, null, null, null, false, null, false, false, true, null, null, null, 1919, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                ThreadDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doOnSuccess(new Consumer() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo.uploadMedia.3

            /* compiled from: ThreadDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$uploadMedia$3$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$uploadMedia$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ThreadDetailDataState, Continuation<? super ThreadDetailDataState>, Object> {
                final /* synthetic */ Bitmap $bitmap;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Bitmap bitmap, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$bitmap = bitmap;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bitmap, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ThreadDetailDataState threadDetailDataState, Continuation<? super ThreadDetailDataState> continuation) {
                    return ((AnonymousClass1) create(threadDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ThreadDetailDataState threadDetailDataState = (ThreadDetailDataState) this.L$0;
                    return ThreadDetailDataState.copy$default(threadDetailDataState, null, null, null, false, null, false, false, false, null, null, CollectionsKt.minus(threadDetailDataState.getImagesToSend(), this.$bitmap), 895, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiMediaMetadata apiMediaMetadata) {
                ThreadDetailDuxo.this.applyMutation(new AnonymousClass1(bitmap, null));
            }
        }).toMaybe().onErrorResumeNext(new Function() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo.uploadMedia.4

            /* compiled from: ThreadDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$uploadMedia$4$1", m3645f = "ThreadDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo$uploadMedia$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ThreadDetailDataState, Continuation<? super ThreadDetailDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ThreadDetailDataState threadDetailDataState, Continuation<? super ThreadDetailDataState> continuation) {
                    return ((AnonymousClass1) create(threadDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ThreadDetailDataState.copy$default((ThreadDetailDataState) this.L$0, null, null, null, false, null, false, false, false, null, null, null, 1919, null);
                }
            }

            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends ApiMediaMetadata> apply(Throwable t) throws Throwable {
                Intrinsics.checkNotNullParameter(t, "t");
                if (Throwables.isNetworkRelated(t)) {
                    ThreadDetailDuxo.this.applyMutation(new AnonymousClass1(null));
                    ThreadDetailDuxo.this.submit(new ThreadDetailEvent.UploadMediaError(t));
                    return Maybe.empty();
                }
                throw t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeOnErrorResumeNext, "onErrorResumeNext(...)");
        return maybeOnErrorResumeNext;
    }

    private final void fetchLatestMessages() {
        IdlingResourceCounters2.setBusy(IdlingResourceType.INBOX_THREAD_FETCH_LATEST_MESSAGES, true);
        Observable observableDoFinally = ObservablesKt.ignoreNetworkExceptions(this.inboxMessageStore.fetchNewMessages(requireThreadId())).doFinally(new Action() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailDuxo.fetchLatestMessages.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.setBusy(IdlingResourceType.INBOX_THREAD_FETCH_LATEST_MESSAGES, false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        ScopedObservable.subscribe$default(bind(observableDoFinally, LifecycleEvent.ON_DESTROY), null, null, null, 7, null);
    }

    private final void pollLatestMessages() {
        Observable<R> observableCompose = this.inboxMessageStore.fetchNewMessagesResponse(requireThreadId()).compose(new BackendPoll(5L, false, true));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableCompose, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String requireThreadId() {
        String str = this.threadId;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
