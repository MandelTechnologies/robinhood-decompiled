package com.robinhood.android.designsystem.chart;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.UnofficialBentoComponent;
import com.robinhood.android.designsystem.chart.StackedBlockDrawable;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.DistinctObservableProperty;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: StackedBlockChart.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ^2\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0002]^B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0018\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u00020\u001bJ\u0006\u00104\u001a\u00020.J\b\u00105\u001a\u00020.H\u0014J\b\u00106\u001a\u00020\u001bH\u0016J\u0010\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u000209H\u0017J\u0010\u0010:\u001a\u00020.2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020=H\u0014J\u0010\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020@H\u0014J(\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020CH\u0014J\u0017\u0010G\u001a\u00020.2\b\u0010H\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0002\u0010IJ)\u0010J\u001a\u00020.2\b\u0010K\u001a\u0004\u0018\u00010C2\b\u0010L\u001a\u0004\u0018\u00010C2\u0006\u0010M\u001a\u00020\u001bH\u0002¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020PH\u0002JZ\u0010Q\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010S\u0012\u0004\u0012\u0002HT0R\"\u0004\b\u0000\u0010T2\u0006\u0010U\u001a\u0002HT2.\b\u0004\u0010V\u001a(\u0012\u0004\u0012\u00020P\u0012\u0013\u0012\u0011HT¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020P0W¢\u0006\u0002\b[H\u0082\b¢\u0006\u0002\u0010\\R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R-\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,*\u0004\b'\u0010(¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockChart;", "Landroid/view/View;", "Lcom/robinhood/utils/ui/view/Bindable;", "", "Lcom/robinhood/android/designsystem/chart/BlockRegion;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/designsystem/chart/StackedBlockChart$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/designsystem/chart/StackedBlockChart$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/designsystem/chart/StackedBlockChart$Callbacks;)V", "<set-?>", "", "totalWidthProportion", "getTotalWidthProportion", "()F", "setTotalWidthProportion", "(F)V", "totalWidthProportion$delegate", "Lkotlin/properties/ReadWriteProperty;", "value", "", "areSegmentsShown", "getAreSegmentsShown", "()Z", "setAreSegmentsShown", "(Z)V", ResourceTypes.DRAWABLE, "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable;", "scrubbingAnimator", "Landroid/animation/ValueAnimator;", "segmentsAnimator", "regions", "getRegions$delegate", "(Lcom/robinhood/android/designsystem/chart/StackedBlockChart;)Ljava/lang/Object;", "getRegions", "()Ljava/util/List;", "setRegions", "(Ljava/util/List;)V", "bind", "", "state", "highlightRegion", "identifier", "", AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_EXPAND, "resetToDefaultState", "onAttachedToWindow", "performClick", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "handleScrub", "onDraw", "canvas", "Landroid/graphics/Canvas;", "verifyDrawable", "who", "Landroid/graphics/drawable/Drawable;", "onSizeChanged", "w", "", "h", "oldw", "oldh", "animateScrubbing", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "(Ljava/lang/Integer;)V", "animateIndex", "positionIndex", "scrubbingIndex", "isScrubbing", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "buildConfiguration", "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Configuration;", "configurationValue", "Lkotlin/properties/ReadWriteProperty;", "", "T", "initialValue", "update", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "newValue", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lkotlin/properties/ReadWriteProperty;", "Callbacks", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@UnofficialBentoComponent
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StackedBlockChart extends View implements Bindable<List<? extends BlockRegion>> {
    private static final SelectorResource<Integer> BACKGROUND_COLOR;
    public static final float DEFAULT_TOTAL_WIDTH_PROPORTION = 0.8f;
    public static final long SCRUBBING_DURATION_TIME = 500;
    public static final long SELECTION_DURATION_TIME = 1000;
    private Callbacks callbacks;
    private final StackedBlockDrawable drawable;
    private final ValueAnimator scrubbingAnimator;
    private final ValueAnimator segmentsAnimator;

    /* renamed from: totalWidthProportion$delegate, reason: from kotlin metadata */
    private final Interfaces3 totalWidthProportion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(StackedBlockChart.class, "totalWidthProportion", "getTotalWidthProportion()F", 0))};

    /* compiled from: StackedBlockChart.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockChart$Callbacks;", "", "onScrubbingStarted", "", "onRegionScrubbed", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "region", "Lcom/robinhood/android/designsystem/chart/BlockRegion;", "onScrubbingEnded", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRegionScrubbed(int index, BlockRegion region);

        void onScrubbingEnded();

        void onScrubbingStarted();
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public /* bridge */ /* synthetic */ void bind(List<? extends BlockRegion> list) {
        bind2((List<BlockRegion>) list);
    }

    public /* synthetic */ StackedBlockChart(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedBlockChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final Float fValueOf = Float.valueOf(0.8f);
        this.totalWidthProportion = new DistinctObservableProperty<Float>(fValueOf) { // from class: com.robinhood.android.designsystem.chart.StackedBlockChart$special$$inlined$configurationValue$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Float oldValue, Float newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.drawable.setConfiguration(StackedBlockDrawable.Configuration.copy$default(this.drawable.getConfiguration(), 0, 0, 0, 0, 0, 0.0f, null, 0, 0.0f, 0, 0, newValue.floatValue(), 2047, null));
            }
        };
        this.drawable = new StackedBlockDrawable(this, buildConfiguration());
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.designsystem.chart.StackedBlockChart$scrubbingAnimator$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                StackedBlockDrawable stackedBlockDrawable = this.this$0.drawable;
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                stackedBlockDrawable.setScrubbingAnimationProgress(((Float) animatedValue).floatValue());
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.designsystem.chart.StackedBlockChart$scrubbingAnimator$lambda$3$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.this$0.drawable.setAnimatingSegments(false);
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.designsystem.chart.StackedBlockChart$scrubbingAnimator$lambda$3$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                valueAnimatorOfFloat.setDuration(500L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.scrubbingAnimator = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(500L);
        valueAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.designsystem.chart.StackedBlockChart$segmentsAnimator$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                StackedBlockDrawable stackedBlockDrawable = this.this$0.drawable;
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                stackedBlockDrawable.setSegmentsAnimationProgress(((Float) animatedValue).floatValue());
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat2);
        valueAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.designsystem.chart.StackedBlockChart$segmentsAnimator$lambda$5$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.this$0.drawable.setAnimatingSegments(true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat2, "apply(...)");
        this.segmentsAnimator = valueAnimatorOfFloat2;
        int[] StackedBlockChart = C13997R.styleable.StackedBlockChart;
        Intrinsics.checkNotNullExpressionValue(StackedBlockChart, "StackedBlockChart");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StackedBlockChart, 0, 0);
        setTotalWidthProportion(typedArrayObtainStyledAttributes.getFloat(C13997R.styleable.StackedBlockChart_totalWidthProportion, 0.8f));
        setAreSegmentsShown(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.StackedBlockChart_showSegments, false));
        typedArrayObtainStyledAttributes.recycle();
        setClipToOutline(false);
    }

    private final <T> Interfaces3<Object, T> configurationValue(final T initialValue, final Function2<? super StackedBlockDrawable.Configuration, ? super T, StackedBlockDrawable.Configuration> update) {
        return new DistinctObservableProperty<T>(initialValue) { // from class: com.robinhood.android.designsystem.chart.StackedBlockChart$configurationValue$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, T oldValue, T newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.drawable.setConfiguration((StackedBlockDrawable.Configuration) update.invoke(this.drawable.getConfiguration(), newValue));
            }
        };
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    static {
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        BACKGROUND_COLOR = new SelectorResource<>(color, new ThemedResourceReference(ResourceType.BOOLEAN.INSTANCE, C20690R.attr.isDay), new ThemedResourceReference(color, C20690R.attr.colorBackground3), new ThemedResourceReference(color, C20690R.attr.colorBackground2));
    }

    public final float getTotalWidthProportion() {
        return ((Number) this.totalWidthProportion.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final void setTotalWidthProportion(float f) {
        this.totalWidthProportion.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    public final boolean getAreSegmentsShown() {
        return this.drawable.getShowSegments();
    }

    public final void setAreSegmentsShown(boolean z) {
        float[] fArr;
        if (z == this.drawable.getShowSegments()) {
            return;
        }
        this.segmentsAnimator.end();
        this.scrubbingAnimator.end();
        this.drawable.resetIndices();
        if (z) {
            fArr = new float[]{1.0f, 0.0f};
        } else {
            fArr = new float[]{0.0f, 1.0f};
        }
        this.drawable.setShowSegments(z);
        this.segmentsAnimator.setFloatValues(Arrays.copyOf(fArr, fArr.length));
        this.segmentsAnimator.start();
    }

    public final List<BlockRegion> getRegions() {
        return this.drawable.getRegions();
    }

    public final void setRegions(List<BlockRegion> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.drawable.setRegions(list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(List<BlockRegion> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setRegions(state);
    }

    public static /* synthetic */ boolean highlightRegion$default(StackedBlockChart stackedBlockChart, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return stackedBlockChart.highlightRegion(str, z);
    }

    public final boolean highlightRegion(String identifier, boolean expand) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Iterator<BlockRegion> it = this.drawable.getRegions().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getIdentifier(), identifier)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        Integer selectedIndex = this.drawable.getSelectedIndex();
        if (selectedIndex != null && i == selectedIndex.intValue()) {
            return true;
        }
        this.scrubbingAnimator.setDuration(1000L);
        if (expand) {
            animateIndex(Integer.valueOf(i), Integer.valueOf(i), false);
            return true;
        }
        animateIndex(null, Integer.valueOf(i), false);
        return true;
    }

    public final void resetToDefaultState() {
        this.scrubbingAnimator.setDuration(500L);
        animateIndex(null, null, false);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(ScarletManager2.getScarletManager(context).getThemeChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.designsystem.chart.StackedBlockChart$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StackedBlockChart.onAttachedToWindow$lambda$7(this.f$0, (ThemeNode) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$7(StackedBlockChart stackedBlockChart, ThemeNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        stackedBlockChart.drawable.setConfiguration(stackedBlockChart.buildConfiguration());
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public boolean performClick() {
        playSoundEffect(0);
        performHapticFeedback(0);
        return super.performClick();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Callbacks callbacks = this.callbacks;
        if (callbacks == null) {
            resetToDefaultState();
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            handleScrub(event);
            callbacks.onScrubbingStarted();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                handleScrub(event);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        resetToDefaultState();
        callbacks.onScrubbingEnded();
        return false;
    }

    private final void handleScrub(MotionEvent event) {
        animateScrubbing(this.drawable.calculateIndex(event.getX(), event.getY()));
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.drawable.draw(canvas);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return who == this.drawable || super.verifyDrawable(who);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.drawable.setBounds(0, 0, getWidth(), getHeight());
        invalidate();
    }

    private final void animateScrubbing(Integer index) {
        BlockRegion blockRegion;
        Callbacks callbacks;
        StackedBlockDrawable stackedBlockDrawable = this.drawable;
        if (Intrinsics.areEqual(index, stackedBlockDrawable.getScrubbingIndex())) {
            return;
        }
        animateIndex(null, index, true);
        performClick();
        if (index == null || (blockRegion = (BlockRegion) CollectionsKt.getOrNull(stackedBlockDrawable.getRegions(), index.intValue())) == null || (callbacks = this.callbacks) == null) {
            return;
        }
        callbacks.onRegionScrubbed(index.intValue(), blockRegion);
    }

    private final void animateIndex(Integer positionIndex, Integer scrubbingIndex, boolean isScrubbing) {
        StackedBlockDrawable stackedBlockDrawable = this.drawable;
        stackedBlockDrawable.setScrubbingIndex(scrubbingIndex);
        stackedBlockDrawable.setSelectedIndex(positionIndex);
        ValueAnimator valueAnimator = this.scrubbingAnimator;
        if ((valueAnimator.isRunning() && isScrubbing) || this.segmentsAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    private final StackedBlockDrawable.Configuration buildConfiguration() {
        Context context = getContext();
        SelectorResource<Integer> resourceReferences7 = BACKGROUND_COLOR;
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        int iIntValue = resourceReferences7.resolveOrThrow(theme).intValue();
        Intrinsics.checkNotNull(context);
        return new StackedBlockDrawable.Configuration(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground3), (-1728053248) | (16777215 & iIntValue), iIntValue, context.getColor(C20690R.color.mobius_foreground_2_day), ThemeColors.getThemeColor(context, C20690R.attr.colorForeground2), ViewsKt.getDimension(this, C13997R.dimen.text_size_mobius_regular_small), RhTypeface.BOLD.load(context), context.getColor(C20690R.color.mobius_black), ViewsKt.getDimension(this, C13997R.dimen.stacked_block_chart_stroke_width), ThemeColors.getThemeColor(context, C20690R.attr.colorForeground3), iIntValue, getTotalWidthProportion());
    }
}
