package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.api.retrofit.Midlands;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.ApiToggleThreadNotificationSettingRequest;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ThreadNotificationSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u00150\u000fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ \u0010 \u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010!\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ThreadNotificationSettingsStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "midlands", "Lcom/robinhood/api/retrofit/Midlands;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/api/retrofit/Midlands;)V", "threadsSettingsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/librobinhood/data/store/ThreadsSettings;", "kotlin.jvm.PlatformType", "streamThreadNotificationStatus", "Lio/reactivex/Observable;", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "Lcom/robinhood/librobinhood/data/store/ThreadSettingsItem;", "threadId", "", "streamMutedThreadSettings", "", "refreshThreadNotificationStatus", "Lio/reactivex/Completable;", "refreshMutedThreadSettingsItems", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateThreadNotificationStatus", "threadSettingId", "isMuted", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateThreadSettingsWithThreadId", "threadSettingsItem", "lib-store-notifications_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ThreadNotificationSettingsStore extends Store {
    private final Brokeback brokeback;
    private final Midlands midlands;
    private final BehaviorRelay<ThreadsSettings> threadsSettingsRelay;

    /* compiled from: ThreadNotificationSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore", m3645f = "ThreadNotificationSettingsStore.kt", m3646l = {54}, m3647m = "refreshMutedThreadSettingsItems")
    /* renamed from: com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore$refreshMutedThreadSettingsItems$1 */
    static final class C343671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C343671(Continuation<? super C343671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThreadNotificationSettingsStore.this.refreshMutedThreadSettingsItems(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadNotificationSettingsStore(StoreBundle storeBundle, Brokeback brokeback, Midlands midlands) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(midlands, "midlands");
        this.brokeback = brokeback;
        this.midlands = midlands;
        BehaviorRelay<ThreadsSettings> behaviorRelayCreateDefault = BehaviorRelay.createDefault(new ThreadsSettings(null, null, null, 7, null));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.threadsSettingsRelay = behaviorRelayCreateDefault;
    }

    public final Observable<ApiNotificationThreadSettingsItem> streamThreadNotificationStatus(final String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Observable<R> map = this.threadsSettingsRelay.map(new Function() { // from class: com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore$streamThreadNotificationStatus$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((ThreadsSettings) it).getThreadSettingsWithThreadId(threadId));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C34366xf3e3d0e6<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ObservablesKt.filterIsPresent(map);
    }

    public final Observable<List<ApiNotificationThreadSettingsItem>> streamMutedThreadSettings() {
        Observable<R> map = this.threadsSettingsRelay.map(new Function() { // from class: com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore$streamMutedThreadSettings$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((ThreadsSettings) it).getMutedThreadSettings());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C34365xf2578d41<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ObservablesKt.filterIsPresent(map);
    }

    public final Completable refreshThreadNotificationStatus(final String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        ThreadsSettings value = this.threadsSettingsRelay.getValue();
        Intrinsics.checkNotNull(value);
        if (value.getThreadSettingsWithThreadId(threadId) != null) {
            Completable completableComplete = Completable.complete();
            Intrinsics.checkNotNull(completableComplete);
            return completableComplete;
        }
        Completable completableIgnoreElement = SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(this, null, new C343681(threadId, null), 1, null)).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore.refreshThreadNotificationStatus.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem) {
                ThreadNotificationSettingsStore.this.updateThreadSettingsWithThreadId(threadId, apiNotificationThreadSettingsItem);
            }
        }).subscribeOn(Schedulers.m3346io()).ignoreElement();
        Intrinsics.checkNotNull(completableIgnoreElement);
        return completableIgnoreElement;
    }

    /* compiled from: ThreadNotificationSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore$refreshThreadNotificationStatus$1", m3645f = "ThreadNotificationSettingsStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.ThreadNotificationSettingsStore$refreshThreadNotificationStatus$1 */
    static final class C343681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNotificationThreadSettingsItem>, Object> {
        final /* synthetic */ String $threadId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343681(String str, Continuation<? super C343681> continuation) {
            super(2, continuation);
            this.$threadId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThreadNotificationSettingsStore.this.new C343681(this.$threadId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNotificationThreadSettingsItem> continuation) {
            return ((C343681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Brokeback brokeback = ThreadNotificationSettingsStore.this.brokeback;
            String str = this.$threadId;
            this.label = 1;
            Object threadNotificationSettings = brokeback.getThreadNotificationSettings(str, this);
            return threadNotificationSettings == coroutine_suspended ? coroutine_suspended : threadNotificationSettings;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshMutedThreadSettingsItems(Continuation<? super Unit> continuation) {
        C343671 c343671;
        if (continuation instanceof C343671) {
            c343671 = (C343671) continuation;
            int i = c343671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343671.label = i - Integer.MIN_VALUE;
            } else {
                c343671 = new C343671(continuation);
            }
        }
        Object threadSettingsItems = c343671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(threadSettingsItems);
            Midlands midlands = this.midlands;
            c343671.label = 1;
            threadSettingsItems = midlands.getThreadSettingsItems(c343671);
            if (threadSettingsItems == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(threadSettingsItems);
        }
        BehaviorRelay<ThreadsSettings> behaviorRelay = this.threadsSettingsRelay;
        ThreadsSettings value = behaviorRelay.getValue();
        Intrinsics.checkNotNull(value);
        behaviorRelay.accept(value.copyAndUpdateMutedThreadSettings((List) threadSettingsItems));
        return Unit.INSTANCE;
    }

    public final Object updateThreadNotificationStatus(String str, boolean z, Continuation<? super Unit> continuation) {
        BehaviorRelay<ThreadsSettings> behaviorRelay = this.threadsSettingsRelay;
        ThreadsSettings value = behaviorRelay.getValue();
        Intrinsics.checkNotNull(value);
        behaviorRelay.accept(value.copyAndUpdateThreadSettingsStatus(str, z));
        Object obj = this.midlands.toggleThreadNotificationsSettings(str, new ApiToggleThreadNotificationSettingRequest(z), continuation);
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateThreadSettingsWithThreadId(String threadId, ApiNotificationThreadSettingsItem threadSettingsItem) {
        if (threadSettingsItem == null) {
            return;
        }
        BehaviorRelay<ThreadsSettings> behaviorRelay = this.threadsSettingsRelay;
        ThreadsSettings value = behaviorRelay.getValue();
        Intrinsics.checkNotNull(value);
        behaviorRelay.accept(value.copyAndUpdateSettingsWithThreadId(threadId, threadSettingsItem));
    }
}
