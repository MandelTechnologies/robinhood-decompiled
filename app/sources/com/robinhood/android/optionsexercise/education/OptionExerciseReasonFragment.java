package com.robinhood.android.optionsexercise.education;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionExerciseReasonFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000223B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020&H\u0002J\t\u0010,\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseReasonFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "assignmentRow", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "getAssignmentRow", "()Lcom/robinhood/android/designsystem/row/RdsRowView;", "assignmentRow$delegate", "liquidityRow", "getLiquidityRow", "liquidityRow$delegate", "executionRow", "getExecutionRow", "executionRow$delegate", OptionExerciseReasonFragment.ARG_OPTION_INSTRUMENT, "Lcom/robinhood/models/db/OptionInstrument;", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument$delegate", "Lkotlin/Lazy;", OptionExerciseReasonFragment.ARG_IS_ETF_ENABLED, "", "()Z", "isEtfEnabled$delegate", "callbacks", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseReasonFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsexercise/education/OptionExerciseReasonFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindOptionInstrument", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExerciseReasonFragment extends BaseFragment implements RegionGated {
    private static final String ARG_IS_ETF_ENABLED = "isEtfEnabled";
    private static final String ARG_OPTION_INSTRUMENT = "optionInstrument";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: assignmentRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 assignmentRow;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: executionRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 executionRow;

    /* renamed from: isEtfEnabled$delegate, reason: from kotlin metadata */
    private final Lazy isEtfEnabled;

    /* renamed from: liquidityRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 liquidityRow;

    /* renamed from: optionInstrument$delegate, reason: from kotlin metadata */
    private final Lazy optionInstrument;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionExerciseReasonFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseReasonFragment.class, "assignmentRow", "getAssignmentRow()Lcom/robinhood/android/designsystem/row/RdsRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseReasonFragment.class, "liquidityRow", "getLiquidityRow()Lcom/robinhood/android/designsystem/row/RdsRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseReasonFragment.class, "executionRow", "getExecutionRow()Lcom/robinhood/android/designsystem/row/RdsRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExerciseReasonFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsexercise/education/OptionExerciseReasonFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionExerciseReasonFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseReasonFragment$Callbacks;", "", "onContinueReason", "", "reason", "Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueReason(ApiOptionExerciseRequest.Reason reason);
    }

    /* compiled from: OptionExerciseReasonFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
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

    public OptionExerciseReasonFragment() {
        super(C24704R.layout.fragment_option_exercise_reason);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.titleTxt = bindView(C24704R.id.exercise_reason_title);
        this.assignmentRow = bindView(C24704R.id.exercise_reason_assignment_row);
        this.liquidityRow = bindView(C24704R.id.exercise_reason_liquidity_row);
        this.executionRow = bindView(C24704R.id.exercise_reason_execution_row);
        this.optionInstrument = Fragments2.argument(this, ARG_OPTION_INSTRUMENT);
        this.isEtfEnabled = Fragments2.argument(this, ARG_IS_ETF_ENABLED);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsexercise.education.OptionExerciseReasonFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsRowView getAssignmentRow() {
        return (RdsRowView) this.assignmentRow.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsRowView getLiquidityRow() {
        return (RdsRowView) this.liquidityRow.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsRowView getExecutionRow() {
        return (RdsRowView) this.executionRow.getValue(this, $$delegatedProperties[3]);
    }

    private final OptionInstrument getOptionInstrument() {
        return (OptionInstrument) this.optionInstrument.getValue();
    }

    private final boolean isEtfEnabled() {
        return ((Boolean) this.isEtfEnabled.getValue()).booleanValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[4]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OnClickListeners.onClick(getAssignmentRow(), new Function0() { // from class: com.robinhood.android.optionsexercise.education.OptionExerciseReasonFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionExerciseReasonFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        OnClickListeners.onClick(getLiquidityRow(), new Function0() { // from class: com.robinhood.android.optionsexercise.education.OptionExerciseReasonFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionExerciseReasonFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        OnClickListeners.onClick(getExecutionRow(), new Function0() { // from class: com.robinhood.android.optionsexercise.education.OptionExerciseReasonFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionExerciseReasonFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        bindOptionInstrument();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionExerciseReasonFragment optionExerciseReasonFragment) {
        optionExerciseReasonFragment.getCallbacks().onContinueReason(ApiOptionExerciseRequest.Reason.EARLY_ASSIGNMENT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionExerciseReasonFragment optionExerciseReasonFragment) {
        optionExerciseReasonFragment.getCallbacks().onContinueReason(ApiOptionExerciseRequest.Reason.LIQUIDITY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(OptionExerciseReasonFragment optionExerciseReasonFragment) {
        ApiOptionExerciseRequest.Reason reason;
        int i = WhenMappings.$EnumSwitchMapping$0[optionExerciseReasonFragment.getOptionInstrument().getContractType().ordinal()];
        if (i == 1) {
            reason = ApiOptionExerciseRequest.Reason.BUYING_STOCKS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            reason = ApiOptionExerciseRequest.Reason.HEDGING_POSITION;
        }
        optionExerciseReasonFragment.getCallbacks().onContinueReason(reason);
        return Unit.INSTANCE;
    }

    private final void bindOptionInstrument() {
        String string2;
        String string3;
        String string4;
        String chainSymbol = getOptionInstrument().getChainSymbol();
        Money money = Money3.toMoney(getOptionInstrument().getStrikePrice(), Currencies.USD);
        OptionContractType contractType = getOptionInstrument().getContractType();
        String str = OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(getOptionInstrument().getExpirationDate());
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[contractType.ordinal()];
        if (i == 1) {
            getExecutionRow().setPrimaryText(getString(C24704R.string.exercise_education_call_execution_label));
            RdsRowView executionRow = getExecutionRow();
            if (isEtfEnabled()) {
                string2 = getString(C24704R.string.exercise_education_call_execution_description);
            } else {
                string2 = getString(C24704R.string.exercise_education_call_execution_description_without_etf);
            }
            executionRow.setSecondaryText(string2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getExecutionRow().setPrimaryText(getString(C24704R.string.exercise_education_put_execution_label));
            RdsRowView executionRow2 = getExecutionRow();
            if (isEtfEnabled()) {
                string4 = getString(C24704R.string.exercise_education_put_execution_description);
            } else {
                string4 = getString(C24704R.string.exercise_education_put_execution_description_without_etf);
            }
            executionRow2.setSecondaryText(string4);
        }
        int i2 = iArr[contractType.ordinal()];
        if (i2 == 1) {
            string3 = getString(C11048R.string.option_contract_type_call);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string3 = getString(C11048R.string.option_contract_type_put);
        }
        Intrinsics.checkNotNull(string3);
        getTitleTxt().setText(getString(C24704R.string.exercise_education_reason_title, chainSymbol, Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null), string3, str));
    }

    /* compiled from: OptionExerciseReasonFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExerciseReasonFragment$Companion;", "", "<init>", "()V", "ARG_OPTION_INSTRUMENT", "", "ARG_IS_ETF_ENABLED", "newInstance", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseReasonFragment;", OptionExerciseReasonFragment.ARG_OPTION_INSTRUMENT, "Lcom/robinhood/models/db/OptionInstrument;", OptionExerciseReasonFragment.ARG_IS_ETF_ENABLED, "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionExerciseReasonFragment newInstance(OptionInstrument optionInstrument, boolean isEtfEnabled) {
            Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
            OptionExerciseReasonFragment optionExerciseReasonFragment = new OptionExerciseReasonFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(OptionExerciseReasonFragment.ARG_OPTION_INSTRUMENT, optionInstrument);
            bundle.putBoolean(OptionExerciseReasonFragment.ARG_IS_ETF_ENABLED, isEtfEnabled);
            optionExerciseReasonFragment.setArguments(bundle);
            return optionExerciseReasonFragment;
        }
    }
}
