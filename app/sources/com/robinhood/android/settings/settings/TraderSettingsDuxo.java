package com.robinhood.android.settings.settings;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.accountrefresher.AccountIacRefresher;
import com.robinhood.android.common.mcduckling.location.LocationProtectionManager;
import com.robinhood.android.instant.p160ui.InstantCashLogger;
import com.robinhood.android.instant.p160ui.InstantCashLogger2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.android.settings.models.api.ApiSettingsSelectOneUpdateRequest;
import com.robinhood.android.settings.models.api.ApiSettingsToggleUpdateRequest;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.settings.TraderSettingsDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.settings.api.SettingsBonfireApi;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.settings.iibsettings.BaseSettingsDuxo;
import com.robinhood.shared.settings.iibsettings.BaseSettingsFragment;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TraderSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001/BY\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020%H\u0016J\b\u0010-\u001a\u00020\u001eH\u0016J\b\u0010.\u001a\u00020\u001eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/settings/settings/TraderSettingsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsDuxo;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "settingsBonfireApi", "Lcom/robinhood/shared/settings/api/SettingsBonfireApi;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "accountIacRefresher", "Lcom/robinhood/android/accountrefresher/AccountIacRefresher;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/shared/settings/api/SettingsBonfireApi;Lcom/robinhood/librobinhood/util/PersistentCacheManager;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;Lcom/robinhood/android/accountrefresher/AccountIacRefresher;Lcom/robinhood/android/instant/ui/InstantCashLogger;Lcom/robinhood/utils/ReleaseVersion;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "onStop", "fetchSettingsPage", "updateToggleSetting", "toggleItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;", "newValue", "", "updateSelectOneSetting", "selectOneItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;", "selection", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem$Option;", "updateLocationProtection", "enabled", "refreshAccountsAndIacBanners", "logTapSwitchToCashAccount", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class TraderSettingsDuxo extends OldBaseDuxo<TraderSettingsViewState> implements HasSavedState, BaseSettingsDuxo {
    private final AccountIacRefresher accountIacRefresher;
    private final AccountProvider accountProvider;
    private final BonfireApi bonfireApi;
    private final InstantCashLogger instantCashLogger;
    private final LocationProtectionManager locationProtectionManager;
    private final MinervaAccountStore minervaAccountStore;
    private final PersistentCacheManager persistentCacheManager;
    private final SavedStateHandle savedStateHandle;
    private final SettingsBonfireApi settingsBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TraderSettingsDuxo(BonfireApi bonfireApi, SettingsBonfireApi settingsBonfireApi, PersistentCacheManager persistentCacheManager, AccountProvider accountProvider, MinervaAccountStore minervaAccountStore, LocationProtectionManager locationProtectionManager, AccountIacRefresher accountIacRefresher, InstantCashLogger instantCashLogger, ReleaseVersion releaseVersion, SavedStateHandle savedStateHandle) {
        super(new TraderSettingsViewState(null, null, null, null, null, releaseVersion.getVersionName(), 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(settingsBonfireApi, "settingsBonfireApi");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
        Intrinsics.checkNotNullParameter(accountIacRefresher, "accountIacRefresher");
        Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.bonfireApi = bonfireApi;
        this.settingsBonfireApi = settingsBonfireApi;
        this.persistentCacheManager = persistentCacheManager;
        this.accountProvider = accountProvider;
        this.minervaAccountStore = minervaAccountStore;
        this.locationProtectionManager = locationProtectionManager;
        this.accountIacRefresher = accountIacRefresher;
        this.instantCashLogger = instantCashLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        Observable observableJust;
        Observable<Account> observableStreamAccount;
        super.onResume();
        fetchSettingsPage();
        Companion companion = INSTANCE;
        String accountNumber = ((BaseSettingsFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber == null || (observableStreamAccount = this.accountProvider.streamAccount(accountNumber)) == null || (observableJust = ObservablesKt.toOptionals(observableStreamAccount)) == null) {
            observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        }
        if (Intrinsics.areEqual(((BaseSettingsFragment.Args) companion.getArgs((HasSavedState) this)).getPageId(), Constants6.CASH_MANAGEMENT_SETTINGS_PAGE_ID)) {
            Observable map = MinervaAccountStore.streamAccount$default(this.minervaAccountStore, null, 1, null).map(new Function() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo.onResume.1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(MinervaAccount it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.getLocationProtectionEnabled());
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TraderSettingsDuxo.onResume$lambda$1(this.f$0, (Boolean) obj);
                }
            });
        }
        if (Intrinsics.areEqual(((BaseSettingsFragment.Args) companion.getArgs((HasSavedState) this)).getPageId(), Constants6.DAY_TRADE_SETTINGS_PAGE_ID)) {
            LifecycleHost.DefaultImpls.bind$default(this, observableJust, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1<?, Unit>() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo.onResume.3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((Optional<Account>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(Optional<Account> optional) {
                    InstantCashLogger.logScreenAppear$default(TraderSettingsDuxo.this.instantCashLogger, optional.getOrNull(), new Screen(Screen.Name.DAY_TRADE_SETTINGS, null, null, null, 14, null), null, true, 4, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(TraderSettingsDuxo traderSettingsDuxo, final Boolean bool) {
        traderSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsDuxo.onResume$lambda$1$lambda$0(bool, (TraderSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TraderSettingsViewState onResume$lambda$1$lambda$0(Boolean bool, TraderSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TraderSettingsViewState.copy$default(applyMutation, null, null, bool, null, null, null, 59, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStop() {
        if (Intrinsics.areEqual(((BaseSettingsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getPageId(), Constants6.DAY_TRADE_SETTINGS_PAGE_ID)) {
            InstantCashLogger.logScreenDisappear$default(this.instantCashLogger, getStatesFlow().getValue().getActiveAccount(), new Screen(Screen.Name.DAY_TRADE_SETTINGS, null, null, null, 14, null), null, true, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchSettingsPage() {
        Observable observableJust;
        Observable<Account> observableStreamAccount;
        Observables observables = Observables.INSTANCE;
        Companion companion = INSTANCE;
        String accountNumber = ((BaseSettingsFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber == null || (observableStreamAccount = this.accountProvider.streamAccount(accountNumber)) == null || (observableJust = ObservablesKt.toOptionals(observableStreamAccount)) == null) {
            observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        }
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(observableJust, this.persistentCacheManager.getSettingsPage(((BaseSettingsFragment.Args) companion.getArgs((HasSavedState) this)).getPageId(), ((BaseSettingsFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber())), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsDuxo.fetchSettingsPage$lambda$4(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsDuxo.fetchSettingsPage$lambda$6(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchSettingsPage$lambda$4(final TraderSettingsDuxo traderSettingsDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final Optional optional = (Optional) tuples2.component1();
        final ApiSettingsPage apiSettingsPage = (ApiSettingsPage) tuples2.component2();
        Account account = (Account) optional.getOrNull();
        final boolean z = false;
        if (account != null && account.isManaged()) {
            z = true;
        }
        traderSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsDuxo.fetchSettingsPage$lambda$4$lambda$3(z, traderSettingsDuxo, optional, apiSettingsPage, (TraderSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TraderSettingsViewState fetchSettingsPage$lambda$4$lambda$3(boolean z, TraderSettingsDuxo traderSettingsDuxo, Optional optional, ApiSettingsPage apiSettingsPage, TraderSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (z && Intrinsics.areEqual(((BaseSettingsFragment.Args) INSTANCE.getArgs((HasSavedState) traderSettingsDuxo)).getPageId(), Constants6.DAY_TRADE_SETTINGS_PAGE_ID)) {
            return TraderSettingsViewState.copy$default(applyMutation, (Account) optional.getOrNull(), null, null, null, new UiEvent(Unit.INSTANCE), null, 46, null);
        }
        return TraderSettingsViewState.copy$default(applyMutation, (Account) optional.getOrNull(), apiSettingsPage, null, null, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchSettingsPage$lambda$6(TraderSettingsDuxo traderSettingsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        traderSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsDuxo.fetchSettingsPage$lambda$6$lambda$5(throwable, (TraderSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TraderSettingsViewState fetchSettingsPage$lambda$6$lambda$5(Throwable th, TraderSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TraderSettingsViewState.copy$default(applyMutation, null, null, null, new UiEvent(th), null, null, 55, null);
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsDuxo
    public void updateToggleSetting(TypedSettingsItem.ToggleItem toggleItem, boolean newValue) {
        Intrinsics.checkNotNullParameter(toggleItem, "toggleItem");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C283291(new ApiSettingsToggleUpdateRequest(toggleItem.getSettingId(), newValue, ((BaseSettingsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), null), 3, null);
    }

    /* compiled from: TraderSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.settings.TraderSettingsDuxo$updateToggleSetting$1", m3645f = "TraderSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.settings.TraderSettingsDuxo$updateToggleSetting$1 */
    static final class C283291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiSettingsToggleUpdateRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283291(ApiSettingsToggleUpdateRequest apiSettingsToggleUpdateRequest, Continuation<? super C283291> continuation) {
            super(2, continuation);
            this.$request = apiSettingsToggleUpdateRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderSettingsDuxo.this.new C283291(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BonfireApi bonfireApi = TraderSettingsDuxo.this.bonfireApi;
                    ApiSettingsToggleUpdateRequest apiSettingsToggleUpdateRequest = this.$request;
                    this.label = 1;
                    if (bonfireApi.updateToggleSetting(apiSettingsToggleUpdateRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                TraderSettingsDuxo.this.fetchSettingsPage();
            } catch (Exception e) {
                TraderSettingsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$updateToggleSetting$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TraderSettingsDuxo.C283291.invokeSuspend$lambda$0(e, (TraderSettingsViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TraderSettingsViewState invokeSuspend$lambda$0(Exception exc, TraderSettingsViewState traderSettingsViewState) {
            return TraderSettingsViewState.copy$default(traderSettingsViewState, null, null, null, new UiEvent(exc), null, null, 55, null);
        }
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsDuxo
    public void updateSelectOneSetting(TypedSettingsItem.SelectOneItem selectOneItem, TypedSettingsItem.SelectOneItem.Option selection) {
        Intrinsics.checkNotNullParameter(selectOneItem, "selectOneItem");
        Intrinsics.checkNotNullParameter(selection, "selection");
        getLifecycleScope().launchWhenStarted(new C283281(new ApiSettingsSelectOneUpdateRequest(selectOneItem.getId(), selection.getValue()), null));
    }

    /* compiled from: TraderSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.settings.TraderSettingsDuxo$updateSelectOneSetting$1", m3645f = "TraderSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.settings.TraderSettingsDuxo$updateSelectOneSetting$1 */
    static final class C283281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiSettingsSelectOneUpdateRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283281(ApiSettingsSelectOneUpdateRequest apiSettingsSelectOneUpdateRequest, Continuation<? super C283281> continuation) {
            super(2, continuation);
            this.$request = apiSettingsSelectOneUpdateRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderSettingsDuxo.this.new C283281(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SettingsBonfireApi settingsBonfireApi = TraderSettingsDuxo.this.settingsBonfireApi;
                    ApiSettingsSelectOneUpdateRequest apiSettingsSelectOneUpdateRequest = this.$request;
                    this.label = 1;
                    if (settingsBonfireApi.updateSelectOneSetting(apiSettingsSelectOneUpdateRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                TraderSettingsDuxo.this.fetchSettingsPage();
            } catch (Throwable th) {
                TraderSettingsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$updateSelectOneSetting$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TraderSettingsDuxo.C283281.invokeSuspend$lambda$0(th, (TraderSettingsViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TraderSettingsViewState invokeSuspend$lambda$0(Throwable th, TraderSettingsViewState traderSettingsViewState) {
            return TraderSettingsViewState.copy$default(traderSettingsViewState, null, null, null, new UiEvent(th), null, null, 55, null);
        }
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsDuxo
    public void updateLocationProtection(final boolean enabled) {
        Completable completableFlatMapCompletable = this.minervaAccountStore.streamAccount(ApiMinervaAccount.Type.BROKERAGE).firstOrError().map(new Function() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo.updateLocationProtection.1
            @Override // io.reactivex.functions.Function
            public final UUID apply(MinervaAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        }).flatMapCompletable(new Function() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo.updateLocationProtection.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(UUID minervaAccountId) {
                Intrinsics.checkNotNullParameter(minervaAccountId, "minervaAccountId");
                return TraderSettingsDuxo.this.locationProtectionManager.toggleLocationProtection(minervaAccountId, enabled);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableFlatMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TraderSettingsDuxo.updateLocationProtection$lambda$8(this.f$0, enabled);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsDuxo.updateLocationProtection$lambda$10(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateLocationProtection$lambda$8(TraderSettingsDuxo traderSettingsDuxo, final boolean z) {
        traderSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsDuxo.updateLocationProtection$lambda$8$lambda$7(z, (TraderSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TraderSettingsViewState updateLocationProtection$lambda$8$lambda$7(boolean z, TraderSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TraderSettingsViewState.copy$default(applyMutation, null, null, Boolean.valueOf(z), null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateLocationProtection$lambda$10(TraderSettingsDuxo traderSettingsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        traderSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsDuxo.updateLocationProtection$lambda$10$lambda$9(throwable, (TraderSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TraderSettingsViewState updateLocationProtection$lambda$10$lambda$9(Throwable th, TraderSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TraderSettingsViewState.copy$default(applyMutation, null, null, null, new UiEvent(th), null, null, 55, null);
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsDuxo
    public void refreshAccountsAndIacBanners() {
        this.accountIacRefresher.refresh(CollectionsKt.listOf((Object[]) new IacInfoBannerLocation[]{IacInfoBannerLocation.INFO_BANNER_HOME_PAGE_TOP_LEVEL, IacInfoBannerLocation.INFO_BANNER_STOCK_DETAIL_PAGE_MOBILE_TOP_LEVEL}), ((BaseSettingsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber());
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsDuxo
    public void logTapSwitchToCashAccount() {
        InstantCashLogger.logTap$default(this.instantCashLogger, getStatesFlow().getValue().getActiveAccount(), null, new Screen(Screen.Name.DAY_TRADE_SETTINGS, null, null, null, 14, null), Component.ComponentType.BUTTON, InstantCashLogger2.SWITCH_TO_CASH_ACCOUNT.getValue(), null, false, 34, null);
    }

    /* compiled from: TraderSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/settings/settings/TraderSettingsDuxo;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment$Args;", "<init>", "()V", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TraderSettingsDuxo, BaseSettingsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BaseSettingsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BaseSettingsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BaseSettingsFragment.Args getArgs(TraderSettingsDuxo traderSettingsDuxo) {
            return (BaseSettingsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, traderSettingsDuxo);
        }
    }
}
