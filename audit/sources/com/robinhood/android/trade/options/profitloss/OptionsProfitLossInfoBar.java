package com.robinhood.android.trade.options.profitloss;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.android.optionsplchart.databinding.MergeOptionsProfitLossInfoBarBinding;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarViewState;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
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

/* compiled from: OptionsProfitLossInfoBar.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00100\u001a\u00020%H\u0014J*\u00101\u001a\u00020%2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020%0'H\u0007J\u000e\u00102\u001a\u00020%2\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020%J\u000e\u00106\u001a\u00020%2\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020;H\u0002J\u001a\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010(H\u0002J\b\u0010@\u001a\u00020%H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020%\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010)\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020%0-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarDuxo;", "setDuxo", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarDuxo;)V", "chartExpandedCaretRotation", "", "chartCollapsedCaretRotation", "binding", "Lcom/robinhood/android/optionsplchart/databinding/MergeOptionsProfitLossInfoBarBinding;", "getBinding", "()Lcom/robinhood/android/optionsplchart/databinding/MergeOptionsProfitLossInfoBarBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "naString", "", "value", "", "caretHidden", "getCaretHidden", "()Z", "setCaretHidden", "(Z)V", "textEnabled", "getTextEnabled", "setTextEnabled", "onClickDefault", "Lkotlin/Function0;", "", "onClickError", "Lkotlin/Function1;", "", "chartExpanded", "getChartExpanded", "setChartExpanded", "shouldForceCollapseChartObs", "Lio/reactivex/Observable;", "getShouldForceCollapseChartObs", "()Lio/reactivex/Observable;", "onAttachedToWindow", "onInfoBarClick", "setParamsToRefresh", "paramsToBeRefreshed", "Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams;", "reset", "updateInfo", "profitLossAdditionalInfo", "Lcom/robinhood/android/trade/options/profitloss/ProfitLossAdditionalInfo;", "refreshUi", "state", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState;", "setOnClick", "loadingState", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState$InfoBarLoadingState;", "errorToDisplay", "clearText", "Companion", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionsProfitLossInfoBar extends Hammer_OptionsProfitLossInfoBar {
    private static final float DOWN = 180.0f;

    /* renamed from: UP */
    private static final float f4984UP = 0.0f;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final float chartCollapsedCaretRotation;
    private final float chartExpandedCaretRotation;
    public OptionsProfitLossInfoBarDuxo duxo;
    private final String naString;
    private Function0<Unit> onClickDefault;
    private Function1<? super Throwable, Unit> onClickError;
    private final Observable<Unit> shouldForceCollapseChartObs;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionsProfitLossInfoBar.class, "binding", "getBinding()Lcom/robinhood/android/optionsplchart/databinding/MergeOptionsProfitLossInfoBarBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: OptionsProfitLossInfoBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsProfitLossInfoBarViewState.InfoBarLoadingState.values().length];
            try {
                iArr[OptionsProfitLossInfoBarViewState.InfoBarLoadingState.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsProfitLossInfoBarViewState.InfoBarLoadingState.STALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsProfitLossInfoBarViewState.InfoBarLoadingState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionsProfitLossInfoBarViewState.InfoBarLoadingState.INITIAL_LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionsProfitLossInfoBarViewState.InfoBarLoadingState.RELOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ OptionsProfitLossInfoBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsProfitLossInfoBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, OptionsProfitLossInfoBar2.INSTANCE);
        this.naString = ViewsKt.getString(this, C11048R.string.general_label_n_a_short);
        ViewGroups.inflate(this, C24771R.layout.merge_options_profit_loss_info_bar, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C24771R.styleable.OptionsProfitLossInfoBar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C24771R.styleable.OptionsProfitLossInfoBar_defaultCaretDown, false);
        this.chartExpandedCaretRotation = z ? 0.0f : 180.0f;
        float f = z ? 180.0f : 0.0f;
        this.chartCollapsedCaretRotation = f;
        getBinding().optionsProfitLossInfoBarCaret.setRotation(f);
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        setFocusable(true);
        refreshUi(new OptionsProfitLossInfoBarViewState(null, null, null, null, null, 31, null));
        Observable<Unit> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar$shouldForceCollapseChartObs$1
            @Override // io.reactivex.functions.Function
            public final OptionsProfitLossInfoBarViewState.InfoBarLoadingState apply(OptionsProfitLossInfoBarViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoadingState();
            }
        }).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar$shouldForceCollapseChartObs$2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionsProfitLossInfoBarViewState.InfoBarLoadingState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !it.getCanShowChart();
            }
        }).map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar$shouldForceCollapseChartObs$3
            public final void apply(OptionsProfitLossInfoBarViewState.InfoBarLoadingState it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                apply((OptionsProfitLossInfoBarViewState.InfoBarLoadingState) obj);
                return Unit.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.shouldForceCollapseChartObs = map;
    }

    public final OptionsProfitLossInfoBarDuxo getDuxo() {
        OptionsProfitLossInfoBarDuxo optionsProfitLossInfoBarDuxo = this.duxo;
        if (optionsProfitLossInfoBarDuxo != null) {
            return optionsProfitLossInfoBarDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(OptionsProfitLossInfoBarDuxo optionsProfitLossInfoBarDuxo) {
        Intrinsics.checkNotNullParameter(optionsProfitLossInfoBarDuxo, "<set-?>");
        this.duxo = optionsProfitLossInfoBarDuxo;
    }

    private final MergeOptionsProfitLossInfoBarBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionsProfitLossInfoBarBinding) value;
    }

    private final boolean getCaretHidden() {
        Group optionsProfitLossCaretViews = getBinding().optionsProfitLossCaretViews;
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossCaretViews, "optionsProfitLossCaretViews");
        return optionsProfitLossCaretViews.getVisibility() == 4;
    }

    private final void setCaretHidden(boolean z) {
        Group optionsProfitLossCaretViews = getBinding().optionsProfitLossCaretViews;
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossCaretViews, "optionsProfitLossCaretViews");
        optionsProfitLossCaretViews.setVisibility(z ? 4 : 0);
        View optionsProfitLossInfoBarDividerCenter = getBinding().optionsProfitLossInfoBarDividerCenter;
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossInfoBarDividerCenter, "optionsProfitLossInfoBarDividerCenter");
        optionsProfitLossInfoBarDividerCenter.setVisibility(z ? 0 : 8);
    }

    private final boolean getTextEnabled() {
        return getBinding().optionsProfitLossInfoMaxProfitHeader.isEnabled();
    }

    private final void setTextEnabled(boolean z) {
        getBinding().optionsProfitLossInfoMaxProfitHeader.setEnabled(z);
        getBinding().optionsProfitLossInfoMaxProfit.setEnabled(z);
        getBinding().optionsProfitLossInfoBreakevenHeader.setEnabled(z);
        getBinding().optionsProfitLossInfoBreakeven.setEnabled(z);
        getBinding().optionsProfitLossInfoMaxLossHeader.setEnabled(z);
        getBinding().optionsProfitLossInfoMaxLoss.setEnabled(z);
    }

    public final boolean getChartExpanded() {
        return getBinding().optionsProfitLossInfoBarCaret.getRotation() == this.chartExpandedCaretRotation;
    }

    public final void setChartExpanded(boolean z) {
        getBinding().optionsProfitLossInfoBarCaret.setRotation(z ? this.chartExpandedCaretRotation : this.chartCollapsedCaretRotation);
    }

    public final Observable<Unit> getShouldForceCollapseChartObs() {
        return this.shouldForceCollapseChartObs;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new C298661(this));
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final Tuples2<OptionsProfitLossInfoBarViewState.InfoBarLoadingState, Optional<Throwable>> apply(OptionsProfitLossInfoBarViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(it.getLoadingState(), Optional3.asOptional(it.getErrorToDisplay()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossInfoBar.onAttachedToWindow$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* compiled from: OptionsProfitLossInfoBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar$onAttachedToWindow$1 */
    /* synthetic */ class C298661 extends FunctionReferenceImpl implements Function1<OptionsProfitLossInfoBarViewState, Unit> {
        C298661(Object obj) {
            super(1, obj, OptionsProfitLossInfoBar.class, "refreshUi", "refreshUi(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionsProfitLossInfoBarViewState optionsProfitLossInfoBarViewState) {
            invoke2(optionsProfitLossInfoBarViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionsProfitLossInfoBarViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionsProfitLossInfoBar) this.receiver).refreshUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(OptionsProfitLossInfoBar optionsProfitLossInfoBar, Tuples2 tuples2) {
        optionsProfitLossInfoBar.setOnClick((OptionsProfitLossInfoBarViewState.InfoBarLoadingState) tuples2.component1(), (Throwable) ((Optional) tuples2.component2()).getOrNull());
        return Unit.INSTANCE;
    }

    @Deprecated
    public final void onInfoBarClick(Function0<Unit> onClickDefault, Function1<? super Throwable, Unit> onClickError) {
        Intrinsics.checkNotNullParameter(onClickDefault, "onClickDefault");
        Intrinsics.checkNotNullParameter(onClickError, "onClickError");
        this.onClickDefault = onClickDefault;
        this.onClickError = onClickError;
    }

    public final void setParamsToRefresh(UserEnteredProfitLossParams paramsToBeRefreshed) {
        Intrinsics.checkNotNullParameter(paramsToBeRefreshed, "paramsToBeRefreshed");
        getDuxo().setParamsToRefresh(paramsToBeRefreshed);
    }

    public final void reset() {
        getDuxo().reset();
    }

    public final void updateInfo(ProfitLossAdditionalInfo profitLossAdditionalInfo) {
        Intrinsics.checkNotNullParameter(profitLossAdditionalInfo, "profitLossAdditionalInfo");
        getDuxo().submitProfitLossAdditionalInfo(profitLossAdditionalInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(OptionsProfitLossInfoBarViewState state) {
        setCaretHidden(state.getCaretHidden());
        setTextEnabled(state.getTextEnabled());
        if (state.getShouldClearText()) {
            clearText();
        }
        Group optionsProfitLossAdditionalInfoContainer = getBinding().optionsProfitLossAdditionalInfoContainer;
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossAdditionalInfoContainer, "optionsProfitLossAdditionalInfoContainer");
        optionsProfitLossAdditionalInfoContainer.setVisibility(state.getShouldShowExpectedProfitLoss() ? 4 : 0);
        Group optionsProfitLossExpectedProfitLossContainer = getBinding().optionsProfitLossExpectedProfitLossContainer;
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossExpectedProfitLossContainer, "optionsProfitLossExpectedProfitLossContainer");
        optionsProfitLossExpectedProfitLossContainer.setVisibility(state.getShouldShowExpectedProfitLoss() ? 0 : 4);
        RhTextView rhTextView = getBinding().optionsProfitLossExpectedProfitLossValue;
        CurrentProfitLoss currentProfitLoss = state.getCurrentProfitLoss();
        rhTextView.setText(currentProfitLoss != null ? currentProfitLoss.getProfitLossString() : null);
        if (state.getShouldUpdateInfoBarValues()) {
            RhTextView rhTextView2 = getBinding().optionsProfitLossInfoMaxLoss;
            InfoBarValues infoBarValues = state.getInfoBarValues();
            rhTextView2.setText(infoBarValues != null ? infoBarValues.getMaxLoss() : null);
            RhTextView rhTextView3 = getBinding().optionsProfitLossInfoMaxProfit;
            InfoBarValues infoBarValues2 = state.getInfoBarValues();
            rhTextView3.setText(infoBarValues2 != null ? infoBarValues2.getMaxProfit() : null);
            RhTextView rhTextView4 = getBinding().optionsProfitLossInfoBreakeven;
            InfoBarValues infoBarValues3 = state.getInfoBarValues();
            rhTextView4.setText(infoBarValues3 != null ? infoBarValues3.getBreakevenPoints() : null);
        }
    }

    private final void setOnClick(final OptionsProfitLossInfoBarViewState.InfoBarLoadingState loadingState, final Throwable errorToDisplay) {
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossInfoBar.setOnClick$lambda$2(loadingState, this, errorToDisplay);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClick$lambda$2(OptionsProfitLossInfoBarViewState.InfoBarLoadingState infoBarLoadingState, OptionsProfitLossInfoBar optionsProfitLossInfoBar, Throwable th) {
        Function1<? super Throwable, Unit> function1;
        int i = WhenMappings.$EnumSwitchMapping$0[infoBarLoadingState.ordinal()];
        if (i == 1 || i == 2) {
            Function0<Unit> function0 = optionsProfitLossInfoBar.onClickDefault;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (i != 3) {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (th != null && (function1 = optionsProfitLossInfoBar.onClickError) != null) {
            function1.invoke(th);
        }
        return Unit.INSTANCE;
    }

    private final void clearText() {
        getBinding().optionsProfitLossInfoMaxLoss.setText(this.naString);
        getBinding().optionsProfitLossInfoMaxProfit.setText(this.naString);
        getBinding().optionsProfitLossInfoBreakeven.setText(this.naString);
    }
}
