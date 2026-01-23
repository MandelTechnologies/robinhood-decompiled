package com.robinhood.android.common.recurring.sourceoffunds.paycheck;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderPaycheckSourceBinding;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
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

/* compiled from: RecurringOrderPaycheckSourceFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u0001:\u0003456B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00103\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u0014\u0010\"\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010!¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderPaycheckSourceBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderPaycheckSourceBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/DirectDepositRelationshipRowState;", "callbacks", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Callbacks;", "callbacks$delegate", "isCrypto", "", "()Z", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "bindRows", "viewState", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/EquityRecurringOrderPaycheckSourceViewState;", "bindSelectedButton", "handleEditResultEvent", "Callbacks", "Args", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderPaycheckSourceFragment extends BaseFragment {
    private final GenericListAdapter<RdsRowView, DirectDepositRelationshipRowState> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderPaycheckSourceFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderPaycheckSourceBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderPaycheckSourceFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderPaycheckSourceFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Callbacks;", "", "onDirectDepositRelationshipSelectionComplete", "", "actionType", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "directDepositRelationship", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "existingRecurringSchedules", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDirectDepositRelationshipSelectionComplete(RecurringOrderActionType actionType, DirectDepositRelationship directDepositRelationship, List<UiPaycheckInvestmentSchedule> existingRecurringSchedules);
    }

    /* compiled from: RecurringOrderPaycheckSourceFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringOrderPaycheckSourceViewState.values().length];
            try {
                iArr[RecurringOrderPaycheckSourceViewState.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringOrderPaycheckSourceViewState.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RecurringOrderPaycheckSourceFragment() {
        super(C11595R.layout.fragment_recurring_order_paycheck_source);
        this.binding = ViewBinding5.viewBinding(this, RecurringOrderPaycheckSourceFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RecurringOrderPaycheckSourceDuxo.class);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecurringOrderPaycheckSourceFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (DirectDepositRelationshipRowState) obj2);
            }
        });
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
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

    private final FragmentRecurringOrderPaycheckSourceBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringOrderPaycheckSourceBinding) value;
    }

    private final RecurringOrderPaycheckSourceDuxo getDuxo() {
        return (RecurringOrderPaycheckSourceDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final RecurringOrderPaycheckSourceFragment recurringOrderPaycheckSourceFragment, RdsRowView of, final DirectDepositRelationshipRowState rowState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(rowState, "rowState");
        CharSequence text = null;
        if (rowState.isSelected()) {
            of.setTrailingIconResource(C20690R.drawable.ic_rds_checkmark_24dp);
        } else {
            of.setTrailingIconDrawable(null);
        }
        StringResource primaryText = rowState.getPrimaryText();
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        of.setPrimaryText(primaryText.getText(resources));
        StringResource secondaryText = rowState.getSecondaryText();
        if (secondaryText != null) {
            Resources resources2 = of.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text = secondaryText.getText(resources2);
        }
        of.setSecondaryText(text);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderPaycheckSourceFragment.adapter$lambda$1$lambda$0(rowState, recurringOrderPaycheckSourceFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(DirectDepositRelationshipRowState directDepositRelationshipRowState, RecurringOrderPaycheckSourceFragment recurringOrderPaycheckSourceFragment) {
        if (directDepositRelationshipRowState.getAreClicksEnabled()) {
            recurringOrderPaycheckSourceFragment.getDuxo().onCheckChanged(directDepositRelationshipRowState.getDirectDepositRelationshipId());
        }
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getInvestmentTarget().isCrypto();
    }

    private final boolean isBrokerageCashTransfer() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getInvestmentTarget().isBrokerageCashTransfer();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        if (isBrokerageCashTransfer()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentRecurringOrderPaycheckSourceBinding binding = getBinding();
        binding.recyclerView.setAdapter(this.adapter);
        binding.recyclerView.setItemAnimator(null);
        RhTextView rhTextView = binding.paycheckSourceTitleText;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getActionType().getTitleTxtResId());
        binding.paycheckSourceSelectedButton.setText(((Args) companion.getArgs((Fragment) this)).getActionType().getDoneButtonResId());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderPaycheckSourceFragment.onViewCreated$lambda$4(this.f$0, (EquityRecurringOrderPaycheckSourceViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(RecurringOrderPaycheckSourceFragment recurringOrderPaycheckSourceFragment, EquityRecurringOrderPaycheckSourceViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        recurringOrderPaycheckSourceFragment.bindRows(viewState);
        recurringOrderPaycheckSourceFragment.bindSelectedButton(viewState);
        recurringOrderPaycheckSourceFragment.handleEditResultEvent(viewState);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        RhToolbar rhToolbar;
        ScarletManager scarletManager;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (!isBrokerageCashTransfer() || (rhToolbar = getRhToolbar()) == null || (scarletManager = ScarletManager2.getScarletManager(rhToolbar)) == null) {
            return;
        }
        ScarletManager.putOverlay$default(scarletManager, AchromaticOverlay.INSTANCE, null, 2, null);
    }

    private final void bindRows(EquityRecurringOrderPaycheckSourceViewState viewState) {
        FragmentRecurringOrderPaycheckSourceBinding binding = getBinding();
        this.adapter.submitList(viewState.getDirectDepositRelationshipRowStates());
        binding.paycheckSourceSelectedButton.setEnabled(viewState.isPaycheckSourceSelectedButtonEnabled());
    }

    private final void bindSelectedButton(final EquityRecurringOrderPaycheckSourceViewState viewState) {
        RdsButton rdsButton = getBinding().paycheckSourceSelectedButton;
        rdsButton.setEnabled(viewState.isPaycheckSourceSelectedButtonEnabled());
        rdsButton.setLoading(viewState.isPaycheckSourceSelectedButtonLoading());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderPaycheckSourceFragment.bindSelectedButton$lambda$7$lambda$6(this.f$0, viewState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSelectedButton$lambda$7$lambda$6(RecurringOrderPaycheckSourceFragment recurringOrderPaycheckSourceFragment, EquityRecurringOrderPaycheckSourceViewState equityRecurringOrderPaycheckSourceViewState) {
        RecurringOrderPaycheckSourceFragmentLogging.logDirectDepositSelection(recurringOrderPaycheckSourceFragment, equityRecurringOrderPaycheckSourceViewState.getRecurringContext());
        int i = WhenMappings.$EnumSwitchMapping$0[equityRecurringOrderPaycheckSourceViewState.getPaycheckSourceSelectedButtonAction().ordinal()];
        if (i == 1) {
            RecurringOrderPaycheckSourceDuxo duxo = recurringOrderPaycheckSourceFragment.getDuxo();
            UUID selectedDirectDepositRelationshipId = equityRecurringOrderPaycheckSourceViewState.getSelectedDirectDepositRelationshipId();
            Intrinsics.checkNotNull(selectedDirectDepositRelationshipId);
            duxo.onSelectPaycheckSource(selectedDirectDepositRelationshipId);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RecurringOrderPaycheckSourceDuxo duxo2 = recurringOrderPaycheckSourceFragment.getDuxo();
            UUID selectedDirectDepositRelationshipId2 = equityRecurringOrderPaycheckSourceViewState.getSelectedDirectDepositRelationshipId();
            Intrinsics.checkNotNull(selectedDirectDepositRelationshipId2);
            duxo2.onEditPaycheckSource(selectedDirectDepositRelationshipId2);
        }
        return Unit.INSTANCE;
    }

    private final void handleEditResultEvent(EquityRecurringOrderPaycheckSourceViewState viewState) {
        Result<SuccessfulSelectionEvent> resultConsume;
        Result<Unit> resultConsume2;
        UiEvent<Result<Unit>> editResultEvent = viewState.getEditResultEvent();
        if (editResultEvent != null && (resultConsume2 = editResultEvent.consume()) != null) {
            Object value = resultConsume2.getValue();
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
            if (thM28553exceptionOrNullimpl == null) {
                RecurringOrderPaycheckSourceDuxo duxo = getDuxo();
                UUID selectedDirectDepositRelationshipId = viewState.getSelectedDirectDepositRelationshipId();
                Intrinsics.checkNotNull(selectedDirectDepositRelationshipId);
                duxo.onSelectPaycheckSource(selectedDirectDepositRelationshipId);
            } else {
                AbsErrorHandler.handleError$default(getActivityErrorHandler(), thM28553exceptionOrNullimpl, false, 2, null);
            }
        }
        UiEvent<Result<SuccessfulSelectionEvent>> selectionResultEvent = viewState.getSelectionResultEvent();
        if (selectionResultEvent == null || (resultConsume = selectionResultEvent.consume()) == null) {
            return;
        }
        Object value2 = resultConsume.getValue();
        Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(value2);
        if (thM28553exceptionOrNullimpl2 == null) {
            Callbacks callbacks = getCallbacks();
            RecurringOrderActionType actionType = ((Args) INSTANCE.getArgs((Fragment) this)).getActionType();
            DirectDepositRelationship selectedDirectDepositRelationship = viewState.getSelectedDirectDepositRelationship();
            Intrinsics.checkNotNull(selectedDirectDepositRelationship);
            callbacks.onDirectDepositRelationshipSelectionComplete(actionType, selectedDirectDepositRelationship, ((SuccessfulSelectionEvent) value2).getExistingPaycheckSchedules());
            return;
        }
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), thM28553exceptionOrNullimpl2, false, 2, null);
    }

    /* compiled from: RecurringOrderPaycheckSourceFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Args;", "Landroid/os/Parcelable;", "actionType", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "directDepositRelationshipId", "Ljava/util/UUID;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "amount", "Lcom/robinhood/models/util/Money;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "<init>", "(Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;Ljava/util/UUID;Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/models/util/Money;Ljava/lang/String;)V", "getActionType", "()Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "getDirectDepositRelationshipId", "()Ljava/util/UUID;", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getLoggingSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RecurringOrderActionType actionType;
        private final Money amount;
        private final UUID directDepositRelationshipId;
        private final InvestmentTarget investmentTarget;
        private final String loggingSource;

        /* compiled from: RecurringOrderPaycheckSourceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((RecurringOrderActionType) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable(), (InvestmentTarget) parcel.readParcelable(Args.class.getClassLoader()), (Money) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, RecurringOrderActionType recurringOrderActionType, UUID uuid, InvestmentTarget investmentTarget, Money money, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                recurringOrderActionType = args.actionType;
            }
            if ((i & 2) != 0) {
                uuid = args.directDepositRelationshipId;
            }
            if ((i & 4) != 0) {
                investmentTarget = args.investmentTarget;
            }
            if ((i & 8) != 0) {
                money = args.amount;
            }
            if ((i & 16) != 0) {
                str = args.loggingSource;
            }
            String str2 = str;
            InvestmentTarget investmentTarget2 = investmentTarget;
            return args.copy(recurringOrderActionType, uuid, investmentTarget2, money, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final RecurringOrderActionType getActionType() {
            return this.actionType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getDirectDepositRelationshipId() {
            return this.directDepositRelationshipId;
        }

        /* renamed from: component3, reason: from getter */
        public final InvestmentTarget getInvestmentTarget() {
            return this.investmentTarget;
        }

        /* renamed from: component4, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLoggingSource() {
            return this.loggingSource;
        }

        public final Args copy(RecurringOrderActionType actionType, UUID directDepositRelationshipId, InvestmentTarget investmentTarget, Money amount, String loggingSource) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
            Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
            return new Args(actionType, directDepositRelationshipId, investmentTarget, amount, loggingSource);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.actionType, args.actionType) && Intrinsics.areEqual(this.directDepositRelationshipId, args.directDepositRelationshipId) && Intrinsics.areEqual(this.investmentTarget, args.investmentTarget) && Intrinsics.areEqual(this.amount, args.amount) && Intrinsics.areEqual(this.loggingSource, args.loggingSource);
        }

        public int hashCode() {
            int iHashCode = this.actionType.hashCode() * 31;
            UUID uuid = this.directDepositRelationshipId;
            int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.investmentTarget.hashCode()) * 31;
            Money money = this.amount;
            return ((iHashCode2 + (money != null ? money.hashCode() : 0)) * 31) + this.loggingSource.hashCode();
        }

        public String toString() {
            return "Args(actionType=" + this.actionType + ", directDepositRelationshipId=" + this.directDepositRelationshipId + ", investmentTarget=" + this.investmentTarget + ", amount=" + this.amount + ", loggingSource=" + this.loggingSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.actionType, flags);
            dest.writeSerializable(this.directDepositRelationshipId);
            dest.writeParcelable(this.investmentTarget, flags);
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.loggingSource);
        }

        public Args(RecurringOrderActionType actionType, UUID uuid, InvestmentTarget investmentTarget, Money money, String loggingSource) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
            Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
            this.actionType = actionType;
            this.directDepositRelationshipId = uuid;
            this.investmentTarget = investmentTarget;
            this.amount = money;
            this.loggingSource = loggingSource;
        }

        public final RecurringOrderActionType getActionType() {
            return this.actionType;
        }

        public final UUID getDirectDepositRelationshipId() {
            return this.directDepositRelationshipId;
        }

        public final InvestmentTarget getInvestmentTarget() {
            return this.investmentTarget;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public /* synthetic */ Args(RecurringOrderActionType recurringOrderActionType, UUID uuid, InvestmentTarget investmentTarget, Money money, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(recurringOrderActionType, (i & 2) != 0 ? null : uuid, investmentTarget, (i & 8) != 0 ? null : money, (i & 16) != 0 ? "" : str);
        }

        public final String getLoggingSource() {
            return this.loggingSource;
        }
    }

    /* compiled from: RecurringOrderPaycheckSourceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment;", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Deprecated
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderPaycheckSourceFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringOrderPaycheckSourceFragment recurringOrderPaycheckSourceFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderPaycheckSourceFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderPaycheckSourceFragment newInstance(Args args) {
            return (RecurringOrderPaycheckSourceFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderPaycheckSourceFragment recurringOrderPaycheckSourceFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderPaycheckSourceFragment, args);
        }
    }
}
