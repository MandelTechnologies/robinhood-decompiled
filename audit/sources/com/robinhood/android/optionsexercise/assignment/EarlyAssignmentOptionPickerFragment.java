package com.robinhood.android.optionsexercise.assignment;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.common.UiOptionInstrumentPositions2;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.OptionInstrumentContext;
import com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo;
import com.robinhood.android.optionsexercise.databinding.FragmentEarlyAssignmentOptionPickerBinding;
import com.robinhood.android.optionsexercise.education.OptionExerciseEducationContext;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: EarlyAssignmentOptionPickerFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u0003678B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020&H\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0002J\t\u0010/\u001a\u000200H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001d0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b\"\u0010#R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/robinhood/models/db/Quote;", "equityQuote", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "setEquityQuote", "(Lcom/robinhood/models/db/Quote;)V", "equityQuote$delegate", "Lkotlin/properties/ReadWriteProperty;", "binding", "Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentOptionPickerBinding;", "getBinding", "()Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentOptionPickerBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "listAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "Lcom/robinhood/models/db/OptionQuote;", "callbacks", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "refreshUi", "state", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo$EarlyAssignmentOptionPickerViewState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class EarlyAssignmentOptionPickerFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: equityQuote$delegate, reason: from kotlin metadata */
    private final Interfaces3 equityQuote;
    private final GenericListAdapter<RdsRowView, Tuples2<UiOptionInstrumentPosition, OptionQuote>> listAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EarlyAssignmentOptionPickerFragment.class, "equityQuote", "getEquityQuote()Lcom/robinhood/models/db/Quote;", 0)), Reflection.property1(new PropertyReference1Impl(EarlyAssignmentOptionPickerFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentOptionPickerBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EarlyAssignmentOptionPickerFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarlyAssignmentOptionPickerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Callbacks;", "", "onContinueOptionToBeExercisedPicker", "", "educationContext", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueOptionToBeExercisedPicker(OptionExerciseEducationContext educationContext);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public EarlyAssignmentOptionPickerFragment() {
        super(C24704R.layout.fragment_early_assignment_option_picker);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, EarlyAssignmentOptionPickerDuxo.class);
        this.equityQuote = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);
        this.binding = ViewBinding5.viewBinding(this, EarlyAssignmentOptionPickerFragment2.INSTANCE);
        this.listAdapter = GenericListAdapter.INSTANCE.m2985of(C13997R.layout.include_rds_row_with_divider, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyAssignmentOptionPickerFragment.listAdapter$lambda$0((Tuples2) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EarlyAssignmentOptionPickerFragment.listAdapter$lambda$2(this.f$0, (RdsRowView) obj, (Tuples2) obj2);
            }
        });
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final EarlyAssignmentOptionPickerDuxo getDuxo() {
        return (EarlyAssignmentOptionPickerDuxo) this.duxo.getValue();
    }

    private final Quote getEquityQuote() {
        return (Quote) this.equityQuote.getValue(this, $$delegatedProperties[0]);
    }

    private final void setEquityQuote(Quote quote) {
        this.equityQuote.setValue(this, $$delegatedProperties[0], quote);
    }

    private final FragmentEarlyAssignmentOptionPickerBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEarlyAssignmentOptionPickerBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object listAdapter$lambda$0(Tuples2 byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        UiOptionInstrumentPosition uiOptionInstrumentPosition = (UiOptionInstrumentPosition) byEquality.component1();
        OptionQuote optionQuote = (OptionQuote) byEquality.component2();
        return new Tuples3(uiOptionInstrumentPosition.getOptionInstrument().getId(), uiOptionInstrumentPosition.getOptionInstrumentPosition().getDisplayQuantity(), optionQuote != null ? optionQuote.getAdjustedMarkPrice() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listAdapter$lambda$2(final EarlyAssignmentOptionPickerFragment earlyAssignmentOptionPickerFragment, RdsRowView of, Tuples2 tuples2) {
        String string2;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final UiOptionInstrumentPosition uiOptionInstrumentPosition = (UiOptionInstrumentPosition) tuples2.component1();
        final OptionQuote optionQuote = (OptionQuote) tuples2.component2();
        OptionInstrument optionInstrument = uiOptionInstrumentPosition.getOptionInstrument();
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        of.setPrimaryText(OptionExtensions.getTitleString(optionInstrument, resources));
        Resources resources2 = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        of.setSecondaryText(UiOptionInstrumentPositions2.getSubtitleString(uiOptionInstrumentPosition, resources2));
        if (optionQuote != null) {
            string2 = Formats.getPriceFormat().format(optionQuote.getAdjustedMarkPrice().getUnsignedValue());
        } else {
            string2 = earlyAssignmentOptionPickerFragment.getString(C11048R.string.general_label_n_a_short);
            Intrinsics.checkNotNull(string2);
        }
        of.setMetadataPrimaryText(string2);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarlyAssignmentOptionPickerFragment.listAdapter$lambda$2$lambda$1(this.f$0, optionQuote, uiOptionInstrumentPosition);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listAdapter$lambda$2$lambda$1(EarlyAssignmentOptionPickerFragment earlyAssignmentOptionPickerFragment, OptionQuote optionQuote, UiOptionInstrumentPosition uiOptionInstrumentPosition) {
        Quote equityQuote = earlyAssignmentOptionPickerFragment.getEquityQuote();
        earlyAssignmentOptionPickerFragment.getCallbacks().onContinueOptionToBeExercisedPicker((optionQuote == null || equityQuote == null) ? null : OptionExerciseEducationContext.INSTANCE.from(uiOptionInstrumentPosition.getOptionInstrument(), optionQuote, equityQuote, uiOptionInstrumentPosition.getOptionChain().getLateCloseState()));
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().optionPickerRecyclerview.setAdapter(this.listAdapter);
        if (isInTabFragment()) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C247111(this));
    }

    /* compiled from: EarlyAssignmentOptionPickerFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment$onResume$1 */
    /* synthetic */ class C247111 extends FunctionReferenceImpl implements Function1<EarlyAssignmentOptionPickerDuxo.EarlyAssignmentOptionPickerViewState, Unit> {
        C247111(Object obj) {
            super(1, obj, EarlyAssignmentOptionPickerFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo$EarlyAssignmentOptionPickerViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EarlyAssignmentOptionPickerDuxo.EarlyAssignmentOptionPickerViewState earlyAssignmentOptionPickerViewState) {
            invoke2(earlyAssignmentOptionPickerViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EarlyAssignmentOptionPickerDuxo.EarlyAssignmentOptionPickerViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EarlyAssignmentOptionPickerFragment) this.receiver).refreshUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(EarlyAssignmentOptionPickerDuxo.EarlyAssignmentOptionPickerViewState state) {
        Quote quoteComponent1 = state.getEquityQuote();
        List<Tuples2<UiOptionInstrumentPosition, OptionQuote>> listComponent2 = state.component2();
        boolean zComponent3 = state.getShowLoadingView();
        setEquityQuote(quoteComponent1);
        if (zComponent3) {
            getBinding().loadingView.show();
            return;
        }
        getBinding().loadingView.hide();
        boolean zIsEmpty = listComponent2.isEmpty();
        LinearLayout optionPickerMainLayout = getBinding().optionPickerMainLayout;
        Intrinsics.checkNotNullExpressionValue(optionPickerMainLayout, "optionPickerMainLayout");
        optionPickerMainLayout.setVisibility(!zIsEmpty ? 0 : 8);
        LinearLayout optionPickerNoContractsLayout = getBinding().optionPickerNoContractsLayout;
        Intrinsics.checkNotNullExpressionValue(optionPickerNoContractsLayout, "optionPickerNoContractsLayout");
        optionPickerNoContractsLayout.setVisibility(zIsEmpty ? 0 : 8);
        if (zIsEmpty) {
            return;
        }
        this.listAdapter.submitList(listComponent2);
    }

    /* compiled from: EarlyAssignmentOptionPickerFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "assignedOptionInstrumentContext", "Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;)V", "getAccountNumber", "()Ljava/lang/String;", "getAssignedOptionInstrumentContext", "()Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final OptionInstrumentContext assignedOptionInstrumentContext;

        /* compiled from: EarlyAssignmentOptionPickerFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), OptionInstrumentContext.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, OptionInstrumentContext optionInstrumentContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                optionInstrumentContext = args.assignedOptionInstrumentContext;
            }
            return args.copy(str, optionInstrumentContext);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionInstrumentContext getAssignedOptionInstrumentContext() {
            return this.assignedOptionInstrumentContext;
        }

        public final Args copy(String accountNumber, OptionInstrumentContext assignedOptionInstrumentContext) {
            Intrinsics.checkNotNullParameter(assignedOptionInstrumentContext, "assignedOptionInstrumentContext");
            return new Args(accountNumber, assignedOptionInstrumentContext);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.assignedOptionInstrumentContext, args.assignedOptionInstrumentContext);
        }

        public int hashCode() {
            String str = this.accountNumber;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.assignedOptionInstrumentContext.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", assignedOptionInstrumentContext=" + this.assignedOptionInstrumentContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            this.assignedOptionInstrumentContext.writeToParcel(dest, flags);
        }

        public Args(String str, OptionInstrumentContext assignedOptionInstrumentContext) {
            Intrinsics.checkNotNullParameter(assignedOptionInstrumentContext, "assignedOptionInstrumentContext");
            this.accountNumber = str;
            this.assignedOptionInstrumentContext = assignedOptionInstrumentContext;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final OptionInstrumentContext getAssignedOptionInstrumentContext() {
            return this.assignedOptionInstrumentContext;
        }
    }

    /* compiled from: EarlyAssignmentOptionPickerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment;", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Args;", "<init>", "()V", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EarlyAssignmentOptionPickerFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EarlyAssignmentOptionPickerFragment earlyAssignmentOptionPickerFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, earlyAssignmentOptionPickerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EarlyAssignmentOptionPickerFragment newInstance(Args args) {
            return (EarlyAssignmentOptionPickerFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EarlyAssignmentOptionPickerFragment earlyAssignmentOptionPickerFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, earlyAssignmentOptionPickerFragment, args);
        }
    }
}
