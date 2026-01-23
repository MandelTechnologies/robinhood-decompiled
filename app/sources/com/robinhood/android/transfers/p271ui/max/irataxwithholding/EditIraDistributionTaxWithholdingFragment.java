package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.DecimalLimitTextWatcher;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.DefaultNumberFormatter;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.databinding.FragmentEditIraDistributionTaxWithholdingBinding;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionMarginalRateTableActivity;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingEvent;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingLaunchMode;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p408rx.transformer.CharSequenceToBigDecimalTransformer;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0003>?@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020&H\u0016J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010*H\u0016J\u001a\u00101\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010*H\u0016J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\t\u00108\u001a\u00020-H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "duxo", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/transfers/databinding/FragmentEditIraDistributionTaxWithholdingBinding;", "getBinding", "()Lcom/robinhood/android/transfers/databinding/FragmentEditIraDistributionTaxWithholdingBinding;", "binding$delegate", "federalWithholdingFormat", "Lcom/robinhood/android/lib/formats/DefaultNumberFormatter;", "stateWithholdingFormat", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "setViewState", "viewState", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;", "bindSubmitAction", "submitAction", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState$SubmitAction;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "StateWithholdingTextWatcher", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EditIraDistributionTaxWithholdingFragment extends BaseFragment implements RegionGated {
    private static final String ARGS_CALCULATED_WITHHOLDING = "calculatedWithholding";
    private static final int MAX_STATE_WITHHOLDING_DECIMAL_PLACES = 2;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final DefaultNumberFormatter federalWithholdingFormat;
    public Markwon markwon;
    private final DefaultNumberFormatter stateWithholdingFormat;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EditIraDistributionTaxWithholdingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(EditIraDistributionTaxWithholdingFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/databinding/FragmentEditIraDistributionTaxWithholdingBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment$Callbacks;", "", "onEditIraDistributionTaxWithholding", "", "federalWithholdingPercent", "Ljava/math/BigDecimal;", "stateWithholdingPercent", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEditIraDistributionTaxWithholding(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent);
    }

    /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
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

    public EditIraDistributionTaxWithholdingFragment() {
        super(C30065R.layout.fragment_edit_ira_distribution_tax_withholding);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, EditIraDistributionTaxWithholdingDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EditIraDistributionTaxWithholdingFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, EditIraDistributionTaxWithholdingFragment2.INSTANCE);
        Locale locale = Locale.US;
        NumberFormat percentInstance = NumberFormat.getPercentInstance(locale);
        percentInstance.setMaximumFractionDigits(0);
        percentInstance.setMinimumFractionDigits(0);
        if (percentInstance instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
            decimalFormat.setPositiveSuffix("");
            decimalFormat.setNegativePrefix("");
        }
        Intrinsics.checkNotNullExpressionValue(percentInstance, "apply(...)");
        this.federalWithholdingFormat = new DefaultNumberFormatter(percentInstance);
        NumberFormat percentInstance2 = NumberFormat.getPercentInstance(locale);
        percentInstance2.setMaximumFractionDigits(0);
        percentInstance2.setMinimumFractionDigits(2);
        if (percentInstance2 instanceof DecimalFormat) {
            DecimalFormat decimalFormat2 = (DecimalFormat) percentInstance2;
            decimalFormat2.setPositiveSuffix("");
            decimalFormat2.setNegativePrefix("");
        }
        Intrinsics.checkNotNullExpressionValue(percentInstance2, "apply(...)");
        this.stateWithholdingFormat = new DefaultNumberFormatter(percentInstance2);
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditIraDistributionTaxWithholdingDuxo getDuxo() {
        return (EditIraDistributionTaxWithholdingDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentEditIraDistributionTaxWithholdingBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEditIraDistributionTaxWithholdingBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        RhEditText rhEditText;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final FragmentEditIraDistributionTaxWithholdingBinding binding = getBinding();
        Companion companion = INSTANCE;
        ApiTransferAccount.TransferAccountType account_type = ((EditIraDistributionTaxWithholdingLaunchMode) companion.getArgs((Fragment) this)).getIraDistributionTaxWithholding().getAccount_type();
        switch (WhenMappings.$EnumSwitchMapping$0[account_type.ordinal()]) {
            case 1:
                binding.fragmentEditIraDistributionTaxWithholdingSubtitle.setText(C30065R.string.transfer_ira_tax_withholding_subtitle);
                break;
            case 2:
                RhTextView fragmentEditIraDistributionTaxWithholdingSubtitle = binding.fragmentEditIraDistributionTaxWithholdingSubtitle;
                Intrinsics.checkNotNullExpressionValue(fragmentEditIraDistributionTaxWithholdingSubtitle, "fragmentEditIraDistributionTaxWithholdingSubtitle");
                int i = C30065R.string.transfer_ira_tax_withholding_subtitle;
                int i2 = C30065R.string.transfer_ira_tax_withholding_view_marginal_rates_table;
                String string2 = ViewsKt.getString(fragmentEditIraDistributionTaxWithholdingSubtitle, i);
                Integer numValueOf = Integer.valueOf(i2);
                if (numValueOf.intValue() == 0) {
                    numValueOf = null;
                }
                TextViewsKt.setTextWithLearnMore((TextView) fragmentEditIraDistributionTaxWithholdingSubtitle, (CharSequence) string2, true, true, numValueOf != null ? ViewsKt.getString(fragmentEditIraDistributionTaxWithholdingSubtitle, numValueOf.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$lambda$13$$inlined$setTextWithLearnMore$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IraDistributionMarginalRateTableActivity.Companion companion2 = IraDistributionMarginalRateTableActivity.INSTANCE;
                        Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        companion2.start(contextRequireContext);
                    }
                }, 1, (DefaultConstructorMarker) null));
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                throw new IllegalStateException(("Unexpected account type: " + account_type).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        binding.fragmentEditIraDistributionTaxWithholdingStateLabel.setText(getResources().getString(C30065R.string.transfer_ira_tax_withholding_state_tax_withholding, ((EditIraDistributionTaxWithholdingLaunchMode) companion.getArgs((Fragment) this)).getIraDistributionTaxWithholding().getState()));
        ConstraintLayout fragmentEditIraDistributionTaxWithholdingFederal = binding.fragmentEditIraDistributionTaxWithholdingFederal;
        Intrinsics.checkNotNullExpressionValue(fragmentEditIraDistributionTaxWithholdingFederal, "fragmentEditIraDistributionTaxWithholdingFederal");
        OnClickListeners.onClick(fragmentEditIraDistributionTaxWithholdingFederal, new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditIraDistributionTaxWithholdingFragment.onViewCreated$lambda$13$lambda$5(binding);
            }
        });
        ConstraintLayout fragmentEditIraDistributionTaxWithholdingState = binding.fragmentEditIraDistributionTaxWithholdingState;
        Intrinsics.checkNotNullExpressionValue(fragmentEditIraDistributionTaxWithholdingState, "fragmentEditIraDistributionTaxWithholdingState");
        OnClickListeners.onClick(fragmentEditIraDistributionTaxWithholdingState, new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditIraDistributionTaxWithholdingFragment.onViewCreated$lambda$13$lambda$8(binding);
            }
        });
        ApiIraDistributionTaxWithholding iraDistributionTaxWithholding = ((EditIraDistributionTaxWithholdingLaunchMode) companion.getArgs((Fragment) this)).getIraDistributionTaxWithholding();
        RhEditText rhEditText2 = binding.fragmentEditIraDistributionTaxWithholdingFederalPercentEdt;
        Intrinsics.checkNotNull(rhEditText2);
        InitialValueObservable<CharSequence> initialValueObservableTextChanges = RxTextView.textChanges(rhEditText2);
        CharSequenceToBigDecimalTransformer charSequenceToBigDecimalTransformer = CharSequenceToBigDecimalTransformer.INSTANCE;
        Observable observableDistinctUntilChanged = initialValueObservableTextChanges.compose(charSequenceToBigDecimalTransformer).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditIraDistributionTaxWithholdingFragment.onViewCreated$lambda$13$lambda$10$lambda$9(this.f$0, (Optional) obj);
            }
        });
        Editable text = rhEditText2.getText();
        if (text == null || text.length() == 0) {
            rhEditText2.setText(this.federalWithholdingFormat.format(iraDistributionTaxWithholding.getFederal_withholding_percent()));
        }
        RhEditText rhEditText3 = binding.fragmentEditIraDistributionTaxWithholdingStatePercentEdt;
        rhEditText3.addTextChangedListener(StateWithholdingTextWatcher.INSTANCE);
        Intrinsics.checkNotNull(rhEditText3);
        Observable observableDistinctUntilChanged2 = RxTextView.textChanges(rhEditText3).compose(charSequenceToBigDecimalTransformer).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditIraDistributionTaxWithholdingFragment.onViewCreated$lambda$13$lambda$12$lambda$11(this.f$0, (Optional) obj);
            }
        });
        Editable text2 = rhEditText3.getText();
        if (text2 == null || text2.length() == 0) {
            rhEditText3.setText(this.stateWithholdingFormat.format(iraDistributionTaxWithholding.getState_withholding_percent()));
        }
        EditIraDistributionTaxWithholdingLaunchMode editIraDistributionTaxWithholdingLaunchMode = (EditIraDistributionTaxWithholdingLaunchMode) companion.getArgs((Fragment) this);
        if (editIraDistributionTaxWithholdingLaunchMode instanceof EditIraDistributionTaxWithholdingLaunchMode.Federal) {
            rhEditText = binding.fragmentEditIraDistributionTaxWithholdingFederalPercentEdt;
        } else {
            if (!(editIraDistributionTaxWithholdingLaunchMode instanceof EditIraDistributionTaxWithholdingLaunchMode.State)) {
                throw new NoWhenBranchMatchedException();
            }
            rhEditText = binding.fragmentEditIraDistributionTaxWithholdingStatePercentEdt;
        }
        rhEditText.requestFocus();
        binding.fragmentEditIraDistributionTaxWithholdingNumpad.useDefaultKeyHandler();
        binding.fragmentEditIraDistributionTaxWithholdingNumpad.setButtonEnabled(false);
        BaseFragment.collectDuxoState$default(this, null, new C309452(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C309463(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C309474(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13$lambda$5(FragmentEditIraDistributionTaxWithholdingBinding fragmentEditIraDistributionTaxWithholdingBinding) {
        RhEditText rhEditText = fragmentEditIraDistributionTaxWithholdingBinding.fragmentEditIraDistributionTaxWithholdingFederalPercentEdt;
        rhEditText.requestFocus();
        Editable text = rhEditText.getText();
        if (text != null) {
            rhEditText.setSelection(text.length());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13$lambda$8(FragmentEditIraDistributionTaxWithholdingBinding fragmentEditIraDistributionTaxWithholdingBinding) {
        RhEditText rhEditText = fragmentEditIraDistributionTaxWithholdingBinding.fragmentEditIraDistributionTaxWithholdingStatePercentEdt;
        rhEditText.requestFocus();
        Editable text = rhEditText.getText();
        if (text != null) {
            rhEditText.setSelection(text.length());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13$lambda$10$lambda$9(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment, Optional optional) {
        BigDecimal bigDecimal = (BigDecimal) optional.component1();
        editIraDistributionTaxWithholdingFragment.getDuxo().setFederalWithholdingPercent(bigDecimal != null ? BigDecimals7.safeDivide(bigDecimal, new BigDecimal(100)) : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13$lambda$12$lambda$11(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment, Optional optional) {
        BigDecimal bigDecimal = (BigDecimal) optional.component1();
        editIraDistributionTaxWithholdingFragment.getDuxo().setStateWithholdingPercent(bigDecimal != null ? BigDecimals7.safeDivide(bigDecimal, new BigDecimal(100)) : null);
        return Unit.INSTANCE;
    }

    /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$2", m3645f = "EditIraDistributionTaxWithholdingFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$2 */
    static final class C309452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C309452(Continuation<? super C309452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EditIraDistributionTaxWithholdingFragment.this.new C309452(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C309452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ EditIraDistributionTaxWithholdingFragment $tmp0;

            AnonymousClass1(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment) {
                this.$tmp0 = editIraDistributionTaxWithholdingFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, EditIraDistributionTaxWithholdingFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setViewState = C309452.invokeSuspend$setViewState(this.$tmp0, editIraDistributionTaxWithholdingViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((EditIraDistributionTaxWithholdingViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EditIraDistributionTaxWithholdingViewState> stateFlow = EditIraDistributionTaxWithholdingFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EditIraDistributionTaxWithholdingFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment, EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, Continuation continuation) {
            editIraDistributionTaxWithholdingFragment.setViewState(editIraDistributionTaxWithholdingViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$3", m3645f = "EditIraDistributionTaxWithholdingFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$3 */
    static final class C309463 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C309463(Continuation<? super C309463> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EditIraDistributionTaxWithholdingFragment.this.new C309463(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C309463) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EditIraDistributionTaxWithholdingViewState> stateFlow = EditIraDistributionTaxWithholdingFragment.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<EditIraDistributionTaxWithholdingViewState.SubmitAction>() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$3$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EditIraDistributionTaxWithholdingViewState.SubmitAction> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2", m3645f = "EditIraDistributionTaxWithholdingFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                EditIraDistributionTaxWithholdingViewState.SubmitAction submitAction = ((EditIraDistributionTaxWithholdingViewState) obj).getSubmitAction();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(submitAction, anonymousClass1) == coroutine_suspended) {
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
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EditIraDistributionTaxWithholdingFragment.this);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$3$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ EditIraDistributionTaxWithholdingFragment $tmp0;

            AnonymousClass2(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment) {
                this.$tmp0 = editIraDistributionTaxWithholdingFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, EditIraDistributionTaxWithholdingFragment.class, "bindSubmitAction", "bindSubmitAction(Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState$SubmitAction;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(EditIraDistributionTaxWithholdingViewState.SubmitAction submitAction, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindSubmitAction = C309463.invokeSuspend$bindSubmitAction(this.$tmp0, submitAction, continuation);
                return objInvokeSuspend$bindSubmitAction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindSubmitAction : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((EditIraDistributionTaxWithholdingViewState.SubmitAction) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bindSubmitAction(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment, EditIraDistributionTaxWithholdingViewState.SubmitAction submitAction, Continuation continuation) {
            editIraDistributionTaxWithholdingFragment.bindSubmitAction(submitAction);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$4", m3645f = "EditIraDistributionTaxWithholdingFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$4 */
    static final class C309474 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C309474(Continuation<? super C309474> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EditIraDistributionTaxWithholdingFragment.this.new C309474(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C309474) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<EditIraDistributionTaxWithholdingEvent>> eventFlow = EditIraDistributionTaxWithholdingFragment.this.getDuxo().getEventFlow();
                final EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment = EditIraDistributionTaxWithholdingFragment.this;
                FlowCollector<? super Event<EditIraDistributionTaxWithholdingEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment.onViewCreated.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<EditIraDistributionTaxWithholdingEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<EditIraDistributionTaxWithholdingEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<EditIraDistributionTaxWithholdingEvent> eventConsumerInvoke;
                        EventConsumer<EditIraDistributionTaxWithholdingEvent> eventConsumerInvoke2;
                        if (event != null) {
                            final EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment2 = editIraDistributionTaxWithholdingFragment;
                            if ((event.getData() instanceof EditIraDistributionTaxWithholdingEvent.Error) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$4$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m19908invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19908invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        EditIraDistributionTaxWithholdingEvent.Error error = (EditIraDistributionTaxWithholdingEvent.Error) event.getData();
                                        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                                        FragmentActivity fragmentActivityRequireActivity = editIraDistributionTaxWithholdingFragment2.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error.getThrowable(), true, false, 0, null, 56, null);
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment3 = editIraDistributionTaxWithholdingFragment;
                            if ((event.getData() instanceof EditIraDistributionTaxWithholdingEvent.Submit) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$onViewCreated$4$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19909invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19909invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ApiIraDistributionTaxWithholding iraDistributionTaxWithholding = ((EditIraDistributionTaxWithholdingEvent.Submit) event.getData()).getIraDistributionTaxWithholding();
                                        ApiIraDistributionTaxWithholding.DistributionAlert post_edit_alert = iraDistributionTaxWithholding.getPost_edit_alert();
                                        if (post_edit_alert != null) {
                                            EventLogger.DefaultImpls.logAppear$default(editIraDistributionTaxWithholdingFragment3.getEventLogger(), null, new Screen(Screen.Name.EDIT_IRA_TAX_WITHHOLDINGS, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, post_edit_alert.getLogging_identifier(), null, 4, null), null, null, 25, null);
                                            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                                            Context contextRequireContext = editIraDistributionTaxWithholdingFragment3.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                            RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C30065R.id.dialog_id_ira_distribution_post_edit).setTitle(post_edit_alert.getTitle()).setMessage(editIraDistributionTaxWithholdingFragment3.getMarkwon().toMarkdown(post_edit_alert.getBody_markdown())).setPositiveButton(post_edit_alert.getConfirm_button_title()).setNegativeButton(post_edit_alert.getDismiss_button_title());
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelable("calculatedWithholding", iraDistributionTaxWithholding);
                                            RhDialogFragment.Builder passthroughArgs = negativeButton.setPassthroughArgs(bundle);
                                            FragmentManager childFragmentManager = editIraDistributionTaxWithholdingFragment3.getChildFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                            RhDialogFragment.Builder.show$default(passthroughArgs, childFragmentManager, post_edit_alert.getLogging_identifier(), false, 4, null);
                                            return;
                                        }
                                        editIraDistributionTaxWithholdingFragment3.getCallbacks().onEditIraDistributionTaxWithholding(iraDistributionTaxWithholding.getFederal_withholding_percent(), iraDistributionTaxWithholding.getState_withholding_percent());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ViewsKt.hideKeyboard$default(viewRequireView, false, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30065R.id.dialog_id_ira_distribution_post_edit) {
            ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding = passthroughArgs != null ? (ApiIraDistributionTaxWithholding) passthroughArgs.getParcelable(ARGS_CALCULATED_WITHHOLDING) : null;
            if (apiIraDistributionTaxWithholding == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ApiIraDistributionTaxWithholding.DistributionAlert post_edit_alert = apiIraDistributionTaxWithholding.getPost_edit_alert();
            String logging_identifier = post_edit_alert != null ? post_edit_alert.getLogging_identifier() : null;
            if (logging_identifier == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, logging_identifier, null, 4, null), null, null, false, 56, null);
            getCallbacks().onEditIraDistributionTaxWithholding(apiIraDistributionTaxWithholding.getFederal_withholding_percent(), apiIraDistributionTaxWithholding.getState_withholding_percent());
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding;
        ApiIraDistributionTaxWithholding.DistributionAlert post_edit_alert;
        if (id != C30065R.id.dialog_id_ira_distribution_post_edit) {
            return super.onNegativeButtonClicked(id, passthroughArgs);
        }
        String logging_identifier = (passthroughArgs == null || (apiIraDistributionTaxWithholding = (ApiIraDistributionTaxWithholding) passthroughArgs.getParcelable(ARGS_CALCULATED_WITHHOLDING)) == null || (post_edit_alert = apiIraDistributionTaxWithholding.getPost_edit_alert()) == null) ? null : post_edit_alert.getLogging_identifier();
        if (logging_identifier == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, logging_identifier, null, 4, null), null, null, false, 56, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(EditIraDistributionTaxWithholdingViewState viewState) {
        FragmentEditIraDistributionTaxWithholdingBinding binding = getBinding();
        binding.fragmentEditIraDistributionTaxWithholdingFederalPercentEdt.setEnabled(!viewState.isLoading());
        binding.fragmentEditIraDistributionTaxWithholdingStatePercentEdt.setEnabled(!viewState.isLoading());
        binding.fragmentEditIraDistributionTaxWithholdingNumpad.setButtonLoading(viewState.isLoading());
        RhTextView rhTextView = binding.fragmentEditIraDistributionTaxWithholdingFederalAmount;
        StringResource federalAmountText = viewState.getFederalAmountText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(federalAmountText.getText(resources));
        RhTextView rhTextView2 = binding.fragmentEditIraDistributionTaxWithholdingStateAmount;
        StringResource stateAmountText = viewState.getStateAmountText();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(stateAmountText.getText(resources2));
        RhTextView rhTextView3 = binding.fragmentEditIraDistributionTaxWithholdingTotalAmount;
        StringResource totalAmountText = viewState.getTotalAmountText();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rhTextView3.setText(totalAmountText.getText(resources3));
        RhTextView rhTextView4 = binding.fragmentEditIraDistributionTaxWithholdingReceivedAmount;
        StringResource receivedAmountText = viewState.getReceivedAmountText();
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        rhTextView4.setText(receivedAmountText.getText(resources4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindSubmitAction(final EditIraDistributionTaxWithholdingViewState.SubmitAction submitAction) {
        FragmentEditIraDistributionTaxWithholdingBinding binding = getBinding();
        if (submitAction == null) {
            binding.fragmentEditIraDistributionTaxWithholdingNumpad.setButtonEnabled(false);
            binding.fragmentEditIraDistributionTaxWithholdingNumpad.setOnButtonClick(null);
        } else {
            binding.fragmentEditIraDistributionTaxWithholdingNumpad.setButtonEnabled(true);
            binding.fragmentEditIraDistributionTaxWithholdingNumpad.setOnButtonClick(new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditIraDistributionTaxWithholdingFragment.bindSubmitAction$lambda$16$lambda$15(this.f$0, submitAction);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSubmitAction$lambda$16$lambda$15(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment, EditIraDistributionTaxWithholdingViewState.SubmitAction submitAction) {
        editIraDistributionTaxWithholdingFragment.getDuxo().submitTaxWithholding(submitAction.getFederalWithholdingPercent(), submitAction.getStateWithholdingPercent());
        return Unit.INSTANCE;
    }

    /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment$StateWithholdingTextWatcher;", "Lcom/robinhood/android/common/util/DecimalLimitTextWatcher;", "<init>", "()V", "getAllowedScale", "", "input", "Ljava/math/BigDecimal;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class StateWithholdingTextWatcher extends DecimalLimitTextWatcher {
        public static final StateWithholdingTextWatcher INSTANCE = new StateWithholdingTextWatcher();

        @Override // com.robinhood.android.common.util.DecimalLimitTextWatcher
        public int getAllowedScale(BigDecimal input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return 2;
        }

        private StateWithholdingTextWatcher() {
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingFragment;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode;", "<init>", "()V", "MAX_STATE_WITHHOLDING_DECIMAL_PLACES", "", "ARGS_CALCULATED_WITHHOLDING", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EditIraDistributionTaxWithholdingFragment, EditIraDistributionTaxWithholdingLaunchMode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EditIraDistributionTaxWithholdingLaunchMode getArgs(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment) {
            return (EditIraDistributionTaxWithholdingLaunchMode) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, editIraDistributionTaxWithholdingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EditIraDistributionTaxWithholdingFragment newInstance(EditIraDistributionTaxWithholdingLaunchMode editIraDistributionTaxWithholdingLaunchMode) {
            return (EditIraDistributionTaxWithholdingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, editIraDistributionTaxWithholdingLaunchMode);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EditIraDistributionTaxWithholdingFragment editIraDistributionTaxWithholdingFragment, EditIraDistributionTaxWithholdingLaunchMode editIraDistributionTaxWithholdingLaunchMode) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, editIraDistributionTaxWithholdingFragment, editIraDistributionTaxWithholdingLaunchMode);
        }
    }
}
