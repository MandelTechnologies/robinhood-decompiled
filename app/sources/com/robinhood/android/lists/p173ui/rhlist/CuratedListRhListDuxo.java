package com.robinhood.android.lists.p173ui.rhlist;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.data.CuratedListEligibleItemsFetcher;
import com.robinhood.android.common.data.prefs.HasShownDirectIpoOnboarding;
import com.robinhood.android.common.extensions.SortOrders;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListDuxo;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState2;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState4;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.directipo.models.api.ApiIpoAccessListViewModel;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.prefs.CuratedRhListIndexOptionsCurbHoursTooltipPref;
import com.robinhood.librobinhood.data.prefs.IndexOptionsListExtendedHoursBadgeSeenPref;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.IndexCuratedListEligible;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.HasSeenIpoNotificationBottomSheet;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: CuratedListRhListDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002deB©\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000206H\u0016J\u0006\u00108\u001a\u000206J\u0010\u00109\u001a\u0002062\u0006\u0010:\u001a\u000204H\u0002J\u0010\u0010;\u001a\u0002062\u0006\u0010:\u001a\u000204H\u0002J\u0006\u0010<\u001a\u000206J\u0006\u0010=\u001a\u000206J\u001c\u0010>\u001a\u0002062\u0006\u0010?\u001a\u0002042\n\b\u0002\u0010@\u001a\u0004\u0018\u00010AH\u0002J\u000e\u0010B\u001a\u0002062\u0006\u0010C\u001a\u000204J\u000e\u0010D\u001a\u0002062\u0006\u0010E\u001a\u00020FJ\b\u0010J\u001a\u00020KH\u0002J\u0006\u0010L\u001a\u000206J\u000e\u0010M\u001a\u0002062\u0006\u0010N\u001a\u000204J\u000e\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020QJ\u0016\u0010R\u001a\u0002062\u0006\u0010S\u001a\u00020,2\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u0002062\u0006\u0010S\u001a\u00020,J\u000e\u0010W\u001a\u0002062\u0006\u0010X\u001a\u00020YJ\u000e\u0010Z\u001a\u0002062\u0006\u0010X\u001a\u00020YJ\u000e\u0010[\u001a\u0002062\u0006\u0010X\u001a\u00020YJ=\u0010\\\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010]2\u000e\u0010^\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010_2\u0006\u0010`\u001a\u0002012\u0006\u0010a\u001a\u0002042\u0006\u0010b\u001a\u000204H\u0001¢\u0006\u0002\bcR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010G\u001a\u000204*\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006f"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "eligibleItemsFetcher", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "directIpoApi", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "listDisclosuresStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;", "hasSeenIpoNotificationBottomSheet", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownDirectIpoOnboarding", "indexOptionsExtendedHoursTooltipPref", "indexOptionsListExtendedHoursBadgeSeenPref", "notificationSettingsStore", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Landroid/content/res/Resources;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "listId", "Ljava/util/UUID;", "getListId", "()Ljava/util/UUID;", "filtersMap", "", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo$FilterSet;", "showAllItemsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "onCreate", "", "onResume", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "refreshList", "force", "refreshListItems", "followList", "unfollowList", "updateFollowEvent", "follow", "throwable", "", "setShowingErrorImage", "showErrorImage", "sortList", "selectedSortOption", "Lcom/robinhood/models/ui/SortOption;", "shouldReset", "getShouldReset", "(Lcom/robinhood/models/ui/SortOption;)Z", "getLocalMidnightTimestamp", "", "showFullList", "toggleMenuOptionVisibility", "showMenuOptions", "setIpoAccessFilter", "ipoAccessFilter", "Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "tapInfoBanner", "receiptUuid", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "dismissInfoBanner", "clickFilterChip", "filter", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;", "clickFilterChipTooltip", "onFilterChipTooltipAppear", "mutateFilters", "Lkotlinx/collections/immutable/ImmutableList;", "currentFilters", "", "filterSet", "showFilterSet", "inIndexOptionsCurbHoursExperiment", "mutateFilters$feature_lists_externalDebug", "FilterSet", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListRhListDuxo extends OldBaseDuxo<CuratedListRhListViewState> implements HasSavedState {
    private static final long MIN_LOADING_TIME_IN_MILLIS = 500;
    private static final int NUMBER_OF_TRUNCATED_RH_LIST_ITEMS = 100;
    private static final int REDUCED_TRUNCATED_RH_LIST_ITEMS = 10;
    private final CryptoHistoricalStore cryptoHistoricalStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CuratedListItemViewModeStore curatedListItemViewModeStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final DirectIpoApi directIpoApi;
    private final CuratedListEligibleItemsFetcher eligibleItemsFetcher;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final Map<UUID, FilterSet> filtersMap;
    private final BooleanPreference hasSeenIpoNotificationBottomSheet;
    private final BooleanPreference hasShownDirectIpoOnboarding;
    private final IacInfoBannerStore iacInfoBannerStore;
    private final BooleanPreference indexOptionsExtendedHoursTooltipPref;
    private final BooleanPreference indexOptionsListExtendedHoursBadgeSeenPref;
    private final ListDisclosuresStore listDisclosuresStore;
    private final NotificationSettingStore notificationSettingsStore;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final Resources resources;
    private final SavedStateHandle savedStateHandle;
    private final BehaviorRelay<Boolean> showAllItemsRelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListRhListDuxo(CuratedListEligibleItemsFetcher eligibleItemsFetcher, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, CryptoQuoteStore cryptoQuoteStore, CryptoHistoricalStore cryptoHistoricalStore, DirectIpoApi directIpoApi, EventLogger eventLogger, ListDisclosuresStore listDisclosuresStore, @HasSeenIpoNotificationBottomSheet BooleanPreference hasSeenIpoNotificationBottomSheet, @HasShownDirectIpoOnboarding BooleanPreference hasShownDirectIpoOnboarding, @CuratedRhListIndexOptionsCurbHoursTooltipPref BooleanPreference indexOptionsExtendedHoursTooltipPref, @IndexOptionsListExtendedHoursBadgeSeenPref BooleanPreference indexOptionsListExtendedHoursBadgeSeenPref, NotificationSettingStore notificationSettingsStore, IacInfoBannerStore iacInfoBannerStore, ExperimentsStore experimentsStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, Resources resources, SavedStateHandle savedStateHandle) {
        super(new CuratedListRhListViewState(null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048575, null), null, 2, null);
        Intrinsics.checkNotNullParameter(eligibleItemsFetcher, "eligibleItemsFetcher");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
        Intrinsics.checkNotNullParameter(directIpoApi, "directIpoApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(listDisclosuresStore, "listDisclosuresStore");
        Intrinsics.checkNotNullParameter(hasSeenIpoNotificationBottomSheet, "hasSeenIpoNotificationBottomSheet");
        Intrinsics.checkNotNullParameter(hasShownDirectIpoOnboarding, "hasShownDirectIpoOnboarding");
        Intrinsics.checkNotNullParameter(indexOptionsExtendedHoursTooltipPref, "indexOptionsExtendedHoursTooltipPref");
        Intrinsics.checkNotNullParameter(indexOptionsListExtendedHoursBadgeSeenPref, "indexOptionsListExtendedHoursBadgeSeenPref");
        Intrinsics.checkNotNullParameter(notificationSettingsStore, "notificationSettingsStore");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eligibleItemsFetcher = eligibleItemsFetcher;
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoHistoricalStore = cryptoHistoricalStore;
        this.directIpoApi = directIpoApi;
        this.eventLogger = eventLogger;
        this.listDisclosuresStore = listDisclosuresStore;
        this.hasSeenIpoNotificationBottomSheet = hasSeenIpoNotificationBottomSheet;
        this.hasShownDirectIpoOnboarding = hasShownDirectIpoOnboarding;
        this.indexOptionsExtendedHoursTooltipPref = indexOptionsExtendedHoursTooltipPref;
        this.indexOptionsListExtendedHoursBadgeSeenPref = indexOptionsListExtendedHoursBadgeSeenPref;
        this.notificationSettingsStore = notificationSettingsStore;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.experimentsStore = experimentsStore;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.resources = resources;
        this.savedStateHandle = savedStateHandle;
        this.filtersMap = MapsKt.mapOf(Tuples4.m3642to(CuratedList.INSTANCE.getINDEX_OPTIONS_LIST_ID(), new FilterSet(extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new CuratedListRhListViewState.Filter[]{new CuratedListRhListViewState.Filter(CuratedListRhListViewState.Filter.InterfaceC20905Id.IndexOptions.All.INSTANCE, C20839R.string.index_options_filter_all, true, null, null, 16, null), new CuratedListRhListViewState.Filter(CuratedListRhListViewState.Filter.InterfaceC20905Id.IndexOptions.ExtendedHours.INSTANCE, C20839R.string.index_options_filter_extended_hours, false, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CuratedListRhListDuxo.filtersMap$lambda$0((CuratedListEligible) obj));
            }
        }, null, 16, null)})), optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled())));
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.showAllItemsRelay = behaviorRelayCreateDefault;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getListId() {
        return ((CuratedListKey.RhList) INSTANCE.getArgs((HasSavedState) this)).getListId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean filtersMap$lambda$0(CuratedListEligible it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (it instanceof IndexCuratedListEligible) && ((IndexCuratedListEligible) it).getHasExtendedHours();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        FilterSet filterSet = this.filtersMap.get(getListId());
        if (filterSet != null) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new CuratedListRhListDuxo2(filterSet, this, null));
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        refreshList(false);
        Observable<CuratedList> observableRefCount = this.curatedListStore.streamCuratedList(getListId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$3(this.f$0, (CuratedList) obj);
            }
        });
        Observable<R> map = this.curatedListItemsStore.streamCuratedListItems(getListId()).map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final Integer apply(CuratedListItems it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getListItems().size());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$5(this.f$0, (Integer) obj);
            }
        });
        Observable<R> observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ListDisclosure> apply(CuratedList curatedList) {
                Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                return CuratedListRhListDuxo.this.listDisclosuresStore.stream(CuratedListRhListDuxo.this.getListId(), curatedList.getOwnerType());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$7(this.f$0, (ListDisclosure) obj);
            }
        });
        Observable observableSwitchMap2 = Observable.combineLatest(this.showAllItemsRelay, observableRefCount, new BiFunction() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onResume$curatedListEligibleItemsObs$1
            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<Boolean, CuratedList> apply(Boolean showAllItems, CuratedList curatedList) {
                Intrinsics.checkNotNullParameter(showAllItems, "showAllItems");
                Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                return new Tuples2<>(showAllItems, curatedList);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onResume$curatedListEligibleItemsObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CuratedListEligible>> apply(Tuples2<Boolean, CuratedList> tuples2) {
                Integer num;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Boolean boolComponent1 = tuples2.component1();
                Intrinsics.checkNotNullExpressionValue(boolComponent1, "component1(...)");
                CuratedList curatedListComponent2 = tuples2.component2();
                Intrinsics.checkNotNullExpressionValue(curatedListComponent2, "component2(...)");
                CuratedList curatedList = curatedListComponent2;
                if (boolComponent1.booleanValue()) {
                    num = null;
                } else {
                    num = curatedList.getShowDisclosureImmediately() ? 10 : 100;
                }
                return this.this$0.eligibleItemsFetcher.streamCuratedListEligibleItems(this.this$0.getListId(), num, true);
            }
        });
        Intrinsics.checkNotNull(observableSwitchMap2);
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$9(this.f$0, (List) obj);
            }
        });
        Observable map2 = observableSwitchMap2.map(CuratedListRhListDuxo3.INSTANCE);
        Observable observableSwitchMap3 = map2.switchMap(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.onResume.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CryptoQuote>> apply(List<UUID> currencyPairIds) {
                Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
                return CuratedListRhListDuxo.this.cryptoQuoteStore.getPollCryptoQuotes().asObservable(currencyPairIds);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable observableSwitchMap4 = map2.switchMap(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.onResume.8
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Object> apply(List<UUID> currencyPairIds) {
                Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
                return CuratedListRhListDuxo.this.cryptoHistoricalStore.poll(currencyPairIds, GraphSelection.TWENTY_FOUR_HOURS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListItemViewModeStore.streamCuratedListItemViewModeOrDefault(getListId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$11(this.f$0, (CuratedListViewMode) obj);
            }
        });
        refreshListItems(false);
        Observable<CuratedListRhListViewState> observableRefCount2 = getStates().filter(new Predicate() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onResume$isIpoAccessObservable$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CuratedListRhListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CuratedList curatedList = it.getCuratedList();
                return curatedList != null && curatedList.isIpoAccessList();
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount2, "refCount(...)");
        Observable<R> observableSwitchMapSingle = observableRefCount2.take(1L).switchMapSingle(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.onResume.10

            /* compiled from: CuratedListRhListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/directipo/models/api/ApiIpoAccessListViewModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onResume$10$1", m3645f = "CuratedListRhListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onResume$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiIpoAccessListViewModel>, Object> {
                int label;
                final /* synthetic */ CuratedListRhListDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CuratedListRhListDuxo curatedListRhListDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = curatedListRhListDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiIpoAccessListViewModel> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    DirectIpoApi directIpoApi = this.this$0.directIpoApi;
                    this.label = 1;
                    Object ipoAccessListViewModel = directIpoApi.getIpoAccessListViewModel(this);
                    return ipoAccessListViewModel == coroutine_suspended ? coroutine_suspended : ipoAccessListViewModel;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiIpoAccessListViewModel> apply(CuratedListRhListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CuratedListRhListDuxo curatedListRhListDuxo = CuratedListRhListDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(curatedListRhListDuxo, null, new AnonymousClass1(curatedListRhListDuxo, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$13(this.f$0, (ApiIpoAccessListViewModel) obj);
            }
        });
        final UUID popoverIpoAnnouncementInstrumentId = ((CuratedListKey.RhList) INSTANCE.getArgs((HasSavedState) this)).getPopoverIpoAnnouncementInstrumentId();
        if (popoverIpoAnnouncementInstrumentId != null) {
            Observable<CuratedListRhListViewState> observableTake = observableRefCount2.take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.onResume$lambda$15(this.f$0, popoverIpoAnnouncementInstrumentId, (CuratedListRhListViewState) obj);
                }
            });
        }
        if (!this.hasSeenIpoNotificationBottomSheet.get()) {
            Observable<R> observableSwitchMapSingle2 = observableRefCount2.take(1L).switchMapSingle(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.onResume.13
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends ApiNotificationSettingsToggleSettingsItem.Status> apply(CuratedListRhListViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CuratedListRhListDuxo.this.notificationSettingsStore.fetchIpoListNotificationStatus();
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle2, "switchMapSingle(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.ignoreNetworkExceptions(observableSwitchMapSingle2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.onResume$lambda$17(this.f$0, (ApiNotificationSettingsToggleSettingsItem.Status) obj);
                }
            });
        }
        if (!this.hasShownDirectIpoOnboarding.get()) {
            Observable<CuratedListRhListViewState> observableDelay = observableRefCount2.take(1L).delay(1L, TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(observableDelay, "delay(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableDelay, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.onResume$lambda$19(this.f$0, (CuratedListRhListViewState) obj);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, IacInfoBannerStore.streamBatch$default(this.iacInfoBannerStore, CollectionsKt.listOf(IacInfoBannerLocation.INFO_BANNER_LIST_PAGE_TOP_LEVEL), null, null, null, null, getListId(), null, null, null, null, null, 2014, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$21(this.f$0, (List) obj);
            }
        });
        if (Intrinsics.areEqual(getListId(), CuratedList.INSTANCE.getINDEX_OPTIONS_LIST_ID())) {
            Observable observableTake2 = asObservable(this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled()).filter(new Predicate() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.onResume.17
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Boolean it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.booleanValue();
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.onResume$lambda$22(this.f$0, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(CuratedListRhListDuxo curatedListRhListDuxo, final CuratedList curatedList) {
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$3$lambda$2(curatedList, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$3$lambda$2(CuratedList curatedList, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        SortOption currentSortOption = applyMutation.getCurrentSortOption();
        if (currentSortOption == null) {
            currentSortOption = new SortOption(curatedList.getChildSortOrder(), curatedList.getChildSortDirection());
        }
        Intrinsics.checkNotNull(curatedList);
        return CuratedListRhListViewState.copy$default(applyMutation, new CuratedListRhListViewState4.Success(curatedList), null, 0, false, null, null, null, null, null, null, false, currentSortOption, null, null, null, null, false, false, null, null, 1046526, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(CuratedListRhListDuxo curatedListRhListDuxo, final Integer num) {
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$5$lambda$4(num, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$5$lambda$4(Integer num, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(num);
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, num.intValue(), false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048571, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(CuratedListRhListDuxo curatedListRhListDuxo, final ListDisclosure listDisclosure) {
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$7$lambda$6(listDisclosure, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$7$lambda$6(ListDisclosure listDisclosure, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, listDisclosure, null, null, false, false, null, null, 1040383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(CuratedListRhListDuxo curatedListRhListDuxo, final List list) {
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$9$lambda$8(list, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$9$lambda$8(List list, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return CuratedListRhListViewState.copy$default(applyMutation, null, new CuratedListRhListViewState2.Success(list), 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 917501, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(CuratedListRhListDuxo curatedListRhListDuxo, final CuratedListViewMode viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$11$lambda$10(viewMode, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$11$lambda$10(CuratedListViewMode curatedListViewMode, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, curatedListViewMode, null, null, null, false, false, null, null, 1044479, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(CuratedListRhListDuxo curatedListRhListDuxo, final ApiIpoAccessListViewModel apiIpoAccessListViewModel) {
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$13$lambda$12(apiIpoAccessListViewModel, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$13$lambda$12(ApiIpoAccessListViewModel apiIpoAccessListViewModel, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, apiIpoAccessListViewModel, null, false, false, null, null, 1032191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(CuratedListRhListDuxo curatedListRhListDuxo, final UUID uuid, CuratedListRhListViewState curatedListRhListViewState) {
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$15$lambda$14(uuid, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$15$lambda$14(UUID uuid, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UiEvent<UUID> showIpoAnnouncementEvent = applyMutation.getShowIpoAnnouncementEvent();
        if (showIpoAnnouncementEvent == null) {
            showIpoAnnouncementEvent = new UiEvent<>(uuid);
        }
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, showIpoAnnouncementEvent, false, null, null, null, null, null, false, false, null, null, 1048063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(CuratedListRhListDuxo curatedListRhListDuxo, ApiNotificationSettingsToggleSettingsItem.Status status) {
        if (status == ApiNotificationSettingsToggleSettingsItem.Status.OFF) {
            curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.onResume$lambda$17$lambda$16((CuratedListRhListViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$17$lambda$16(CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, new UiEvent(Unit.INSTANCE), null, null, false, null, null, null, null, null, false, false, null, null, 1048447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$19(CuratedListRhListDuxo curatedListRhListDuxo, CuratedListRhListViewState curatedListRhListViewState) {
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$19$lambda$18((CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$19$lambda$18(CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, new UiEvent(Unit.INSTANCE), null, false, null, null, null, null, null, false, false, null, null, 1048319, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$21(CuratedListRhListDuxo curatedListRhListDuxo, final List infoBanners) {
        Intrinsics.checkNotNullParameter(infoBanners, "infoBanners");
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.onResume$lambda$21$lambda$20(infoBanners, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState onResume$lambda$21$lambda$20(List list, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, list, null, 786431, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$22(CuratedListRhListDuxo curatedListRhListDuxo, Boolean bool) {
        curatedListRhListDuxo.indexOptionsListExtendedHoursBadgeSeenPref.set(true);
        return Unit.INSTANCE;
    }

    public final void retry() {
        Observable<CuratedListRhListViewState> observableTake = getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.retry$lambda$23(this.f$0, (CuratedListRhListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retry$lambda$23(CuratedListRhListDuxo curatedListRhListDuxo, CuratedListRhListViewState curatedListRhListViewState) {
        if (curatedListRhListViewState.getCuratedListState() instanceof CuratedListRhListViewState4.Failed) {
            curatedListRhListDuxo.refreshList(true);
        }
        if (curatedListRhListViewState.getCuratedListItemState() instanceof CuratedListRhListViewState2.Failed) {
            curatedListRhListDuxo.refreshListItems(true);
        }
        return Unit.INSTANCE;
    }

    private final void refreshList(boolean force) {
        Completable completableDoOnSubscribe = Completables.checkFallbackOrError(this.curatedListStore.refreshList(force, getListId(), ApiCuratedList.OwnerType.ROBINHOOD), new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListDuxo.refreshList$lambda$24(this.f$0);
            }
        }).doOnSubscribe(new C208852());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.refreshList$lambda$27(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe refreshList$lambda$24(CuratedListRhListDuxo curatedListRhListDuxo) {
        Single<Optional<CuratedList>> singleFirst = curatedListRhListDuxo.curatedListStore.streamCuratedListOptional(curatedListRhListDuxo.getListId()).first(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        return SinglesKt.unwrapOptional(singleFirst);
    }

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$refreshList$2 */
    static final class C208852<T> implements Consumer {
        C208852() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CuratedListRhListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$refreshList$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.C208852.accept$lambda$0((CuratedListRhListViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListRhListViewState accept$lambda$0(CuratedListRhListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.getCuratedListState() instanceof CuratedListRhListViewState4.Success ? applyMutation : CuratedListRhListViewState.copy$default(applyMutation, CuratedListRhListViewState4.Loading.INSTANCE, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048574, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshList$lambda$27(CuratedListRhListDuxo curatedListRhListDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.refreshList$lambda$27$lambda$26((CuratedListRhListViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState refreshList$lambda$27$lambda$26(CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, CuratedListRhListViewState4.Failed.INSTANCE, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048574, null);
    }

    private final void refreshListItems(final boolean force) {
        Completable completableSwitchMapCompletable = getStates().take(1L).map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.refreshListItems.1
            @Override // io.reactivex.functions.Function
            public final Optional<SortOption> apply(CuratedListRhListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getCurrentSortOption());
            }
        }).switchMapCompletable(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.refreshListItems.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Optional<SortOption> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                SortOption sortOptionComponent1 = optional.component1();
                boolean z = (sortOptionComponent1 != null ? sortOptionComponent1.getSortOrder() : null) == ApiCuratedList.SortOrder.UNKNOWN;
                return CuratedListItemsStore.refreshListItems$default(CuratedListRhListDuxo.this.curatedListItemsStore, force, CuratedListRhListDuxo.this.getListId(), ApiCuratedList.OwnerType.ROBINHOOD, !z ? sortOptionComponent1 != null ? sortOptionComponent1.getSortOrder() : null : null, !z ? sortOptionComponent1 != null ? sortOptionComponent1.getSortDirection() : null : null, null, 32, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        Completable completableDoOnSubscribe = Completables.checkFallbackOrError(completableSwitchMapCompletable, new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListDuxo.refreshListItems$lambda$28(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.refreshListItems$lambda$29((Throwable) obj);
            }
        }).doOnSubscribe(new C208885());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.refreshListItems$lambda$32(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe refreshListItems$lambda$28(CuratedListRhListDuxo curatedListRhListDuxo) {
        Single<Optional<CuratedListItems>> singleFirst = curatedListRhListDuxo.curatedListItemsStore.streamCuratedListItemsOptional(curatedListRhListDuxo.getListId()).first(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        return SinglesKt.unwrapOptional(singleFirst);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshListItems$lambda$29(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$refreshListItems$5 */
    static final class C208885<T> implements Consumer {
        C208885() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CuratedListRhListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$refreshListItems$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.C208885.accept$lambda$0((CuratedListRhListViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListRhListViewState accept$lambda$0(CuratedListRhListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.getCuratedListItemState() instanceof CuratedListRhListViewState2.Success ? applyMutation : CuratedListRhListViewState.copy$default(applyMutation, null, CuratedListRhListViewState2.Loading.INSTANCE, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048573, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshListItems$lambda$32(CuratedListRhListDuxo curatedListRhListDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.refreshListItems$lambda$32$lambda$31((CuratedListRhListViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, false, null, 6, null);
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState refreshListItems$lambda$32$lambda$31(CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, CuratedListRhListViewState2.Failed.INSTANCE, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048573, null);
    }

    public final void followList() {
        Observable<?> observableDoOnSubscribe = this.curatedListStore.followList(getListId()).doOnSubscribe(new C208751());
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.followList.2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16124invoke(Object obj) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m16124invoke(obj);
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.followList$lambda$33(this.f$0, (Throwable) obj);
            }
        }, new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListDuxo.followList$lambda$34(this.f$0);
            }
        }, null, 8, null);
    }

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$followList$1 */
    static final class C208751<T> implements Consumer {
        C208751() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListRhListViewState accept$lambda$0(CuratedListRhListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, true, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048567, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CuratedListRhListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$followList$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.C208751.accept$lambda$0((CuratedListRhListViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit followList$lambda$33(CuratedListRhListDuxo curatedListRhListDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        curatedListRhListDuxo.updateFollowEvent(true, t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit followList$lambda$34(CuratedListRhListDuxo curatedListRhListDuxo) {
        updateFollowEvent$default(curatedListRhListDuxo, true, null, 2, null);
        return Unit.INSTANCE;
    }

    public final void unfollowList() {
        Observable<?> observableDoOnSubscribe = this.curatedListStore.unfollowList(getListId()).doOnSubscribe(new C208911());
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.unfollowList.2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16129invoke(Object obj) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m16129invoke(obj);
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.unfollowList$lambda$35(this.f$0, (Throwable) obj);
            }
        }, new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListDuxo.unfollowList$lambda$36(this.f$0);
            }
        }, null, 8, null);
    }

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$unfollowList$1 */
    static final class C208911<T> implements Consumer {
        C208911() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListRhListViewState accept$lambda$0(CuratedListRhListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, true, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048567, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CuratedListRhListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$unfollowList$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.C208911.accept$lambda$0((CuratedListRhListViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unfollowList$lambda$35(CuratedListRhListDuxo curatedListRhListDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        curatedListRhListDuxo.updateFollowEvent(false, t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unfollowList$lambda$36(CuratedListRhListDuxo curatedListRhListDuxo) {
        updateFollowEvent$default(curatedListRhListDuxo, false, null, 2, null);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void updateFollowEvent$default(CuratedListRhListDuxo curatedListRhListDuxo, boolean z, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        curatedListRhListDuxo.updateFollowEvent(z, th);
    }

    private final void updateFollowEvent(final boolean follow, final Throwable throwable) {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.updateFollowEvent$lambda$37(throwable, follow, (CuratedListRhListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState updateFollowEvent$lambda$37(Throwable th, boolean z, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (th == null) {
            return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, new UiEvent(Boolean.valueOf(z)), null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048551, null);
        }
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, new UiEvent(th), null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048535, null);
    }

    public final void setShowingErrorImage(final boolean showErrorImage) {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.setShowingErrorImage$lambda$38(showErrorImage, (CuratedListRhListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState setShowingErrorImage$lambda$38(boolean z, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, z, null, null, null, null, null, false, false, null, null, 1047551, null);
    }

    public final void sortList(final SortOption selectedSortOption) {
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        final boolean shouldReset = getShouldReset(selectedSortOption);
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$sortList$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CuratedListRhListViewState) it).getCuratedList());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CuratedListRhListDuxo$sortList$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable observableRefCount = ObservableDelay2.minTimeInFlight$default(observableTake, 500L, null, 2, null).doOnSubscribe(new CuratedListRhListDuxo7(this)).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.sortList$lambda$41(this.f$0, selectedSortOption, (CuratedList) obj);
            }
        });
        Completable completableDoOnError = observableRefCount.switchMapCompletable(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo.sortList.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(CuratedList curatedList) {
                Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                return CuratedListRhListDuxo.this.curatedListItemsStore.refreshListItems(true, curatedList.getId(), curatedList.getOwnerType(), shouldReset ? null : selectedSortOption.getSortOrder(), shouldReset ? null : selectedSortOption.getSortDirection(), CuratedListRhListDuxo.this.getLocalMidnightTimestamp());
            }
        }).doOnError(new C208903());
        Intrinsics.checkNotNullExpressionValue(completableDoOnError, "doOnError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortList$lambda$41(CuratedListRhListDuxo curatedListRhListDuxo, final SortOption sortOption, CuratedList curatedList) {
        curatedListRhListDuxo.curatedListItemViewModeStore.updateViewMode(curatedListRhListDuxo.getListId(), SortOrders.getViewMode(sortOption.getSortOrder()));
        curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.sortList$lambda$41$lambda$40(sortOption, (CuratedListRhListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState sortList$lambda$41$lambda$40(SortOption sortOption, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, sortOption, null, null, null, null, false, false, null, null, 1046527, null);
    }

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$sortList$3 */
    static final class C208903<T> implements Consumer {
        C208903() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final Throwable th) throws Throwable {
            if (Throwables.isNetworkRelated(th)) {
                CuratedListRhListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$sortList$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CuratedListRhListDuxo.C208903.accept$lambda$0(th, (CuratedListRhListViewState) obj);
                    }
                });
                return;
            }
            throw th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListRhListViewState accept$lambda$0(Throwable th, CuratedListRhListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CuratedListRhListViewState.copy$default(applyMutation, null, CuratedListRhListViewState2.Failed.INSTANCE, 0, false, null, null, new UiEvent(th), null, null, null, false, null, null, null, null, null, false, false, null, null, 1048509, null);
        }
    }

    private final boolean getShouldReset(SortOption sortOption) {
        return sortOption.getSortDirection() == ApiCuratedList.SortDirection.EMPTY || sortOption.getSortOrder() == ApiCuratedList.SortOrder.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLocalMidnightTimestamp() {
        String str = LocalDate.now().atStartOfDay(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_INSTANT);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState showFullList$lambda$42(CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, true, null, null, 917503, null);
    }

    public final void showFullList() {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.showFullList$lambda$42((CuratedListRhListViewState) obj);
            }
        });
        this.showAllItemsRelay.accept(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState toggleMenuOptionVisibility$lambda$43(boolean z, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, z, false, null, null, 983039, null);
    }

    public final void toggleMenuOptionVisibility(final boolean showMenuOptions) {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.toggleMenuOptionVisibility$lambda$43(showMenuOptions, (CuratedListRhListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState setIpoAccessFilter$lambda$44(CuratedListRhListViewState6 curatedListRhListViewState6, CuratedListRhListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, curatedListRhListViewState6, false, false, null, null, 1015807, null);
    }

    public final void setIpoAccessFilter(final CuratedListRhListViewState6 ipoAccessFilter) {
        Intrinsics.checkNotNullParameter(ipoAccessFilter, "ipoAccessFilter");
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.setIpoAccessFilter$lambda$44(ipoAccessFilter, (CuratedListRhListViewState) obj);
            }
        });
    }

    public final void tapInfoBanner(UUID receiptUuid, GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleHost.DefaultImpls.bind$default(this, this.iacInfoBannerStore.postTapped(receiptUuid, action.getUri().toString()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void dismissInfoBanner(UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Completable completableSwitchMapCompletable = getStates().take(1L).switchMapCompletable(new C208741(receiptUuid));
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$dismissInfoBanner$1 */
    static final class C208741<T, R> implements Function {
        final /* synthetic */ UUID $receiptUuid;

        C208741(UUID uuid) {
            this.$receiptUuid = uuid;
        }

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(CuratedListRhListViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            List<IacInfoBanner> iacInfoBanners = state.getIacInfoBanners();
            UUID uuid = this.$receiptUuid;
            final ArrayList arrayList = new ArrayList();
            for (T t : iacInfoBanners) {
                if (!Intrinsics.areEqual(((IacInfoBanner) t).getReceiptUuid(), uuid)) {
                    arrayList.add(t);
                }
            }
            CuratedListRhListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$dismissInfoBanner$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListRhListDuxo.C208741.apply$lambda$1(arrayList, (CuratedListRhListViewState) obj);
                }
            });
            return CuratedListRhListDuxo.this.iacInfoBannerStore.postDismissed(this.$receiptUuid, IacDismissMethod.PASSIVE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListRhListViewState apply$lambda$1(List list, CuratedListRhListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, list, null, 786431, null);
        }
    }

    public final void clickFilterChip(final CuratedListRhListViewState.Filter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.clickFilterChip$lambda$45(filter, (CuratedListRhListViewState) obj);
            }
        });
        CuratedListRhListViewState.Filter.InterfaceC20905Id id = filter.getId();
        if (Intrinsics.areEqual(id, CuratedListRhListViewState.Filter.InterfaceC20905Id.IndexOptions.All.INSTANCE)) {
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.APPLY_FILTERS, new Screen(Screen.Name.ROBINHOOD_LIST_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.FILTERS_BUTTON, "All", null, 4, null), null, null, false, 56, null);
        } else if (Intrinsics.areEqual(id, CuratedListRhListViewState.Filter.InterfaceC20905Id.IndexOptions.ExtendedHours.INSTANCE)) {
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.APPLY_FILTERS, new Screen(Screen.Name.ROBINHOOD_LIST_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.FILTERS_BUTTON, "Extended Hours", null, 4, null), null, null, false, 56, null);
        }
        clickFilterChipTooltip(filter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState clickFilterChip$lambda$45(CuratedListRhListViewState.Filter filter, CuratedListRhListViewState applyMutation) {
        List<CuratedListRhListViewState.Filter> listCopyWithSelection;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ImmutableList<CuratedListRhListViewState.Filter> filters = applyMutation.getFilters();
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, (filters == null || (listCopyWithSelection = CuratedListRhListViewState3.copyWithSelection(filters, filter)) == null) ? null : extensions2.toImmutableList(listCopyWithSelection), 524287, null);
    }

    public final void clickFilterChipTooltip(final CuratedListRhListViewState.Filter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListDuxo.clickFilterChipTooltip$lambda$46(filter, (CuratedListRhListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListRhListViewState clickFilterChipTooltip$lambda$46(CuratedListRhListViewState.Filter filter, CuratedListRhListViewState applyMutation) {
        List<CuratedListRhListViewState.Filter> listCopyWithTooltip;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ImmutableList<CuratedListRhListViewState.Filter> filters = applyMutation.getFilters();
        ImmutableList immutableList = null;
        if (filters != null && (listCopyWithTooltip = CuratedListRhListViewState3.copyWithTooltip(filters, filter.getId(), null)) != null) {
            immutableList = extensions2.toImmutableList(listCopyWithTooltip);
        }
        return CuratedListRhListViewState.copy$default(applyMutation, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, immutableList, 524287, null);
    }

    public final void onFilterChipTooltipAppear(CuratedListRhListViewState.Filter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (Intrinsics.areEqual(filter.getId(), CuratedListRhListViewState.Filter.InterfaceC20905Id.IndexOptions.ExtendedHours.INSTANCE)) {
            EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.ROBINHOOD_LIST_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.TOOLTIP, "index_curb_tooltip", null, 4, null), null, null, 25, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ImmutableList<CuratedListRhListViewState.Filter> mutateFilters$feature_lists_externalDebug(List<CuratedListRhListViewState.Filter> currentFilters, FilterSet filterSet, boolean showFilterSet, boolean inIndexOptionsCurbHoursExperiment) {
        Intrinsics.checkNotNullParameter(filterSet, "filterSet");
        String filterId = ((CuratedListKey.RhList) INSTANCE.getArgs((HasSavedState) this)).getFilterId();
        if (!showFilterSet) {
            currentFilters = null;
        } else if (currentFilters == null) {
            if (filterId != null) {
                ImmutableList<CuratedListRhListViewState.Filter> filters = filterSet.getFilters();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
                Iterator<CuratedListRhListViewState.Filter> it = filters.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getId().getStringValue());
                }
                currentFilters = arrayList.contains(filterId) ? CuratedListRhListViewState3.copyWithSelection(filterSet.getFilters(), filterId) : filterSet.getFilters();
            }
        }
        if (!this.indexOptionsExtendedHoursTooltipPref.get() && inIndexOptionsCurbHoursExperiment && !Intrinsics.areEqual(((CuratedListKey.RhList) INSTANCE.getArgs((HasSavedState) this)).getFilterId(), CuratedListRhListViewState.Filter.InterfaceC20905Id.IndexOptions.ExtendedHours.INSTANCE.getStringValue()) && currentFilters != null) {
            List<CuratedListRhListViewState.Filter> list = currentFilters;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((CuratedListRhListViewState.Filter) it2.next()).getId(), CuratedListRhListViewState.Filter.InterfaceC20905Id.IndexOptions.ExtendedHours.INSTANCE)) {
                        List<CuratedListRhListViewState.Filter> list2 = currentFilters;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (CuratedListRhListViewState.Filter filter : list2) {
                            arrayList2.add(CuratedListRhListViewState.Filter.copy$default(filter, null, 0, false, null, Intrinsics.areEqual(filter.getId(), CuratedListRhListViewState.Filter.InterfaceC20905Id.IndexOptions.ExtendedHours.INSTANCE) ? this.resources.getString(C20839R.string.gated_options_index_options_filter_extended_hours_tooltip, DateStrings2.formatTo24HourTime(17, 0, LocalTimeFormatter.SHORT_OPTIONAL_MINUTE)) : null, 15, null));
                        }
                        this.indexOptionsExtendedHoursTooltipPref.set(true);
                        currentFilters = arrayList2;
                    }
                }
            }
        }
        if (currentFilters != null) {
            return extensions2.toImmutableList(currentFilters);
        }
        return null;
    }

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo$FilterSet;", "", "filters", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;", "showFilterSet", "Lkotlinx/coroutines/flow/Flow;", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/coroutines/flow/Flow;)V", "getFilters", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowFilterSet", "()Lkotlinx/coroutines/flow/Flow;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FilterSet {
        public static final int $stable = 8;
        private final ImmutableList<CuratedListRhListViewState.Filter> filters;
        private final Flow<Boolean> showFilterSet;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FilterSet copy$default(FilterSet filterSet, ImmutableList immutableList, Flow flow, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = filterSet.filters;
            }
            if ((i & 2) != 0) {
                flow = filterSet.showFilterSet;
            }
            return filterSet.copy(immutableList, flow);
        }

        public final ImmutableList<CuratedListRhListViewState.Filter> component1() {
            return this.filters;
        }

        public final Flow<Boolean> component2() {
            return this.showFilterSet;
        }

        public final FilterSet copy(ImmutableList<CuratedListRhListViewState.Filter> filters, Flow<Boolean> showFilterSet) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            Intrinsics.checkNotNullParameter(showFilterSet, "showFilterSet");
            return new FilterSet(filters, showFilterSet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterSet)) {
                return false;
            }
            FilterSet filterSet = (FilterSet) other;
            return Intrinsics.areEqual(this.filters, filterSet.filters) && Intrinsics.areEqual(this.showFilterSet, filterSet.showFilterSet);
        }

        public int hashCode() {
            return (this.filters.hashCode() * 31) + this.showFilterSet.hashCode();
        }

        public String toString() {
            return "FilterSet(filters=" + this.filters + ", showFilterSet=" + this.showFilterSet + ")";
        }

        public FilterSet(ImmutableList<CuratedListRhListViewState.Filter> filters, Flow<Boolean> showFilterSet) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            Intrinsics.checkNotNullParameter(showFilterSet, "showFilterSet");
            this.filters = filters;
            this.showFilterSet = showFilterSet;
        }

        public final ImmutableList<CuratedListRhListViewState.Filter> getFilters() {
            return this.filters;
        }

        public final Flow<Boolean> getShowFilterSet() {
            return this.showFilterSet;
        }
    }

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo;", "Lcom/robinhood/android/common/contracts/CuratedListKey$RhList;", "<init>", "()V", "REDUCED_TRUNCATED_RH_LIST_ITEMS", "", "NUMBER_OF_TRUNCATED_RH_LIST_ITEMS", "MIN_LOADING_TIME_IN_MILLIS", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CuratedListRhListDuxo, CuratedListKey.RhList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CuratedListKey.RhList getArgs(SavedStateHandle savedStateHandle) {
            return (CuratedListKey.RhList) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CuratedListKey.RhList getArgs(CuratedListRhListDuxo curatedListRhListDuxo) {
            return (CuratedListKey.RhList) DuxoCompanion.DefaultImpls.getArgs(this, curatedListRhListDuxo);
        }
    }
}
