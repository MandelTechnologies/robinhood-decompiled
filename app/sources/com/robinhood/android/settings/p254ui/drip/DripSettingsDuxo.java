package com.robinhood.android.settings.p254ui.drip;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.settings.p254ui.drip.DripSettingsEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.DripEligibility;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiInstrumentDripSettings;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DripSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsViewState;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "dripSettingsStore", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/DripSettingsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "setAccountDripSettings", "enabled", "", "setInstrumentDripSettings", "instrumentId", "Ljava/util/UUID;", "Companion", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DripSettingsDuxo extends BaseDuxo5<DripSettingsViewState, DripSettingsEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final DripSettingsStore dripSettingsStore;
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
    public DripSettingsDuxo(AccountProvider accountProvider, DripSettingsStore dripSettingsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new DripSettingsViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(dripSettingsStore, "dripSettingsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.dripSettingsStore = dripSettingsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        Observable<Account> observableStreamIndividualAccount;
        Observable<List<UiInstrumentDripSettings>> observableStreamIndividualAccountInstrumentSettings;
        super.onResume();
        Companion companion = INSTANCE;
        String accountNumber = ((DripSettingsArgs) companion.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber == null || accountNumber.length() == 0) {
            observableStreamIndividualAccount = this.accountProvider.streamIndividualAccount();
        } else {
            observableStreamIndividualAccount = this.accountProvider.streamAccount(accountNumber);
        }
        LifecycleHost.DefaultImpls.bind$default(this, observableStreamIndividualAccount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DripSettingsDuxo.onResume$lambda$0(this.f$0, (Account) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.dripSettingsStore.streamDripOnboardingEligibility(((DripSettingsArgs) companion.getArgs((HasSavedState) this)).getAccountNumber())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DripSettingsDuxo.onResume$lambda$1(this.f$0, (DripEligibility) obj);
            }
        });
        if (accountNumber == null || accountNumber.length() == 0) {
            this.dripSettingsStore.refresh(true);
            observableStreamIndividualAccountInstrumentSettings = this.dripSettingsStore.streamIndividualAccountInstrumentSettings();
        } else {
            this.dripSettingsStore.refreshForAccount(true, accountNumber);
            observableStreamIndividualAccountInstrumentSettings = this.dripSettingsStore.streamSettingsForAllInstruments(accountNumber);
        }
        LifecycleHost.DefaultImpls.bind$default(this, observableStreamIndividualAccountInstrumentSettings, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DripSettingsDuxo.onResume$lambda$2(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(DripSettingsDuxo dripSettingsDuxo, Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        dripSettingsDuxo.applyMutation(new DripSettingsDuxo2(account, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(DripSettingsDuxo dripSettingsDuxo, DripEligibility eligibility) {
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        if (!Intrinsics.areEqual(eligibility, DripEligibility.AlreadyOnboarded.INSTANCE)) {
            if (eligibility instanceof DripEligibility.Eligible) {
                dripSettingsDuxo.submit(new DripSettingsEvent.ShowOnboardingFlow(((DripEligibility.Eligible) eligibility).getAccountNumber()));
            } else {
                if (!Intrinsics.areEqual(eligibility, DripEligibility.Ineligible.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                dripSettingsDuxo.submit(DripSettingsEvent.ShowIneligibleDialog.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(DripSettingsDuxo dripSettingsDuxo, List instrumentDripSettings) {
        Intrinsics.checkNotNullParameter(instrumentDripSettings, "instrumentDripSettings");
        dripSettingsDuxo.applyMutation(new DripSettingsDuxo3(instrumentDripSettings, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DripSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.drip.DripSettingsDuxo$setAccountDripSettings$1", m3645f = "DripSettingsDuxo.kt", m3646l = {81, 83}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.drip.DripSettingsDuxo$setAccountDripSettings$1 */
    static final class C283571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $enabled;
        int label;
        final /* synthetic */ DripSettingsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283571(String str, DripSettingsDuxo dripSettingsDuxo, boolean z, Continuation<? super C283571> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.this$0 = dripSettingsDuxo;
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C283571(this.$accountNumber, this.this$0, this.$enabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r5 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        
            if (r5 == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$accountNumber;
                if (str == null || str.length() == 0) {
                    DripSettingsStore dripSettingsStore = this.this$0.dripSettingsStore;
                    boolean z = this.$enabled;
                    this.label = 1;
                    obj = dripSettingsStore.setIndividualAccountSettings(z, this);
                } else {
                    DripSettingsStore dripSettingsStore2 = this.this$0.dripSettingsStore;
                    boolean z2 = this.$enabled;
                    String str2 = this.$accountNumber;
                    this.label = 2;
                    obj = dripSettingsStore2.setAccountSettings(z2, str2, this);
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.submit(DripSettingsEvent.SettingsUpdateSuccess.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public final void setAccountDripSettings(boolean enabled) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C283571(((DripSettingsArgs) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber(), this, enabled, null), 3, null);
    }

    /* compiled from: DripSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.drip.DripSettingsDuxo$setInstrumentDripSettings$1", m3645f = "DripSettingsDuxo.kt", m3646l = {94, 96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.drip.DripSettingsDuxo$setInstrumentDripSettings$1 */
    static final class C283581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ UUID $instrumentId;
        int label;
        final /* synthetic */ DripSettingsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C283581(String str, DripSettingsDuxo dripSettingsDuxo, UUID uuid, boolean z, Continuation<? super C283581> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.this$0 = dripSettingsDuxo;
            this.$instrumentId = uuid;
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C283581(this.$accountNumber, this.this$0, this.$instrumentId, this.$enabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r6 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        
            if (r6 == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$accountNumber;
                if (str == null || str.length() == 0) {
                    DripSettingsStore dripSettingsStore = this.this$0.dripSettingsStore;
                    UUID uuid = this.$instrumentId;
                    boolean z = this.$enabled;
                    this.label = 1;
                    obj = dripSettingsStore.setIndividualAccountInstrumentSettings(uuid, z, this);
                } else {
                    DripSettingsStore dripSettingsStore2 = this.this$0.dripSettingsStore;
                    UUID uuid2 = this.$instrumentId;
                    boolean z2 = this.$enabled;
                    String str2 = this.$accountNumber;
                    this.label = 2;
                    obj = dripSettingsStore2.setInstrumentSettings(uuid2, z2, str2, this);
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.submit(DripSettingsEvent.SettingsUpdateSuccess.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public final void setInstrumentDripSettings(UUID instrumentId, boolean enabled) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C283581(((DripSettingsArgs) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber(), this, instrumentId, enabled, null), 3, null);
    }

    /* compiled from: DripSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsDuxo;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsArgs;", "<init>", "()V", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DripSettingsDuxo, DripSettingsArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DripSettingsArgs getArgs(SavedStateHandle savedStateHandle) {
            return (DripSettingsArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DripSettingsArgs getArgs(DripSettingsDuxo dripSettingsDuxo) {
            return (DripSettingsArgs) DuxoCompanion.DefaultImpls.getArgs(this, dripSettingsDuxo);
        }
    }
}
