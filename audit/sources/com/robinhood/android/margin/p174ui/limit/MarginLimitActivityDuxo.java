package com.robinhood.android.margin.p174ui.limit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.margin.contracts.MarginLimitActivityKey;
import com.robinhood.android.margin.p174ui.limit.MarginLimitActivityEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.store.user.UserStore;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
import kotlinx.coroutines.Deferred;

/* compiled from: MarginLimitActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityState;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginLimitActivityDuxo extends BaseDuxo5<MarginLimitActivityState, MarginLimitActivityEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final MarginInvestingInfoStore marginInvestingInfoStore;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginLimitActivityDuxo(AccountProvider accountProvider, UserStore userStore, MarginInvestingInfoStore marginInvestingInfoStore, LeveredMarginSettingsStore marginSettingsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new MarginLimitActivityState(((MarginLimitActivityKey) INSTANCE.getExtras(savedStateHandle)).getAccountNumber()), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.userStore = userStore;
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.marginSettingsStore = marginSettingsStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: MarginLimitActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitActivityDuxo$onCreate$1", m3645f = "MarginLimitActivityDuxo.kt", m3646l = {39, 41, 53, 54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitActivityDuxo$onCreate$1 */
    static final class C210811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C210811(Continuation<? super C210811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C210811 c210811 = MarginLimitActivityDuxo.this.new C210811(continuation);
            c210811.L$0 = obj;
            return c210811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C210811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:48:0x0101, B:49:0x010b, B:16:0x0036, B:44:0x00f0, B:19:0x0047, B:37:0x00b3, B:39:0x00bb, B:40:0x00c4, B:22:0x0055, B:31:0x008d, B:33:0x0096, B:25:0x0063, B:27:0x0078), top: B:57:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c4 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:48:0x0101, B:49:0x010b, B:16:0x0036, B:44:0x00f0, B:19:0x0047, B:37:0x00b3, B:39:0x00bb, B:40:0x00c4, B:22:0x0055, B:31:0x008d, B:33:0x0096, B:25:0x0063, B:27:0x0078), top: B:57:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Throwable thM28553exceptionOrNullimpl;
            CoroutineScope coroutineScope;
            MarginLimitActivityDuxo marginLimitActivityDuxo;
            CoroutineScope coroutineScope2;
            String str;
            Object objFetchMarginSettings;
            CoroutineScope coroutineScope3;
            Deferred deferred;
            MarginLimitActivityDuxo marginLimitActivityDuxo2;
            Object objAwait;
            CountryCode.Supported supported;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                MarginLimitActivityDuxo marginLimitActivityDuxo3 = MarginLimitActivityDuxo.this;
                Result.Companion companion2 = Result.INSTANCE;
                marginLimitActivityDuxo3.submit(MarginLimitActivityEvent.Loading.INSTANCE);
                String accountNumber = ((MarginLimitActivityKey) MarginLimitActivityDuxo.INSTANCE.getExtras((HasSavedState) marginLimitActivityDuxo3)).getAccountNumber();
                if (accountNumber == null) {
                    AccountProvider accountProvider = marginLimitActivityDuxo3.accountProvider;
                    this.L$0 = marginLimitActivityDuxo3;
                    this.L$1 = coroutineScope;
                    this.label = 1;
                    Object individualAccountNumberForced = accountProvider.getIndividualAccountNumberForced(this);
                    if (individualAccountNumberForced == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    marginLimitActivityDuxo = marginLimitActivityDuxo3;
                    obj = individualAccountNumberForced;
                } else {
                    marginLimitActivityDuxo = marginLimitActivityDuxo3;
                    coroutineScope2 = coroutineScope;
                    str = accountNumber;
                    marginLimitActivityDuxo.applyMutation(new MarginLimitActivityDuxo2(str, null));
                    LeveredMarginSettingsStore leveredMarginSettingsStore = marginLimitActivityDuxo.marginSettingsStore;
                    this.L$0 = marginLimitActivityDuxo;
                    this.L$1 = coroutineScope2;
                    this.L$2 = str;
                    this.label = 2;
                    objFetchMarginSettings = leveredMarginSettingsStore.fetchMarginSettings(str, this);
                    if (objFetchMarginSettings != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope3 = coroutineScope2;
                    obj = objFetchMarginSettings;
                    if (((MarginSettings) obj).isMarginInvestingEnabled()) {
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            supported = (CountryCode.Supported) this.L$1;
                            marginLimitActivityDuxo2 = (MarginLimitActivityDuxo) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            marginLimitActivityDuxo2.submit(new MarginLimitActivityEvent.Loaded(supported, (ApiMarginInvestingInfo) obj));
                            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl != null) {
                                MarginLimitActivityDuxo.this.submit(new MarginLimitActivityEvent.Error(thM28553exceptionOrNullimpl));
                            }
                            return Unit.INSTANCE;
                        }
                        marginLimitActivityDuxo2 = (MarginLimitActivityDuxo) this.L$1;
                        deferred = (Deferred) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        CountryCode.Supported supported2 = (CountryCode.Supported) obj;
                        this.L$0 = marginLimitActivityDuxo2;
                        this.L$1 = supported2;
                        this.label = 4;
                        objAwait = deferred.await(this);
                        if (objAwait != coroutine_suspended) {
                            supported = supported2;
                            obj = objAwait;
                            marginLimitActivityDuxo2.submit(new MarginLimitActivityEvent.Loaded(supported, (ApiMarginInvestingInfo) obj));
                            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    str = (String) this.L$2;
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$1;
                    marginLimitActivityDuxo = (MarginLimitActivityDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope3 = coroutineScope4;
                    if (((MarginSettings) obj).isMarginInvestingEnabled()) {
                        marginLimitActivityDuxo.submit(new MarginLimitActivityEvent.RedirectToOnboarding(str));
                        objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new MarginLimitActivityDuxo4(marginLimitActivityDuxo, str, null), 3, null);
                    Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new MarginLimitActivityDuxo3(marginLimitActivityDuxo, null), 3, null);
                    this.L$0 = deferredAsync$default;
                    this.L$1 = marginLimitActivityDuxo;
                    this.L$2 = null;
                    this.label = 3;
                    Object objAwait2 = deferredAsync$default2.await(this);
                    if (objAwait2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deferred = deferredAsync$default;
                    obj = objAwait2;
                    marginLimitActivityDuxo2 = marginLimitActivityDuxo;
                    CountryCode.Supported supported22 = (CountryCode.Supported) obj;
                    this.L$0 = marginLimitActivityDuxo2;
                    this.L$1 = supported22;
                    this.label = 4;
                    objAwait = deferred.await(this);
                    if (objAwait != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                coroutineScope = (CoroutineScope) this.L$1;
                marginLimitActivityDuxo = (MarginLimitActivityDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            CoroutineScope coroutineScope5 = coroutineScope;
            str = (String) obj;
            coroutineScope2 = coroutineScope5;
            marginLimitActivityDuxo.applyMutation(new MarginLimitActivityDuxo2(str, null));
            LeveredMarginSettingsStore leveredMarginSettingsStore2 = marginLimitActivityDuxo.marginSettingsStore;
            this.L$0 = marginLimitActivityDuxo;
            this.L$1 = coroutineScope2;
            this.L$2 = str;
            this.label = 2;
            objFetchMarginSettings = leveredMarginSettingsStore2.fetchMarginSettings(str, this);
            if (objFetchMarginSettings != coroutine_suspended) {
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C210811(null), 3, null);
    }

    /* compiled from: MarginLimitActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo;", "Lcom/robinhood/android/margin/contracts/MarginLimitActivityKey;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<MarginLimitActivityDuxo, MarginLimitActivityKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public MarginLimitActivityKey getExtras(SavedStateHandle savedStateHandle) {
            return (MarginLimitActivityKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public MarginLimitActivityKey getExtras(MarginLimitActivityDuxo marginLimitActivityDuxo) {
            return (MarginLimitActivityKey) DuxoCompanion2.DefaultImpls.getExtras(this, marginLimitActivityDuxo);
        }
    }
}
