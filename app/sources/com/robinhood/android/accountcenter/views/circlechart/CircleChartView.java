package com.robinhood.android.accountcenter.views.circlechart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CircleChartView.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0014J\u0018\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0014J0\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0014J\b\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020\u0012H\u0002J\b\u00106\u001a\u00020\u0012H\u0002J\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\tH\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020&H\u0002R2\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0004\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/circlechart/CircleChartView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "Lcom/robinhood/android/accountcenter/views/circlechart/CircleChartView$Item;", WebsocketGatewayConstants.DATA_KEY, "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "onItemClick", "Lkotlin/Function1;", "", "Lcom/robinhood/android/accountcenter/views/circlechart/OnItemClick;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "minCircleRadius", "", "maxCircleRadius", "guideCircleRadius", "guideCircle", "Lcom/robinhood/android/accountcenter/views/circlechart/Circle;", "circles", "selectedCircle", "centerPoint", "Landroid/graphics/PointF;", "getCenterPoint", "()Landroid/graphics/PointF;", "onSizeChanged", "w", "", "h", "oldw", "oldh", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "", "left", "top", "right", "bottom", "updateCircles", "updateSelectedCircle", "bindChildViews", "centerCircles", "getCircleBoundingRect", "Landroid/graphics/RectF;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Companion", "Item", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class CircleChartView extends FrameLayout {
    private static final float SELECTED_CIRCLE_SIZE_INCREASE_PERCENT = 0.015f;
    private static final float VIEW_HEIGHT_INCREASE_PERCENT = 0.1f;
    private List<Circle> circles;
    private List<Item> data;
    private Circle guideCircle;
    private float guideCircleRadius;
    private float maxCircleRadius;
    private float minCircleRadius;
    private Function1<? super Item, Unit> onItemClick;
    private Circle selectedCircle;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.data = CollectionsKt.emptyList();
        this.guideCircle = new Circle(new PointF(0.0f, 0.0f), 0.0f);
        this.circles = CollectionsKt.emptyList();
        this.selectedCircle = new Circle(new PointF(0.0f, 0.0f), 0.0f);
    }

    public final List<Item> getData() {
        return CollectionsKt.toList(this.data);
    }

    public final void setData(List<Item> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.data, value)) {
            return;
        }
        this.data = value;
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.accountcenter.views.circlechart.CircleChartView$special$$inlined$beginDelayedTransition$1
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
        autoTransition.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.accountcenter.views.circlechart.CircleChartView$special$$inlined$beginDelayedTransition$2
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
        autoTransition.setDuration(100L);
        TransitionManager.beginDelayedTransition(this, autoTransition);
        updateCircles();
        bindChildViews();
        requestLayout();
    }

    public final Function1<Item, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final void setOnItemClick(Function1<? super Item, Unit> function1) {
        this.onItemClick = function1;
    }

    private final PointF getCenterPoint() {
        return new PointF(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateCircles();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        updateCircles();
        if (!this.circles.isEmpty()) {
            Float fMinOrNull = SequencesKt.minOrNull(SequencesKt.map(CollectionsKt.asSequence(this.circles), new Function1() { // from class: com.robinhood.android.accountcenter.views.circlechart.CircleChartView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Float.valueOf(CircleChartView.onMeasure$lambda$1((Circle) obj));
                }
            }));
            Intrinsics.checkNotNull(fMinOrNull);
            float fFloatValue = fMinOrNull.floatValue();
            Float fMaxOrNull = SequencesKt.maxOrNull((Sequence<? extends Float>) SequencesKt.map(CollectionsKt.asSequence(this.circles), new Function1() { // from class: com.robinhood.android.accountcenter.views.circlechart.CircleChartView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Float.valueOf(CircleChartView.onMeasure$lambda$2((Circle) obj));
                }
            }));
            Intrinsics.checkNotNull(fMaxOrNull);
            setMeasuredDimension(getMeasuredWidth(), View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt((fMaxOrNull.floatValue() - fFloatValue) * 1.1f), 1073741824));
        }
        int size = this.circles.size();
        for (int i = 0; i < size; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.circlechart.CircleView");
            RectF circleBoundingRect = getCircleBoundingRect(i);
            int iRoundToInt = MathKt.roundToInt(circleBoundingRect.width());
            int iRoundToInt2 = MathKt.roundToInt(circleBoundingRect.height());
            ((CircleView) childAt).measure(View.MeasureSpec.makeMeasureSpec(iRoundToInt + (iRoundToInt % 2), 1073741824), View.MeasureSpec.makeMeasureSpec(iRoundToInt2 + (iRoundToInt2 % 2), 1073741824));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float onMeasure$lambda$1(Circle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getBoundingRect().top;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float onMeasure$lambda$2(Circle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getBoundingRect().bottom;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int size = this.circles.size();
        for (int i = 0; i < size; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.circlechart.CircleView");
            RectF circleBoundingRect = getCircleBoundingRect(i);
            ((CircleView) childAt).layout(MathKt.roundToInt(circleBoundingRect.left), MathKt.roundToInt(circleBoundingRect.top), MathKt.roundToInt(circleBoundingRect.right), MathKt.roundToInt(circleBoundingRect.bottom));
        }
    }

    private final void updateCircles() {
        Object obj;
        float measuredWidth = getMeasuredWidth();
        float f = measuredWidth / 10.0f;
        this.guideCircleRadius = f;
        this.maxCircleRadius = measuredWidth / 4.0f;
        this.minCircleRadius = f;
        this.guideCircle = new Circle(getCenterPoint(), this.guideCircleRadius);
        List<Item> data = getData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        for (Item item : data) {
            float f2 = this.minCircleRadius;
            arrayList.add(Float.valueOf(f2 + ((this.maxCircleRadius - f2) * item.getPercentage())));
        }
        Iterator<T> it = getData().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float percentage = ((Item) next).getPercentage();
                do {
                    Object next2 = it.next();
                    float percentage2 = ((Item) next2).getPercentage();
                    if (Float.compare(percentage, percentage2) < 0) {
                        next = next2;
                        percentage = percentage2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Item item2 = (Item) obj;
        boolean z = false;
        if (item2 != null && item2.getPercentage() > 0.5f) {
            z = true;
        }
        this.circles = centerCircles(this.guideCircle.generateCircles(arrayList, z));
        updateSelectedCircle();
    }

    private final void updateSelectedCircle() {
        Iterator<Item> it = getData().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getSelected()) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            this.selectedCircle = this.circles.get(i).offsetRadius(getMeasuredWidth() * 0.015f);
        }
    }

    private final void bindChildViews() throws Resources.NotFoundException {
        int childCount = getChildCount();
        int size = getData().size();
        if (childCount > size) {
            removeViews(0, childCount - size);
        } else if (size > childCount) {
            int i = size - childCount;
            for (int i2 = 0; i2 < i; i2++) {
                addView(CircleView.INSTANCE.inflate((ViewGroup) this));
            }
        }
        int i3 = 0;
        for (final Item item : getData()) {
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.circlechart.CircleView");
            CircleView circleView = (CircleView) childAt;
            circleView.bind(item.getDisplayPercentage(), item.getText());
            float dimension = circleView.getResources().getDimension(C8293R.dimen.circle_selected_state_elevation);
            if (!item.getSelected()) {
                dimension = 0.0f;
            }
            circleView.setElevation(dimension);
            circleView.setSelected(item.getSelected());
            circleView.setActivated(item.getPercentage() > 0.0f);
            OnClickListeners.onClick(circleView, new Function0() { // from class: com.robinhood.android.accountcenter.views.circlechart.CircleChartView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CircleChartView.bindChildViews$lambda$9$lambda$8(this.f$0, item);
                }
            });
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindChildViews$lambda$9$lambda$8(CircleChartView circleChartView, Item item) {
        Function1<? super Item, Unit> function1 = circleChartView.onItemClick;
        if (function1 != null) {
            function1.invoke(item);
        }
        return Unit.INSTANCE;
    }

    private final List<Circle> centerCircles(List<Circle> circles) {
        RectF rectF = new RectF(getCenterPoint().x, getCenterPoint().y, getCenterPoint().x, getCenterPoint().y);
        Iterator<Circle> it = circles.iterator();
        while (it.hasNext()) {
            rectF.union(it.next().getBoundingRect());
        }
        float fCenterX = rectF.centerX() - getCenterPoint().x;
        float fCenterY = rectF.centerY() - getCenterPoint().y;
        List<Circle> list = circles;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Circle) it2.next()).offset(new PointF(fCenterX, fCenterY)));
        }
        return arrayList;
    }

    private final RectF getCircleBoundingRect(int index) {
        return (getData().get(index).getSelected() ? this.selectedCircle : this.circles.get(index)).getBoundingRect();
    }

    /* compiled from: CircleChartView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/circlechart/CircleChartView$Item;", "", "id", "", "text", "percentage", "", "displayPercentage", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getText", "getPercentage", "()F", "getDisplayPercentage", "getSelected", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final String displayPercentage;
        private final String id;
        private final float percentage;
        private final boolean selected;
        private final String text;

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, float f, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                str2 = item.text;
            }
            if ((i & 4) != 0) {
                f = item.percentage;
            }
            if ((i & 8) != 0) {
                str3 = item.displayPercentage;
            }
            if ((i & 16) != 0) {
                z = item.selected;
            }
            boolean z2 = z;
            float f2 = f;
            return item.copy(str, str2, f2, str3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final float getPercentage() {
            return this.percentage;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisplayPercentage() {
            return this.displayPercentage;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public final Item copy(String id, String text, float percentage, String displayPercentage, boolean selected) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(displayPercentage, "displayPercentage");
            return new Item(id, text, percentage, displayPercentage, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.id, item.id) && Intrinsics.areEqual(this.text, item.text) && Float.compare(this.percentage, item.percentage) == 0 && Intrinsics.areEqual(this.displayPercentage, item.displayPercentage) && this.selected == item.selected;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.text.hashCode()) * 31) + Float.hashCode(this.percentage)) * 31) + this.displayPercentage.hashCode()) * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "Item(id=" + this.id + ", text=" + this.text + ", percentage=" + this.percentage + ", displayPercentage=" + this.displayPercentage + ", selected=" + this.selected + ")";
        }

        public Item(String id, String text, float f, String displayPercentage, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(displayPercentage, "displayPercentage");
            this.id = id;
            this.text = text;
            this.percentage = f;
            this.displayPercentage = displayPercentage;
            this.selected = z;
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public final float getPercentage() {
            return this.percentage;
        }

        public final String getDisplayPercentage() {
            return this.displayPercentage;
        }

        public final boolean getSelected() {
            return this.selected;
        }
    }
}
