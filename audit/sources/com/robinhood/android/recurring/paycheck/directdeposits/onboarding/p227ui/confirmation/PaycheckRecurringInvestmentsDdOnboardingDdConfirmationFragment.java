package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.GenericActionableInformationFragment;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.C26245R;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import java.util.Set;
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

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u00039:;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0016J\t\u00103\u001a\u000202H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u00060#j\u0002`$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment;", "Lcom/robinhood/android/common/GenericActionableInformationFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "callbacks", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setViewState", "state", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState;", "onBackPressed", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment extends GenericActionableInformationFragment implements RegionGated, AutoLoggableFragment {
    public EventLogger eventLogger;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.SYP_ONBOARDING_DD_CONFIRMATION, null, null, null, 14, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo.class);

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Callbacks;", "", "launchPaycheckRecurringInvestmentsFlow", "", "exitRecurringInvestmentsFlow", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void exitRecurringInvestmentsFlow();

        void launchPaycheckRecurringInvestmentsFlow();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
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

    private final PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo getDuxo() {
        return (PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo) this.duxo.getValue();
    }

    private final com.robinhood.rosetta.eventlogging.Context getEventContext() {
        return RhyGlobalLoggingContext.eventContext$default(getRhyGlobalLoggingContext(), RHYContext.ProductArea.CASH_ACCOUNTS, null, null, 6, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C262881(this));
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$onStart$1 */
    /* synthetic */ class C262881 extends FunctionReferenceImpl implements Function1<PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState, Unit> {
        C262881(Object obj) {
            super(1, obj, PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState) throws Resources.NotFoundException {
            invoke2(paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
        overrideConstraintWidthPercent(0.4f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState state) throws Resources.NotFoundException {
        PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.ConfirmationType confirmationType = state.getConfirmationType();
        setIllustration(toDrawableIllustration(confirmationType.getIllustration()));
        setTitle(toText(confirmationType.getTitle()));
        String string2 = getResources().getString(C26245R.string.paycheck_investment_dd_confirmation_description_syp_retirement);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        setDescription(toText(string2));
        setPrimaryAction(toText(confirmationType.getPrimaryAction()));
        setSecondaryActionStyle(C20690R.attr.secondaryButtonStyle);
        setSecondaryActionWidth(-1);
        StringResource secondaryActionText = state.getSecondaryActionText();
        setSecondaryAction(orEmpty(secondaryActionText != null ? toText(secondaryActionText) : null));
        setInfoBannerIconRes(Integer.valueOf(C20690R.drawable.ic_rds_info_filled_24dp));
        Integer bannerText = confirmationType.getBannerText();
        setInfoBannerText(bannerText != null ? toText(bannerText.intValue()) : null);
        onPrimaryActionClick(new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.setViewState$lambda$0(this.f$0);
            }
        });
        onSecondaryActionClick(new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.setViewState$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$0(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment) {
        EventLogger.DefaultImpls.logTap$default(paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.getEventLogger(), UserInteractionEventData.Action.CREATE_PAYCHECK_INVESTMENT, paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.getEventScreen(), null, null, paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.getEventContext(), false, 44, null);
        paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.getCallbacks().launchPaycheckRecurringInvestmentsFlow();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$1(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment) {
        EventLogger.DefaultImpls.logTap$default(paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.getEventLogger(), UserInteractionEventData.Action.DISMISS, paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.getEventScreen(), null, null, paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.getEventContext(), false, 44, null);
        paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.getCallbacks().exitRecurringInvestmentsFlow();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Args;", "Landroid/os/Parcelable;", "directDepositSource", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "<init>", "(Lcom/robinhood/android/common/directdeposit/DirectDepositSource;)V", "getDirectDepositSource", "()Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DirectDepositSource directDepositSource;

        /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(DirectDepositSource.valueOf(parcel.readString()));
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
            dest.writeString(this.directDepositSource.name());
        }

        public Args(DirectDepositSource directDepositSource) {
            Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
            this.directDepositSource = directDepositSource;
        }

        public final DirectDepositSource getDirectDepositSource() {
            return this.directDepositSource;
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Args;", "<init>", "()V", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment newInstance(Args args) {
            return (PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, paycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment, args);
        }
    }
}
