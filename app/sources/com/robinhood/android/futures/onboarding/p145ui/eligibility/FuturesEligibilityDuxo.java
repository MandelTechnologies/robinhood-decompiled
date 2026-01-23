package com.robinhood.android.futures.onboarding.p145ui.eligibility;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.futures.onboarding.p145ui.eligibility.FuturesEligibilityDuxo4;
import com.robinhood.android.futures.onboarding.p145ui.eligibility.FuturesEligibilityFragment;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.CheckAccountFuturesEligibilityRequestDto;
import com.robinhood.ceres.p284v1.CheckAccountFuturesEligibilityResponseDto;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.mib.MiBFuturesState;
import com.robinhood.utils.logging.TimberLogger;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: FuturesEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0018B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDataState;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityViewState;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "loadEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesEligibilityDuxo extends BaseDuxo3<FuturesEligibilityDataState, FuturesEligibilityViewState, FuturesEligibilityDuxo4> implements HasSavedState {
    private final Ceres ceres;
    private final FuturesAccountStore futuresAccountStore;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountFuturesEligibilityStatusDto.values().length];
            try {
                iArr[AccountFuturesEligibilityStatusDto.ELIGIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ALREADY_HAS_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.IN_MANUAL_REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.INELIGIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityDuxo", m3645f = "FuturesEligibilityDuxo.kt", m3646l = {48, 57, 98}, m3647m = "loadEligibility")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityDuxo$loadEligibility$1 */
    static final class C173821 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C173821(Continuation<? super C173821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesEligibilityDuxo.this.loadEligibility(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FuturesEligibilityDuxo(Ceres ceres, FuturesAccountStore futuresAccountStore, LeveredMarginSettingsStore marginSettingsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Result resultM28549boximpl;
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        AccountFuturesEligibilityStatusDto status = ((FuturesEligibilityFragment.Args) INSTANCE.getArgs(savedStateHandle)).getStatus();
        if (status != null) {
            Result.Companion companion = Result.INSTANCE;
            resultM28549boximpl = Result.m28549boximpl(Result.m28550constructorimpl(new CheckAccountFuturesEligibilityResponseDto(status)));
        } else {
            resultM28549boximpl = null;
        }
        super(new FuturesEligibilityDataState(resultM28549boximpl, null, 2, null), FuturesEligibilityDuxo5.INSTANCE, duxoBundle);
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.marginSettingsStore = marginSettingsStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityDuxo$onCreate$1", m3645f = "FuturesEligibilityDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityDuxo$onCreate$1 */
    static final class C173851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C173851(Continuation<? super C173851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesEligibilityDuxo.this.new C173851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C173851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesEligibilityDuxo futuresEligibilityDuxo = FuturesEligibilityDuxo.this;
                this.label = 1;
                if (futuresEligibilityDuxo.loadEligibility(this) == coroutine_suspended) {
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
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C173851(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010e, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadEligibility(Continuation<? super Unit> continuation) {
        C173821 c173821;
        Object objM28550constructorimpl;
        Object objM28550constructorimpl2;
        ?? r2;
        int i;
        Account futuresAllowedRhsAccount;
        if (continuation instanceof C173821) {
            c173821 = (C173821) continuation;
            int i2 = c173821.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c173821.label = i2 - Integer.MIN_VALUE;
            } else {
                c173821 = new C173821(continuation);
            }
        }
        Object objFirstOrNull = c173821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c173821.label;
        try {
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            r2 = i3;
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            FuturesAccountStore futuresAccountStore = this.futuresAccountStore;
            c173821.label = 1;
            objFirstOrNull = futuresAccountStore.forceGetMibFuturesState(c173821);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
                objM28550constructorimpl2 = Result.m28550constructorimpl((Boolean) objFirstOrNull);
                if (Intrinsics.areEqual(Result.m28555isFailureimpl(objM28550constructorimpl2) ? null : objM28550constructorimpl2, boxing.boxBoolean(true))) {
                    submit(FuturesEligibilityDuxo4.UserIsIneligibleButHasOptionsOrMargin.INSTANCE);
                }
                return Unit.INSTANCE;
            }
            ?? r22 = (String) c173821.L$1;
            futuresAllowedRhsAccount = (Account) c173821.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            i3 = r22;
            objM28550constructorimpl = Result.m28550constructorimpl((CheckAccountFuturesEligibilityResponseDto) objFirstOrNull);
            r2 = i3;
            applyMutation(new C173832(objM28550constructorimpl, r2, null));
            CheckAccountFuturesEligibilityResponseDto checkAccountFuturesEligibilityResponseDto = (CheckAccountFuturesEligibilityResponseDto) (!Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
            AccountFuturesEligibilityStatusDto status = checkAccountFuturesEligibilityResponseDto == null ? checkAccountFuturesEligibilityResponseDto.getStatus() : null;
            i = status != null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i != -1) {
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                TimberLogger.INSTANCE.mo1682e(thM28553exceptionOrNullimpl, "Fetch futures eligibility failed", new Object[0]);
                if (thM28553exceptionOrNullimpl != null) {
                    submit(new FuturesEligibilityDuxo4.NetworkError(thM28553exceptionOrNullimpl));
                }
            } else if (i == 1) {
                submit(FuturesEligibilityDuxo4.UserBecameEligibleEvent.INSTANCE);
            } else if (i == 2) {
                submit(FuturesEligibilityDuxo4.UserHasAccountEvent.INSTANCE);
            } else if (i == 3) {
                submit(FuturesEligibilityDuxo4.UsersApplicationPendingReviewEvent.INSTANCE);
            } else {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (futuresAllowedRhsAccount.getOptionLevel() != null) {
                    submit(FuturesEligibilityDuxo4.UserIsIneligibleButHasOptionsOrMargin.INSTANCE);
                } else {
                    ObservableSource map = this.marginSettingsStore.streamMarginSettingsIndividual().map(new Function() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityDuxo$loadEligibility$marginInvestingEnabled$1$1
                        @Override // io.reactivex.functions.Function
                        public final Boolean apply(MarginSettings it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Boolean.valueOf(it.isMarginInvestingEnabled());
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
                    c173821.L$0 = null;
                    c173821.L$1 = null;
                    c173821.label = 3;
                    objFirstOrNull = FlowKt.firstOrNull(flowBuffer$default, c173821);
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objFirstOrNull);
        futuresAllowedRhsAccount = ((MiBFuturesState) objFirstOrNull).getFuturesAllowedRhsAccount();
        ?? accountNumber = futuresAllowedRhsAccount != null ? futuresAllowedRhsAccount.getAccountNumber() : 0;
        if (accountNumber == 0) {
            submit(FuturesEligibilityDuxo4.UserHasNoBrokerageAccountEvent.INSTANCE);
            return Unit.INSTANCE;
        }
        Result.Companion companion3 = Result.INSTANCE;
        Ceres ceres = this.ceres;
        CheckAccountFuturesEligibilityRequestDto checkAccountFuturesEligibilityRequestDto = new CheckAccountFuturesEligibilityRequestDto((String) accountNumber);
        c173821.L$0 = futuresAllowedRhsAccount;
        c173821.L$1 = accountNumber;
        c173821.label = 2;
        objFirstOrNull = ceres.CheckAccountFuturesEligibility(checkAccountFuturesEligibilityRequestDto, c173821);
        i3 = accountNumber;
        if (objFirstOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        objM28550constructorimpl = Result.m28550constructorimpl((CheckAccountFuturesEligibilityResponseDto) objFirstOrNull);
        r2 = i3;
        applyMutation(new C173832(objM28550constructorimpl, r2, null));
        CheckAccountFuturesEligibilityResponseDto checkAccountFuturesEligibilityResponseDto2 = (CheckAccountFuturesEligibilityResponseDto) (!Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
        if (checkAccountFuturesEligibilityResponseDto2 == null) {
        }
        if (status != null) {
        }
        if (i != -1) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityDuxo$loadEligibility$2", m3645f = "FuturesEligibilityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityDuxo$loadEligibility$2 */
    static final class C173832 extends ContinuationImpl7 implements Function2<FuturesEligibilityDataState, Continuation<? super FuturesEligibilityDataState>, Object> {
        final /* synthetic */ Object $eligibility;
        final /* synthetic */ String $rhsAccountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173832(Object obj, String str, Continuation<? super C173832> continuation) {
            super(2, continuation);
            this.$eligibility = obj;
            this.$rhsAccountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173832 c173832 = new C173832(this.$eligibility, this.$rhsAccountNumber, continuation);
            c173832.L$0 = obj;
            return c173832;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesEligibilityDataState futuresEligibilityDataState, Continuation<? super FuturesEligibilityDataState> continuation) {
            return ((C173832) create(futuresEligibilityDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((FuturesEligibilityDataState) this.L$0).copy(Result.m28549boximpl(this.$eligibility), this.$rhsAccountNumber);
        }
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Args;", "<init>", "()V", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FuturesEligibilityDuxo, FuturesEligibilityFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesEligibilityFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesEligibilityFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesEligibilityFragment.Args getArgs(FuturesEligibilityDuxo futuresEligibilityDuxo) {
            return (FuturesEligibilityFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, futuresEligibilityDuxo);
        }
    }
}
