package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.Logger;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferConfirmationEvent;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferConfirmationFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p355ui.identi.UiApplication;
import com.robinhood.models.util.Money;
import com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.service.protocol.ProtocolExceptions5;

/* compiled from: AchTransferConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001(Bc\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "applicationStore", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/UserApplicationStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/udf/DuxoBundle;Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/microgramsdui/MicrogramManager;Landroidx/lifecycle/SavedStateHandle;)V", "getAchRelationshipStore$feature_legacy_ach_transfers_externalDebug", "()Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "ngGoldEarningsMicrogramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "ngGoldEarningsService", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;", "onCreate", "", "onResume", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AchTransferConfirmationDuxo extends BaseDuxo5<AchTransferConfirmationViewState, AchTransferConfirmationEvent> implements HasSavedState {
    public static final String ONBOARDING_NG_GOLD_EARNINGS_ENTRYPOINT = "ng_earnings_onb_transfer";
    public static final String ONBOARDING_RECURRING_NG_GOLD_EARNINGS_ENTRYPOINT = "ng_earnings_onb_recurring";
    private final AccountStore accountStore;
    private final AchRelationshipStore achRelationshipStore;
    private final UserApplicationStore applicationStore;
    private final BalancesStore balancesStore;
    private final ExperimentsStore experimentsStore;
    private final MicrogramComponent ngGoldEarningsMicrogramComponent;
    private final NGGoldEarningsService ngGoldEarningsService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: getAchRelationshipStore$feature_legacy_ach_transfers_externalDebug, reason: from getter */
    public final AchRelationshipStore getAchRelationshipStore() {
        return this.achRelationshipStore;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AchTransferConfirmationDuxo(UserApplicationStore applicationStore, AchRelationshipStore achRelationshipStore, BalancesStore balancesStore, ExperimentsStore experimentsStore, AccountStore accountStore, LazyMoshi moshi, DuxoBundle duxoBundle, Context context, Navigator navigator, MicrogramManager microgramManager, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new AchTransferConfirmationViewState(((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getAchTransfer(), null, ((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getAutomaticDeposit(), ((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).isQueuedDeposit(), ((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getMaxEarlyAccessAmount(), ((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).isFromOnboardingRadExp(), ((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getAmountMoney(), ((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getAccount(), null, false, null, ((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getShouldCleanupOnboardingRecurringContent(), ((AchTransferConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getUnclearedDeposits(), 1794, null), duxoBundle);
        this.applicationStore = applicationStore;
        this.achRelationshipStore = achRelationshipStore;
        this.balancesStore = balancesStore;
        this.experimentsStore = experimentsStore;
        this.accountStore = accountStore;
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent componentWithUiLaunch = RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication("app-ng-gold-earnings-in-deposit-step", null, 2, null), getLifecycleScope(), moshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator)), new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferConfirmationDuxo.ngGoldEarningsMicrogramComponent$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferConfirmationDuxo.ngGoldEarningsMicrogramComponent$lambda$1(this.f$0, (DialogFragmentKey) obj);
            }
        });
        this.ngGoldEarningsMicrogramComponent = componentWithUiLaunch;
        this.ngGoldEarningsService = (NGGoldEarningsService) componentWithUiLaunch.getServiceLocator().getClient(NGGoldEarningsService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ngGoldEarningsMicrogramComponent$lambda$0(FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("ng gold earnings service doesn't launch UI.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ngGoldEarningsMicrogramComponent$lambda$1(AchTransferConfirmationDuxo achTransferConfirmationDuxo, DialogFragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        achTransferConfirmationDuxo.submit(new AchTransferConfirmationEvent.LaunchNgGoldEarningsBottomSheet(key));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        String str;
        Money amount;
        super.onCreate();
        Companion companion = INSTANCE;
        if (((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).isQueuedDeposit() || ((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).isFromOnboardingRadExp()) {
            if (((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).isQueuedDeposit()) {
                str = ONBOARDING_NG_GOLD_EARNINGS_ENTRYPOINT;
            } else {
                str = ONBOARDING_RECURRING_NG_GOLD_EARNINGS_ENTRYPOINT;
            }
            if (((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).isQueuedDeposit()) {
                amount = ((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).getAmountMoney();
            } else {
                AutomaticDeposit automaticDeposit = ((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).getAutomaticDeposit();
                amount = automaticDeposit != null ? automaticDeposit.getAmount() : null;
            }
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C301711(amount, str, null), 3, null);
        }
    }

    /* compiled from: AchTransferConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$onCreate$1", m3645f = "AchTransferConfirmationDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$onCreate$1 */
    static final class C301711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Money $amount;
        final /* synthetic */ String $entryPoint;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C301711(Money money, String str, Continuation<? super C301711> continuation) {
            super(2, continuation);
            this.$amount = money;
            this.$entryPoint = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AchTransferConfirmationDuxo.this.new C301711(this.$amount, this.$entryPoint, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            BigDecimal decimalValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    NGGoldEarningsService nGGoldEarningsService = AchTransferConfirmationDuxo.this.ngGoldEarningsService;
                    Money money = this.$amount;
                    Double dBoxDouble = boxing.boxDouble((money == null || (decimalValue = money.getDecimalValue()) == null) ? 0.0d : decimalValue.doubleValue());
                    String str = this.$entryPoint;
                    this.label = 1;
                    if (nGGoldEarningsService.showNewUserBottomSheetIfEligible(dBoxDouble, str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                Logger.INSTANCE.mo1681e("Error calling app-ng-gold-earnings-in-deposit-step showNewUserBottomSheetIfEligible:" + th + ", microgram error: " + ProtocolExceptions5.asMicrogramError(th), new Object[0]);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        AutomaticDeposit.DestinationAccount destinationAccount;
        String achRelationshipId;
        super.onResume();
        this.balancesStore.refreshIndividualAccount(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(asObservable(this.balancesStore.streamIndividualAccountUnifiedBalances())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferConfirmationDuxo.onResume$lambda$2(this.f$0, (UnifiedBalances) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, UserApplicationStore.pollApplicationUntilFinalObservable$default(this.applicationStore, null, 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferConfirmationDuxo.onResume$lambda$3(this.f$0, (UiApplication) obj);
            }
        });
        Companion companion = INSTANCE;
        if (((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).isFromOnboardingRadExp() && ((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).getShouldCleanupOnboardingRecurringContent()) {
            this.achRelationshipStore.refresh(false);
            AutomaticDeposit automaticDeposit = ((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).getAutomaticDeposit();
            UUID uuidFromString = (automaticDeposit == null || (achRelationshipId = automaticDeposit.getAchRelationshipId()) == null) ? null : UUID.fromString(achRelationshipId);
            if (uuidFromString != null) {
                ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getAchRelationship(uuidFromString), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AchTransferConfirmationDuxo.onResume$lambda$5(this.f$0, (AchRelationship) obj);
                    }
                }, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AchTransferConfirmationDuxo.onResume$lambda$6(this.f$0, (Throwable) obj);
                    }
                }, null, null, 12, null);
            }
            AutomaticDeposit automaticDeposit2 = ((AchTransferConfirmationFragment.Args) companion.getArgs((HasSavedState) this)).getAutomaticDeposit();
            String accountId = (automaticDeposit2 == null || (destinationAccount = automaticDeposit2.getDestinationAccount()) == null) ? null : destinationAccount.getAccountId();
            if (accountId != null) {
                ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.accountStore.streamAccount(accountId), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AchTransferConfirmationDuxo.onResume$lambda$7(this.f$0, (Account) obj);
                    }
                }, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AchTransferConfirmationDuxo.onResume$lambda$8(this.f$0, (Throwable) obj);
                    }
                }, null, null, 12, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(AchTransferConfirmationDuxo achTransferConfirmationDuxo, UnifiedBalances unifiedBalances) {
        Intrinsics.checkNotNullParameter(unifiedBalances, "unifiedBalances");
        achTransferConfirmationDuxo.applyMutation(new AchTransferConfirmationDuxo2(unifiedBalances, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(AchTransferConfirmationDuxo achTransferConfirmationDuxo, UiApplication application) {
        Intrinsics.checkNotNullParameter(application, "application");
        achTransferConfirmationDuxo.applyMutation(new AchTransferConfirmationDuxo3(application, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(AchTransferConfirmationDuxo achTransferConfirmationDuxo, AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        achTransferConfirmationDuxo.applyMutation(new AchTransferConfirmationDuxo4(achRelationship, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(AchTransferConfirmationDuxo achTransferConfirmationDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, error, true, null, 4, null);
        achTransferConfirmationDuxo.applyMutation(new AchTransferConfirmationDuxo5(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(AchTransferConfirmationDuxo achTransferConfirmationDuxo, Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        achTransferConfirmationDuxo.applyMutation(new AchTransferConfirmationDuxo6(account, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(AchTransferConfirmationDuxo achTransferConfirmationDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, error, true, null, 4, null);
        achTransferConfirmationDuxo.applyMutation(new AchTransferConfirmationDuxo7(null));
        return Unit.INSTANCE;
    }

    /* compiled from: AchTransferConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Args;", "<init>", "()V", "ONBOARDING_NG_GOLD_EARNINGS_ENTRYPOINT", "", "ONBOARDING_RECURRING_NG_GOLD_EARNINGS_ENTRYPOINT", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AchTransferConfirmationDuxo, AchTransferConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchTransferConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AchTransferConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchTransferConfirmationFragment.Args getArgs(AchTransferConfirmationDuxo achTransferConfirmationDuxo) {
            return (AchTransferConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, achTransferConfirmationDuxo);
        }
    }
}
