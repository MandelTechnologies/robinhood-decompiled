package com.robinhood.android.lib.trade.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.common.p088ui.view.UniformWidthVerticalLayout;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.databinding.MergeTradeBarOverlayBinding;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: TradeBarOverlayView.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 |2\u00020\u0001:\u0002{|B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u0010\u0010K\u001a\u00020\u00112\b\b\u0002\u0010L\u001a\u00020:J\b\u0010M\u001a\u00020\u0011H\u0016J\b\u0010N\u001a\u00020\u0011H\u0016J0\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020 2\u0006\u0010R\u001a\u00020 2\u0006\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020 H\u0014J\u0010\u0010U\u001a\u00020\u00112\u0006\u0010V\u001a\u00020:H\u0016J\b\u0010W\u001a\u00020\u0011H\u0016J\b\u0010X\u001a\u00020\u0011H\u0016J\b\u0010Y\u001a\u00020\u0011H\u0016J\b\u0010Z\u001a\u00020\u0011H\u0016J\u0006\u0010[\u001a\u00020\u0011J$\u0010\\\u001a\u00020\u00112\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`J\u001a\u0010b\u001a\u00020\u00112\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010a\u001a\u0004\u0018\u00010`J,\u0010c\u001a\u00020\u00112\b\u0010d\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010e\u001a\u00020fJ\"\u0010g\u001a\u00020\u00112\b\u0010d\u001a\u0004\u0018\u00010^2\b\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010e\u001a\u00020fJ\u000e\u0010h\u001a\u00020\u00112\u0006\u0010i\u001a\u00020jJ\u0018\u0010k\u001a\b\u0012\u0004\u0012\u00020m0l*\b\u0012\u0004\u0012\u00020j0lH\u0002J\u0010\u0010n\u001a\u00020 2\u0006\u0010o\u001a\u00020pH\u0002JA\u0010q\u001a\u00020\u001126\u0010r\u001a2\u0012\u0013\u0012\u00110 ¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110w¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(x\u0012\u0004\u0012\u00020\u00110sH\u0082\bJ,\u0010y\u001a\u00020\u00112!\u0010r\u001a\u001d\u0012\u0013\u0012\u00110w¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(x\u0012\u0004\u0012\u00020\u00110zH\u0082\bR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R(\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010,\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R5\u00101\u001a\u0004\u0018\u0001002\b\u0010/\u001a\u0004\u0018\u0001008F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107*\u0004\b2\u00103R1\u0010;\u001a\u00020:2\u0006\u0010/\u001a\u00020:8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0004\b@\u00109\u001a\u0004\b;\u0010=\"\u0004\b>\u0010?*\u0004\b<\u00103R\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006}"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/TradeBarOverlayView;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewBinding", "Lcom/robinhood/android/lib/trade/databinding/MergeTradeBarOverlayBinding;", "getViewBinding", "()Lcom/robinhood/android/lib/trade/databinding/MergeTradeBarOverlayBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "disposable", "Lio/reactivex/disposables/Disposable;", "onAttachedToWindow", "", "onDetachedFromWindow", "serverDrivenTradeFab", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "getServerDrivenTradeFab", "()Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "tradeFab", "Landroidx/appcompat/widget/AppCompatButton;", "getTradeFab", "()Landroidx/appcompat/widget/AppCompatButton;", "closeFab", "Landroid/view/View;", "getCloseFab", "()Landroid/view/View;", "overlayButtonLayoutId", "", "getOverlayButtonLayoutId", "()I", "minTop", "getMinTop", "value", "", "labelText", "getLabelText", "()Ljava/lang/CharSequence;", "setLabelText", "(Ljava/lang/CharSequence;)V", "valueText", "getValueText", "setValueText", "<set-?>", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "serverDrivenTradeButtonCallbacks", "getServerDrivenTradeButtonCallbacks$delegate", "(Lcom/robinhood/android/lib/trade/view/TradeBarOverlayView;)Ljava/lang/Object;", "getServerDrivenTradeButtonCallbacks", "()Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "setServerDrivenTradeButtonCallbacks", "(Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;)V", "serverDrivenTradeButtonCallbacks$receiver", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "", "isServerDrivenTradeBarVisible", "isServerDrivenTradeBarVisible$delegate", "()Z", "setServerDrivenTradeBarVisible", "(Z)V", "isServerDrivenTradeBarVisible$receiver", "accountSwitcherBtn", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherView;", "getAccountSwitcherBtn", "()Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherView;", "infoState", "Lcom/robinhood/android/lib/trade/view/TradeBarOverlayView$InfoState;", "getInfoState", "()Lcom/robinhood/android/lib/trade/view/TradeBarOverlayView$InfoState;", "setInfoState", "(Lcom/robinhood/android/lib/trade/view/TradeBarOverlayView$InfoState;)V", "refreshPanelVisibility", "tradeButtonVisible", "showHintContainer", "hideHintContainer", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "left", "top", "right", "bottom", "animateButtons", Analytics3.EVENT_APPEAR, "collapseInternal", "collapseInternalAnimated", "expandInternal", "expandInternalAnimated", "hideTradeTxtShadow", "bindEquityUnderlyingStat", "equityInstrumentId", "Ljava/util/UUID;", AnnotatedPrivateKey.LABEL, "", "linkLabel", "bindEquityUnderlyingLinkRow", "bindIndexUnderlyingStat", "indexId", "idpSource", "Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "bindIndexUnderlyingLinkRow", "bindServerDrivenTradeButton", "tradeButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "toDeeplinkExpandActions", "", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$DeeplinkExpandAction;", "getGoneTranslation", "buttonLayout", "Landroid/view/ViewGroup;", "forEachButtonWithIndex", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/designsystem/button/RdsButton;", "button", "forEachButton", "Lkotlin/Function1;", "InfoState", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TradeBarOverlayView extends AbstractTradeBarOverlayView {
    private static final long ANIMATION_DURATION_MS = 330;
    private final TradeAccountSwitcherView accountSwitcherBtn;
    private Disposable disposable;
    private InfoState infoState;

    /* renamed from: isServerDrivenTradeBarVisible$receiver, reason: from kotlin metadata */
    private final ClientComponentButtonView isServerDrivenTradeBarVisible;

    /* renamed from: serverDrivenTradeButtonCallbacks$receiver, reason: from kotlin metadata */
    private final ClientComponentButtonView serverDrivenTradeButtonCallbacks;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TradeBarOverlayView.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/lib/trade/databinding/MergeTradeBarOverlayBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: TradeBarOverlayView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoState.values().length];
            try {
                iArr[InfoState.STATS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoState.STATS_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoState.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfoState.ACCOUNT_SWITCHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public TradeBarOverlayView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public void hideHintContainer() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$hideHintContainer$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$hideHintContainer$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        SimpleSlide simpleSlide = new SimpleSlide(80);
        simpleSlide.setInterpolator(Interpolators.INSTANCE.getFastOutSlowIn());
        simpleSlide.setDuration(ANIMATION_DURATION_MS);
        simpleSlide.addTarget(getViewBinding().hintContainer);
        transitionSet.addTransition(simpleSlide);
        TransitionManager.beginDelayedTransition(this, transitionSet);
        FrameLayout hintContainer = getViewBinding().hintContainer;
        Intrinsics.checkNotNullExpressionValue(hintContainer, "hintContainer");
        hintContainer.setVisibility(8);
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public void showHintContainer() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$showHintContainer$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$showHintContainer$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        SimpleSlide simpleSlide = new SimpleSlide(80);
        simpleSlide.setInterpolator(Interpolators.INSTANCE.getFastOutSlowIn());
        simpleSlide.setDuration(ANIMATION_DURATION_MS);
        simpleSlide.addTarget(getViewBinding().hintContainer);
        transitionSet.addTransition(simpleSlide);
        TransitionManager.beginDelayedTransition(this, transitionSet);
        FrameLayout hintContainer = getViewBinding().hintContainer;
        Intrinsics.checkNotNullExpressionValue(hintContainer, "hintContainer");
        hintContainer.setVisibility(0);
    }

    public /* synthetic */ TradeBarOverlayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeBarOverlayView(Context context, AttributeSet attributeSet) {
        super(C20649R.layout.merge_trade_bar_overlay, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewBinding = ViewBinding5.viewBinding(this, TradeBarOverlayView3.INSTANCE);
        int[] TradeBarOverlayView = C11048R.styleable.TradeBarOverlayView;
        Intrinsics.checkNotNullExpressionValue(TradeBarOverlayView, "TradeBarOverlayView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TradeBarOverlayView, 0, 0);
        Integer resourceIdOrNull = TypedArrays3.getResourceIdOrNull(typedArrayObtainStyledAttributes, C11048R.styleable.TradeBarOverlayView_hintLayout);
        if (resourceIdOrNull != null) {
            int iIntValue = resourceIdOrNull.intValue();
            FrameLayout hintContainer = getViewBinding().hintContainer;
            Intrinsics.checkNotNullExpressionValue(hintContainer, "hintContainer");
            ViewGroups.inflate(hintContainer, iIntValue, true);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.serverDrivenTradeButtonCallbacks = getServerDrivenTradeFab();
        this.isServerDrivenTradeBarVisible = getServerDrivenTradeFab();
        View viewFindViewById = findViewById(C20649R.id.account_switcher_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.accountSwitcherBtn = (TradeAccountSwitcherView) viewFindViewById;
        this.infoState = InfoState.STATS;
    }

    private final MergeTradeBarOverlayBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeTradeBarOverlayBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.disposable = ObservablesAndroid.observeOnMainThread(DayNightChanges.isDayChanges(ScarletManager2.getScarletManager(this))).subscribe(new Consumer() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView.onAttachedToWindow.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(DayNightOverlay dayNightOverlay) {
                ColorStateList colorStateListValueOf;
                View buttonsBg = TradeBarOverlayView.this.getButtonsBg();
                if (DayNightChanges.isDay(ScarletManager2.getScarletManager(TradeBarOverlayView.this))) {
                    colorStateListValueOf = ColorStateList.valueOf(TradeBarOverlayView.this.getContext().getColor(C11048R.color.background_color_overlay_day));
                } else {
                    colorStateListValueOf = ColorStateList.valueOf(TradeBarOverlayView.this.getContext().getColor(C11048R.color.background_color_overlay_night));
                }
                buttonsBg.setBackgroundTintList(colorStateListValueOf);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Disposable disposable = this.disposable;
        if (disposable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("disposable");
            disposable = null;
        }
        disposable.dispose();
    }

    private final ClientComponentButtonView getServerDrivenTradeFab() {
        ClientComponentButtonView actionBtn = getViewBinding().actionBtn;
        Intrinsics.checkNotNullExpressionValue(actionBtn, "actionBtn");
        return actionBtn;
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    protected AppCompatButton getTradeFab() {
        View viewFindViewById = findViewById(C20649R.id.trade_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (AppCompatButton) viewFindViewById;
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    protected View getCloseFab() {
        View viewFindViewById = findViewById(C20649R.id.close_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public int getOverlayButtonLayoutId() {
        return C11048R.layout.include_trade_bar_overlay_button;
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public int getMinTop() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.infoState.ordinal()];
        if (i == 1) {
            return getViewBinding().statRow.getTop();
        }
        if (i == 2) {
            return getViewBinding().statLinkRow.getTop();
        }
        if (i == 3) {
            return getViewBinding().linkRow.getTop();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return getViewBinding().accountSwitcherRow.getTop();
    }

    public final CharSequence getLabelText() {
        return getViewBinding().labelTxt.getText();
    }

    public final void setLabelText(CharSequence charSequence) {
        getViewBinding().labelTxt.setText(charSequence);
    }

    public final CharSequence getValueText() {
        return getViewBinding().valueTxt.getText();
    }

    public final void setValueText(CharSequence charSequence) {
        getViewBinding().valueTxt.setText(charSequence);
    }

    public final ClientComponentButtonView.Callbacks getServerDrivenTradeButtonCallbacks() {
        return this.serverDrivenTradeButtonCallbacks.getCallbacks();
    }

    public final void setServerDrivenTradeButtonCallbacks(ClientComponentButtonView.Callbacks callbacks) {
        this.serverDrivenTradeButtonCallbacks.setCallbacks(callbacks);
    }

    public final boolean isServerDrivenTradeBarVisible() {
        return this.isServerDrivenTradeBarVisible.getVisibility() == 0;
    }

    public final void setServerDrivenTradeBarVisible(boolean z) {
        this.isServerDrivenTradeBarVisible.setVisibility(z ? 0 : 8);
    }

    public final TradeAccountSwitcherView getAccountSwitcherBtn() {
        return this.accountSwitcherBtn;
    }

    public final InfoState getInfoState() {
        return this.infoState;
    }

    public final void setInfoState(InfoState infoState) {
        Intrinsics.checkNotNullParameter(infoState, "<set-?>");
        this.infoState = infoState;
    }

    public static /* synthetic */ void refreshPanelVisibility$default(TradeBarOverlayView tradeBarOverlayView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        tradeBarOverlayView.refreshPanelVisibility(z);
    }

    public final void refreshPanelVisibility(boolean tradeButtonVisible) {
        LinearLayout statRow = getViewBinding().statRow;
        Intrinsics.checkNotNullExpressionValue(statRow, "statRow");
        statRow.setVisibility(this.infoState == InfoState.STATS ? 0 : 8);
        LinearLayout statLinkRow = getViewBinding().statLinkRow;
        Intrinsics.checkNotNullExpressionValue(statLinkRow, "statLinkRow");
        statLinkRow.setVisibility(this.infoState == InfoState.STATS_LINK ? 0 : 8);
        LinearLayout linkRow = getViewBinding().linkRow;
        Intrinsics.checkNotNullExpressionValue(linkRow, "linkRow");
        linkRow.setVisibility(this.infoState == InfoState.LINK ? 0 : 8);
        ConstraintLayout accountSwitcherRow = getViewBinding().accountSwitcherRow;
        Intrinsics.checkNotNullExpressionValue(accountSwitcherRow, "accountSwitcherRow");
        accountSwitcherRow.setVisibility(this.infoState == InfoState.ACCOUNT_SWITCHER ? 0 : 8);
        getTradeFab().setVisibility(tradeButtonVisible ? 0 : 8);
        if (Intrinsics.areEqual(getTradeFab().getText().toString(), getContext().getString(C32428R.string.general_label_buy))) {
            return;
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.EQUITY_TRADE_BUTTON_VISIBLE, false);
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (getIsExpanded()) {
            return;
        }
        float goneTranslation = getGoneTranslation(getButtonLayout());
        UniformWidthVerticalLayout buttonLayout = getButtonLayout();
        int childCount = buttonLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = buttonLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsButton");
            ((RdsButton) childAt).setTranslationY(goneTranslation);
        }
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public void animateButtons(boolean appear) {
        float goneTranslation = getGoneTranslation(getButtonLayout());
        UniformWidthVerticalLayout buttonLayout = getButtonLayout();
        int childCount = buttonLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = buttonLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsButton");
            ((RdsButton) childAt).animate().translationY(appear ? 0.0f : goneTranslation).setDuration(200L).setInterpolator(Interpolators.INSTANCE.getFastOutSlowIn()).setListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$animateButtons$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    PerformanceLogger.DefaultImpls.completeMetric$default(this.this$0.getPerformanceLogger(), PerformanceMetricEventData.Name.TRADE_BUTTON_EXPANSION, null, 2, null);
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public void collapseInternal() {
        float goneTranslation = getGoneTranslation(getButtonLayout());
        UniformWidthVerticalLayout buttonLayout = getButtonLayout();
        int childCount = buttonLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = buttonLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsButton");
            ((RdsButton) childAt).setTranslationY(goneTranslation);
        }
        getButtonsBg().setVisibility(8);
        getTradeFab().setAlpha(1.0f);
        setPanelViewVisible(getCloseFab(), false);
        ScarletManager.removeOverlay$default(ScarletManager2.getScarletManager(this), TradeBarOverlay.INSTANCE.getPriority(), null, 2, null);
        setExpanded(false);
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public void collapseInternalAnimated() {
        getButtonsBg().animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView.collapseInternalAnimated.1
            @Override // java.lang.Runnable
            public final void run() {
                TradeBarOverlayView.this.getButtonsBg().setVisibility(8);
            }
        });
        getTradeFab().animate().alpha(1.0f);
        getCloseFab().animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView.collapseInternalAnimated.2
            @Override // java.lang.Runnable
            public final void run() {
                TradeBarOverlayView tradeBarOverlayView = TradeBarOverlayView.this;
                tradeBarOverlayView.setPanelViewVisible(tradeBarOverlayView.getCloseFab(), false);
            }
        });
        animateButtons(false);
        ScarletManager.removeOverlay$default(ScarletManager2.getScarletManager(this), TradeBarOverlay.INSTANCE.getPriority(), null, 2, null);
        setExpanded(false);
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public void expandInternalAnimated() {
        PerformanceLogger.DefaultImpls.beginMetric$default(getPerformanceLogger(), PerformanceMetricEventData.Name.TRADE_BUTTON_EXPANSION, null, null, null, 14, null);
        getButtonsBg().setAlpha(0.0f);
        getButtonsBg().setVisibility(0);
        getButtonsBg().animate().alpha(1.0f);
        getTradeFab().animate().alpha(0.0f);
        getCloseFab().setAlpha(0.0f);
        setPanelViewVisible(getCloseFab(), true);
        getCloseFab().animate().alpha(1.0f);
        animateButtons(true);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), TradeBarOverlay.INSTANCE, null, 2, null);
        setExpanded(true);
    }

    public final void hideTradeTxtShadow() {
        getViewBinding().tradesTxtShadow.setVisibility(8);
    }

    public final void bindEquityUnderlyingStat(final UUID equityInstrumentId, String label, String linkLabel) {
        final LinearLayout linearLayout = getViewBinding().statLinkRow;
        if (equityInstrumentId != null) {
            Intrinsics.checkNotNull(linearLayout);
            OnClickListeners.onClick(linearLayout, new Function0() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBarOverlayView.bindEquityUnderlyingStat$lambda$11$lambda$10(this.f$0, linearLayout, equityInstrumentId);
                }
            });
        }
        getViewBinding().statDescriptionTxt.setText(label);
        getViewBinding().statLinkTxt.setText(linkLabel);
        this.infoState = InfoState.STATS_LINK;
        refreshPanelVisibility$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindEquityUnderlyingStat$lambda$11$lambda$10(TradeBarOverlayView tradeBarOverlayView, LinearLayout linearLayout, UUID uuid) {
        Navigator navigator = tradeBarOverlayView.getNavigator();
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(uuid, null, null, InstrumentDetailSource.SDP_TRADE_BAR, false, 22, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    public final void bindEquityUnderlyingLinkRow(final UUID equityInstrumentId, String linkLabel) {
        final LinearLayout linearLayout = getViewBinding().linkRow;
        if (equityInstrumentId != null) {
            Intrinsics.checkNotNull(linearLayout);
            OnClickListeners.onClick(linearLayout, new Function0() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBarOverlayView.bindEquityUnderlyingLinkRow$lambda$13$lambda$12(this.f$0, linearLayout, equityInstrumentId);
                }
            });
        }
        getViewBinding().linkTxt.setText(linkLabel);
        this.infoState = InfoState.LINK;
        refreshPanelVisibility$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindEquityUnderlyingLinkRow$lambda$13$lambda$12(TradeBarOverlayView tradeBarOverlayView, LinearLayout linearLayout, UUID uuid) {
        Navigator navigator = tradeBarOverlayView.getNavigator();
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(uuid, null, null, InstrumentDetailSource.SDP_TRADE_BAR, false, 22, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    public final void bindIndexUnderlyingStat(final UUID indexId, String label, String linkLabel, final IndexDetailPageFragmentKey2 idpSource) {
        Intrinsics.checkNotNullParameter(idpSource, "idpSource");
        final LinearLayout linearLayout = getViewBinding().statLinkRow;
        if (indexId != null) {
            Intrinsics.checkNotNull(linearLayout);
            OnClickListeners.onClick(linearLayout, new Function0() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBarOverlayView.bindIndexUnderlyingStat$lambda$15$lambda$14(this.f$0, linearLayout, indexId, idpSource);
                }
            });
        }
        getViewBinding().statDescriptionTxt.setText(label);
        getViewBinding().statLinkTxt.setText(linkLabel);
        this.infoState = InfoState.STATS_LINK;
        refreshPanelVisibility$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIndexUnderlyingStat$lambda$15$lambda$14(TradeBarOverlayView tradeBarOverlayView, LinearLayout linearLayout, UUID uuid, IndexDetailPageFragmentKey2 indexDetailPageFragmentKey2) {
        Navigator navigator = tradeBarOverlayView.getNavigator();
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new IndexDetailPageFragmentKey(uuid, (String) null, indexDetailPageFragmentKey2), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    public final void bindIndexUnderlyingLinkRow(final UUID indexId, String linkLabel, final IndexDetailPageFragmentKey2 idpSource) {
        Intrinsics.checkNotNullParameter(idpSource, "idpSource");
        final LinearLayout linearLayout = getViewBinding().linkRow;
        if (indexId != null) {
            Intrinsics.checkNotNull(linearLayout);
            OnClickListeners.onClick(linearLayout, new Function0() { // from class: com.robinhood.android.lib.trade.view.TradeBarOverlayView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBarOverlayView.bindIndexUnderlyingLinkRow$lambda$17$lambda$16(this.f$0, linearLayout, indexId, idpSource);
                }
            });
        }
        getViewBinding().linkTxt.setText(linkLabel);
        this.infoState = InfoState.LINK;
        refreshPanelVisibility$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIndexUnderlyingLinkRow$lambda$17$lambda$16(TradeBarOverlayView tradeBarOverlayView, LinearLayout linearLayout, UUID uuid, IndexDetailPageFragmentKey2 indexDetailPageFragmentKey2) {
        Navigator navigator = tradeBarOverlayView.getNavigator();
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new IndexDetailPageFragmentKey(uuid, (String) null, indexDetailPageFragmentKey2), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    public final void bindServerDrivenTradeButton(GenericButton tradeButton) {
        Intrinsics.checkNotNullParameter(tradeButton, "tradeButton");
        IdlingResourceCounters2.setBusy(IdlingResourceType.EQUITY_TRADE_BUTTON_VISIBLE, false);
        setError(null);
        setActions(CollectionsKt.emptyList());
        refreshPanelVisibility$default(this, false, 1, null);
        GenericAction typedAction = tradeButton.getTypedAction();
        if (typedAction instanceof GenericAction.ButtonsAction) {
            setActions(CollectionsKt.reversed(toDeeplinkExpandActions(((GenericAction.ButtonsAction) typedAction).getButtons())));
            getServerDrivenTradeFab().setVisibility(8);
            getTradeFab().setVisibility(0);
            setAreDisabledActionsRemovable(false);
        } else {
            getServerDrivenTradeFab().bind(ServerDrivenButton.INSTANCE.from(tradeButton));
            getServerDrivenTradeFab().setVisibility(0);
            getTradeFab().setVisibility(8);
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.EQUITY_SERVER_TRADE_BUTTON_VISIBLE, false);
    }

    private final List<AbstractTradeBarOverlayView.ExpandAction.DeeplinkExpandAction> toDeeplinkExpandActions(List<GenericButton> list) {
        List<GenericButton> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            GenericButton genericButton = (GenericButton) obj;
            String title = genericButton.getTitle();
            boolean zIsEnabled = genericButton.isEnabled();
            ServerToBentoAssetMapper2 icon = genericButton.getIcon();
            Uri uri = null;
            Integer numValueOf = icon != null ? Integer.valueOf(icon.getResourceId()) : null;
            GenericAction typedAction = genericButton.getTypedAction();
            GenericAction.DeeplinkAction deeplinkAction = typedAction instanceof GenericAction.DeeplinkAction ? (GenericAction.DeeplinkAction) typedAction : null;
            if (deeplinkAction != null) {
                uri = deeplinkAction.getUri();
            }
            arrayList.add(new AbstractTradeBarOverlayView.ExpandAction.DeeplinkExpandAction(i, title, zIsEnabled, numValueOf, uri));
            i = i2;
        }
        return arrayList;
    }

    private final int getGoneTranslation(ViewGroup buttonLayout) {
        return buttonLayout.getHeight();
    }

    private final void forEachButtonWithIndex(Function2<? super Integer, ? super RdsButton, Unit> action) {
        UniformWidthVerticalLayout buttonLayout = getButtonLayout();
        int childCount = buttonLayout.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = buttonLayout.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            Integer numValueOf = Integer.valueOf(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsButton");
            action.invoke(numValueOf, (RdsButton) childAt);
            i++;
        }
    }

    private final void forEachButton(Function1<? super RdsButton, Unit> action) {
        UniformWidthVerticalLayout buttonLayout = getButtonLayout();
        int childCount = buttonLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = buttonLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsButton");
            action.invoke((RdsButton) childAt);
        }
    }

    @Override // com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView
    public void expandInternal() {
        UniformWidthVerticalLayout buttonLayout = getButtonLayout();
        int childCount = buttonLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = buttonLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsButton");
            ((RdsButton) childAt).setTranslationX(0.0f);
        }
        getButtonsBg().setVisibility(0);
        getTradeFab().setAlpha(0.0f);
        setPanelViewVisible(getCloseFab(), true);
        ScarletManager.removeOverlay$default(ScarletManager2.getScarletManager(this), TradeBarOverlay.INSTANCE.getPriority(), null, 2, null);
        setExpanded(true);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TradeBarOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/TradeBarOverlayView$InfoState;", "", "<init>", "(Ljava/lang/String;I)V", "STATS", "STATS_LINK", "LINK", "ACCOUNT_SWITCHER", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InfoState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoState[] $VALUES;
        public static final InfoState STATS = new InfoState("STATS", 0);
        public static final InfoState STATS_LINK = new InfoState("STATS_LINK", 1);
        public static final InfoState LINK = new InfoState("LINK", 2);
        public static final InfoState ACCOUNT_SWITCHER = new InfoState("ACCOUNT_SWITCHER", 3);

        private static final /* synthetic */ InfoState[] $values() {
            return new InfoState[]{STATS, STATS_LINK, LINK, ACCOUNT_SWITCHER};
        }

        public static EnumEntries<InfoState> getEntries() {
            return $ENTRIES;
        }

        private InfoState(String str, int i) {
        }

        static {
            InfoState[] infoStateArr$values = $values();
            $VALUES = infoStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoStateArr$values);
        }

        public static InfoState valueOf(String str) {
            return (InfoState) Enum.valueOf(InfoState.class, str);
        }

        public static InfoState[] values() {
            return (InfoState[]) $VALUES.clone();
        }
    }
}
