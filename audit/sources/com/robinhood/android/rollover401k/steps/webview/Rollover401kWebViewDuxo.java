package com.robinhood.android.rollover401k.steps.webview;

import bff_retirement.service.p020v1.BffRetirementService;
import bff_retirement.service.p020v1.CapitalizeWebViewAllowedUrlsRequestDto;
import bff_retirement.service.p020v1.CapitalizeWebViewAllowedUrlsResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUpdateTransactionRequest2;
import com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: Rollover401kWebViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewViewState;", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewEvent;", "rolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "bffRetirementService", "Lbff_retirement/service/v1/BffRetirementService;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;Lbff_retirement/service/v1/BffRetirementService;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "updateTransaction", "transactionId", "", "checkForFinderResults", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Rollover401kWebViewDuxo extends BaseDuxo5<Rollover401kWebViewViewState, Rollover401kWebViewEvent> {
    public static final String ACCOUNT_FINDER_RESULTS_DEEP_LINK = "robinhood://rollover_401k_finder";
    private final BffRetirementService bffRetirementService;
    private final ExperimentsStore experimentsStore;
    private final Retirement401kRolloverStore rolloverStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ImmutableList3<String> ALLOWED_HOSTS = extensions2.persistentListOf("www.raas-submit-dev.hicapitalize.com", "www.raas-submit-staging.hicapitalize.com", "www.raas-submit.hicapitalize.com", "www.calendly.com", "www.assets.calendly.com", "www.app.hellosign.com", "raas-submit-dev.hicapitalize.com", "raas-submit-staging.hicapitalize.com", "raas-submit.hicapitalize.com", "calendly.com", "assets.calendly.com", "app.hellosign.com", "cdn.heapanalytics.com");
    private static final ImmutableList3<String> HOSTS_TO_OPEN_EXTERNALLY = extensions2.persistentListOf("www.help.hicapitalize.com", "help.hicapitalize.com");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rollover401kWebViewDuxo(Retirement401kRolloverStore rolloverStore, BffRetirementService bffRetirementService, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        super(new Rollover401kWebViewViewState(false, null, null, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(rolloverStore, "rolloverStore");
        Intrinsics.checkNotNullParameter(bffRetirementService, "bffRetirementService");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rolloverStore = rolloverStore;
        this.bffRetirementService = bffRetirementService;
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable observableSwitchMap = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{CapitalizeWebViewUrlUpdateExperiment.INSTANCE}, false, null, 6, null).switchMap(new Function() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo.onCreate.1

            /* compiled from: Rollover401kWebViewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$onCreate$1$1", m3645f = "Rollover401kWebViewDuxo.kt", m3646l = {36, 35}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$onCreate$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Produce4<? super CapitalizeWebViewAllowedUrlsResponseDto>, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ Rollover401kWebViewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Rollover401kWebViewDuxo rollover401kWebViewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = rollover401kWebViewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Produce4<? super CapitalizeWebViewAllowedUrlsResponseDto> produce4, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
                
                    if (r1.send(r6, r5) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Produce4 produce4;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        produce4 = (Produce4) this.L$0;
                        BffRetirementService bffRetirementService = this.this$0.bffRetirementService;
                        CapitalizeWebViewAllowedUrlsRequestDto capitalizeWebViewAllowedUrlsRequestDto = new CapitalizeWebViewAllowedUrlsRequestDto();
                        this.L$0 = produce4;
                        this.label = 1;
                        obj = bffRetirementService.CapitalizeWebViewAllowedUrls(capitalizeWebViewAllowedUrlsRequestDto, this);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    produce4 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 2;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CapitalizeWebViewAllowedUrlsResponseDto> apply(Boolean isEnabled) {
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (isEnabled.booleanValue()) {
                    Rollover401kWebViewDuxo rollover401kWebViewDuxo = Rollover401kWebViewDuxo.this;
                    return RxFactory.DefaultImpls.rxObservable$default(rollover401kWebViewDuxo, null, new AnonymousClass1(rollover401kWebViewDuxo, null), 1, null);
                }
                Companion companion = Rollover401kWebViewDuxo.INSTANCE;
                Observable observableJust = Observable.just(new CapitalizeWebViewAllowedUrlsResponseDto(companion.getALLOWED_HOSTS(), companion.getHOSTS_TO_OPEN_EXTERNALLY()));
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Rollover401kWebViewDuxo.onCreate$lambda$0(this.f$0, (CapitalizeWebViewAllowedUrlsResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Rollover401kWebViewDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(Rollover401kWebViewDuxo rollover401kWebViewDuxo, CapitalizeWebViewAllowedUrlsResponseDto capitalizeWebViewAllowedUrlsResponseDto) {
        rollover401kWebViewDuxo.applyMutation(new Rollover401kWebViewDuxo2(capitalizeWebViewAllowedUrlsResponseDto, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(Rollover401kWebViewDuxo rollover401kWebViewDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        rollover401kWebViewDuxo.submit(new Rollover401kWebViewEvent.NetworkError(t));
        rollover401kWebViewDuxo.applyMutation(new Rollover401kWebViewDuxo3(null));
        return Unit.INSTANCE;
    }

    /* compiled from: Rollover401kWebViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$updateTransaction$1", m3645f = "Rollover401kWebViewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$updateTransaction$1 */
    static final class C277861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $transactionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C277861(String str, Continuation<? super C277861> continuation) {
            super(2, continuation);
            this.$transactionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Rollover401kWebViewDuxo.this.new C277861(this.$transactionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Rollover401kWebViewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$updateTransaction$1$1", m3645f = "Rollover401kWebViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$updateTransaction$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Rollover401kWebViewViewState, Continuation<? super Rollover401kWebViewViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Rollover401kWebViewViewState rollover401kWebViewViewState, Continuation<? super Rollover401kWebViewViewState> continuation) {
                return ((AnonymousClass1) create(rollover401kWebViewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Rollover401kWebViewViewState.copy$default((Rollover401kWebViewViewState) this.L$0, true, null, null, 6, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Rollover401kWebViewDuxo.this.applyMutation(new AnonymousClass1(null));
                    Retirement401kRolloverStore retirement401kRolloverStore = Rollover401kWebViewDuxo.this.rolloverStore;
                    String str = this.$transactionId;
                    this.label = 1;
                    obj = retirement401kRolloverStore.updateTransaction(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Rollover401kWebViewDuxo.this.submit(new Rollover401kWebViewEvent.NavigationEvent(((ApiRetirement401kRolloverUpdateTransactionRequest2) obj).getDeeplink()));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                Rollover401kWebViewDuxo.this.submit(new Rollover401kWebViewEvent.NetworkError(th));
                Rollover401kWebViewDuxo.this.applyMutation(new Rollover401kWebViewDuxo4(null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void updateTransaction(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C277861(transactionId, null), 3, null);
    }

    public final void checkForFinderResults() {
        submit(new Rollover401kWebViewEvent.NavigationEvent(ACCOUNT_FINDER_RESULTS_DEEP_LINK));
    }

    /* compiled from: Rollover401kWebViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewDuxo$Companion;", "", "<init>", "()V", "ALLOWED_HOSTS", "Lkotlinx/collections/immutable/PersistentList;", "", "getALLOWED_HOSTS", "()Lkotlinx/collections/immutable/PersistentList;", "HOSTS_TO_OPEN_EXTERNALLY", "getHOSTS_TO_OPEN_EXTERNALLY", "ACCOUNT_FINDER_RESULTS_DEEP_LINK", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImmutableList3<String> getALLOWED_HOSTS() {
            return Rollover401kWebViewDuxo.ALLOWED_HOSTS;
        }

        public final ImmutableList3<String> getHOSTS_TO_OPEN_EXTERNALLY() {
            return Rollover401kWebViewDuxo.HOSTS_TO_OPEN_EXTERNALLY;
        }
    }
}
