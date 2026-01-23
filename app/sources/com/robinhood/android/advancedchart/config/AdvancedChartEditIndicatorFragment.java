package com.robinhood.android.advancedchart.config;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.advanced.chart.IndicatorTypes;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorViewState2;
import com.robinhood.android.advancedchart.databinding.FragmentAdvancedChartEditIndicatorBinding;
import com.robinhood.android.advancedchart.databinding.IncludeEditIndicatorInfoFooterBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: AdvancedChartEditIndicatorFragment.kt */
@Metadata(m3635d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0011\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001eH\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorDuxo;", "getDuxo", "()Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartEditIndicatorBinding;", "getBinding", "()Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartEditIndicatorBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "attributeListAdapter", "com/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorFragment$attributeListAdapter$1", "Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorFragment$attributeListAdapter$1;", "infoFooterAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartEditIndicatorFragment extends BaseFragment {
    private final AdvancedChartEditIndicatorFragment2 attributeListAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final CompositeAdapter compositeAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final SingleItemAdapter<RhTextView, ApiTechnicalIndicator.Type> infoFooterAdapter;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvancedChartEditIndicatorFragment.class, "binding", "getBinding()Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartEditIndicatorBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AdvancedChartEditIndicatorFragment() {
        super(C8502R.layout.fragment_advanced_chart_edit_indicator);
        this.duxo = OldDuxos.oldDuxo(this, AdvancedChartEditIndicatorDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AdvancedChartEditIndicatorFragment4.INSTANCE);
        Inflater inflaterInclude = Inflater.INSTANCE.include(C8502R.layout.include_edit_indicator_row);
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        AdvancedChartEditIndicatorFragment2 advancedChartEditIndicatorFragment2 = new AdvancedChartEditIndicatorFragment2(this, inflaterInclude, DiffCallbacks.Equality.INSTANCE);
        this.attributeListAdapter = advancedChartEditIndicatorFragment2;
        SingleItemAdapter<RhTextView, ApiTechnicalIndicator.Type> singleItemAdapterOf$default = SingleItemAdapter.Companion.of$default(SingleItemAdapter.INSTANCE, C8502R.layout.include_edit_indicator_info_footer, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedChartEditIndicatorFragment.infoFooterAdapter$lambda$1(this.f$0, (RhTextView) obj, (ApiTechnicalIndicator.Type) obj2);
            }
        }, 2, (Object) null);
        this.infoFooterAdapter = singleItemAdapterOf$default;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{advancedChartEditIndicatorFragment2, singleItemAdapterOf$default});
        this.useDesignSystemToolbar = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvancedChartEditIndicatorDuxo getDuxo() {
        return (AdvancedChartEditIndicatorDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAdvancedChartEditIndicatorBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAdvancedChartEditIndicatorBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit infoFooterAdapter$lambda$1(final AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment, RhTextView of, ApiTechnicalIndicator.Type indicatorType) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(indicatorType, "indicatorType");
        IncludeEditIndicatorInfoFooterBinding includeEditIndicatorInfoFooterBindingBind = IncludeEditIndicatorInfoFooterBinding.bind(of);
        Intrinsics.checkNotNullExpressionValue(includeEditIndicatorInfoFooterBindingBind, "bind(...)");
        RhTextView infoFooter = includeEditIndicatorInfoFooterBindingBind.infoFooter;
        Intrinsics.checkNotNullExpressionValue(infoFooter, "infoFooter");
        String string2 = ViewsKt.getString(infoFooter, IndicatorTypes.getInfoContentResId(indicatorType));
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore((TextView) infoFooter, (CharSequence) string2, true, true, num != null ? ViewsKt.getString(infoFooter, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$infoFooterAdapter$lambda$1$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string3 = this.this$0.getString(C8502R.string.advanced_chart_learn_more_url);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string3);
            }
        }, 1, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireActivity().getWindow().setSoftInputMode(2);
        Companion companion = INSTANCE;
        ApiTechnicalIndicator.Type indicatorType = AdvancedChartEditIndicatorDuxo2.getIndicatorType(((AdvancedChartEditIndicatorFragmentKey) companion.getArgs((Fragment) this)).getLaunchMode());
        List<TechnicalIndicatorConfigAttribute> configAttributeList = AdvancedChartEditIndicatorDuxo2.getConfigAttributeList(((AdvancedChartEditIndicatorFragmentKey) companion.getArgs((Fragment) this)).getLaunchMode());
        getBinding().title.setText(getString(IndicatorTypes.getFullNameResId(indicatorType)));
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.compositeAdapter);
        this.infoFooterAdapter.setData(indicatorType);
        this.attributeListAdapter.submitList(configAttributeList);
        RdsButton doneBtn = getBinding().doneBtn;
        Intrinsics.checkNotNullExpressionValue(doneBtn, "doneBtn");
        OnClickListeners.onClick(doneBtn, new Function0() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartEditIndicatorFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$onViewCreated$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((AdvancedChartEditIndicatorViewState) it).getResultEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C8515xf7fefedd<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorFragment.onViewCreated$lambda$5(this.f$0, (UiEvent) obj);
            }
        });
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$onViewCreated$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((AdvancedChartEditIndicatorViewState) it).getAttributeList().isEmpty());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorFragment.onViewCreated$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        getBinding().numpad.useDefaultKeyHandler();
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment) {
        advancedChartEditIndicatorFragment.getBinding().doneBtn.setLoading(true);
        advancedChartEditIndicatorFragment.getDuxo().validateAndSaveApiTechnicalIndicator();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(final AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment, UiEvent resultEvent) {
        Intrinsics.checkNotNullParameter(resultEvent, "resultEvent");
        final AdvancedChartEditIndicatorViewState2 advancedChartEditIndicatorViewState2 = (AdvancedChartEditIndicatorViewState2) resultEvent.consume();
        if (advancedChartEditIndicatorViewState2 != null) {
            advancedChartEditIndicatorFragment.getBinding().doneBtn.setLoading(false);
            if (advancedChartEditIndicatorViewState2 instanceof AdvancedChartEditIndicatorViewState2.Success) {
                advancedChartEditIndicatorFragment.requireActivity().finish();
            } else if (advancedChartEditIndicatorViewState2 instanceof AdvancedChartEditIndicatorViewState2.NetworkError) {
                final FragmentActivity fragmentActivityRequireActivity = advancedChartEditIndicatorFragment.requireActivity();
                AbsErrorHandler.handleError$default(new ActivityErrorHandler(advancedChartEditIndicatorViewState2, fragmentActivityRequireActivity) { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$onViewCreated$3$1$1
                    final /* synthetic */ AdvancedChartEditIndicatorViewState2 $result;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(fragmentActivityRequireActivity, false, 0, null, 14, null);
                        Intrinsics.checkNotNull(fragmentActivityRequireActivity);
                    }

                    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
                    public boolean handleErrorResponse(ErrorResponse errorResponse) {
                        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                        Context context = this.this$0.getContext();
                        AppCompatActivity appCompatActivityRequireActivityBaseContext = context != null ? BaseContexts.requireActivityBaseContext(context) : null;
                        if (appCompatActivityRequireActivityBaseContext == null || appCompatActivityRequireActivityBaseContext.isFinishing()) {
                            return super.handleErrorResponse(errorResponse);
                        }
                        GenericErrorResponse genericErrorResponse = (GenericErrorResponse) errorResponse;
                        String title = genericErrorResponse.getTitle();
                        String displayMessage = genericErrorResponse.getDisplayMessage();
                        Integer httpStatusCode = Throwables.getHttpStatusCode(((AdvancedChartEditIndicatorViewState2.NetworkError) this.$result).getThrowable());
                        boolean z = httpStatusCode != null && httpStatusCode.intValue() == 422;
                        if (title != null && displayMessage != null && z) {
                            RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(appCompatActivityRequireActivityBaseContext).setId(C11048R.id.dialog_id_generic_error).setTitle(title).setMessage(displayMessage);
                            FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            RhDialogFragment.Builder.show$default(message, supportFragmentManager, "error", false, 4, null);
                            this.this$0.getDuxo().logIndicatorUpdateError(((AdvancedChartEditIndicatorFragmentKey) AdvancedChartEditIndicatorFragment.INSTANCE.getArgs((Fragment) this.this$0)).getInstrumentId(), displayMessage);
                            return true;
                        }
                        return super.handleErrorResponse(errorResponse);
                    }

                    @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
                    protected void showShortError(String message) {
                        Intrinsics.checkNotNullParameter(message, "message");
                        showLongError(message);
                    }
                }, ((AdvancedChartEditIndicatorViewState2.NetworkError) advancedChartEditIndicatorViewState2).getThrowable(), false, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment, boolean z) {
        RdsNumpadView numpad = advancedChartEditIndicatorFragment.getBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        numpad.setVisibility(!z ? 0 : 8);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        ScarletManager.removeOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE.getPriority(), null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        View viewFindViewById = toolbar.findViewById(C8502R.id.delete_indicator_toolbar_custom_view);
        if ((((AdvancedChartEditIndicatorFragmentKey) INSTANCE.getArgs((Fragment) this)).getLaunchMode() instanceof AdvancedChartEditIndicatorLaunchMode.Editing) && viewFindViewById == null) {
            RhToolbar.addCustomView$default(toolbar, C8502R.layout.toolbar_delete_indicator_button, false, 8388613, 2, null);
            RdsTextButton rdsTextButton = (RdsTextButton) toolbar.findViewById(C8502R.id.delete_indicator_btn);
            if (rdsTextButton != null) {
                OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvancedChartEditIndicatorFragment.configureToolbar$lambda$8(this.f$0);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$8(AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment) {
        advancedChartEditIndicatorFragment.getBinding().doneBtn.setLoading(true);
        advancedChartEditIndicatorFragment.getDuxo().deleteApiTechnicalIndicator();
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartEditIndicatorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorFragment;", "<init>", "()V", "createFragment", "key", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AdvancedChartEditIndicatorFragmentKey>, FragmentWithArgsCompanion<AdvancedChartEditIndicatorFragment, AdvancedChartEditIndicatorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvancedChartEditIndicatorFragmentKey getArgs(AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment) {
            return (AdvancedChartEditIndicatorFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advancedChartEditIndicatorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvancedChartEditIndicatorFragment newInstance(AdvancedChartEditIndicatorFragmentKey advancedChartEditIndicatorFragmentKey) {
            return (AdvancedChartEditIndicatorFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, advancedChartEditIndicatorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment, AdvancedChartEditIndicatorFragmentKey advancedChartEditIndicatorFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advancedChartEditIndicatorFragment, advancedChartEditIndicatorFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AdvancedChartEditIndicatorFragment createFragment(AdvancedChartEditIndicatorFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AdvancedChartEditIndicatorFragment) AdvancedChartEditIndicatorFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
