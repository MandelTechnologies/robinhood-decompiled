package com.robinhood.android.slip.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.margin.contracts.SlipOnboardingKey;
import com.robinhood.android.slip.onboarding.SlipOnboardingDuxo;
import com.robinhood.android.slip.onboarding.SlipOnboardingEvent;
import com.robinhood.android.slip.onboarding.utils.SLIPContextUtils;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.FeatureDiscoveryStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipOnboardingStore;
import com.robinhood.models.api.FeatureDiscoveryLocation;
import com.robinhood.models.p320db.SlipOnboarding;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002=>BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0018J\u0006\u0010\"\u001a\u00020\u0018J \u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u0018H\u0002J\b\u00100\u001a\u00020\u0018H\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u00102\u001a\u00020\u00182\u0006\u0010&\u001a\u00020 2\u0006\u00103\u001a\u00020 H\u0002J\u0010\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u000209H\u0002J\f\u0010:\u001a\u00020\u0018*\u00020\u0003H\u0002J\u0006\u0010;\u001a\u00020\u0018J\u0006\u0010<\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingViewState;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "slipOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipOnboardingStore;", "featureDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipOnboardingStore;Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "loadSlipOnboarding", "", "source", "", "onSplashContinueClicked", "onValuePropsContinueClicked", "onInvestorProfileConfirmed", "onAllChecksPassed", "isRecommended", "", "onEligibilityResultContinue", "onAgreementAccepted", "showSplash", "splash", "Lcom/robinhood/models/db/SlipOnboarding$SplashView;", "showRecommendedFlow", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "showValueProps", "valueProps", "Lcom/robinhood/models/db/SlipOnboarding$ValuePropsView;", "showUkFlow", "entryPoint", "accountNumber", "showInvestorProfile", "showChecklist", "showEligibilityResult", "showAgreements", "isQuickEnrollment", "showSuccess", "success", "Lcom/robinhood/models/db/SlipOnboarding$SuccessView;", "showError", "throwable", "", "submit", "clearHomeCardStack", "refreshFeatureDiscovery", "User", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOnboardingDuxo extends BaseDuxo5<SlipOnboardingViewState, SlipOnboardingEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final CardManager cardManager;
    private final FeatureDiscoveryStore featureDiscoveryStore;
    private final SavedStateHandle savedStateHandle;
    private final SlipOnboardingStore slipOnboardingStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipOnboardingDuxo(AccountProvider accountProvider, CardManager cardManager, SlipOnboardingStore slipOnboardingStore, FeatureDiscoveryStore featureDiscoveryStore, UserStore userStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new SlipOnboardingViewState(false, null, null, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(slipOnboardingStore, "slipOnboardingStore");
        Intrinsics.checkNotNullParameter(featureDiscoveryStore, "featureDiscoveryStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.cardManager = cardManager;
        this.slipOnboardingStore = slipOnboardingStore;
        this.featureDiscoveryStore = featureDiscoveryStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void loadSlipOnboarding(final String source) {
        Observable<Optional<String>> observable;
        Companion companion = INSTANCE;
        final boolean isQuickEnrollment = ((SlipOnboardingKey) companion.getExtras((HasSavedState) this)).getIsQuickEnrollment();
        String accountNumber = ((SlipOnboardingKey) companion.getExtras((HasSavedState) this)).getAccountNumber();
        final boolean skipIntro = ((SlipOnboardingKey) companion.getExtras((HasSavedState) this)).getSkipIntro();
        if (accountNumber != null) {
            observable = Observable.just(Optional3.asOptional(accountNumber));
        } else {
            observable = this.accountProvider.getIndividualAccountNumber().toObservable();
        }
        Observable<R> observableSwitchMap = observable.switchMap(new Function() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo.loadSlipOnboarding.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<SlipOnboarding, User>> apply(Optional<String> accountNumber2) {
                Intrinsics.checkNotNullParameter(accountNumber2, "accountNumber");
                final String orNull = accountNumber2.getOrNull();
                if (orNull != null) {
                    SlipOnboardingDuxo slipOnboardingDuxo = SlipOnboardingDuxo.this;
                    String str = source;
                    Observables observables = Observables.INSTANCE;
                    Observable<SlipOnboarding> observable2 = slipOnboardingDuxo.slipOnboardingStore.getSlipOnboarding(orNull, str).toObservable();
                    Intrinsics.checkNotNullExpressionValue(observable2, "toObservable(...)");
                    Observable<R> map = slipOnboardingDuxo.userStore.getUser().map(new Function() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$loadSlipOnboarding$1$1$1
                        @Override // io.reactivex.functions.Function
                        public final SlipOnboardingDuxo.User apply(User user) {
                            Intrinsics.checkNotNullParameter(user, "user");
                            return new SlipOnboardingDuxo.User(user.getOrigin().getLocality(), orNull);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    Observable observableCombineLatest = observables.combineLatest(observable2, map);
                    if (observableCombineLatest != null) {
                        return observableCombineLatest;
                    }
                }
                throw new IllegalStateException("Could not fetch account number");
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingDuxo.loadSlipOnboarding$lambda$0(source, isQuickEnrollment, skipIntro, this, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingDuxo.loadSlipOnboarding$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSlipOnboarding$lambda$0(String str, boolean z, boolean z2, SlipOnboardingDuxo slipOnboardingDuxo, Tuples2 tuples2) {
        SlipOnboarding slipOnboarding = (SlipOnboarding) tuples2.component1();
        User user = (User) tuples2.component2();
        boolean zIsRecommended = slipOnboarding.getVariant().isRecommended();
        SLIPContext sLIPContextCreateSlipContext$default = SLIPContextUtils.createSlipContext$default(str, SLIPContextUtils.toProtobuf(slipOnboarding.getVariant()), null, slipOnboarding.getDollarAmount(), slipOnboarding.getPercentAmount(), z, z2, 4, null);
        boolean zAreEqual = Intrinsics.areEqual(user.getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE);
        slipOnboardingDuxo.applyMutation(new SlipOnboardingDuxo3(zIsRecommended, slipOnboarding, sLIPContextCreateSlipContext$default, null));
        if (zAreEqual) {
            if (str == null) {
                str = "";
            }
            slipOnboardingDuxo.showUkFlow(str, user.getAccountNumber());
        } else if (zIsRecommended && z2) {
            slipOnboardingDuxo.showValueProps(slipOnboarding.getValueProps());
        } else if (z) {
            slipOnboardingDuxo.showAgreements(zIsRecommended, true);
        } else if (!z) {
            slipOnboardingDuxo.showSplash(slipOnboarding.getSplash(), zIsRecommended, sLIPContextCreateSlipContext$default);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSlipOnboarding$lambda$1(SlipOnboardingDuxo slipOnboardingDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        slipOnboardingDuxo.showError(throwable);
        return Unit.INSTANCE;
    }

    /* compiled from: SlipOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingDuxo$User;", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "accountNumber", "", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/lang/String;)V", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class User {
        public static final int $stable = 8;
        private final String accountNumber;
        private final CountryCode.Supported locality;

        public static /* synthetic */ User copy$default(User user, CountryCode.Supported supported, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                supported = user.locality;
            }
            if ((i & 2) != 0) {
                str = user.accountNumber;
            }
            return user.copy(supported, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final User copy(CountryCode.Supported locality, String accountNumber) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new User(locality, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.areEqual(this.locality, user.locality) && Intrinsics.areEqual(this.accountNumber, user.accountNumber);
        }

        public int hashCode() {
            return (this.locality.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "User(locality=" + this.locality + ", accountNumber=" + this.accountNumber + ")";
        }

        public User(CountryCode.Supported locality, String accountNumber) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.locality = locality;
            this.accountNumber = accountNumber;
        }

        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    public final void onSplashContinueClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingDuxo.onSplashContinueClicked$lambda$2(this.f$0, (SlipOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSplashContinueClicked$lambda$2(SlipOnboardingDuxo slipOnboardingDuxo, SlipOnboardingViewState state) {
        SlipOnboarding.ValuePropsView valueProps;
        Intrinsics.checkNotNullParameter(state, "state");
        SlipOnboarding slipOnboarding = state.getSlipOnboarding();
        if (slipOnboarding != null && (valueProps = slipOnboarding.getValueProps()) != null) {
            slipOnboardingDuxo.showValueProps(valueProps);
        }
        return Unit.INSTANCE;
    }

    public final void onValuePropsContinueClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingDuxo.onValuePropsContinueClicked$lambda$3(this.f$0, (SlipOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onValuePropsContinueClicked$lambda$3(SlipOnboardingDuxo slipOnboardingDuxo, SlipOnboardingViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getShowRecommendedFlow()) {
            slipOnboardingDuxo.showInvestorProfile();
        } else {
            slipOnboardingDuxo.showAgreements(false, false);
        }
        return Unit.INSTANCE;
    }

    public final void onInvestorProfileConfirmed() {
        showChecklist();
    }

    public final void onAllChecksPassed(boolean isRecommended) {
        showEligibilityResult(isRecommended);
    }

    public final void onEligibilityResultContinue() {
        withDataState(new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingDuxo.onEligibilityResultContinue$lambda$4(this.f$0, (SlipOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEligibilityResultContinue$lambda$4(SlipOnboardingDuxo slipOnboardingDuxo, SlipOnboardingViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        slipOnboardingDuxo.showAgreements(true, false);
        return Unit.INSTANCE;
    }

    public final void onAgreementAccepted() {
        withDataState(new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingDuxo.onAgreementAccepted$lambda$6(this.f$0, (SlipOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAgreementAccepted$lambda$6(SlipOnboardingDuxo slipOnboardingDuxo, SlipOnboardingViewState state) {
        SlipOnboarding.SuccessView success;
        Intrinsics.checkNotNullParameter(state, "state");
        SlipOnboarding slipOnboarding = state.getSlipOnboarding();
        if (slipOnboarding != null && (success = slipOnboarding.getSuccess()) != null) {
            slipOnboardingDuxo.showSuccess(success);
        }
        return Unit.INSTANCE;
    }

    private final void showSplash(SlipOnboarding.SplashView splash, boolean showRecommendedFlow, SLIPContext loggingContext) {
        submit((SlipOnboardingEvent) SlipOnboardingEvent2.toEvent(splash, showRecommendedFlow, loggingContext));
    }

    private final void showValueProps(SlipOnboarding.ValuePropsView valueProps) {
        submit((SlipOnboardingEvent) SlipOnboardingEvent2.toEvent(valueProps));
    }

    private final void showUkFlow(String entryPoint, String accountNumber) {
        submit((SlipOnboardingDuxo) new SlipOnboardingEvent.ShowUkFlow(entryPoint, accountNumber));
    }

    private final void showInvestorProfile() {
        submit((SlipOnboardingDuxo) SlipOnboardingEvent.ShowInvestorProfile.INSTANCE);
    }

    private final void showChecklist() {
        submit((SlipOnboardingDuxo) SlipOnboardingEvent.ShowChecklist.INSTANCE);
    }

    private final void showEligibilityResult(boolean isRecommended) {
        submit((SlipOnboardingDuxo) new SlipOnboardingEvent.ShowEligibilityResult(isRecommended));
    }

    private final void showAgreements(boolean showRecommendedFlow, boolean isQuickEnrollment) {
        submit((SlipOnboardingDuxo) new SlipOnboardingEvent.ShowAgreements(showRecommendedFlow, isQuickEnrollment));
    }

    private final void showSuccess(SlipOnboarding.SuccessView success) {
        submit((SlipOnboardingEvent) SlipOnboardingEvent2.toEvent(success));
    }

    private final void showError(Throwable throwable) {
        submit((SlipOnboardingEvent) SlipOnboardingEvent2.toEvent(throwable));
    }

    private final void submit(SlipOnboardingEvent slipOnboardingEvent) {
        submit((SlipOnboardingDuxo) slipOnboardingEvent);
    }

    public final void clearHomeCardStack() {
        this.cardManager.invalidateCardsBestEffort();
    }

    public final void refreshFeatureDiscovery() {
        FeatureDiscoveryStore.refresh$default(this.featureDiscoveryStore, FeatureDiscoveryLocation.INVESTING_BELOW_CARD, null, 2, null);
    }

    /* compiled from: SlipOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingDuxo;", "Lcom/robinhood/android/margin/contracts/SlipOnboardingKey;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<SlipOnboardingDuxo, SlipOnboardingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public SlipOnboardingKey getExtras(SavedStateHandle savedStateHandle) {
            return (SlipOnboardingKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public SlipOnboardingKey getExtras(SlipOnboardingDuxo slipOnboardingDuxo) {
            return (SlipOnboardingKey) DuxoCompanion2.DefaultImpls.getExtras(this, slipOnboardingDuxo);
        }
    }
}
