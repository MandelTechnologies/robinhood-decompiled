package com.robinhood.android.rhy.cardactivation.p243ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.common.util.transition.FixedSlide;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.ScaleVisibility;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhy.cardactivation.C27358R;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.extensions.ViewsKt;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NotificationCarouselView.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0016\"\u00020\u0012¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0014J0\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0015J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020\u0014H\u0002J\u0014\u0010-\u001a\u00020\u0014*\u00020'2\u0006\u0010.\u001a\u00020\u0012H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/NotificationCarouselView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "horizontalPadding", "", "verticalSpacing", "maskTop", "", "maskBottom", "maskPaint", "Landroid/graphics/Paint;", "itemQueue", "Ljava/util/ArrayDeque;", "Lcom/robinhood/android/rhy/cardactivation/ui/NotificationCarouselView$Item;", "setItems", "", "items", "", "([Lcom/robinhood/android/rhy/cardactivation/ui/NotificationCarouselView$Item;)V", "", "onAttachedToWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "", "left", "top", "right", "bottom", "layoutVertically", "recreateMask", "getChildAt", "Lcom/robinhood/android/rhy/cardactivation/ui/FakeNotificationView;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "rotate", "bind", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Item", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationCarouselView extends ViewGroup {
    public static final int $stable = 8;
    private final int horizontalPadding;
    private final ArrayDeque<Item> itemQueue;
    private float maskBottom;
    private final Paint maskPaint;
    private float maskTop;
    private final int verticalSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayerType(2, null);
        setClipChildren(false);
        this.horizontalPadding = ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_xlarge);
        this.verticalSpacing = ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_default);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.maskPaint = paint;
        this.itemQueue = new ArrayDeque<>();
        FakeNotificationView fakeNotificationViewInflate = FakeNotificationView.INSTANCE.inflate((ViewGroup) this);
        fakeNotificationViewInflate.setVisibility(8);
        addView(fakeNotificationViewInflate);
        for (int i = 0; i < 2; i++) {
            addView(FakeNotificationView.INSTANCE.inflate((ViewGroup) this));
        }
        if (isInEditMode()) {
            setItems(new Item(ViewsKt.getString(this, C27358R.string.card_activation_location_protection_fake_notification_title_1), ViewsKt.getString(this, C27358R.string.card_activation_location_protection_fake_notification_message_1)), new Item(ViewsKt.getString(this, C27358R.string.card_activation_location_protection_fake_notification_title_2), ViewsKt.getString(this, C27358R.string.card_activation_location_protection_fake_notification_message_2)));
        }
    }

    public /* synthetic */ NotificationCarouselView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setItems(Item... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        setItems(ArraysKt.asList(items));
    }

    public final void setItems(List<Item> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayDeque<Item> arrayDeque = this.itemQueue;
        arrayDeque.clear();
        arrayDeque.addAll(items);
        Item itemPollFirst = this.itemQueue.pollFirst();
        Item itemPollFirst2 = this.itemQueue.pollFirst();
        if (itemPollFirst2 != null) {
            FakeNotificationView childAt = getChildAt(2);
            Intrinsics.checkNotNull(childAt);
            bind(childAt, itemPollFirst2);
            this.itemQueue.addFirst(itemPollFirst2);
        }
        if (itemPollFirst != null) {
            FakeNotificationView childAt2 = getChildAt(1);
            Intrinsics.checkNotNull(childAt2);
            bind(childAt2, itemPollFirst);
            this.itemQueue.addFirst(itemPollFirst);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<Long> observableInterval = Observable.interval(3L, TimeUnit.SECONDS, AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableInterval, "interval(...)");
        ViewDisposerKt.bindTo$default(observableInterval, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.NotificationCarouselView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationCarouselView.onAttachedToWindow$lambda$4(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(NotificationCarouselView notificationCarouselView, Long l) {
        notificationCarouselView.rotate();
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (this.horizontalPadding * 2), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        layoutVertically();
        recreateMask();
    }

    private final void layoutVertically() {
        int bottom = this.verticalSpacing;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            FakeNotificationView childAt = getChildAt(i);
            Intrinsics.checkNotNull(childAt);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight();
                int i2 = this.horizontalPadding;
                childAt.layout(i2, bottom, childAt.getMeasuredWidth() + i2, measuredHeight + bottom);
                bottom = childAt.getBottom() + this.verticalSpacing;
            }
        }
    }

    private final void recreateMask() {
        Intrinsics.checkNotNull(getChildAt(1));
        Intrinsics.checkNotNull(getChildAt(2));
        float bottom = (r0.getBottom() + r1.getTop()) / 2.0f;
        float height = getHeight();
        if (bottom == this.maskTop && height == this.maskBottom) {
            return;
        }
        this.maskTop = bottom;
        this.maskBottom = height;
        this.maskPaint.setShader(new LinearGradient(0.0f, bottom, 0.0f, height, -1275068417, 16777215, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup
    public FakeNotificationView getChildAt(int index) {
        return (FakeNotificationView) super.getChildAt(index);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        canvas.drawRect(0.0f, this.maskTop, getWidth(), this.maskBottom, this.maskPaint);
    }

    private final void rotate() {
        Item itemPoll = this.itemQueue.poll();
        if (itemPoll == null) {
            return;
        }
        this.itemQueue.add(itemPoll);
        float dimension = ViewsKt.getDimension(this, C13997R.dimen.rds_spacing_large);
        FakeNotificationView childAt = getChildAt(0);
        Intrinsics.checkNotNull(childAt);
        FakeNotificationView childAt2 = getChildAt(1);
        Intrinsics.checkNotNull(childAt2);
        FakeNotificationView childAt3 = getChildAt(2);
        Intrinsics.checkNotNull(childAt3);
        bind(childAt, itemPoll);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.rhy.cardactivation.ui.NotificationCarouselView$rotate$$inlined$beginDelayedTransition$1
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
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.rhy.cardactivation.ui.NotificationCarouselView$rotate$$inlined$beginDelayedTransition$2
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
        TransitionSet transitionSet2 = new TransitionSet();
        Transitions2.add(transitionSet2, new FixedSlide(48, dimension));
        Transitions2.add(transitionSet2, new Fade());
        Transitions2.add(transitionSet2, new ScaleVisibility(0.0f, 1, null));
        transitionSet2.addTarget((View) childAt2);
        transitionSet.addTransition(transitionSet2);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.addTarget(childAt3);
        transitionSet.addTransition(changeBounds);
        TransitionSet transitionSet3 = new TransitionSet();
        Transitions2.add(transitionSet3, new FixedSlide(80, dimension));
        Transitions2.add(transitionSet3, new Fade());
        Transitions2.add(transitionSet3, new ScaleVisibility(0.0f, 1, null));
        transitionSet3.addTarget((View) childAt);
        transitionSet.addTransition(transitionSet3);
        Transitions2.setChildInterpolator(transitionSet, Interpolators.INSTANCE.getFastOutSlowIn());
        TransitionManager.beginDelayedTransition(this, transitionSet);
        childAt.setVisibility(0);
        childAt2.setVisibility(8);
        removeViewAt(0);
        addView(childAt);
    }

    private final void bind(FakeNotificationView fakeNotificationView, Item item) {
        fakeNotificationView.setTitle(item.getTitle());
        fakeNotificationView.setMessage(item.getMessage());
    }

    /* compiled from: NotificationCarouselView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/NotificationCarouselView$Item;", "", "title", "", "message", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/CharSequence;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final CharSequence message;
        private final CharSequence title;

        public static /* synthetic */ Item copy$default(Item item, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = item.title;
            }
            if ((i & 2) != 0) {
                charSequence2 = item.message;
            }
            return item.copy(charSequence, charSequence2);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        public final Item copy(CharSequence title, CharSequence message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            return new Item(title, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.title, item.title) && Intrinsics.areEqual(this.message, item.message);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Item(title=" + ((Object) this.title) + ", message=" + ((Object) this.message) + ")";
        }

        public Item(CharSequence title, CharSequence message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.title = title;
            this.message = message;
        }

        public final CharSequence getTitle() {
            return this.title;
        }

        public final CharSequence getMessage() {
            return this.message;
        }
    }
}
