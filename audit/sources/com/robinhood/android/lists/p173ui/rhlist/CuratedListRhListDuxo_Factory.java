package com.robinhood.android.lists.p173ui.rhlist;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.data.CuratedListEligibleItemsFetcher;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListRhListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B»\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0004\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0004\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004¢\u0006\u0004\b-\u0010.J\b\u0010/\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo;", "eligibleItemsFetcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "directIpoApi", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "listDisclosuresStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;", "hasSeenIpoNotificationBottomSheet", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownDirectIpoOnboarding", "indexOptionsExtendedHoursTooltipPref", "indexOptionsListExtendedHoursBadgeSeenPref", "notificationSettingsStore", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CuratedListRhListDuxo_Factory implements Factory<CuratedListRhListDuxo> {
    private final Provider<CryptoHistoricalStore> cryptoHistoricalStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<DirectIpoApi> directIpoApi;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<CuratedListEligibleItemsFetcher> eligibleItemsFetcher;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasSeenIpoNotificationBottomSheet;
    private final Provider<BooleanPreference> hasShownDirectIpoOnboarding;
    private final Provider<IacInfoBannerStore> iacInfoBannerStore;
    private final Provider<BooleanPreference> indexOptionsExtendedHoursTooltipPref;
    private final Provider<BooleanPreference> indexOptionsListExtendedHoursBadgeSeenPref;
    private final Provider<ListDisclosuresStore> listDisclosuresStore;
    private final Provider<NotificationSettingStore> notificationSettingsStore;
    private final Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore;
    private final Provider<Resources> resources;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CuratedListRhListDuxo_Factory create(Provider<CuratedListEligibleItemsFetcher> provider, Provider<CuratedListStore> provider2, Provider<CuratedListItemsStore> provider3, Provider<CuratedListItemViewModeStore> provider4, Provider<CryptoQuoteStore> provider5, Provider<CryptoHistoricalStore> provider6, Provider<DirectIpoApi> provider7, Provider<EventLogger> provider8, Provider<ListDisclosuresStore> provider9, Provider<BooleanPreference> provider10, Provider<BooleanPreference> provider11, Provider<BooleanPreference> provider12, Provider<BooleanPreference> provider13, Provider<NotificationSettingStore> provider14, Provider<IacInfoBannerStore> provider15, Provider<ExperimentsStore> provider16, Provider<OptionsExtendedHoursEnabledStore> provider17, Provider<Resources> provider18, Provider<SavedStateHandle> provider19, Provider<DispatcherProvider> provider20, Provider<RxFactory> provider21, Provider<RxGlobalErrorHandler> provider22) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22);
    }

    @JvmStatic
    public static final CuratedListRhListDuxo newInstance(CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, CryptoQuoteStore cryptoQuoteStore, CryptoHistoricalStore cryptoHistoricalStore, DirectIpoApi directIpoApi, EventLogger eventLogger, ListDisclosuresStore listDisclosuresStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, BooleanPreference booleanPreference4, NotificationSettingStore notificationSettingStore, IacInfoBannerStore iacInfoBannerStore, ExperimentsStore experimentsStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, Resources resources, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(curatedListEligibleItemsFetcher, curatedListStore, curatedListItemsStore, curatedListItemViewModeStore, cryptoQuoteStore, cryptoHistoricalStore, directIpoApi, eventLogger, listDisclosuresStore, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, notificationSettingStore, iacInfoBannerStore, experimentsStore, optionsExtendedHoursEnabledStore, resources, savedStateHandle);
    }

    public CuratedListRhListDuxo_Factory(Provider<CuratedListEligibleItemsFetcher> eligibleItemsFetcher, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<DirectIpoApi> directIpoApi, Provider<EventLogger> eventLogger, Provider<ListDisclosuresStore> listDisclosuresStore, Provider<BooleanPreference> hasSeenIpoNotificationBottomSheet, Provider<BooleanPreference> hasShownDirectIpoOnboarding, Provider<BooleanPreference> indexOptionsExtendedHoursTooltipPref, Provider<BooleanPreference> indexOptionsListExtendedHoursBadgeSeenPref, Provider<NotificationSettingStore> notificationSettingsStore, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<ExperimentsStore> experimentsStore, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<Resources> resources, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
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
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
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
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public CuratedListRhListDuxo get() {
        Companion companion = INSTANCE;
        CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher = this.eligibleItemsFetcher.get();
        Intrinsics.checkNotNullExpressionValue(curatedListEligibleItemsFetcher, "get(...)");
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        CuratedListItemViewModeStore curatedListItemViewModeStore = this.curatedListItemViewModeStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemViewModeStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        CryptoHistoricalStore cryptoHistoricalStore = this.cryptoHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalStore, "get(...)");
        DirectIpoApi directIpoApi = this.directIpoApi.get();
        Intrinsics.checkNotNullExpressionValue(directIpoApi, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ListDisclosuresStore listDisclosuresStore = this.listDisclosuresStore.get();
        Intrinsics.checkNotNullExpressionValue(listDisclosuresStore, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenIpoNotificationBottomSheet.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.hasShownDirectIpoOnboarding.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = this.indexOptionsExtendedHoursTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = this.indexOptionsListExtendedHoursBadgeSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference4, "get(...)");
        NotificationSettingStore notificationSettingStore = this.notificationSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(notificationSettingStore, "get(...)");
        NotificationSettingStore notificationSettingStore2 = notificationSettingStore;
        IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        IacInfoBannerStore iacInfoBannerStore2 = iacInfoBannerStore;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ExperimentsStore experimentsStore2 = experimentsStore;
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore = this.optionsExtendedHoursEnabledStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsExtendedHoursEnabledStore, "get(...)");
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore2 = optionsExtendedHoursEnabledStore;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        Resources resources2 = resources;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CuratedListRhListDuxo curatedListRhListDuxoNewInstance = companion.newInstance(curatedListEligibleItemsFetcher, curatedListStore, curatedListItemsStore, curatedListItemViewModeStore, cryptoQuoteStore, cryptoHistoricalStore, directIpoApi, eventLogger, listDisclosuresStore, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, notificationSettingStore2, iacInfoBannerStore2, experimentsStore2, optionsExtendedHoursEnabledStore2, resources2, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(curatedListRhListDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(curatedListRhListDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(curatedListRhListDuxoNewInstance, rxGlobalErrorHandler);
        return curatedListRhListDuxoNewInstance;
    }

    /* compiled from: CuratedListRhListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¼\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0007H\u0007J \u0001\u00100\u001a\u0002012\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo_Factory;", "eligibleItemsFetcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "directIpoApi", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "listDisclosuresStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;", "hasSeenIpoNotificationBottomSheet", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownDirectIpoOnboarding", "indexOptionsExtendedHoursTooltipPref", "indexOptionsListExtendedHoursBadgeSeenPref", "notificationSettingsStore", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CuratedListRhListDuxo_Factory create(Provider<CuratedListEligibleItemsFetcher> eligibleItemsFetcher, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<DirectIpoApi> directIpoApi, Provider<EventLogger> eventLogger, Provider<ListDisclosuresStore> listDisclosuresStore, Provider<BooleanPreference> hasSeenIpoNotificationBottomSheet, Provider<BooleanPreference> hasShownDirectIpoOnboarding, Provider<BooleanPreference> indexOptionsExtendedHoursTooltipPref, Provider<BooleanPreference> indexOptionsListExtendedHoursBadgeSeenPref, Provider<NotificationSettingStore> notificationSettingsStore, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<ExperimentsStore> experimentsStore, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<Resources> resources, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
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
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new CuratedListRhListDuxo_Factory(eligibleItemsFetcher, curatedListStore, curatedListItemsStore, curatedListItemViewModeStore, cryptoQuoteStore, cryptoHistoricalStore, directIpoApi, eventLogger, listDisclosuresStore, hasSeenIpoNotificationBottomSheet, hasShownDirectIpoOnboarding, indexOptionsExtendedHoursTooltipPref, indexOptionsListExtendedHoursBadgeSeenPref, notificationSettingsStore, iacInfoBannerStore, experimentsStore, optionsExtendedHoursEnabledStore, resources, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final CuratedListRhListDuxo newInstance(CuratedListEligibleItemsFetcher eligibleItemsFetcher, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, CryptoQuoteStore cryptoQuoteStore, CryptoHistoricalStore cryptoHistoricalStore, DirectIpoApi directIpoApi, EventLogger eventLogger, ListDisclosuresStore listDisclosuresStore, BooleanPreference hasSeenIpoNotificationBottomSheet, BooleanPreference hasShownDirectIpoOnboarding, BooleanPreference indexOptionsExtendedHoursTooltipPref, BooleanPreference indexOptionsListExtendedHoursBadgeSeenPref, NotificationSettingStore notificationSettingsStore, IacInfoBannerStore iacInfoBannerStore, ExperimentsStore experimentsStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, Resources resources, SavedStateHandle savedStateHandle) {
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
            return new CuratedListRhListDuxo(eligibleItemsFetcher, curatedListStore, curatedListItemsStore, curatedListItemViewModeStore, cryptoQuoteStore, cryptoHistoricalStore, directIpoApi, eventLogger, listDisclosuresStore, hasSeenIpoNotificationBottomSheet, hasShownDirectIpoOnboarding, indexOptionsExtendedHoursTooltipPref, indexOptionsListExtendedHoursBadgeSeenPref, notificationSettingsStore, iacInfoBannerStore, experimentsStore, optionsExtendedHoursEnabledStore, resources, savedStateHandle);
        }
    }
}
