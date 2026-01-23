package com.robinhood.android.common.recurring.trade.confirmation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.GenericActionableInformationFragment;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationViewState;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import rosetta.account.BrokerageAccountType;

/* compiled from: RecurringBrokerageCashTransferConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u0001:\u0003567B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016J\u001a\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u00060!j\u0002`\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment;", "Lcom/robinhood/android/common/GenericActionableInformationFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "callbacks", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onAttach", "", "context", "Landroid/content/Context;", "onDetach", "onStart", "onStop", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setViewState", "state", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationViewState;", "Callbacks", "Args", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringBrokerageCashTransferConfirmationFragment extends GenericActionableInformationFragment {
    public EventLogger eventLogger;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringBrokerageCashTransferConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, RecurringBrokerageCashTransferConfirmationDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: RecurringBrokerageCashTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Callbacks;", "", "onOrderCompleted", "", "onSecondaryButtonClicked", "secondaryButtonState", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderCompleted();

        void onSecondaryButtonClicked(RecurringOrderConfirmationViewState.SecondaryButtonState secondaryButtonState);
    }

    private final RecurringBrokerageCashTransferConfirmationDuxo getDuxo() {
        return (RecurringBrokerageCashTransferConfirmationDuxo) this.duxo.getValue();
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

    public final RhyGlobalLoggingContext getRhyGlobalLoggingContext() {
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext;
        if (rhyGlobalLoggingContext != null) {
            return rhyGlobalLoggingContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyGlobalLoggingContext");
        return null;
    }

    public final void setRhyGlobalLoggingContext(RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "<set-?>");
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Screen getEventScreen() {
        return new Screen(Screen.Name.RECURRING_ORDER_RECEIPT, null, null, null, 14, null);
    }

    private final Context getEventContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(null, null, null, RecurringContext.ScheduleFrequency.PAYCHECK, RecurringContext.RecurringFundsSource.DIRECT_DEPOSIT, 0.0d, RecurringContext.AssetType.BROKERAGE_CASH, null, 0.0d, null, null, 1959, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, RhyGlobalLoggingContext.rhyContext$default(getRhyGlobalLoggingContext(), RHYContext.ProductArea.CASH_ACCOUNTS, null, null, 6, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -2049, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        ScarletManager.removeOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE.getPriority(), null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C117781(this));
    }

    /* compiled from: RecurringBrokerageCashTransferConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationFragment$onResume$1 */
    /* synthetic */ class C117781 extends FunctionReferenceImpl implements Function1<RecurringBrokerageCashTransferConfirmationViewState, Unit> {
        C117781(Object obj) {
            super(1, obj, RecurringBrokerageCashTransferConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringBrokerageCashTransferConfirmationViewState recurringBrokerageCashTransferConfirmationViewState) {
            invoke2(recurringBrokerageCashTransferConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringBrokerageCashTransferConfirmationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringBrokerageCashTransferConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        setIllustration(toDrawableIllustration(C11595R.drawable.svg_brokerage_cash_recurring_checkmark));
        setTitle(toText(C11595R.string.recurring_brokerage_cash_transfer_confirmation_title));
        setPrimaryAction(toText(C11048R.string.general_label_done));
        setSecondaryActionStyle(C20690R.attr.secondaryButtonStyle);
        setSecondaryActionWidth(-1);
        onPrimaryActionClick(new Function0() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringBrokerageCashTransferConfirmationFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RecurringBrokerageCashTransferConfirmationFragment recurringBrokerageCashTransferConfirmationFragment) {
        EventLogger.DefaultImpls.logTap$default(recurringBrokerageCashTransferConfirmationFragment.getEventLogger(), UserInteractionEventData.Action.PRIMARY_CTA, recurringBrokerageCashTransferConfirmationFragment.getEventScreen(), null, null, recurringBrokerageCashTransferConfirmationFragment.getEventContext(), false, 44, null);
        recurringBrokerageCashTransferConfirmationFragment.getCallbacks().onOrderCompleted();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecurringBrokerageCashTransferConfirmationViewState state) {
        GenericActionableInformationFragment.TextType.Resource text;
        setDescription(toText(state.getDescription()));
        final RecurringOrderConfirmationViewState.SecondaryButtonState secondaryButtonState = state.getSecondaryButtonState();
        if (secondaryButtonState == null || (text = toText(secondaryButtonState.getTextResource())) == null) {
            return;
        }
        setSecondaryAction(text);
        onSecondaryActionClick(new Function0() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringBrokerageCashTransferConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringBrokerageCashTransferConfirmationFragment.setViewState$lambda$3$lambda$2(this.f$0, secondaryButtonState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$3$lambda$2(RecurringBrokerageCashTransferConfirmationFragment recurringBrokerageCashTransferConfirmationFragment, RecurringOrderConfirmationViewState.SecondaryButtonState secondaryButtonState) {
        EventLogger.DefaultImpls.logTap$default(recurringBrokerageCashTransferConfirmationFragment.getEventLogger(), UserInteractionEventData.Action.DISMISS, recurringBrokerageCashTransferConfirmationFragment.getEventScreen(), null, null, recurringBrokerageCashTransferConfirmationFragment.getEventContext(), false, 44, null);
        recurringBrokerageCashTransferConfirmationFragment.getCallbacks().onSecondaryButtonClicked(secondaryButtonState);
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringBrokerageCashTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Args;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "accountType", "Lrosetta/account/BrokerageAccountType;", "paycheckRecurringBrokerageCashStatus", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "<init>", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount;Lrosetta/account/BrokerageAccountType;Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;)V", "getAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "getAccountType", "()Lrosetta/account/BrokerageAccountType;", "getPaycheckRecurringBrokerageCashStatus", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType accountType;
        private final InvestmentScheduleAmount amount;
        private final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus;

        /* compiled from: RecurringBrokerageCashTransferConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((InvestmentScheduleAmount) parcel.readParcelable(Args.class.getClassLoader()), BrokerageAccountType.valueOf(parcel.readString()), (RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.accountType.name());
            dest.writeParcelable(this.paycheckRecurringBrokerageCashStatus, flags);
        }

        public Args(InvestmentScheduleAmount amount, BrokerageAccountType accountType, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(paycheckRecurringBrokerageCashStatus, "paycheckRecurringBrokerageCashStatus");
            this.amount = amount;
            this.accountType = accountType;
            this.paycheckRecurringBrokerageCashStatus = paycheckRecurringBrokerageCashStatus;
        }

        public final InvestmentScheduleAmount getAmount() {
            return this.amount;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus getPaycheckRecurringBrokerageCashStatus() {
            return this.paycheckRecurringBrokerageCashStatus;
        }
    }

    /* compiled from: RecurringBrokerageCashTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringBrokerageCashTransferConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringBrokerageCashTransferConfirmationFragment recurringBrokerageCashTransferConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringBrokerageCashTransferConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringBrokerageCashTransferConfirmationFragment newInstance(Args args) {
            return (RecurringBrokerageCashTransferConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringBrokerageCashTransferConfirmationFragment recurringBrokerageCashTransferConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringBrokerageCashTransferConfirmationFragment, args);
        }
    }
}
