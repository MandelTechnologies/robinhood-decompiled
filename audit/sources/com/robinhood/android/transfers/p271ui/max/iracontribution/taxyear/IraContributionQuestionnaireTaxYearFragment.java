package com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.autoeventlogging.VisibleAutoLoggableViewManager;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.databinding.FragmentIraContributionQuestionnaireBinding;
import com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment;
import com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear.TaxYearViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.MarkdownWithTrailingAction;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Year;

/* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003KLJB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\"\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010@\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "selectionStyle", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState$SelectionRow;", "getTaxYearAdapter", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;)Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState;", "viewState", "", "updateView", "(Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lio/noties/markwon/Markwon;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Callbacks;", "callbacks", "Lcom/robinhood/android/transfers/databinding/FragmentIraContributionQuestionnaireBinding;", "viewBinding$delegate", "getViewBinding", "()Lcom/robinhood/android/transfers/databinding/FragmentIraContributionQuestionnaireBinding;", "viewBinding", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearDuxo;", "duxo", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "navigationRowAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsRadioButtonRowView;", "radioButtonRowAdapter", "Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "j$/time/Year", "navigationRowVisibleItemsManager", "Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "radioButtonVisibleItemsManager", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "Args", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class IraContributionQuestionnaireTaxYearFragment extends BaseRhBottomSheetDialogHostFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;
    private final GenericListAdapter<RdsRowView, TaxYearViewState.SelectionRow> navigationRowAdapter;
    private VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> navigationRowVisibleItemsManager;
    private final GenericListAdapter<RdsRadioButtonRowView, TaxYearViewState.SelectionRow> radioButtonRowAdapter;
    private VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> radioButtonVisibleItemsManager;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IraContributionQuestionnaireTaxYearFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(IraContributionQuestionnaireTaxYearFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/transfers/databinding/FragmentIraContributionQuestionnaireBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Callbacks;", "", "j$/time/Year", "taxYear", "Lcom/robinhood/models/util/Money;", "contributionLimit", "", "onTaxYearSelected", "(Lj$/time/Year;Lcom/robinhood/models/util/Money;)V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTaxYearSelected(Year taxYear, Money contributionLimit);
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public IraContributionQuestionnaireTaxYearFragment() {
        super(C30065R.layout.fragment_ira_contribution_questionnaire);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof IraContributionQuestionnaireTaxYearFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.viewBinding = ViewBinding5.viewBinding(this, IraContributionQuestionnaireTaxYearFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, IraContributionQuestionnaireTaxYearDuxo.class);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.navigationRowAdapter = companion.m2987of(companion2, diffCallbacks.byEquality(new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireTaxYearFragment.navigationRowAdapter$lambda$0((TaxYearViewState.SelectionRow) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IraContributionQuestionnaireTaxYearFragment.navigationRowAdapter$lambda$3(this.f$0, (RdsRowView) obj, (TaxYearViewState.SelectionRow) obj2);
            }
        });
        this.radioButtonRowAdapter = companion.m2987of(RdsRadioButtonRowView.INSTANCE, diffCallbacks.byEquality(new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireTaxYearFragment.radioButtonRowAdapter$lambda$4((TaxYearViewState.SelectionRow) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IraContributionQuestionnaireTaxYearFragment.radioButtonRowAdapter$lambda$7(this.f$0, (RdsRadioButtonRowView) obj, (TaxYearViewState.SelectionRow) obj2);
            }
        });
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.SELECT_RETIREMENT_TAX_YEAR, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentIraContributionQuestionnaireBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentIraContributionQuestionnaireBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IraContributionQuestionnaireTaxYearDuxo getDuxo() {
        return (IraContributionQuestionnaireTaxYearDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object navigationRowAdapter$lambda$0(TaxYearViewState.SelectionRow byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getTaxYear().getTax_year();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigationRowAdapter$lambda$3(final IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment, RdsRowView of, TaxYearViewState.SelectionRow row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        final ApiIraContributionQuestionnaire.TaxYearRow taxYear = row.getTaxYear();
        of.setPrimaryText(taxYear.getTitle());
        of.setSecondaryText(taxYear.getSubtitle());
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IraContributionQuestionnaireTaxYearFragment.navigationRowAdapter$lambda$3$lambda$1(taxYear);
            }
        }, 1, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IraContributionQuestionnaireTaxYearFragment.navigationRowAdapter$lambda$3$lambda$2(this.f$0, taxYear);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor navigationRowAdapter$lambda$3$lambda$1(ApiIraContributionQuestionnaire.TaxYearRow taxYearRow) {
        return new UserInteractionEventDescriptor(taxYearRow.getLogging_identifier(), null, null, null, new Component(Component.ComponentType.ROW, taxYearRow.getLogging_identifier(), null, 4, null), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigationRowAdapter$lambda$3$lambda$2(IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment, ApiIraContributionQuestionnaire.TaxYearRow taxYearRow) {
        iraContributionQuestionnaireTaxYearFragment.getDuxo().onYearSelected(taxYearRow);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object radioButtonRowAdapter$lambda$4(TaxYearViewState.SelectionRow byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getTaxYear().getTax_year();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit radioButtonRowAdapter$lambda$7(final IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment, RdsRadioButtonRowView of, TaxYearViewState.SelectionRow row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        final ApiIraContributionQuestionnaire.TaxYearRow taxYear = row.getTaxYear();
        of.setPrimaryText(taxYear.getTitle());
        of.setSecondaryText(taxYear.getSubtitle());
        of.setChecked(row.isChecked());
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IraContributionQuestionnaireTaxYearFragment.radioButtonRowAdapter$lambda$7$lambda$5(taxYear);
            }
        }, 1, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IraContributionQuestionnaireTaxYearFragment.radioButtonRowAdapter$lambda$7$lambda$6(this.f$0, taxYear);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor radioButtonRowAdapter$lambda$7$lambda$5(ApiIraContributionQuestionnaire.TaxYearRow taxYearRow) {
        return new UserInteractionEventDescriptor(taxYearRow.getLogging_identifier(), null, null, null, new Component(Component.ComponentType.ROW, taxYearRow.getLogging_identifier(), null, 4, null), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit radioButtonRowAdapter$lambda$7$lambda$6(IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment, ApiIraContributionQuestionnaire.TaxYearRow taxYearRow) {
        iraContributionQuestionnaireTaxYearFragment.getDuxo().onYearSelected(taxYearRow);
        return Unit.INSTANCE;
    }

    private final GenericListAdapter<? extends RdsRippleContainerView, TaxYearViewState.SelectionRow> getTaxYearAdapter(IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle) {
        if (selectionStyle == IraContributionQuestionnaireLaunchMode.SelectionStyle.RADIO_BUTTON) {
            return this.radioButtonRowAdapter;
        }
        return this.navigationRowAdapter;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.navigationRowAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager = IraContributionQuestionnaireTaxYearFragment.this.navigationRowVisibleItemsManager;
                if (visibleAutoLoggableViewManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationRowVisibleItemsManager");
                    visibleAutoLoggableViewManager = null;
                }
                visibleAutoLoggableViewManager.update();
            }
        });
        this.radioButtonRowAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment.onCreate.2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager = IraContributionQuestionnaireTaxYearFragment.this.radioButtonVisibleItemsManager;
                if (visibleAutoLoggableViewManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("radioButtonVisibleItemsManager");
                    visibleAutoLoggableViewManager = null;
                }
                visibleAutoLoggableViewManager.update();
            }
        });
        getLifecycleScope().launchWhenCreated(new C309043(null));
        getLifecycleScope().launchWhenCreated(new C309054(null));
    }

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$3", m3645f = "IraContributionQuestionnaireTaxYearFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$3 */
    static final class C309043 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C309043(Continuation<? super C309043> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IraContributionQuestionnaireTaxYearFragment.this.new C309043(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C309043) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<TaxYearViewState> stateFlow = IraContributionQuestionnaireTaxYearFragment.this.getDuxo().getStateFlow();
                final IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment = IraContributionQuestionnaireTaxYearFragment.this;
                FlowCollector<? super TaxYearViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment.onCreate.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((TaxYearViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(TaxYearViewState taxYearViewState, Continuation<? super Unit> continuation) {
                        ApiIraContributionQuestionnaire.TaxYearRow taxYearRowConsume;
                        iraContributionQuestionnaireTaxYearFragment.updateView(taxYearViewState);
                        UiEvent<ApiIraContributionQuestionnaire.TaxYearRow> yearSelectedEvent = taxYearViewState.getYearSelectedEvent();
                        if (yearSelectedEvent != null && (taxYearRowConsume = yearSelectedEvent.consume()) != null) {
                            iraContributionQuestionnaireTaxYearFragment.getCallbacks().onTaxYearSelected(taxYearRowConsume.getTax_year(), taxYearRowConsume.getContribution_limit());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4", m3645f = "IraContributionQuestionnaireTaxYearFragment.kt", m3646l = {150}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4 */
    static final class C309054 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C309054(Continuation<? super C309054> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IraContributionQuestionnaireTaxYearFragment.this.new C309054(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C309054) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<TaxYearViewState> stateFlow = IraContributionQuestionnaireTaxYearFragment.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<TaxYearViewState.ContinueAction>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super TaxYearViewState.ContinueAction> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "IraContributionQuestionnaireTaxYearFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                TaxYearViewState.ContinueAction continueAction = ((TaxYearViewState) obj).getContinueAction();
                                if (continueAction != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(continueAction, anonymousClass1) == coroutine_suspended) {
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
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(IraContributionQuestionnaireTaxYearFragment.this);
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

        /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements FlowCollector {
            final /* synthetic */ IraContributionQuestionnaireTaxYearFragment this$0;

            AnonymousClass2(IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment) {
                this.this$0 = iraContributionQuestionnaireTaxYearFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((TaxYearViewState.ContinueAction) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(final TaxYearViewState.ContinueAction continueAction, Continuation<? super Unit> continuation) {
                RdsButton rdsButton = this.this$0.getViewBinding().iraContributionQuestionnaireContinue;
                final IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment = this.this$0;
                Intrinsics.checkNotNull(rdsButton);
                rdsButton.setVisibility(0);
                OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IraContributionQuestionnaireTaxYearFragment.C309054.AnonymousClass2.emit$lambda$2$lambda$0(iraContributionQuestionnaireTaxYearFragment, continueAction);
                    }
                });
                ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onCreate$4$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IraContributionQuestionnaireTaxYearFragment.C309054.AnonymousClass2.emit$lambda$2$lambda$1();
                    }
                }, 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit emit$lambda$2$lambda$0(IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment, TaxYearViewState.ContinueAction continueAction) {
                iraContributionQuestionnaireTaxYearFragment.getCallbacks().onTaxYearSelected(continueAction.getTaxYear().getTax_year(), continueAction.getTaxYear().getContribution_limit());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final UserInteractionEventDescriptor emit$lambda$2$lambda$1() {
                return new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null);
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView iraContributionQuestionnaireRecyclerview = getViewBinding().iraContributionQuestionnaireRecyclerview;
        Intrinsics.checkNotNullExpressionValue(iraContributionQuestionnaireRecyclerview, "iraContributionQuestionnaireRecyclerview");
        RecyclerView.LayoutManager layoutManager = iraContributionQuestionnaireRecyclerview.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        this.navigationRowVisibleItemsManager = new VisibleAutoLoggableViewManager<>(layoutManager, new C309061(this.navigationRowAdapter), new C309072(this.navigationRowAdapter), new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireTaxYearFragment.onViewCreated$lambda$8((TaxYearViewState.SelectionRow) obj);
            }
        }, true, false, 32, null);
        RecyclerView.LayoutManager layoutManager2 = iraContributionQuestionnaireRecyclerview.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager2);
        this.radioButtonVisibleItemsManager = new VisibleAutoLoggableViewManager<>(layoutManager2, new C309084(this.radioButtonRowAdapter), new C309095(this.radioButtonRowAdapter), new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireTaxYearFragment.onViewCreated$lambda$9((TaxYearViewState.SelectionRow) obj);
            }
        }, true, false, 32, null);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(iraContributionQuestionnaireRecyclerview), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireTaxYearFragment.onViewCreated$lambda$10(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
    }

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onViewCreated$1 */
    /* synthetic */ class C309061 extends FunctionReferenceImpl implements Function0<Integer> {
        C309061(Object obj) {
            super(0, obj, GenericListAdapter.class, "getItemCount", "getItemCount()I", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(((GenericListAdapter) this.receiver).getSize());
        }
    }

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onViewCreated$2 */
    /* synthetic */ class C309072 extends FunctionReferenceImpl implements Function1<Integer, TaxYearViewState.SelectionRow> {
        C309072(Object obj) {
            super(1, obj, GenericListAdapter.class, "getItem", "getItem(I)Ljava/lang/Object;", 0);
        }

        public final TaxYearViewState.SelectionRow invoke(int i) {
            return (TaxYearViewState.SelectionRow) ((GenericListAdapter) this.receiver).getItem(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TaxYearViewState.SelectionRow invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Year onViewCreated$lambda$8(TaxYearViewState.SelectionRow VisibleAutoLoggableViewManager) {
        Intrinsics.checkNotNullParameter(VisibleAutoLoggableViewManager, "$this$VisibleAutoLoggableViewManager");
        return VisibleAutoLoggableViewManager.getTaxYear().getTax_year();
    }

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onViewCreated$4 */
    /* synthetic */ class C309084 extends FunctionReferenceImpl implements Function0<Integer> {
        C309084(Object obj) {
            super(0, obj, GenericListAdapter.class, "getItemCount", "getItemCount()I", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(((GenericListAdapter) this.receiver).getSize());
        }
    }

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$onViewCreated$5 */
    /* synthetic */ class C309095 extends FunctionReferenceImpl implements Function1<Integer, TaxYearViewState.SelectionRow> {
        C309095(Object obj) {
            super(1, obj, GenericListAdapter.class, "getItem", "getItem(I)Ljava/lang/Object;", 0);
        }

        public final TaxYearViewState.SelectionRow invoke(int i) {
            return (TaxYearViewState.SelectionRow) ((GenericListAdapter) this.receiver).getItem(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TaxYearViewState.SelectionRow invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Year onViewCreated$lambda$9(TaxYearViewState.SelectionRow VisibleAutoLoggableViewManager) {
        Intrinsics.checkNotNullParameter(VisibleAutoLoggableViewManager, "$this$VisibleAutoLoggableViewManager");
        return VisibleAutoLoggableViewManager.getTaxYear().getTax_year();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager = iraContributionQuestionnaireTaxYearFragment.navigationRowVisibleItemsManager;
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager2 = null;
        if (visibleAutoLoggableViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationRowVisibleItemsManager");
            visibleAutoLoggableViewManager = null;
        }
        visibleAutoLoggableViewManager.update();
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager3 = iraContributionQuestionnaireTaxYearFragment.radioButtonVisibleItemsManager;
        if (visibleAutoLoggableViewManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButtonVisibleItemsManager");
        } else {
            visibleAutoLoggableViewManager2 = visibleAutoLoggableViewManager3;
        }
        visibleAutoLoggableViewManager2.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateView(TaxYearViewState viewState) {
        getViewBinding().iraContributionQuestionnaireTitle.setText(viewState.getTitle());
        getViewBinding().iraContributionQuestionnaireDisclosure.setBottomsheetPresenterFn(new Function2() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IraContributionQuestionnaireTaxYearFragment.updateView$lambda$11(this.f$0, (GenericAlertContent) obj, (SduiActionHandler6) obj2);
            }
        });
        getViewBinding().iraContributionQuestionnaireDisclosure.bind((MarkdownWithTrailingAction<? extends GenericAction>) viewState.getDisclosureMarkdown());
        GenericListAdapter<? extends RdsRippleContainerView, TaxYearViewState.SelectionRow> taxYearAdapter = getTaxYearAdapter(viewState.getSelectionStyle());
        taxYearAdapter.submitList(viewState.getSelectionRows());
        RecyclerView recyclerView = getViewBinding().iraContributionQuestionnaireRecyclerview;
        if (!Intrinsics.areEqual(recyclerView.getAdapter(), taxYearAdapter)) {
            recyclerView.setAdapter(taxYearAdapter);
        }
        RhTextView iraContributionQuestionnaireSubtitle = getViewBinding().iraContributionQuestionnaireSubtitle;
        Intrinsics.checkNotNullExpressionValue(iraContributionQuestionnaireSubtitle, "iraContributionQuestionnaireSubtitle");
        TextViewsKt.setVisibilityText(iraContributionQuestionnaireSubtitle, viewState.getSubtitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateView$lambda$11(IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment, GenericAlertContent alert, SduiActionHandler6 callbacks) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        SduiAlertKt.presentSduiAlertSheet(iraContributionQuestionnaireTaxYearFragment, iraContributionQuestionnaireTaxYearFragment.getMarkwon(), alert, callbacks, (1016 & 8) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: INVOKE 
              (r14v0 'iraContributionQuestionnaireTaxYearFragment' com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment)
              (wrap:io.noties.markwon.Markwon:0x000c: INVOKE 
              (r14v0 'iraContributionQuestionnaireTaxYearFragment' com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment)
             VIRTUAL call: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:205))
              (r15v0 'alert' com.robinhood.models.serverdriven.experimental.api.GenericAlertContent)
              (r16v0 'callbacks' com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCallbacks)
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
             STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment.updateView$lambda$11(com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCallbacks):kotlin.Unit, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            java.lang.String r0 = "alert"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "callbacks"
            r4 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            io.noties.markwon.Markwon r2 = r14.getMarkwon()
            r12 = 1016(0x3f8, float:1.424E-42)
            r13 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r1 = r14
            r3 = r15
            com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment.updateView$lambda$11(com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiCallbacks):kotlin.Unit");
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager = this.navigationRowVisibleItemsManager;
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager2 = null;
        if (visibleAutoLoggableViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationRowVisibleItemsManager");
            visibleAutoLoggableViewManager = null;
        }
        visibleAutoLoggableViewManager.update();
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager3 = this.radioButtonVisibleItemsManager;
        if (visibleAutoLoggableViewManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButtonVisibleItemsManager");
        } else {
            visibleAutoLoggableViewManager2 = visibleAutoLoggableViewManager3;
        }
        visibleAutoLoggableViewManager2.update();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager = this.navigationRowVisibleItemsManager;
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager2 = null;
        if (visibleAutoLoggableViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationRowVisibleItemsManager");
            visibleAutoLoggableViewManager = null;
        }
        visibleAutoLoggableViewManager.clear();
        VisibleAutoLoggableViewManager<Year, TaxYearViewState.SelectionRow> visibleAutoLoggableViewManager3 = this.radioButtonVisibleItemsManager;
        if (visibleAutoLoggableViewManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButtonVisibleItemsManager");
        } else {
            visibleAutoLoggableViewManager2 = visibleAutoLoggableViewManager3;
        }
        visibleAutoLoggableViewManager2.clear();
    }

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Args;", "Landroid/os/Parcelable;", "taxYearViewModel", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearViewModel;", "selectionStyle", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearViewModel;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;)V", "getTaxYearViewModel", "()Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearViewModel;", "getSelectionStyle", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode$SelectionStyle;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle;
        private final ApiIraContributionQuestionnaire.TaxYearViewModel taxYearViewModel;

        /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiIraContributionQuestionnaire.TaxYearViewModel) parcel.readParcelable(Args.class.getClassLoader()), IraContributionQuestionnaireLaunchMode.SelectionStyle.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiIraContributionQuestionnaire.TaxYearViewModel taxYearViewModel, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                taxYearViewModel = args.taxYearViewModel;
            }
            if ((i & 2) != 0) {
                selectionStyle = args.selectionStyle;
            }
            return args.copy(taxYearViewModel, selectionStyle);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiIraContributionQuestionnaire.TaxYearViewModel getTaxYearViewModel() {
            return this.taxYearViewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final IraContributionQuestionnaireLaunchMode.SelectionStyle getSelectionStyle() {
            return this.selectionStyle;
        }

        public final Args copy(ApiIraContributionQuestionnaire.TaxYearViewModel taxYearViewModel, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle) {
            Intrinsics.checkNotNullParameter(taxYearViewModel, "taxYearViewModel");
            Intrinsics.checkNotNullParameter(selectionStyle, "selectionStyle");
            return new Args(taxYearViewModel, selectionStyle);
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
            return Intrinsics.areEqual(this.taxYearViewModel, args.taxYearViewModel) && this.selectionStyle == args.selectionStyle;
        }

        public int hashCode() {
            return (this.taxYearViewModel.hashCode() * 31) + this.selectionStyle.hashCode();
        }

        public String toString() {
            return "Args(taxYearViewModel=" + this.taxYearViewModel + ", selectionStyle=" + this.selectionStyle + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.taxYearViewModel, flags);
            dest.writeString(this.selectionStyle.name());
        }

        public Args(ApiIraContributionQuestionnaire.TaxYearViewModel taxYearViewModel, IraContributionQuestionnaireLaunchMode.SelectionStyle selectionStyle) {
            Intrinsics.checkNotNullParameter(taxYearViewModel, "taxYearViewModel");
            Intrinsics.checkNotNullParameter(selectionStyle, "selectionStyle");
            this.taxYearViewModel = taxYearViewModel;
            this.selectionStyle = selectionStyle;
        }

        public final ApiIraContributionQuestionnaire.TaxYearViewModel getTaxYearViewModel() {
            return this.taxYearViewModel;
        }

        public final IraContributionQuestionnaireLaunchMode.SelectionStyle getSelectionStyle() {
            return this.selectionStyle;
        }
    }

    /* compiled from: IraContributionQuestionnaireTaxYearFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<IraContributionQuestionnaireTaxYearFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, iraContributionQuestionnaireTaxYearFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IraContributionQuestionnaireTaxYearFragment newInstance(Args args) {
            return (IraContributionQuestionnaireTaxYearFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IraContributionQuestionnaireTaxYearFragment iraContributionQuestionnaireTaxYearFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, iraContributionQuestionnaireTaxYearFragment, args);
        }
    }
}
