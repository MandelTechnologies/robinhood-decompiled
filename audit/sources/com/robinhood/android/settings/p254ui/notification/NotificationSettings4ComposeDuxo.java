package com.robinhood.android.settings.p254ui.notification;

import android.content.res.Resources;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.settings.experiment.CryptoAlertV2SnoozeExperiment;
import com.robinhood.android.settings.p254ui.notification.NotificationSettings4ComposeEvent;
import com.robinhood.android.settings.util.extensions.Statuses;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.models.api.ApiNotificationSettings;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.settings.contracts.NotificationSettings4ComposeFragmentKey;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: NotificationSettings4ComposeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 W2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001WBI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010$\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0002¢\u0006\u0004\b$\u0010\"J\u001f\u0010&\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010\u001eJA\u0010*\u001a\u00020\u001c2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0018\u00010'2\u001a\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001f\u0018\u00010'H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020,*\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J%\u00102\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001a¢\u0006\u0004\b2\u00103J%\u00106\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J+\u00109\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00182\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020?¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ER\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010R\u001a\u00020\u0018*\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bS\u0010MR\u0011\u0010V\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bU\u0010M¨\u0006X"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "notificationSettingStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeStateProvider;", "stateProvider", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/AnalyticsLogger;Lj$/time/Clock;Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeStateProvider;Landroid/content/res/Resources;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "itemId", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "newStatus", "", "toggleItem", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;)V", "", "values", "selectMultipleChoiceItem", "(Ljava/lang/String;Ljava/util/Set;)V", "selectedValues", "updateSelectApi", "status", "updateToggleApi", "Lkotlin/Pair;", "toggleItemStatus", "multipleChoiceItemSelection", "toggleAndSelectNotificationSettings", "(Lkotlin/Pair;Lkotlin/Pair;)V", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow;", "resetSelection", "(Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow;)Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$SnoozeBottomSheetMultipleChoiceRow;", "onCreate", "()V", "sectionId", "onSettingsToggled", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;)V", "parentId", "value", "onSettingsSelected", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "newSelectedValues", "onBottomSheetMultipleChoiceSelectionCompleted", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "Lcom/robinhood/shared/settings/contracts/ViewType$Toggle;", "viewType", "onToggleAppeared", "(Lcom/robinhood/shared/settings/contracts/ViewType$Toggle;)V", "Lcom/robinhood/shared/settings/contracts/ViewType$RadioGroup;", "onRadioGroupAppeared", "(Lcom/robinhood/shared/settings/contracts/ViewType$RadioGroup;)V", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/analytics/AnalyticsLogger;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "", "launchNavigationCompleted", "Z", "getSettingsId", "()Ljava/lang/String;", "settingsId", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "getSettingsIdForRefresh", "(Lcom/robinhood/shared/settings/contracts/SubPageReference;)Ljava/lang/String;", "settingsIdForRefresh", "getScreenName", "screenName", "getScreenDescription", "screenDescription", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettings4ComposeDuxo extends BaseDuxo3<NotificationSettings4ComposeDataState, NotificationSettings4ComposeViewState, NotificationSettings4ComposeEvent> implements HasSavedState {
    public static final String PUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS = "push-holdings-crypto_price_movements";
    public static final String PUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS_V2 = "push-holdings-crypto_price_movements_v2_collection";
    public static final String PUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS = "push-watchlist-crypto_price_movements";
    public static final String PUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS_V2 = "push-watchlist-crypto_price_movements_v2_collection";
    private final AnalyticsLogger analytics;
    private final Clock clock;
    private final ExperimentsStore experimentsStore;
    private boolean launchNavigationCompleted;
    private final NotificationSettingStore notificationSettingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettings4ComposeDuxo(NotificationSettingStore notificationSettingStore, ExperimentsStore experimentsStore, AnalyticsLogger analytics, Clock clock, NotificationSettings4ComposeDuxo3 stateProvider, Resources resources, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(NotificationSettings4ComposeDataState.INSTANCE.m18862default(((NotificationSettings4ComposeFragmentKey) INSTANCE.getArgs(savedStateHandle)).getSubPageReference(), resources), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.notificationSettingStore = notificationSettingStore;
        this.experimentsStore = experimentsStore;
        this.analytics = analytics;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    public final String getScreenName() {
        return NotificationSettings4ComposeDuxo2.notificationSettingsScreenName(((NotificationSettings4ComposeFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSubPageReference());
    }

    public final String getScreenDescription() {
        String settingsId = getSettingsId();
        return settingsId == null ? "" : settingsId;
    }

    private final String getSettingsId() {
        NotificationSettings4FragmentKey3 subPageReference = ((NotificationSettings4ComposeFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSubPageReference();
        if (subPageReference != null) {
            return subPageReference.getId();
        }
        return null;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        NotificationSettings4FragmentKey3 subPageReference = ((NotificationSettings4ComposeFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSubPageReference();
        NotificationSettings4FragmentKey3.FromId fromId = subPageReference instanceof NotificationSettings4FragmentKey3.FromId ? (NotificationSettings4FragmentKey3.FromId) subPageReference : null;
        if (fromId != null) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C283911(fromId, null));
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C283922(fromId, null));
        }
        String settingsId = getSettingsId();
        if (Intrinsics.areEqual(settingsId, PUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS_V2) || Intrinsics.areEqual(settingsId, PUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS_V2)) {
            this.experimentsStore.logExposure(CryptoAlertV2SnoozeExperiment.INSTANCE);
        }
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onCreate$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onCreate$1 */
    static final class C283911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NotificationSettings4FragmentKey3.FromId $subPageReferenceFromId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283911(NotificationSettings4FragmentKey3.FromId fromId, Continuation<? super C283911> continuation) {
            super(2, continuation);
            this.$subPageReferenceFromId = fromId;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationSettings4ComposeDuxo.this.new C283911(this.$subPageReferenceFromId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(NotificationSettings4ComposeDuxo.this.notificationSettingStore.streamNotificationSettings(this.$subPageReferenceFromId.getId())), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NotificationSettings4ComposeDuxo.this, this.$subPageReferenceFromId, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: NotificationSettings4ComposeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "notificationSettings", "Lcom/robinhood/models/api/ApiNotificationSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onCreate$1$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiNotificationSettings, Continuation<? super Unit>, Object> {
            final /* synthetic */ NotificationSettings4FragmentKey3.FromId $subPageReferenceFromId;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NotificationSettings4ComposeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo, NotificationSettings4FragmentKey3.FromId fromId, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = notificationSettings4ComposeDuxo;
                this.$subPageReferenceFromId = fromId;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$subPageReferenceFromId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiNotificationSettings apiNotificationSettings, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(apiNotificationSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: NotificationSettings4ComposeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onCreate$1$1$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505431 extends ContinuationImpl7 implements Function2<NotificationSettings4ComposeDataState, Continuation<? super NotificationSettings4ComposeDataState>, Object> {
                final /* synthetic */ ApiNotificationSettings $notificationSettings;
                final /* synthetic */ NotificationSettings4FragmentKey3.FromId $subPageReferenceFromId;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ NotificationSettings4ComposeDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505431(ApiNotificationSettings apiNotificationSettings, NotificationSettings4FragmentKey3.FromId fromId, NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo, Continuation<? super C505431> continuation) {
                    super(2, continuation);
                    this.$notificationSettings = apiNotificationSettings;
                    this.$subPageReferenceFromId = fromId;
                    this.this$0 = notificationSettings4ComposeDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505431 c505431 = new C505431(this.$notificationSettings, this.$subPageReferenceFromId, this.this$0, continuation);
                    c505431.L$0 = obj;
                    return c505431;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(NotificationSettings4ComposeDataState notificationSettings4ComposeDataState, Continuation<? super NotificationSettings4ComposeDataState> continuation) {
                    return ((C505431) create(notificationSettings4ComposeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object next;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NotificationSettings4ComposeDataState notificationSettings4ComposeDataStateMutateWithNotificationSettings = ((NotificationSettings4ComposeDataState) this.L$0).mutateWithNotificationSettings(this.$notificationSettings);
                    String itemId = this.$subPageReferenceFromId.getItemId();
                    if (itemId != null && !this.this$0.launchNavigationCompleted) {
                        this.this$0.launchNavigationCompleted = true;
                        ImmutableList<NotificationSettings4FragmentKey4> viewTypes = notificationSettings4ComposeDataStateMutateWithNotificationSettings.getViewTypes();
                        ArrayList arrayList = new ArrayList();
                        for (NotificationSettings4FragmentKey4 notificationSettings4FragmentKey4 : viewTypes) {
                            if (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.SubPageEntry) {
                                arrayList.add(notificationSettings4FragmentKey4);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.areEqual(((NotificationSettings4FragmentKey4.SubPageEntry) next).getSubPageReference().getId(), itemId)) {
                                break;
                            }
                        }
                        NotificationSettings4FragmentKey4.SubPageEntry subPageEntry = (NotificationSettings4FragmentKey4.SubPageEntry) next;
                        if (subPageEntry != null) {
                            this.this$0.submit(new NotificationSettings4ComposeEvent.OpenSubPageEntry(subPageEntry.getSubPageReference()));
                        }
                    }
                    return notificationSettings4ComposeDataStateMutateWithNotificationSettings;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ApiNotificationSettings apiNotificationSettings = (ApiNotificationSettings) this.L$0;
                NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo = this.this$0;
                notificationSettings4ComposeDuxo.applyMutation(new C505431(apiNotificationSettings, this.$subPageReferenceFromId, notificationSettings4ComposeDuxo, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onCreate$2", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {500}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onCreate$2 */
    static final class C283922 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NotificationSettings4FragmentKey3.FromId $subPageReferenceFromId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283922(NotificationSettings4FragmentKey3.FromId fromId, Continuation<? super C283922> continuation) {
            super(2, continuation);
            this.$subPageReferenceFromId = fromId;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C283922 c283922 = NotificationSettings4ComposeDuxo.this.new C283922(this.$subPageReferenceFromId, continuation);
            c283922.L$0 = obj;
            return c283922;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283922) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo = NotificationSettings4ComposeDuxo.this;
                    NotificationSettings4FragmentKey3.FromId fromId = this.$subPageReferenceFromId;
                    Result.Companion companion = Result.INSTANCE;
                    Completable completableRefreshNotifications = notificationSettings4ComposeDuxo.notificationSettingStore.refreshNotifications(fromId.getId());
                    this.label = 1;
                    if (RxAwait3.await(completableRefreshNotifications, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo2 = NotificationSettings4ComposeDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
            } else {
                notificationSettings4ComposeDuxo2.submit(new NotificationSettings4ComposeEvent.NotificationSettingsError(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onSettingsToggled(String sectionId, String itemId, ApiNotificationSettingsToggleSettingsItem.Status status) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(status, "status");
        AnalyticsLogger analyticsLogger = this.analytics;
        String settingsId = getSettingsId();
        if (settingsId != null) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_TOGGLE_SETTING, settingsId, sectionId, null, itemId, null, Statuses.asAnalyticsTag(status), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
            toggleItem(itemId, status);
            if ((Intrinsics.areEqual(itemId, PUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS) || Intrinsics.areEqual(itemId, PUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS)) && status == ApiNotificationSettingsToggleSettingsItem.Status.OFF) {
                submit(NotificationSettings4ComposeEvent.PresentSurveyIfNecessary.INSTANCE);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onSettingsSelected(String parentId, String itemId, String value) {
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(value, "value");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, "multi_choice_setting", parentId, itemId, null, null, null, value, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
        selectMultipleChoiceItem(itemId, SetsKt.setOf(value));
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onBottomSheetMultipleChoiceSelectionCompleted$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$onBottomSheetMultipleChoiceSelectionCompleted$1 */
    static final class C283901 extends ContinuationImpl7 implements Function2<NotificationSettings4ComposeDataState, Continuation<? super NotificationSettings4ComposeDataState>, Object> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ Set<String> $newSelectedValues;
        final /* synthetic */ String $parentId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NotificationSettings4ComposeDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283901(String str, String str2, Set<String> set, NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo, Continuation<? super C283901> continuation) {
            super(2, continuation);
            this.$parentId = str;
            this.$itemId = str2;
            this.$newSelectedValues = set;
            this.this$0 = notificationSettings4ComposeDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C283901 c283901 = new C283901(this.$parentId, this.$itemId, this.$newSelectedValues, this.this$0, continuation);
            c283901.L$0 = obj;
            return c283901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NotificationSettings4ComposeDataState notificationSettings4ComposeDataState, Continuation<? super NotificationSettings4ComposeDataState> continuation) {
            return ((C283901) create(notificationSettings4ComposeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator<NotificationSettings4FragmentKey4> it;
            NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo;
            ArrayList arrayList;
            ApiNotificationSettingsToggleSettingsItem.Status status;
            Tuples2 tuples2M3642to;
            NotificationSettings4FragmentKey4.Toggle toggleCopy$default;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotificationSettings4ComposeDataState notificationSettings4ComposeDataState = (NotificationSettings4ComposeDataState) this.L$0;
            ImmutableList<NotificationSettings4FragmentKey4> viewTypes = notificationSettings4ComposeDataState.getViewTypes();
            String str = this.$parentId;
            String str2 = this.$itemId;
            Set<String> set = this.$newSelectedValues;
            NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo2 = this.this$0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(viewTypes, 10));
            for (Iterator<NotificationSettings4FragmentKey4> it2 = viewTypes.iterator(); it2.hasNext(); it2 = it) {
                NotificationSettings4FragmentKey4 next = it2.next();
                if (Intrinsics.areEqual(next, NotificationSettings4FragmentKey4.Padding.INSTANCE) || (next instanceof NotificationSettings4FragmentKey4.RadioGroup) || (next instanceof NotificationSettings4FragmentKey4.SectionTitle) || (next instanceof NotificationSettings4FragmentKey4.SubPageEntry) || (next instanceof NotificationSettings4FragmentKey4.SubtitleRichText) || (next instanceof NotificationSettings4FragmentKey4.TitleSubtitle)) {
                    it = it2;
                    notificationSettings4ComposeDuxo = notificationSettings4ComposeDuxo2;
                    arrayList = arrayList2;
                } else {
                    if (!(next instanceof NotificationSettings4FragmentKey4.Toggle)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NotificationSettings4FragmentKey4.Toggle toggleCopy$default2 = (NotificationSettings4FragmentKey4.Toggle) next;
                    if (Intrinsics.areEqual(toggleCopy$default2.getId(), str)) {
                        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = toggleCopy$default2.getBottomSheetMultipleChoiceRow();
                        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = toggleCopy$default2.getSnoozeBottomSheetMultipleChoiceRow();
                        if (bottomSheetMultipleChoiceRow != null && Intrinsics.areEqual(bottomSheetMultipleChoiceRow.getId(), str2)) {
                            NotificationSettings4FragmentKey4.Toggle toggleCopy$default3 = NotificationSettings4FragmentKey4.Toggle.copy$default(toggleCopy$default2, null, null, null, null, null, false, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.copy$default(bottomSheetMultipleChoiceRow, null, null, null, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.BottomSheetData.copy$default(bottomSheetMultipleChoiceRow.getBottomSheetData(), null, set, null, false, 13, null), 7, null), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
                            if (set.isEmpty()) {
                                toggleCopy$default = NotificationSettings4FragmentKey4.Toggle.copy$default(toggleCopy$default3, null, null, null, null, ApiNotificationSettingsToggleSettingsItem.Status.OFF, false, null, snoozeBottomSheetMultipleChoiceRow != null ? notificationSettings4ComposeDuxo2.resetSelection(snoozeBottomSheetMultipleChoiceRow) : null, 111, null);
                            } else {
                                toggleCopy$default = NotificationSettings4FragmentKey4.Toggle.copy$default(toggleCopy$default3, null, null, null, null, ApiNotificationSettingsToggleSettingsItem.Status.f5427ON, false, null, null, 239, null);
                            }
                            toggleCopy$default2 = toggleCopy$default;
                            ApiNotificationSettingsToggleSettingsItem.Status status2 = toggleCopy$default2.getStatus() != toggleCopy$default2.getStatus() ? toggleCopy$default2.getStatus() : null;
                            it = it2;
                            tuples2M3642to = Tuples4.m3642to(bottomSheetMultipleChoiceRow.getId(), set);
                            arrayList = arrayList2;
                            status = status2;
                            notificationSettings4ComposeDuxo = notificationSettings4ComposeDuxo2;
                        } else if (snoozeBottomSheetMultipleChoiceRow == null || !Intrinsics.areEqual(snoozeBottomSheetMultipleChoiceRow.getId(), str2)) {
                            it = it2;
                            notificationSettings4ComposeDuxo = notificationSettings4ComposeDuxo2;
                            arrayList = arrayList2;
                            toggleCopy$default2 = toggleCopy$default2;
                            status = null;
                            tuples2M3642to = null;
                        } else {
                            List<NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem> choices = snoozeBottomSheetMultipleChoiceRow.getBottomSheetData().getChoices();
                            if (!(choices instanceof Collection) || !choices.isEmpty()) {
                                Iterator<T> it3 = choices.iterator();
                                while (it3.hasNext()) {
                                    if (set.contains(((NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem) it3.next()).getValue())) {
                                        ApiNotificationSettingsToggleSettingsItem.Status status3 = ApiNotificationSettingsToggleSettingsItem.Status.OFF;
                                        Tuples2 tuples2M3642to2 = Tuples4.m3642to(snoozeBottomSheetMultipleChoiceRow.getId(), set);
                                        Set<String> set2 = set;
                                        it = it2;
                                        notificationSettings4ComposeDuxo = notificationSettings4ComposeDuxo2;
                                        arrayList = arrayList2;
                                        set = set2;
                                        toggleCopy$default2 = NotificationSettings4FragmentKey4.Toggle.copy$default(toggleCopy$default2, null, null, null, null, status3, false, null, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.copy$default(snoozeBottomSheetMultipleChoiceRow, null, null, null, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeBottomSheetData.copy$default(snoozeBottomSheetMultipleChoiceRow.getBottomSheetData(), null, null, null, null, set2, null, null, Duration.ofMillis(notificationSettings4ComposeDuxo2.clock.millis()).toSeconds(), null, 367, null), 7, null), 111, null);
                                        status = status3;
                                        tuples2M3642to = tuples2M3642to2;
                                        break;
                                    }
                                }
                                it = it2;
                                notificationSettings4ComposeDuxo = notificationSettings4ComposeDuxo2;
                                arrayList = arrayList2;
                                toggleCopy$default2 = toggleCopy$default2;
                                status = null;
                                tuples2M3642to = null;
                            }
                        }
                        notificationSettings4ComposeDuxo.toggleAndSelectNotificationSettings(status != null ? Tuples4.m3642to(str, status) : null, tuples2M3642to);
                    } else {
                        it = it2;
                        notificationSettings4ComposeDuxo = notificationSettings4ComposeDuxo2;
                        arrayList = arrayList2;
                    }
                    next = toggleCopy$default2;
                }
                arrayList.add(next);
                notificationSettings4ComposeDuxo2 = notificationSettings4ComposeDuxo;
                arrayList2 = arrayList;
            }
            return NotificationSettings4ComposeDataState.copy$default(notificationSettings4ComposeDataState, null, null, extensions2.toImmutableList(arrayList2), 3, null);
        }
    }

    public final void onBottomSheetMultipleChoiceSelectionCompleted(String itemId, String parentId, Set<String> newSelectedValues) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(newSelectedValues, "newSelectedValues");
        applyMutation(new C283901(parentId, itemId, newSelectedValues, this, null));
    }

    public final void onToggleAppeared(NotificationSettings4FragmentKey4.Toggle viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        AnalyticsLogger analyticsLogger = this.analytics;
        String settingsId = getSettingsId();
        if (settingsId != null) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_TOGGLE_SETTING, settingsId, viewType.getSectionId(), null, viewType.getId(), null, Statuses.asAnalyticsTag(viewType.getStatus()), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onRadioGroupAppeared(NotificationSettings4FragmentKey4.RadioGroup viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, "multi_choice_setting", viewType.getParentId(), viewType.getId(), null, null, null, viewType.getSelectedValue(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$toggleItem$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$toggleItem$1 */
    static final class C283951 extends ContinuationImpl7 implements Function2<NotificationSettings4ComposeDataState, Continuation<? super NotificationSettings4ComposeDataState>, Object> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ ApiNotificationSettingsToggleSettingsItem.Status $newStatus;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NotificationSettings4ComposeDuxo this$0;

        /* compiled from: NotificationSettings4ComposeDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$toggleItem$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiNotificationSettingsToggleSettingsItem.Status.values().length];
                try {
                    iArr[ApiNotificationSettingsToggleSettingsItem.Status.OFF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiNotificationSettingsToggleSettingsItem.Status.f5427ON.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiNotificationSettingsToggleSettingsItem.Status.REQUIRED_ON.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283951(String str, NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo, ApiNotificationSettingsToggleSettingsItem.Status status, Continuation<? super C283951> continuation) {
            super(2, continuation);
            this.$itemId = str;
            this.this$0 = notificationSettings4ComposeDuxo;
            this.$newStatus = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C283951 c283951 = new C283951(this.$itemId, this.this$0, this.$newStatus, continuation);
            c283951.L$0 = obj;
            return c283951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NotificationSettings4ComposeDataState notificationSettings4ComposeDataState, Continuation<? super NotificationSettings4ComposeDataState> continuation) {
            return ((C283951) create(notificationSettings4ComposeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            NotificationSettings4FragmentKey4.Toggle toggleCopy$default;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotificationSettings4ComposeDataState notificationSettings4ComposeDataState = (NotificationSettings4ComposeDataState) this.L$0;
            ImmutableList<NotificationSettings4FragmentKey4> viewTypes = notificationSettings4ComposeDataState.getViewTypes();
            String str = this.$itemId;
            NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo = this.this$0;
            ApiNotificationSettingsToggleSettingsItem.Status status = this.$newStatus;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(viewTypes, 10));
            for (NotificationSettings4FragmentKey4 notificationSettings4FragmentKey4 : viewTypes) {
                if (Intrinsics.areEqual(notificationSettings4FragmentKey4, NotificationSettings4FragmentKey4.Padding.INSTANCE) || (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.RadioGroup) || (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.SectionTitle) || (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.SubPageEntry) || (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.SubtitleRichText) || (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.TitleSubtitle)) {
                    arrayList = arrayList2;
                } else {
                    if (!(notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.Toggle)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NotificationSettings4FragmentKey4.Toggle toggle = (NotificationSettings4FragmentKey4.Toggle) notificationSettings4FragmentKey4;
                    if (Intrinsics.areEqual(toggle.getId(), str)) {
                        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = toggle.getBottomSheetMultipleChoiceRow();
                        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = toggle.getSnoozeBottomSheetMultipleChoiceRow();
                        if (toggle.getStatus() == ApiNotificationSettingsToggleSettingsItem.Status.OFF && bottomSheetMultipleChoiceRow != null && bottomSheetMultipleChoiceRow.getBottomSheetData().getSelectedValues().isEmpty()) {
                            notificationSettings4ComposeDuxo.submit(new NotificationSettings4ComposeEvent.OpenMultipleChoiceBottomSheet(bottomSheetMultipleChoiceRow));
                            arrayList = arrayList2;
                            notificationSettings4FragmentKey4 = toggle;
                        } else if (snoozeBottomSheetMultipleChoiceRow != null) {
                            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                            if (i == 1) {
                                arrayList = arrayList2;
                                NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRowResetSelection = notificationSettings4ComposeDuxo.resetSelection(snoozeBottomSheetMultipleChoiceRow);
                                notificationSettings4ComposeDuxo.submit(new NotificationSettings4ComposeEvent.OpenMultipleChoiceBottomSheet(snoozeBottomSheetMultipleChoiceRowResetSelection));
                                toggleCopy$default = NotificationSettings4FragmentKey4.Toggle.copy$default(toggle, null, null, null, null, null, false, null, snoozeBottomSheetMultipleChoiceRowResetSelection, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                            } else {
                                if (i != 2 && i != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                notificationSettings4ComposeDuxo.updateToggleApi(str, status);
                                arrayList = arrayList2;
                                toggleCopy$default = NotificationSettings4FragmentKey4.Toggle.copy$default(toggle, null, null, null, null, status, false, null, null, 239, null);
                            }
                        } else {
                            arrayList = arrayList2;
                            toggleCopy$default = toggle;
                            if (toggleCopy$default.getStatus() != status) {
                                notificationSettings4ComposeDuxo.updateToggleApi(str, status);
                                toggleCopy$default = NotificationSettings4FragmentKey4.Toggle.copy$default(toggleCopy$default, null, null, null, null, status, false, null, null, 239, null);
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                        toggleCopy$default = toggle;
                    }
                    notificationSettings4FragmentKey4 = toggleCopy$default;
                }
                arrayList.add(notificationSettings4FragmentKey4);
                arrayList2 = arrayList;
            }
            return NotificationSettings4ComposeDataState.copy$default(notificationSettings4ComposeDataState, null, null, extensions2.toImmutableList(arrayList2), 3, null);
        }
    }

    private final void toggleItem(String itemId, ApiNotificationSettingsToggleSettingsItem.Status newStatus) {
        applyMutation(new C283951(itemId, this, newStatus, null));
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$selectMultipleChoiceItem$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$selectMultipleChoiceItem$1 */
    static final class C283931 extends ContinuationImpl7 implements Function2<NotificationSettings4ComposeDataState, Continuation<? super NotificationSettings4ComposeDataState>, Object> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ Set<String> $values;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NotificationSettings4ComposeDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283931(String str, Set<String> set, NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo, Continuation<? super C283931> continuation) {
            super(2, continuation);
            this.$itemId = str;
            this.$values = set;
            this.this$0 = notificationSettings4ComposeDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C283931 c283931 = new C283931(this.$itemId, this.$values, this.this$0, continuation);
            c283931.L$0 = obj;
            return c283931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NotificationSettings4ComposeDataState notificationSettings4ComposeDataState, Continuation<? super NotificationSettings4ComposeDataState> continuation) {
            return ((C283931) create(notificationSettings4ComposeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotificationSettings4ComposeDataState notificationSettings4ComposeDataState = (NotificationSettings4ComposeDataState) this.L$0;
            ImmutableList<NotificationSettings4FragmentKey4> viewTypes = notificationSettings4ComposeDataState.getViewTypes();
            String str = this.$itemId;
            Set<String> set = this.$values;
            NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(viewTypes, 10));
            for (Parcelable parcelableCopy$default : viewTypes) {
                if (!Intrinsics.areEqual(parcelableCopy$default, NotificationSettings4FragmentKey4.Padding.INSTANCE) && !(parcelableCopy$default instanceof NotificationSettings4FragmentKey4.SectionTitle) && !(parcelableCopy$default instanceof NotificationSettings4FragmentKey4.SubPageEntry) && !(parcelableCopy$default instanceof NotificationSettings4FragmentKey4.SubtitleRichText) && !(parcelableCopy$default instanceof NotificationSettings4FragmentKey4.TitleSubtitle) && !(parcelableCopy$default instanceof NotificationSettings4FragmentKey4.Toggle)) {
                    if (!(parcelableCopy$default instanceof NotificationSettings4FragmentKey4.RadioGroup)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NotificationSettings4FragmentKey4.RadioGroup radioGroup = (NotificationSettings4FragmentKey4.RadioGroup) parcelableCopy$default;
                    if (!Intrinsics.areEqual(radioGroup.getId(), str) || set.isEmpty()) {
                        parcelableCopy$default = radioGroup;
                    } else {
                        Set<String> set2 = set;
                        if (!Intrinsics.areEqual(radioGroup.getSelectedValue(), CollectionsKt.first(set2))) {
                            notificationSettings4ComposeDuxo.updateSelectApi(str, set);
                            parcelableCopy$default = NotificationSettings4FragmentKey4.RadioGroup.copy$default(radioGroup, null, null, null, null, null, (String) CollectionsKt.first(set2), 31, null);
                        }
                    }
                }
                arrayList.add(parcelableCopy$default);
            }
            return NotificationSettings4ComposeDataState.copy$default(notificationSettings4ComposeDataState, null, null, extensions2.toImmutableList(arrayList), 3, null);
        }
    }

    private final void selectMultipleChoiceItem(String itemId, Set<String> values) {
        applyMutation(new C283931(itemId, values, this, null));
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$updateSelectApi$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {500}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$updateSelectApi$1 */
    static final class C283961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ Set<String> $selectedValues;
        final /* synthetic */ NotificationSettings4FragmentKey3 $subPageReference;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283961(NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, String str, Set<String> set, Continuation<? super C283961> continuation) {
            super(2, continuation);
            this.$subPageReference = notificationSettings4FragmentKey3;
            this.$itemId = str;
            this.$selectedValues = set;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C283961 c283961 = NotificationSettings4ComposeDuxo.this.new C283961(this.$subPageReference, this.$itemId, this.$selectedValues, continuation);
            c283961.L$0 = obj;
            return c283961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo = NotificationSettings4ComposeDuxo.this;
                    NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3 = this.$subPageReference;
                    String str = this.$itemId;
                    Set<String> set = this.$selectedValues;
                    Result.Companion companion = Result.INSTANCE;
                    Single<Unit> singleSelectNotificationSettings = notificationSettings4ComposeDuxo.notificationSettingStore.selectNotificationSettings(notificationSettings4ComposeDuxo.getSettingsIdForRefresh(notificationSettings4FragmentKey3), str, CollectionsKt.toList(set));
                    this.label = 1;
                    if (RxAwait3.await(singleSelectNotificationSettings, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo2 = NotificationSettings4ComposeDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
            } else {
                notificationSettings4ComposeDuxo2.submit(new NotificationSettings4ComposeEvent.NotificationSettingsError(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectApi(String itemId, Set<String> selectedValues) {
        NotificationSettings4FragmentKey3 subPageReference = ((NotificationSettings4ComposeFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSubPageReference();
        if (subPageReference == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C283961(subPageReference, itemId, selectedValues, null), 3, null);
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$updateToggleApi$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {500}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$updateToggleApi$1 */
    static final class C283971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $itemId;
        final /* synthetic */ ApiNotificationSettingsToggleSettingsItem.Status $status;
        final /* synthetic */ NotificationSettings4FragmentKey3 $subPageReference;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283971(NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, String str, ApiNotificationSettingsToggleSettingsItem.Status status, Continuation<? super C283971> continuation) {
            super(2, continuation);
            this.$subPageReference = notificationSettings4FragmentKey3;
            this.$itemId = str;
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C283971 c283971 = NotificationSettings4ComposeDuxo.this.new C283971(this.$subPageReference, this.$itemId, this.$status, continuation);
            c283971.L$0 = obj;
            return c283971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo = NotificationSettings4ComposeDuxo.this;
                    NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3 = this.$subPageReference;
                    String str = this.$itemId;
                    ApiNotificationSettingsToggleSettingsItem.Status status = this.$status;
                    Result.Companion companion = Result.INSTANCE;
                    Single<ApiNotificationSettingsItem> single = notificationSettings4ComposeDuxo.notificationSettingStore.toggleNotificationSettings(notificationSettings4ComposeDuxo.getSettingsIdForRefresh(notificationSettings4FragmentKey3), str, status);
                    this.label = 1;
                    obj = RxAwait3.await(single, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiNotificationSettingsItem) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo2 = NotificationSettings4ComposeDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
            } else {
                notificationSettings4ComposeDuxo2.submit(new NotificationSettings4ComposeEvent.NotificationSettingsError(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateToggleApi(String itemId, ApiNotificationSettingsToggleSettingsItem.Status status) {
        NotificationSettings4FragmentKey3 subPageReference = ((NotificationSettings4ComposeFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSubPageReference();
        if (subPageReference == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C283971(subPageReference, itemId, status, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleAndSelectNotificationSettings(Tuples2<String, ? extends ApiNotificationSettingsToggleSettingsItem.Status> toggleItemStatus, Tuples2<String, ? extends Set<String>> multipleChoiceItemSelection) {
        NotificationSettings4FragmentKey3 subPageReference = ((NotificationSettings4ComposeFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSubPageReference();
        if (subPageReference == null) {
            return;
        }
        if (toggleItemStatus != null && multipleChoiceItemSelection != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C283941(subPageReference, toggleItemStatus, multipleChoiceItemSelection, null), 3, null);
        } else if (toggleItemStatus != null) {
            updateToggleApi(toggleItemStatus.getFirst(), toggleItemStatus.getSecond());
        } else if (multipleChoiceItemSelection != null) {
            updateSelectApi(multipleChoiceItemSelection.getFirst(), multipleChoiceItemSelection.getSecond());
        }
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$toggleAndSelectNotificationSettings$1", m3645f = "NotificationSettings4ComposeDuxo.kt", m3646l = {406}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeDuxo$toggleAndSelectNotificationSettings$1 */
    static final class C283941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Tuples2<String, Set<String>> $multipleChoiceItemSelection;
        final /* synthetic */ NotificationSettings4FragmentKey3 $subPageReference;
        final /* synthetic */ Tuples2<String, ApiNotificationSettingsToggleSettingsItem.Status> $toggleItemStatus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C283941(NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, Tuples2<String, ? extends ApiNotificationSettingsToggleSettingsItem.Status> tuples2, Tuples2<String, ? extends Set<String>> tuples22, Continuation<? super C283941> continuation) {
            super(2, continuation);
            this.$subPageReference = notificationSettings4FragmentKey3;
            this.$toggleItemStatus = tuples2;
            this.$multipleChoiceItemSelection = tuples22;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationSettings4ComposeDuxo.this.new C283941(this.$subPageReference, this.$toggleItemStatus, this.$multipleChoiceItemSelection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C283941 c283941;
            Object objM22667toggleAndSelectNotificationSettingshUnOzRk;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NotificationSettingStore notificationSettingStore = NotificationSettings4ComposeDuxo.this.notificationSettingStore;
                String settingsIdForRefresh = NotificationSettings4ComposeDuxo.this.getSettingsIdForRefresh(this.$subPageReference);
                String first = this.$toggleItemStatus.getFirst();
                ApiNotificationSettingsToggleSettingsItem.Status second = this.$toggleItemStatus.getSecond();
                String first2 = this.$multipleChoiceItemSelection.getFirst();
                Set<String> second2 = this.$multipleChoiceItemSelection.getSecond();
                this.label = 1;
                c283941 = this;
                objM22667toggleAndSelectNotificationSettingshUnOzRk = notificationSettingStore.m22667toggleAndSelectNotificationSettingshUnOzRk(settingsIdForRefresh, first, second, first2, second2, c283941);
                if (objM22667toggleAndSelectNotificationSettingshUnOzRk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22667toggleAndSelectNotificationSettingshUnOzRk = ((Result) obj).getValue();
                c283941 = this;
            }
            NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo = NotificationSettings4ComposeDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM22667toggleAndSelectNotificationSettingshUnOzRk);
            if (thM28553exceptionOrNullimpl == null) {
            } else {
                notificationSettings4ComposeDuxo.submit(new NotificationSettings4ComposeEvent.NotificationSettingsError(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSettingsIdForRefresh(NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3) {
        if (notificationSettings4FragmentKey3 instanceof NotificationSettings4FragmentKey3.FromId) {
            return ((NotificationSettings4FragmentKey3.FromId) notificationSettings4FragmentKey3).getId();
        }
        if (notificationSettings4FragmentKey3 instanceof NotificationSettings4FragmentKey3.FromViews) {
            return ((NotificationSettings4FragmentKey3.FromViews) notificationSettings4FragmentKey3).getRootSettingsId();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow resetSelection(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow) {
        return NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.copy$default(snoozeBottomSheetMultipleChoiceRow, null, null, null, NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeBottomSheetData.copy$default(snoozeBottomSheetMultipleChoiceRow.getBottomSheetData(), null, null, null, null, snoozeBottomSheetMultipleChoiceRow.getBottomSheetData().getDefaultValues(), null, null, Duration.ofMillis(this.clock.millis()).toSeconds(), null, 367, null), 7, null);
    }

    /* compiled from: NotificationSettings4ComposeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDuxo;", "Lcom/robinhood/shared/settings/contracts/NotificationSettings4ComposeFragmentKey;", "<init>", "()V", "PUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS", "", "getPUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS$feature_settings_externalRelease$annotations", "PUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS", "getPUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS$feature_settings_externalRelease$annotations", "PUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS_V2", "getPUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS_V2$feature_settings_externalRelease$annotations", "PUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS_V2", "getPUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS_V2$feature_settings_externalRelease$annotations", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NotificationSettings4ComposeDuxo, NotificationSettings4ComposeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getPUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS$feature_settings_externalRelease$annotations */
        public static /* synthetic */ void m2469x3161e899() {
        }

        /* renamed from: getPUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS_V2$feature_settings_externalRelease$annotations */
        public static /* synthetic */ void m2470x444fac66() {
        }

        /* renamed from: getPUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS$feature_settings_externalRelease$annotations */
        public static /* synthetic */ void m2471xaa9071fa() {
        }

        /* renamed from: getPUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS_V2$feature_settings_externalRelease$annotations */
        public static /* synthetic */ void m2472x52d49b65() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NotificationSettings4ComposeFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (NotificationSettings4ComposeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NotificationSettings4ComposeFragmentKey getArgs(NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo) {
            return (NotificationSettings4ComposeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, notificationSettings4ComposeDuxo);
        }
    }
}
