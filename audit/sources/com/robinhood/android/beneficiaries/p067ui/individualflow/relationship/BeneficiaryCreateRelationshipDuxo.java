package com.robinhood.android.beneficiaries.p067ui.individualflow.relationship;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.models.api.ApiValidateRelationshipRequest;
import com.robinhood.android.beneficiaries.models.api.ApiValidateRelationshipResponse;
import com.robinhood.android.beneficiaries.p067ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo;
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
import kotlin.Tuples4;
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

/* compiled from: BeneficiaryCreateRelationshipDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0014\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "beneficiariesApi", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "relationshipRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "onCreate", "", "validateRelationship", "relationship", "Result", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryCreateRelationshipDuxo extends OldBaseDuxo<BeneficiaryCreateRelationshipViewState> implements HasSavedState {
    private final BeneficiariesApi beneficiariesApi;
    private final BehaviorRelay<String> relationshipRelay;
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
    public BeneficiaryCreateRelationshipDuxo(BeneficiariesApi beneficiariesApi, SavedStateHandle savedStateHandle) {
        super(new BeneficiaryCreateRelationshipViewState(null, false, null, null, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.beneficiariesApi = beneficiariesApi;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<String> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.relationshipRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateRelationshipDuxo.onCreate$lambda$0(this.f$0, (BeneficiaryCreateRelationshipViewState) obj);
            }
        });
        Observable<R> observableSwitchMap = this.relationshipRelay.switchMap(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo.onCreate.2

            /* compiled from: BeneficiaryCreateRelationshipDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/models/api/ApiValidateRelationshipResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo$onCreate$2$1", m3645f = "BeneficiaryCreateRelationshipDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo$onCreate$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiValidateRelationshipResponse>, Object> {
                final /* synthetic */ String $relationship;
                int label;
                final /* synthetic */ BeneficiaryCreateRelationshipDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BeneficiaryCreateRelationshipDuxo beneficiaryCreateRelationshipDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = beneficiaryCreateRelationshipDuxo;
                    this.$relationship = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$relationship, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiValidateRelationshipResponse> continuation) {
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
                    Companion companion = BeneficiaryCreateRelationshipDuxo.INSTANCE;
                    String account_number = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((HasSavedState) this.this$0)).getAccount_number();
                    UUID beneficiary_id = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((HasSavedState) this.this$0)).getBeneficiary_id();
                    String str = this.$relationship;
                    Intrinsics.checkNotNull(str);
                    ApiValidateRelationshipRequest apiValidateRelationshipRequest = new ApiValidateRelationshipRequest(beneficiary_id, str);
                    this.label = 1;
                    Object objValidateRelationship = beneficiariesApi.validateRelationship(account_number, apiValidateRelationshipRequest, this);
                    return objValidateRelationship == coroutine_suspended ? coroutine_suspended : objValidateRelationship;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Result> apply(final String relationship) {
                Intrinsics.checkNotNullParameter(relationship, "relationship");
                BeneficiaryCreateRelationshipDuxo beneficiaryCreateRelationshipDuxo = BeneficiaryCreateRelationshipDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(beneficiaryCreateRelationshipDuxo, null, new AnonymousClass1(beneficiaryCreateRelationshipDuxo, relationship, null), 1, null).toObservable().map(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo.onCreate.2.2
                    @Override // io.reactivex.functions.Function
                    public final Result apply(ApiValidateRelationshipResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        GenericAlertContent<GenericAction> failure_alert = response.getFailure_alert();
                        if (failure_alert != null) {
                            return new Result.ValidationError(failure_alert);
                        }
                        String str = relationship;
                        Intrinsics.checkNotNull(str);
                        return new Result.Success(str, response.getPost_submit_agreement());
                    }
                }).startWith((Observable<R>) Result.Loading.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo.onCreate.2.3
                    @Override // io.reactivex.functions.Function
                    public final Result.Error apply(Throwable p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new Result.Error(p0);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateRelationshipDuxo.onCreate$lambda$5(this.f$0, (BeneficiaryCreateRelationshipDuxo.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateRelationshipViewState onCreate$lambda$0(BeneficiaryCreateRelationshipDuxo beneficiaryCreateRelationshipDuxo, BeneficiaryCreateRelationshipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BeneficiaryCreateRelationshipViewState.copy$default(applyMutation, ((ApiCreateBeneficiaryConfiguration) INSTANCE.getArgs((HasSavedState) beneficiaryCreateRelationshipDuxo)).getRelationship_view_model().getRelationship_rows(), false, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(BeneficiaryCreateRelationshipDuxo beneficiaryCreateRelationshipDuxo, final Result result) {
        if (Intrinsics.areEqual(result, Result.Loading.INSTANCE)) {
            beneficiaryCreateRelationshipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryCreateRelationshipDuxo.onCreate$lambda$5$lambda$1((BeneficiaryCreateRelationshipViewState) obj);
                }
            });
        } else if (result instanceof Result.Error) {
            beneficiaryCreateRelationshipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryCreateRelationshipDuxo.onCreate$lambda$5$lambda$2(result, (BeneficiaryCreateRelationshipViewState) obj);
                }
            });
        } else if (result instanceof Result.Success) {
            beneficiaryCreateRelationshipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryCreateRelationshipDuxo.onCreate$lambda$5$lambda$3(result, (BeneficiaryCreateRelationshipViewState) obj);
                }
            });
        } else {
            if (!(result instanceof Result.ValidationError)) {
                throw new NoWhenBranchMatchedException();
            }
            beneficiaryCreateRelationshipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeneficiaryCreateRelationshipDuxo.onCreate$lambda$5$lambda$4(result, (BeneficiaryCreateRelationshipViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateRelationshipViewState onCreate$lambda$5$lambda$1(BeneficiaryCreateRelationshipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BeneficiaryCreateRelationshipViewState.copy$default(applyMutation, null, true, null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateRelationshipViewState onCreate$lambda$5$lambda$2(Result result, BeneficiaryCreateRelationshipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BeneficiaryCreateRelationshipViewState.copy$default(applyMutation, null, false, null, new UiEvent(((Result.Error) result).getThrowable()), null, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateRelationshipViewState onCreate$lambda$5$lambda$3(Result result, BeneficiaryCreateRelationshipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Success success = (Result.Success) result;
        return BeneficiaryCreateRelationshipViewState.copy$default(applyMutation, null, false, new UiEvent(Tuples4.m3642to(success.getRelationship(), success.getPostSubmitAgreement())), null, null, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryCreateRelationshipViewState onCreate$lambda$5$lambda$4(Result result, BeneficiaryCreateRelationshipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BeneficiaryCreateRelationshipViewState.copy$default(applyMutation, null, false, null, null, new UiEvent(((Result.ValidationError) result).getGenericAlertContent()), 13, null);
    }

    public final void validateRelationship(String relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        this.relationshipRelay.accept(relationship);
    }

    /* compiled from: BeneficiaryCreateRelationshipDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result;", "", "<init>", "()V", "Loading", "Success", "ValidationError", "Error", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result$Error;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result$Loading;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result$Success;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result$ValidationError;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: BeneficiaryCreateRelationshipDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result$Loading;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Result {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private Result() {
        }

        /* compiled from: BeneficiaryCreateRelationshipDuxo.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result$Success;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result;", "relationship", "", "postSubmitAgreement", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;)V", "getRelationship", "()Ljava/lang/String;", "getPostSubmitAgreement", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Result {
            public static final int $stable = 8;
            private final ApiBeneficiaryAgreementViewModel postSubmitAgreement;
            private final String relationship;

            public static /* synthetic */ Success copy$default(Success success, String str, ApiBeneficiaryAgreementViewModel apiBeneficiaryAgreementViewModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.relationship;
                }
                if ((i & 2) != 0) {
                    apiBeneficiaryAgreementViewModel = success.postSubmitAgreement;
                }
                return success.copy(str, apiBeneficiaryAgreementViewModel);
            }

            /* renamed from: component1, reason: from getter */
            public final String getRelationship() {
                return this.relationship;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiBeneficiaryAgreementViewModel getPostSubmitAgreement() {
                return this.postSubmitAgreement;
            }

            public final Success copy(String relationship, ApiBeneficiaryAgreementViewModel postSubmitAgreement) {
                Intrinsics.checkNotNullParameter(relationship, "relationship");
                return new Success(relationship, postSubmitAgreement);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.relationship, success.relationship) && Intrinsics.areEqual(this.postSubmitAgreement, success.postSubmitAgreement);
            }

            public int hashCode() {
                int iHashCode = this.relationship.hashCode() * 31;
                ApiBeneficiaryAgreementViewModel apiBeneficiaryAgreementViewModel = this.postSubmitAgreement;
                return iHashCode + (apiBeneficiaryAgreementViewModel == null ? 0 : apiBeneficiaryAgreementViewModel.hashCode());
            }

            public String toString() {
                return "Success(relationship=" + this.relationship + ", postSubmitAgreement=" + this.postSubmitAgreement + ")";
            }

            public final String getRelationship() {
                return this.relationship;
            }

            public final ApiBeneficiaryAgreementViewModel getPostSubmitAgreement() {
                return this.postSubmitAgreement;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String relationship, ApiBeneficiaryAgreementViewModel apiBeneficiaryAgreementViewModel) {
                super(null);
                Intrinsics.checkNotNullParameter(relationship, "relationship");
                this.relationship = relationship;
                this.postSubmitAgreement = apiBeneficiaryAgreementViewModel;
            }
        }

        /* compiled from: BeneficiaryCreateRelationshipDuxo.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result$ValidationError;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result;", "genericAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getGenericAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: BeneficiaryCreateRelationshipDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result$Error;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Result;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* compiled from: BeneficiaryCreateRelationshipDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryCreateRelationshipDuxo, ApiCreateBeneficiaryConfiguration> {
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
        public ApiCreateBeneficiaryConfiguration getArgs(BeneficiaryCreateRelationshipDuxo beneficiaryCreateRelationshipDuxo) {
            return (ApiCreateBeneficiaryConfiguration) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryCreateRelationshipDuxo);
        }
    }
}
