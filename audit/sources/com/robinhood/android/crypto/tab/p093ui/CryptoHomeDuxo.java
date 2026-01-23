package com.robinhood.android.crypto.tab.p093ui;

import com.android.shared.portfolio.lists.handler.CryptoHomeListsAdditionClickHandler;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.tab.p093ui.CryptoHomeEvent;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverState;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHomeStore;
import com.robinhood.librobinhood.data.store.CryptoOnboardingM1Store;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import com.robinhood.models.api.home.CryptoHomeComponentType;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import com.robinhood.models.crypto.p314db.home.CryptoHomeDiscover;
import com.robinhood.models.crypto.p314db.home.CryptoHomeState;
import com.robinhood.models.crypto.p314db.home.CryptoTopCrypto;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.models.p355ui.IacUpsellLocation;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoHomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00014BY\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0001¢\u0006\u0002\b-J\r\u0010.\u001a\u00020(H\u0001¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020\u001fJ\u000e\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020&R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010&0&0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeViewState;", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOnboardingM1Store", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "cryptoHomeStore", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "listsAdditionClickHandler", "Lcom/android/shared/portfolio/lists/handler/CryptoHomeListsAdditionClickHandler;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/tab/ui/CryptoHomeStateProvider;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;Lcom/robinhood/shared/data/store/iac/IacUpsellStore;Lcom/robinhood/android/util/LockscreenManager;Lcom/android/shared/portfolio/lists/handler/CryptoHomeListsAdditionClickHandler;)V", "getListsAdditionClickHandler", "()Lcom/android/shared/portfolio/lists/handler/CryptoHomeListsAdditionClickHandler;", "discoverRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "ctaButtonsRelay", "topCoinsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "tradableRelay", "instrumentDisplayTypeBehaviorRelay", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "onCreate", "", "onStart", "getHomeState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/crypto/db/home/CryptoHomeState;", "getHomeState$feature_crypto_tab_externalDebug", "streamAccount", "streamAccount$feature_crypto_tab_externalDebug", "toggleTradableDiscoverList", "tradable", "changeInstrumentDisplayType", "instrumentDisplayType", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoHomeDuxo extends BaseDuxo3<CryptoHomeDataState, CryptoHomeViewState, CryptoHomeEvent> {
    private final AppType appType;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoHomeStore cryptoHomeStore;
    private final CryptoOnboardingM1Store cryptoOnboardingM1Store;
    private final BehaviorRelay<Boolean> ctaButtonsRelay;
    private final BehaviorRelay<Boolean> discoverRelay;
    private final IacUpsellStore iacUpsellStore;
    private final BehaviorRelay<InstrumentDisplayType> instrumentDisplayTypeBehaviorRelay;
    private final CryptoHomeListsAdditionClickHandler listsAdditionClickHandler;
    private final LockscreenManager lockscreenManager;
    private final StateFlow2<Boolean> topCoinsFlow;
    private final BehaviorRelay<Boolean> tradableRelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InstrumentDisplayType INITIAL_INSTRUMENT_DISPLAY_TYPE = InstrumentDisplayType.LAST_PRICE;

    public final CryptoHomeListsAdditionClickHandler getListsAdditionClickHandler() {
        return this.listsAdditionClickHandler;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoHomeDuxo(DuxoBundle duxoBundle, CryptoHomeStateProvider stateProvider, AppType appType, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoOnboardingM1Store cryptoOnboardingM1Store, CryptoHomeStore cryptoHomeStore, IacUpsellStore iacUpsellStore, LockscreenManager lockscreenManager, CryptoHomeListsAdditionClickHandler listsAdditionClickHandler) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
        Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(listsAdditionClickHandler, "listsAdditionClickHandler");
        InstrumentDisplayType instrumentDisplayType = INITIAL_INSTRUMENT_DISPLAY_TYPE;
        super(new CryptoHomeDataState(null, instrumentDisplayType, null, null, null, null, appType, false, null, false, null, false, false, 7968, null), stateProvider, duxoBundle);
        this.appType = appType;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoOnboardingM1Store = cryptoOnboardingM1Store;
        this.cryptoHomeStore = cryptoHomeStore;
        this.iacUpsellStore = iacUpsellStore;
        this.lockscreenManager = lockscreenManager;
        this.listsAdditionClickHandler = listsAdditionClickHandler;
        Boolean bool = Boolean.FALSE;
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(bool);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.discoverRelay = behaviorRelayCreateDefault;
        BehaviorRelay<Boolean> behaviorRelayCreateDefault2 = BehaviorRelay.createDefault(bool);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault2, "createDefault(...)");
        this.ctaButtonsRelay = behaviorRelayCreateDefault2;
        this.topCoinsFlow = StateFlow4.MutableStateFlow(bool);
        BehaviorRelay<Boolean> behaviorRelayCreateDefault3 = BehaviorRelay.createDefault(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault3, "createDefault(...)");
        this.tradableRelay = behaviorRelayCreateDefault3;
        BehaviorRelay<InstrumentDisplayType> behaviorRelayCreateDefault4 = BehaviorRelay.createDefault(instrumentDisplayType);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault4, "createDefault(...)");
        this.instrumentDisplayTypeBehaviorRelay = behaviorRelayCreateDefault4;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        streamAccount$feature_crypto_tab_externalDebug();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C130371(null), 3, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C130382(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C130393(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C130404(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C130415(null));
    }

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$1 */
    static final class C130371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C130371(Continuation<? super C130371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeDuxo.this.new C130371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C130371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoHomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$1$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoHomeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeDuxo cryptoHomeDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AnonymousClass1 anonymousClass1;
                String upsellDeeplink;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.Z$0) {
                        IacUpsellStore iacUpsellStore = this.this$0.iacUpsellStore;
                        IacUpsellLocation iacUpsellLocation = IacUpsellLocation.TOP_LEVEL_CRYPTO_FULLSCREEN;
                        this.label = 1;
                        anonymousClass1 = this;
                        obj = IacUpsellStore.getUpsellByLocation$default(iacUpsellStore, iacUpsellLocation, null, null, null, null, null, null, anonymousClass1, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                }
                IacUpsell iacUpsell = (IacUpsell) ((Optional) obj).getOrNull();
                if (iacUpsell != null && (upsellDeeplink = iacUpsell.getUpsellDeeplink()) != null) {
                    anonymousClass1.this$0.submit(new CryptoHomeEvent.ShowUpsell(upsellDeeplink));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> lockState = CryptoHomeDuxo.this.lockscreenManager.getLockState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(lockState, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$2", m3645f = "CryptoHomeDuxo.kt", m3646l = {103}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$2 */
    static final class C130382 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C130382(Continuation<? super C130382> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeDuxo.this.new C130382(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C130382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOnboardingM1Store cryptoOnboardingM1Store = CryptoHomeDuxo.this.cryptoOnboardingM1Store;
                this.label = 1;
                if (cryptoOnboardingM1Store.updateCryptoImpression(this) == coroutine_suspended) {
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

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$3", m3645f = "CryptoHomeDuxo.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$3 */
    static final class C130393 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C130393(Continuation<? super C130393> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeDuxo.this.new C130393(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C130393) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CryptoUsPulseExperiment.Variant> flowStreamCryptoPulseExperiment = CryptoHomeDuxo.this.cryptoExperimentsStore.streamCryptoPulseExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoPulseExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$3$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoUsPulseExperiment.Variant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeDuxo cryptoHomeDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoUsPulseExperiment.Variant variant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$3$1$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497431 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
                final /* synthetic */ CryptoUsPulseExperiment.Variant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497431(CryptoUsPulseExperiment.Variant variant, Continuation<? super C497431> continuation) {
                    super(2, continuation);
                    this.$it = variant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497431 c497431 = new C497431(this.$it, continuation);
                    c497431.L$0 = obj;
                    return c497431;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
                    return ((C497431) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeDataState.copy$default((CryptoHomeDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, this.$it, false, false, 7167, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497431((CryptoUsPulseExperiment.Variant) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$4", m3645f = "CryptoHomeDuxo.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$4 */
    static final class C130404 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C130404(Continuation<? super C130404> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeDuxo.this.new C130404(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C130404) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoHomeTabExploreSectionExperiment = CryptoHomeDuxo.this.cryptoExperimentsStore.streamCryptoHomeTabExploreSectionExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoHomeTabExploreSectionExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$4$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoHomeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeDuxo cryptoHomeDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$4$1$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497441 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497441(boolean z, Continuation<? super C497441> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497441 c497441 = new C497441(this.$it, continuation);
                    c497441.L$0 = obj;
                    return c497441;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
                    return ((C497441) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeDataState.copy$default((CryptoHomeDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, null, this.$it, false, 6143, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497441(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$5", m3645f = "CryptoHomeDuxo.kt", m3646l = {123}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$5 */
    static final class C130415 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C130415(Continuation<? super C130415> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeDuxo.this.new C130415(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C130415) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = CryptoHomeDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoMibExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$5$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoHomeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeDuxo cryptoHomeDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$5$1$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497451 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497451(boolean z, Continuation<? super C497451> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497451 c497451 = new C497451(this.$it, continuation);
                    c497451.L$0 = obj;
                    return c497451;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
                    return ((C497451) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeDataState.copy$default((CryptoHomeDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, null, false, this.$it, 4095, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497451(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Observable observableJust;
        super.onStart();
        Observable observableDoOnNext = asObservable(getHomeState$feature_crypto_tab_externalDebug()).doOnNext(new Consumer() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo.onStart.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(CryptoHomeState cryptoHomeState) {
                CryptoHomeDuxo.this.discoverRelay.accept(Boolean.valueOf(cryptoHomeState.getOrdering().contains(CryptoHomeComponentType.DISCOVER_COINS)));
                CryptoHomeDuxo.this.ctaButtonsRelay.accept(Boolean.TRUE);
                CryptoHomeDuxo.this.topCoinsFlow.tryEmit(Boolean.valueOf(cryptoHomeState.getOrdering().contains(CryptoHomeComponentType.TOP_CRYPTOS)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnNext, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeDuxo.onStart$lambda$0(this.f$0, (CryptoHomeState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.cryptoExperimentsStore.streamCryptoSduiChartsExperiment()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeDuxo.onStart$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        if (this.appType == AppType.TRADER) {
            Observable<T> observableAsObservable = asObservable(this.cryptoHomeStore.streamCryptoHomeCtaButtons());
            final Flow<Boolean> flowStreamCryptoMibExperiment = this.cryptoExperimentsStore.streamCryptoMibExperiment();
            observableJust = ObservablesKt.connectWhen$default(observableAsObservable, asObservable(new Flow<Boolean>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamCryptoMibExperiment.collect(new C130332(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$$inlined$map$1$2 */
                public static final class C130332<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$$inlined$map$1$2", m3645f = "CryptoHomeDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C130332.this.emit(null, this);
                        }
                    }

                    public C130332(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Boolean boolBoxBoolean = boxing.boxBoolean(!((Boolean) obj).booleanValue());
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }), null, 2, null).map(new Function() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo.onStart.6
                @Override // io.reactivex.functions.Function
                public final ImmutableList<Button<GenericAction>> apply(CryptoHomeCtaButtons it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getButtons();
                }
            });
        } else {
            observableJust = Observable.just(extensions2.persistentListOf());
        }
        Intrinsics.checkNotNull(observableJust);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableJust, this.ctaButtonsRelay, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeDuxo.onStart$lambda$4(this.f$0, (ImmutableList) obj);
            }
        });
        Observable observableSwitchMap = Observable.combineLatest(this.tradableRelay, this.instrumentDisplayTypeBehaviorRelay, new BiFunction() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo.onStart.8
            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<Boolean, InstrumentDisplayType> apply(Boolean tradable, InstrumentDisplayType displayType) {
                Intrinsics.checkNotNullParameter(tradable, "tradable");
                Intrinsics.checkNotNullParameter(displayType, "displayType");
                return Tuples4.m3642to(tradable, displayType);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo.onStart.9

            /* compiled from: CryptoHomeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$9$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
                final /* synthetic */ Boolean $tradable;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Boolean bool, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$tradable = bool;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradable, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoHomeDataState cryptoHomeDataState = (CryptoHomeDataState) this.L$0;
                    CryptoHomeDiscoverState discoverState$feature_crypto_tab_externalDebug = cryptoHomeDataState.getDiscoverState$feature_crypto_tab_externalDebug();
                    return CryptoHomeDataState.copy$default(cryptoHomeDataState, null, null, null, discoverState$feature_crypto_tab_externalDebug != null ? CryptoHomeDiscoverState.copy$default(discoverState$feature_crypto_tab_externalDebug, null, this.$tradable.booleanValue(), 1, null) : null, null, null, null, false, null, false, null, false, false, 8183, null);
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CryptoHomeDiscover> apply(Tuples2<Boolean, ? extends InstrumentDisplayType> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Boolean boolComponent1 = tuples2.component1();
                Intrinsics.checkNotNullExpressionValue(boolComponent1, "component1(...)");
                Boolean bool = boolComponent1;
                InstrumentDisplayType instrumentDisplayTypeComponent2 = tuples2.component2();
                Intrinsics.checkNotNullExpressionValue(instrumentDisplayTypeComponent2, "component2(...)");
                CryptoHomeDuxo.this.applyMutation(new AnonymousClass1(bool, null));
                CryptoHomeDuxo cryptoHomeDuxo = CryptoHomeDuxo.this;
                return cryptoHomeDuxo.asObservable(cryptoHomeDuxo.cryptoHomeStore.streamCryptoHomeDiscover(instrumentDisplayTypeComponent2, bool.booleanValue()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableSwitchMap, this.discoverRelay, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeDuxo.onStart$lambda$5(this.f$0, (CryptoHomeDiscover) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentDisplayTypeBehaviorRelay, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeDuxo.onStart$lambda$6(this.f$0, (InstrumentDisplayType) obj);
            }
        });
        if (this.appType == AppType.RHC) {
            applyMutation(new C1304312(null));
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C1304413(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(CryptoHomeDuxo cryptoHomeDuxo, CryptoHomeState cryptoHomeState) {
        cryptoHomeDuxo.applyMutation(new CryptoHomeDuxo$onStart$2$1(cryptoHomeState, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CryptoHomeDuxo cryptoHomeDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t) || (t instanceof Timeout4)) {
            cryptoHomeDuxo.applyMutation(new CryptoHomeDuxo$onStart$3$1(t, null));
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(CryptoHomeDuxo cryptoHomeDuxo, boolean z) {
        cryptoHomeDuxo.applyMutation(new CryptoHomeDuxo$onStart$4$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(CryptoHomeDuxo cryptoHomeDuxo, ImmutableList immutableList) {
        cryptoHomeDuxo.applyMutation(new CryptoHomeDuxo$onStart$7$1(immutableList, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(CryptoHomeDuxo cryptoHomeDuxo, CryptoHomeDiscover cryptoHomeDiscover) {
        cryptoHomeDuxo.applyMutation(new CryptoHomeDuxo$onStart$10$1(cryptoHomeDiscover, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(CryptoHomeDuxo cryptoHomeDuxo, InstrumentDisplayType instrumentDisplayType) {
        cryptoHomeDuxo.applyMutation(new CryptoHomeDuxo$onStart$11$1(instrumentDisplayType, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$12", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$12 */
    static final class C1304312 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C1304312(Continuation<? super C1304312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1304312 c1304312 = new C1304312(continuation);
            c1304312.L$0 = obj;
            return c1304312;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
            return ((C1304312) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoHomeDataState.copy$default((CryptoHomeDataState) this.L$0, null, null, null, null, null, null, null, true, null, false, null, false, false, 8063, null);
        }
    }

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13", m3645f = "CryptoHomeDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13 */
    static final class C1304413 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C1304413(Continuation<? super C1304413> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeDuxo.this.new C1304413(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1304413) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flowCombine(CryptoHomeDuxo.this.topCoinsFlow, Context7.buffer$default(RxConvert.asFlow(CryptoHomeDuxo.this.instrumentDisplayTypeBehaviorRelay), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null)));
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Tuples2<? extends Boolean, ? extends InstrumentDisplayType>>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends Boolean, ? extends InstrumentDisplayType>> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChanged.collect(new C130342(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C130342<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoHomeDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C130342.this.emit(null, this);
                            }
                        }

                        public C130342(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((Boolean) ((Tuples2) obj).component1()).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, new CryptoHomeDuxo$onStart$13$invokeSuspend$$inlined$flatMapLatest$1(null, CryptoHomeDuxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CryptoHomeDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "kotlin.jvm.PlatformType", "showTopCoins", "displayType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Boolean, InstrumentDisplayType, Continuation<? super Tuples2<? extends Boolean, ? extends InstrumentDisplayType>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, InstrumentDisplayType instrumentDisplayType, Continuation<? super Tuples2<? extends Boolean, ? extends InstrumentDisplayType>> continuation) {
                return invoke(bool.booleanValue(), instrumentDisplayType, (Continuation<? super Tuples2<Boolean, ? extends InstrumentDisplayType>>) continuation);
            }

            public final Object invoke(boolean z, InstrumentDisplayType instrumentDisplayType, Continuation<? super Tuples2<Boolean, ? extends InstrumentDisplayType>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z;
                anonymousClass1.L$0 = instrumentDisplayType;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                return Tuples4.m3642to(boxing.boxBoolean(z), (InstrumentDisplayType) this.L$0);
            }
        }

        /* compiled from: CryptoHomeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$4", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CryptoTopCrypto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoHomeDuxo cryptoHomeDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoTopCrypto cryptoTopCrypto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(cryptoTopCrypto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$4$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$13$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
                final /* synthetic */ CryptoTopCrypto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoTopCrypto cryptoTopCrypto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptoTopCrypto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeDataState.copy$default((CryptoHomeDataState) this.L$0, null, null, null, null, this.$it, null, null, false, null, false, null, false, false, 8175, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((CryptoTopCrypto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Flow<CryptoHomeState> getHomeState$feature_crypto_tab_externalDebug() {
        if (this.appType == AppType.RHC) {
            Flow<CryptoHomeState> flowPollRegionalCryptoHome = this.cryptoHomeStore.pollRegionalCryptoHome();
            Duration.Companion companion = Duration.INSTANCE;
            return FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.m28821timeoutHG0u8IE(flowPollRegionalCryptoHome, Duration3.toDuration(15, DurationUnitJvm.SECONDS))), new CryptoHomeDuxo$getHomeState$1(this, null));
        }
        return this.cryptoHomeStore.streamCryptoHome((CryptoAccountSwitcherLocation.WithoutCurrencyPair) CryptoAccountSwitcherLocation.Home.INSTANCE, true);
    }

    public final void streamAccount$feature_crypto_tab_externalDebug() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new CryptoHomeDuxo$streamAccount$1(this, null));
    }

    public final void toggleTradableDiscoverList(boolean tradable) {
        this.tradableRelay.accept(Boolean.valueOf(tradable));
    }

    public final void changeInstrumentDisplayType(InstrumentDisplayType instrumentDisplayType) {
        Intrinsics.checkNotNullParameter(instrumentDisplayType, "instrumentDisplayType");
        this.instrumentDisplayTypeBehaviorRelay.accept(instrumentDisplayType);
    }

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo$Companion;", "", "<init>", "()V", "INITIAL_INSTRUMENT_DISPLAY_TYPE", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "getINITIAL_INSTRUMENT_DISPLAY_TYPE$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getINITIAL_INSTRUMENT_DISPLAY_TYPE$feature_crypto_tab_externalDebug */
        public final InstrumentDisplayType m1900x78ad5f4f() {
            return CryptoHomeDuxo.INITIAL_INSTRUMENT_DISPLAY_TYPE;
        }
    }
}
