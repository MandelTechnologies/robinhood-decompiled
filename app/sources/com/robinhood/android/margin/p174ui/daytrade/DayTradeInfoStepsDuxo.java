package com.robinhood.android.margin.p174ui.daytrade;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSettingsStore;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoActivity;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoStepsFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ApiMarginSetting;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.MarginSetting;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DayTradeInfoStepsDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "marginSetting", "Lcom/robinhood/models/db/MarginSetting;", "accountObs", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Account;", "getAccountObs", "()Lio/reactivex/Observable;", "onCreate", "", "setCashManagementState", "state", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity$CashManagementState;", "setSelectedStep", "position", "", "setSelectedVariant", "setDayTradeProtectionEnabled", "enabled", "", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DayTradeInfoStepsDuxo extends OldBaseDuxo<DayTradeInfoStepsViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private MarginSetting marginSetting;
    private final MarginSettingsStore marginSettingsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DayTradeInfoStepsDuxo(SavedStateHandle savedStateHandle, AccountProvider accountProvider, ExperimentsStore experimentsStore, MarginSettingsStore marginSettingsStore) {
        super(new DayTradeInfoStepsViewState(null, null, false, false, null, null, 0, 0, 255, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        this.savedStateHandle = savedStateHandle;
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.marginSettingsStore = marginSettingsStore;
    }

    private final Observable<Account> getAccountObs() {
        Observable<Account> observableStreamAccount;
        String accountNumber = ((DayTradeInfoStepsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        return (accountNumber == null || (observableStreamAccount = this.accountProvider.streamAccount(accountNumber)) == null) ? this.accountProvider.streamIndividualAccount() : observableStreamAccount;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(getAccountObs(), ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.CASH_LIMITED_INTEREST.INSTANCE}, false, null, 6, null), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$onCreate$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                Account account = (Account) t1;
                if (account.getCashManagementEnabled() && zBooleanValue) {
                    return (R) DayTradeInfoActivity.CashManagementState.ENABLED_LIMITED_INTEREST;
                }
                return account.getCashManagementEnabled() ? (R) DayTradeInfoActivity.CashManagementState.ENABLED : (R) DayTradeInfoActivity.CashManagementState.DISABLED;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableCombineLatest), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C210262(this));
        Observable<R> observableSwitchMap = getAccountObs().doOnNext(new Consumer() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo.onCreate.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Account account) {
                DayTradeInfoStepsDuxo.this.marginSettingsStore.refreshAccount(false, account.getAccountNumber());
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo.onCreate.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarginSetting> apply(Account it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return DayTradeInfoStepsDuxo.this.marginSettingsStore.getMarginSettings(it.getAccountNumber());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.onCreate$lambda$2(this.f$0, (MarginSetting) obj);
            }
        });
        applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.onCreate$lambda$3(this.f$0, (DayTradeInfoStepsViewState) obj);
            }
        });
    }

    /* compiled from: DayTradeInfoStepsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$onCreate$2 */
    /* synthetic */ class C210262 extends FunctionReferenceImpl implements Function1<DayTradeInfoActivity.CashManagementState, Unit> {
        C210262(Object obj) {
            super(1, obj, DayTradeInfoStepsDuxo.class, "setCashManagementState", "setCashManagementState(Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity$CashManagementState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayTradeInfoActivity.CashManagementState cashManagementState) {
            invoke2(cashManagementState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayTradeInfoActivity.CashManagementState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DayTradeInfoStepsDuxo) this.receiver).setCashManagementState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(DayTradeInfoStepsDuxo dayTradeInfoStepsDuxo, MarginSetting marginSetting) {
        dayTradeInfoStepsDuxo.marginSetting = marginSetting;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DayTradeInfoStepsViewState onCreate$lambda$3(DayTradeInfoStepsDuxo dayTradeInfoStepsDuxo, DayTradeInfoStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Companion companion = INSTANCE;
        return DayTradeInfoStepsViewState.copy$default(applyMutation, ((DayTradeInfoStepsFragment.Args) companion.getArgs((HasSavedState) dayTradeInfoStepsDuxo)).getStage(), ((DayTradeInfoStepsFragment.Args) companion.getArgs((HasSavedState) dayTradeInfoStepsDuxo)).getDayTradeInfo(), false, false, null, null, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public final void setCashManagementState(DayTradeInfoActivity.CashManagementState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final boolean z = state == DayTradeInfoActivity.CashManagementState.ENABLED_LIMITED_INTEREST;
        final boolean z2 = state == DayTradeInfoActivity.CashManagementState.ENABLED || z;
        applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.setCashManagementState$lambda$4(z2, z, (DayTradeInfoStepsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DayTradeInfoStepsViewState setCashManagementState$lambda$4(boolean z, boolean z2, DayTradeInfoStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DayTradeInfoStepsViewState.copy$default(applyMutation, null, null, z, z2, null, null, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, null);
    }

    public final void setSelectedStep(final int position) {
        applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.setSelectedStep$lambda$5(position, (DayTradeInfoStepsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DayTradeInfoStepsViewState setSelectedStep$lambda$5(int i, DayTradeInfoStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DayTradeInfoStepsViewState.copy$default(applyMutation, null, null, false, false, null, null, i, 0, 63, null);
    }

    public final void setSelectedVariant(final int position) {
        applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.setSelectedVariant$lambda$6(position, (DayTradeInfoStepsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DayTradeInfoStepsViewState setSelectedVariant$lambda$6(int i, DayTradeInfoStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DayTradeInfoStepsViewState.copy$default(applyMutation, null, null, false, false, null, null, 0, i, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public final void setDayTradeProtectionEnabled(boolean enabled) {
        MarginSettingsStore marginSettingsStore = this.marginSettingsStore;
        MarginSetting marginSetting = this.marginSetting;
        Intrinsics.checkNotNull(marginSetting);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(marginSettingsStore.updateDayTradeSetting(marginSetting.getAccountId(), enabled)), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.setDayTradeProtectionEnabled$lambda$8(this.f$0, (ApiMarginSetting) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.setDayTradeProtectionEnabled$lambda$10(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDayTradeProtectionEnabled$lambda$8(DayTradeInfoStepsDuxo dayTradeInfoStepsDuxo, ApiMarginSetting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        dayTradeInfoStepsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.setDayTradeProtectionEnabled$lambda$8$lambda$7((DayTradeInfoStepsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DayTradeInfoStepsViewState setDayTradeProtectionEnabled$lambda$8$lambda$7(DayTradeInfoStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DayTradeInfoStepsViewState.copy$default(applyMutation, null, null, false, false, new UiEvent(Unit.INSTANCE), null, 0, 0, 239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDayTradeProtectionEnabled$lambda$10(DayTradeInfoStepsDuxo dayTradeInfoStepsDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        dayTradeInfoStepsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsDuxo.setDayTradeProtectionEnabled$lambda$10$lambda$9((DayTradeInfoStepsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DayTradeInfoStepsViewState setDayTradeProtectionEnabled$lambda$10$lambda$9(DayTradeInfoStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DayTradeInfoStepsViewState.copy$default(applyMutation, null, null, false, false, null, new UiEvent(Unit.INSTANCE), 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    /* compiled from: DayTradeInfoStepsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsDuxo;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Args;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DayTradeInfoStepsDuxo, DayTradeInfoStepsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DayTradeInfoStepsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DayTradeInfoStepsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DayTradeInfoStepsFragment.Args getArgs(DayTradeInfoStepsDuxo dayTradeInfoStepsDuxo) {
            return (DayTradeInfoStepsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, dayTradeInfoStepsDuxo);
        }
    }
}
