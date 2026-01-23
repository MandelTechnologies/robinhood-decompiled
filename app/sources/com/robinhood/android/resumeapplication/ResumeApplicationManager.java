package com.robinhood.android.resumeapplication;

import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.resumeapplication.ResumeApplicationManager;
import com.robinhood.android.resumeapplication.api.ResumeApplicationApi;
import com.robinhood.android.resumeapplication.experiments.ResurrectionInAppCommsExp;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ResumeApplicationFullScreenTakeoverUpsell;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse8;
import com.robinhood.models.api.bonfire.ResumeApplicationTakeoverLoggingInfo;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingModel;
import com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellModel;
import com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.service.protocol.ProtocolExceptions5;
import p479j$.time.Clock;

/* compiled from: ResumeApplicationManager.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u001b2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001b¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0015098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/android/resumeapplication/api/ResumeApplicationApi;", "resumeApplicationApi", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/Installation;", "installation", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/resumeapplication/api/ResumeApplicationApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lj$/time/Clock;Lcom/robinhood/prefs/Installation;Lmicrogram/android/inject/MicrogramComponent$Factory;)V", "Lcom/robinhood/models/api/bonfire/ResumeApplicationResponse;", "Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "takeoverLoggingInfo", "Lcom/robinhood/android/resumeapplication/ResumeApplicationViewState;", "toResumeApplicationState", "(Lcom/robinhood/models/api/bonfire/ResumeApplicationResponse;Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;)Lcom/robinhood/android/resumeapplication/ResumeApplicationViewState;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "mutation", "", "applyMutation", "(Lkotlin/jvm/functions/Function1;)V", "resumeApplicationResponse", "checkUpsellEligibilityFromMicrogram", "(Lcom/robinhood/models/api/bonfire/ResumeApplicationResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "()V", "seenResumeApplicationScreen", "Lcom/robinhood/shared/app/type/AppType;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/robinhood/android/resumeapplication/api/ResumeApplicationApi;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/Installation;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "internalState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lmicrogram/android/inject/MicrogramComponent;", "resurrectionApplicationMicrogramApp", "Lmicrogram/android/inject/MicrogramComponent;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "", "lastUpdatedAt", "Ljava/lang/Long;", "Lcom/robinhood/android/moria/network/bouncer/DefaultStaleDecider;", "staleDecider", "Lcom/robinhood/android/moria/network/bouncer/DefaultStaleDecider;", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ResumeApplicationManager {
    public static final int $stable = 8;
    private final AppType appType;
    private final Clock clock;
    private final CoroutineScope coroutineScope;
    private final ExperimentsStore experimentsStore;
    private final Installation installation;
    private final StateFlow2<ResumeApplicationViewState> internalState;
    private Job job;
    private Long lastUpdatedAt;
    private final ResumeApplicationApi resumeApplicationApi;
    private final MicrogramComponent resurrectionApplicationMicrogramApp;
    private final DefaultStaleDecider staleDecider;

    /* compiled from: ResumeApplicationManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.resumeapplication.ResumeApplicationManager", m3645f = "ResumeApplicationManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "checkUpsellEligibilityFromMicrogram")
    /* renamed from: com.robinhood.android.resumeapplication.ResumeApplicationManager$checkUpsellEligibilityFromMicrogram$1 */
    static final class C269371 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C269371(Continuation<? super C269371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumeApplicationManager.this.checkUpsellEligibilityFromMicrogram(null, this);
        }
    }

    public ResumeApplicationManager(AppType appType, @RootCoroutineScope CoroutineScope coroutineScope, ResumeApplicationApi resumeApplicationApi, ExperimentsStore experimentsStore, Clock clock, Installation installation, MicrogramComponent.Factory microgramComponentFactory) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(resumeApplicationApi, "resumeApplicationApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        this.appType = appType;
        this.coroutineScope = coroutineScope;
        this.resumeApplicationApi = resumeApplicationApi;
        this.experimentsStore = experimentsStore;
        this.clock = clock;
        this.installation = installation;
        this.internalState = StateFlow4.MutableStateFlow(new ResumeApplicationViewState(null, null, null, 7, null));
        this.resurrectionApplicationMicrogramApp = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, coroutineScope, new RemoteMicrogramApplication("app-resurrection-lifetime-improvements", null, 2, null), null, 4, null);
        this.staleDecider = new DefaultStaleDecider(Durations.INSTANCE.getONE_MINUTE(), clock);
    }

    public final StateFlow<ResumeApplicationViewState> getState() {
        return this.internalState;
    }

    public final void refresh() {
        if (this.appType == AppType.TRADER && this.staleDecider.invoke(this.lastUpdatedAt).booleanValue()) {
            Job job = this.job;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.job = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C269381(null), 3, null);
        }
    }

    /* compiled from: ResumeApplicationManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.resumeapplication.ResumeApplicationManager$refresh$1", m3645f = "ResumeApplicationManager.kt", m3646l = {192, 80, 85, 95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.resumeapplication.ResumeApplicationManager$refresh$1 */
    static final class C269381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C269381(Continuation<? super C269381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResumeApplicationManager.this.new C269381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C269381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
        
            if (r1.checkUpsellEligibilityFromMicrogram(r15, r14) == r0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:11:0x0023, B:31:0x00a1, B:12:0x0028, B:25:0x0083, B:27:0x008b, B:22:0x0068, B:28:0x0092), top: B:48:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[ADDED_TO_REGION] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ResumeApplicationResponse resumeApplicationResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableOnErrorReturnItem = ExperimentsProvider.DefaultImpls.streamState$default(ResumeApplicationManager.this.experimentsStore, new Experiment[]{ResurrectionInAppCommsExp.INSTANCE}, false, null, 6, null).onErrorReturnItem(boxing.boxBoolean(false));
                Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(observableOnErrorReturnItem, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    List<ResumeApplicationResponse> takeovers = ((ResumeApplicationFullScreenTakeoverUpsell) obj).getTakeovers();
                    resumeApplicationResponse = takeovers == null ? (ResumeApplicationResponse) CollectionsKt.firstOrNull((List) takeovers) : null;
                    ResumeApplicationManager resumeApplicationManager = ResumeApplicationManager.this;
                    resumeApplicationManager.lastUpdatedAt = boxing.boxLong(resumeApplicationManager.clock.millis());
                    if (resumeApplicationResponse != null) {
                    }
                    if (resumeApplicationResponse != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                resumeApplicationResponse = (ResumeApplicationResponse) obj;
                ResumeApplicationManager resumeApplicationManager2 = ResumeApplicationManager.this;
                resumeApplicationManager2.lastUpdatedAt = boxing.boxLong(resumeApplicationManager2.clock.millis());
                ResumeApplicationResponse8 variant = resumeApplicationResponse != null ? resumeApplicationResponse.getVariant() : null;
                if (resumeApplicationResponse != null || variant == null) {
                    return Unit.INSTANCE;
                }
                ResumeApplicationManager resumeApplicationManager3 = ResumeApplicationManager.this;
                this.label = 4;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null ? bool.booleanValue() : false) {
                ResumeApplicationApi resumeApplicationApi = ResumeApplicationManager.this.resumeApplicationApi;
                IacAlertSheetLocation iacAlertSheetLocation = IacAlertSheetLocation.TOP_LEVEL_INVESTING;
                String strMo2745id = ResumeApplicationManager.this.installation.mo2745id();
                this.label = 2;
                obj = resumeApplicationApi.getResumeApplicationFullScreenTakeoverUpsell(iacAlertSheetLocation, strMo2745id, this);
                if (obj == coroutine_suspended) {
                }
                List<ResumeApplicationResponse> takeovers2 = ((ResumeApplicationFullScreenTakeoverUpsell) obj).getTakeovers();
                if (takeovers2 == null) {
                }
                ResumeApplicationManager resumeApplicationManager22 = ResumeApplicationManager.this;
                resumeApplicationManager22.lastUpdatedAt = boxing.boxLong(resumeApplicationManager22.clock.millis());
                if (resumeApplicationResponse != null) {
                }
                if (resumeApplicationResponse != null) {
                }
                return Unit.INSTANCE;
            }
            ResumeApplicationApi resumeApplicationApi2 = ResumeApplicationManager.this.resumeApplicationApi;
            this.label = 3;
            obj = resumeApplicationApi2.getResumeApplicationContent(this);
            if (obj == coroutine_suspended) {
            }
            resumeApplicationResponse = (ResumeApplicationResponse) obj;
            ResumeApplicationManager resumeApplicationManager222 = ResumeApplicationManager.this;
            resumeApplicationManager222.lastUpdatedAt = boxing.boxLong(resumeApplicationManager222.clock.millis());
            if (resumeApplicationResponse != null) {
            }
            if (resumeApplicationResponse != null) {
            }
            return Unit.INSTANCE;
            return coroutine_suspended;
        }
    }

    private final ResumeApplicationViewState toResumeApplicationState(ResumeApplicationResponse resumeApplicationResponse, ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo) {
        String forwardToDeeplink = resumeApplicationResponse.getForwardToDeeplink();
        ResumeApplicationResponse8 variant = resumeApplicationResponse.getVariant();
        if (variant == null) {
            variant = ResumeApplicationResponse8.CHURNED;
        }
        return new ResumeApplicationViewState(resumeApplicationResponse, forwardToDeeplink, new UiEvent(new ResumeApplication(variant, resumeApplicationResponse.getShowWelcomeBack(), resumeApplicationResponse.getFirstName(), resumeApplicationResponse.getTitle(), resumeApplicationResponse.getSubtitle(), resumeApplicationResponse.getDisclosure(), resumeApplicationResponse.getFundingUpsellContent(), resumeApplicationResponse.getChurnedFundingV2Content(), resumeApplicationResponse.getFundingUpsellVariant(), resumeApplicationResponse.getWelcomeBackBackgroundColor(), resumeApplicationResponse.getWelcomeBackImageSource(), resumeApplicationResponse.getDetailsScreenContent(), resumeApplicationTakeoverLoggingInfo)));
    }

    public final void seenResumeApplicationScreen() {
        ResumeApplicationResponse response = this.internalState.getValue().getResponse();
        ResumeApplicationResponse response2 = this.internalState.getValue().getResponse();
        ResumeApplicationResponse8 variant = response2 != null ? response2.getVariant() : null;
        if (response == null || variant == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C269391(variant, response, this, null), 3, null);
    }

    /* compiled from: ResumeApplicationManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.resumeapplication.ResumeApplicationManager$seenResumeApplicationScreen$1", m3645f = "ResumeApplicationManager.kt", m3646l = {136}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.resumeapplication.ResumeApplicationManager$seenResumeApplicationScreen$1 */
    static final class C269391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ResumeApplicationResponse $resurrectionResponse;
        final /* synthetic */ ResumeApplicationResponse8 $resurrectionVariant;
        int label;
        final /* synthetic */ ResumeApplicationManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C269391(ResumeApplicationResponse8 resumeApplicationResponse8, ResumeApplicationResponse resumeApplicationResponse, ResumeApplicationManager resumeApplicationManager, Continuation<? super C269391> continuation) {
            super(2, continuation);
            this.$resurrectionVariant = resumeApplicationResponse8;
            this.$resurrectionResponse = resumeApplicationResponse;
            this.this$0 = resumeApplicationManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C269391(this.$resurrectionVariant, this.$resurrectionResponse, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C269391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ResurrectionUpsellLoggingModel resurrectionUpsellLoggingModel = new ResurrectionUpsellLoggingModel(this.$resurrectionVariant.getServerValue(), this.$resurrectionResponse.getExperimentName(), this.$resurrectionResponse.getExperimentVariant());
                    ResurrectionUpsellService resurrectionUpsellService = (ResurrectionUpsellService) this.this$0.resurrectionApplicationMicrogramApp.getServiceLocator().getClient(ResurrectionUpsellService.class);
                    this.label = 1;
                    if (resurrectionUpsellService.resurrectionUpsellWasShown(resurrectionUpsellLoggingModel, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationManager$seenResumeApplicationScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ResumeApplicationManager.C269391.invokeSuspend$lambda$0((ResumeApplicationViewState) obj2);
                    }
                });
                Job job = this.this$0.job;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
            } catch (Throwable th) {
                Logger.INSTANCE.mo1681e("Resume application takeover microgram resurrectionUpsellWasShown: " + th + ", microgram error: " + ProtocolExceptions5.asMicrogramError(th), new Object[0]);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, true, null, 4, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ResumeApplicationViewState invokeSuspend$lambda$0(ResumeApplicationViewState resumeApplicationViewState) {
            return resumeApplicationViewState.copy(null, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMutation(Function1<? super ResumeApplicationViewState, ResumeApplicationViewState> mutation) {
        ResumeApplicationViewState value;
        StateFlow2<ResumeApplicationViewState> stateFlow2 = this.internalState;
        do {
            value = stateFlow2.getValue();
        } while (!stateFlow2.compareAndSet(value, mutation.invoke(value)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkUpsellEligibilityFromMicrogram(final ResumeApplicationResponse resumeApplicationResponse, Continuation<? super Unit> continuation) {
        C269371 c269371;
        final ResurrectionUpsellModel resurrectionUpsellModel;
        if (continuation instanceof C269371) {
            c269371 = (C269371) continuation;
            int i = c269371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c269371.label = i - Integer.MIN_VALUE;
            } else {
                c269371 = new C269371(continuation);
            }
        }
        C269371 c2693712 = c269371;
        Object objResurrectionTakeoverUpsellModel$default = c2693712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2693712.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objResurrectionTakeoverUpsellModel$default);
                ResumeApplicationResponse8 variant = resumeApplicationResponse.getVariant();
                if (variant == null) {
                    return Unit.INSTANCE;
                }
                ResurrectionUpsellService resurrectionUpsellService = (ResurrectionUpsellService) this.resurrectionApplicationMicrogramApp.getServiceLocator().getClient(ResurrectionUpsellService.class);
                String serverValue = variant.getServerValue();
                c2693712.L$0 = resumeApplicationResponse;
                c2693712.label = 1;
                objResurrectionTakeoverUpsellModel$default = ResurrectionUpsellService.DefaultImpls.resurrectionTakeoverUpsellModel$default(resurrectionUpsellService, serverValue, null, c2693712, 2, null);
                if (objResurrectionTakeoverUpsellModel$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                resumeApplicationResponse = (ResumeApplicationResponse) c2693712.L$0;
                ResultKt.throwOnFailure(objResurrectionTakeoverUpsellModel$default);
            }
            resurrectionUpsellModel = (ResurrectionUpsellModel) objResurrectionTakeoverUpsellModel$default;
        } catch (Throwable th) {
            Logger.INSTANCE.mo1681e("Error fetching resume application takeover impression: " + th + ", microgram error: " + ProtocolExceptions5.asMicrogramError(th), new Object[0]);
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, true, null, 4, null);
        }
        if (!resurrectionUpsellModel.getShouldShow()) {
            return Unit.INSTANCE;
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResumeApplicationManager.checkUpsellEligibilityFromMicrogram$lambda$1(this.f$0, resumeApplicationResponse, resurrectionUpsellModel, (ResumeApplicationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResumeApplicationViewState checkUpsellEligibilityFromMicrogram$lambda$1(ResumeApplicationManager resumeApplicationManager, ResumeApplicationResponse resumeApplicationResponse, ResurrectionUpsellModel resurrectionUpsellModel, ResumeApplicationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Long msSinceLastShown = resurrectionUpsellModel.getMsSinceLastShown();
        long jLongValue = msSinceLastShown != null ? msSinceLastShown.longValue() : 0L;
        Integer shownCount = resurrectionUpsellModel.getShownCount();
        return resumeApplicationManager.toResumeApplicationState(resumeApplicationResponse, new ResumeApplicationTakeoverLoggingInfo(jLongValue, shownCount != null ? shownCount.intValue() : 0, resumeApplicationResponse.getExperimentName(), resumeApplicationResponse.getExperimentVariant()));
    }
}
