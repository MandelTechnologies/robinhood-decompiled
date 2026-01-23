package com.robinhood.android.optionschain;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.contracts.CarContract;
import com.robinhood.android.common.contracts.CarIntentKey;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.lists.options.OptionsListsQuickAddFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.optionchain.OptionChainExpirationPageCallbacks;
import com.robinhood.android.options.contracts.InternalOptionChainFragmentKey;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.OptionChainActivityEvent;
import com.robinhood.android.optionschain.databinding.ActivityOptionChainBinding;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionChainActivity.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001BB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0014J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020\u001dH\u0080@¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0000¢\u0006\u0002\b)J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020+0'H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020+H\u0000¢\u0006\u0002\b.J\r\u0010/\u001a\u00020\u001dH\u0000¢\u0006\u0002\b0J\u0018\u00101\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u000103H\u0082@¢\u0006\u0002\u00104J\u001a\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u000103H\u0002J\u0010\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020:H\u0016J\n\u0010;\u001a\u0004\u0018\u00010:H\u0002J\t\u0010<\u001a\u00020+H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/optionchain/OptionChainExpirationPageCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/optionschain/OptionChainActivityDuxo;", "getDuxo", "()Lcom/robinhood/android/optionschain/OptionChainActivityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/optionschain/databinding/ActivityOptionChainBinding;", "getBinding", "()Lcom/robinhood/android/optionschain/databinding/ActivityOptionChainBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onboardingBackPressListener", "Lcom/robinhood/android/common/ui/BaseActivity$OnBackPressedListener;", "carLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/common/contracts/CarIntentKey;", "composeOverlay", "Landroidx/compose/ui/platform/ComposeView;", "getComposeOverlay", "()Landroidx/compose/ui/platform/ComposeView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupQuickAddFragment", "setupSearchPopupFragment", "updateOptionChainDisplayMode", "updateOptionChainDisplayMode$feature_options_chain_externalDebug", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "statusBarTopPaddingFlow", "Lkotlinx/coroutines/flow/Flow;", "", "statusBarTopPaddingFlow$feature_options_chain_externalDebug", "chainNuxSearchDismissedFlow", "", "chainNuxSearchDismissedFlow$feature_options_chain_externalDebug", "getSideBySideChainSettingsTapped", "getSideBySideChainSettingsTapped$feature_options_chain_externalDebug", "setSideBySideChainSettingsTapped", "setSideBySideChainSettingsTapped$feature_options_chain_externalDebug", "setupChainFragment", "newChainDisplayMode", "Lcom/robinhood/models/ui/OptionChainDisplayMode;", "(Lcom/robinhood/models/ui/OptionChainDisplayMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshGlobalPadding", "isOnboardingSearchVisible", "currentChainDisplayMode", "setSelectedExpirationPage", "state", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getSelectedExpirationPage", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainActivity extends BaseActivity implements OptionChainExpirationPageCallbacks, RegionGated {
    public static final String QUICK_ADD_TAG = "quickAddFragment";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<CarIntentKey>> carLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private BaseActivity.OnBackPressedListener onboardingBackPressListener;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionChainActivity.class, "binding", "getBinding()Lcom/robinhood/android/optionschain/databinding/ActivityOptionChainBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Screen quickAddAnalyticsScreen = new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null);

    /* compiled from: OptionChainActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainDisplayMode.values().length];
            try {
                iArr[OptionChainDisplayMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainDisplayMode.SIDE_BY_SIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionChainActivity() {
        super(C24135R.layout.activity_option_chain);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, OptionChainActivityDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, OptionChainActivity2.INSTANCE);
        this.carLauncher = registerForActivityResult(new CarContract(new Function0() { // from class: com.robinhood.android.optionschain.OptionChainActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.optionschain.OptionChainActivity$carLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(CarContract.Result result) {
                if (result instanceof CarContract.Result.Completed) {
                    if (((CarContract.Result.Completed) result).getPassed()) {
                        return;
                    }
                    this.this$0.finish();
                } else if (result instanceof CarContract.Result.Error) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, ((CarContract.Result.Error) result).getError(), false, null, 6, null);
                } else {
                    if (!Intrinsics.areEqual(result, CarContract.Result.Cancelled.INSTANCE) && result != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionChainActivityDuxo getDuxo() {
        return (OptionChainActivityDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityOptionChainBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityOptionChainBinding) value;
    }

    public final ComposeView getComposeOverlay() {
        ComposeView composeOverlayView = getBinding().composeOverlayView;
        Intrinsics.checkNotNullExpressionValue(composeOverlayView, "composeOverlayView");
        return composeOverlayView;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        super.onCreate(savedInstanceState);
        ViewCompat.setOnApplyWindowInsetsListener(getBinding().overlayContainer, new OnApplyWindowInsetsListener() { // from class: com.robinhood.android.optionschain.OptionChainActivity.onCreate.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat windowInsetsCompat) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
                OptionChainActivityDuxo duxo = OptionChainActivity.this.getDuxo();
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
                duxo.setWindowInsets(insets);
                return WindowInsetsCompat.CONSUMED;
            }
        });
        if (savedInstanceState == null) {
            setupQuickAddFragment();
            setupSearchPopupFragment();
        }
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C240042(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C240053(null));
        BaseActivity.collectDuxoState$default(this, null, new C240064(null), 1, null);
    }

    /* compiled from: OptionChainActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity$onCreate$2", m3645f = "OptionChainActivity.kt", m3646l = {94}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$onCreate$2 */
    static final class C240042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240042(Continuation<? super C240042> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainActivity.this.new C240042(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionChainActivity optionChainActivity = OptionChainActivity.this;
                this.label = 1;
                if (optionChainActivity.updateOptionChainDisplayMode$feature_options_chain_externalDebug(this) == coroutine_suspended) {
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

    /* compiled from: OptionChainActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity$onCreate$3", m3645f = "OptionChainActivity.kt", m3646l = {101}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$onCreate$3 */
    static final class C240053 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240053(Continuation<? super C240053> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainActivity.this.new C240053(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240053) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionChainActivityViewState> stateFlow = OptionChainActivity.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends Boolean, ? extends OptionChainDisplayMode>>() { // from class: com.robinhood.android.optionschain.OptionChainActivity$onCreate$3$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$onCreate$3$invokeSuspend$$inlined$map$1$2 */
                    public static final class C240012<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity$onCreate$3$invokeSuspend$$inlined$map$1$2", m3645f = "OptionChainActivity.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$onCreate$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C240012.this.emit(null, this);
                            }
                        }

                        public C240012(FlowCollector flowCollector) {
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
                                OptionChainActivityViewState optionChainActivityViewState = (OptionChainActivityViewState) obj;
                                Tuples2 tuples2M3642to = Tuples4.m3642to(boxing.boxBoolean(optionChainActivityViewState.isOnboardingSearchSelectorVisible()), optionChainActivityViewState.getCurrentChainDisplayMode());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super Tuples2<? extends Boolean, ? extends OptionChainDisplayMode>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C240012(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionChainActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionChainActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/ui/OptionChainDisplayMode;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity$onCreate$3$2", m3645f = "OptionChainActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends OptionChainDisplayMode>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionChainActivity optionChainActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionChainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends OptionChainDisplayMode> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Boolean, ? extends OptionChainDisplayMode>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Boolean, ? extends OptionChainDisplayMode> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
                    OptionChainDisplayMode optionChainDisplayMode = (OptionChainDisplayMode) tuples2.component2();
                    CoordinatorLayout onboardingLayer = this.this$0.getBinding().onboardingLayer;
                    Intrinsics.checkNotNullExpressionValue(onboardingLayer, "onboardingLayer");
                    onboardingLayer.setVisibility(zBooleanValue ? 0 : 8);
                    this.this$0.refreshGlobalPadding(zBooleanValue, optionChainDisplayMode);
                    Fragment currentFragment = this.this$0.getCurrentFragment(C24135R.id.fragment_container);
                    OptionChainFragment optionChainFragment = currentFragment instanceof OptionChainFragment ? (OptionChainFragment) currentFragment : null;
                    if (optionChainFragment != null) {
                        optionChainFragment.setupToolbar(zBooleanValue);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionChainActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity$onCreate$4", m3645f = "OptionChainActivity.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$onCreate$4 */
    static final class C240064 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240064(Continuation<? super C240064> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainActivity.this.new C240064(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240064) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(OptionChainActivity.this.getDuxo().getEventFlow());
                final OptionChainActivity optionChainActivity = OptionChainActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionschain.OptionChainActivity.onCreate.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<OptionChainActivityEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<OptionChainActivityEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<OptionChainActivityEvent> eventConsumerInvoke;
                        final OptionChainActivity optionChainActivity2 = optionChainActivity;
                        if ((event.getData() instanceof OptionChainActivityEvent.ShowCar) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.optionschain.OptionChainActivity$onCreate$4$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m17079invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17079invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NavigationActivityResultContract3.launch$default(optionChainActivity2.carLauncher, new CarIntentKey(((OptionChainIntentKey) OptionChainActivity.INSTANCE.getExtras((Activity) optionChainActivity2)).getInitialAccountNumber()), null, false, 6, null);
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.onboardingBackPressListener = null;
    }

    private final void setupQuickAddFragment() {
        getSupportFragmentManager().beginTransaction().add((OptionsListsQuickAddFragment) OptionsListsQuickAddFragment.INSTANCE.newInstance((Parcelable) new OptionsListsQuickAddFragment.Args(quickAddAnalyticsScreen)), QUICK_ADD_TAG).commit();
    }

    private final void setupSearchPopupFragment() {
        SearchSelectorLaunchMode.Options searchSelectorLaunchMode = getDuxo().getStateFlow().getValue().getSearchSelectorLaunchMode();
        if (searchSelectorLaunchMode != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C240081(searchSelectorLaunchMode, null), 3, null);
        }
    }

    /* compiled from: OptionChainActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity$setupSearchPopupFragment$1", m3645f = "OptionChainActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 147}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$setupSearchPopupFragment$1 */
    static final class C240081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SearchSelectorLaunchMode.Options $searchSelectorLaunchMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240081(SearchSelectorLaunchMode.Options options, Continuation<? super C240081> continuation) {
            super(2, continuation);
            this.$searchSelectorLaunchMode = options;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainActivity.this.new C240081(this.$searchSelectorLaunchMode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(4000, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((OptionChainIntentKey) OptionChainActivity.INSTANCE.getExtras((Activity) OptionChainActivity.this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIDE_BY_SIDE_CHAIN_DEEPLINK)) {
                    this.label = 1;
                } else {
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(OptionChainActivity.this.getNavigator(), new SearchSelector(this.$searchSelectorLaunchMode, null, null, 6, null), null, 2, null);
            final OptionChainActivity optionChainActivity = OptionChainActivity.this;
            BaseActivity.OnBackPressedListener onBackPressedListener = new BaseActivity.OnBackPressedListener() { // from class: com.robinhood.android.optionschain.OptionChainActivity$setupSearchPopupFragment$1$listener$1
                @Override // com.robinhood.android.common.ui.BaseActivity.OnBackPressedListener
                public boolean onBackPressed() {
                    optionChainActivity.getSupportFragmentManager().beginTransaction().remove(fragmentCreateFragment$default).commit();
                    BaseActivity.OnBackPressedListener onBackPressedListener2 = optionChainActivity.onboardingBackPressListener;
                    if (onBackPressedListener2 != null) {
                        optionChainActivity.removeOnBackPressedListener(onBackPressedListener2);
                    }
                    optionChainActivity.onboardingBackPressListener = null;
                    optionChainActivity.getDuxo().setNuxSearchDismissed();
                    optionChainActivity.getDuxo().setOnboardingSearchSelectorVisible(false);
                    return true;
                }
            };
            OptionChainActivity.this.addOnBackPressedListener(onBackPressedListener);
            OptionChainActivity.this.onboardingBackPressListener = onBackPressedListener;
            OptionChainActivity.this.getDuxo().setOnboardingSearchSelectorVisible(true);
            OptionChainActivity.this.setFragment(C24135R.id.onboarding_overlay, fragmentCreateFragment$default);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (setupChainFragment(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateOptionChainDisplayMode$feature_options_chain_externalDebug(Continuation<? super Unit> continuation) {
        OptionChainActivity5 optionChainActivity5;
        if (continuation instanceof OptionChainActivity5) {
            optionChainActivity5 = (OptionChainActivity5) continuation;
            int i = optionChainActivity5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                optionChainActivity5.label = i - Integer.MIN_VALUE;
            } else {
                optionChainActivity5 = new OptionChainActivity5(this, continuation);
            }
        }
        Object latestAdjustedOptionChainDisplayModeIfChanged = optionChainActivity5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = optionChainActivity5.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(latestAdjustedOptionChainDisplayModeIfChanged);
            OptionChainActivityDuxo duxo = getDuxo();
            optionChainActivity5.label = 1;
            latestAdjustedOptionChainDisplayModeIfChanged = duxo.getLatestAdjustedOptionChainDisplayModeIfChanged(optionChainActivity5);
            if (latestAdjustedOptionChainDisplayModeIfChanged != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latestAdjustedOptionChainDisplayModeIfChanged);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(latestAdjustedOptionChainDisplayModeIfChanged);
        OptionChainDisplayMode optionChainDisplayMode = (OptionChainDisplayMode) latestAdjustedOptionChainDisplayModeIfChanged;
        if (optionChainDisplayMode == null) {
            return Unit.INSTANCE;
        }
        optionChainActivity5.label = 2;
    }

    public final Flow<Integer> statusBarTopPaddingFlow$feature_options_chain_externalDebug() {
        final StateFlow<OptionChainActivityViewState> stateFlow = getDuxo().getStateFlow();
        return new Flow<Integer>() { // from class: com.robinhood.android.optionschain.OptionChainActivity$statusBarTopPaddingFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C240022(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$statusBarTopPaddingFlow$$inlined$map$1$2 */
            public static final class C240022<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity$statusBarTopPaddingFlow$$inlined$map$1$2", m3645f = "OptionChainActivity.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$statusBarTopPaddingFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C240022.this.emit(null, this);
                    }
                }

                public C240022(FlowCollector flowCollector) {
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
                        Integer numBoxInt = boxing.boxInt(((OptionChainActivityViewState) obj).getWindowInsets().top);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    public final Flow<Boolean> chainNuxSearchDismissedFlow$feature_options_chain_externalDebug() {
        final StateFlow<OptionChainActivityViewState> stateFlow = getDuxo().getStateFlow();
        return new Flow<Boolean>() { // from class: com.robinhood.android.optionschain.OptionChainActivity$chainNuxSearchDismissedFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C240002(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$chainNuxSearchDismissedFlow$$inlined$map$1$2 */
            public static final class C240002<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivity$chainNuxSearchDismissedFlow$$inlined$map$1$2", m3645f = "OptionChainActivity.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$chainNuxSearchDismissedFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C240002.this.emit(null, this);
                    }
                }

                public C240002(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((OptionChainActivityViewState) obj).isNuxSearchDismissed());
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
        };
    }

    /* renamed from: getSideBySideChainSettingsTapped$feature_options_chain_externalDebug */
    public final boolean m2297x96713971() {
        return getDuxo().getStateFlow().getValue().isSideBySideChainSettingsTapped();
    }

    /* renamed from: setSideBySideChainSettingsTapped$feature_options_chain_externalDebug */
    public final void m2298xeb990de5() {
        getDuxo().setSideBySideChainSettingsTapped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setupChainFragment(final OptionChainDisplayMode optionChainDisplayMode, Continuation<? super Unit> continuation) {
        Object objCollect = Operators.combine(FlowKt.take(getDuxo().streamSbsChainPerfExperiment(), 1), FlowKt.take(getDuxo().streamUiOptionChains(), 1)).collect(new FlowCollector() { // from class: com.robinhood.android.optionschain.OptionChainActivity.setupChainFragment.2

            /* compiled from: OptionChainActivity.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.optionschain.OptionChainActivity$setupChainFragment$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionChainDisplayMode.values().length];
                    try {
                        iArr[OptionChainDisplayMode.DEFAULT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionChainDisplayMode.SIDE_BY_SIDE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Tuples2<Boolean, ? extends List<UiOptionChain>>) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Tuples2<Boolean, ? extends List<UiOptionChain>> tuples2, Continuation<? super Unit> continuation2) {
                boolean zBooleanValue = tuples2.component1().booleanValue();
                List<UiOptionChain> listComponent2 = tuples2.component2();
                if (listComponent2.isEmpty()) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("OptionChainActivity: streamed uiOptionChains list is empty"), true, null, 4, null);
                    return Unit.INSTANCE;
                }
                OptionChainDisplayMode optionChainDisplayMode2 = optionChainDisplayMode;
                int i = optionChainDisplayMode2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[optionChainDisplayMode2.ordinal()];
                if (i == -1 || i == 1) {
                    OptionChainActivity optionChainActivity = this;
                    optionChainActivity.replaceFragmentWithoutBackStack(OptionChainFragment.INSTANCE.newInstance((Parcelable) new InternalOptionChainFragmentKey(zBooleanValue, (OptionChainIntentKey) OptionChainActivity.INSTANCE.getExtras((Activity) optionChainActivity), listComponent2, this.getSelectedExpirationPage())));
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OptionChainActivity optionChainActivity2 = this;
                    optionChainActivity2.replaceFragmentWithoutBackStack(OptionSideBySideChainFragment.INSTANCE.newInstance((Parcelable) new InternalOptionChainFragmentKey(zBooleanValue, (OptionChainIntentKey) OptionChainActivity.INSTANCE.getExtras((Activity) optionChainActivity2), listComponent2, this.getSelectedExpirationPage())));
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshGlobalPadding(boolean isOnboardingSearchVisible, OptionChainDisplayMode currentChainDisplayMode) {
        Insets windowInsets = getDuxo().getStateFlow().getValue().getWindowInsets();
        int i = currentChainDisplayMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currentChainDisplayMode.ordinal()];
        if (i != -1) {
            if (i == 1) {
                ComposeView composeOverlayView = getBinding().composeOverlayView;
                Intrinsics.checkNotNullExpressionValue(composeOverlayView, "composeOverlayView");
                ViewGroup.LayoutParams layoutParams = composeOverlayView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = windowInsets.left;
                layoutParams2.bottomMargin = windowInsets.bottom;
                layoutParams2.rightMargin = windowInsets.right;
                composeOverlayView.setLayoutParams(layoutParams2);
                getBinding().composeOverlayView.setPadding(0, windowInsets.top, 0, 0);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!isOnboardingSearchVisible) {
                    hideToolbar();
                }
            }
        }
        CoordinatorLayout overlayContainer = getBinding().overlayContainer;
        Intrinsics.checkNotNullExpressionValue(overlayContainer, "overlayContainer");
        ViewGroup.LayoutParams layoutParams3 = overlayContainer.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = (currentChainDisplayMode == OptionChainDisplayMode.DEFAULT || isOnboardingSearchVisible) ? windowInsets.top : 0;
        layoutParams4.leftMargin = windowInsets.left;
        layoutParams4.bottomMargin = windowInsets.bottom;
        layoutParams4.rightMargin = windowInsets.right;
        overlayContainer.setLayoutParams(layoutParams4);
        CoordinatorLayout onboardingLayer = getBinding().onboardingLayer;
        Intrinsics.checkNotNullExpressionValue(onboardingLayer, "onboardingLayer");
        ViewGroup.LayoutParams layoutParams5 = onboardingLayer.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
        layoutParams6.topMargin = windowInsets.top;
        layoutParams6.leftMargin = windowInsets.left;
        layoutParams6.bottomMargin = windowInsets.bottom;
        layoutParams6.rightMargin = windowInsets.right;
        onboardingLayer.setLayoutParams(layoutParams6);
    }

    @Override // com.robinhood.android.optionchain.OptionChainExpirationPageCallbacks
    public void setSelectedExpirationPage(OptionChainExpirationDateState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getDuxo().setSharedSelectedExpirationDate(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionChainExpirationDateState getSelectedExpirationPage() {
        return getDuxo().getSharedSelectedExpirationDate();
    }

    /* compiled from: OptionChainActivity.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/optionschain/OptionChainActivity;", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "<init>", "()V", "QUICK_ADD_TAG", "", "quickAddAnalyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OptionChainActivity, OptionChainIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OptionChainIntentKey getExtras(OptionChainActivity optionChainActivity) {
            return (OptionChainIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, optionChainActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, OptionChainIntentKey optionChainIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, optionChainIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, OptionChainIntentKey optionChainIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, optionChainIntentKey);
        }
    }
}
