package com.robinhood.android.beneficiaries.p067ui.individualflow.dob;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.models.api.ApiValidateDobRequest;
import com.robinhood.android.beneficiaries.models.api.ApiValidateDobResponse;
import com.robinhood.android.beneficiaries.p067ui.individualflow.dob.BeneficiaryCreateDobDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
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
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.LocalDate;

/* compiled from: BeneficiaryCreateDobDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001a\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "beneficiariesApi", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "j$/time/LocalDate", "dob", "validateDob", "(Lj$/time/LocalDate;)V", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "dobRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Companion", "Result", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryCreateDobDuxo extends OldBaseDuxo<BeneficiaryCreateDobViewState> implements HasSavedState {
    private final BeneficiariesApi beneficiariesApi;
    private final BehaviorRelay<LocalDate> dobRelay;
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
    public BeneficiaryCreateDobDuxo(BeneficiariesApi beneficiariesApi, SavedStateHandle savedStateHandle) {
        super(new BeneficiaryCreateDobViewState(false, null, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.beneficiariesApi = beneficiariesApi;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<LocalDate> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.dobRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable<R> observableSwitchMap = this.dobRelay.switchMap(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo.onCreate.1

            /* compiled from: BeneficiaryCreateDobDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/models/api/ApiValidateDobResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo$onCreate$1$1", m3645f = "BeneficiaryCreateDobDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo$onCreate$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiValidateDobResponse>, Object> {
                final /* synthetic */ LocalDate $dob;
                int label;
                final /* synthetic */ BeneficiaryCreateDobDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BeneficiaryCreateDobDuxo beneficiaryCreateDobDuxo, LocalDate localDate, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = beneficiaryCreateDobDuxo;
                    this.$dob = localDate;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$dob, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiValidateDobResponse> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    BeneficiariesApi beneficiariesApi = this.this$0.beneficiariesApi;
                    Companion companion = BeneficiaryCreateDobDuxo.INSTANCE;
                    String account_number = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((HasSavedState) this.this$0)).getAccount_number();
                    UUID beneficiary_id = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((HasSavedState) this.this$0)).getBeneficiary_id();
                    LocalDate localDate = this.$dob;
                    Intrinsics.checkNotNull(localDate);
                    ApiValidateDobRequest apiValidateDobRequest = new ApiValidateDobRequest(beneficiary_id, localDate);
                    this.label = 1;
                    Object objValidateDob = beneficiariesApi.validateDob(account_number, apiValidateDobRequest, this);
                    return objValidateDob == coroutine_suspended ? coroutine_suspended : objValidateDob;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Result> apply(final LocalDate dob) {
                Intrinsics.checkNotNullParameter(dob, "dob");
                BeneficiaryCreateDobDuxo beneficiaryCreateDobDuxo = BeneficiaryCreateDobDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(beneficiaryCreateDobDuxo, null, new AnonymousClass1(beneficiaryCreateDobDuxo, dob, null), 1, null).toObservable().map(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo.onCreate.1.2
                    @Override // io.reactivex.functions.Function
                    public final Result apply(ApiValidateDobResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        GenericAlertContent<GenericAction> failure_alert = response.getFailure_alert();
                        if (failure_alert != null) {
                            return new Result.ValidationError(failure_alert);
                        }
                        LocalDate localDate = dob;
                        Intrinsics.checkNotNull(localDate);
                        return new Result.Success(localDate);
                    }
                }).startWith((Observable<R>) Result.Loading.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo.onCreate.1.3
                    @Override // io.reactivex.functions.Function
                    public final Result.Error apply(Throwable p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new Result.Error(p0);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateDobDuxo.onCreate$lambda$4(this.f$0, (BeneficiaryCreateDobDuxo.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(BeneficiaryCreateDobDuxo beneficiaryCreateDobDuxo, final Result result) {
        if (Intrinsics.areEqual(result, Result.Loading.INSTANCE)) {
            beneficiaryCreateDobDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryCreateDobDuxo.onCreate$lambda$4$lambda$0((BeneficiaryCreateDobViewState) obj);
                }
            });
        } else if (result instanceof Result.Error) {
            beneficiaryCreateDobDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryCreateDobDuxo.onCreate$lambda$4$lambda$1(result, (BeneficiaryCreateDobViewState) obj);
                }
            });
        } else if (result instanceof Result.Success) {
            beneficiaryCreateDobDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryCreateDobDuxo.onCreate$lambda$4$lambda$2(result, (BeneficiaryCreateDobViewState) obj);
                }
            });
        } else {
            if (!(result instanceof Result.ValidationError)) {
                throw new NoWhenBranchMatchedException();
            }
            beneficiaryCreateDobDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryCreateDobDuxo.onCreate$lambda$4$lambda$3(result, (BeneficiaryCreateDobViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateDobViewState onCreate$lambda$4$lambda$0(BeneficiaryCreateDobViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BeneficiaryCreateDobViewState.copy$default(applyMutation, true, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateDobViewState onCreate$lambda$4$lambda$1(Result result, BeneficiaryCreateDobViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BeneficiaryCreateDobViewState.copy$default(applyMutation, false, null, new UiEvent(((Result.Error) result).getThrowable()), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateDobViewState onCreate$lambda$4$lambda$2(Result result, BeneficiaryCreateDobViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BeneficiaryCreateDobViewState.copy$default(applyMutation, false, new UiEvent(((Result.Success) result).getDob()), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateDobViewState onCreate$lambda$4$lambda$3(Result result, BeneficiaryCreateDobViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BeneficiaryCreateDobViewState.copy$default(applyMutation, false, null, null, new UiEvent(((Result.ValidationError) result).getGenericAlertContent()), 6, null);
    }

    public final void validateDob(LocalDate dob) {
        Intrinsics.checkNotNullParameter(dob, "dob");
        this.dobRelay.accept(dob);
    }

    /* compiled from: BeneficiaryCreateDobDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result;", "", "<init>", "()V", "Loading", "Success", "ValidationError", "Error", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$Error;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$Loading;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$Success;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$ValidationError;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: BeneficiaryCreateDobDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$Loading;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading extends Result {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -765743848;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(null);
            }
        }

        private Result() {
        }

        /* compiled from: BeneficiaryCreateDobDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$Success;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result;", "j$/time/LocalDate", "dob", "<init>", "(Lj$/time/LocalDate;)V", "component1", "()Lj$/time/LocalDate;", "copy", "(Lj$/time/LocalDate;)Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getDob", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Result {
            public static final int $stable = 8;
            private final LocalDate dob;

            public static /* synthetic */ Success copy$default(Success success, LocalDate localDate, int i, Object obj) {
                if ((i & 1) != 0) {
                    localDate = success.dob;
                }
                return success.copy(localDate);
            }

            /* renamed from: component1, reason: from getter */
            public final LocalDate getDob() {
                return this.dob;
            }

            public final Success copy(LocalDate dob) {
                Intrinsics.checkNotNullParameter(dob, "dob");
                return new Success(dob);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.dob, ((Success) other).dob);
            }

            public int hashCode() {
                return this.dob.hashCode();
            }

            public String toString() {
                return "Success(dob=" + this.dob + ")";
            }

            public final LocalDate getDob() {
                return this.dob;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(LocalDate dob) {
                super(null);
                Intrinsics.checkNotNullParameter(dob, "dob");
                this.dob = dob;
            }
        }

        /* compiled from: BeneficiaryCreateDobDuxo.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$ValidationError;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result;", "genericAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getGenericAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ValidationError extends Result {
            public static final int $stable = 8;
            private final GenericAlertContent<GenericAction> genericAlertContent;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ValidationError copy$default(ValidationError validationError, GenericAlertContent genericAlertContent, int i, Object obj) {
                if ((i & 1) != 0) {
                    genericAlertContent = validationError.genericAlertContent;
                }
                return validationError.copy(genericAlertContent);
            }

            public final GenericAlertContent<GenericAction> component1() {
                return this.genericAlertContent;
            }

            public final ValidationError copy(GenericAlertContent<? extends GenericAction> genericAlertContent) {
                Intrinsics.checkNotNullParameter(genericAlertContent, "genericAlertContent");
                return new ValidationError(genericAlertContent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ValidationError) && Intrinsics.areEqual(this.genericAlertContent, ((ValidationError) other).genericAlertContent);
            }

            public int hashCode() {
                return this.genericAlertContent.hashCode();
            }

            public String toString() {
                return "ValidationError(genericAlertContent=" + this.genericAlertContent + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ValidationError(GenericAlertContent<? extends GenericAction> genericAlertContent) {
                super(null);
                Intrinsics.checkNotNullParameter(genericAlertContent, "genericAlertContent");
                this.genericAlertContent = genericAlertContent;
            }

            public final GenericAlertContent<GenericAction> getGenericAlertContent() {
                return this.genericAlertContent;
            }
        }

        /* compiled from: BeneficiaryCreateDobDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result$Error;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Result;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error extends Result {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }

    /* compiled from: BeneficiaryCreateDobDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryCreateDobDuxo, ApiCreateBeneficiaryConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ApiCreateBeneficiaryConfiguration getArgs(SavedStateHandle savedStateHandle) {
            return (ApiCreateBeneficiaryConfiguration) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ApiCreateBeneficiaryConfiguration getArgs(BeneficiaryCreateDobDuxo beneficiaryCreateDobDuxo) {
            return (ApiCreateBeneficiaryConfiguration) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryCreateDobDuxo);
        }
    }
}
