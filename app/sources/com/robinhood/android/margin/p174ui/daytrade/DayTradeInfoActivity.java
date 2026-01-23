package com.robinhood.android.margin.p174ui.daytrade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSettingsStore;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.model.UiDayTradeInfo;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoActivity;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoLoadingFragment;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoParentFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.MarginSetting;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: DayTradeInfoActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002HIB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\b\u0010;\u001a\u000208H\u0014J\u0010\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u0002082\u0006\u0010@\u001a\u00020AH\u0016J\u001a\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010:H\u0016J\b\u0010F\u001a\u000208H\u0016J\b\u0010G\u001a\u000208H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R+\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00101\u001a\u0004\u0018\u000102X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoLoadingFragment$Callbacks;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "marginSettingsStore", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "getMarginSettingsStore", "()Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "setMarginSettingsStore", "(Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "isForced", "", "()Z", "isForced$delegate", "Lkotlin/Lazy;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "accountNumber$delegate", "accountObs", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Account;", "getAccountObs", "()Lio/reactivex/Observable;", "<set-?>", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity$CashManagementState;", "cashManagementState", "getCashManagementState", "()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity$CashManagementState;", "setCashManagementState", "(Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity$CashManagementState;)V", "cashManagementState$delegate", "Lkotlin/properties/ReadWriteProperty;", "marginSetting", "Lcom/robinhood/models/db/MarginSetting;", "getMarginSetting", "()Lcom/robinhood/models/db/MarginSetting;", "setMarginSetting", "(Lcom/robinhood/models/db/MarginSetting;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onLoadDayTradeInfoSuccess", "dayTradeInfo", "Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "onLoadDayTradeInfoFailed", "throwable", "", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onCompleteTutorial", "onAbortTutorial", "CashManagementState", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DayTradeInfoActivity extends BaseActivity implements DayTradeInfoLoadingFragment.Callbacks, DayTradeInfoParentFragment.Callbacks, RhDialogFragment.OnClickListener {
    private static final String EXTRA_ACCOUNT_NUMBER = "account_number";
    private static final String EXTRA_FORCED = "forced";

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber;
    public AccountProvider accountProvider;

    /* renamed from: cashManagementState$delegate, reason: from kotlin metadata */
    private final Interfaces3 cashManagementState;
    public ExperimentsStore experimentsStore;

    /* renamed from: isForced$delegate, reason: from kotlin metadata */
    private final Lazy isForced;
    private MarginSetting marginSetting;
    public MarginSettingsStore marginSettingsStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DayTradeInfoActivity.class, "cashManagementState", "getCashManagementState()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity$CashManagementState;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DayTradeInfoActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.isForced = Activity.intentExtra(this, EXTRA_FORCED);
        this.accountNumber = Activity.intentExtra(this, "account_number");
        this.cashManagementState = (Interfaces3) BindSavedState2.savedSerializable(this, CashManagementState.ENABLED).provideDelegate(this, $$delegatedProperties[0]);
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final MarginSettingsStore getMarginSettingsStore() {
        MarginSettingsStore marginSettingsStore = this.marginSettingsStore;
        if (marginSettingsStore != null) {
            return marginSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginSettingsStore");
        return null;
    }

    public final void setMarginSettingsStore(MarginSettingsStore marginSettingsStore) {
        Intrinsics.checkNotNullParameter(marginSettingsStore, "<set-?>");
        this.marginSettingsStore = marginSettingsStore;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    private final boolean isForced() {
        return ((Boolean) this.isForced.getValue()).booleanValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    private final Observable<Account> getAccountObs() {
        Observable<Account> observableStreamAccount;
        String accountNumber = getAccountNumber();
        return (accountNumber == null || (observableStreamAccount = getAccountProvider().streamAccount(accountNumber)) == null) ? getAccountProvider().streamIndividualAccount() : observableStreamAccount;
    }

    private final CashManagementState getCashManagementState() {
        return (CashManagementState) this.cashManagementState.getValue(this, $$delegatedProperties[0]);
    }

    private final void setCashManagementState(CashManagementState cashManagementState) {
        this.cashManagementState.setValue(this, $$delegatedProperties[0], cashManagementState);
    }

    @Override // com.robinhood.android.margin.ui.daytrade.DayTradeInfoParentFragment.Callbacks
    public MarginSetting getMarginSetting() {
        return this.marginSetting;
    }

    public void setMarginSetting(MarginSetting marginSetting) {
        this.marginSetting = marginSetting;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, new DayTradeInfoLoadingFragment());
        }
        AccountProvider.DefaultImpls.refresh$default(getAccountProvider(), false, 1, null);
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(getAccountObs(), ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{Experiment.CASH_LIMITED_INTEREST.INSTANCE}, false, null, 6, null), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoActivity$onCreate$$inlined$combineLatest$1
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
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableCombineLatest), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoActivity.onCreate$lambda$2(this.f$0, (DayTradeInfoActivity.CashManagementState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(DayTradeInfoActivity dayTradeInfoActivity, CashManagementState cashManagementState) {
        Intrinsics.checkNotNullParameter(cashManagementState, "cashManagementState");
        dayTradeInfoActivity.setCashManagementState(cashManagementState);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Observable<R> observableSwitchMap = getAccountObs().doOnNext(new Consumer() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoActivity.onResume.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Account account) {
                DayTradeInfoActivity.this.getMarginSettingsStore().refreshAccount(false, account.getAccountNumber());
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoActivity.onResume.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarginSetting> apply(Account it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return DayTradeInfoActivity.this.getMarginSettingsStore().getMarginSettings(it.getAccountNumber());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoActivity.onResume$lambda$3(this.f$0, (MarginSetting) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(DayTradeInfoActivity dayTradeInfoActivity, MarginSetting marginSetting) {
        dayTradeInfoActivity.setMarginSetting(marginSetting);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment.Callbacks
    public void onLoadDayTradeInfoSuccess(UiDayTradeInfo dayTradeInfo) {
        Intrinsics.checkNotNullParameter(dayTradeInfo, "dayTradeInfo");
        replaceFragment(DayTradeInfoParentFragment.INSTANCE.newInstance((Parcelable) new DayTradeInfoParentFragment.Args(dayTradeInfo, isForced(), getAccountNumber())));
    }

    @Override // com.robinhood.android.margin.ui.daytrade.DayTradeInfoLoadingFragment.Callbacks
    public void onLoadDayTradeInfoFailed(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setUseDesignSystemOverlay(true).setId(C20999R.id.dialog_id_day_trade_loading_error).setTitle(C11048R.string.error_title, new Object[0]).setMessage(C11048R.string.error_description, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "daytradeloadingerror", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        finish();
        return true;
    }

    @Override // com.robinhood.android.margin.ui.daytrade.DayTradeInfoParentFragment.Callbacks
    public void onCompleteTutorial() {
        finish();
    }

    @Override // com.robinhood.android.margin.ui.daytrade.DayTradeInfoParentFragment.Callbacks
    public void onAbortTutorial() {
        finish();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DayTradeInfoActivity.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity$CashManagementState;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "ENABLED", "ENABLED_LIMITED_INTEREST", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CashManagementState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CashManagementState[] $VALUES;
        public static final CashManagementState DISABLED = new CashManagementState("DISABLED", 0);
        public static final CashManagementState ENABLED = new CashManagementState("ENABLED", 1);
        public static final CashManagementState ENABLED_LIMITED_INTEREST = new CashManagementState("ENABLED_LIMITED_INTEREST", 2);

        private static final /* synthetic */ CashManagementState[] $values() {
            return new CashManagementState[]{DISABLED, ENABLED, ENABLED_LIMITED_INTEREST};
        }

        public static EnumEntries<CashManagementState> getEntries() {
            return $ENTRIES;
        }

        private CashManagementState(String str, int i) {
        }

        static {
            CashManagementState[] cashManagementStateArr$values = $values();
            $VALUES = cashManagementStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cashManagementStateArr$values);
        }

        public static CashManagementState valueOf(String str) {
            return (CashManagementState) Enum.valueOf(CashManagementState.class, str);
        }

        public static CashManagementState[] values() {
            return (CashManagementState[]) $VALUES.clone();
        }
    }

    /* compiled from: DayTradeInfoActivity.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DayTradeInfo;", "<init>", "()V", "EXTRA_FORCED", "", "EXTRA_ACCOUNT_NUMBER", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "getStartIntent", DayTradeInfoActivity.EXTRA_FORCED, "", "accountNumber", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.DayTradeInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DayTradeInfo key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return getStartIntent(context, key.getForced(), key.getAccountNumber());
        }

        public final Intent getStartIntent(Context context, boolean forced, String accountNumber) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) DayTradeInfoActivity.class);
            intent.putExtra(DayTradeInfoActivity.EXTRA_FORCED, forced);
            intent.putExtra("account_number", accountNumber);
            intent.addFlags(67108864);
            return intent;
        }
    }
}
