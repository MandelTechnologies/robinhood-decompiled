package com.robinhood.android.redesign.accounttab.prefs;

import android.app.Application;
import android.content.SharedPreferences;
import com.robinhood.android.redesign.accountselector.experiment.AccountTabExperimentStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: AccountSelectorHomeManager.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "Lcom/robinhood/utils/AppInitializedListener;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "accountTabExperimentStore", "Lcom/robinhood/android/redesign/accountselector/experiment/AccountTabExperimentStore;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/redesign/accountselector/experiment/AccountTabExperimentStore;Landroid/content/SharedPreferences;)V", "accountSelectorEnabledPref", "Lcom/robinhood/prefs/BooleanPreference;", "requested", "", "getRequested$lib_account_selector_experiment_externalDebug$annotations", "()V", "getRequested$lib_account_selector_experiment_externalDebug", "()Z", "setRequested$lib_account_selector_experiment_externalDebug", "(Z)V", "cachedValue", "isAccountSelectorEnabled", "allowCreditCardTabToBeShown", "supportsCreditCardAccountTab", "getSupportsCreditCardAccountTab", "onAppInitialized", "", "app", "Landroid/app/Application;", "lib-account-selector-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountSelectorHomeManager implements AppInitializedListener {
    public static final int $stable = 8;
    private final BooleanPreference accountSelectorEnabledPref;
    private final AccountTabExperimentStore accountTabExperimentStore;
    private final boolean allowCreditCardTabToBeShown;
    private boolean cachedValue;
    private boolean requested;
    private final CoroutineScope rootCoroutineScope;
    private final SharedPreferences userPrefs;

    /* renamed from: getRequested$lib_account_selector_experiment_externalDebug$annotations */
    public static /* synthetic */ void m2411xcce782ae() {
    }

    public AccountSelectorHomeManager(@RootCoroutineScope CoroutineScope rootCoroutineScope, AccountTabExperimentStore accountTabExperimentStore, @UserPrefs SharedPreferences userPrefs) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(accountTabExperimentStore, "accountTabExperimentStore");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        this.rootCoroutineScope = rootCoroutineScope;
        this.accountTabExperimentStore = accountTabExperimentStore;
        this.userPrefs = userPrefs;
        BooleanPreference booleanPreference = new BooleanPreference(userPrefs, "account_selector_home_enabled", false, null, 8, null);
        this.accountSelectorEnabledPref = booleanPreference;
        this.cachedValue = booleanPreference.get();
        this.allowCreditCardTabToBeShown = true;
    }

    /* renamed from: getRequested$lib_account_selector_experiment_externalDebug, reason: from getter */
    public final boolean getRequested() {
        return this.requested;
    }

    public final void setRequested$lib_account_selector_experiment_externalDebug(boolean z) {
        this.requested = z;
    }

    public final boolean isAccountSelectorEnabled() {
        this.requested = true;
        return this.cachedValue;
    }

    public final boolean getSupportsCreditCardAccountTab() {
        return isAccountSelectorEnabled() && this.allowCreditCardTabToBeShown;
    }

    /* compiled from: AccountSelectorHomeManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager$onAppInitialized$1", m3645f = "AccountSelectorHomeManager.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager$onAppInitialized$1 */
    static final class C263671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C263671(Continuation<? super C263671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountSelectorHomeManager.this.new C263671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C263671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(AccountSelectorHomeManager.this.accountTabExperimentStore.isRedesignAccountSelectorEnabled());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountSelectorHomeManager.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountSelectorHomeManager.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager$onAppInitialized$1$1", m3645f = "AccountSelectorHomeManager.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager$onAppInitialized$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ AccountSelectorHomeManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AccountSelectorHomeManager accountSelectorHomeManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountSelectorHomeManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                if (!this.this$0.getRequested()) {
                    this.this$0.cachedValue = z;
                }
                Timber.INSTANCE.mo3350d("Update states - requested=" + this.this$0.getRequested() + " pref=" + z + " cached=" + this.this$0.cachedValue, new Object[0]);
                this.this$0.accountSelectorEnabledPref.set(z);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new C263671(null), 3, null);
    }
}
