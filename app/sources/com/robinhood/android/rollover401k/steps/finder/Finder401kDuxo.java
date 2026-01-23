package com.robinhood.android.rollover401k.steps.finder;

import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.robinhood.android.dagger.ApplicationPackageInfoModule2;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResult;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import com.robinhood.android.models.retirement.p194db.UnsupportedInstitutionViewModel;
import com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsFragment;
import com.robinhood.android.rollover401k.steps.finder.Finder401kState2;
import com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenResponse;
import com.robinhood.utils.logging.TimberLogger;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Finder401kDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u0006\u0010\u0018\u001a\u00020\u0013J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J%\u0010\u001b\u001a\u00020\u00132\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001d2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsDataState;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsEvent;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kScreenCallbacks;", "acatsPlaidStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "rolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "packageName", "", "stateProvider", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;Ljava/lang/String;Lcom/robinhood/android/rollover401k/steps/finder/Finder401kStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "onInstitutionSelected", "plaidInstitutionId", "name", "onNoResultsCtaTapped", "onExit", "fetchLinkToken", "institutionName", "providePlaidHandler", "plaidLinkTokenResult", "Lkotlin/Result;", "(Ljava/lang/Object;Ljava/lang/String;)V", "onLinkResult", "result", "Lcom/plaid/link/result/LinkResult;", "onPlaidLinkSuccess", "successResult", "Lcom/plaid/link/result/LinkSuccess;", "onUnsupportedInstitution", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class Finder401kDuxo extends BaseDuxo3<Finder401kResultsDataState, Finder401kState3, Finder401kState2> implements Finder401kScreen7 {
    public static final int $stable = 8;
    private final AcatsPlaidStore acatsPlaidStore;
    private final String packageName;
    private final Retirement401kRolloverStore rolloverStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Finder401kDuxo(AcatsPlaidStore acatsPlaidStore, Retirement401kRolloverStore rolloverStore, @ApplicationPackageInfoModule2 String packageName, Finder401kState4 stateProvider, DuxoBundle duxoBundle) {
        super(new Finder401kResultsDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
        Intrinsics.checkNotNullParameter(rolloverStore, "rolloverStore");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsPlaidStore = acatsPlaidStore;
        this.rolloverStore = rolloverStore;
        this.packageName = packageName;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C277511(null));
    }

    /* compiled from: Finder401kDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$onCreate$1", m3645f = "Finder401kDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$onCreate$1 */
    static final class C277511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C277511(Continuation<? super C277511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Finder401kDuxo.this.new C277511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(Finder401kDuxo.this.rolloverStore.streamRetirement401kFinderResults());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(Finder401kDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: Finder401kDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewModel", "Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$onCreate$1$1", m3645f = "Finder401kDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Retirement401kFinderResultsViewmodel, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ Finder401kDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Finder401kDuxo finder401kDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = finder401kDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(retirement401kFinderResultsViewmodel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: Finder401kDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$onCreate$1$1$1", m3645f = "Finder401kDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505201 extends ContinuationImpl7 implements Function2<Finder401kResultsDataState, Continuation<? super Finder401kResultsDataState>, Object> {
                final /* synthetic */ Retirement401kFinderResultsViewmodel $viewModel;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505201(Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, Continuation<? super C505201> continuation) {
                    super(2, continuation);
                    this.$viewModel = retirement401kFinderResultsViewmodel;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505201 c505201 = new C505201(this.$viewModel, continuation);
                    c505201.L$0 = obj;
                    return c505201;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Finder401kResultsDataState finder401kResultsDataState, Continuation<? super Finder401kResultsDataState> continuation) {
                    return ((C505201) create(finder401kResultsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Finder401kResultsDataState) this.L$0).copy(this.$viewModel);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505201((Retirement401kFinderResultsViewmodel) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.rollover401k.steps.finder.Finder401kScreen7
    public void onInstitutionSelected(String plaidInstitutionId, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (plaidInstitutionId == null || plaidInstitutionId.length() == 0) {
            onUnsupportedInstitution(name);
        } else {
            fetchLinkToken(plaidInstitutionId, name);
        }
    }

    @Override // com.robinhood.android.rollover401k.steps.finder.Finder401kScreen7
    public void onNoResultsCtaTapped() {
        onExit();
    }

    public final void onExit() {
        submit(Finder401kState2.Exit.INSTANCE);
    }

    /* compiled from: Finder401kDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$fetchLinkToken$1", m3645f = "Finder401kDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$fetchLinkToken$1 */
    static final class C277501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $institutionName;
        final /* synthetic */ String $plaidInstitutionId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C277501(String str, String str2, Continuation<? super C277501> continuation) {
            super(2, continuation);
            this.$institutionName = str;
            this.$plaidInstitutionId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C277501 c277501 = Finder401kDuxo.this.new C277501(this.$institutionName, this.$plaidInstitutionId, continuation);
            c277501.L$0 = obj;
            return c277501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C277501 c277501;
            Throwable th;
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Finder401kDuxo finder401kDuxo = Finder401kDuxo.this;
                String str = this.$plaidInstitutionId;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AcatsPlaidStore acatsPlaidStore = finder401kDuxo.acatsPlaidStore;
                    String str2 = finder401kDuxo.packageName;
                    this.label = 1;
                    c277501 = this;
                    try {
                        obj = acatsPlaidStore.getPlaidLinkToken("", "", str, str2, c277501);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        if (!Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c277501 = this;
                    th = th;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    if (!Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c277501 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c277501 = this;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    if (!Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    }
                    return Unit.INSTANCE;
                }
            }
            objM28550constructorimpl = Result.m28550constructorimpl(((ApiAcatsInPlaidTokenResponse) obj).getPlaid_link_token());
            if (!Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                Finder401kDuxo.this.providePlaidHandler(objM28550constructorimpl, c277501.$institutionName);
            } else {
                TimberLogger.INSTANCE.mo1684w("failed to fetch link token for institution_id: " + c277501.$plaidInstitutionId, new Object[0]);
                Finder401kDuxo.this.onUnsupportedInstitution(c277501.$institutionName);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fetchLinkToken(String plaidInstitutionId, String institutionName) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C277501(institutionName, plaidInstitutionId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void providePlaidHandler(Object plaidLinkTokenResult, String institutionName) {
        if (Result.m28553exceptionOrNullimpl(plaidLinkTokenResult) != null) {
            plaidLinkTokenResult = "";
        }
        String str = (String) plaidLinkTokenResult;
        if (str == null || str.length() == 0) {
            TimberLogger.INSTANCE.mo1684w("failed to extract link token from result", new Object[0]);
            onUnsupportedInstitution(institutionName);
        } else {
            submit(new Finder401kState2.OpenPlaidForInstitution(str));
        }
    }

    public final void onLinkResult(LinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof LinkSuccess) {
            onPlaidLinkSuccess((LinkSuccess) result);
        }
    }

    private final void onPlaidLinkSuccess(LinkSuccess successResult) {
        LinkAccount linkAccount = (LinkAccount) CollectionsKt.firstOrNull((List) successResult.getMetadata().getAccounts());
        String id = linkAccount != null ? linkAccount.getId() : null;
        if (id == null) {
            id = "";
        }
        submit(new Finder401kState2.NavigateByFragmentKey(new FoundAccountDetailsFragment.FoundAccountDetailsFragmentKey(successResult.getPublicToken(), id)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUnsupportedInstitution(final String institutionName) {
        withDataState(new Function1() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Finder401kDuxo.onUnsupportedInstitution$lambda$2(this.f$0, institutionName, (Finder401kResultsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUnsupportedInstitution$lambda$2(Finder401kDuxo finder401kDuxo, String str, Finder401kResultsDataState it) {
        List<Retirement401kFinderResult> finderResults;
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        Retirement401kFinderResultsViewmodel finderViewModel = it.getFinderViewModel();
        UnsupportedInstitutionViewModel unsupportedInstitutionViewModel = null;
        if (finderViewModel != null && (finderResults = finderViewModel.getFinderResults()) != null) {
            Iterator<T> it2 = finderResults.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.areEqual(((Retirement401kFinderResult) next).getName(), str)) {
                    break;
                }
            }
            Retirement401kFinderResult retirement401kFinderResult = (Retirement401kFinderResult) next;
            if (retirement401kFinderResult != null) {
                unsupportedInstitutionViewModel = retirement401kFinderResult.getUnsupportedInstitutionViewModel();
            }
        }
        if (unsupportedInstitutionViewModel != null) {
            finder401kDuxo.submit(new Finder401kState2.NavigateByFragmentKey(new UnsupportedInstitutionFragment.UnsupportedInstitutionFragmentKey(unsupportedInstitutionViewModel)));
        }
        return Unit.INSTANCE;
    }
}
