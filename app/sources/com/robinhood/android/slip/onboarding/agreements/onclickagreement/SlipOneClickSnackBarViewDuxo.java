package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.slip.contracts.TransparentViewKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.store.AsyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SlipOneClickSnackBarViewDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickSnackBarViewDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoDataState;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "slipAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "singSlipAgreement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOneClickSnackBarViewDuxo extends BaseDuxo<EmptyViewDuxoDataState, SlipOneClickSnackBarViewDuxo4> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;
    private final SlipAgreementsStore slipAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo", m3645f = "SlipOneClickSnackBarViewDuxo.kt", m3646l = {47, 48, 51, 57}, m3647m = "singSlipAgreement")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$1 */
    static final class C285961 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C285961(Continuation<? super C285961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SlipOneClickSnackBarViewDuxo.this.singSlipAgreement(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipOneClickSnackBarViewDuxo(AccountProvider accountProvider, SlipAgreementsStore slipAgreementsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new EmptyViewDuxoDataState(false, null, null, 7, null), SlipOneClickSnackBarViewDuxo3.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(slipAgreementsStore, "slipAgreementsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.slipAgreementsStore = slipAgreementsStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$onCreate$1", m3645f = "SlipOneClickSnackBarViewDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$onCreate$1 */
    static final class C285951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C285951(Continuation<? super C285951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipOneClickSnackBarViewDuxo.this.new C285951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C285951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SlipOneClickSnackBarViewDuxo slipOneClickSnackBarViewDuxo = SlipOneClickSnackBarViewDuxo.this;
                this.label = 1;
                if (slipOneClickSnackBarViewDuxo.singSlipAgreement(this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C285951(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4 A[Catch: Exception -> 0x003a, PHI: r1 r12
      0x00a4: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v8 java.lang.String) binds: [B:37:0x00a1, B:26:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r12v19 java.lang.Object) = (r12v16 java.lang.Object), (r12v1 java.lang.Object) binds: [B:37:0x00a1, B:26:0x0059] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003a, blocks: (B:16:0x0035, B:47:0x00e9, B:49:0x00ef, B:50:0x00f8, B:52:0x00fc, B:53:0x0105, B:23:0x004e, B:43:0x00cf, B:26:0x0059, B:39:0x00a4, B:27:0x005d, B:35:0x0085, B:36:0x0087, B:30:0x006c, B:32:0x007a), top: B:58:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:16:0x0035, B:47:0x00e9, B:49:0x00ef, B:50:0x00f8, B:52:0x00fc, B:53:0x0105, B:23:0x004e, B:43:0x00cf, B:26:0x0059, B:39:0x00a4, B:27:0x005d, B:35:0x0085, B:36:0x0087, B:30:0x006c, B:32:0x007a), top: B:58:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:16:0x0035, B:47:0x00e9, B:49:0x00ef, B:50:0x00f8, B:52:0x00fc, B:53:0x0105, B:23:0x004e, B:43:0x00cf, B:26:0x0059, B:39:0x00a4, B:27:0x005d, B:35:0x0085, B:36:0x0087, B:30:0x006c, B:32:0x007a), top: B:58:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object singSlipAgreement(Continuation<? super Unit> continuation) {
        C285961 c285961;
        String accountNumber;
        String str;
        String str2;
        C285961 c2859612;
        Object slipAgreementsInUI$default;
        DisplayName displayName;
        DisplayName displayName2;
        AsyncResult asyncResult;
        if (continuation instanceof C285961) {
            c285961 = (C285961) continuation;
            int i = c285961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c285961.label = i - Integer.MIN_VALUE;
            } else {
                c285961 = new C285961(continuation);
            }
        }
        C285961 c2859613 = c285961;
        Object individualAccountNumberForced = c2859613.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2859613.label;
        try {
        } catch (Exception e) {
            applyMutation(new C286016(e, null));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(individualAccountNumberForced);
            applyMutation(new C285972(null));
            accountNumber = ((TransparentViewKey) INSTANCE.getExtras((HasSavedState) this)).getAccountNumber();
            if (accountNumber == null) {
                AccountProvider accountProvider = this.accountProvider;
                c2859613.label = 1;
                individualAccountNumberForced = accountProvider.getIndividualAccountNumberForced(c2859613);
                if (individualAccountNumberForced == coroutine_suspended) {
                }
            } else {
                str = accountNumber;
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(str)), Integer.MAX_VALUE, null, 2, null);
                c2859613.L$0 = str;
                c2859613.label = 2;
                individualAccountNumberForced = FlowKt.first(flowBuffer$default, c2859613);
                if (individualAccountNumberForced == coroutine_suspended) {
                    DisplayName displayName3 = AccountDisplayNames.getDisplayName((Account) individualAccountNumberForced);
                    str2 = str;
                    SlipAgreementsStore slipAgreementsStore = this.slipAgreementsStore;
                    String source = ((TransparentViewKey) INSTANCE.getExtras((HasSavedState) this)).getSource();
                    c2859613.L$0 = str2;
                    c2859613.L$1 = displayName3;
                    c2859613.label = 3;
                    c2859612 = c2859613;
                    slipAgreementsInUI$default = SlipAgreementsStore.getSlipAgreementsInUI$default(slipAgreementsStore, str2, source, null, true, c2859612, 4, null);
                    if (slipAgreementsInUI$default != coroutine_suspended) {
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                str = (String) c2859613.L$0;
                ResultKt.throwOnFailure(individualAccountNumberForced);
                DisplayName displayName32 = AccountDisplayNames.getDisplayName((Account) individualAccountNumberForced);
                str2 = str;
                SlipAgreementsStore slipAgreementsStore2 = this.slipAgreementsStore;
                String source2 = ((TransparentViewKey) INSTANCE.getExtras((HasSavedState) this)).getSource();
                c2859613.L$0 = str2;
                c2859613.L$1 = displayName32;
                c2859613.label = 3;
                c2859612 = c2859613;
                slipAgreementsInUI$default = SlipAgreementsStore.getSlipAgreementsInUI$default(slipAgreementsStore2, str2, source2, null, true, c2859612, 4, null);
                if (slipAgreementsInUI$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                displayName = displayName32;
                individualAccountNumberForced = slipAgreementsInUI$default;
                List<UiSlipAgreements.Agreement> agreements = ((UiSlipAgreements) individualAccountNumberForced).getAgreements();
                SlipAgreementsStore slipAgreementsStore3 = this.slipAgreementsStore;
                c2859612.L$0 = displayName;
                c2859612.L$1 = null;
                c2859612.label = 4;
                individualAccountNumberForced = SlipAgreementsStore.acceptAgreementsBlocking$default(slipAgreementsStore3, str2, agreements, null, c2859612, 4, null);
                if (individualAccountNumberForced != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                displayName2 = (DisplayName) c2859613.L$0;
                ResultKt.throwOnFailure(individualAccountNumberForced);
                asyncResult = (AsyncResult) individualAccountNumberForced;
                if (!(asyncResult instanceof AsyncResult.Success)) {
                    applyMutation(new C285983(displayName2, null));
                } else if (asyncResult instanceof AsyncResult.Failure) {
                    applyMutation(new C285994(null));
                } else {
                    applyMutation(new C286005(null));
                }
                return Unit.INSTANCE;
            }
            DisplayName displayName4 = (DisplayName) c2859613.L$1;
            str2 = (String) c2859613.L$0;
            ResultKt.throwOnFailure(individualAccountNumberForced);
            displayName = displayName4;
            c2859612 = c2859613;
            List<UiSlipAgreements.Agreement> agreements2 = ((UiSlipAgreements) individualAccountNumberForced).getAgreements();
            SlipAgreementsStore slipAgreementsStore32 = this.slipAgreementsStore;
            c2859612.L$0 = displayName;
            c2859612.L$1 = null;
            c2859612.label = 4;
            individualAccountNumberForced = SlipAgreementsStore.acceptAgreementsBlocking$default(slipAgreementsStore32, str2, agreements2, null, c2859612, 4, null);
            if (individualAccountNumberForced != coroutine_suspended) {
                displayName2 = displayName;
                asyncResult = (AsyncResult) individualAccountNumberForced;
                if (!(asyncResult instanceof AsyncResult.Success)) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(individualAccountNumberForced);
        accountNumber = (String) individualAccountNumberForced;
        str = accountNumber;
        Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(str)), Integer.MAX_VALUE, null, 2, null);
        c2859613.L$0 = str;
        c2859613.label = 2;
        individualAccountNumberForced = FlowKt.first(flowBuffer$default2, c2859613);
        if (individualAccountNumberForced == coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$2", m3645f = "SlipOneClickSnackBarViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$2 */
    static final class C285972 extends ContinuationImpl7 implements Function2<EmptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C285972(Continuation<? super C285972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C285972 c285972 = new C285972(continuation);
            c285972.L$0 = obj;
            return c285972;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmptyViewDuxoDataState emptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState> continuation) {
            return ((C285972) create(emptyViewDuxoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmptyViewDuxoDataState.copy$default((EmptyViewDuxoDataState) this.L$0, false, null, null, 3, null);
        }
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$3", m3645f = "SlipOneClickSnackBarViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$3 */
    static final class C285983 extends ContinuationImpl7 implements Function2<EmptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState>, Object> {
        final /* synthetic */ DisplayName $accountDisplayName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C285983(DisplayName displayName, Continuation<? super C285983> continuation) {
            super(2, continuation);
            this.$accountDisplayName = displayName;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C285983 c285983 = new C285983(this.$accountDisplayName, continuation);
            c285983.L$0 = obj;
            return c285983;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmptyViewDuxoDataState emptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState> continuation) {
            return ((C285983) create(emptyViewDuxoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmptyViewDuxoDataState.copy$default((EmptyViewDuxoDataState) this.L$0, true, this.$accountDisplayName, null, 4, null);
        }
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$4", m3645f = "SlipOneClickSnackBarViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$4 */
    static final class C285994 extends ContinuationImpl7 implements Function2<EmptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C285994(Continuation<? super C285994> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C285994 c285994 = new C285994(continuation);
            c285994.L$0 = obj;
            return c285994;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmptyViewDuxoDataState emptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState> continuation) {
            return ((C285994) create(emptyViewDuxoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EmptyViewDuxoDataState emptyViewDuxoDataState = (EmptyViewDuxoDataState) this.L$0;
            return EmptyViewDuxoDataState.copy$default(emptyViewDuxoDataState, false, null, emptyViewDuxoDataState.getException(), 2, null);
        }
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$5", m3645f = "SlipOneClickSnackBarViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$5 */
    static final class C286005 extends ContinuationImpl7 implements Function2<EmptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C286005(Continuation<? super C286005> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286005 c286005 = new C286005(continuation);
            c286005.L$0 = obj;
            return c286005;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmptyViewDuxoDataState emptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState> continuation) {
            return ((C286005) create(emptyViewDuxoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmptyViewDuxoDataState.copy$default((EmptyViewDuxoDataState) this.L$0, false, null, null, 6, null);
        }
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$6", m3645f = "SlipOneClickSnackBarViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarViewDuxo$singSlipAgreement$6 */
    static final class C286016 extends ContinuationImpl7 implements Function2<EmptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f4970$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C286016(Exception exc, Continuation<? super C286016> continuation) {
            super(2, continuation);
            this.f4970$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286016 c286016 = new C286016(this.f4970$e, continuation);
            c286016.L$0 = obj;
            return c286016;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmptyViewDuxoDataState emptyViewDuxoDataState, Continuation<? super EmptyViewDuxoDataState> continuation) {
            return ((C286016) create(emptyViewDuxoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmptyViewDuxoDataState.copy$default((EmptyViewDuxoDataState) this.L$0, false, null, this.f4970$e, 3, null);
        }
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickSnackBarViewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickSnackBarViewDuxo;", "Lcom/robinhood/android/slip/contracts/TransparentViewKey;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<SlipOneClickSnackBarViewDuxo, TransparentViewKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public TransparentViewKey getExtras(SavedStateHandle savedStateHandle) {
            return (TransparentViewKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public TransparentViewKey getExtras(SlipOneClickSnackBarViewDuxo slipOneClickSnackBarViewDuxo) {
            return (TransparentViewKey) DuxoCompanion2.DefaultImpls.getExtras(this, slipOneClickSnackBarViewDuxo);
        }
    }
}
