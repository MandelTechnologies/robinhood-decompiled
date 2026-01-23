package com.robinhood.android.snacks.p257ui;

import com.robinhood.android.snacks.p257ui.SnacksSubscribeViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.models.api.ApiNotificationSettings;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsMultipleChoiceItem;
import com.robinhood.models.api.ApiNotificationSettingsSection;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
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
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: SnacksSubscribeDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "notificationSettingStore", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "subscribeToSnacks", "updateStatus", "status", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;", "isDailySnacksEnabled", "", "Lcom/robinhood/models/api/ApiNotificationSettings;", "(Lcom/robinhood/models/api/ApiNotificationSettings;)Z", "isDailyChoiceSelected", "Lcom/robinhood/models/api/ApiNotificationSettingsItem$ConfigurableSettingsItem;", "(Lcom/robinhood/models/api/ApiNotificationSettingsItem$ConfigurableSettingsItem;)Z", "Companion", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SnacksSubscribeDuxo extends BaseDuxo4<SnacksSubscribeViewState> {
    private static final String EMAIL_SETTING_ID = "email";
    private static final String SNACKS_CHOICE_ITEM_ID = "email-robinhood-robinhood_snacks-frequency";
    private static final String SNACKS_DAILY_CHOICE_VALUE = "daily";
    private static final String SNACKS_SECTION_ID = "email-robinhood-robinhood_snacks";
    private final NotificationSettingStore notificationSettingStore;
    private final UserStore userStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnacksSubscribeDuxo(UserStore userStore, NotificationSettingStore notificationSettingStore, DuxoBundle duxoBundle) {
        super(new SnacksSubscribeViewState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
        this.notificationSettingStore = notificationSettingStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnacksSubscribeDuxo.onCreate$lambda$0(this.f$0, (User) obj);
            }
        });
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.notificationSettingStore.streamNotificationSettings("email"), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnacksSubscribeDuxo.onCreate$lambda$1(this.f$0, (ApiNotificationSettings) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnacksSubscribeDuxo.onCreate$lambda$2(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.notificationSettingStore.refreshNotifications("email"), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnacksSubscribeDuxo.onCreate$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SnacksSubscribeDuxo snacksSubscribeDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        snacksSubscribeDuxo.applyMutation(new SnacksSubscribeDuxo2(user, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(SnacksSubscribeDuxo snacksSubscribeDuxo, ApiNotificationSettings setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        if (snacksSubscribeDuxo.isDailySnacksEnabled(setting)) {
            snacksSubscribeDuxo.updateStatus(SnacksSubscribeViewState.Status.AlreadySubscribed.INSTANCE);
        } else {
            snacksSubscribeDuxo.subscribeToSnacks();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(SnacksSubscribeDuxo snacksSubscribeDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        snacksSubscribeDuxo.updateStatus(new SnacksSubscribeViewState.Status.Failure(t));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(SnacksSubscribeDuxo snacksSubscribeDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        snacksSubscribeDuxo.updateStatus(new SnacksSubscribeViewState.Status.Failure(t));
        return Unit.INSTANCE;
    }

    private final void subscribeToSnacks() {
        Single<R> singleFlatMap = this.notificationSettingStore.toggleNotificationSettings("email", SNACKS_SECTION_ID, ApiNotificationSettingsToggleSettingsItem.Status.f5427ON).flatMap(new Function() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo.subscribeToSnacks.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Unit> apply(ApiNotificationSettingsItem it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SnacksSubscribeDuxo.this.notificationSettingStore.selectNotificationSettings("email", SnacksSubscribeDuxo.SNACKS_CHOICE_ITEM_ID, CollectionsKt.listOf(SnacksSubscribeDuxo.SNACKS_DAILY_CHOICE_VALUE));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnacksSubscribeDuxo.subscribeToSnacks$lambda$5(this.f$0, (Unit) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnacksSubscribeDuxo.subscribeToSnacks$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToSnacks$lambda$5(SnacksSubscribeDuxo snacksSubscribeDuxo, Unit unit) {
        snacksSubscribeDuxo.updateStatus(SnacksSubscribeViewState.Status.Subscribed.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToSnacks$lambda$6(SnacksSubscribeDuxo snacksSubscribeDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        snacksSubscribeDuxo.updateStatus(new SnacksSubscribeViewState.Status.Failure(t));
        return Unit.INSTANCE;
    }

    /* compiled from: SnacksSubscribeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$updateStatus$1", m3645f = "SnacksSubscribeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$updateStatus$1 */
    static final class C286961 extends ContinuationImpl7 implements Function2<SnacksSubscribeViewState, Continuation<? super SnacksSubscribeViewState>, Object> {
        final /* synthetic */ SnacksSubscribeViewState.Status $status;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C286961(SnacksSubscribeViewState.Status status, Continuation<? super C286961> continuation) {
            super(2, continuation);
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286961 c286961 = new C286961(this.$status, continuation);
            c286961.L$0 = obj;
            return c286961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SnacksSubscribeViewState snacksSubscribeViewState, Continuation<? super SnacksSubscribeViewState> continuation) {
            return ((C286961) create(snacksSubscribeViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SnacksSubscribeViewState.copy$default((SnacksSubscribeViewState) this.L$0, null, this.$status, 1, null);
        }
    }

    private final void updateStatus(SnacksSubscribeViewState.Status status) {
        applyMutation(new C286961(status, null));
    }

    private final boolean isDailySnacksEnabled(ApiNotificationSettings apiNotificationSettings) {
        Object next;
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(apiNotificationSettings.getSections()), new Function1<Object, Boolean>() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$special$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ApiNotificationSettingsSection.ItemCollection);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator itIterator2 = SequencesKt.flatMap(sequenceFilter, new Function1() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnacksSubscribeDuxo._get_isDailySnacksEnabled_$lambda$7((ApiNotificationSettingsSection.ItemCollection) obj);
            }
        }).iterator2();
        while (true) {
            if (!itIterator2.hasNext()) {
                next = null;
                break;
            }
            next = itIterator2.next();
            if (Intrinsics.areEqual(((ApiNotificationSettingsItem) next).getId(), SNACKS_SECTION_ID)) {
                break;
            }
        }
        ApiNotificationSettingsItem apiNotificationSettingsItem = (ApiNotificationSettingsItem) next;
        if (apiNotificationSettingsItem == null) {
            return false;
        }
        ApiNotificationSettingsItem.ConfigurableSettingsItem configurableSettingsItem = (ApiNotificationSettingsItem.ConfigurableSettingsItem) apiNotificationSettingsItem;
        return configurableSettingsItem.getData().getToggle_item().getStatus() == ApiNotificationSettingsToggleSettingsItem.Status.f5427ON && isDailyChoiceSelected(configurableSettingsItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence _get_isDailySnacksEnabled_$lambda$7(ApiNotificationSettingsSection.ItemCollection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.asSequence(it.getData().getItems());
    }

    private final boolean isDailyChoiceSelected(ApiNotificationSettingsItem.ConfigurableSettingsItem configurableSettingsItem) {
        Object next;
        ApiNotificationSettingsMultipleChoiceItem data;
        List<String> selected_choices;
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(configurableSettingsItem.getData().getSections()), new Function1<Object, Boolean>() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeDuxo$special$$inlined$filterIsInstance$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ApiNotificationSettingsSection.MultipleChoiceItem);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator itIterator2 = sequenceFilter.iterator2();
        while (true) {
            if (!itIterator2.hasNext()) {
                next = null;
                break;
            }
            next = itIterator2.next();
            if (Intrinsics.areEqual(((ApiNotificationSettingsSection.MultipleChoiceItem) next).getData().getId(), SNACKS_CHOICE_ITEM_ID)) {
                break;
            }
        }
        ApiNotificationSettingsSection.MultipleChoiceItem multipleChoiceItem = (ApiNotificationSettingsSection.MultipleChoiceItem) next;
        if (multipleChoiceItem == null || (data = multipleChoiceItem.getData()) == null || (selected_choices = data.getSelected_choices()) == null) {
            return false;
        }
        return selected_choices.contains(SNACKS_DAILY_CHOICE_VALUE);
    }
}
