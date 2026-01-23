package com.robinhood.android.common.recurring.amount;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.amount.RecurringOrderAmountViewState;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringAmountBinding;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.text.ThemedStringResource;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.app.keys.data.RecurringOrderAmountArgs;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.RecurringInvestmentsConstants;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RecurringOrderAmountFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 L2\u00020\u0001:\u0002KLB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020/H\u0016J\u001a\u00103\u001a\u00020/2\u0006\u00104\u001a\u0002052\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020/2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020/H\u0002J\b\u0010@\u001a\u00020/H\u0002J\u0012\u0010A\u001a\u00020/2\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\b\u0010D\u001a\u00020/H\u0002J\b\u0010E\u001a\u00020/H\u0002J\b\u0010F\u001a\u00020/H\u0002J\b\u0010G\u001a\u00020/H\u0002J\u000e\u0010H\u001a\u00020/2\u0006\u0010I\u001a\u00020JR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010&¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "getCryptoExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "setCryptoExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "isCryptoUsRecurringVTExperimentEnabled", "", "duxo", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringAmountBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringAmountBinding;", "binding$delegate", "screenName", "", "getScreenName", "()Ljava/lang/String;", "isCrypto", "()Z", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "useDesignSystemToolbar", "getUseDesignSystemToolbar", "maxAmountConstant", "getMaxAmountConstant", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "onAttach", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setViewState", "viewState", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState;", "bindForDollarAmountType", "bindForPercentageAmountType", "bindSubtext", "subtextState", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState$SubtextState;", "showDollarMaximumAmountInfoDialog", "showMaximumAmountErrorDialog", "showMinimumAmountErrorDialog", "logAmountEdit", "logReviewTap", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "Callbacks", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderAmountFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public CryptoExperimentsStore cryptoExperimentsStore;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private boolean isCryptoUsRecurringVTExperimentEnabled;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderAmountFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderAmountFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringAmountBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment$Callbacks;", "", "onAmountSelectionComplete", "", "investmentScheduleAmount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAmountSelectionComplete(InvestmentScheduleAmount investmentScheduleAmount);
    }

    /* compiled from: RecurringOrderAmountFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AmountType.values().length];
            try {
                iArr[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RecurringOrderAmountFragment() {
        super(C11595R.layout.fragment_recurring_amount);
        this.duxo = OldDuxos.oldDuxo(this, RecurringOrderAmountDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, RecurringOrderAmountFragment6.INSTANCE);
        this.useDesignSystemToolbar = true;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final CryptoExperimentsStore getCryptoExperimentsStore() {
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore;
        if (cryptoExperimentsStore != null) {
            return cryptoExperimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoExperimentsStore");
        return null;
    }

    public final void setCryptoExperimentsStore(CryptoExperimentsStore cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "<set-?>");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    private final RecurringOrderAmountDuxo getDuxo() {
        return (RecurringOrderAmountDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentRecurringAmountBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringAmountBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.EQUITY_ORDER_ENTRY.toString();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return ((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) this)).getTargetType().isCrypto();
    }

    private final boolean isBrokerageCashTransfer() {
        return ((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) this)).getTargetType().isBrokerageCashTransfer();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final String getMaxAmountConstant() {
        return Money.format$default(RecurringInvestmentsConstants.INSTANCE.maxRecurringOrderAmount(((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) this)).getTargetType()), Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C116111(null));
    }

    /* compiled from: RecurringOrderAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$onCreate$1", m3645f = "RecurringOrderAmountFragment.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$onCreate$1 */
    static final class C116111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C116111(Continuation<? super C116111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderAmountFragment.this.new C116111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C116111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = RecurringOrderAmountFragment.this.getCryptoExperimentsStore().streamCryptoRecurringOrdersVTExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecurringOrderAmountFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoRecurringOrdersVTExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: RecurringOrderAmountFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$onCreate$1$1", m3645f = "RecurringOrderAmountFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ RecurringOrderAmountFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringOrderAmountFragment recurringOrderAmountFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderAmountFragment;
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
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.isCryptoUsRecurringVTExperimentEnabled = this.Z$0;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C116121(this));
    }

    /* compiled from: RecurringOrderAmountFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$onResume$1 */
    /* synthetic */ class C116121 extends FunctionReferenceImpl implements Function1<RecurringOrderAmountViewState, Unit> {
        C116121(Object obj) {
            super(1, obj, RecurringOrderAmountFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderAmountViewState recurringOrderAmountViewState) {
            invoke2(recurringOrderAmountViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringOrderAmountViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderAmountFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        final FragmentRecurringAmountBinding binding = getBinding();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(binding.recurringAmountNumpad.getKeyEvents()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountFragment.onViewCreated$lambda$1$lambda$0(this.f$0, binding, (KeyEvent) obj);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) this)).getInitialAmount().getAmountType().ordinal()];
        if (i == 1) {
            bindForDollarAmountType();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bindForPercentageAmountType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(RecurringOrderAmountFragment recurringOrderAmountFragment, FragmentRecurringAmountBinding fragmentRecurringAmountBinding, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        int i = WhenMappings.$EnumSwitchMapping$0[((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) recurringOrderAmountFragment)).getInitialAmount().getAmountType().ordinal()];
        if (i == 1) {
            fragmentRecurringAmountBinding.recurringDollarAmountInputView.dispatchInputKeyEvent(keyEvent);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentRecurringAmountBinding.recurringPercentageInputView.dispatchInputKeyEvent(keyEvent);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) this)).getFromInsights()) {
            final ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
            if (scarletContextWrapper == null) {
                scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            }
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
            putDesignSystemOverlay(scarletContextWrapper);
            LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderAmountFragment.onAttach$lambda$3$lambda$2(scarletContextWrapper, (DayNightOverlay) obj);
                }
            });
            setScarletContextWrapper(scarletContextWrapper);
            return;
        }
        ScarletContextWrapper scarletContextWrapper2 = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper2);
        putAchromaticOverlay(scarletContextWrapper2);
        setScarletContextWrapper(scarletContextWrapper2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$3$lambda$2(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final RecurringOrderAmountViewState viewState) {
        Throwable thConsume;
        InvestmentScheduleAmount investmentScheduleAmountConsume;
        UiEvent<Unit> showMaximumAmountDialogEvent = viewState.getShowMaximumAmountDialogEvent();
        if ((showMaximumAmountDialogEvent != null ? showMaximumAmountDialogEvent.consume() : null) != null) {
            showMaximumAmountErrorDialog();
        }
        UiEvent<Unit> showMinimumAmountDialogEvent = viewState.getShowMinimumAmountDialogEvent();
        if ((showMinimumAmountDialogEvent != null ? showMinimumAmountDialogEvent.consume() : null) != null) {
            showMinimumAmountErrorDialog();
        }
        if ((viewState.getUpdateAmountState() instanceof RecurringOrderAmountViewState.UpdateAmountState.Success) && (investmentScheduleAmountConsume = ((RecurringOrderAmountViewState.UpdateAmountState.Success) viewState.getUpdateAmountState()).getEvent().consume()) != null) {
            getCallbacks().onAmountSelectionComplete(investmentScheduleAmountConsume);
        }
        if ((viewState.getUpdateAmountState() instanceof RecurringOrderAmountViewState.UpdateAmountState.Error) && (thConsume = ((RecurringOrderAmountViewState.UpdateAmountState.Error) viewState.getUpdateAmountState()).getEvent().consume()) != null) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
        }
        Companion companion = INSTANCE;
        bindSubtext(viewState.recurringAmountSubtextState(((RecurringOrderAmountArgs) companion.getArgs((Fragment) this)).getFromInvestFlow()));
        RdsButton rdsButton = getBinding().recurringAmountConfirmBtn;
        rdsButton.setEnabled(viewState.doneBtnEnabled(((RecurringOrderAmountArgs) companion.getArgs((Fragment) this)).getFromInvestFlow()));
        rdsButton.setLoading(viewState.getDoneBtnLoading());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderAmountFragment.setViewState$lambda$9$lambda$8(this.f$0, viewState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$9$lambda$8(RecurringOrderAmountFragment recurringOrderAmountFragment, RecurringOrderAmountViewState recurringOrderAmountViewState) {
        recurringOrderAmountFragment.logReviewTap(recurringOrderAmountViewState.getLoggingContext());
        recurringOrderAmountFragment.getDuxo().submitInvestmentScheduleAmountUpdate();
        return Unit.INSTANCE;
    }

    private final void bindForDollarAmountType() {
        RhMoneyInputView rhMoneyInputView = getBinding().recurringDollarAmountInputView;
        rhMoneyInputView.setEmitZeroAmountOnEmpty(true);
        Intrinsics.checkNotNull(rhMoneyInputView);
        rhMoneyInputView.setVisibility(0);
        rhMoneyInputView.requestAmountTextFocus();
        rhMoneyInputView.setAmount(((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) this)).getInitialAmount().getDollarAmount());
        Observable<R> map = rhMoneyInputView.getAmountObservable().map(new Function() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$bindForDollarAmountType$1$1
            @Override // io.reactivex.functions.Function
            public final Optional<InvestmentScheduleAmount.Dollar> apply(Optional<Money> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof Some) {
                    return Optional.INSTANCE.m2972of(new InvestmentScheduleAmount.Dollar((Money) ((Some) it).getValue()));
                }
                if (it instanceof Optional2) {
                    return Optional2.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountFragment.bindForDollarAmountType$lambda$12$lambda$10(this.f$0, (InvestmentScheduleAmount.Dollar) obj);
            }
        });
        Observable<R> map2 = rhMoneyInputView.getAmountObservable().map(new Function() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$bindForDollarAmountType$1$3
            @Override // io.reactivex.functions.Function
            public final Optional<InvestmentScheduleAmount.Dollar> apply(Optional<Money> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof Some) {
                    return Optional.INSTANCE.m2972of(new InvestmentScheduleAmount.Dollar((Money) ((Some) it).getValue()));
                }
                if (it instanceof Optional2) {
                    return Optional2.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableTake = ObservablesAndroid.observeOnMainThread(map2).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountFragment.bindForDollarAmountType$lambda$12$lambda$11(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindForDollarAmountType$lambda$12$lambda$10(RecurringOrderAmountFragment recurringOrderAmountFragment, InvestmentScheduleAmount.Dollar newAmount) {
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        recurringOrderAmountFragment.getDuxo().setAmount(newAmount);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindForDollarAmountType$lambda$12$lambda$11(RecurringOrderAmountFragment recurringOrderAmountFragment, Optional optional) {
        recurringOrderAmountFragment.logAmountEdit();
        return Unit.INSTANCE;
    }

    private final void bindForPercentageAmountType() {
        RhPercentageInputView rhPercentageInputView = getBinding().recurringPercentageInputView;
        rhPercentageInputView.setEmitZeroPercentOnEmpty(true);
        Intrinsics.checkNotNull(rhPercentageInputView);
        rhPercentageInputView.setVisibility(0);
        rhPercentageInputView.requestAmountTextFocus();
        rhPercentageInputView.setPercentage(((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) this)).getInitialAmount().getPercentageAmount());
        Observable<R> map = rhPercentageInputView.getPercentageObservable().map(new Function() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$bindForPercentageAmountType$1$1
            @Override // io.reactivex.functions.Function
            public final Optional<InvestmentScheduleAmount.Percentage> apply(Optional<? extends BigDecimal> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof Some) {
                    return Optional.INSTANCE.m2972of(new InvestmentScheduleAmount.Percentage((BigDecimal) ((Some) it).getValue()));
                }
                if (it instanceof Optional2) {
                    return Optional2.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountFragment.bindForPercentageAmountType$lambda$15$lambda$13(this.f$0, (InvestmentScheduleAmount.Percentage) obj);
            }
        });
        Observable<R> map2 = rhPercentageInputView.getPercentageObservable().map(new Function() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$bindForPercentageAmountType$1$3
            @Override // io.reactivex.functions.Function
            public final Optional<InvestmentScheduleAmount.Percentage> apply(Optional<? extends BigDecimal> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof Some) {
                    return Optional.INSTANCE.m2972of(new InvestmentScheduleAmount.Percentage((BigDecimal) ((Some) it).getValue()));
                }
                if (it instanceof Optional2) {
                    return Optional2.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableTake = ObservablesAndroid.observeOnMainThread(map2).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountFragment.bindForPercentageAmountType$lambda$15$lambda$14(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindForPercentageAmountType$lambda$15$lambda$13(RecurringOrderAmountFragment recurringOrderAmountFragment, InvestmentScheduleAmount.Percentage newAmount) {
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        recurringOrderAmountFragment.getDuxo().setAmount(newAmount);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindForPercentageAmountType$lambda$15$lambda$14(RecurringOrderAmountFragment recurringOrderAmountFragment, Optional optional) {
        recurringOrderAmountFragment.logAmountEdit();
        return Unit.INSTANCE;
    }

    private final void bindSubtext(final RecurringOrderAmountViewState.SubtextState subtextState) {
        FragmentRecurringAmountBinding binding = getBinding();
        if (subtextState == null) {
            LinearLayout recurringAmountSubtextLayout = binding.recurringAmountSubtextLayout;
            Intrinsics.checkNotNullExpressionValue(recurringAmountSubtextLayout, "recurringAmountSubtextLayout");
            recurringAmountSubtextLayout.setVisibility(8);
        } else {
            RhTextView rhTextView = binding.recurringAmountSubtext;
            ThemedStringResource content = subtextState.getContent();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView.setText(content.toCharSequence(resources));
            ImageView recurringAmountSubtextInfoIcon = binding.recurringAmountSubtextInfoIcon;
            Intrinsics.checkNotNullExpressionValue(recurringAmountSubtextInfoIcon, "recurringAmountSubtextInfoIcon");
            recurringAmountSubtextInfoIcon.setVisibility(subtextState.getIsInfoIconVisible() ? 0 : 8);
            LinearLayout recurringAmountSubtextLayout2 = binding.recurringAmountSubtextLayout;
            Intrinsics.checkNotNullExpressionValue(recurringAmountSubtextLayout2, "recurringAmountSubtextLayout");
            recurringAmountSubtextLayout2.setVisibility(0);
        }
        LinearLayout recurringAmountSubtextLayout3 = binding.recurringAmountSubtextLayout;
        Intrinsics.checkNotNullExpressionValue(recurringAmountSubtextLayout3, "recurringAmountSubtextLayout");
        OnClickListeners.onClick(recurringAmountSubtextLayout3, new Function0() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderAmountFragment.bindSubtext$lambda$17$lambda$16(subtextState, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSubtext$lambda$17$lambda$16(RecurringOrderAmountViewState.SubtextState subtextState, RecurringOrderAmountFragment recurringOrderAmountFragment) {
        if (subtextState != null && subtextState.getIsInfoIconVisible()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((RecurringOrderAmountArgs) INSTANCE.getArgs((Fragment) recurringOrderAmountFragment)).getInitialAmount().getAmountType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("No dialog shown on recurring investments using percentages!");
            }
            recurringOrderAmountFragment.showDollarMaximumAmountInfoDialog();
        }
        return Unit.INSTANCE;
    }

    private final void showDollarMaximumAmountInfoDialog() {
        String string2;
        int i;
        int i2;
        if (isBrokerageCashTransfer()) {
            string2 = getString(C11595R.string.brokerage_cash_recurring_order_create_max_amount_info_message, getMaxAmountConstant());
        } else if (get_isCrypto() && this.isCryptoUsRecurringVTExperimentEnabled) {
            string2 = getString(C11595R.string.crypto_recurring_order_create_max_amount_info_message, getMaxAmountConstant());
        } else {
            string2 = getString(C11595R.string.equity_recurring_order_create_max_amount_info_message, getMaxAmountConstant());
        }
        Intrinsics.checkNotNull(string2);
        if (isBrokerageCashTransfer()) {
            i = C11595R.string.brokerage_cash_recurring_order_create_max_amount_info_title;
        } else if (get_isCrypto() && this.isCryptoUsRecurringVTExperimentEnabled) {
            i = C11595R.string.crypto_recurring_order_create_max_amount_info_title;
        } else {
            i = C11595R.string.equity_recurring_order_create_max_amount_info_title;
        }
        if (this.isCryptoUsRecurringVTExperimentEnabled) {
            i2 = C11048R.string.general_label_got_it;
        } else {
            i2 = C11048R.string.general_label_dismiss;
        }
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(i, new Object[0]).setMessage(string2).setUseDesignSystemOverlay(true).setPositiveButton(i2, new Object[0]);
        if (isBrokerageCashTransfer()) {
            positiveButton.setUseParentFragmentScarletContext(true);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "recurring-edit-maximum-amount", false, 4, null);
    }

    private final void showMaximumAmountErrorDialog() {
        String string2 = getString(C11595R.string.f4011x1ffd7644, getMaxAmountConstant());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C11595R.string.f4012xb5903d5, new Object[0]).setMessage(string2).setPositiveButton(C11595R.string.f4010x41b97555, new Object[0]);
        if (isBrokerageCashTransfer()) {
            positiveButton.setUseParentFragmentScarletContext(true);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "recurring-edit-maximum-amount", false, 4, null);
    }

    private final void showMinimumAmountErrorDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder message = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C11595R.string.f4014x739f73c3, new Object[0]).setMessage(C11595R.string.f4013x9067a2b2, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, parentFragmentManager, "recurring-edit-minimum-amount", false, 4, null);
    }

    private final void logAmountEdit() {
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment.logAmountEdit.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderAmountViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountFragment.logAmountEdit$lambda$20(this.f$0, (RecurringContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logAmountEdit$lambda$20(RecurringOrderAmountFragment recurringOrderAmountFragment, RecurringContext recurringContext) {
        EventLogger.DefaultImpls.logType$default(recurringOrderAmountFragment.getEventLogger(), UserInteractionEventData.Action.SET_RECURRING_AMOUNT, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.TEXT_FIELD, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), 8, null);
        return Unit.INSTANCE;
    }

    public final void logReviewTap(RecurringContext loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Screen screen = new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Component component = new Component(Component.ComponentType.REVIEW_BUTTON, null, null, 6, null);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), action, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, null, str, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: RecurringOrderAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment;", "Lcom/robinhood/android/navigation/app/keys/data/RecurringOrderAmountArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderAmountFragment, RecurringOrderAmountArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringOrderAmountArgs getArgs(RecurringOrderAmountFragment recurringOrderAmountFragment) {
            return (RecurringOrderAmountArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderAmountFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderAmountFragment newInstance(RecurringOrderAmountArgs recurringOrderAmountArgs) {
            return (RecurringOrderAmountFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, recurringOrderAmountArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderAmountFragment recurringOrderAmountFragment, RecurringOrderAmountArgs recurringOrderAmountArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderAmountFragment, recurringOrderAmountArgs);
        }
    }
}
