package com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.ValidateContributionTypeRequest;
import com.robinhood.models.api.bonfire.ValidateContributionTypeResponse;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
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

/* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0016\u0017B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "contributionTypeRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "kotlin.jvm.PlatformType", "onCreate", "", "validateContributionType", "contributionType", "Result", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class IraContributionQuestionnaireContributionTypeDuxo extends BaseDuxo4<IraContributionQuestionnaireContributionTypeViewState> implements HasSavedState {
    private final PublishRelay<IraContributionType> contributionTypeRelay;
    private final SavedStateHandle savedStateHandle;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IraContributionQuestionnaireContributionTypeDuxo(TransfersBonfireApi transfersBonfireApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new IraContributionQuestionnaireContributionTypeViewState(null, false, null, null, 15, null), duxoBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<IraContributionType> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.contributionTypeRelay = publishRelayCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C308611(null));
        Observable<R> observableSwitchMap = this.contributionTypeRelay.switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo.onCreate.2

            /* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ValidateContributionTypeResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$onCreate$2$1", m3645f = "IraContributionQuestionnaireContributionTypeDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$onCreate$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ValidateContributionTypeResponse>, Object> {
                final /* synthetic */ IraContributionType $contributionType;
                int label;
                final /* synthetic */ IraContributionQuestionnaireContributionTypeDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IraContributionQuestionnaireContributionTypeDuxo iraContributionQuestionnaireContributionTypeDuxo, IraContributionType iraContributionType, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = iraContributionQuestionnaireContributionTypeDuxo;
                    this.$contributionType = iraContributionType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$contributionType, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ValidateContributionTypeResponse> continuation) {
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
                    TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                    IraContributionType iraContributionType = this.$contributionType;
                    Intrinsics.checkNotNull(iraContributionType);
                    ValidateContributionTypeRequest validateContributionTypeRequest = new ValidateContributionTypeRequest(iraContributionType);
                    this.label = 1;
                    Object objValidateContributionType = transfersBonfireApi.validateContributionType(validateContributionTypeRequest, this);
                    return objValidateContributionType == coroutine_suspended ? coroutine_suspended : objValidateContributionType;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Result> apply(final IraContributionType contributionType) {
                Intrinsics.checkNotNullParameter(contributionType, "contributionType");
                IraContributionQuestionnaireContributionTypeDuxo iraContributionQuestionnaireContributionTypeDuxo = IraContributionQuestionnaireContributionTypeDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(iraContributionQuestionnaireContributionTypeDuxo, null, new AnonymousClass1(iraContributionQuestionnaireContributionTypeDuxo, contributionType, null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo.onCreate.2.2
                    @Override // io.reactivex.functions.Function
                    public final Result apply(ValidateContributionTypeResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        IraContributionType iraContributionType = contributionType;
                        Intrinsics.checkNotNull(iraContributionType);
                        AlertAction<GenericAction> alert_action = response.getAlert_action();
                        return new Result.Success(iraContributionType, alert_action != null ? alert_action.getAlert() : null);
                    }
                }).toObservable().startWith((Observable<R>) Result.Loading.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo.onCreate.2.3
                    @Override // io.reactivex.functions.Function
                    public final Result.Error apply(Throwable p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new Result.Error(p0);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireContributionTypeDuxo.onCreate$lambda$0(this.f$0, (IraContributionQuestionnaireContributionTypeDuxo.Result) obj);
            }
        });
    }

    /* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$onCreate$1", m3645f = "IraContributionQuestionnaireContributionTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeDuxo$onCreate$1 */
    static final class C308611 extends ContinuationImpl7 implements Function2<IraContributionQuestionnaireContributionTypeViewState, Continuation<? super IraContributionQuestionnaireContributionTypeViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308611(Continuation<? super C308611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308611 c308611 = IraContributionQuestionnaireContributionTypeDuxo.this.new C308611(continuation);
            c308611.L$0 = obj;
            return c308611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IraContributionQuestionnaireContributionTypeViewState iraContributionQuestionnaireContributionTypeViewState, Continuation<? super IraContributionQuestionnaireContributionTypeViewState> continuation) {
            return ((C308611) create(iraContributionQuestionnaireContributionTypeViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IraContributionQuestionnaireContributionTypeViewState.copy$default((IraContributionQuestionnaireContributionTypeViewState) this.L$0, ((ApiIraContributionQuestionnaire.ContributionTypeViewModel) IraContributionQuestionnaireContributionTypeDuxo.INSTANCE.getArgs((HasSavedState) IraContributionQuestionnaireContributionTypeDuxo.this)).getRows(), false, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(IraContributionQuestionnaireContributionTypeDuxo iraContributionQuestionnaireContributionTypeDuxo, Result result) {
        if (Intrinsics.areEqual(result, Result.Loading.INSTANCE)) {
            iraContributionQuestionnaireContributionTypeDuxo.applyMutation(new IraContributionQuestionnaireContributionTypeDuxo2(null));
        } else if (result instanceof Result.Success) {
            iraContributionQuestionnaireContributionTypeDuxo.applyMutation(new IraContributionQuestionnaireContributionTypeDuxo3(result, null));
        } else {
            if (!(result instanceof Result.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            iraContributionQuestionnaireContributionTypeDuxo.applyMutation(new IraContributionQuestionnaireContributionTypeDuxo4(result, null));
        }
        return Unit.INSTANCE;
    }

    public final void validateContributionType(IraContributionType contributionType) {
        Intrinsics.checkNotNullParameter(contributionType, "contributionType");
        this.contributionTypeRelay.accept(contributionType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result$Error;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result$Loading;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result$Success;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class Result {
        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result$Loading;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Result {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private Result() {
        }

        /* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result$Success;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result;", "contributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "alertAction", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/api/bonfire/IraContributionType;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "getAlertAction", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Result {
            public static final int $stable = 8;
            private final GenericAlertContent<GenericAction> alertAction;
            private final IraContributionType contributionType;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, IraContributionType iraContributionType, GenericAlertContent genericAlertContent, int i, Object obj) {
                if ((i & 1) != 0) {
                    iraContributionType = success.contributionType;
                }
                if ((i & 2) != 0) {
                    genericAlertContent = success.alertAction;
                }
                return success.copy(iraContributionType, genericAlertContent);
            }

            /* renamed from: component1, reason: from getter */
            public final IraContributionType getContributionType() {
                return this.contributionType;
            }

            public final GenericAlertContent<GenericAction> component2() {
                return this.alertAction;
            }

            public final Success copy(IraContributionType contributionType, GenericAlertContent<? extends GenericAction> alertAction) {
                Intrinsics.checkNotNullParameter(contributionType, "contributionType");
                return new Success(contributionType, alertAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return this.contributionType == success.contributionType && Intrinsics.areEqual(this.alertAction, success.alertAction);
            }

            public int hashCode() {
                int iHashCode = this.contributionType.hashCode() * 31;
                GenericAlertContent<GenericAction> genericAlertContent = this.alertAction;
                return iHashCode + (genericAlertContent == null ? 0 : genericAlertContent.hashCode());
            }

            public String toString() {
                return "Success(contributionType=" + this.contributionType + ", alertAction=" + this.alertAction + ")";
            }

            public /* synthetic */ Success(IraContributionType iraContributionType, GenericAlertContent genericAlertContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(iraContributionType, (i & 2) != 0 ? null : genericAlertContent);
            }

            public final IraContributionType getContributionType() {
                return this.contributionType;
            }

            public final GenericAlertContent<GenericAction> getAlertAction() {
                return this.alertAction;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Success(IraContributionType contributionType, GenericAlertContent<? extends GenericAction> genericAlertContent) {
                super(null);
                Intrinsics.checkNotNullParameter(contributionType, "contributionType");
                this.contributionType = contributionType;
                this.alertAction = genericAlertContent;
            }
        }

        /* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result$Error;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Result;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* compiled from: IraContributionQuestionnaireContributionTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo;", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$ContributionTypeViewModel;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IraContributionQuestionnaireContributionTypeDuxo, ApiIraContributionQuestionnaire.ContributionTypeViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ApiIraContributionQuestionnaire.ContributionTypeViewModel getArgs(SavedStateHandle savedStateHandle) {
            return (ApiIraContributionQuestionnaire.ContributionTypeViewModel) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ApiIraContributionQuestionnaire.ContributionTypeViewModel getArgs(IraContributionQuestionnaireContributionTypeDuxo iraContributionQuestionnaireContributionTypeDuxo) {
            return (ApiIraContributionQuestionnaire.ContributionTypeViewModel) DuxoCompanion.DefaultImpls.getArgs(this, iraContributionQuestionnaireContributionTypeDuxo);
        }
    }
}
