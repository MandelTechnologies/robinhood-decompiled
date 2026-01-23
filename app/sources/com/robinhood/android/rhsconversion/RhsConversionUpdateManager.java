package com.robinhood.android.rhsconversion;

import androidx.lifecycle.LifecycleOwner;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.rhsconversion.RhsConversionActivity;
import com.robinhood.android.rhsconversion.RhsConversionUpdateManager;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.disposer.DisposerKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.librobinhood.data.prefs.HasConvertedToRhsPref;
import com.robinhood.librobinhood.data.store.identi.UserAgreementsStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.Optional;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RhProcessLifecycleOwner2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhsConversionUpdateManager.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionUpdateManager;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "isConvertedPref", "Lcom/robinhood/prefs/BooleanPreference;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/util/LockscreenManager;Lcom/robinhood/utils/RhProcessLifecycleOwner;)V", "hasCheckedThisSession", "", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onMainTabActivityResumed", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "shouldRunChecks", "shouldTakeover", "Lio/reactivex/Observable;", "Lcom/robinhood/android/rhsconversion/RhsConversionUpdateManager$AgreementState;", "AgreementState", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhsConversionUpdateManager implements RhProcessLifecycleOwner2, MainTabActivityListener {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private boolean hasCheckedThisSession;
    private final BooleanPreference isConvertedPref;
    private final LockscreenManager lockscreenManager;
    private final RhProcessLifecycleOwner rhProcessLifecycleOwner;
    private final UserAgreementsStore userAgreementsStore;

    /* compiled from: RhsConversionUpdateManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgreementState.values().length];
            try {
                iArr[AgreementState.NO_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AgreementState.HAS_NOT_AGREED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AgreementState.HAS_ALREADY_AGREED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityCreated(BaseActivity baseActivity) {
        MainTabActivityListener.DefaultImpls.onMainTabActivityCreated(this, baseActivity);
    }

    public RhsConversionUpdateManager(AccountProvider accountProvider, UserAgreementsStore userAgreementsStore, @HasConvertedToRhsPref BooleanPreference isConvertedPref, LockscreenManager lockscreenManager, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
        Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.accountProvider = accountProvider;
        this.userAgreementsStore = userAgreementsStore;
        this.isConvertedPref = isConvertedPref;
        this.lockscreenManager = lockscreenManager;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.hasCheckedThisSession = false;
    }

    @Override // com.robinhood.android.common.util.lifecycle.MainTabActivityListener
    public void onMainTabActivityResumed(final BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (shouldRunChecks()) {
            this.rhProcessLifecycleOwner.register(this);
            Observable<AgreementState> observableOnErrorReturnItem = shouldTakeover().onErrorReturnItem(AgreementState.NO_ACCOUNT);
            Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
            DisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableOnErrorReturnItem), activity.getLifecycleEvents(), (LifecycleEvent) null, 2, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhsconversion.RhsConversionUpdateManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhsConversionUpdateManager.onMainTabActivityResumed$lambda$0(this.f$0, activity, (RhsConversionUpdateManager.AgreementState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMainTabActivityResumed$lambda$0(RhsConversionUpdateManager rhsConversionUpdateManager, BaseActivity baseActivity, AgreementState agreementState) {
        rhsConversionUpdateManager.hasCheckedThisSession = true;
        Intrinsics.checkNotNull(agreementState);
        int i = WhenMappings.$EnumSwitchMapping$0[agreementState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                RhsConversionActivity.Companion.start$default(RhsConversionActivity.INSTANCE, baseActivity, false, 2, null);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                rhsConversionUpdateManager.isConvertedPref.set(true);
            }
        }
        return Unit.INSTANCE;
    }

    private final boolean shouldRunChecks() {
        if (this.lockscreenManager.isLocked()) {
            return false;
        }
        if (this.isConvertedPref.isSet() && this.isConvertedPref.get()) {
            return false;
        }
        return !this.hasCheckedThisSession;
    }

    private final Observable<AgreementState> shouldTakeover() {
        Observable<Optional<Account>> observableStreamIndividualAccountOptional = this.accountProvider.streamIndividualAccountOptional();
        Observable<Boolean> observable = this.userAgreementsStore.isAgreedToRhsMargin().toObservable();
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observable);
        Observable observableCombineLatest = Observable.combineLatest(observableStreamIndividualAccountOptional, observable, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.rhsconversion.RhsConversionUpdateManager$shouldTakeover$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Boolean bool = (Boolean) t2;
                Account account = (Account) ((Optional) t1).component1();
                this.this$0.isConvertedPref.set(bool.booleanValue());
                if (account == null) {
                    return (R) RhsConversionUpdateManager.AgreementState.NO_ACCOUNT;
                }
                return bool.booleanValue() ? (R) RhsConversionUpdateManager.AgreementState.HAS_ALREADY_AGREED : (R) RhsConversionUpdateManager.AgreementState.HAS_NOT_AGREED;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<AgreementState> observableSubscribeOn = observableCombineLatest.take(1L).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RhsConversionUpdateManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionUpdateManager$AgreementState;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACCOUNT", "HAS_NOT_AGREED", "HAS_ALREADY_AGREED", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class AgreementState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AgreementState[] $VALUES;
        public static final AgreementState NO_ACCOUNT = new AgreementState("NO_ACCOUNT", 0);
        public static final AgreementState HAS_NOT_AGREED = new AgreementState("HAS_NOT_AGREED", 1);
        public static final AgreementState HAS_ALREADY_AGREED = new AgreementState("HAS_ALREADY_AGREED", 2);

        private static final /* synthetic */ AgreementState[] $values() {
            return new AgreementState[]{NO_ACCOUNT, HAS_NOT_AGREED, HAS_ALREADY_AGREED};
        }

        public static EnumEntries<AgreementState> getEntries() {
            return $ENTRIES;
        }

        private AgreementState(String str, int i) {
        }

        static {
            AgreementState[] agreementStateArr$values = $values();
            $VALUES = agreementStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(agreementStateArr$values);
        }

        public static AgreementState valueOf(String str) {
            return (AgreementState) Enum.valueOf(AgreementState.class, str);
        }

        public static AgreementState[] values() {
            return (AgreementState[]) $VALUES.clone();
        }
    }
}
