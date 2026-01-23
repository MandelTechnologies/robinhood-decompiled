package com.robinhood.android.directipo.allocation.p104ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.directipo.models.p293ui.UiDirectIpoAllocation;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoAllocatedCardView.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bH\u0014J\u0018\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0014J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014*\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedCardView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ResourceTypes.DRAWABLE, "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedCardDrawable;", "maxWidth", "", "<set-?>", "", "animationProgress", "getAnimationProgress$delegate", "(Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedCardView;)Ljava/lang/Object;", "getAnimationProgress", "()F", "setAnimationProgress", "(F)V", "value", "Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$Allocated$Card;", "card", "getCard", "()Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$Allocated$Card;", "setCard", "(Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$Allocated$Card;)V", "verifyDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectIpoAllocatedCardView extends Hammer_DirectIpoAllocatedCardView {
    public static final int $stable = 8;
    private final DirectIpoAllocatedCardDrawable drawable;
    private final int maxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoAllocatedCardView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        DirectIpoAllocatedCardDrawable directIpoAllocatedCardDrawable = new DirectIpoAllocatedCardDrawable(context);
        directIpoAllocatedCardDrawable.setCallback(this);
        directIpoAllocatedCardDrawable.setBackgroundRoundedCorners(true);
        this.drawable = directIpoAllocatedCardDrawable;
        this.maxWidth = getResources().getDimensionPixelSize(C14171R.dimen.direct_ipo_allocated_card_max_width);
    }

    public final float getAnimationProgress() {
        return this.drawable.getAnimationProgress();
    }

    public final void setAnimationProgress(float f) {
        this.drawable.setAnimationProgress(f);
    }

    public final UiDirectIpoAllocation.Allocated.Card getCard() {
        return this.drawable.getCard();
    }

    public final void setCard(UiDirectIpoAllocation.Allocated.Card card) {
        this.drawable.setCard(card);
        requestLayout();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return Intrinsics.areEqual(who, this.drawable) || super.verifyDrawable(who);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.drawable.setSize(w);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMin = Math.min(View.MeasureSpec.getSize(widthMeasureSpec), this.maxWidth);
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.drawable.draw(canvas);
    }
}
