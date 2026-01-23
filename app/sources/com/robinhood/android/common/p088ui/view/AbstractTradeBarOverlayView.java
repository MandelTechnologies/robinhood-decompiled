package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: AbstractTradeBarOverlayView.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0003rstB'\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010Q\u001a\u00020R2\u0006\u0010(\u001a\u00020)J\u0006\u0010S\u001a\u00020RJ\u000e\u0010T\u001a\u0002042\u0006\u0010U\u001a\u000204J\u000e\u0010V\u001a\u0002042\u0006\u0010U\u001a\u000204J\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00030XJ\b\u0010Y\u001a\u00020RH\u0002J\u0018\u0010Z\u001a\u00020R2\u0006\u0010[\u001a\u00020\u001f2\u0006\u0010\\\u001a\u000204H\u0014J\b\u0010]\u001a\u00020RH\u0014J\u0010\u0010^\u001a\u00020R2\u0006\u0010_\u001a\u000204H&J\b\u0010`\u001a\u00020RH&J\b\u0010a\u001a\u00020RH&J\b\u0010b\u001a\u00020RH&J\b\u0010c\u001a\u00020RH&J\b\u0010d\u001a\u00020RH&J\b\u0010e\u001a\u00020RH&J0\u0010h\u001a\u00020R2\u0006\u0010i\u001a\u0002042\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u00032\u0006\u0010l\u001a\u00020\u00032\u0006\u0010m\u001a\u00020\u0003H\u0014J\b\u0010n\u001a\u00020oH\u0014J\u0010\u0010p\u001a\u00020R2\u0006\u0010q\u001a\u00020oH\u0014R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020%X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030+X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0002042\u0006\u0010,\u001a\u000204@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u0002042\u0006\u0010,\u001a\u000204@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001a\u0010=\u001a\u000204X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00107\"\u0004\b>\u00109R$\u0010@\u001a\u00020?2\u0006\u0010,\u001a\u00020?@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010,\u001a\u0004\u0018\u00010H8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010N\u001a\u0004\u0018\u00010?2\b\u0010,\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\u0012\u0010f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010G¨\u0006u"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutId", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(ILandroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "getPerformanceLogger", "()Lcom/robinhood/android/performancelogger/PerformanceLogger;", "setPerformanceLogger", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "errorTxt", "Landroid/widget/TextView;", "getErrorTxt", "()Landroid/widget/TextView;", "tradeFab", "Landroidx/appcompat/widget/AppCompatButton;", "getTradeFab", "()Landroidx/appcompat/widget/AppCompatButton;", "closeFab", "Landroid/view/View;", "getCloseFab", "()Landroid/view/View;", "buttonsBg", "getButtonsBg", "buttonLayout", "Lcom/robinhood/android/common/ui/view/UniformWidthVerticalLayout;", "getButtonLayout", "()Lcom/robinhood/android/common/ui/view/UniformWidthVerticalLayout;", "listener", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$Listener;", "footerHeightSubject", "Lio/reactivex/subjects/BehaviorSubject;", "value", "", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "actions", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "", "areDisabledActionsRemovable", "getAreDisabledActionsRemovable", "()Z", "setAreDisabledActionsRemovable", "(Z)V", "hideTradeButtonWhenEmpty", "getHideTradeButtonWhenEmpty", "setHideTradeButtonWhenEmpty", "isExpanded", "setExpanded", "", "fabText", "getFabText", "()Ljava/lang/CharSequence;", "setFabText", "(Ljava/lang/CharSequence;)V", "overlayButtonLayoutId", "getOverlayButtonLayoutId", "()I", "Landroid/graphics/drawable/Drawable;", "errorIcon", "getErrorIcon", "()Landroid/graphics/drawable/Drawable;", "setErrorIcon", "(Landroid/graphics/drawable/Drawable;)V", "error", "getError", "setError", "setListener", "", "startTransition", AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_EXPAND, "animate", AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_COLLAPSE, "footerHeight", "Lio/reactivex/Observable;", "refreshUi", "setPanelViewVisible", "view", "visible", "onActionItemsChanged", "animateButtons", Analytics3.EVENT_APPEAR, "collapseInternal", "collapseInternalAnimated", "expandInternal", "expandInternalAnimated", "showHintContainer", "hideHintContainer", "minTop", "getMinTop", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "left", "top", "right", "bottom", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Listener", "ExpandAction", "SavedState", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class AbstractTradeBarOverlayView extends Hammer_AbstractTradeBarOverlayView {
    public static final int $stable = 8;
    private List<? extends ExpandAction> actions;
    private boolean areDisabledActionsRemovable;
    private final UniformWidthVerticalLayout buttonLayout;
    private final View buttonsBg;
    private final TextView errorTxt;
    private CharSequence fabText;
    private final BehaviorSubject<Integer> footerHeightSubject;
    private boolean hideTradeButtonWhenEmpty;
    private boolean isExpanded;
    private Listener listener;
    public Navigator navigator;
    public PerformanceLogger performanceLogger;

    /* compiled from: AbstractTradeBarOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$Listener;", "", "onActionClicked", "", "action", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "onTradeClicked", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Listener {
        void onActionClicked(ExpandAction action);

        void onTradeClicked();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractTradeBarOverlayView(int i, Context context) {
        this(i, context, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract void animateButtons(boolean appear);

    public abstract void collapseInternal();

    public abstract void collapseInternalAnimated();

    public abstract void expandInternal();

    public abstract void expandInternalAnimated();

    protected abstract View getCloseFab();

    public abstract int getMinTop();

    protected abstract AppCompatButton getTradeFab();

    public abstract void hideHintContainer();

    protected void onActionItemsChanged() {
    }

    public abstract void showHintContainer();

    public /* synthetic */ AbstractTradeBarOverlayView(int i, Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, context, (i2 & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractTradeBarOverlayView(int i, final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, i, this);
        View viewFindViewById = findViewById(C11048R.id.error_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.errorTxt = textView;
        View viewFindViewById2 = findViewById(C11048R.id.trade_btns_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.buttonsBg = viewFindViewById2;
        View viewFindViewById3 = findViewById(C11048R.id.button_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.buttonLayout = (UniformWidthVerticalLayout) viewFindViewById3;
        getTradeFab().setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpandAction expandAction;
                if (!AbstractTradeBarOverlayView.this.getAreDisabledActionsRemovable()) {
                    expandAction = (ExpandAction) CollectionsKt.singleOrNull((List) AbstractTradeBarOverlayView.this.getActions());
                } else {
                    Iterator<T> it = AbstractTradeBarOverlayView.this.getActions().iterator();
                    Object obj = null;
                    boolean z = false;
                    Object obj2 = null;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((ExpandAction) next).isEnabled()) {
                                if (z) {
                                    break;
                                }
                                z = true;
                                obj2 = next;
                            }
                        } else if (z) {
                            obj = obj2;
                        }
                    }
                    expandAction = (ExpandAction) obj;
                }
                if (expandAction != null) {
                    Listener listener = AbstractTradeBarOverlayView.this.listener;
                    if (listener != null) {
                        listener.onActionClicked(expandAction);
                        return;
                    }
                    return;
                }
                Listener listener2 = AbstractTradeBarOverlayView.this.listener;
                if (listener2 != null) {
                    listener2.onTradeClicked();
                }
                AbstractTradeBarOverlayView.this.expand(true);
            }
        });
        getCloseFab().setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractTradeBarOverlayView.this.collapseInternalAnimated();
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractTradeBarOverlayView.this.collapseInternalAnimated();
            }
        });
        BetterLinkMovementMethod betterLinkMovementMethodNewInstance = BetterLinkMovementMethod.newInstance();
        betterLinkMovementMethodNewInstance.setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView$special$$inlined$setOnLinkClickListener$1
            @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
            public final boolean onClick(TextView textView2, String str) {
                Intrinsics.checkNotNull(textView2);
                Intrinsics.checkNotNull(str);
                if (!StringsKt.isHelpCenterUrl(str)) {
                    return false;
                }
                Navigators3.showHelpCenterWebViewFragment(this.this$0.getNavigator(), context, str);
                return true;
            }
        });
        textView.setMovementMethod(betterLinkMovementMethodNewInstance);
        BehaviorSubject<Integer> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.footerHeightSubject = behaviorSubjectCreate;
        TextViewsKt.tintDrawables(textView, context.getColor(C11048R.color.rh_white_1));
        this.actions = CollectionsKt.emptyList();
        this.areDisabledActionsRemovable = true;
        String string2 = context.getString(C11048R.string.general_label_trade);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.fabText = string2;
        refreshUi();
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final PerformanceLogger getPerformanceLogger() {
        PerformanceLogger performanceLogger = this.performanceLogger;
        if (performanceLogger != null) {
            return performanceLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceLogger");
        return null;
    }

    public final void setPerformanceLogger(PerformanceLogger performanceLogger) {
        Intrinsics.checkNotNullParameter(performanceLogger, "<set-?>");
        this.performanceLogger = performanceLogger;
    }

    protected final TextView getErrorTxt() {
        return this.errorTxt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View getButtonsBg() {
        return this.buttonsBg;
    }

    protected final UniformWidthVerticalLayout getButtonLayout() {
        return this.buttonLayout;
    }

    /* compiled from: AbstractTradeBarOverlayView.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "Landroid/os/Parcelable;", "<init>", "()V", "id", "", "getId", "()I", "title", "", "getTitle", "()Ljava/lang/String;", "isEnabled", "", "()Z", "drawableResId", "getDrawableResId", "()Ljava/lang/Integer;", "LegacyExpandAction", "DeeplinkExpandAction", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$DeeplinkExpandAction;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$LegacyExpandAction;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ExpandAction implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ ExpandAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Integer getDrawableResId();

        public abstract int getId();

        public abstract String getTitle();

        public abstract boolean isEnabled();

        private ExpandAction() {
        }

        /* compiled from: AbstractTradeBarOverlayView.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\u0010\n\u0002\u0010\u0014\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$LegacyExpandAction;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "id", "", "title", "", "isEnabled", "", "<init>", "(ILjava/lang/String;Z)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "()Z", "drawableResId", "getDrawableResId$annotations", "()V", "getDrawableResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LegacyExpandAction extends ExpandAction {
            public static final int $stable = 0;
            public static final Parcelable.Creator<LegacyExpandAction> CREATOR = new Creator();
            private final Integer drawableResId;
            private final int id;
            private final boolean isEnabled;
            private final String title;

            /* compiled from: AbstractTradeBarOverlayView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LegacyExpandAction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LegacyExpandAction createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LegacyExpandAction(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LegacyExpandAction[] newArray(int i) {
                    return new LegacyExpandAction[i];
                }
            }

            public static /* synthetic */ LegacyExpandAction copy$default(LegacyExpandAction legacyExpandAction, int i, String str, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = legacyExpandAction.id;
                }
                if ((i2 & 2) != 0) {
                    str = legacyExpandAction.title;
                }
                if ((i2 & 4) != 0) {
                    z = legacyExpandAction.isEnabled;
                }
                return legacyExpandAction.copy(i, str, z);
            }

            public static /* synthetic */ void getDrawableResId$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            public final LegacyExpandAction copy(int id, String title, boolean isEnabled) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new LegacyExpandAction(id, title, isEnabled);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LegacyExpandAction)) {
                    return false;
                }
                LegacyExpandAction legacyExpandAction = (LegacyExpandAction) other;
                return this.id == legacyExpandAction.id && Intrinsics.areEqual(this.title, legacyExpandAction.title) && this.isEnabled == legacyExpandAction.isEnabled;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isEnabled);
            }

            public String toString() {
                return "LegacyExpandAction(id=" + this.id + ", title=" + this.title + ", isEnabled=" + this.isEnabled + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.id);
                dest.writeString(this.title);
                dest.writeInt(this.isEnabled ? 1 : 0);
            }

            @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.ExpandAction
            public int getId() {
                return this.id;
            }

            @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.ExpandAction
            public String getTitle() {
                return this.title;
            }

            @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.ExpandAction
            public boolean isEnabled() {
                return this.isEnabled;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LegacyExpandAction(int i, String title, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = i;
                this.title = title;
                this.isEnabled = z;
            }

            @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.ExpandAction
            public Integer getDrawableResId() {
                return this.drawableResId;
            }
        }

        /* compiled from: AbstractTradeBarOverlayView.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0003J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$DeeplinkExpandAction;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "id", "", "title", "", "isEnabled", "", "drawableResId", "uri", "Landroid/net/Uri;", "<init>", "(ILjava/lang/String;ZLjava/lang/Integer;Landroid/net/Uri;)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "()Z", "getDrawableResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;ZLjava/lang/Integer;Landroid/net/Uri;)Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction$DeeplinkExpandAction;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DeeplinkExpandAction extends ExpandAction {
            public static final int $stable = 8;
            public static final Parcelable.Creator<DeeplinkExpandAction> CREATOR = new Creator();
            private final Integer drawableResId;
            private final int id;
            private final boolean isEnabled;
            private final String title;
            private final Uri uri;

            /* compiled from: AbstractTradeBarOverlayView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<DeeplinkExpandAction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeeplinkExpandAction createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DeeplinkExpandAction(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel.readParcelable(DeeplinkExpandAction.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeeplinkExpandAction[] newArray(int i) {
                    return new DeeplinkExpandAction[i];
                }
            }

            public static /* synthetic */ DeeplinkExpandAction copy$default(DeeplinkExpandAction deeplinkExpandAction, int i, String str, boolean z, Integer num, Uri uri, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = deeplinkExpandAction.id;
                }
                if ((i2 & 2) != 0) {
                    str = deeplinkExpandAction.title;
                }
                if ((i2 & 4) != 0) {
                    z = deeplinkExpandAction.isEnabled;
                }
                if ((i2 & 8) != 0) {
                    num = deeplinkExpandAction.drawableResId;
                }
                if ((i2 & 16) != 0) {
                    uri = deeplinkExpandAction.uri;
                }
                Uri uri2 = uri;
                boolean z2 = z;
                return deeplinkExpandAction.copy(i, str, z2, num, uri2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getDrawableResId() {
                return this.drawableResId;
            }

            /* renamed from: component5, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            public final DeeplinkExpandAction copy(int id, String title, boolean isEnabled, Integer drawableResId, Uri uri) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new DeeplinkExpandAction(id, title, isEnabled, drawableResId, uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeeplinkExpandAction)) {
                    return false;
                }
                DeeplinkExpandAction deeplinkExpandAction = (DeeplinkExpandAction) other;
                return this.id == deeplinkExpandAction.id && Intrinsics.areEqual(this.title, deeplinkExpandAction.title) && this.isEnabled == deeplinkExpandAction.isEnabled && Intrinsics.areEqual(this.drawableResId, deeplinkExpandAction.drawableResId) && Intrinsics.areEqual(this.uri, deeplinkExpandAction.uri);
            }

            public int hashCode() {
                int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
                Integer num = this.drawableResId;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Uri uri = this.uri;
                return iHashCode2 + (uri != null ? uri.hashCode() : 0);
            }

            public String toString() {
                return "DeeplinkExpandAction(id=" + this.id + ", title=" + this.title + ", isEnabled=" + this.isEnabled + ", drawableResId=" + this.drawableResId + ", uri=" + this.uri + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.id);
                dest.writeString(this.title);
                dest.writeInt(this.isEnabled ? 1 : 0);
                Integer num = this.drawableResId;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    dest.writeInt(1);
                    iIntValue = num.intValue();
                }
                dest.writeInt(iIntValue);
                dest.writeParcelable(this.uri, flags);
            }

            @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.ExpandAction
            public int getId() {
                return this.id;
            }

            @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.ExpandAction
            public String getTitle() {
                return this.title;
            }

            @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.ExpandAction
            public boolean isEnabled() {
                return this.isEnabled;
            }

            @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.ExpandAction
            public Integer getDrawableResId() {
                return this.drawableResId;
            }

            public final Uri getUri() {
                return this.uri;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeeplinkExpandAction(int i, String title, boolean z, Integer num, Uri uri) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = i;
                this.title = title;
                this.isEnabled = z;
                this.drawableResId = num;
                this.uri = uri;
            }
        }
    }

    public final List<ExpandAction> getActions() {
        return this.actions;
    }

    public final void setActions(List<? extends ExpandAction> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.actions, value)) {
            return;
        }
        this.actions = value;
        refreshUi();
    }

    public final boolean getAreDisabledActionsRemovable() {
        return this.areDisabledActionsRemovable;
    }

    public final void setAreDisabledActionsRemovable(boolean z) {
        if (this.areDisabledActionsRemovable != z) {
            this.areDisabledActionsRemovable = z;
            refreshUi();
        }
    }

    public final boolean getHideTradeButtonWhenEmpty() {
        return this.hideTradeButtonWhenEmpty;
    }

    public final void setHideTradeButtonWhenEmpty(boolean z) {
        if (this.hideTradeButtonWhenEmpty != z) {
            this.hideTradeButtonWhenEmpty = z;
            refreshUi();
        }
    }

    /* renamed from: isExpanded, reason: from getter */
    public boolean getIsExpanded() {
        return this.isExpanded;
    }

    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final CharSequence getFabText() {
        return this.fabText;
    }

    public final void setFabText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.fabText, value)) {
            return;
        }
        this.fabText = value;
        refreshUi();
    }

    public int getOverlayButtonLayoutId() {
        return C11048R.layout.include_trade_bar_overlay_button;
    }

    public final Drawable getErrorIcon() {
        return TextViewsKt.getDrawableStart(this.errorTxt);
    }

    public final void setErrorIcon(Drawable drawable) {
        TextViewsKt.setDrawableStart(this.errorTxt, drawable);
    }

    public final CharSequence getError() {
        TextView textView = this.errorTxt;
        if (textView.getVisibility() == 0) {
            return textView.getText();
        }
        return null;
    }

    public final void setError(CharSequence charSequence) {
        boolean z = charSequence != null;
        TextView textView = this.errorTxt;
        textView.setVisibility(z ? 0 : 8);
        if (charSequence != null) {
            textView.setText(charSequence);
        }
    }

    public final void setListener(Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void startTransition() {
        Transitions2.endTransitions(this);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView$startTransition$$inlined$beginDelayedTransition$1
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
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView$startTransition$$inlined$beginDelayedTransition$2
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
        Interpolators interpolators = Interpolators.INSTANCE;
        simpleSlide.setInterpolator(interpolators.getFastOutSlowIn());
        transitionSet.addTransition(simpleSlide);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(interpolators.getFastOutSlowIn());
        transitionSet.addTransition(changeBounds);
        Transitions2.excludeAll$default((Transition) transitionSet, (View) this.buttonLayout, false, 2, (Object) null);
        transitionSet.setDuration(200L);
        transitionSet.setOrdering(0);
        transitionSet.setPropagation(null);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public final boolean expand(boolean animate) {
        if (getIsExpanded()) {
            return false;
        }
        if (animate) {
            expandInternalAnimated();
            return true;
        }
        expandInternal();
        return true;
    }

    public final boolean collapse(boolean animate) {
        if (!getIsExpanded()) {
            return false;
        }
        if (animate) {
            collapseInternalAnimated();
            return true;
        }
        collapseInternal();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPanelViewVisible(View view, boolean visible) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(visible ? 0 : 8);
    }

    public final Observable<Integer> footerHeight() {
        Observable<Integer> observableDistinctUntilChanged = this.footerHeightSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    private final void refreshUi() {
        ExpandAction expandAction;
        Context context = this.buttonLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LayoutInflater layoutInflater = ContextSystemServices.getLayoutInflater(context);
        List<? extends ExpandAction> list = this.actions;
        ViewGroup viewGroup = this.buttonLayout;
        viewGroup.removeAllViews();
        if (!this.areDisabledActionsRemovable) {
            expandAction = (ExpandAction) CollectionsKt.singleOrNull((List) list);
        } else {
            Iterator<T> it = list.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((ExpandAction) next).isEnabled()) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            expandAction = (ExpandAction) obj;
        }
        if (expandAction != null) {
            setPanelViewVisible(getTradeFab(), true);
            getTradeFab().setText(expandAction.getTitle());
            getTradeFab().setEnabled(expandAction.isEnabled());
            onActionItemsChanged();
            return;
        }
        if (this.hideTradeButtonWhenEmpty && list.isEmpty()) {
            setPanelViewVisible(getTradeFab(), false);
            onActionItemsChanged();
            return;
        }
        setPanelViewVisible(getTradeFab(), true);
        getTradeFab().setText(this.fabText);
        boolean z2 = false;
        for (final ExpandAction expandAction2 : list) {
            z2 = z2 || expandAction2.isEnabled();
            View viewInflate = layoutInflater.inflate(getOverlayButtonLayoutId(), viewGroup, false);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsButton");
            RdsButton rdsButton = (RdsButton) viewInflate;
            rdsButton.setText(expandAction2.getTitle());
            Integer drawableResId = expandAction2.getDrawableResId();
            rdsButton.setIconResource(drawableResId != null ? drawableResId.intValue() : 0);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractTradeBarOverlayView.refreshUi$lambda$8$lambda$7(this.f$0, expandAction2);
                }
            });
            rdsButton.setEnabled(expandAction2.isEnabled());
            viewGroup.addView(rdsButton);
        }
        getTradeFab().setEnabled(z2);
        onActionItemsChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$8$lambda$7(AbstractTradeBarOverlayView abstractTradeBarOverlayView, ExpandAction expandAction) {
        Listener listener = abstractTradeBarOverlayView.listener;
        if (listener != null) {
            listener.onActionClicked(expandAction);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.footerHeightSubject.onNext(Integer.valueOf(getHeight() - getMinTop()));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        return new SavedState(parcelableOnSaveInstanceState, this.actions, getIsExpanded());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setActions(savedState.getActions());
        if (savedState.getIsExpanded()) {
            expandInternal();
        } else {
            collapseInternal();
        }
    }

    /* compiled from: AbstractTradeBarOverlayView.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$SavedState;", "Landroidx/customview/view/AbsSavedState;", "inSuperState", "Landroid/os/Parcelable;", "actions", "", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "isExpanded", "", "<init>", "(Landroid/os/Parcelable;Ljava/util/List;Z)V", "getInSuperState", "()Landroid/os/Parcelable;", "getActions", "()Ljava/util/List;", "()Z", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SavedState extends AbsSavedState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final List<ExpandAction> actions;
        private final Parcelable inSuperState;
        private final boolean isExpanded;

        /* compiled from: AbstractTradeBarOverlayView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable parcelable = parcel.readParcelable(SavedState.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(SavedState.class.getClassLoader()));
                }
                return new SavedState(parcelable, arrayList, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.inSuperState, flags);
            List<ExpandAction> list = this.actions;
            dest.writeInt(list.size());
            Iterator<ExpandAction> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeInt(this.isExpanded ? 1 : 0);
        }

        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public final List<ExpandAction> getActions() {
            return this.actions;
        }

        /* renamed from: isExpanded, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SavedState(Parcelable inSuperState, List<? extends ExpandAction> actions, boolean z) {
            super(inSuperState);
            Intrinsics.checkNotNullParameter(inSuperState, "inSuperState");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.inSuperState = inSuperState;
            this.actions = actions;
            this.isExpanded = z;
        }
    }
}
