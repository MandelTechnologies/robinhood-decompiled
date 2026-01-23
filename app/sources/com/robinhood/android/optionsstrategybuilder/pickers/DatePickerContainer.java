package com.robinhood.android.optionsstrategybuilder.pickers;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.tabs.TabLayout;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.Rotation;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.pills.PillView;
import com.robinhood.android.optionsstrategybuilder.pills.StrategyBuilderChip;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.extensions.ViewGroups;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DatePickerContainer.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00160\u001cJ2\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00160\u001cH\u0002J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J*\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010&H\u0002J*\u0010'\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010&H\u0002R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", StatisticsSection2.DIVIDER, "Landroid/view/View;", "kotlin.jvm.PlatformType", "currentlyOpenTabLayoutIndex", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "viewsMap", "", "Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerContainer$Views;", "currentlyOpenTabLayout", "Lkotlin/Pair;", "Lcom/google/android/material/tabs/TabLayout;", "getCurrentlyOpenTabLayout", "()Lkotlin/Pair;", "onChipTapped", "", "selectorArgs", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "chip", "Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;", "onTabSelected", "Lkotlin/Function2;", "", "addOnTabSelectedListener", "views", "getOrCreateViews", "changeTabLayoutVisibility", "filterType", "visibility", "", "onComplete", "Lkotlin/Function0;", "transitionVisibility", "Views", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DatePickerContainer extends ConstraintLayout {
    public static final int $stable = 8;
    private OptionStrategyChainTemplate.FilterType currentlyOpenTabLayoutIndex;
    private final View divider;
    private final Map<OptionStrategyChainTemplate.FilterType, Views> viewsMap;

    /* compiled from: DatePickerContainer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[OptionStrategyChainTemplate.FilterType.values().length];
    }

    public /* synthetic */ DatePickerContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C24876R.layout.merge_date_picker, true);
        this.divider = findViewById(C24876R.id.header_divider);
        this.viewsMap = new LinkedHashMap();
    }

    public final Tuples2<OptionStrategyChainTemplate.FilterType, TabLayout> getCurrentlyOpenTabLayout() {
        Views views;
        DatePickerTabLayout tabLayout;
        OptionStrategyChainTemplate.FilterType filterType = this.currentlyOpenTabLayoutIndex;
        if (filterType == null || (views = this.viewsMap.get(filterType)) == null || (tabLayout = views.getTabLayout()) == null) {
            return null;
        }
        return Tuples4.m3642to(filterType, tabLayout);
    }

    public final void onChipTapped(final PillView.SelectorArgs selectorArgs, StrategyBuilderChip chip, final Function2<? super PillView.SelectorArgs, ? super Integer, Unit> onTabSelected) {
        Intrinsics.checkNotNullParameter(selectorArgs, "selectorArgs");
        Intrinsics.checkNotNullParameter(chip, "chip");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        final Views orCreateViews = getOrCreateViews(selectorArgs, chip);
        boolean z = orCreateViews.getTabLayout().getVisibility() == 0;
        boolean z2 = !z;
        orCreateViews.getTabLayout().clearOnTabSelectedListeners();
        if (!z) {
            OptionStrategyBuilderViewState.Choice selectedChoice = selectorArgs.getSelectedChoice();
            String string$default = null;
            if (selectedChoice != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                string$default = OptionStrategyBuilderViewState.Choice.toString$default(selectedChoice, resources, false, 2, null);
            }
            if (!Intrinsics.areEqual(string$default, orCreateViews.getTabLayout().getSelectedTabText())) {
                changeTabLayoutVisibility(selectorArgs.getFilter().getFilterType(), z2, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DatePickerContainer.onChipTapped$lambda$0(orCreateViews, selectorArgs, this, onTabSelected);
                    }
                });
                return;
            }
        }
        changeTabLayoutVisibility$default(this, selectorArgs.getFilter().getFilterType(), z2, null, 4, null);
        addOnTabSelectedListener(orCreateViews, selectorArgs, onTabSelected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onChipTapped$lambda$0(Views views, PillView.SelectorArgs selectorArgs, DatePickerContainer datePickerContainer, Function2 function2) {
        views.getTabLayout().select(selectorArgs);
        datePickerContainer.addOnTabSelectedListener(views, selectorArgs, function2);
        return Unit.INSTANCE;
    }

    private final void addOnTabSelectedListener(final Views views, final PillView.SelectorArgs selectorArgs, final Function2<? super PillView.SelectorArgs, ? super Integer, Unit> onTabSelected) {
        views.getTabLayout().addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer.addOnTabSelectedListener.1
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                if (views.getTabLayout().getVisibility() == 0) {
                    onTabSelected.invoke(selectorArgs, Integer.valueOf(tab.getPosition()));
                }
            }
        });
    }

    private final Views getOrCreateViews(PillView.SelectorArgs selectorArgs, StrategyBuilderChip chip) {
        OptionStrategyChainTemplate.FilterType filterType = selectorArgs.getFilter().getFilterType();
        Views views = this.viewsMap.get(filterType);
        if (views != null) {
            if (Intrinsics.areEqual(views.getChip(), chip)) {
                return views;
            }
            Views views2 = new Views(filterType, views.getTabLayout(), chip);
            this.viewsMap.put(filterType, views2);
            return views2;
        }
        DatePickerTabLayout datePickerTabLayoutInflate = DatePickerTabLayout.INSTANCE.inflate((ViewGroup) this);
        int iGenerateViewId = View.generateViewId();
        datePickerTabLayoutInflate.setId(iGenerateViewId);
        addView(datePickerTabLayoutInflate);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintSet);
        constraintSet.connect(iGenerateViewId, 6, this.divider.getId(), 6, 0);
        constraintSet.connect(iGenerateViewId, 7, this.divider.getId(), 7, 0);
        constraintSet.constrainDefaultHeight(iGenerateViewId, 1);
        constraintSet.connect(iGenerateViewId, 4, this.divider.getId(), 3, 0);
        constraintSet.applyTo(this);
        datePickerTabLayoutInflate.initialize(selectorArgs);
        datePickerTabLayoutInflate.setVisibility(8);
        Views views3 = new Views(filterType, datePickerTabLayoutInflate, chip);
        this.viewsMap.put(filterType, views3);
        return views3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void changeTabLayoutVisibility$default(DatePickerContainer datePickerContainer, OptionStrategyChainTemplate.FilterType filterType, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        datePickerContainer.changeTabLayoutVisibility(filterType, z, function0);
    }

    private final void changeTabLayoutVisibility(OptionStrategyChainTemplate.FilterType filterType, final boolean visibility, final Function0<Unit> onComplete) {
        final Views views = this.viewsMap.get(filterType);
        if (views == null) {
            return;
        }
        if (!visibility) {
            transitionVisibility(views, visibility, onComplete);
            return;
        }
        OptionStrategyChainTemplate.FilterType filterType2 = this.currentlyOpenTabLayoutIndex;
        if ((filterType2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[filterType2.ordinal()]) == -1) {
            transitionVisibility(views, visibility, onComplete);
            return;
        }
        if (filterType2 != filterType) {
            Views views2 = this.viewsMap.get(filterType2);
            if (views2 == null) {
                transitionVisibility(views, visibility, onComplete);
            } else {
                transitionVisibility(views2, false, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DatePickerContainer.changeTabLayoutVisibility$lambda$3(this.f$0, views, visibility, onComplete);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeTabLayoutVisibility$lambda$3(DatePickerContainer datePickerContainer, Views views, boolean z, Function0 function0) {
        datePickerContainer.transitionVisibility(views, z, function0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void transitionVisibility$default(DatePickerContainer datePickerContainer, Views views, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        datePickerContainer.transitionVisibility(views, z, function0);
    }

    private final void transitionVisibility(Views views, boolean visibility, final Function0<Unit> onComplete) {
        this.currentlyOpenTabLayoutIndex = visibility ? views.getFilterType() : null;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer$transitionVisibility$$inlined$beginDelayedTransition$1
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
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer$transitionVisibility$$inlined$beginDelayedTransition$2
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
        changeBounds.addTarget(this.divider);
        transitionSet.addTransition(changeBounds);
        transitionSet.setInterpolator((TimeInterpolator) Interpolators.INSTANCE.getFastOutSlowIn());
        if (onComplete != null) {
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer$transitionVisibility$lambda$6$$inlined$doOnEnd$1
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
                    onComplete.invoke();
                }
            });
        }
        TransitionManager.beginDelayedTransition(this, transitionSet);
        StrategyBuilderChip chip = views.getChip();
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer$transitionVisibility$$inlined$beginDelayedTransition$3
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
        transitionSet2.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer$transitionVisibility$$inlined$beginDelayedTransition$4
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
        Transitions2.add(transitionSet2, new Rotation());
        TransitionManager.beginDelayedTransition(chip, transitionSet2);
        views.getChip().getDropdownIcon().setRotation(visibility ? 180.0f : 0.0f);
        views.getTabLayout().setVisibility(visibility ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DatePickerContainer.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerContainer$Views;", "", "filterType", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "tabLayout", "Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerTabLayout;", "chip", "Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;", "<init>", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerTabLayout;Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;)V", "getFilterType", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "getTabLayout", "()Lcom/robinhood/android/optionsstrategybuilder/pickers/DatePickerTabLayout;", "getChip", "()Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class Views {
        private final StrategyBuilderChip chip;
        private final OptionStrategyChainTemplate.FilterType filterType;
        private final DatePickerTabLayout tabLayout;

        public Views(OptionStrategyChainTemplate.FilterType filterType, DatePickerTabLayout tabLayout, StrategyBuilderChip chip) {
            Intrinsics.checkNotNullParameter(filterType, "filterType");
            Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
            Intrinsics.checkNotNullParameter(chip, "chip");
            this.filterType = filterType;
            this.tabLayout = tabLayout;
            this.chip = chip;
        }

        public final OptionStrategyChainTemplate.FilterType getFilterType() {
            return this.filterType;
        }

        public final DatePickerTabLayout getTabLayout() {
            return this.tabLayout;
        }

        public final StrategyBuilderChip getChip() {
            return this.chip;
        }
    }
}
