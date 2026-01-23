package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.api.retrofit.Midlands;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiNotificationChannel;
import com.robinhood.models.api.ApiNotificationSettings;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.api.SelectNotificationSettingsRequest;
import com.robinhood.models.api.ToggleNotificationSettingsRequest;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: NotificationSettingStore.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\u000bJ$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u000bJ\u0016\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010!JD\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0#2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0(H\u0086@¢\u0006\u0004\b)\u0010*J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015J\u0006\u0010,\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\b\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f \r*\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "Lcom/robinhood/store/Store;", "midlands", "Lcom/robinhood/api/retrofit/Midlands;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Midlands;Lcom/robinhood/store/StoreBundle;)V", "notificationsRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/ApiNotificationSettings;", "kotlin.jvm.PlatformType", "fetchNotificationChannels", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamNotificationSettings", "Lio/reactivex/Observable;", "settingsId", "toggleNotificationSettings", "Lio/reactivex/Single;", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "itemId", "status", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "selectNotificationSettings", "", "values", "", "refreshNotifications", "Lio/reactivex/Completable;", "fetchNotificationItem", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toggleAndSelectNotificationSettings", "Lkotlin/Result;", "toggleItemId", "toggleStatus", "selectionItemId", "selectionValues", "", "toggleAndSelectNotificationSettings-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchIpoListNotificationStatus", "toggleOnIposListNotifications", "Companion", "lib-store-notifications_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class NotificationSettingStore extends Store {
    public static final String IPO_LIST_NOTIFICATION_ID_EMAIL = "email-ipos-ipo_updates";
    public static final String IPO_LIST_NOTIFICATION_ID_INBOX = "messages-ipos-ipo_updates";
    public static final String IPO_LIST_NOTIFICATION_ID_PUSH = "push-ipos-ipo_updates";
    private final Midlands midlands;
    private final PublishRelay<Tuples2<String, ApiNotificationSettings>> notificationsRelay;

    /* compiled from: NotificationSettingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.NotificationSettingStore", m3645f = "NotificationSettingStore.kt", m3646l = {30}, m3647m = "fetchNotificationChannels")
    /* renamed from: com.robinhood.librobinhood.data.store.NotificationSettingStore$fetchNotificationChannels$1 */
    /* loaded from: classes13.dex */
    static final class C339701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C339701(Continuation<? super C339701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationSettingStore.this.fetchNotificationChannels(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingStore(Midlands midlands, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(midlands, "midlands");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.midlands = midlands;
        PublishRelay<Tuples2<String, ApiNotificationSettings>> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.notificationsRelay = publishRelayCreate;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchNotificationChannels(Continuation<? super Map<String, String>> continuation) {
        C339701 c339701;
        if (continuation instanceof C339701) {
            c339701 = (C339701) continuation;
            int i = c339701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c339701.label = i - Integer.MIN_VALUE;
            } else {
                c339701 = new C339701(continuation);
            }
        }
        Object notificationChannels = c339701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c339701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(notificationChannels);
            Midlands midlands = this.midlands;
            c339701.label = 1;
            notificationChannels = midlands.getNotificationChannels(c339701);
            if (notificationChannels == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(notificationChannels);
        }
        List<ApiNotificationChannel> results = ((PaginatedResult) notificationChannels).getResults();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(results, 10)), 16));
        for (ApiNotificationChannel apiNotificationChannel : results) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(apiNotificationChannel.getChannel_id(), apiNotificationChannel.getChannel_name());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }

    public final Observable<ApiNotificationSettings> streamNotificationSettings(final String settingsId) {
        Intrinsics.checkNotNullParameter(settingsId, "settingsId");
        Observable<R> map = this.notificationsRelay.map(new Function() { // from class: com.robinhood.librobinhood.data.store.NotificationSettingStore$streamNotificationSettings$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Tuples2 tuples2 = (Tuples2) it;
                String str = (String) tuples2.component1();
                ApiNotificationSettings apiNotificationSettings = (ApiNotificationSettings) tuples2.component2();
                if (!Intrinsics.areEqual(str, settingsId)) {
                    apiNotificationSettings = null;
                }
                return Optional3.asOptional(apiNotificationSettings);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C33967xbf04387a<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ObservablesKt.filterIsPresent(map);
    }

    /* compiled from: NotificationSettingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.NotificationSettingStore$toggleNotificationSettings$1", m3645f = "NotificationSettingStore.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.NotificationSettingStore$toggleNotificationSettings$1 */
    /* loaded from: classes13.dex */
    static final class C339751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNotificationSettingsItem>, Object> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ ApiNotificationSettingsToggleSettingsItem.Status $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339751(String str, ApiNotificationSettingsToggleSettingsItem.Status status, Continuation<? super C339751> continuation) {
            super(2, continuation);
            this.$itemId = str;
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationSettingStore.this.new C339751(this.$itemId, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNotificationSettingsItem> continuation) {
            return ((C339751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Midlands midlands = NotificationSettingStore.this.midlands;
            String str = this.$itemId;
            ToggleNotificationSettingsRequest toggleNotificationSettingsRequest = new ToggleNotificationSettingsRequest(this.$status);
            this.label = 1;
            Object obj2 = midlands.toggleNotificationSettings(str, toggleNotificationSettingsRequest, this);
            return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
        }
    }

    public final Single<ApiNotificationSettingsItem> toggleNotificationSettings(final String settingsId, String itemId, ApiNotificationSettingsToggleSettingsItem.Status status) {
        Intrinsics.checkNotNullParameter(settingsId, "settingsId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(status, "status");
        Single<ApiNotificationSettingsItem> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C339751(itemId, status, null), 1, null).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.NotificationSettingStore.toggleNotificationSettings.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiNotificationSettingsItem> apply(ApiNotificationSettingsItem it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return NotificationSettingStore.this.refreshNotifications(settingsId).onErrorComplete().andThen(Single.just(it));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: NotificationSettingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.NotificationSettingStore$selectNotificationSettings$1", m3645f = "NotificationSettingStore.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.NotificationSettingStore$selectNotificationSettings$1 */
    /* loaded from: classes13.dex */
    static final class C339731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ List<String> $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339731(String str, List<String> list, Continuation<? super C339731> continuation) {
            super(2, continuation);
            this.$itemId = str;
            this.$values = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationSettingStore.this.new C339731(this.$itemId, this.$values, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C339731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Midlands midlands = NotificationSettingStore.this.midlands;
                String str = this.$itemId;
                SelectNotificationSettingsRequest selectNotificationSettingsRequest = new SelectNotificationSettingsRequest(this.$values);
                this.label = 1;
                if (midlands.selectNotificationSettings(str, selectNotificationSettingsRequest, this) == coroutine_suspended) {
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

    public final Single<Unit> selectNotificationSettings(final String settingsId, String itemId, List<String> values) {
        Intrinsics.checkNotNullParameter(settingsId, "settingsId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(values, "values");
        Single<Unit> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C339731(itemId, values, null), 1, null).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.NotificationSettingStore.selectNotificationSettings.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Unit> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return NotificationSettingStore.this.refreshNotifications(settingsId).onErrorComplete().andThen(Single.just(it));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: NotificationSettingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiNotificationSettings;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.NotificationSettingStore$refreshNotifications$1", m3645f = "NotificationSettingStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.NotificationSettingStore$refreshNotifications$1 */
    /* loaded from: classes13.dex */
    static final class C339711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNotificationSettings>, Object> {
        final /* synthetic */ String $settingsId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339711(String str, Continuation<? super C339711> continuation) {
            super(2, continuation);
            this.$settingsId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationSettingStore.this.new C339711(this.$settingsId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNotificationSettings> continuation) {
            return ((C339711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Midlands midlands = NotificationSettingStore.this.midlands;
            String str = this.$settingsId;
            this.label = 1;
            Object notificationSettings = midlands.getNotificationSettings(str, this);
            return notificationSettings == coroutine_suspended ? coroutine_suspended : notificationSettings;
        }
    }

    public final Completable refreshNotifications(final String settingsId) {
        Intrinsics.checkNotNullParameter(settingsId, "settingsId");
        Completable completableIgnoreElement = RxFactory.DefaultImpls.rxSingle$default(this, null, new C339711(settingsId, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.NotificationSettingStore.refreshNotifications.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiNotificationSettings apiNotificationSettings) {
                NotificationSettingStore.this.notificationsRelay.accept(Tuples4.m3642to(settingsId, apiNotificationSettings));
            }
        }).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElement, "ignoreElement(...)");
        return completableIgnoreElement;
    }

    public final Object fetchNotificationItem(String str, Continuation<? super ApiNotificationSettingsItem> continuation) {
        return this.midlands.getNotificationSettingsItem(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: toggleAndSelectNotificationSettings-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22667toggleAndSelectNotificationSettingshUnOzRk(String str, String str2, ApiNotificationSettingsToggleSettingsItem.Status status, String str3, Set<String> set, Continuation<? super Result<Unit>> continuation) {
        NotificationSettingStore2 notificationSettingStore2;
        if (continuation instanceof NotificationSettingStore2) {
            notificationSettingStore2 = (NotificationSettingStore2) continuation;
            int i = notificationSettingStore2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationSettingStore2.label = i - Integer.MIN_VALUE;
            } else {
                notificationSettingStore2 = new NotificationSettingStore2(this, continuation);
            }
        }
        Object objCoroutineScope = notificationSettingStore2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = notificationSettingStore2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCoroutineScope);
            NotificationSettingStore3 notificationSettingStore3 = new NotificationSettingStore3(this, str2, status, str3, set, str, null);
            notificationSettingStore2.label = 1;
            objCoroutineScope = CoroutineScope2.coroutineScope(notificationSettingStore3, notificationSettingStore2);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCoroutineScope);
        }
        return ((Result) objCoroutineScope).getValue();
    }

    /* compiled from: NotificationSettingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.NotificationSettingStore$fetchIpoListNotificationStatus$1", m3645f = "NotificationSettingStore.kt", m3646l = {119}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.NotificationSettingStore$fetchIpoListNotificationStatus$1 */
    /* loaded from: classes13.dex */
    static final class C339681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNotificationSettingsItem>, Object> {
        int label;

        C339681(Continuation<? super C339681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationSettingStore.this.new C339681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNotificationSettingsItem> continuation) {
            return ((C339681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            NotificationSettingStore notificationSettingStore = NotificationSettingStore.this;
            this.label = 1;
            Object objFetchNotificationItem = notificationSettingStore.fetchNotificationItem(NotificationSettingStore.IPO_LIST_NOTIFICATION_ID_PUSH, this);
            return objFetchNotificationItem == coroutine_suspended ? coroutine_suspended : objFetchNotificationItem;
        }
    }

    public final Single<ApiNotificationSettingsToggleSettingsItem.Status> fetchIpoListNotificationStatus() {
        Single<ApiNotificationSettingsToggleSettingsItem.Status> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C339681(null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.NotificationSettingStore.fetchIpoListNotificationStatus.2
            @Override // io.reactivex.functions.Function
            public final ApiNotificationSettingsToggleSettingsItem.Status apply(ApiNotificationSettingsItem notification) {
                ApiNotificationSettingsToggleSettingsItem data;
                Intrinsics.checkNotNullParameter(notification, "notification");
                ApiNotificationSettingsItem.ToggleSettingsItem toggleSettingsItem = notification instanceof ApiNotificationSettingsItem.ToggleSettingsItem ? (ApiNotificationSettingsItem.ToggleSettingsItem) notification : null;
                if (toggleSettingsItem == null || (data = toggleSettingsItem.getData()) == null) {
                    return null;
                }
                return data.getStatus();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Completable toggleOnIposListNotifications() {
        ToggleNotificationSettingsRequest toggleNotificationSettingsRequest = new ToggleNotificationSettingsRequest(ApiNotificationSettingsToggleSettingsItem.Status.f5427ON);
        Completable completableMergeDelayError = Completable.mergeDelayError(CollectionsKt.listOf((Object[]) new Completable[]{RxFactory.DefaultImpls.rxSingle$default(this, null, new NotificationSettingStore6(this, toggleNotificationSettingsRequest, null), 1, null).ignoreElement(), RxFactory.DefaultImpls.rxSingle$default(this, null, new NotificationSettingStore4(this, toggleNotificationSettingsRequest, null), 1, null).ignoreElement(), RxFactory.DefaultImpls.rxSingle$default(this, null, new NotificationSettingStore5(this, toggleNotificationSettingsRequest, null), 1, null).ignoreElement()}));
        Intrinsics.checkNotNullExpressionValue(completableMergeDelayError, "mergeDelayError(...)");
        return completableMergeDelayError;
    }
}
