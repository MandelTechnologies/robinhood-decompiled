package com.robinhood.android.optionsexercise.assignment;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.databinding.FragmentEarlyAssignmentActionBinding;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EarlyAssignmentActionFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0003&'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\t\u0010 \u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000b\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", EarlyAssignmentActionFragment.ARG_CONTRACT_TYPE, "Lcom/robinhood/models/db/OptionContractType;", "getContractType", "()Lcom/robinhood/models/db/OptionContractType;", "contractType$delegate", "Lkotlin/Lazy;", EarlyAssignmentActionFragment.ARG_IS_UK, "", "()Z", "isUk$delegate", "bindings", "Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentActionBinding;", "getBindings", "()Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentActionBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Action", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class EarlyAssignmentActionFragment extends BaseFragment implements RegionGated {
    private static final String ARG_CONTRACT_TYPE = "contractType";
    private static final String ARG_IS_UK = "isUk";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: contractType$delegate, reason: from kotlin metadata */
    private final Lazy contractType;

    /* renamed from: isUk$delegate, reason: from kotlin metadata */
    private final Lazy isUk;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarlyAssignmentActionFragment.class, "bindings", "getBindings()Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentActionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EarlyAssignmentActionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarlyAssignmentActionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Callbacks;", "", "onContinueAction", "", "action", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Action;", "onClickSeeComparison", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClickSeeComparison();

        void onContinueAction(Action action);
    }

    /* compiled from: EarlyAssignmentActionFragment.kt */
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

    public EarlyAssignmentActionFragment() {
        super(C24704R.layout.fragment_early_assignment_action);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.contractType = Fragments2.argument(this, ARG_CONTRACT_TYPE);
        this.isUk = Fragments2.argument(this, ARG_IS_UK);
        this.bindings = ViewBinding5.viewBinding(this, EarlyAssignmentActionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final OptionContractType getContractType() {
        return (OptionContractType) this.contractType.getValue();
    }

    private final boolean isUk() {
        return ((Boolean) this.isUk.getValue()).booleanValue();
    }

    private final FragmentEarlyAssignmentActionBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEarlyAssignmentActionBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsRowView earlyAssignmentActionExerciseRow = getBindings().earlyAssignmentActionExerciseRow;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentActionExerciseRow, "earlyAssignmentActionExerciseRow");
        OnClickListeners.onClick(earlyAssignmentActionExerciseRow, new Function0() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarlyAssignmentActionFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsRowView rdsRowView = getBindings().earlyAssignmentActionTradeUnderlyingRow;
        int i = WhenMappings.$EnumSwitchMapping$0[getContractType().ordinal()];
        if (i == 1) {
            rdsRowView.setPrimaryText(getString(C24704R.string.early_assignment_action_buy_underlying_title));
            Intrinsics.checkNotNull(rdsRowView);
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EarlyAssignmentActionFragment.onViewCreated$lambda$3$lambda$1(this.f$0);
                }
            });
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rdsRowView.setPrimaryText(getString(C24704R.string.early_assignment_action_sell_underlying_title));
            Intrinsics.checkNotNull(rdsRowView);
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EarlyAssignmentActionFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
                }
            });
        }
        RhTextView rhTextView = getBindings().earlyAssignmentActionExerciseDescription;
        if (isUk()) {
            string2 = getString(C24704R.string.early_assignment_action_description_gb);
        } else {
            string2 = getString(C24704R.string.early_assignment_action_description);
        }
        rhTextView.setText(string2);
        RdsButton rdsButton = getBindings().earlyAssignmentActionSeeComparisonBtn;
        if (isUk()) {
            string3 = getString(C24704R.string.early_assignment_see_comparison_label_gb);
        } else {
            string3 = getString(C24704R.string.early_assignment_see_comparison_label);
        }
        rdsButton.setText(string3);
        RdsButton earlyAssignmentActionSeeComparisonBtn = getBindings().earlyAssignmentActionSeeComparisonBtn;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentActionSeeComparisonBtn, "earlyAssignmentActionSeeComparisonBtn");
        OnClickListeners.onClick(earlyAssignmentActionSeeComparisonBtn, new Function0() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarlyAssignmentActionFragment.onViewCreated$lambda$4(this.f$0);
            }
        });
        RhTextView rhTextView2 = getBindings().earlyAssignmentActionContactSupport;
        String string4 = getString(C24704R.string.early_assignment_action_contact_support_prefix);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = getString(C24704R.string.early_assignment_action_contact_support_link_text);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        ActionSpan actionSpan = new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment$onViewCreated$$inlined$buildTextWithClickableLink$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, null, false, 6, null);
            }
        }, 1, (DefaultConstructorMarker) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string4);
        spannableStringBuilder.append(' ');
        List listMutableListOf = CollectionsKt.mutableListOf(actionSpan);
        listMutableListOf.add(new StyleSpan(1));
        Object[] array2 = listMutableListOf.toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string5);
        for (Object obj : objArrCopyOf) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        rhTextView2.setText(new SpannedString(spannableStringBuilder));
        if (isInTabFragment()) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(EarlyAssignmentActionFragment earlyAssignmentActionFragment) {
        earlyAssignmentActionFragment.getCallbacks().onContinueAction(Action.EXERCISE_CONTRACTS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$1(EarlyAssignmentActionFragment earlyAssignmentActionFragment) {
        earlyAssignmentActionFragment.getCallbacks().onContinueAction(Action.BUY_UNDERLYING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(EarlyAssignmentActionFragment earlyAssignmentActionFragment) {
        earlyAssignmentActionFragment.getCallbacks().onContinueAction(Action.SELL_UNDERLYING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(EarlyAssignmentActionFragment earlyAssignmentActionFragment) {
        earlyAssignmentActionFragment.getCallbacks().onClickSeeComparison();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EarlyAssignmentActionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Action;", "", "<init>", "(Ljava/lang/String;I)V", "EXERCISE_CONTRACTS", "BUY_UNDERLYING", "SELL_UNDERLYING", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action EXERCISE_CONTRACTS = new Action("EXERCISE_CONTRACTS", 0);
        public static final Action BUY_UNDERLYING = new Action("BUY_UNDERLYING", 1);
        public static final Action SELL_UNDERLYING = new Action("SELL_UNDERLYING", 2);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{EXERCISE_CONTRACTS, BUY_UNDERLYING, SELL_UNDERLYING};
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i) {
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* compiled from: EarlyAssignmentActionFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Companion;", "", "<init>", "()V", "ARG_CONTRACT_TYPE", "", "ARG_IS_UK", "newInstance", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment;", EarlyAssignmentActionFragment.ARG_CONTRACT_TYPE, "Lcom/robinhood/models/db/OptionContractType;", EarlyAssignmentActionFragment.ARG_IS_UK, "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EarlyAssignmentActionFragment newInstance(OptionContractType contractType, boolean isUk) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            EarlyAssignmentActionFragment earlyAssignmentActionFragment = new EarlyAssignmentActionFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(EarlyAssignmentActionFragment.ARG_CONTRACT_TYPE, contractType);
            bundle.putBoolean(EarlyAssignmentActionFragment.ARG_IS_UK, isUk);
            earlyAssignmentActionFragment.setArguments(bundle);
            return earlyAssignmentActionFragment;
        }
    }
}
