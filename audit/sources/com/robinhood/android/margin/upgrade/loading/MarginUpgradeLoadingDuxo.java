package com.robinhood.android.margin.upgrade.loading;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.margin.p083ui.MarginSpendingProduct;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.MarginOnboardingStore;
import com.robinhood.android.lib.margin.MarginUpgradeRestrictionStore;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.api.ApiMarginOnboardingSplash;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.Timeout2;
import com.robinhood.coroutines.Timeout3;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.staticcontent.model.OtherMarkdown;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MarginUpgradeLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001+Bq\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010#\u001a\u00020$H\u0016J\u001e\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0082@¢\u0006\u0002\u0010*R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDataState;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "marginOnboardingStore", "Lcom/robinhood/android/lib/margin/MarginOnboardingStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "marginUpgradeRestrictionStore", "Lcom/robinhood/android/lib/margin/MarginUpgradeRestrictionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/android/lib/margin/MarginOnboardingStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/margin/MarginUpgradeRestrictionStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "fetchData", "account", "Lcom/robinhood/models/db/Account;", "eligibility", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeLoadingDuxo extends BaseDuxo<MarginUpgradeLoadingDataState, MarginUpgradeLoadingState3> implements HasSavedState {
    private static final long TIMEOUT_MILLIS = 60000;
    private final AccountProvider accountProvider;
    private final BrokerageResourceManager brokerageResourceManager;
    private final LeveredMarginSettingsStore leveredMarginSettingsStore;
    private final MarginEligibilityStore marginEligibilityStore;
    private final MarginInvestingInfoStore marginInvestingInfoStore;
    private final MarginOnboardingStore marginOnboardingStore;
    private final MarginUpgradeRestrictionStore marginUpgradeRestrictionStore;
    private final RegionGateProvider regionGateProvider;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MarginUpgradeLoadingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo", m3645f = "MarginUpgradeLoadingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 115, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 136, 144, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 147, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "fetchData")
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$fetchData$1 */
    static final class C212031 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C212031(Continuation<? super C212031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MarginUpgradeLoadingDuxo.this.fetchData(null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginUpgradeLoadingDuxo(AccountProvider accountProvider, MarginInvestingInfoStore marginInvestingInfoStore, MarginEligibilityStore marginEligibilityStore, LeveredMarginSettingsStore leveredMarginSettingsStore, MarginOnboardingStore marginOnboardingStore, RhyAccountStore rhyAccountStore, BrokerageResourceManager brokerageResourceManager, RegionGateProvider regionGateProvider, UserStore userStore, MarginUpgradeRestrictionStore marginUpgradeRestrictionStore, SavedStateHandle savedStateHandle, MarginUpgradeLoadingState2 stateProvider, DuxoBundle duxoBundle) {
        super(new MarginUpgradeLoadingDataState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        Intrinsics.checkNotNullParameter(marginOnboardingStore, "marginOnboardingStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(marginUpgradeRestrictionStore, "marginUpgradeRestrictionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.marginEligibilityStore = marginEligibilityStore;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
        this.marginOnboardingStore = marginOnboardingStore;
        this.rhyAccountStore = rhyAccountStore;
        this.brokerageResourceManager = brokerageResourceManager;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        this.marginUpgradeRestrictionStore = marginUpgradeRestrictionStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212041(null), 3, null);
    }

    /* compiled from: MarginUpgradeLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$onStart$1", m3645f = "MarginUpgradeLoadingDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$onStart$1 */
    static final class C212041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212041(Continuation<? super C212041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeLoadingDuxo.this.new C212041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Timeout2 {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MarginUpgradeLoadingDuxo8 marginUpgradeLoadingDuxo8 = new MarginUpgradeLoadingDuxo8(MarginUpgradeLoadingDuxo.this, null);
                this.label = 1;
                obj = Timeout3.withTimeoutStacktrace(MarginUpgradeLoadingDuxo.TIMEOUT_MILLIS, marginUpgradeLoadingDuxo8, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MarginUpgradeLoadingDuxo.this.applyMutation(new AnonymousClass1((MarginUpgradeLoadingDataState) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: MarginUpgradeLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$onStart$1$1", m3645f = "MarginUpgradeLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginUpgradeLoadingDataState, Continuation<? super MarginUpgradeLoadingDataState>, Object> {
            final /* synthetic */ MarginUpgradeLoadingDataState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginUpgradeLoadingDataState marginUpgradeLoadingDataState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$state = marginUpgradeLoadingDataState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$state, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeLoadingDataState marginUpgradeLoadingDataState, Continuation<? super MarginUpgradeLoadingDataState> continuation) {
                return ((AnonymousClass1) create(marginUpgradeLoadingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.$state;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchData(Account account, ApiMarginEligibility apiMarginEligibility, Continuation<? super MarginUpgradeLoadingDataState> continuation) {
        C212031 c212031;
        Object obj;
        Account account2;
        String str;
        ApiMarginEligibility apiMarginEligibility2;
        boolean zAreEqual;
        int i;
        int i2;
        Deferred deferredAsync$default;
        Deferred deferredAsync$default2;
        Account account3;
        ApiMarginEligibility apiMarginEligibility3;
        CountryCode.Supported supported;
        Deferred deferred;
        Deferred deferred2;
        Deferred deferred3;
        Account account4;
        CountryCode.Supported supported2;
        int i3;
        int i4;
        Object regionGateState$default;
        Account account5;
        Deferred deferred4;
        int i5;
        int i6;
        Deferred deferred5;
        CountryCode.Supported supported3;
        ApiMarginEligibility apiMarginEligibility4;
        boolean z;
        Deferred deferred6;
        Deferred deferredAsync$default3;
        Object objAwait;
        Object obj2;
        boolean z2;
        Account account6;
        int i7;
        int i8;
        boolean z3;
        Object objAwait2;
        Deferred deferred7;
        Deferred deferred8;
        ApiMarginOnboardingSplash apiMarginOnboardingSplash;
        Account account7;
        Deferred deferred9;
        Deferred deferred10;
        Object objAwait3;
        ApiMarginInvestingInfo apiMarginInvestingInfo;
        Object objAwait4;
        Deferred deferred11;
        ApiMarginOnboardingSplash apiMarginOnboardingSplash2;
        MarginSpendingProduct marginSpendingProduct;
        Object objAwait5;
        ApiMarginOnboardingSplash apiMarginOnboardingSplash3;
        ApiMarginInvestingInfo apiMarginInvestingInfo2;
        MarginSpendingProduct marginSpendingProduct2;
        OtherMarkdown otherMarkdown;
        boolean z4;
        boolean z5;
        int i9;
        int i10;
        CountryCode.Supported supported4;
        ApiMarginEligibility apiMarginEligibility5;
        OtherMarkdown otherMarkdown2;
        Account account8;
        MarginSpendingProduct marginSpendingProduct3;
        OtherMarkdown otherMarkdown3;
        ApiMarginOnboardingSplash apiMarginOnboardingSplash4;
        if (continuation instanceof C212031) {
            c212031 = (C212031) continuation;
            int i11 = c212031.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c212031.label = i11 - Integer.MIN_VALUE;
            } else {
                c212031 = new C212031(continuation);
            }
        }
        C212031 c2120312 = c212031;
        Object objAwait6 = c2120312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c2120312.label) {
            case 0:
                ResultKt.throwOnFailure(objAwait6);
                String accountNumber = account.getAccountNumber();
                Observable<User> user = this.userStore.getUser();
                c2120312.L$0 = account;
                c2120312.L$1 = apiMarginEligibility;
                c2120312.L$2 = accountNumber;
                c2120312.label = 1;
                Object objAwaitFirst = RxAwait3.awaitFirst(user, c2120312);
                if (objAwaitFirst != coroutine_suspended) {
                    obj = objAwaitFirst;
                    account2 = account;
                    str = accountNumber;
                    apiMarginEligibility2 = apiMarginEligibility;
                    CountryCode.Supported locality = ((User) obj).getOrigin().getLocality();
                    zAreEqual = Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE);
                    i = !zAreEqual ? C21137R.string.uk_margin_disclosure_statement_link : C21137R.string.margin_disclosure_statement_link;
                    i2 = C21137R.string.margin_upgrade_review_disclosure;
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(getLifecycleScope(), null, null, new MarginUpgradeLoadingDuxo7(this, str, null), 3, null);
                    if (zAreEqual) {
                        deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(getLifecycleScope(), null, null, new MarginUpgradeLoadingDuxo3(this, str, null), 3, null);
                        Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(getLifecycleScope(), null, null, new MarginUpgradeLoadingDuxo2(this, null), 3, null);
                        Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(getLifecycleScope(), null, null, new MarginUpgradeLoadingDuxo4(this, null), 3, null);
                        Deferred deferredAsync$default6 = BuildersKt__Builders_commonKt.async$default(getLifecycleScope(), null, null, new MarginUpgradeLoadingDuxo6(this, str, null), 3, null);
                        RegionGateProvider regionGateProvider = this.regionGateProvider;
                        SlipRegionGate slipRegionGate = SlipRegionGate.INSTANCE;
                        c2120312.L$0 = account2;
                        c2120312.L$1 = apiMarginEligibility2;
                        c2120312.L$2 = locality;
                        c2120312.L$3 = deferredAsync$default;
                        c2120312.L$4 = deferredAsync$default2;
                        c2120312.L$5 = deferredAsync$default4;
                        c2120312.L$6 = deferredAsync$default5;
                        c2120312.L$7 = deferredAsync$default6;
                        c2120312.I$0 = i;
                        c2120312.I$1 = i2;
                        c2120312.label = 3;
                        Object regionGateState$default2 = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, slipRegionGate, false, c2120312, 2, null);
                        if (regionGateState$default2 != coroutine_suspended) {
                            account3 = account2;
                            objAwait6 = regionGateState$default2;
                            apiMarginEligibility3 = apiMarginEligibility2;
                            supported = locality;
                            deferred = deferredAsync$default4;
                            deferred2 = deferredAsync$default5;
                            deferred3 = deferredAsync$default6;
                            boolean zBooleanValue = ((Boolean) objAwait6).booleanValue();
                            RegionGateProvider regionGateProvider2 = this.regionGateProvider;
                            GoldRegionGate goldRegionGate = GoldRegionGate.INSTANCE;
                            c2120312.L$0 = account3;
                            c2120312.L$1 = apiMarginEligibility3;
                            c2120312.L$2 = supported;
                            c2120312.L$3 = deferredAsync$default;
                            c2120312.L$4 = deferredAsync$default2;
                            c2120312.L$5 = deferred;
                            c2120312.L$6 = deferred2;
                            c2120312.L$7 = deferred3;
                            c2120312.I$0 = i;
                            c2120312.I$1 = i2;
                            c2120312.Z$0 = zBooleanValue;
                            c2120312.label = 4;
                            Account account9 = account3;
                            CountryCode.Supported supported5 = supported;
                            ApiMarginEligibility apiMarginEligibility6 = apiMarginEligibility3;
                            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider2, goldRegionGate, false, c2120312, 2, null);
                            if (regionGateState$default != coroutine_suspended) {
                                account5 = account9;
                                objAwait6 = regionGateState$default;
                                deferred4 = deferred2;
                                i5 = i;
                                i6 = i2;
                                deferred5 = deferredAsync$default;
                                supported3 = supported5;
                                apiMarginEligibility4 = apiMarginEligibility6;
                                z = zBooleanValue;
                                deferred6 = deferred;
                                boolean zBooleanValue2 = ((Boolean) objAwait6).booleanValue();
                                deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(getLifecycleScope(), null, null, new MarginUpgradeLoadingDuxo5(this, null), 3, null);
                                c2120312.L$0 = account5;
                                c2120312.L$1 = apiMarginEligibility4;
                                c2120312.L$2 = supported3;
                                c2120312.L$3 = deferredAsync$default2;
                                c2120312.L$4 = deferred6;
                                c2120312.L$5 = deferred4;
                                c2120312.L$6 = deferred3;
                                c2120312.L$7 = deferredAsync$default3;
                                c2120312.I$0 = i5;
                                c2120312.I$1 = i6;
                                c2120312.Z$0 = z;
                                c2120312.Z$1 = zBooleanValue2;
                                c2120312.label = 5;
                                objAwait = deferred5.await(c2120312);
                                obj2 = coroutine_suspended;
                                if (objAwait != obj2) {
                                    return obj2;
                                }
                                boolean z6 = z;
                                z2 = zBooleanValue2;
                                objAwait6 = objAwait;
                                account6 = account5;
                                i7 = i5;
                                i8 = i6;
                                z3 = z6;
                                ApiMarginOnboardingSplash apiMarginOnboardingSplash5 = (ApiMarginOnboardingSplash) objAwait6;
                                c2120312.L$0 = account6;
                                c2120312.L$1 = apiMarginEligibility4;
                                c2120312.L$2 = supported3;
                                c2120312.L$3 = deferred6;
                                c2120312.L$4 = deferred4;
                                c2120312.L$5 = deferred3;
                                c2120312.L$6 = deferredAsync$default3;
                                c2120312.L$7 = apiMarginOnboardingSplash5;
                                c2120312.I$0 = i7;
                                c2120312.I$1 = i8;
                                c2120312.Z$0 = z3;
                                c2120312.Z$1 = z2;
                                c2120312.label = 6;
                                objAwait2 = deferredAsync$default2.await(c2120312);
                                if (objAwait2 != obj2) {
                                    return obj2;
                                }
                                objAwait6 = objAwait2;
                                deferred7 = deferred6;
                                deferred8 = deferred4;
                                apiMarginOnboardingSplash = apiMarginOnboardingSplash5;
                                account7 = account6;
                                deferred9 = deferred3;
                                deferred10 = deferredAsync$default3;
                                ApiMarginInvestingInfo apiMarginInvestingInfo3 = (ApiMarginInvestingInfo) objAwait6;
                                c2120312.L$0 = account7;
                                c2120312.L$1 = apiMarginEligibility4;
                                c2120312.L$2 = supported3;
                                c2120312.L$3 = deferred7;
                                c2120312.L$4 = deferred8;
                                c2120312.L$5 = deferred9;
                                c2120312.L$6 = apiMarginOnboardingSplash;
                                c2120312.L$7 = apiMarginInvestingInfo3;
                                c2120312.I$0 = i7;
                                c2120312.I$1 = i8;
                                c2120312.Z$0 = z3;
                                c2120312.Z$1 = z2;
                                c2120312.label = 7;
                                objAwait3 = deferred10.await(c2120312);
                                if (objAwait3 != obj2) {
                                    return obj2;
                                }
                                apiMarginInvestingInfo = apiMarginInvestingInfo3;
                                objAwait6 = objAwait3;
                                MarginSpendingProduct marginSpendingProduct4 = (MarginSpendingProduct) objAwait6;
                                c2120312.L$0 = account7;
                                c2120312.L$1 = apiMarginEligibility4;
                                c2120312.L$2 = supported3;
                                c2120312.L$3 = deferred8;
                                c2120312.L$4 = deferred9;
                                c2120312.L$5 = apiMarginOnboardingSplash;
                                c2120312.L$6 = apiMarginInvestingInfo;
                                c2120312.L$7 = marginSpendingProduct4;
                                c2120312.I$0 = i7;
                                c2120312.I$1 = i8;
                                c2120312.Z$0 = z3;
                                c2120312.Z$1 = z2;
                                c2120312.label = 8;
                                objAwait4 = deferred7.await(c2120312);
                                if (objAwait4 != obj2) {
                                    return obj2;
                                }
                                objAwait6 = objAwait4;
                                deferred11 = deferred9;
                                apiMarginOnboardingSplash2 = apiMarginOnboardingSplash;
                                marginSpendingProduct = marginSpendingProduct4;
                                OtherMarkdown otherMarkdown4 = (OtherMarkdown) objAwait6;
                                c2120312.L$0 = account7;
                                c2120312.L$1 = apiMarginEligibility4;
                                c2120312.L$2 = supported3;
                                c2120312.L$3 = deferred11;
                                c2120312.L$4 = apiMarginOnboardingSplash2;
                                c2120312.L$5 = apiMarginInvestingInfo;
                                c2120312.L$6 = marginSpendingProduct;
                                c2120312.L$7 = otherMarkdown4;
                                c2120312.I$0 = i7;
                                c2120312.I$1 = i8;
                                c2120312.Z$0 = z3;
                                c2120312.Z$1 = z2;
                                c2120312.label = 9;
                                objAwait5 = deferred8.await(c2120312);
                                if (objAwait5 != obj2) {
                                    return obj2;
                                }
                                apiMarginOnboardingSplash3 = apiMarginOnboardingSplash2;
                                apiMarginInvestingInfo2 = apiMarginInvestingInfo;
                                marginSpendingProduct2 = marginSpendingProduct;
                                otherMarkdown = otherMarkdown4;
                                objAwait6 = objAwait5;
                                z4 = z2;
                                z5 = z3;
                                i9 = i8;
                                i10 = i7;
                                OtherMarkdown otherMarkdown5 = (OtherMarkdown) objAwait6;
                                c2120312.L$0 = account7;
                                c2120312.L$1 = apiMarginEligibility4;
                                c2120312.L$2 = supported3;
                                c2120312.L$3 = apiMarginOnboardingSplash3;
                                c2120312.L$4 = apiMarginInvestingInfo2;
                                c2120312.L$5 = marginSpendingProduct2;
                                c2120312.L$6 = otherMarkdown;
                                c2120312.L$7 = otherMarkdown5;
                                c2120312.I$0 = i10;
                                c2120312.I$1 = i9;
                                c2120312.Z$0 = z5;
                                c2120312.Z$1 = z4;
                                c2120312.label = 10;
                                objAwait6 = deferred11.await(c2120312);
                                if (objAwait6 != obj2) {
                                    return obj2;
                                }
                                supported4 = supported3;
                                apiMarginEligibility5 = apiMarginEligibility4;
                                otherMarkdown2 = otherMarkdown;
                                account8 = account7;
                                marginSpendingProduct3 = marginSpendingProduct2;
                                otherMarkdown3 = otherMarkdown5;
                                apiMarginOnboardingSplash4 = apiMarginOnboardingSplash3;
                                return new MarginUpgradeLoadingDataState(apiMarginOnboardingSplash4, account8, null, apiMarginInvestingInfo2, null, marginSpendingProduct3, otherMarkdown2, otherMarkdown3, null, (MarginSettings) objAwait6, null, null, boxing.boxBoolean(z4), boxing.boxBoolean(z5), boxing.boxInt(i10), boxing.boxInt(i9), supported4, boxing.boxBoolean(apiMarginEligibility5.getIsEligible()), apiMarginEligibility5, null, 527636, null);
                            }
                        }
                    } else {
                        c2120312.L$0 = account2;
                        c2120312.L$1 = locality;
                        c2120312.L$2 = null;
                        c2120312.I$0 = i;
                        c2120312.I$1 = i2;
                        c2120312.label = 2;
                        Object objAwait7 = deferredAsync$default.await(c2120312);
                        if (objAwait7 != coroutine_suspended) {
                            account4 = account2;
                            objAwait6 = objAwait7;
                            supported2 = locality;
                            i3 = i;
                            i4 = i2;
                            return new MarginUpgradeLoadingDataState((ApiMarginOnboardingSplash) objAwait6, account4, null, null, null, null, null, null, null, null, null, null, null, null, boxing.boxInt(i3), boxing.boxInt(i4), supported2, null, null, null, 933884, null);
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                String str2 = (String) c2120312.L$2;
                ApiMarginEligibility apiMarginEligibility7 = (ApiMarginEligibility) c2120312.L$1;
                Account account10 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                apiMarginEligibility2 = apiMarginEligibility7;
                str = str2;
                obj = objAwait6;
                account2 = account10;
                CountryCode.Supported locality2 = ((User) obj).getOrigin().getLocality();
                zAreEqual = Intrinsics.areEqual(locality2, CountryCode.Supported.UnitedKingdom.INSTANCE);
                i = !zAreEqual ? C21137R.string.uk_margin_disclosure_statement_link : C21137R.string.margin_disclosure_statement_link;
                i2 = C21137R.string.margin_upgrade_review_disclosure;
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(getLifecycleScope(), null, null, new MarginUpgradeLoadingDuxo7(this, str, null), 3, null);
                if (zAreEqual) {
                }
                return coroutine_suspended;
            case 2:
                i4 = c2120312.I$1;
                i3 = c2120312.I$0;
                CountryCode.Supported supported6 = (CountryCode.Supported) c2120312.L$1;
                Account account11 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                supported2 = supported6;
                account4 = account11;
                return new MarginUpgradeLoadingDataState((ApiMarginOnboardingSplash) objAwait6, account4, null, null, null, null, null, null, null, null, null, null, null, null, boxing.boxInt(i3), boxing.boxInt(i4), supported2, null, null, null, 933884, null);
            case 3:
                int i12 = c2120312.I$1;
                int i13 = c2120312.I$0;
                Deferred deferred12 = (Deferred) c2120312.L$7;
                Deferred deferred13 = (Deferred) c2120312.L$6;
                Deferred deferred14 = (Deferred) c2120312.L$5;
                Deferred deferred15 = (Deferred) c2120312.L$4;
                Deferred deferred16 = (Deferred) c2120312.L$3;
                CountryCode.Supported supported7 = (CountryCode.Supported) c2120312.L$2;
                ApiMarginEligibility apiMarginEligibility8 = (ApiMarginEligibility) c2120312.L$1;
                Account account12 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                i2 = i12;
                supported = supported7;
                i = i13;
                apiMarginEligibility3 = apiMarginEligibility8;
                deferred3 = deferred12;
                deferredAsync$default2 = deferred15;
                account3 = account12;
                deferred = deferred14;
                deferredAsync$default = deferred16;
                deferred2 = deferred13;
                boolean zBooleanValue3 = ((Boolean) objAwait6).booleanValue();
                RegionGateProvider regionGateProvider22 = this.regionGateProvider;
                GoldRegionGate goldRegionGate2 = GoldRegionGate.INSTANCE;
                c2120312.L$0 = account3;
                c2120312.L$1 = apiMarginEligibility3;
                c2120312.L$2 = supported;
                c2120312.L$3 = deferredAsync$default;
                c2120312.L$4 = deferredAsync$default2;
                c2120312.L$5 = deferred;
                c2120312.L$6 = deferred2;
                c2120312.L$7 = deferred3;
                c2120312.I$0 = i;
                c2120312.I$1 = i2;
                c2120312.Z$0 = zBooleanValue3;
                c2120312.label = 4;
                Account account92 = account3;
                CountryCode.Supported supported52 = supported;
                ApiMarginEligibility apiMarginEligibility62 = apiMarginEligibility3;
                regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider22, goldRegionGate2, false, c2120312, 2, null);
                if (regionGateState$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                z = c2120312.Z$0;
                i6 = c2120312.I$1;
                i5 = c2120312.I$0;
                Deferred deferred17 = (Deferred) c2120312.L$7;
                deferred4 = (Deferred) c2120312.L$6;
                deferred = (Deferred) c2120312.L$5;
                Deferred deferred18 = (Deferred) c2120312.L$4;
                deferred5 = (Deferred) c2120312.L$3;
                supported3 = (CountryCode.Supported) c2120312.L$2;
                apiMarginEligibility4 = (ApiMarginEligibility) c2120312.L$1;
                Account account13 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                deferred3 = deferred17;
                account5 = account13;
                deferredAsync$default2 = deferred18;
                deferred6 = deferred;
                boolean zBooleanValue22 = ((Boolean) objAwait6).booleanValue();
                deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(getLifecycleScope(), null, null, new MarginUpgradeLoadingDuxo5(this, null), 3, null);
                c2120312.L$0 = account5;
                c2120312.L$1 = apiMarginEligibility4;
                c2120312.L$2 = supported3;
                c2120312.L$3 = deferredAsync$default2;
                c2120312.L$4 = deferred6;
                c2120312.L$5 = deferred4;
                c2120312.L$6 = deferred3;
                c2120312.L$7 = deferredAsync$default3;
                c2120312.I$0 = i5;
                c2120312.I$1 = i6;
                c2120312.Z$0 = z;
                c2120312.Z$1 = zBooleanValue22;
                c2120312.label = 5;
                objAwait = deferred5.await(c2120312);
                obj2 = coroutine_suspended;
                if (objAwait != obj2) {
                }
                break;
            case 5:
                z2 = c2120312.Z$1;
                z3 = c2120312.Z$0;
                i8 = c2120312.I$1;
                i7 = c2120312.I$0;
                Deferred deferred19 = (Deferred) c2120312.L$7;
                deferred3 = (Deferred) c2120312.L$6;
                Deferred deferred20 = (Deferred) c2120312.L$5;
                deferred6 = (Deferred) c2120312.L$4;
                Deferred deferred21 = (Deferred) c2120312.L$3;
                supported3 = (CountryCode.Supported) c2120312.L$2;
                apiMarginEligibility4 = (ApiMarginEligibility) c2120312.L$1;
                Account account14 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                obj2 = coroutine_suspended;
                deferredAsync$default3 = deferred19;
                deferred4 = deferred20;
                account6 = account14;
                deferredAsync$default2 = deferred21;
                ApiMarginOnboardingSplash apiMarginOnboardingSplash52 = (ApiMarginOnboardingSplash) objAwait6;
                c2120312.L$0 = account6;
                c2120312.L$1 = apiMarginEligibility4;
                c2120312.L$2 = supported3;
                c2120312.L$3 = deferred6;
                c2120312.L$4 = deferred4;
                c2120312.L$5 = deferred3;
                c2120312.L$6 = deferredAsync$default3;
                c2120312.L$7 = apiMarginOnboardingSplash52;
                c2120312.I$0 = i7;
                c2120312.I$1 = i8;
                c2120312.Z$0 = z3;
                c2120312.Z$1 = z2;
                c2120312.label = 6;
                objAwait2 = deferredAsync$default2.await(c2120312);
                if (objAwait2 != obj2) {
                }
                break;
            case 6:
                z2 = c2120312.Z$1;
                z3 = c2120312.Z$0;
                i8 = c2120312.I$1;
                i7 = c2120312.I$0;
                apiMarginOnboardingSplash = (ApiMarginOnboardingSplash) c2120312.L$7;
                deferred10 = (Deferred) c2120312.L$6;
                deferred9 = (Deferred) c2120312.L$5;
                deferred8 = (Deferred) c2120312.L$4;
                Deferred deferred22 = (Deferred) c2120312.L$3;
                supported3 = (CountryCode.Supported) c2120312.L$2;
                apiMarginEligibility4 = (ApiMarginEligibility) c2120312.L$1;
                account7 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                deferred7 = deferred22;
                obj2 = coroutine_suspended;
                ApiMarginInvestingInfo apiMarginInvestingInfo32 = (ApiMarginInvestingInfo) objAwait6;
                c2120312.L$0 = account7;
                c2120312.L$1 = apiMarginEligibility4;
                c2120312.L$2 = supported3;
                c2120312.L$3 = deferred7;
                c2120312.L$4 = deferred8;
                c2120312.L$5 = deferred9;
                c2120312.L$6 = apiMarginOnboardingSplash;
                c2120312.L$7 = apiMarginInvestingInfo32;
                c2120312.I$0 = i7;
                c2120312.I$1 = i8;
                c2120312.Z$0 = z3;
                c2120312.Z$1 = z2;
                c2120312.label = 7;
                objAwait3 = deferred10.await(c2120312);
                if (objAwait3 != obj2) {
                }
                break;
            case 7:
                z2 = c2120312.Z$1;
                z3 = c2120312.Z$0;
                i8 = c2120312.I$1;
                i7 = c2120312.I$0;
                ApiMarginInvestingInfo apiMarginInvestingInfo4 = (ApiMarginInvestingInfo) c2120312.L$7;
                ApiMarginOnboardingSplash apiMarginOnboardingSplash6 = (ApiMarginOnboardingSplash) c2120312.L$6;
                deferred9 = (Deferred) c2120312.L$5;
                deferred8 = (Deferred) c2120312.L$4;
                Deferred deferred23 = (Deferred) c2120312.L$3;
                supported3 = (CountryCode.Supported) c2120312.L$2;
                apiMarginEligibility4 = (ApiMarginEligibility) c2120312.L$1;
                account7 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                apiMarginInvestingInfo = apiMarginInvestingInfo4;
                apiMarginOnboardingSplash = apiMarginOnboardingSplash6;
                deferred7 = deferred23;
                obj2 = coroutine_suspended;
                MarginSpendingProduct marginSpendingProduct42 = (MarginSpendingProduct) objAwait6;
                c2120312.L$0 = account7;
                c2120312.L$1 = apiMarginEligibility4;
                c2120312.L$2 = supported3;
                c2120312.L$3 = deferred8;
                c2120312.L$4 = deferred9;
                c2120312.L$5 = apiMarginOnboardingSplash;
                c2120312.L$6 = apiMarginInvestingInfo;
                c2120312.L$7 = marginSpendingProduct42;
                c2120312.I$0 = i7;
                c2120312.I$1 = i8;
                c2120312.Z$0 = z3;
                c2120312.Z$1 = z2;
                c2120312.label = 8;
                objAwait4 = deferred7.await(c2120312);
                if (objAwait4 != obj2) {
                }
                break;
            case 8:
                z2 = c2120312.Z$1;
                z3 = c2120312.Z$0;
                i8 = c2120312.I$1;
                i7 = c2120312.I$0;
                marginSpendingProduct = (MarginSpendingProduct) c2120312.L$7;
                apiMarginInvestingInfo = (ApiMarginInvestingInfo) c2120312.L$6;
                apiMarginOnboardingSplash2 = (ApiMarginOnboardingSplash) c2120312.L$5;
                Deferred deferred24 = (Deferred) c2120312.L$4;
                Deferred deferred25 = (Deferred) c2120312.L$3;
                supported3 = (CountryCode.Supported) c2120312.L$2;
                apiMarginEligibility4 = (ApiMarginEligibility) c2120312.L$1;
                account7 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                deferred11 = deferred24;
                deferred8 = deferred25;
                obj2 = coroutine_suspended;
                OtherMarkdown otherMarkdown42 = (OtherMarkdown) objAwait6;
                c2120312.L$0 = account7;
                c2120312.L$1 = apiMarginEligibility4;
                c2120312.L$2 = supported3;
                c2120312.L$3 = deferred11;
                c2120312.L$4 = apiMarginOnboardingSplash2;
                c2120312.L$5 = apiMarginInvestingInfo;
                c2120312.L$6 = marginSpendingProduct;
                c2120312.L$7 = otherMarkdown42;
                c2120312.I$0 = i7;
                c2120312.I$1 = i8;
                c2120312.Z$0 = z3;
                c2120312.Z$1 = z2;
                c2120312.label = 9;
                objAwait5 = deferred8.await(c2120312);
                if (objAwait5 != obj2) {
                }
                break;
            case 9:
                z2 = c2120312.Z$1;
                z3 = c2120312.Z$0;
                i8 = c2120312.I$1;
                i7 = c2120312.I$0;
                otherMarkdown = (OtherMarkdown) c2120312.L$7;
                marginSpendingProduct2 = (MarginSpendingProduct) c2120312.L$6;
                apiMarginInvestingInfo2 = (ApiMarginInvestingInfo) c2120312.L$5;
                apiMarginOnboardingSplash3 = (ApiMarginOnboardingSplash) c2120312.L$4;
                Deferred deferred26 = (Deferred) c2120312.L$3;
                supported3 = (CountryCode.Supported) c2120312.L$2;
                apiMarginEligibility4 = (ApiMarginEligibility) c2120312.L$1;
                account7 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                deferred11 = deferred26;
                obj2 = coroutine_suspended;
                z4 = z2;
                z5 = z3;
                i9 = i8;
                i10 = i7;
                OtherMarkdown otherMarkdown52 = (OtherMarkdown) objAwait6;
                c2120312.L$0 = account7;
                c2120312.L$1 = apiMarginEligibility4;
                c2120312.L$2 = supported3;
                c2120312.L$3 = apiMarginOnboardingSplash3;
                c2120312.L$4 = apiMarginInvestingInfo2;
                c2120312.L$5 = marginSpendingProduct2;
                c2120312.L$6 = otherMarkdown;
                c2120312.L$7 = otherMarkdown52;
                c2120312.I$0 = i10;
                c2120312.I$1 = i9;
                c2120312.Z$0 = z5;
                c2120312.Z$1 = z4;
                c2120312.label = 10;
                objAwait6 = deferred11.await(c2120312);
                if (objAwait6 != obj2) {
                }
                break;
            case 10:
                z4 = c2120312.Z$1;
                z5 = c2120312.Z$0;
                i9 = c2120312.I$1;
                i10 = c2120312.I$0;
                OtherMarkdown otherMarkdown6 = (OtherMarkdown) c2120312.L$7;
                OtherMarkdown otherMarkdown7 = (OtherMarkdown) c2120312.L$6;
                MarginSpendingProduct marginSpendingProduct5 = (MarginSpendingProduct) c2120312.L$5;
                apiMarginInvestingInfo2 = (ApiMarginInvestingInfo) c2120312.L$4;
                ApiMarginOnboardingSplash apiMarginOnboardingSplash7 = (ApiMarginOnboardingSplash) c2120312.L$3;
                CountryCode.Supported supported8 = (CountryCode.Supported) c2120312.L$2;
                ApiMarginEligibility apiMarginEligibility9 = (ApiMarginEligibility) c2120312.L$1;
                Account account15 = (Account) c2120312.L$0;
                ResultKt.throwOnFailure(objAwait6);
                supported4 = supported8;
                apiMarginEligibility5 = apiMarginEligibility9;
                otherMarkdown2 = otherMarkdown7;
                account8 = account15;
                otherMarkdown3 = otherMarkdown6;
                apiMarginOnboardingSplash4 = apiMarginOnboardingSplash7;
                marginSpendingProduct3 = marginSpendingProduct5;
                return new MarginUpgradeLoadingDataState(apiMarginOnboardingSplash4, account8, null, apiMarginInvestingInfo2, null, marginSpendingProduct3, otherMarkdown2, otherMarkdown3, null, (MarginSettings) objAwait6, null, null, boxing.boxBoolean(z4), boxing.boxBoolean(z5), boxing.boxInt(i10), boxing.boxInt(i9), supported4, boxing.boxBoolean(apiMarginEligibility5.getIsEligible()), apiMarginEligibility5, null, 527636, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MarginUpgradeLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDuxo;", "Lcom/robinhood/android/margin/contracts/EnableMarginInvestingKey;", "<init>", "()V", "TIMEOUT_MILLIS", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<MarginUpgradeLoadingDuxo, EnableMarginInvestingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public EnableMarginInvestingKey getExtras(SavedStateHandle savedStateHandle) {
            return (EnableMarginInvestingKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public EnableMarginInvestingKey getExtras(MarginUpgradeLoadingDuxo marginUpgradeLoadingDuxo) {
            return (EnableMarginInvestingKey) DuxoCompanion2.DefaultImpls.getExtras(this, marginUpgradeLoadingDuxo);
        }
    }
}
