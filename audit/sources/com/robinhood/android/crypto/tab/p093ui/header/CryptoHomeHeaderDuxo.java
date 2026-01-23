package com.robinhood.android.crypto.tab.p093ui.header;

import android.content.res.Resources;
import com.robinhood.android.dashboardpill.DashboardPillData;
import com.robinhood.android.dashboardpill.DashboardPillData2;
import com.robinhood.android.dashboardpill.DashboardPillManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoRewardsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import contracts.crypto.rewards.proto.p430v1.GetHomeRewardsButtonResponseDto;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: CryptoHomeHeaderDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bg\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDataState;", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderViewState;", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderStateProvider;", "stateProvider", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Ldagger/Lazy;", "Lcom/robinhood/librobinhood/data/store/CryptoRewardsStore;", "cryptoRewardsStore", "Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "dashboardPillManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderStateProvider;Landroid/content/res/Resources;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Ldagger/Lazy;Lcom/robinhood/android/dashboardpill/DashboardPillManager;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "onResume", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/shared/app/type/AppType;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Ldagger/Lazy;", "Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "getDashboardPillManager", "()Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeHeaderDuxo extends BaseDuxo<CryptoHomeHeaderDataState, CryptoHomeHeaderViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AppType appType;
    private final Clock clock;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final Lazy<CryptoRewardsStore> cryptoRewardsStore;
    private final DashboardPillManager dashboardPillManager;
    private final PerformanceChartStore performanceChartStore;

    /* compiled from: CryptoHomeHeaderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final DashboardPillManager getDashboardPillManager() {
        return this.dashboardPillManager;
    }

    public final Clock getClock() {
        return this.clock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHomeHeaderDuxo(CryptoHomeHeaderDuxo7 stateProvider, Resources resources, AccountProvider accountProvider, AppType appType, PerformanceChartStore performanceChartStore, CryptoAccountStore cryptoAccountStore, CryptoExperimentsStore cryptoExperimentsStore, Lazy<CryptoRewardsStore> cryptoRewardsStore, DashboardPillManager dashboardPillManager, Clock clock, DuxoBundle duxoBundle) {
        super(new CryptoHomeHeaderDataState(resources, null, null, appType == AppType.RHC, false, null, null, 118, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoRewardsStore, "cryptoRewardsStore");
        Intrinsics.checkNotNullParameter(dashboardPillManager, "dashboardPillManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.appType = appType;
        this.performanceChartStore = performanceChartStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoRewardsStore = cryptoRewardsStore;
        this.dashboardPillManager = dashboardPillManager;
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (this.appType == AppType.RHC) {
            getLifecycleScope().launchWhenStarted(new C131501(null));
        }
    }

    /* compiled from: CryptoHomeHeaderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onCreate$1", m3645f = "CryptoHomeHeaderDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onCreate$1 */
    static final class C131501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C131501(Continuation<? super C131501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeHeaderDuxo.this.new C131501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoHomeHeaderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onCreate$1$1", m3645f = "CryptoHomeHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GetHomeRewardsButtonResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeHeaderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeHeaderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(getHomeRewardsButtonResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeHeaderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onCreate$1$1$1", m3645f = "CryptoHomeHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497551 extends ContinuationImpl7 implements Function2<CryptoHomeHeaderDataState, Continuation<? super CryptoHomeHeaderDataState>, Object> {
                final /* synthetic */ GetHomeRewardsButtonResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497551(GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto, Continuation<? super C497551> continuation) {
                    super(2, continuation);
                    this.$it = getHomeRewardsButtonResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497551 c497551 = new C497551(this.$it, continuation);
                    c497551.L$0 = obj;
                    return c497551;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeHeaderDataState cryptoHomeHeaderDataState, Continuation<? super CryptoHomeHeaderDataState> continuation) {
                    return ((C497551) create(cryptoHomeHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeHeaderDataState.copy$default((CryptoHomeHeaderDataState) this.L$0, null, null, null, false, false, this.$it, null, 95, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497551((GetHomeRewardsButtonResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<GetHomeRewardsButtonResponseDto> flowStreamHomeRewardButton = ((CryptoRewardsStore) CryptoHomeHeaderDuxo.this.cryptoRewardsStore.get()).streamHomeRewardButton();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeHeaderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamHomeRewardButton, anonymousClass1, this) == coroutine_suspended) {
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
    public void onResume() {
        Observable map;
        super.onResume();
        this.cryptoAccountStore.refresh(false);
        Observable<T> observableAsObservable = asObservable(FlowKt.filterNotNull(this.cryptoAccountStore.streamAccount()));
        LifecycleHost.DefaultImpls.bind$default(this, observableAsObservable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeHeaderDuxo.onResume$lambda$0(this.f$0, (CryptoAccount) obj);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            map = observableAsObservable.map(new Function() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$accountNumberStream$1
                @Override // io.reactivex.functions.Function
                public final String apply(CryptoAccount it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getAccountNumber();
                }
            });
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("NCW isn't supported in crypto home header duxo");
                }
                throw new NoWhenBranchMatchedException();
            }
            map = this.accountProvider.streamIndividualAccountNumberOptional().map(new Function() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$accountNumberStream$2
                @Override // io.reactivex.functions.Function
                public final String apply(Optional<String> optional) {
                    Intrinsics.checkNotNullParameter(optional, "<destruct>");
                    String strComponent1 = optional.component1();
                    return strComponent1 == null ? "0" : strComponent1;
                }
            });
        }
        Observable observableSwitchMap = map.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Direction>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo = CryptoHomeHeaderDuxo.this;
                final Flow flowStreamDirection$default = PerformanceChartStore.streamDirection$default(cryptoHomeHeaderDuxo.performanceChartStore, accountNumber, PerformanceChartType.CRYPTO, null, 4, null);
                return cryptoHomeHeaderDuxo.asObservable(FlowKt.filterNotNull(new Flow<Optional<? extends Direction>>() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$2$apply$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$2$apply$$inlined$map$1$2 */
                    public static final class C131492<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$2$apply$$inlined$map$1$2", m3645f = "CryptoHomeHeaderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$2$apply$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C131492.this.emit(null, this);
                            }
                        }

                        public C131492(FlowCollector flowCollector) {
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
                                Optional optionalAsOptional = Optional3.asOptional((Direction) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Optional<? extends Direction>> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamDirection$default.collect(new C131492(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeHeaderDuxo.onResume$lambda$1(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.cryptoExperimentsStore.streamCryptoSduiChartsExperiment()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeHeaderDuxo.onResume$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C131525(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo, CryptoAccount cryptoAccount) {
        Intrinsics.checkNotNullParameter(cryptoAccount, "cryptoAccount");
        cryptoHomeHeaderDuxo.applyMutation(new CryptoHomeHeaderDuxo2(cryptoAccount, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo, Optional optional) {
        cryptoHomeHeaderDuxo.applyMutation(new CryptoHomeHeaderDuxo3((Direction) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo, boolean z) {
        cryptoHomeHeaderDuxo.applyMutation(new CryptoHomeHeaderDuxo4(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoHomeHeaderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$5", m3645f = "CryptoHomeHeaderDuxo.kt", m3646l = {123}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$5 */
    static final class C131525 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C131525(Continuation<? super C131525> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeHeaderDuxo.this.new C131525(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131525) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            DashboardPillData2 dashboardPillData2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DashboardPillManager dashboardPillManager = CryptoHomeHeaderDuxo.this.getDashboardPillManager();
                if (CryptoHomeHeaderDuxo.this.appType == AppType.TRADER) {
                    dashboardPillData2 = DashboardPillData2.CRYPTO_HOME_TAB;
                } else {
                    dashboardPillData2 = DashboardPillData2.RHC_HOME_TAB;
                }
                Flow<DashboardPillData> flowStreamPillDataOrNull = dashboardPillManager.streamPillDataOrNull(dashboardPillData2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeHeaderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamPillDataOrNull, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeHeaderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/dashboardpill/DashboardPillData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$5$1", m3645f = "CryptoHomeHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardPillData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeHeaderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeHeaderDuxo cryptoHomeHeaderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeHeaderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DashboardPillData dashboardPillData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(dashboardPillData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeHeaderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$5$1$1", m3645f = "CryptoHomeHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497561 extends ContinuationImpl7 implements Function2<CryptoHomeHeaderDataState, Continuation<? super CryptoHomeHeaderDataState>, Object> {
                final /* synthetic */ DashboardPillData $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497561(DashboardPillData dashboardPillData, Continuation<? super C497561> continuation) {
                    super(2, continuation);
                    this.$it = dashboardPillData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497561 c497561 = new C497561(this.$it, continuation);
                    c497561.L$0 = obj;
                    return c497561;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeHeaderDataState cryptoHomeHeaderDataState, Continuation<? super CryptoHomeHeaderDataState> continuation) {
                    return ((C497561) create(cryptoHomeHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeHeaderDataState.copy$default((CryptoHomeHeaderDataState) this.L$0, null, null, null, false, false, null, this.$it, 63, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497561((DashboardPillData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
