package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs2;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs3;
import com.robinhood.android.lib.p166fx.provider.McwDisplayCurrenciesProvider;
import com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p325fx.p326db.McwDisplayCurrencies;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: DisplayCurrencySwitcherDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B?\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;", "mcwDisplayCurrenciesProvider", "Lcom/robinhood/android/lib/fx/provider/McwDisplayCurrenciesProvider;", "mcwFxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "hasSeenFxSwitcherFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "homeDisplayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "accountTabDisplayCurrencySelectionPref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/fx/provider/McwDisplayCurrenciesProvider;Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "initialize", "", "accountNumber", "", "location", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherLocation;", "tryOpenFxDropdown", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSelectedDisplayCurrency", "currency", "Lcom/robinhood/rosetta/common/Currency;", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DisplayCurrencySwitcherDuxo extends BaseDuxo5<DisplayCurrencySwitcherViewState, DisplayCurrencySwitcherEvent> {
    public static final int $stable = 8;
    private final IntPreference accountTabDisplayCurrencySelectionPref;
    private final BooleanPreference hasSeenFxSwitcherFtuxPref;
    private final IntPreference homeDisplayCurrencySelectionPref;
    private final McwDisplayCurrenciesProvider mcwDisplayCurrenciesProvider;
    private final McwFxRatesProvider mcwFxRatesProvider;

    /* compiled from: DisplayCurrencySwitcherDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {101, 109, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "tryOpenFxDropdown")
    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$tryOpenFxDropdown$1 */
    static final class C217251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C217251(Continuation<? super C217251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DisplayCurrencySwitcherDuxo.this.tryOpenFxDropdown(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayCurrencySwitcherDuxo(McwDisplayCurrenciesProvider mcwDisplayCurrenciesProvider, McwFxRatesProvider mcwFxRatesProvider, @DisplayCurrencySelectionPrefs2 BooleanPreference hasSeenFxSwitcherFtuxPref, @DisplayCurrencySelectionPrefs3 IntPreference homeDisplayCurrencySelectionPref, @DisplayCurrencySelectionPrefs IntPreference accountTabDisplayCurrencySelectionPref, DuxoBundle duxoBundle) {
        super(new DisplayCurrencySwitcherViewState(null, null, null, null, false, 31, null), duxoBundle);
        Intrinsics.checkNotNullParameter(mcwDisplayCurrenciesProvider, "mcwDisplayCurrenciesProvider");
        Intrinsics.checkNotNullParameter(mcwFxRatesProvider, "mcwFxRatesProvider");
        Intrinsics.checkNotNullParameter(hasSeenFxSwitcherFtuxPref, "hasSeenFxSwitcherFtuxPref");
        Intrinsics.checkNotNullParameter(homeDisplayCurrencySelectionPref, "homeDisplayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(accountTabDisplayCurrencySelectionPref, "accountTabDisplayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.mcwDisplayCurrenciesProvider = mcwDisplayCurrenciesProvider;
        this.mcwFxRatesProvider = mcwFxRatesProvider;
        this.hasSeenFxSwitcherFtuxPref = hasSeenFxSwitcherFtuxPref;
        this.homeDisplayCurrencySelectionPref = homeDisplayCurrencySelectionPref;
        this.accountTabDisplayCurrencySelectionPref = accountTabDisplayCurrencySelectionPref;
    }

    /* compiled from: DisplayCurrencySwitcherDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$1 */
    static final class C217211 extends ContinuationImpl7 implements Function2<DisplayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState>, Object> {
        final /* synthetic */ DisplayCurrencySwitcherLocation $location;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: DisplayCurrencySwitcherDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DisplayCurrencySwitcherLocation.values().length];
                try {
                    iArr[DisplayCurrencySwitcherLocation.ACCOUNT_TAB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DisplayCurrencySwitcherLocation.HOME_TAB.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DisplayCurrencySwitcherLocation.BUYING_POWER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C217211(DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation, Continuation<? super C217211> continuation) {
            super(2, continuation);
            this.$location = displayCurrencySwitcherLocation;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217211 c217211 = DisplayCurrencySwitcherDuxo.this.new C217211(this.$location, continuation);
            c217211.L$0 = obj;
            return c217211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState> continuation) {
            return ((C217211) create(displayCurrencySwitcherViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Currency rosettaCurrency;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState = (DisplayCurrencySwitcherViewState) this.L$0;
                boolean z = DisplayCurrencySwitcherDuxo.this.hasSeenFxSwitcherFtuxPref.get();
                int i = WhenMappings.$EnumSwitchMapping$0[this.$location.ordinal()];
                if (i == 1) {
                    rosettaCurrency = DisplayCurrencyExtensions.toRosettaCurrency(DisplayCurrencySwitcherDuxo.this.accountTabDisplayCurrencySelectionPref);
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rosettaCurrency = DisplayCurrencyExtensions.toRosettaCurrency(DisplayCurrencySwitcherDuxo.this.homeDisplayCurrencySelectionPref);
                }
                return DisplayCurrencySwitcherViewState.copy$default(displayCurrencySwitcherViewState, null, null, rosettaCurrency, this.$location, z, 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void initialize(String accountNumber, DisplayCurrencySwitcherLocation location) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(location, "location");
        applyMutation(new C217211(location, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C217222(accountNumber, location, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C217233(null));
    }

    /* compiled from: DisplayCurrencySwitcherDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2 */
    static final class C217222 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ DisplayCurrencySwitcherLocation $location;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C217222(String str, DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation, Continuation<? super C217222> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$location = displayCurrencySwitcherLocation;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217222 c217222 = DisplayCurrencySwitcherDuxo.this.new C217222(this.$accountNumber, this.$location, continuation);
            c217222.L$0 = obj;
            return c217222;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C217222) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(DisplayCurrencySwitcherDuxo.this, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$location, DisplayCurrencySwitcherDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: DisplayCurrencySwitcherDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ DisplayCurrencySwitcherDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = displayCurrencySwitcherDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<McwDisplayCurrencies> flowFetchMcwDisplayCurrencies = this.this$0.mcwDisplayCurrenciesProvider.fetchMcwDisplayCurrencies(this.$accountNumber);
                    C502851 c502851 = new C502851(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFetchMcwDisplayCurrencies, c502851, this) == coroutine_suspended) {
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

            /* compiled from: DisplayCurrencySwitcherDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "displayCurrencies", "Lcom/robinhood/models/fx/db/McwDisplayCurrencies;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$1$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502851 extends ContinuationImpl7 implements Function2<McwDisplayCurrencies, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DisplayCurrencySwitcherDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502851(DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, Continuation<? super C502851> continuation) {
                    super(2, continuation);
                    this.this$0 = displayCurrencySwitcherDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502851 c502851 = new C502851(this.this$0, continuation);
                    c502851.L$0 = obj;
                    return c502851;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(McwDisplayCurrencies mcwDisplayCurrencies, Continuation<? super Unit> continuation) {
                    return ((C502851) create(mcwDisplayCurrencies, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DisplayCurrencySwitcherDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$1$1$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C502861 extends ContinuationImpl7 implements Function2<DisplayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState>, Object> {
                    final /* synthetic */ McwDisplayCurrencies $displayCurrencies;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502861(McwDisplayCurrencies mcwDisplayCurrencies, Continuation<? super C502861> continuation) {
                        super(2, continuation);
                        this.$displayCurrencies = mcwDisplayCurrencies;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502861 c502861 = new C502861(this.$displayCurrencies, continuation);
                        c502861.L$0 = obj;
                        return c502861;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState> continuation) {
                        return ((C502861) create(displayCurrencySwitcherViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DisplayCurrencySwitcherViewState.copy$default((DisplayCurrencySwitcherViewState) this.L$0, this.$displayCurrencies, null, null, null, false, 30, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502861((McwDisplayCurrencies) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: DisplayCurrencySwitcherDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ DisplayCurrencySwitcherLocation $location;
            int label;
            final /* synthetic */ DisplayCurrencySwitcherDuxo this$0;

            /* compiled from: DisplayCurrencySwitcherDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DisplayCurrencySwitcherLocation.values().length];
                    try {
                        iArr[DisplayCurrencySwitcherLocation.ACCOUNT_TAB.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DisplayCurrencySwitcherLocation.HOME_TAB.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DisplayCurrencySwitcherLocation.BUYING_POWER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$location = displayCurrencySwitcherLocation;
                this.this$0 = displayCurrencySwitcherDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$location, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                final Flow flowBuffer$default;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = WhenMappings.$EnumSwitchMapping$0[this.$location.ordinal()];
                    if (i2 == 1) {
                        flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountTabDisplayCurrencySelectionPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.homeDisplayCurrencySelectionPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    }
                    Flow<Currency> flow = new Flow<Currency>() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$invokeSuspend$$inlined$map$1$2", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
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
                                    Currency currencyFromValue = Currency.INSTANCE.fromValue(((Number) obj).intValue());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(currencyFromValue, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super Currency> flowCollector, Continuation continuation) {
                            Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    C502872 c502872 = new C502872(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c502872, this) == coroutine_suspended) {
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

            /* compiled from: DisplayCurrencySwitcherDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/rosetta/common/Currency;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$2", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$2, reason: invalid class name and collision with other inner class name */
            static final class C502872 extends ContinuationImpl7 implements Function2<Currency, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DisplayCurrencySwitcherDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502872(DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, Continuation<? super C502872> continuation) {
                    super(2, continuation);
                    this.this$0 = displayCurrencySwitcherDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502872 c502872 = new C502872(this.this$0, continuation);
                    c502872.L$0 = obj;
                    return c502872;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Currency currency, Continuation<? super Unit> continuation) {
                    return ((C502872) create(currency, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DisplayCurrencySwitcherDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$2$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$2$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DisplayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState>, Object> {
                    final /* synthetic */ Currency $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Currency currency, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = currency;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState> continuation) {
                        return ((AnonymousClass1) create(displayCurrencySwitcherViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DisplayCurrencySwitcherViewState.copy$default((DisplayCurrencySwitcherViewState) this.L$0, null, null, this.$it, null, false, 27, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Currency) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: DisplayCurrencySwitcherDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3 */
    static final class C217233 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C217233(Continuation<? super C217233> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217233 c217233 = DisplayCurrencySwitcherDuxo.this.new C217233(continuation);
            c217233.L$0 = obj;
            return c217233;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C217233) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DisplayCurrencySwitcherDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DisplayCurrencySwitcherDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = displayCurrencySwitcherDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<DisplayCurrencySwitcherViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(new Flow<List<? extends String>>() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1$invokeSuspend$$inlined$map$1$2", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
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
                                    List<String> currencySymbols = ((DisplayCurrencySwitcherViewState) obj).getCurrencySymbols();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(currencySymbols, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C21719x9343948a(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: DisplayCurrencySwitcherDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "fxRates", "", "Lcom/robinhood/models/fx/db/McwFxRate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1$3", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends McwFxRate>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DisplayCurrencySwitcherDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = displayCurrencySwitcherDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends McwFxRate> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<McwFxRate>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<McwFxRate> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DisplayCurrencySwitcherDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1$3$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$initialize$3$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C502881 extends ContinuationImpl7 implements Function2<DisplayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState>, Object> {
                    final /* synthetic */ List<McwFxRate> $fxRates;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502881(List<McwFxRate> list, Continuation<? super C502881> continuation) {
                        super(2, continuation);
                        this.$fxRates = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502881 c502881 = new C502881(this.$fxRates, continuation);
                        c502881.L$0 = obj;
                        return c502881;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState> continuation) {
                        return ((C502881) create(displayCurrencySwitcherViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DisplayCurrencySwitcherViewState.copy$default((DisplayCurrencySwitcherViewState) this.L$0, null, extensions2.toImmutableList(this.$fxRates), null, null, false, 29, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502881((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(DisplayCurrencySwitcherDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (r12.fetchFxRates(r6, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc A[Catch: Exception -> 0x0039, TRY_ENTER, TryCatch #0 {Exception -> 0x0039, blocks: (B:14:0x0033, B:51:0x010f, B:53:0x0115, B:55:0x011a, B:48:0x00fc, B:54:0x0118), top: B:63:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010c -> B:15:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryOpenFxDropdown(Continuation<? super Unit> continuation) {
        C217251 c217251;
        DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState;
        Iterator<String> it;
        DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState2;
        McwFxRate mcwFxRate;
        DisplayCurrencySwitcherEvent displayCurrencySwitcherEvent;
        if (continuation instanceof C217251) {
            c217251 = (C217251) continuation;
            int i = c217251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c217251.label = i - Integer.MIN_VALUE;
            } else {
                c217251 = new C217251(continuation);
            }
        }
        Object objFirst = c217251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c217251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            StateFlow<DisplayCurrencySwitcherViewState> stateFlow = getStateFlow();
            DisplayCurrencySwitcherDuxo2 displayCurrencySwitcherDuxo2 = new DisplayCurrencySwitcherDuxo2(null);
            c217251.label = 1;
            objFirst = FlowKt.first(stateFlow, displayCurrencySwitcherDuxo2, c217251);
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objFirst);
        } else if (i2 == 2) {
            it = (Iterator) c217251.L$1;
            displayCurrencySwitcherViewState2 = (DisplayCurrencySwitcherViewState) c217251.L$0;
            ResultKt.throwOnFailure(objFirst);
            mcwFxRate = (McwFxRate) objFirst;
            if (mcwFxRate == null) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c217251.L$1;
            displayCurrencySwitcherViewState2 = (DisplayCurrencySwitcherViewState) c217251.L$0;
            try {
                ResultKt.throwOnFailure(objFirst);
                displayCurrencySwitcherViewState = displayCurrencySwitcherViewState2;
                if (displayCurrencySwitcherViewState.getCanShowFxSwitcherDropdown()) {
                    displayCurrencySwitcherEvent = DisplayCurrencySwitcherEvent.ExpandFxRates.INSTANCE;
                } else {
                    displayCurrencySwitcherEvent = DisplayCurrencySwitcherEvent.ShowFtux.INSTANCE;
                }
                submit(displayCurrencySwitcherEvent);
                if (it.hasNext()) {
                    String next = it.next();
                    McwFxRatesProvider mcwFxRatesProvider = this.mcwFxRatesProvider;
                    c217251.L$0 = displayCurrencySwitcherViewState;
                    c217251.L$1 = it;
                    c217251.label = 2;
                    Object localFxRate = mcwFxRatesProvider.getLocalFxRate(next, c217251);
                    if (localFxRate != coroutine_suspended) {
                        displayCurrencySwitcherViewState2 = displayCurrencySwitcherViewState;
                        objFirst = localFxRate;
                        mcwFxRate = (McwFxRate) objFirst;
                        if (mcwFxRate == null) {
                            if (Duration.between(mcwFxRate.getLastUpdated(), Instant.ofEpochMilli(System.currentTimeMillis())).toMinutes() > 15) {
                                submit(new DisplayCurrencySwitcherEvent.ShowStaleFxRatesDialog(mcwFxRate.getDisplaySymbol() + PlaceholderUtils.XXShortPlaceholderText + mcwFxRate.getMarkPrice(), mcwFxRate.getLastUpdated()));
                                return Unit.INSTANCE;
                            }
                            if (displayCurrencySwitcherViewState2.getCanShowFxSwitcherDropdown()) {
                                submit(DisplayCurrencySwitcherEvent.ExpandFxRates.INSTANCE);
                                displayCurrencySwitcherViewState = displayCurrencySwitcherViewState2;
                            } else {
                                submit(DisplayCurrencySwitcherEvent.ShowFtux.INSTANCE);
                                displayCurrencySwitcherViewState = displayCurrencySwitcherViewState2;
                            }
                            if (it.hasNext()) {
                                return Unit.INSTANCE;
                            }
                        } else {
                            McwFxRatesProvider mcwFxRatesProvider2 = this.mcwFxRatesProvider;
                            List<String> currencySymbols = displayCurrencySwitcherViewState2.getCurrencySymbols();
                            c217251.L$0 = displayCurrencySwitcherViewState2;
                            c217251.L$1 = it;
                            c217251.label = 3;
                        }
                    }
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
                submit(DisplayCurrencySwitcherEvent.ShowNoFxRatesDialog.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        displayCurrencySwitcherViewState = (DisplayCurrencySwitcherViewState) objFirst;
        List<String> currencySymbols2 = displayCurrencySwitcherViewState.getCurrencySymbols();
        List<String> list = currencySymbols2;
        if (list == null || list.isEmpty()) {
            submit(DisplayCurrencySwitcherEvent.ShowNoFxRatesDialog.INSTANCE);
            return Unit.INSTANCE;
        }
        it = currencySymbols2.iterator();
        if (it.hasNext()) {
        }
    }

    /* compiled from: DisplayCurrencySwitcherDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$setSelectedDisplayCurrency$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$setSelectedDisplayCurrency$1 */
    static final class C217241 extends ContinuationImpl7 implements Function2<DisplayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState>, Object> {
        final /* synthetic */ Currency $currency;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: DisplayCurrencySwitcherDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$setSelectedDisplayCurrency$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DisplayCurrencySwitcherLocation.values().length];
                try {
                    iArr[DisplayCurrencySwitcherLocation.ACCOUNT_TAB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DisplayCurrencySwitcherLocation.HOME_TAB.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DisplayCurrencySwitcherLocation.BUYING_POWER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C217241(Currency currency, Continuation<? super C217241> continuation) {
            super(2, continuation);
            this.$currency = currency;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217241 c217241 = DisplayCurrencySwitcherDuxo.this.new C217241(this.$currency, continuation);
            c217241.L$0 = obj;
            return c217241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState, Continuation<? super DisplayCurrencySwitcherViewState> continuation) {
            return ((C217241) create(displayCurrencySwitcherViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState = (DisplayCurrencySwitcherViewState) this.L$0;
            DisplayCurrencySwitcherLocation location = displayCurrencySwitcherViewState.getLocation();
            int i = location == null ? -1 : WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
            if (i == -1) {
                DisplayCurrencySwitcherDuxo.this.homeDisplayCurrencySelectionPref.set(this.$currency.getValue());
            } else if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                DisplayCurrencySwitcherDuxo.this.homeDisplayCurrencySelectionPref.set(this.$currency.getValue());
            } else {
                DisplayCurrencySwitcherDuxo.this.accountTabDisplayCurrencySelectionPref.set(this.$currency.getValue());
            }
            return DisplayCurrencySwitcherViewState.copy$default(displayCurrencySwitcherViewState, null, null, this.$currency, null, false, 27, null);
        }
    }

    public final void setSelectedDisplayCurrency(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        applyMutation(new C217241(currency, null));
    }
}
