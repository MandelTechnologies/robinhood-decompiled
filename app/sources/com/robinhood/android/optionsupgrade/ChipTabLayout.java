package com.robinhood.android.optionsupgrade;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabItem;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChipTabLayout.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010!H\u0002J\u001a\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020(H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ChipTabLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "tabViewIds", "", "", "selectorId", "selectedPosition", "pageChangeCallback", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "getPageChangeCallback", "()Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPositionChanged", "Lkotlin/Function1;", "", "getOnPositionChanged", "()Lkotlin/jvm/functions/Function1;", "setOnPositionChanged", "(Lkotlin/jvm/functions/Function1;)V", "addView", "child", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "params", "Landroid/view/ViewGroup$LayoutParams;", "addViewInternal", "addTab", "text", "", "icon", "Landroid/graphics/drawable/Drawable;", "contentDescription", "selectTab", "tabId", "animated", "", "ChipTabPageChangeListener", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ChipTabLayout extends ConstraintLayout {
    private static final long CHIP_ANIMATION_DURATION = 200;
    private Function1<? super Integer, Unit> onPositionChanged;
    private final ViewPager2.OnPageChangeCallback pageChangeCallback;
    private int selectedPosition;
    private final int selectorId;
    private final List<Integer> tabViewIds;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.tabViewIds = new ArrayList();
        int iGenerateViewId = View.generateViewId();
        this.selectorId = iGenerateViewId;
        this.pageChangeCallback = new ChipTabPageChangeListener();
        View viewInflate$default = ViewGroups.inflate$default(this, C25121R.layout.include_chip_selector, false, 2, null);
        viewInflate$default.setId(iGenerateViewId);
        ViewGroup.LayoutParams layoutParams = viewInflate$default.getLayoutParams();
        super.addView(viewInflate$default, -1, layoutParams == null ? generateDefaultLayoutParams() : layoutParams);
    }

    public final ViewPager2.OnPageChangeCallback getPageChangeCallback() {
        return this.pageChangeCallback;
    }

    public final Function1<Integer, Unit> getOnPositionChanged() {
        return this.onPositionChanged;
    }

    public final void setOnPositionChanged(Function1<? super Integer, Unit> function1) {
        this.onPositionChanged = function1;
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        addViewInternal(child);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        Intrinsics.checkNotNullParameter(child, "child");
        addViewInternal(child);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        addViewInternal(child);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        addViewInternal(child);
    }

    private final void addViewInternal(View child) {
        if (!(child instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) child;
        if (tabItem.customLayout != 0) {
            throw new IllegalArgumentException("No custom layouts");
        }
        CharSequence charSequence = tabItem.text;
        Drawable drawable = tabItem.icon;
        CharSequence contentDescription = tabItem.getContentDescription();
        if (contentDescription == null || contentDescription.length() == 0) {
            contentDescription = null;
        }
        addTab(charSequence, drawable, contentDescription);
    }

    private final void addTab(CharSequence text, Drawable icon, CharSequence contentDescription) {
        final int iGenerateViewId = View.generateViewId();
        Integer num = (Integer) CollectionsKt.lastOrNull((List) this.tabViewIds);
        View viewInflate$default = ViewGroups.inflate$default(this, C25121R.layout.include_chip_tab, false, 2, null);
        Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
        RhTextView rhTextView = (RhTextView) viewInflate$default;
        rhTextView.setId(iGenerateViewId);
        this.tabViewIds.add(Integer.valueOf(iGenerateViewId));
        rhTextView.setActivated(false);
        rhTextView.setText(text);
        rhTextView.setContentDescription(contentDescription);
        TextViewsKt.setDrawables$default((TextView) rhTextView, icon, (Drawable) null, (Drawable) null, (Drawable) null, false, 30, (Object) null);
        OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.optionsupgrade.ChipTabLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChipTabLayout.addTab$lambda$3$lambda$2(this.f$0, iGenerateViewId);
            }
        });
        ViewGroup.LayoutParams layoutParams = rhTextView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        super.addView(rhTextView, -1, layoutParams);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        if (num != null) {
            constraintSet.connect(num.intValue(), 7, iGenerateViewId, 6, (int) ViewsKt.getDimension(this, C13997R.dimen.rds_spacing_default));
            iGenerateViewId = iGenerateViewId;
            constraintSet.connect(iGenerateViewId, 6, num.intValue(), 7, 0);
        } else {
            constraintSet.connect(iGenerateViewId, 6, 0, 6, 0);
        }
        constraintSet.connect(iGenerateViewId, 3, 0, 3, 0);
        constraintSet.connect(iGenerateViewId, 4, 0, 4, 0);
        constraintSet.connect(iGenerateViewId, 7, 0, 7, 0);
        constraintSet.applyTo(this);
        if (num == null) {
            View viewFindViewById = findViewById(this.selectorId);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            viewFindViewById.setVisibility(0);
            selectTab(iGenerateViewId, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addTab$lambda$3$lambda$2(ChipTabLayout chipTabLayout, int i) {
        selectTab$default(chipTabLayout, i, false, 2, null);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void selectTab$default(ChipTabLayout chipTabLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        chipTabLayout.selectTab(i, z);
    }

    private final void selectTab(int tabId, boolean animated) {
        final TextView textView = (TextView) findViewById(this.tabViewIds.get(this.selectedPosition).intValue());
        final TextView textView2 = (TextView) findViewById(tabId);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(this.selectorId, 3, tabId, 3, 0);
        constraintSet.connect(this.selectorId, 4, tabId, 4, 0);
        constraintSet.connect(this.selectorId, 6, tabId, 6, 0);
        constraintSet.connect(this.selectorId, 7, tabId, 7, 0);
        if (animated) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsupgrade.ChipTabLayout$selectTab$$inlined$beginDelayedTransition$1
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
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsupgrade.ChipTabLayout$selectTab$$inlined$beginDelayedTransition$2
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
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.addTarget(this.selectorId);
            changeBounds.setDuration(200L);
            transitionSet.addTransition(changeBounds);
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsupgrade.ChipTabLayout$selectTab$lambda$9$$inlined$doOnStart$1
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
                    textView.setActivated(false);
                    textView.setTypeface(Typeface.DEFAULT);
                }
            });
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsupgrade.ChipTabLayout$selectTab$lambda$9$$inlined$doOnEnd$1
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
                    textView2.setActivated(true);
                    textView2.setTypeface(Typeface.DEFAULT_BOLD);
                }
            });
            transitionSet.setInterpolator((TimeInterpolator) new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f));
            TransitionManager.beginDelayedTransition(this, transitionSet);
        } else {
            textView.setActivated(false);
            textView.setTypeface(Typeface.DEFAULT);
            textView2.setActivated(true);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
        }
        constraintSet.applyTo(this);
        int iIndexOf = this.tabViewIds.indexOf(Integer.valueOf(tabId));
        this.selectedPosition = iIndexOf;
        Function1<? super Integer, Unit> function1 = this.onPositionChanged;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIndexOf));
        }
    }

    /* compiled from: ChipTabLayout.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ChipTabLayout$ChipTabPageChangeListener;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "<init>", "(Lcom/robinhood/android/optionsupgrade/ChipTabLayout;)V", "onPageSelected", "", "position", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public final class ChipTabPageChangeListener extends ViewPager2.OnPageChangeCallback {
        public ChipTabPageChangeListener() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            ChipTabLayout chipTabLayout = ChipTabLayout.this;
            ChipTabLayout.selectTab$default(chipTabLayout, ((Number) chipTabLayout.tabViewIds.get(position)).intValue(), false, 2, null);
        }
    }
}
