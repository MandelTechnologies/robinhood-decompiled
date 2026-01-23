package com.robinhood.android.accountcenter;

import android.graphics.Bitmap;
import com.robinhood.android.accountcenter.AccountCenterDuxo;
import com.robinhood.android.accountcenter.AccountCenterViewState2;
import com.robinhood.android.accountcenter.AccountCenterViewState3;
import com.robinhood.android.accountcenter.AccountCenterViewState4;
import com.robinhood.android.accountcenter.experiments.RhubarbExperiment;
import com.robinhood.android.accountcenter.experiments.RhubarbExperiment2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterPage;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.regiongate.FeatureDiscoveryRegionGate;
import com.robinhood.android.regiongate.GbpRegionGate;
import com.robinhood.android.regiongate.McwCurrencySwitcherRegionGate;
import com.robinhood.android.regiongate.ReferralsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.ToolbarSearchIconRegionGate;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountCenterStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.FeatureDiscoveryStore;
import com.robinhood.librobinhood.data.store.ProfileStore;
import com.robinhood.librobinhood.data.store.ReferralStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.ApiProfile;
import com.robinhood.models.api.FeatureDiscoveryLocation;
import com.robinhood.models.api.media.ApiMediaMetadata;
import com.robinhood.models.p320db.Profile;
import com.robinhood.models.p320db.Referral;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.common.store.media.MediaStore;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryResponse3;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountCenterDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bc\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u0006\u0010\u001f\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\"J\"\u0010&\u001a\u00020\u001c2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0(2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0006\u0010)\u001a\u00020\u001cJ\b\u0010*\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/accountcenter/AccountCenterViewState;", "accountCenterStore", "Lcom/robinhood/librobinhood/data/store/AccountCenterStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "profileStore", "Lcom/robinhood/librobinhood/data/store/ProfileStore;", "referralStore", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "mediaStore", "Lcom/robinhood/shared/common/store/media/MediaStore;", "featureDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountCenterStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/ProfileStore;Lcom/robinhood/librobinhood/data/store/ReferralStore;Lcom/robinhood/shared/common/store/media/MediaStore;Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;Lcom/robinhood/prefs/IntPreference;)V", "onCreate", "", "onResume", "pollAccountCenterStore", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "updatePictureToMediaStore", "profilePictureLocal", "Landroid/graphics/Bitmap;", "updatePictureToProfileStore", "mediaId", "Ljava/util/UUID;", "updatePictureToProfileStoreInternal", "mediaIdSingle", "Lio/reactivex/Single;", "removePicture", "refreshProfileStore", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountCenterDuxo extends OldBaseDuxo<AccountCenterViewState> {
    public static final int $stable = 8;
    private final AccountCenterStore accountCenterStore;
    private final AccountProvider accountProvider;
    private final AccountSelectorHomeManager accountSelectorHomeManager;
    private final IntPreference accountTabCurrencyPref;
    private final ExperimentsStore experimentsStore;
    private final FeatureDiscoveryStore featureDiscoveryStore;
    private final MediaStore mediaStore;
    private final ProfileStore profileStore;
    private final ReferralStore referralStore;
    private final RegionGateProvider regionGateProvider;
    private final TransferAccountStore transferAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterDuxo(AccountCenterStore accountCenterStore, ExperimentsStore experimentsStore, ProfileStore profileStore, ReferralStore referralStore, MediaStore mediaStore, FeatureDiscoveryStore featureDiscoveryStore, TransferAccountStore transferAccountStore, RegionGateProvider regionGateProvider, AccountProvider accountProvider, AccountSelectorHomeManager accountSelectorHomeManager, @DisplayCurrencySelectionPrefs IntPreference accountTabCurrencyPref) {
        super(new AccountCenterViewState(null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 32767, null), null, 2, null);
        Intrinsics.checkNotNullParameter(accountCenterStore, "accountCenterStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(referralStore, "referralStore");
        Intrinsics.checkNotNullParameter(mediaStore, "mediaStore");
        Intrinsics.checkNotNullParameter(featureDiscoveryStore, "featureDiscoveryStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
        this.accountCenterStore = accountCenterStore;
        this.experimentsStore = experimentsStore;
        this.profileStore = profileStore;
        this.referralStore = referralStore;
        this.mediaStore = mediaStore;
        this.featureDiscoveryStore = featureDiscoveryStore;
        this.transferAccountStore = transferAccountStore;
        this.regionGateProvider = regionGateProvider;
        this.accountProvider = accountProvider;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.accountTabCurrencyPref = accountTabCurrencyPref;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        pollAccountCenterStore();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.getIndividualAccountNumber(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ToolbarSearchIconRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ReferralsRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$5(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable observableStreamRegionGateState$default = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, GbpRegionGate.INSTANCE, false, 2, null);
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        McwCurrencySwitcherRegionGate mcwCurrencySwitcherRegionGate = McwCurrencySwitcherRegionGate.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(observableStreamRegionGateState$default, RegionGateProvider.DefaultImpls.streamRegionGateState$default(regionGateProvider, mcwCurrencySwitcherRegionGate, false, 2, null), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$onCreate$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) Boolean.valueOf(((Boolean) t1).booleanValue() && !((Boolean) t2).booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        LifecycleHost.DefaultImpls.bind$default(this, observableCombineLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, mcwCurrencySwitcherRegionGate, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AccountCenterDuxo accountCenterDuxo, final Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$1$lambda$0(it, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onCreate$lambda$1$lambda$0(Optional optional, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : (String) optional.getOrNull(), (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(final AccountCenterDuxo accountCenterDuxo, final boolean z) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$3$lambda$2(z, accountCenterDuxo, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onCreate$lambda$3$lambda$2(boolean z, AccountCenterDuxo accountCenterDuxo, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : z && !accountCenterDuxo.accountSelectorHomeManager.isAccountSelectorEnabled(), (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(AccountCenterDuxo accountCenterDuxo, final boolean z) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$5$lambda$4(z, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onCreate$lambda$5$lambda$4(boolean z, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : z, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(AccountCenterDuxo accountCenterDuxo, final boolean z) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$8$lambda$7(z, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onCreate$lambda$8$lambda$7(boolean z, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : z, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(AccountCenterDuxo accountCenterDuxo, final boolean z) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onCreate$lambda$10$lambda$9(z, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onCreate$lambda$10$lambda$9(boolean z, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : z, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.profileStore.refreshProfile(true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        LifecycleHost.DefaultImpls.bind$default(this, this.profileStore.streamProfile(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$12(this.f$0, (Profile) obj);
            }
        });
        Observable observableDistinctUntilChanged = ObservablesKt.connectWhen$default(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RhubarbExperiment.INSTANCE}, false, null, 4, null), ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RhubarbExperiment2.INSTANCE}, false, null, 6, null), null, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$14(this.f$0, (Boolean) obj);
            }
        });
        this.referralStore.refresh(false);
        Observable observableDistinctUntilChanged2 = this.referralStore.getAllReferred().map(new Function() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final Integer apply(List<Referral> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.size());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$16(this.f$0, (Integer) obj);
            }
        });
        Observable observableFilter = ObservablesKt.connectWhen$default(FeatureDiscoveryStore.streamFeatureDiscoveryByLocation$default(this.featureDiscoveryStore, FeatureDiscoveryLocation.ACCOUNT_CENTER, null, 2, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, FeatureDiscoveryRegionGate.INSTANCE, false, 2, null), null, 2, null).filter(new Predicate() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo.onResume.5
            @Override // io.reactivex.functions.Predicate
            public final boolean test(FeatureDiscoveryResponse data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return FeatureDiscoveryResponse3.isFromLocation(data, FeatureDiscoveryLocation.ACCOUNT_CENTER);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$18(this.f$0, (FeatureDiscoveryResponse) obj);
            }
        });
        this.transferAccountStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.transferAccountStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$20(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(AccountCenterDuxo accountCenterDuxo, final Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$12$lambda$11(profile, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onResume$lambda$12$lambda$11(Profile profile, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : profile, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(AccountCenterDuxo accountCenterDuxo, final Boolean bool) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$14$lambda$13(bool, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onResume$lambda$14$lambda$13(Boolean bool, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : bool.booleanValue(), (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(AccountCenterDuxo accountCenterDuxo, final Integer num) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$16$lambda$15(num, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onResume$lambda$16$lambda$15(Integer num, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : num, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$18(AccountCenterDuxo accountCenterDuxo, final FeatureDiscoveryResponse featureDiscoveryResponse) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$18$lambda$17(featureDiscoveryResponse, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onResume$lambda$18$lambda$17(FeatureDiscoveryResponse featureDiscoveryResponse, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : featureDiscoveryResponse, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$20(AccountCenterDuxo accountCenterDuxo, final List transferAccounts) {
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.onResume$lambda$20$lambda$19(transferAccounts, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState onResume$lambda$20$lambda$19(List list, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : list);
    }

    private final void pollAccountCenterStore() {
        Observable observableSwitchMap = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null).flatMap(new Function() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo.pollAccountCenterStore.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DisplayCurrency> apply(Boolean enabled) {
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    return DisplayCurrencyExtensions.displayCurrencyObservable(AccountCenterDuxo.this.accountTabCurrencyPref);
                }
                Observable observableJust = Observable.just(DisplayCurrency.USD);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        }).distinctUntilChanged().doOnNext(new C82742()).switchMap(new Function() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo.pollAccountCenterStore.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiAccountCenterPage> apply(DisplayCurrency it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AccountCenterDuxo.this.accountCenterStore.backendPollAccountCenterPage(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.pollAccountCenterStore$lambda$22(this.f$0, (ApiAccountCenterPage) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.pollAccountCenterStore$lambda$24(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: AccountCenterDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.AccountCenterDuxo$pollAccountCenterStore$2 */
    static final class C82742<T> implements Consumer {
        C82742() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AccountCenterViewState accept$lambda$0(AccountCenterViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : AccountCenterViewState2.Loading.INSTANCE, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(DisplayCurrency displayCurrency) {
            AccountCenterDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$pollAccountCenterStore$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountCenterDuxo.C82742.accept$lambda$0((AccountCenterViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pollAccountCenterStore$lambda$22(AccountCenterDuxo accountCenterDuxo, final ApiAccountCenterPage apiAccountCenterPage) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.pollAccountCenterStore$lambda$22$lambda$21(apiAccountCenterPage, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState pollAccountCenterStore$lambda$22$lambda$21(ApiAccountCenterPage apiAccountCenterPage, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(apiAccountCenterPage);
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : new AccountCenterViewState2.Loaded(apiAccountCenterPage), (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pollAccountCenterStore$lambda$24(AccountCenterDuxo accountCenterDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.pollAccountCenterStore$lambda$24$lambda$23(throwable, (AccountCenterViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState pollAccountCenterStore$lambda$24$lambda$23(Throwable th, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : new AccountCenterViewState2.Error(th), (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    public final void retry() {
        applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.retry$lambda$25((AccountCenterViewState) obj);
            }
        });
        pollAccountCenterStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState retry$lambda$25(AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : AccountCenterViewState2.Loading.INSTANCE, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    public final void updatePictureToMediaStore(Bitmap profilePictureLocal) {
        Intrinsics.checkNotNullParameter(profilePictureLocal, "profilePictureLocal");
        Single<UUID> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new AccountCenterDuxo2(this, profilePictureLocal, null), 1, null).doOnError(new AccountCenterDuxo3(this, profilePictureLocal)).map(new Function() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$updatePictureToMediaStore$uploadImageSingle$3
            @Override // io.reactivex.functions.Function
            public final UUID apply(ApiMediaMetadata it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        updatePictureToProfileStoreInternal(map, profilePictureLocal);
    }

    public final void updatePictureToProfileStore(UUID mediaId, Bitmap profilePictureLocal) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Single<UUID> singleJust = Single.just(mediaId);
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        updatePictureToProfileStoreInternal(singleJust, profilePictureLocal);
    }

    static /* synthetic */ void updatePictureToProfileStoreInternal$default(AccountCenterDuxo accountCenterDuxo, Single single, Bitmap bitmap, int i, Object obj) {
        if ((i & 2) != 0) {
            bitmap = null;
        }
        accountCenterDuxo.updatePictureToProfileStoreInternal(single, bitmap);
    }

    private final void updatePictureToProfileStoreInternal(Single<UUID> mediaIdSingle, final Bitmap profilePictureLocal) {
        applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.updatePictureToProfileStoreInternal$lambda$26((AccountCenterViewState) obj);
            }
        });
        Completable completableFlatMapCompletable = mediaIdSingle.flatMapCompletable(new Function() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo.updatePictureToProfileStoreInternal.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(UUID mediaId) {
                Intrinsics.checkNotNullParameter(mediaId, "mediaId");
                return AccountCenterDuxo.this.profileStore.updateProfile(new ApiProfile.Request(null, null, mediaId, false, 11, null)).doOnError(new AnonymousClass1(AccountCenterDuxo.this, mediaId, profilePictureLocal));
            }

            /* compiled from: AccountCenterDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.accountcenter.AccountCenterDuxo$updatePictureToProfileStoreInternal$2$1, reason: invalid class name */
            static final class AnonymousClass1<T> implements Consumer {
                final /* synthetic */ UUID $mediaId;
                final /* synthetic */ Bitmap $profilePictureLocal;
                final /* synthetic */ AccountCenterDuxo this$0;

                AnonymousClass1(AccountCenterDuxo accountCenterDuxo, UUID uuid, Bitmap bitmap) {
                    this.this$0 = accountCenterDuxo;
                    this.$mediaId = uuid;
                    this.$profilePictureLocal = bitmap;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(final Throwable th) {
                    if (Throwables.isNetworkRelated(th)) {
                        AccountCenterDuxo accountCenterDuxo = this.this$0;
                        final UUID uuid = this.$mediaId;
                        final Bitmap bitmap = this.$profilePictureLocal;
                        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$updatePictureToProfileStoreInternal$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountCenterDuxo.C82762.AnonymousClass1.accept$lambda$0(uuid, th, bitmap, (AccountCenterViewState) obj);
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final AccountCenterViewState accept$lambda$0(UUID uuid, Throwable th, Bitmap bitmap, AccountCenterViewState applyMutation) {
                    Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                    Intrinsics.checkNotNull(uuid);
                    return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : new AccountCenterViewState4.FailedProfileUpdate(uuid, new UiEvent(th), bitmap), (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        bind(completableFlatMapCompletable, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterDuxo.updatePictureToProfileStoreInternal$lambda$28(this.f$0, profilePictureLocal);
            }
        }, new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.updatePictureToProfileStoreInternal$lambda$30(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState updatePictureToProfileStoreInternal$lambda$26(AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : AccountCenterViewState4.Updating.INSTANCE, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePictureToProfileStoreInternal$lambda$28(AccountCenterDuxo accountCenterDuxo, final Bitmap bitmap) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.updatePictureToProfileStoreInternal$lambda$28$lambda$27(bitmap, (AccountCenterViewState) obj);
            }
        });
        accountCenterDuxo.refreshProfileStore();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState updatePictureToProfileStoreInternal$lambda$28$lambda$27(Bitmap bitmap, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : bitmap, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : new AccountCenterViewState4.Success(new UiEvent(Unit.INSTANCE)), (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePictureToProfileStoreInternal$lambda$30(AccountCenterDuxo accountCenterDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!Throwables.isNetworkRelated(throwable)) {
            accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountCenterDuxo.updatePictureToProfileStoreInternal$lambda$30$lambda$29(throwable, (AccountCenterViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState updatePictureToProfileStoreInternal$lambda$30$lambda$29(Throwable th, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : new UiEvent(th), (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState removePicture$lambda$31(AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : AccountCenterViewState3.Removing.INSTANCE, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    public final void removePicture() {
        applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.removePicture$lambda$31((AccountCenterViewState) obj);
            }
        });
        bind(this.profileStore.updateProfile(new ApiProfile.Request(null, null, null, true, 7, null)), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function0() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterDuxo.removePicture$lambda$33(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.removePicture$lambda$36(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removePicture$lambda$33(AccountCenterDuxo accountCenterDuxo) {
        accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterDuxo.removePicture$lambda$33$lambda$32((AccountCenterViewState) obj);
            }
        });
        accountCenterDuxo.refreshProfileStore();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState removePicture$lambda$33$lambda$32(AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : new AccountCenterViewState3.Success(new UiEvent(Unit.INSTANCE)), (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removePicture$lambda$36(AccountCenterDuxo accountCenterDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountCenterDuxo.removePicture$lambda$36$lambda$34(throwable, (AccountCenterViewState) obj);
                }
            });
        } else {
            accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountCenterDuxo.removePicture$lambda$36$lambda$35(throwable, (AccountCenterViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState removePicture$lambda$36$lambda$34(Throwable th, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : new AccountCenterViewState3.Failed(new UiEvent(th)), (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState removePicture$lambda$36$lambda$35(Throwable th, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : new UiEvent(th), (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : null, (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }

    private final void refreshProfileStore() {
        LifecycleHost.DefaultImpls.bind$default(this, this.profileStore.refreshProfile(true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }
}
