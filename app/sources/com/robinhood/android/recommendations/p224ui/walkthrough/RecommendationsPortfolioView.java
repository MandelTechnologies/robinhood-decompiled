package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.p224ui.walkthrough.PortfolioBlocksDrawable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: RecommendationsPortfolioView.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\u000e\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\rJ\u0016\u0010)\u001a\u00020%2\u000e\b\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0015J\u0006\u0010,\u001a\u00020%J\u0006\u0010-\u001a\u00020%J\"\u0010.\u001a\u00020%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020%01J\u0018\u00102\u001a\n 4*\u0004\u0018\u000103032\u0006\u00105\u001a\u00020+H\u0002J\u0010\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\rH\u0002J\u0010\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020\rH\u0002J\u0010\u00109\u001a\u00020\r2\u0006\u00107\u001a\u00020\rH\u0002J\u0010\u0010:\u001a\u00020\r2\u0006\u00107\u001a\u00020\rH\u0002J\u0016\u0010;\u001a\u0002032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0002J\u0010\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020\rH\u0002J\b\u0010>\u001a\u000203H\u0002JN\u0010?\u001a\n 4*\u0004\u0018\u000103032<\u0010@\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\r¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020%0AH\u0002J\u0010\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020HH\u0014J(\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020+2\u0006\u0010K\u001a\u00020+2\u0006\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020+H\u0014J\u0010\u0010N\u001a\u00020%2\u0006\u0010O\u001a\u00020PH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014*\u0004\b\u000f\u0010\u0010R7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c*\u0004\b\u0018\u0010\u0010R+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#*\u0004\b\u001f\u0010\u0010¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsPortfolioView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ResourceTypes.DRAWABLE, "Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioBlocksDrawable;", "animator", "Landroid/animation/Animator;", "<set-?>", "", "spacingWidth", "getSpacingWidth$delegate", "(Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsPortfolioView;)Ljava/lang/Object;", "getSpacingWidth", "()F", "setSpacingWidth", "(F)V", "", "Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioBlocksDrawable$Block;", "blocks", "getBlocks$delegate", "getBlocks", "()Ljava/util/List;", "setBlocks", "(Ljava/util/List;)V", "", "hideShadows", "getHideShadows$delegate", "getHideShadows", "()Z", "setHideShadows", "(Z)V", "setWeights", "", "newWeights", "setSpacing", "width", "setBlockColors", "colors", "", "playLoadingAnimation", "stopAnimation", "playCalculationAnimation", "finalWeights", "onAnimationEnd", "Lkotlin/Function0;", "upDownAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "calculateUpOffset", "percentageComplete", "calculateDownOffset", "calculateUpOpacity", "calculateDownOpacity", "weightsAnimator", "spacingAnimator", "newSpacing", "resetVerticalPositionAnimator", "valueAnimatorPercent0To100", "onUpdate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialBlocks", "percent", "verifyDrawable", "who", "Landroid/graphics/drawable/Drawable;", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsPortfolioView extends View {
    private static final long ANIMATION_DURATION_LONG = 500;
    private static final long ANIMATION_DURATION_SHORT = 300;
    private static final long ANIMATION_DURATION_START_DELAY = 150;
    private static final float HORIZONTAL_ANIM_BIG_WEIGHT = 0.85f;
    private static final long LOADING_ANIMATION_DURATION = 1000;
    private static final long LOADING_OFFSET = 233;
    private static final float MAX_LOADING_OFFSET = 1.08f;
    private static final float MAX_SHADOW_OPACITY = 0.15f;
    private static final float MIN_SHADOW_OPACITY = 0.05f;
    private Animator animator;
    private final PortfolioBlocksDrawable drawable;

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateDownOffset(float percentageComplete) {
        return (1.0f - percentageComplete) * (-1.08f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateDownOpacity(float percentageComplete) {
        return (percentageComplete * 0.10000001f) + 0.05f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateUpOffset(float percentageComplete) {
        return percentageComplete * (-1.08f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateUpOpacity(float percentageComplete) {
        return 0.15f - (percentageComplete * 0.10000001f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsPortfolioView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        PortfolioBlocksDrawable portfolioBlocksDrawable = new PortfolioBlocksDrawable(context);
        portfolioBlocksDrawable.setCallback(this);
        this.drawable = portfolioBlocksDrawable;
    }

    private final float getSpacingWidth() {
        return this.drawable.getSpacingWidth();
    }

    private final void setSpacingWidth(float f) {
        this.drawable.setSpacingWidth(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PortfolioBlocksDrawable.Block> getBlocks() {
        return this.drawable.getBlocks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBlocks(List<PortfolioBlocksDrawable.Block> list) {
        this.drawable.setBlocks(list);
    }

    public final boolean getHideShadows() {
        return this.drawable.getHideShadows();
    }

    public final void setHideShadows(boolean z) {
        this.drawable.setHideShadows(z);
    }

    public final void setWeights(List<Float> newWeights) {
        Intrinsics.checkNotNullParameter(newWeights, "newWeights");
        List<Float> list = newWeights;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PortfolioBlocksDrawable.Block(((Number) it.next()).floatValue(), 0.0f, 0.0f, 0, 14, null));
        }
        setBlocks(arrayList);
    }

    public final void setSpacing(float width) {
        spacingAnimator(width).setDuration(0L).start();
    }

    public final void setBlockColors(List<Integer> colors) {
        PortfolioBlocksDrawable.Block blockCopy$default;
        Intrinsics.checkNotNullParameter(colors, "colors");
        List<PortfolioBlocksDrawable.Block> blocks = getBlocks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks, 10));
        int i = 0;
        for (Object obj : blocks) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PortfolioBlocksDrawable.Block block = (PortfolioBlocksDrawable.Block) obj;
            Integer num = (Integer) CollectionsKt.getOrNull(colors, i);
            if (num != null && (blockCopy$default = PortfolioBlocksDrawable.Block.copy$default(block, 0.0f, 0.0f, 0.0f, num.intValue(), 7, null)) != null) {
                block = blockCopy$default;
            }
            arrayList.add(block);
            i = i2;
        }
        setBlocks(arrayList);
    }

    public final void playLoadingAnimation() {
        stopAnimation();
        List<PortfolioBlocksDrawable.Block> blocks = getBlocks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks, 10));
        int i = 0;
        for (Object obj : blocks) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(upDownAnimator(i));
            i = i2;
        }
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.animator = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsPortfolioView.playLoadingAnimation.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation, boolean isReverse) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animatorSet.start();
            }
        });
    }

    public final void stopAnimation() {
        Animator animator = this.animator;
        if (animator != null) {
            animator.removeAllListeners();
        }
        Animator animator2 = this.animator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public final void playCalculationAnimation(List<Float> finalWeights, final Function0<Unit> onAnimationEnd) {
        Float fValueOf = Float.valueOf(0.85f);
        Intrinsics.checkNotNullParameter(finalWeights, "finalWeights");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        Animator animator = this.animator;
        if (animator != null) {
            animator.removeAllListeners();
        }
        Animator animator2 = this.animator;
        if (animator2 != null) {
            animator2.cancel();
        }
        List<PortfolioBlocksDrawable.Block> blocks = getBlocks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks, 10));
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((PortfolioBlocksDrawable.Block) it.next()).getWeight()));
        }
        float size = 0.14999998f / (getBlocks().size() - 1.0f);
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(1, getBlocks().size());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it2 = primitiveRanges2Until.iterator();
        while (it2.hasNext()) {
            ((PrimitiveIterators6) it2).nextInt();
            arrayList2.add(Float.valueOf(size));
        }
        List<Float> listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) CollectionsKt.listOf(fValueOf));
        List<Float> listPlus2 = CollectionsKt.plus((Collection) CollectionsKt.listOf(fValueOf), (Iterable) arrayList2);
        ValueAnimator valueAnimatorResetVerticalPositionAnimator = resetVerticalPositionAnimator();
        valueAnimatorResetVerticalPositionAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimatorResetVerticalPositionAnimator.setDuration(1000L);
        valueAnimatorResetVerticalPositionAnimator.setStartDelay(150L);
        ValueAnimator valueAnimatorSpacingAnimator = spacingAnimator(0.0f);
        valueAnimatorSpacingAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimatorSpacingAnimator.setDuration(500L);
        ValueAnimator valueAnimatorWeightsAnimator = weightsAnimator(arrayList);
        valueAnimatorWeightsAnimator.setInterpolator(new AccelerateInterpolator());
        valueAnimatorWeightsAnimator.setDuration(300L);
        valueAnimatorWeightsAnimator.setStartDelay(150L);
        ValueAnimator valueAnimatorWeightsAnimator2 = weightsAnimator(listPlus);
        valueAnimatorWeightsAnimator2.setInterpolator(new DecelerateInterpolator());
        valueAnimatorWeightsAnimator2.setDuration(500L);
        ValueAnimator valueAnimatorWeightsAnimator3 = weightsAnimator(listPlus2);
        valueAnimatorWeightsAnimator3.setInterpolator(new DecelerateInterpolator());
        valueAnimatorWeightsAnimator3.setDuration(500L);
        ValueAnimator valueAnimatorWeightsAnimator4 = weightsAnimator(finalWeights);
        valueAnimatorWeightsAnimator4.setInterpolator(new DecelerateInterpolator());
        valueAnimatorWeightsAnimator4.setDuration(1500L);
        valueAnimatorWeightsAnimator4.setStartDelay(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorResetVerticalPositionAnimator, valueAnimatorSpacingAnimator, valueAnimatorWeightsAnimator2, valueAnimatorWeightsAnimator, valueAnimatorWeightsAnimator3, valueAnimatorWeightsAnimator4);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsPortfolioView$playCalculationAnimation$lambda$15$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator3) {
                onAnimationEnd.invoke();
            }
        });
        this.animator = animatorSet;
        animatorSet.start();
    }

    private final ValueAnimator upDownAnimator(final int index) throws Resources.NotFoundException {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setStartDelay(index * LOADING_OFFSET);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        final Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(getContext(), C25978R.anim.portfolio_loading_up_interpolator);
        final Interpolator interpolatorLoadInterpolator2 = AnimationUtils.loadInterpolator(getContext(), C25978R.anim.portfolio_loading_down_interpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsPortfolioView$upDownAnimator$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int i = 0;
                if (it.getAnimatedFraction() <= 0.5f) {
                    float interpolation = interpolatorLoadInterpolator.getInterpolation(it.getAnimatedFraction() / 0.5f);
                    float fCalculateUpOffset = this.calculateUpOffset(interpolation);
                    float fCalculateUpOpacity = this.calculateUpOpacity(interpolation);
                    RecommendationsPortfolioView recommendationsPortfolioView = this;
                    List blocks = recommendationsPortfolioView.getBlocks();
                    int i2 = index;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks, 10));
                    for (Object obj : blocks) {
                        int i3 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        PortfolioBlocksDrawable.Block blockCopy$default = (PortfolioBlocksDrawable.Block) obj;
                        if (i == i2) {
                            blockCopy$default = PortfolioBlocksDrawable.Block.copy$default(blockCopy$default, 0.0f, fCalculateUpOffset, fCalculateUpOpacity, 0, 9, null);
                        }
                        arrayList.add(blockCopy$default);
                        i = i3;
                    }
                    recommendationsPortfolioView.setBlocks(arrayList);
                    return;
                }
                float interpolation2 = interpolatorLoadInterpolator2.getInterpolation((it.getAnimatedFraction() - 0.5f) / 0.5f);
                float fCalculateDownOffset = this.calculateDownOffset(interpolation2);
                float fCalculateDownOpacity = this.calculateDownOpacity(interpolation2);
                RecommendationsPortfolioView recommendationsPortfolioView2 = this;
                List blocks2 = recommendationsPortfolioView2.getBlocks();
                int i4 = index;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks2, 10));
                for (Object obj2 : blocks2) {
                    int i5 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    PortfolioBlocksDrawable.Block blockCopy$default2 = (PortfolioBlocksDrawable.Block) obj2;
                    if (i == i4) {
                        blockCopy$default2 = PortfolioBlocksDrawable.Block.copy$default(blockCopy$default2, 0.0f, fCalculateDownOffset, fCalculateDownOpacity, 0, 9, null);
                    }
                    arrayList2.add(blockCopy$default2);
                    i = i5;
                }
                recommendationsPortfolioView2.setBlocks(arrayList2);
            }
        });
        return valueAnimatorOfFloat;
    }

    private final ValueAnimator weightsAnimator(final List<Float> newWeights) {
        ValueAnimator valueAnimatorValueAnimatorPercent0To100 = valueAnimatorPercent0To100(new Function2() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsPortfolioView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsPortfolioView.weightsAnimator$lambda$20(newWeights, this, (List) obj, ((Float) obj2).floatValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorValueAnimatorPercent0To100, "valueAnimatorPercent0To100(...)");
        return valueAnimatorValueAnimatorPercent0To100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit weightsAnimator$lambda$20(List list, RecommendationsPortfolioView recommendationsPortfolioView, List startingBlocks, float f) {
        Intrinsics.checkNotNullParameter(startingBlocks, "startingBlocks");
        List list2 = startingBlocks;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((PortfolioBlocksDrawable.Block) it.next()).getWeight()));
        }
        if (arrayList.size() != list.size()) {
            throw new IllegalStateException("Must have equal number of different weights to animate");
        }
        List<PortfolioBlocksDrawable.Block> blocks = recommendationsPortfolioView.getBlocks();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks, 10));
        int i = 0;
        for (Object obj : blocks) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PortfolioBlocksDrawable.Block block = (PortfolioBlocksDrawable.Block) obj;
            float fFloatValue = ((Number) arrayList.get(i)).floatValue();
            arrayList2.add(PortfolioBlocksDrawable.Block.copy$default(block, fFloatValue - ((fFloatValue - ((Number) list.get(i)).floatValue()) * f), 0.0f, 0.0f, 0, 14, null));
            i = i2;
        }
        recommendationsPortfolioView.setBlocks(arrayList2);
        return Unit.INSTANCE;
    }

    private final ValueAnimator spacingAnimator(final float newSpacing) {
        final float spacingWidth = getSpacingWidth();
        ValueAnimator valueAnimatorValueAnimatorPercent0To100 = valueAnimatorPercent0To100(new Function2() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsPortfolioView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsPortfolioView.spacingAnimator$lambda$21(this.f$0, spacingWidth, newSpacing, (List) obj, ((Float) obj2).floatValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorValueAnimatorPercent0To100, "valueAnimatorPercent0To100(...)");
        return valueAnimatorValueAnimatorPercent0To100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit spacingAnimator$lambda$21(RecommendationsPortfolioView recommendationsPortfolioView, float f, float f2, List list, float f3) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        recommendationsPortfolioView.setSpacingWidth(f - (f3 * (f - f2)));
        return Unit.INSTANCE;
    }

    private final ValueAnimator resetVerticalPositionAnimator() {
        ValueAnimator valueAnimatorValueAnimatorPercent0To100 = valueAnimatorPercent0To100(new Function2() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsPortfolioView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsPortfolioView.resetVerticalPositionAnimator$lambda$23(this.f$0, (List) obj, ((Float) obj2).floatValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorValueAnimatorPercent0To100, "valueAnimatorPercent0To100(...)");
        return valueAnimatorValueAnimatorPercent0To100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetVerticalPositionAnimator$lambda$23(RecommendationsPortfolioView recommendationsPortfolioView, List list, float f) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        List<PortfolioBlocksDrawable.Block> blocks = recommendationsPortfolioView.getBlocks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks, 10));
        for (PortfolioBlocksDrawable.Block block : blocks) {
            arrayList.add(PortfolioBlocksDrawable.Block.copy$default(block, 0.0f, block.getYOffsetPercentage() * (1.0f - f), 0.15f, 0, 9, null));
        }
        recommendationsPortfolioView.setBlocks(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.List] */
    private final ValueAnimator valueAnimatorPercent0To100(final Function2<? super List<PortfolioBlocksDrawable.Block>, ? super Float, Unit> onUpdate) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsPortfolioView$valueAnimatorPercent0To100$lambda$25$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.List] */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                objectRef.element = this.getBlocks();
            }
        });
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsPortfolioView$valueAnimatorPercent0To100$1$2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Function2<List<PortfolioBlocksDrawable.Block>, Float, Unit> function2 = onUpdate;
                List<PortfolioBlocksDrawable.Block> list = objectRef.element;
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                function2.invoke(list, (Float) animatedValue);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return Intrinsics.areEqual(who, this.drawable) || super.verifyDrawable(who);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.drawable.setBounds(0, 0, w, h);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.drawable.draw(canvas);
    }
}
