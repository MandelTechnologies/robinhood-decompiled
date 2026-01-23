package com.robinhood.feature.sweep.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.sweep.contracts.SweepOnboardingIntentKey;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.feature.sweep.onboarding.SweepOnboardingViewState;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SweepOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SweepOnboardingDuxo extends OldBaseDuxo<SweepOnboardingViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;
    private final SweepsTimelineSummaryStore sweepsTimelineSummaryStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final SweepOnboardingViewState onCreate$lambda$1$lambda$0(SweepOnboardingViewState sweepOnboardingViewState, SweepOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return sweepOnboardingViewState;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SweepOnboardingDuxo(AccountProvider accountProvider, StaticContentStore staticContentStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
        super(SweepOnboardingViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.staticContentStore = staticContentStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.sweepsTimelineSummaryStore = sweepsTimelineSummaryStore;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C331851(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingDuxo.onCreate$lambda$1(this.f$0, (SweepOnboardingViewState) obj);
            }
        }, new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingDuxo.onCreate$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: SweepOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.feature.sweep.onboarding.SweepOnboardingDuxo$onCreate$1", m3645f = "SweepOnboardingDuxo.kt", m3646l = {98, 54, 55, 58, 61, 101, 69, 77, 78}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.feature.sweep.onboarding.SweepOnboardingDuxo$onCreate$1 */
    static final class C331851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SweepOnboardingViewState>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;

        C331851(Continuation<? super C331851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C331851 c331851 = SweepOnboardingDuxo.this.new C331851(continuation);
            c331851.L$0 = obj;
            return c331851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SweepOnboardingViewState> continuation) {
            return ((C331851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00e2, code lost:
        
            if (r1 == r6) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01eb, code lost:
        
            if (r1 == r6) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0222, code lost:
        
            if (r4 != r6) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0188 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            String accountNumber;
            Object objAwait;
            Object sweepEnrollment;
            Deferred deferred;
            String str;
            Object sweepFlow;
            String str2;
            boolean z;
            Deferred deferred2;
            String str3;
            ApiSweepFlow apiSweepFlow;
            Iterator it;
            SweepOnboardingDuxo sweepOnboardingDuxo;
            boolean z2;
            Object regionGateState$default;
            ApiSweepFlow apiSweepFlow2;
            String str4;
            Deferred deferred3;
            boolean zBooleanValue;
            Object objAwait2;
            Deferred deferred4;
            String str5;
            Object objAwaitFirstOrNull;
            SweepsTimelineSummary sweepsTimelineSummary;
            Object objAwait3;
            BigDecimal goldInterestRate;
            Object objAwait4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    accountNumber = ((SweepOnboardingIntentKey) SweepOnboardingDuxo.INSTANCE.getExtras((HasSavedState) SweepOnboardingDuxo.this)).getAccountNumber();
                    if (accountNumber == null) {
                        Single<Optional<String>> individualAccountNumber = SweepOnboardingDuxo.this.accountProvider.getIndividualAccountNumber();
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        objAwait = RxAwait3.await(individualAccountNumber, this);
                        break;
                    } else {
                        CoroutineScope coroutineScope2 = coroutineScope;
                        if (accountNumber == null) {
                            SweepsInterestStore.refresh$default(SweepOnboardingDuxo.this.sweepsInterestStore, accountNumber, false, 2, null);
                            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SweepOnboardingDuxo2(SweepOnboardingDuxo.this, accountNumber, null), 3, null);
                            SweepEnrollmentStore sweepEnrollmentStore = SweepOnboardingDuxo.this.sweepEnrollmentStore;
                            this.L$0 = accountNumber;
                            this.L$1 = deferredAsync$default;
                            this.label = 2;
                            sweepEnrollment = sweepEnrollmentStore.getSweepEnrollment(accountNumber, this);
                            if (sweepEnrollment != coroutine_suspended) {
                                String str6 = accountNumber;
                                deferred = deferredAsync$default;
                                str = str6;
                                boolean sweepEnrolled = ((ApiSweepEnrollment) sweepEnrollment).getSweepEnrolled();
                                SweepEnrollmentStore sweepEnrollmentStore2 = SweepOnboardingDuxo.this.sweepEnrollmentStore;
                                this.L$0 = str;
                                this.L$1 = deferred;
                                this.Z$0 = sweepEnrolled;
                                this.label = 3;
                                sweepFlow = sweepEnrollmentStore2.getSweepFlow(str, this);
                                if (sweepFlow != coroutine_suspended) {
                                    str2 = str;
                                    z = sweepEnrolled;
                                    ApiSweepFlow apiSweepFlow3 = (ApiSweepFlow) sweepFlow;
                                    List<ApiGoldSweepAgreement> agreements = apiSweepFlow3.getGoldCombinedAgreements().getAgreements();
                                    SweepOnboardingDuxo sweepOnboardingDuxo2 = SweepOnboardingDuxo.this;
                                    deferred2 = deferred;
                                    str3 = str2;
                                    apiSweepFlow = apiSweepFlow3;
                                    it = agreements.iterator();
                                    sweepOnboardingDuxo = sweepOnboardingDuxo2;
                                    z2 = z;
                                    while (true) {
                                        if (it.hasNext()) {
                                            ApiGoldSweepAgreement apiGoldSweepAgreement = (ApiGoldSweepAgreement) it.next();
                                            StaticContentStore staticContentStore = sweepOnboardingDuxo.staticContentStore;
                                            String agreementId = apiGoldSweepAgreement.getAgreementId();
                                            this.L$0 = str3;
                                            this.L$1 = deferred2;
                                            this.L$2 = apiSweepFlow;
                                            this.L$3 = sweepOnboardingDuxo;
                                            this.L$4 = it;
                                            this.Z$0 = z2;
                                            this.label = 4;
                                            if (ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, agreementId, null, this, 2, null) == coroutine_suspended) {
                                            }
                                        } else {
                                            RegionGateProvider regionGateProvider = SweepOnboardingDuxo.this.regionGateProvider;
                                            McwRegionGate mcwRegionGate = McwRegionGate.INSTANCE;
                                            this.L$0 = str3;
                                            this.L$1 = deferred2;
                                            this.L$2 = apiSweepFlow;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.Z$0 = z2;
                                            this.label = 5;
                                            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, mcwRegionGate, false, this, 2, null);
                                            if (regionGateState$default != coroutine_suspended) {
                                                apiSweepFlow2 = apiSweepFlow;
                                                str4 = str3;
                                                deferred3 = deferred2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("User must have a brokerage account to view sweep onboarding.");
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait = obj;
                    accountNumber = (String) ((Optional) objAwait).getOrNull();
                    CoroutineScope coroutineScope22 = coroutineScope;
                    if (accountNumber == null) {
                    }
                    break;
                case 2:
                    Deferred deferred5 = (Deferred) this.L$1;
                    String str7 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferred = deferred5;
                    str = str7;
                    sweepEnrollment = obj;
                    boolean sweepEnrolled2 = ((ApiSweepEnrollment) sweepEnrollment).getSweepEnrolled();
                    SweepEnrollmentStore sweepEnrollmentStore22 = SweepOnboardingDuxo.this.sweepEnrollmentStore;
                    this.L$0 = str;
                    this.L$1 = deferred;
                    this.Z$0 = sweepEnrolled2;
                    this.label = 3;
                    sweepFlow = sweepEnrollmentStore22.getSweepFlow(str, this);
                    if (sweepFlow != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    z = this.Z$0;
                    deferred = (Deferred) this.L$1;
                    str2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    sweepFlow = obj;
                    ApiSweepFlow apiSweepFlow32 = (ApiSweepFlow) sweepFlow;
                    List<ApiGoldSweepAgreement> agreements2 = apiSweepFlow32.getGoldCombinedAgreements().getAgreements();
                    SweepOnboardingDuxo sweepOnboardingDuxo22 = SweepOnboardingDuxo.this;
                    deferred2 = deferred;
                    str3 = str2;
                    apiSweepFlow = apiSweepFlow32;
                    it = agreements2.iterator();
                    sweepOnboardingDuxo = sweepOnboardingDuxo22;
                    z2 = z;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    return coroutine_suspended;
                case 4:
                    z = this.Z$0;
                    Iterator it2 = (Iterator) this.L$4;
                    SweepOnboardingDuxo sweepOnboardingDuxo3 = (SweepOnboardingDuxo) this.L$3;
                    ApiSweepFlow apiSweepFlow4 = (ApiSweepFlow) this.L$2;
                    Deferred deferred6 = (Deferred) this.L$1;
                    String str8 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    it = it2;
                    sweepOnboardingDuxo = sweepOnboardingDuxo3;
                    apiSweepFlow = apiSweepFlow4;
                    deferred2 = deferred6;
                    str3 = str8;
                    z2 = z;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    return coroutine_suspended;
                case 5:
                    boolean z3 = this.Z$0;
                    apiSweepFlow2 = (ApiSweepFlow) this.L$2;
                    deferred3 = (Deferred) this.L$1;
                    str4 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    z2 = z3;
                    regionGateState$default = obj;
                    zBooleanValue = ((Boolean) regionGateState$default).booleanValue();
                    if (z2) {
                        Observable timelineSummary$default = SweepsTimelineSummaryStore.getTimelineSummary$default(SweepOnboardingDuxo.this.sweepsTimelineSummaryStore, str4, null, 2, null);
                        this.L$0 = deferred3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.Z$0 = zBooleanValue;
                        this.label = 6;
                        objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(timelineSummary$default, this);
                        if (objAwaitFirstOrNull != coroutine_suspended) {
                            sweepsTimelineSummary = (SweepsTimelineSummary) objAwaitFirstOrNull;
                            if ((sweepsTimelineSummary == null ? sweepsTimelineSummary.getInterestPausedReason() : null) == null) {
                                return SweepOnboardingViewState.Paused.INSTANCE;
                            }
                            this.L$0 = null;
                            this.Z$0 = zBooleanValue;
                            this.label = 7;
                            objAwait3 = deferred3.await(this);
                            break;
                        }
                    } else {
                        this.L$0 = deferred3;
                        this.L$1 = str4;
                        this.L$2 = apiSweepFlow2;
                        this.label = 8;
                        objAwait2 = deferred3.await(this);
                        if (objAwait2 != coroutine_suspended) {
                            String str9 = str4;
                            deferred4 = deferred3;
                            str5 = str9;
                            goldInterestRate = ((SweepsInterest) objAwait2).getGoldInterestRate();
                            this.L$0 = str5;
                            this.L$1 = apiSweepFlow2;
                            this.L$2 = goldInterestRate;
                            this.label = 9;
                            objAwait4 = deferred4.await(this);
                            break;
                        }
                    }
                    return coroutine_suspended;
                case 6:
                    zBooleanValue = this.Z$0;
                    Deferred deferred7 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferred3 = deferred7;
                    objAwaitFirstOrNull = obj;
                    sweepsTimelineSummary = (SweepsTimelineSummary) objAwaitFirstOrNull;
                    if ((sweepsTimelineSummary == null ? sweepsTimelineSummary.getInterestPausedReason() : null) == null) {
                    }
                    break;
                case 7:
                    zBooleanValue = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait3 = obj;
                    return new SweepOnboardingViewState.AlreadyEnrolled(((SweepsInterest) objAwait3).getInterestRate(), zBooleanValue);
                case 8:
                    ApiSweepFlow apiSweepFlow5 = (ApiSweepFlow) this.L$2;
                    String str10 = (String) this.L$1;
                    Deferred deferred8 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferred4 = deferred8;
                    str5 = str10;
                    apiSweepFlow2 = apiSweepFlow5;
                    objAwait2 = obj;
                    goldInterestRate = ((SweepsInterest) objAwait2).getGoldInterestRate();
                    this.L$0 = str5;
                    this.L$1 = apiSweepFlow2;
                    this.L$2 = goldInterestRate;
                    this.label = 9;
                    objAwait4 = deferred4.await(this);
                    break;
                case 9:
                    goldInterestRate = (BigDecimal) this.L$2;
                    apiSweepFlow2 = (ApiSweepFlow) this.L$1;
                    str5 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait4 = obj;
                    return new SweepOnboardingViewState.Loaded(str5, apiSweepFlow2, goldInterestRate, ((SweepsInterest) objAwait4).getNonGoldInterestRate());
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(SweepOnboardingDuxo sweepOnboardingDuxo, final SweepOnboardingViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        sweepOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingDuxo.onCreate$lambda$1$lambda$0(viewState, (SweepOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(SweepOnboardingDuxo sweepOnboardingDuxo, final Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        sweepOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingDuxo.onCreate$lambda$3$lambda$2(e, (SweepOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SweepOnboardingViewState onCreate$lambda$3$lambda$2(Throwable th, SweepOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SweepOnboardingViewState.Error(th);
    }

    /* compiled from: SweepOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingDuxo;", "Lcom/robinhood/android/sweep/contracts/SweepOnboardingIntentKey;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<SweepOnboardingDuxo, SweepOnboardingIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public SweepOnboardingIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (SweepOnboardingIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public SweepOnboardingIntentKey getExtras(SweepOnboardingDuxo sweepOnboardingDuxo) {
            return (SweepOnboardingIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, sweepOnboardingDuxo);
        }
    }
}
