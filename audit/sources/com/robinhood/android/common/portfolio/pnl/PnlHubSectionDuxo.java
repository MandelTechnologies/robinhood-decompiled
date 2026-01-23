package com.robinhood.android.common.portfolio.pnl;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs3;
import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossRealized;
import com.robinhood.android.portfolio.pnlhub.models.C25781R;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.store.user.UserStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: PnlHubSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00019Bg\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010.\u001a\u00020+H\u0000¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020+¢\u0006\u0004\b/\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionViewState;", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionEvent;", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "profitAndLossHubSectionStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/prefs/BooleanPreference;", "newTagShownPref", "Lcom/robinhood/prefs/IntPreference;", "displayCurrencyPref", "nowIncludesCryptoTooltipShownPref", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "accountHasAccessToOptions", "isUkOrApac", "", "toSubtitle", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/Instant", "receivedAt", "checkIfDataIsStale", "(Lj$/time/Instant;)Z", "", "accountNumber", "Lkotlinx/coroutines/CompletableJob;", "bind$feature_lib_portfolio_externalDebug", "(Ljava/lang/String;)Lkotlinx/coroutines/CompletableJob;", "bind", "", "onNavigate$feature_lib_portfolio_externalDebug", "()V", "onNavigate", "onNowIncludesCryptoTooltipDisplayed", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/prefs/IntPreference;", "Args", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PnlHubSectionDuxo extends BaseDuxo5<PnlHubSectionViewState, PnlHubSectionEvent> {
    public static final int $stable = 8;
    private final AccountAccessStore accountAccessStore;
    private final Clock clock;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final IntPreference displayCurrencyPref;
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference newTagShownPref;
    private final BooleanPreference nowIncludesCryptoTooltipShownPref;
    private final ProfitAndLossHubSectionStore profitAndLossHubSectionStore;
    private final RegionGateProvider regionGateProvider;
    private final UserStore userStore;

    /* compiled from: PnlHubSectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo", m3645f = "PnlHubSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.f2773x8d9721ad}, m3647m = "toSubtitle")
    /* renamed from: com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$toSubtitle$1 */
    static final class C115421 extends ContinuationImpl {
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        int label;
        /* synthetic */ Object result;

        C115421(Continuation<? super C115421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PnlHubSectionDuxo.this.toSubtitle(false, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnlHubSectionDuxo(UserStore userStore, AccountAccessStore accountAccessStore, RegionGateProvider regionGateProvider, ProfitAndLossHubSectionStore profitAndLossHubSectionStore, ExperimentsStore experimentsStore, Clock clock, CryptoExperimentsStore cryptoExperimentsStore, @PnlHubNewTagPref2 BooleanPreference newTagShownPref, @DisplayCurrencySelectionPrefs3 IntPreference displayCurrencyPref, @PnlHubNewTagPref3 BooleanPreference nowIncludesCryptoTooltipShownPref, DuxoBundle duxoBundle) {
        super(new PnlHubSectionViewState("", null, CollectionsKt.emptyList(), null, false, false, true, false), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(profitAndLossHubSectionStore, "profitAndLossHubSectionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(newTagShownPref, "newTagShownPref");
        Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
        Intrinsics.checkNotNullParameter(nowIncludesCryptoTooltipShownPref, "nowIncludesCryptoTooltipShownPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
        this.accountAccessStore = accountAccessStore;
        this.regionGateProvider = regionGateProvider;
        this.profitAndLossHubSectionStore = profitAndLossHubSectionStore;
        this.experimentsStore = experimentsStore;
        this.clock = clock;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.newTagShownPref = newTagShownPref;
        this.displayCurrencyPref = displayCurrencyPref;
        this.nowIncludesCryptoTooltipShownPref = nowIncludesCryptoTooltipShownPref;
    }

    public final CompletableJob bind$feature_lib_portfolio_externalDebug(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new PnlHubSectionDuxo2(this, accountNumber, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new PnlHubSectionDuxo4(this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new PnlHubSectionDuxo6(this, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    public final void onNavigate$feature_lib_portfolio_externalDebug() {
        this.newTagShownPref.set(true);
        applyMutation(new PnlHubSectionDuxo7(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toSubtitle(boolean z, boolean z2, Continuation<? super Integer> continuation) {
        C115421 c115421;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objFirstOrNull;
        boolean z6;
        boolean z7;
        int i;
        int i2;
        if (continuation instanceof C115421) {
            c115421 = (C115421) continuation;
            int i3 = c115421.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c115421.label = i3 - Integer.MIN_VALUE;
            } else {
                c115421 = new C115421(continuation);
            }
        }
        C115421 c1154212 = c115421;
        Object regionGateState$default = c1154212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c1154212.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(regionGateState$default);
            RegionGateProvider regionGateProvider = this.regionGateProvider;
            EtfRegionGate etfRegionGate = EtfRegionGate.INSTANCE;
            c1154212.Z$0 = z;
            c1154212.Z$1 = z2;
            c1154212.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, etfRegionGate, false, c1154212, 2, null);
            if (regionGateState$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                boolean z8 = c1154212.Z$2;
                boolean z9 = c1154212.Z$1;
                z3 = c1154212.Z$0;
                ResultKt.throwOnFailure(regionGateState$default);
                z5 = z8;
                z4 = z9;
                boolean zBooleanValue = ((Boolean) regionGateState$default).booleanValue();
                Flow<Boolean> flowStreamCryptoPnlHubExperiment = this.cryptoExperimentsStore.streamCryptoPnlHubExperiment();
                c1154212.Z$0 = z3;
                c1154212.Z$1 = z4;
                c1154212.Z$2 = z5;
                c1154212.Z$3 = zBooleanValue;
                c1154212.label = 3;
                objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoPnlHubExperiment, c1154212);
                if (objFirstOrNull != coroutine_suspended) {
                    z6 = z4;
                    z7 = zBooleanValue;
                    regionGateState$default = objFirstOrNull;
                    Boolean bool = (Boolean) regionGateState$default;
                    if (bool == null) {
                    }
                    if (!z6) {
                    }
                }
                return coroutine_suspended;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z7 = c1154212.Z$3;
            z5 = c1154212.Z$2;
            z6 = c1154212.Z$1;
            z3 = c1154212.Z$0;
            ResultKt.throwOnFailure(regionGateState$default);
            Boolean bool2 = (Boolean) regionGateState$default;
            boolean zBooleanValue2 = bool2 == null ? bool2.booleanValue() : false;
            if (!z6) {
                return null;
            }
            if (!z5 || !z7) {
                if (z5 || !z7) {
                    return null;
                }
                if (z3) {
                    i = C25781R.string.gated_options_pnl_hub_entry_point_options_equities;
                } else {
                    i = C25781R.string.pnl_hub_entry_point_equities;
                }
                return boxing.boxInt(i);
            }
            if (z3 && zBooleanValue2) {
                i2 = C25781R.string.f4843xe0535296;
            } else if (z3 && !zBooleanValue2) {
                i2 = C25781R.string.gated_options_etf_pnl_hub_entry_point_options_equities;
            } else if (!z3 && zBooleanValue2) {
                i2 = C25781R.string.gated_etf_crypto_pnl_hub_entry_point_equities_crypto;
            } else {
                i2 = C25781R.string.gated_etf_pnl_hub_entry_point_equities;
            }
            return boxing.boxInt(i2);
        }
        z2 = c1154212.Z$1;
        z = c1154212.Z$0;
        ResultKt.throwOnFailure(regionGateState$default);
        boolean zBooleanValue3 = ((Boolean) regionGateState$default).booleanValue();
        RegionGateProvider regionGateProvider2 = this.regionGateProvider;
        OptionsRegionGate optionsRegionGate = OptionsRegionGate.INSTANCE;
        c1154212.Z$0 = z;
        c1154212.Z$1 = z2;
        c1154212.Z$2 = zBooleanValue3;
        c1154212.label = 2;
        Object regionGateState$default2 = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider2, optionsRegionGate, false, c1154212, 2, null);
        if (regionGateState$default2 != coroutine_suspended) {
            z3 = z;
            z4 = z2;
            z5 = zBooleanValue3;
            regionGateState$default = regionGateState$default2;
            boolean zBooleanValue4 = ((Boolean) regionGateState$default).booleanValue();
            Flow<Boolean> flowStreamCryptoPnlHubExperiment2 = this.cryptoExperimentsStore.streamCryptoPnlHubExperiment();
            c1154212.Z$0 = z3;
            c1154212.Z$1 = z4;
            c1154212.Z$2 = z5;
            c1154212.Z$3 = zBooleanValue4;
            c1154212.label = 3;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoPnlHubExperiment2, c1154212);
            if (objFirstOrNull != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIfDataIsStale(Instant receivedAt) {
        return this.clock.instant().minus((TemporalAmount) ProfitAndLossRealized.INSTANCE.getNormalStaleTimeout()).isAfter(receivedAt);
    }

    public final void onNowIncludesCryptoTooltipDisplayed() {
        this.nowIncludesCryptoTooltipShownPref.set(true);
    }

    /* compiled from: PnlHubSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionDuxo$Args;", "", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String accountNumber) {
            return new Args(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.accountNumber, ((Args) other).accountNumber);
        }

        public int hashCode() {
            String str = this.accountNumber;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ")";
        }

        public Args(String str) {
            this.accountNumber = str;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }
}
