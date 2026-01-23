package com.robinhood.android.transfers.p271ui.deeplink;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.transfers.contracts.DepositFundsDeepLink;
import com.robinhood.android.transfers.contracts.InternationalTransfer;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferShim;
import com.robinhood.android.transfers.contracts.UkTransfer;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContexts;
import com.robinhood.android.transfers.p271ui.deeplink.DepositFundsDeepLinkEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositFundsDeepLinkDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "getIntentKeyForApacUsers", "Lio/reactivex/Single;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKeyForUkUsers", "getIntentKeyForUsUsers", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DepositFundsDeepLinkDuxo extends BaseDuxo5<Unit, DepositFundsDeepLinkEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
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
    public DepositFundsDeepLinkDuxo(AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, UserStore userStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.achRelationshipStore = achRelationshipStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.userStore.refresh(false);
        Single<R> singleFlatMap = this.userStore.getUser().firstOrError().flatMap(new Function() { // from class: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends IntentKey> apply(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                CountryCode.Supported locality = user.getOrigin().getLocality();
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                    return DepositFundsDeepLinkDuxo.this.getIntentKeyForUsUsers();
                }
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    return DepositFundsDeepLinkDuxo.this.getIntentKeyForUkUsers();
                }
                if (Affiliate.RHSG.INSTANCE.contains(locality)) {
                    return DepositFundsDeepLinkDuxo.this.getIntentKeyForApacUsers();
                }
                throw new IllegalStateException(("Unsupported country code: " + locality).toString());
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositFundsDeepLinkDuxo.onCreate$lambda$0(this.f$0, (IntentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositFundsDeepLinkDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(DepositFundsDeepLinkDuxo depositFundsDeepLinkDuxo, IntentKey intentKey) {
        Intrinsics.checkNotNull(intentKey);
        depositFundsDeepLinkDuxo.submit(new DepositFundsDeepLinkEvent.NavigateAndFinish(intentKey));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DepositFundsDeepLinkDuxo depositFundsDeepLinkDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        depositFundsDeepLinkDuxo.submit(new DepositFundsDeepLinkEvent.Error(t));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<IntentKey> getIntentKeyForApacUsers() {
        Single<IntentKey> singleJust = Single.just(new InternationalTransfer(TransferDirection.DEPOSIT, ((DepositFundsDeepLink) INSTANCE.getExtras((HasSavedState) this)).getAmount(), null, null, 12, null));
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        return singleJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<IntentKey> getIntentKeyForUkUsers() {
        Single<IntentKey> singleJust = Single.just(new UkTransfer(TransferDirectionV2.DEPOSIT, ((DepositFundsDeepLink) INSTANCE.getExtras((HasSavedState) this)).getAmount(), null, null, null, 28, null));
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        return singleJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<IntentKey> getIntentKeyForUsUsers() {
        final DepositFundsDeepLink depositFundsDeepLink = (DepositFundsDeepLink) INSTANCE.getExtras((HasSavedState) this);
        Single singleFlatMap = this.achRelationshipStore.getLinkedAchRelationships().firstOrError().flatMap(new Function() { // from class: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkDuxo$getIntentKeyForUsUsers$1$1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends IntentKey> apply(List<AchRelationship> linkedAchRelationships) {
                Intrinsics.checkNotNullParameter(linkedAchRelationships, "linkedAchRelationships");
                if (linkedAchRelationships.isEmpty()) {
                    Single<Boolean> singleForceFetchHasBrokerageAccountIfNotCached = this.this$0.accountProvider.forceFetchHasBrokerageAccountIfNotCached();
                    final DepositFundsDeepLink depositFundsDeepLink2 = depositFundsDeepLink;
                    Single<R> map = singleForceFetchHasBrokerageAccountIfNotCached.map(new Function() { // from class: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkDuxo$getIntentKeyForUsUsers$1$1.1
                        @Override // io.reactivex.functions.Function
                        public final IntentKey apply(Boolean hasAccount) {
                            Intrinsics.checkNotNullParameter(hasAccount, "hasAccount");
                            if (hasAccount.booleanValue()) {
                                return new Transfer(new TransferConfiguration.Standard(depositFundsDeepLink2.getAmount(), TransferContexts.toTransferFrequency(depositFundsDeepLink2.getFrequency()), false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, TransferContexts.toTransferAccountType(depositFundsDeepLink2.getAccountType()), 3, null), null, depositFundsDeepLink2.getEntryPoint(), null, false, false, null, null, false, 8100, null));
                            }
                            return new CreateIavRelationshipIntentKey(IavSource.DEEPLINK_QUEUED, TransferDirection.DEPOSIT, depositFundsDeepLink2.getAmount(), null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
                        }
                    });
                    Intrinsics.checkNotNull(map);
                    return map;
                }
                Single singleJust = Single.just(new TransferShim(null, new TransferConfiguration.Standard(depositFundsDeepLink.getAmount(), TransferContexts.toTransferFrequency(depositFundsDeepLink.getFrequency()), false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, TransferContexts.toTransferAccountType(depositFundsDeepLink.getAccountType()), 3, null), null, depositFundsDeepLink.getEntryPoint(), null, false, false, null, null, false, 8100, null), null, 5, null));
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "run(...)");
        return singleFlatMap;
    }

    /* compiled from: DepositFundsDeepLinkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkDuxo;", "Lcom/robinhood/android/transfers/contracts/DepositFundsDeepLink;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<DepositFundsDeepLinkDuxo, DepositFundsDeepLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public DepositFundsDeepLink getExtras(SavedStateHandle savedStateHandle) {
            return (DepositFundsDeepLink) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public DepositFundsDeepLink getExtras(DepositFundsDeepLinkDuxo depositFundsDeepLinkDuxo) {
            return (DepositFundsDeepLink) DuxoCompanion2.DefaultImpls.getExtras(this, depositFundsDeepLinkDuxo);
        }
    }
}
