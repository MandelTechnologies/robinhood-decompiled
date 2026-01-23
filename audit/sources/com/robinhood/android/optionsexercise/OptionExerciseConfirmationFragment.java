package com.robinhood.android.optionsexercise;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
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

/* compiled from: OptionExerciseConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 M2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002LMB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u0002012\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020\u0002H\u0016J\u0010\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020\u0002H\u0002J\t\u0010E\u001a\u00020FH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u001bR\u001b\u0010!\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001bR\u001b\u0010$\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b%\u0010\u001bR\u001b\u0010'\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b(\u0010\u001bR!\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001d\u0012\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b6\u00103R\u0014\u00108\u001a\u000209X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "Lcom/robinhood/models/db/OptionEvent;", "Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "setOrderManager", "(Lcom/robinhood/android/optionsexercise/OptionExerciseManager;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "duxo", "Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "descriptionTxt", "getDescriptionTxt", "descriptionTxt$delegate", "contractQuantityTxt", "getContractQuantityTxt", "contractQuantityTxt$delegate", "multiplierTxt", "getMultiplierTxt", "multiplierTxt$delegate", "strikeTxt", "getStrikeTxt", "strikeTxt$delegate", "totalValueComposeView", "Landroidx/compose/ui/platform/ComposeView;", "getTotalValueComposeView$annotations", "getTotalValueComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "totalValueComposeView$delegate", "doneBtn", "Landroid/view/View;", "getDoneBtn", "()Landroid/view/View;", "doneBtn$delegate", "viewExerciseBtn", "getViewExerciseBtn", "viewExerciseBtn$delegate", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "onViewCreated", "", "view", "savedInstanceState", "Landroid/os/Bundle;", "onOrderReceived", Card.Icon.ORDER, "bindOptionEvent", "optionEvent", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExerciseConfirmationFragment extends BaseOrderConfirmationFragment<OptionEvent, OptionExerciseManager> implements RegionGated {
    public HistoryNavigator historyNavigator;
    public OptionExerciseManager orderManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionExerciseConfirmationFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseConfirmationFragment.class, "descriptionTxt", "getDescriptionTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseConfirmationFragment.class, "contractQuantityTxt", "getContractQuantityTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseConfirmationFragment.class, "multiplierTxt", "getMultiplierTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseConfirmationFragment.class, "strikeTxt", "getStrikeTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseConfirmationFragment.class, "totalValueComposeView", "getTotalValueComposeView()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseConfirmationFragment.class, "doneBtn", "getDoneBtn()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseConfirmationFragment.class, "viewExerciseBtn", "getViewExerciseBtn()Landroid/view/View;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionExerciseConfirmationDuxo.class);

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt = bindView(C24704R.id.exercise_confirmation_title_txt);

    /* renamed from: descriptionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 descriptionTxt = bindView(C24704R.id.exercise_confirmation_description_txt);

    /* renamed from: contractQuantityTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 contractQuantityTxt = bindView(C24704R.id.exercise_confirmation_contract_quantity_txt);

    /* renamed from: multiplierTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 multiplierTxt = bindView(C24704R.id.exercise_confirmation_contracts_multiplier_txt);

    /* renamed from: strikeTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 strikeTxt = bindView(C24704R.id.exercise_confirmation_strike_price_txt);

    /* renamed from: totalValueComposeView$delegate, reason: from kotlin metadata */
    private final Interfaces2 totalValueComposeView = bindView(C24704R.id.exercise_confirmation_total_value_compose_view);

    /* renamed from: doneBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 doneBtn = bindView(C24704R.id.done_btn);

    /* renamed from: viewExerciseBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewExerciseBtn = bindView(C24704R.id.view_exercise_btn);
    private final int confirmationLayoutId = C24704R.layout.include_exercise_confirmation_layout;

    /* compiled from: OptionExerciseConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderDirection.values().length];
            try {
                iArr[OrderDirection.DEBIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderDirection.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static /* synthetic */ void getTotalValueComposeView$annotations() {
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public OptionExerciseManager getOrderManager() {
        OptionExerciseManager optionExerciseManager = this.orderManager;
        if (optionExerciseManager != null) {
            return optionExerciseManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(OptionExerciseManager optionExerciseManager) {
        Intrinsics.checkNotNullParameter(optionExerciseManager, "<set-?>");
        this.orderManager = optionExerciseManager;
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionExerciseConfirmationDuxo getDuxo() {
        return (OptionExerciseConfirmationDuxo) this.duxo.getValue();
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getDescriptionTxt() {
        return (TextView) this.descriptionTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getContractQuantityTxt() {
        return (TextView) this.contractQuantityTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getMultiplierTxt() {
        return (TextView) this.multiplierTxt.getValue(this, $$delegatedProperties[3]);
    }

    private final TextView getStrikeTxt() {
        return (TextView) this.strikeTxt.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeView getTotalValueComposeView() {
        return (ComposeView) this.totalValueComposeView.getValue(this, $$delegatedProperties[5]);
    }

    private final View getDoneBtn() {
        return (View) this.doneBtn.getValue(this, $$delegatedProperties[6]);
    }

    private final View getViewExerciseBtn() {
        return (View) this.viewExerciseBtn.getValue(this, $$delegatedProperties[7]);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public int getConfirmationLayoutId() {
        return this.confirmationLayoutId;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OnClickListeners.onClick(getDoneBtn(), new Function0() { // from class: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionExerciseConfirmationFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C246692(null), 3, null);
        if (isInTabFragment()) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment) {
        optionExerciseConfirmationFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* compiled from: OptionExerciseConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2", m3645f = "OptionExerciseConfirmationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2 */
    static final class C246692 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C246692(Continuation<? super C246692> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionExerciseConfirmationFragment.this.new C246692(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C246692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionExerciseConfirmationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1", m3645f = "OptionExerciseConfirmationFragment.kt", m3646l = {70}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionExerciseConfirmationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionExerciseConfirmationFragment;
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
                    final StateFlow<OptionExerciseConfirmationViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<TotalValueRowState>() { // from class: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionExerciseConfirmationFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    TotalValueRowState totalValueRowState = ((OptionExerciseConfirmationViewState) obj).getTotalValueRowState();
                                    if (totalValueRowState != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(totalValueRowState, anonymousClass1) == coroutine_suspended) {
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

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super TotalValueRowState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

            /* compiled from: OptionExerciseConfirmationFragment.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/optionsexercise/TotalValueRowState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1$2", m3645f = "OptionExerciseConfirmationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TotalValueRowState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionExerciseConfirmationFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionExerciseConfirmationFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TotalValueRowState totalValueRowState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(totalValueRowState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        final TotalValueRowState totalValueRowState = (TotalValueRowState) this.L$0;
                        ComposeView totalValueComposeView = this.this$0.getTotalValueComposeView();
                        final OptionExerciseConfirmationFragment optionExerciseConfirmationFragment = this.this$0;
                        totalValueComposeView.setContent(ComposableLambda3.composableLambdaInstance(1736319813, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment.onViewCreated.2.1.2.1

                            /* compiled from: OptionExerciseConfirmationFragment.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C504241 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ TotalValueRowState $it;

                                C504241(TotalValueRowState totalValueRowState) {
                                    this.$it = totalValueRowState;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-722097837, i, -1, "com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionExerciseConfirmationFragment.kt:72)");
                                    }
                                    String totalLabelString = this.$it.getTotalLabelString();
                                    String totalPriceString = this.$it.getTotalPriceString();
                                    String shortPositionText = this.$it.getShortPositionText();
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$onViewCreated$2$1$2$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    OptionExerciseTotalValueRowComposable.OptionExerciseTotalValueRowComposable(totalLabelString, shortPositionText, null, totalPriceString, false, null, (Function0) objRememberedValue, composer, 1597824, 32);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1736319813, i, -1, "com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionExerciseConfirmationFragment.kt:71)");
                                }
                                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(optionExerciseConfirmationFragment.getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-722097837, true, new C504241(totalValueRowState), composer, 54), composer, 384, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionExerciseConfirmationFragment.this.getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new AnonymousClass1(OptionExerciseConfirmationFragment.this, null));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderReceived(OptionEvent order) {
        Intrinsics.checkNotNullParameter(order, "order");
        bindOptionEvent(order);
        getDuxo().bindOptionEvent(order);
    }

    private final void bindOptionEvent(final OptionEvent optionEvent) {
        int i;
        int i2;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        TextView textView;
        String string2;
        OptionEvent.EquityComponent equityComponent = (OptionEvent.EquityComponent) CollectionsKt.singleOrNull((List) optionEvent.getEquityComponents());
        if (equityComponent == null) {
            return;
        }
        String symbol = equityComponent.getSymbol();
        BigDecimal quantity = equityComponent.getQuantity();
        Money money = Money3.toMoney(equityComponent.getPrice(), Currencies.USD);
        OrderDirection direction = optionEvent.getDirection();
        BigDecimal quantity2 = optionEvent.getQuantity();
        boolean isPending = optionEvent.getIsPending();
        if (isPending) {
            i = C24704R.string.exercise_confirmation_title_pending;
        } else {
            i = C24704R.string.exercise_confirmation_title_completed;
        }
        getTitleTxt().setText(getString(i, symbol));
        TextView descriptionTxt = getDescriptionTxt();
        if (isPending) {
            string2 = getString(C24704R.string.exercise_confirmation_description_pending, DateStrings2.formatTo24HourTime$default(0, 0, null, 4, null));
            bigDecimal2 = quantity;
            bigDecimal = quantity2;
            textView = descriptionTxt;
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
            if (i3 == 1) {
                i2 = C24704R.string.exercise_confirmation_description_call_completed;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C24704R.string.exercise_confirmation_description_put_completed;
            }
            BigInteger bigInteger = quantity.toBigInteger();
            bigDecimal = quantity2;
            bigDecimal2 = quantity;
            textView = descriptionTxt;
            string2 = getString(i2, bigInteger, symbol, Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        textView.setText(string2);
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimalDivide = bigDecimal2.divide(bigDecimal3, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        getMultiplierTxt().setText(getString(C24704R.string.option_exercise_multiplier_label, bigDecimalDivide.toBigInteger()));
        getContractQuantityTxt().setText(Formats.getShareQuantityFormat().format(bigDecimal3));
        getStrikeTxt().setText(Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        OnClickListeners.onClick(getViewExerciseBtn(), new Function0() { // from class: com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionExerciseConfirmationFragment.bindOptionEvent$lambda$1(this.f$0, optionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindOptionEvent$lambda$1(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment, OptionEvent optionEvent) {
        optionExerciseConfirmationFragment.requireActivity().finish();
        Navigator navigator = optionExerciseConfirmationFragment.getNavigator();
        Context contextRequireContext = optionExerciseConfirmationFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, HistoryNavigator.resolve$default(optionExerciseConfirmationFragment.getHistoryNavigator(), new TransactionReference(optionEvent.getId(), HistoryTransactionType.OPTION_EVENT, null, null, false, 28, null), false, false, 4, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionExerciseConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: OptionExerciseConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String accountNumber) {
            return new Args(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.accountNumber, ((Args) other).accountNumber);
        }

        public int hashCode() {
            String str = this.accountNumber;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public Args(String str) {
            this.accountNumber = str;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: OptionExerciseConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationFragment;", "Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationFragment$Args;", "<init>", "()V", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionExerciseConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionExerciseConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionExerciseConfirmationFragment newInstance(Args args) {
            return (OptionExerciseConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionExerciseConfirmationFragment, args);
        }
    }
}
