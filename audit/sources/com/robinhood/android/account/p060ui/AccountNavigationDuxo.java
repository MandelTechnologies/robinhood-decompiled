package com.robinhood.android.account.p060ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.ccpa.CcpaStore;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.ProfileStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Profile;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.shared.account.contracts.AccountNavigationTabFragmentKey;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNavigationDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aBI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountNavigationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/account/ui/AccountNavigationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "ccpaStore", "Lcom/robinhood/ccpa/CcpaStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "profileStore", "Lcom/robinhood/librobinhood/data/store/ProfileStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/ccpa/CcpaStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/librobinhood/util/PersistentCacheManager;Lcom/robinhood/librobinhood/data/store/ProfileStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "Companion", "feature-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountNavigationDuxo extends OldBaseDuxo<AccountNavigationViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final CcpaStore ccpaStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final PersistentCacheManager persistentCacheManager;
    private final ProfileStore profileStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountNavigationDuxo(AccountProvider accountProvider, CcpaStore ccpaStore, MarginSubscriptionStore marginSubscriptionStore, PersistentCacheManager persistentCacheManager, ProfileStore profileStore, RegionGateProvider regionGateProvider, UserStore userStore, SavedStateHandle savedStateHandle) {
        super(new AccountNavigationViewState(false, null, null, null, null, null, ((AccountNavigationTabFragmentKey) INSTANCE.getArgs(savedStateHandle)).getCanShowGoldBadge(), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(ccpaStore, "ccpaStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.ccpaStore = ccpaStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.persistentCacheManager = persistentCacheManager;
        this.profileStore = profileStore;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.accountProvider.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamIndividualAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$1(this.f$0, (Account) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.marginSubscriptionStore.streamCurrentMarginSubscription(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$3(this.f$0, (Optional) obj);
            }
        });
        this.ccpaStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$5(this.f$0, (User) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.profileStore.streamProfile(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$7(this.f$0, (Profile) obj);
            }
        });
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.persistentCacheManager.getSettingsPage(Constants6.ACCOUNT_MENU_PAGE_ID, ((AccountNavigationTabFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$9(this.f$0, (ApiSettingsPage) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$11(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, GoldRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$13(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(AccountNavigationDuxo accountNavigationDuxo, Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        accountNavigationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$1$lambda$0((AccountNavigationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNavigationViewState onResume$lambda$1$lambda$0(AccountNavigationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountNavigationViewState.copy$default(applyMutation, true, null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(AccountNavigationDuxo accountNavigationDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final MarginSubscription marginSubscription = (MarginSubscription) optional.component1();
        accountNavigationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$3$lambda$2(marginSubscription, (AccountNavigationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNavigationViewState onResume$lambda$3$lambda$2(MarginSubscription marginSubscription, AccountNavigationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountNavigationViewState.copy$default(applyMutation, false, marginSubscription, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(AccountNavigationDuxo accountNavigationDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        accountNavigationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$5$lambda$4(user, (AccountNavigationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNavigationViewState onResume$lambda$5$lambda$4(User user, AccountNavigationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountNavigationViewState.copy$default(applyMutation, false, null, null, null, user.getId().toString(), null, false, false, 239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(AccountNavigationDuxo accountNavigationDuxo, final Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        accountNavigationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$7$lambda$6(profile, (AccountNavigationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNavigationViewState onResume$lambda$7$lambda$6(Profile profile, AccountNavigationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountNavigationViewState.copy$default(applyMutation, false, null, null, null, null, profile.getUsername(), false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(AccountNavigationDuxo accountNavigationDuxo, final ApiSettingsPage settingsPage) {
        Intrinsics.checkNotNullParameter(settingsPage, "settingsPage");
        accountNavigationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$9$lambda$8(settingsPage, (AccountNavigationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNavigationViewState onResume$lambda$9$lambda$8(ApiSettingsPage apiSettingsPage, AccountNavigationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountNavigationViewState.copy$default(applyMutation, false, null, apiSettingsPage, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(AccountNavigationDuxo accountNavigationDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        accountNavigationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$11$lambda$10(throwable, (AccountNavigationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNavigationViewState onResume$lambda$11$lambda$10(Throwable th, AccountNavigationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountNavigationViewState.copy$default(applyMutation, false, null, null, new UiEvent(th), null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(AccountNavigationDuxo accountNavigationDuxo, final boolean z) {
        accountNavigationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationDuxo.onResume$lambda$13$lambda$12(z, (AccountNavigationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNavigationViewState onResume$lambda$13$lambda$12(boolean z, AccountNavigationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountNavigationViewState.copy$default(applyMutation, false, null, null, null, null, null, false, z, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* compiled from: AccountNavigationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountNavigationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/account/ui/AccountNavigationDuxo;", "Lcom/robinhood/shared/account/contracts/AccountNavigationTabFragmentKey;", "<init>", "()V", "feature-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountNavigationDuxo, AccountNavigationTabFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountNavigationTabFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AccountNavigationTabFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountNavigationTabFragmentKey getArgs(AccountNavigationDuxo accountNavigationDuxo) {
            return (AccountNavigationTabFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, accountNavigationDuxo);
        }
    }
}
