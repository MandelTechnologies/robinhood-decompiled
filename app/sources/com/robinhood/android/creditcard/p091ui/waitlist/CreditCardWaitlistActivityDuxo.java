package com.robinhood.android.creditcard.p091ui.waitlist;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistExperiment;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistIntentKey;
import com.robinhood.android.creditcard.p091ui.CreditCardApplicationSkipUpsellExperiment;
import com.robinhood.android.creditcard.p091ui.waitlist.CreditCardWaitlistActivityDuxo2;
import com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardApplicationReferralCodePref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardApplicationShowPlanSelectorPref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardEntryPointSourcePref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardWaitlistAutoJoinPref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardWaitlistReferralCodePref;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabStateResponse;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import com.robinhood.models.api.bonfire.waitlist.EmailWaitlistSpotStatus;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CreditCardWaitlistActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001%B\u0085\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010$\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "waitlistStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "creditCardWaitlistAutoJoin", "Lcom/robinhood/prefs/BooleanPreference;", "creditCardWaitlistReferralCode", "Lcom/robinhood/prefs/StringPreference;", "creditCardApplicationReferralCode", "creditCardEntryPointSourcePref", "creditCardApplicationShowPlanSelector", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "upsellSkipped", "", "onStart", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CreditCardWaitlistActivityDuxo extends BaseDuxo5<Unit, CreditCardWaitlistActivityDuxo2> implements HasSavedState {
    private final AccountSelectorHomeManager accountSelectorHomeManager;
    private final AuthManager authManager;
    private final StringPreference creditCardApplicationReferralCode;
    private final BooleanPreference creditCardApplicationShowPlanSelector;
    private final StringPreference creditCardEntryPointSourcePref;
    private final BooleanPreference creditCardWaitlistAutoJoin;
    private final StringPreference creditCardWaitlistReferralCode;
    private final CoroutineDispatcher defaultDispatcher;
    private final ExperimentsStore experimentsStore;
    private final RhyTabStateStore rhyTabStateStore;
    private final SavedStateHandle savedStateHandle;
    private boolean upsellSkipped;
    private final UserStore userStore;
    private final CreditCardWaitlistStore waitlistStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardWaitlistActivityDuxo(AuthManager authManager, ExperimentsStore experimentsStore, RhyTabStateStore rhyTabStateStore, UserStore userStore, CreditCardWaitlistStore waitlistStore, AccountSelectorHomeManager accountSelectorHomeManager, @CreditCardWaitlistAutoJoinPref BooleanPreference creditCardWaitlistAutoJoin, @CreditCardWaitlistReferralCodePref StringPreference creditCardWaitlistReferralCode, @CreditCardApplicationReferralCodePref StringPreference creditCardApplicationReferralCode, @CreditCardEntryPointSourcePref StringPreference creditCardEntryPointSourcePref, @CreditCardApplicationShowPlanSelectorPref BooleanPreference creditCardApplicationShowPlanSelector, SavedStateHandle savedStateHandle, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(creditCardWaitlistAutoJoin, "creditCardWaitlistAutoJoin");
        Intrinsics.checkNotNullParameter(creditCardWaitlistReferralCode, "creditCardWaitlistReferralCode");
        Intrinsics.checkNotNullParameter(creditCardApplicationReferralCode, "creditCardApplicationReferralCode");
        Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
        Intrinsics.checkNotNullParameter(creditCardApplicationShowPlanSelector, "creditCardApplicationShowPlanSelector");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.authManager = authManager;
        this.experimentsStore = experimentsStore;
        this.rhyTabStateStore = rhyTabStateStore;
        this.userStore = userStore;
        this.waitlistStore = waitlistStore;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.creditCardWaitlistAutoJoin = creditCardWaitlistAutoJoin;
        this.creditCardWaitlistReferralCode = creditCardWaitlistReferralCode;
        this.creditCardApplicationReferralCode = creditCardApplicationReferralCode;
        this.creditCardEntryPointSourcePref = creditCardEntryPointSourcePref;
        this.creditCardApplicationShowPlanSelector = creditCardApplicationShowPlanSelector;
        this.savedStateHandle = savedStateHandle;
        this.defaultDispatcher = defaultDispatcher;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        StringPreference stringPreference = this.creditCardWaitlistReferralCode;
        Companion companion = INSTANCE;
        stringPreference.set(((CreditCardWaitlistIntentKey) companion.getExtras((HasSavedState) this)).getReferralCode());
        this.creditCardWaitlistAutoJoin.set(((CreditCardWaitlistIntentKey) companion.getExtras((HasSavedState) this)).getAutoJoin());
        this.creditCardApplicationReferralCode.set(((CreditCardWaitlistIntentKey) companion.getExtras((HasSavedState) this)).getCreditApplicationReferralCode());
        this.creditCardEntryPointSourcePref.set(((CreditCardWaitlistIntentKey) companion.getExtras((HasSavedState) this)).getSource());
        this.creditCardApplicationShowPlanSelector.set(((CreditCardWaitlistIntentKey) companion.getExtras((HasSavedState) this)).getShowPlanSelector());
        if (this.authManager.isLoggedIn()) {
            getLifecycleScope().launchWhenStarted(new C126561(null));
        } else {
            submit(CreditCardWaitlistActivityDuxo2.LoggedOut.INSTANCE);
        }
    }

    /* compiled from: CreditCardWaitlistActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistActivityDuxo$onStart$1", m3645f = "CreditCardWaitlistActivityDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistActivityDuxo$onStart$1 */
    static final class C126561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C126561(Continuation<? super C126561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditCardWaitlistActivityDuxo.this.new C126561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CreditCardWaitlistActivityDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistActivityDuxo$onStart$1$1", m3645f = "CreditCardWaitlistActivityDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 123, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistActivityDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int I$0;
            boolean Z$0;
            boolean Z$1;
            int label;
            final /* synthetic */ CreditCardWaitlistActivityDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreditCardWaitlistActivityDuxo creditCardWaitlistActivityDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = creditCardWaitlistActivityDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00dd A[Catch: all -> 0x0023, PHI: r2 r5 r7
              0x00dd: PHI (r2v12 boolean) = (r2v11 boolean), (r2v34 boolean) binds: [B:38:0x00d9, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE]
              0x00dd: PHI (r5v3 java.lang.Object) = (r5v2 java.lang.Object), (r5v10 java.lang.Object) binds: [B:38:0x00d9, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE]
              0x00dd: PHI (r7v7 boolean) = (r7v6 boolean), (r7v11 boolean) binds: [B:38:0x00d9, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:10:0x001c, B:60:0x0151, B:62:0x0155, B:64:0x015b, B:67:0x0161, B:68:0x0169, B:17:0x0033, B:40:0x00dd, B:42:0x00e1, B:43:0x00ea, B:45:0x00fa, B:46:0x0103, B:49:0x010d, B:51:0x0115, B:52:0x0122, B:56:0x013b, B:20:0x003f, B:37:0x00c3, B:23:0x0049, B:33:0x009e, B:24:0x004f, B:30:0x0076, B:27:0x0058), top: B:73:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:10:0x001c, B:60:0x0151, B:62:0x0155, B:64:0x015b, B:67:0x0161, B:68:0x0169, B:17:0x0033, B:40:0x00dd, B:42:0x00e1, B:43:0x00ea, B:45:0x00fa, B:46:0x0103, B:49:0x010d, B:51:0x0115, B:52:0x0122, B:56:0x013b, B:20:0x003f, B:37:0x00c3, B:23:0x0049, B:33:0x009e, B:24:0x004f, B:30:0x0076, B:27:0x0058), top: B:73:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:10:0x001c, B:60:0x0151, B:62:0x0155, B:64:0x015b, B:67:0x0161, B:68:0x0169, B:17:0x0033, B:40:0x00dd, B:42:0x00e1, B:43:0x00ea, B:45:0x00fa, B:46:0x0103, B:49:0x010d, B:51:0x0115, B:52:0x0122, B:56:0x013b, B:20:0x003f, B:37:0x00c3, B:23:0x0049, B:33:0x009e, B:24:0x004f, B:30:0x0076, B:27:0x0058), top: B:73:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0155 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:10:0x001c, B:60:0x0151, B:62:0x0155, B:64:0x015b, B:67:0x0161, B:68:0x0169, B:17:0x0033, B:40:0x00dd, B:42:0x00e1, B:43:0x00ea, B:45:0x00fa, B:46:0x0103, B:49:0x010d, B:51:0x0115, B:52:0x0122, B:56:0x013b, B:20:0x003f, B:37:0x00c3, B:23:0x0049, B:33:0x009e, B:24:0x004f, B:30:0x0076, B:27:0x0058), top: B:73:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0169 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:10:0x001c, B:60:0x0151, B:62:0x0155, B:64:0x015b, B:67:0x0161, B:68:0x0169, B:17:0x0033, B:40:0x00dd, B:42:0x00e1, B:43:0x00ea, B:45:0x00fa, B:46:0x0103, B:49:0x010d, B:51:0x0115, B:52:0x0122, B:56:0x013b, B:20:0x003f, B:37:0x00c3, B:23:0x0049, B:33:0x009e, B:24:0x004f, B:30:0x0076, B:27:0x0058), top: B:73:0x000e }] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objAwaitFirstOrNull;
                boolean zAreEqual;
                Object objAwaitFirstOrNull2;
                Object objAwaitFirst;
                boolean z;
                boolean z2;
                Object waitlistStatus;
                Object objAwaitFirstOrNull3;
                int i;
                RhyTabState rhyTabState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                try {
                } catch (Throwable th) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    this.this$0.submit(CreditCardWaitlistActivityDuxo2.Error.INSTANCE);
                }
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{CreditCardWaitlistExperiment.INSTANCE}, false, null, 6, null);
                    this.label = 1;
                    objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableStreamState$default, this);
                    if (objAwaitFirstOrNull == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        zAreEqual = this.Z$0;
                        ResultKt.throwOnFailure(obj);
                        objAwaitFirstOrNull2 = obj;
                        boolean zAreEqual2 = Intrinsics.areEqual(objAwaitFirstOrNull2, boxing.boxBoolean(true));
                        Observable<User> user = this.this$0.userStore.getUser();
                        this.Z$0 = zAreEqual;
                        this.Z$1 = zAreEqual2;
                        this.label = 3;
                        objAwaitFirst = RxAwait3.awaitFirst(user, this);
                        if (objAwaitFirst != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z = zAreEqual;
                        z2 = zAreEqual2;
                        String email = ((User) objAwaitFirst).getEmail();
                        CreditCardWaitlistStore creditCardWaitlistStore = this.this$0.waitlistStore;
                        this.Z$0 = z;
                        this.Z$1 = z2;
                        this.label = 4;
                        waitlistStatus = creditCardWaitlistStore.getWaitlistStatus(email, this);
                        if (waitlistStatus == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i2 == 3) {
                        z2 = this.Z$1;
                        boolean z3 = this.Z$0;
                        ResultKt.throwOnFailure(obj);
                        z = z3;
                        objAwaitFirst = obj;
                        String email2 = ((User) objAwaitFirst).getEmail();
                        CreditCardWaitlistStore creditCardWaitlistStore2 = this.this$0.waitlistStore;
                        this.Z$0 = z;
                        this.Z$1 = z2;
                        this.label = 4;
                        waitlistStatus = creditCardWaitlistStore2.getWaitlistStatus(email2, this);
                        if (waitlistStatus == coroutine_suspended) {
                            ApiEmailWaitlistSpot apiEmailWaitlistSpot = (ApiEmailWaitlistSpot) waitlistStatus;
                            if (z) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = this.I$0;
                        ResultKt.throwOnFailure(obj);
                        objAwaitFirstOrNull3 = obj;
                        rhyTabState = (RhyTabState) objAwaitFirstOrNull3;
                        if ((rhyTabState == null ? rhyTabState.getState() : null) != ApiRhyTabStateResponse.ApiRhyTabState.CREDIT_CARD_WAITLIST && i != 0) {
                            this.this$0.submit(CreditCardWaitlistActivityDuxo2.WaitlistInTab.INSTANCE);
                        } else {
                            this.this$0.submit(CreditCardWaitlistActivityDuxo2.WaitlistInModal.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }
                    z2 = this.Z$1;
                    boolean z4 = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                    z = z4;
                    waitlistStatus = obj;
                    ApiEmailWaitlistSpot apiEmailWaitlistSpot2 = (ApiEmailWaitlistSpot) waitlistStatus;
                    if (z) {
                        this.this$0.submit(CreditCardWaitlistActivityDuxo2.Error.INSTANCE);
                    } else if (!((CreditCardWaitlistIntentKey) CreditCardWaitlistActivityDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getShowInModal()) {
                        if (this.this$0.upsellSkipped || !z2 || apiEmailWaitlistSpot2.getState() != EmailWaitlistSpotStatus.GRANTED_ACCESS) {
                            int i3 = (!this.this$0.accountSelectorHomeManager.isAccountSelectorEnabled() || this.this$0.accountSelectorHomeManager.getSupportsCreditCardAccountTab()) ? 1 : 0;
                            Observable<RhyTabState> observableStreamRhyTabState = this.this$0.rhyTabStateStore.streamRhyTabState();
                            this.I$0 = i3;
                            this.label = 5;
                            objAwaitFirstOrNull3 = RxAwait3.awaitFirstOrNull(observableStreamRhyTabState, this);
                            if (objAwaitFirstOrNull3 != coroutine_suspended) {
                                i = i3;
                                rhyTabState = (RhyTabState) objAwaitFirstOrNull3;
                                if ((rhyTabState == null ? rhyTabState.getState() : null) != ApiRhyTabStateResponse.ApiRhyTabState.CREDIT_CARD_WAITLIST) {
                                    this.this$0.submit(CreditCardWaitlistActivityDuxo2.WaitlistInModal.INSTANCE);
                                }
                            }
                            return coroutine_suspended;
                        }
                        this.this$0.upsellSkipped = true;
                        this.this$0.submit(CreditCardWaitlistActivityDuxo2.SkipUpsell.INSTANCE);
                    } else {
                        this.this$0.submit(CreditCardWaitlistActivityDuxo2.WaitlistInModalNoTab.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objAwaitFirstOrNull = obj;
                zAreEqual = Intrinsics.areEqual(objAwaitFirstOrNull, boxing.boxBoolean(true));
                Observable observableStreamState$default2 = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{CreditCardApplicationSkipUpsellExperiment.INSTANCE}, false, null, 6, null);
                this.Z$0 = zAreEqual;
                this.label = 2;
                objAwaitFirstOrNull2 = RxAwait3.awaitFirstOrNull(observableStreamState$default2, this);
                if (objAwaitFirstOrNull2 != coroutine_suspended) {
                    boolean zAreEqual22 = Intrinsics.areEqual(objAwaitFirstOrNull2, boxing.boxBoolean(true));
                    Observable<User> user2 = this.this$0.userStore.getUser();
                    this.Z$0 = zAreEqual;
                    this.Z$1 = zAreEqual22;
                    this.label = 3;
                    objAwaitFirst = RxAwait3.awaitFirst(user2, this);
                    if (objAwaitFirst != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = CreditCardWaitlistActivityDuxo.this.defaultDispatcher;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreditCardWaitlistActivityDuxo.this, null);
                this.label = 1;
                if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == coroutine_suspended) {
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
    }

    /* compiled from: CreditCardWaitlistActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityDuxo;", "Lcom/robinhood/android/creditcard/contracts/CreditCardWaitlistIntentKey;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<CreditCardWaitlistActivityDuxo, CreditCardWaitlistIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CreditCardWaitlistIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (CreditCardWaitlistIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CreditCardWaitlistIntentKey getExtras(CreditCardWaitlistActivityDuxo creditCardWaitlistActivityDuxo) {
            return (CreditCardWaitlistIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, creditCardWaitlistActivityDuxo);
        }
    }
}
