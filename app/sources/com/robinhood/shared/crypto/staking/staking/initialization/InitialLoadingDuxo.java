package com.robinhood.shared.crypto.staking.staking.initialization;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingEvent;
import com.robinhood.shared.crypto.staking.staking.utils.ErrorHandlingUtils;
import com.robinhood.shared.crypto.staking.staking.utils.OrderTypes2;
import com.robinhood.shared.crypto.staking.staking.utils.StakingCrashReporter;
import com.robinhood.shared.staking.contracts.CryptoStakingIntentKey;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitialLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0006\u0010\u0011\u001a\u00020\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "initialize", "Companion", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InitialLoadingDuxo extends BaseDuxo5<Unit, InitialLoadingEvent> implements HasArgs<CryptoStakingIntentKey> {
    private final CryptoStakingStore cryptoStakingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoStakingIntentKey getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoStakingIntentKey) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialLoadingDuxo(CryptoStakingStore cryptoStakingStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoStakingStore = cryptoStakingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        initialize();
    }

    /* compiled from: InitialLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingDuxo$initialize$1", m3645f = "InitialLoadingDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingDuxo$initialize$1 */
    static final class C377871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C377871(Continuation<? super C377871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InitialLoadingDuxo.this.new C377871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C377871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objFetchConfig$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoStakingStore cryptoStakingStore = InitialLoadingDuxo.this.cryptoStakingStore;
                    Companion companion = InitialLoadingDuxo.INSTANCE;
                    UUID currencyPairId = ((CryptoStakingIntentKey) companion.getArgs((HasArgs) InitialLoadingDuxo.this)).getCurrencyPairId();
                    ApiCryptoStakingOrder.OrderType apiOrderType = OrderTypes2.getApiOrderType(((CryptoStakingIntentKey) companion.getArgs((HasArgs) InitialLoadingDuxo.this)).getOrderType());
                    this.label = 1;
                    objFetchConfig$default = CryptoStakingStore.fetchConfig$default(cryptoStakingStore, currencyPairId, apiOrderType, null, this, 4, null);
                    if (objFetchConfig$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objFetchConfig$default = obj;
                }
                StakingConfig stakingConfig = (StakingConfig) objFetchConfig$default;
                Tuples2 tuples2M3642to = Tuples4.m3642to(stakingConfig.getIntroPage(), stakingConfig.getOnboardingPage());
                StakingConfig.OnboardingPage onboardingPage = (StakingConfig.OnboardingPage) tuples2M3642to.component1();
                StakingConfig.OnboardingPage onboardingPage2 = (StakingConfig.OnboardingPage) tuples2M3642to.component2();
                if (!stakingConfig.getHasCryptoAccount()) {
                    InitialLoadingDuxo.this.submit(InitialLoadingEvent.PromptCryptoAccountAgreement.INSTANCE);
                } else if ((!stakingConfig.getDepositsEnabled() && ((CryptoStakingIntentKey) InitialLoadingDuxo.INSTANCE.getArgs((HasArgs) InitialLoadingDuxo.this)).getOrderType() == CryptoStakingIntentKey.OrderType.DEPOSIT) || (!stakingConfig.getWithdrawalsEnabled() && ((CryptoStakingIntentKey) InitialLoadingDuxo.INSTANCE.getArgs((HasArgs) InitialLoadingDuxo.this)).getOrderType() == CryptoStakingIntentKey.OrderType.WITHDRAW)) {
                    InitialLoadingDuxo.this.submit(InitialLoadingEvent.StakingNotAvailable.INSTANCE);
                } else if (((CryptoStakingIntentKey) InitialLoadingDuxo.INSTANCE.getArgs((HasArgs) InitialLoadingDuxo.this)).getShowIntroScreen() && onboardingPage != null) {
                    InitialLoadingDuxo.this.submit(new InitialLoadingEvent.ShowInterstitial(onboardingPage));
                } else if (onboardingPage2 != null) {
                    InitialLoadingDuxo.this.submit(new InitialLoadingEvent.ShowInterstitial(onboardingPage2));
                } else {
                    InitialLoadingDuxo.this.submit(InitialLoadingEvent.ShowInputPage.INSTANCE);
                }
            } catch (Throwable th) {
                ErrorHandlingUtils.throwIfCancellation(th);
                if (!Throwables.isNetworkRelated(th)) {
                    StakingCrashReporter.logNonFatal$default(StakingCrashReporter.INSTANCE, th, "staking_initialization", "get_initial_page", OrderTypes2.getApiOrderType(((CryptoStakingIntentKey) InitialLoadingDuxo.INSTANCE.getArgs((HasArgs) InitialLoadingDuxo.this)).getOrderType()), null, 16, null);
                }
                InitialLoadingDuxo.this.submit(new InitialLoadingEvent.Error(th));
            }
            return Unit.INSTANCE;
        }
    }

    public final void initialize() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C377871(null), 3, null);
    }

    /* compiled from: InitialLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingDuxo;", "Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey;", "<init>", "()V", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<InitialLoadingDuxo, CryptoStakingIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoStakingIntentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoStakingIntentKey) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoStakingIntentKey getArgs(InitialLoadingDuxo initialLoadingDuxo) {
            return (CryptoStakingIntentKey) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, initialLoadingDuxo);
        }
    }
}
