package com.robinhood.android.educationtour;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.educationtour.compose.ComposeEducationTourElementData;
import com.robinhood.android.educationtour.compose.ComposeEducationTourHighlightData;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EducationTourHighlightCutoutsView.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010,\u001a\u00020-H\u0014J0\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u000202H\u0014J\u0010\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020 H\u0014J\u0006\u00108\u001a\u00020-R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020%X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourHighlightCutoutsView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "highlightedViews", "getHighlightedViews", "()Ljava/util/List;", "setHighlightedViews", "(Ljava/util/List;)V", "Lcom/robinhood/android/educationtour/compose/ComposeEducationTourHighlightData;", "highlightedComposables", "getHighlightedComposables", "setHighlightedComposables", "Lcom/robinhood/tooltips/TooltipData$Target;", "tooltipView", "getTooltipView", "()Lcom/robinhood/tooltips/TooltipData$Target;", "setTooltipView", "(Lcom/robinhood/tooltips/TooltipData$Target;)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "bitmap$delegate", "Lkotlin/Lazy;", "bitmapCanvas", "Landroid/graphics/Canvas;", "getBitmapCanvas", "()Landroid/graphics/Canvas;", "bitmapCanvas$delegate", "transparentPaint", "Landroid/graphics/Paint;", "opacityPaint", "getOpacityPaint$annotations", "()V", "viewLocation", "", "highlightLocation", "onAttachedToWindow", "", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "", "left", "", "top", "right", "bottom", "onDraw", "canvas", "resetHighlights", "Companion", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EducationTourHighlightCutoutsView extends View {
    private static final int DIMMED_OPACITY = 158;

    /* renamed from: bitmap$delegate, reason: from kotlin metadata */
    private final Lazy bitmap;

    /* renamed from: bitmapCanvas$delegate, reason: from kotlin metadata */
    private final Lazy bitmapCanvas;
    private final int[] highlightLocation;
    private List<ComposeEducationTourHighlightData> highlightedComposables;
    private List<? extends View> highlightedViews;
    private final Paint opacityPaint;
    private TooltipData.Target tooltipView;
    private final Paint transparentPaint;
    private final int[] viewLocation;
    public static final int $stable = 8;

    private static /* synthetic */ void getOpacityPaint$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationTourHighlightCutoutsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.highlightedViews = CollectionsKt.emptyList();
        this.highlightedComposables = CollectionsKt.emptyList();
        this.bitmap = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourHighlightCutoutsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourHighlightCutoutsView.bitmap_delegate$lambda$0(this.f$0);
            }
        });
        this.bitmapCanvas = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourHighlightCutoutsView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourHighlightCutoutsView.bitmapCanvas_delegate$lambda$1(this.f$0);
            }
        });
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.transparentPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground1));
        paint2.setAlpha(158);
        this.opacityPaint = paint2;
        this.viewLocation = new int[2];
        this.highlightLocation = new int[2];
        setLayerType(2, null);
    }

    public /* synthetic */ EducationTourHighlightCutoutsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final List<View> getHighlightedViews() {
        return this.highlightedViews;
    }

    public final void setHighlightedViews(List<? extends View> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.highlightedViews = value;
        invalidate();
    }

    public final List<ComposeEducationTourHighlightData> getHighlightedComposables() {
        return this.highlightedComposables;
    }

    public final void setHighlightedComposables(List<ComposeEducationTourHighlightData> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.highlightedComposables = value;
        invalidate();
    }

    public final TooltipData.Target getTooltipView() {
        return this.tooltipView;
    }

    public final void setTooltipView(TooltipData.Target target) {
        this.tooltipView = target;
        invalidate();
    }

    private final Bitmap getBitmap() {
        return (Bitmap) this.bitmap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap bitmap_delegate$lambda$0(EducationTourHighlightCutoutsView educationTourHighlightCutoutsView) {
        return Bitmap.createBitmap(educationTourHighlightCutoutsView.getWidth(), educationTourHighlightCutoutsView.getHeight(), Bitmap.Config.ARGB_8888);
    }

    private final Canvas getBitmapCanvas() {
        return (Canvas) this.bitmapCanvas.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Canvas bitmapCanvas_delegate$lambda$1(EducationTourHighlightCutoutsView educationTourHighlightCutoutsView) {
        return new Canvas(educationTourHighlightCutoutsView.getBitmap());
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourHighlightCutoutsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourHighlightCutoutsView.onAttachedToWindow$lambda$4(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(EducationTourHighlightCutoutsView educationTourHighlightCutoutsView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Paint paint = educationTourHighlightCutoutsView.opacityPaint;
        Context context = educationTourHighlightCutoutsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground1));
        educationTourHighlightCutoutsView.opacityPaint.setAlpha(158);
        educationTourHighlightCutoutsView.invalidate();
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        getLocationInWindow(this.viewLocation);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        getBitmapCanvas().drawColor(0, PorterDuff.Mode.CLEAR);
        getBitmapCanvas().drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.opacityPaint);
        Iterator<T> it = this.highlightedViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).getLocationInWindow(this.highlightLocation);
            float f = this.highlightLocation[0];
            int[] iArr = this.viewLocation;
            float f2 = f - iArr[0];
            float f3 = r4[1] - iArr[1];
            getBitmapCanvas().drawRect(f2, f3, f2 + r1.getWidth(), f3 + r1.getHeight(), this.transparentPaint);
        }
        for (ComposeEducationTourHighlightData composeEducationTourHighlightData : this.highlightedComposables) {
            int[] parentLocation = composeEducationTourHighlightData.getParentLocation();
            ComposeEducationTourElementData elementData = composeEducationTourHighlightData.getElementData();
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (elementData.m13466getOffsetInRootF1C5BW0() >> 32)) + parentLocation[0]) - this.viewLocation[0];
            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (elementData.m13466getOffsetInRootF1C5BW0() & 4294967295L)) + parentLocation[1]) - this.viewLocation[1];
            getBitmapCanvas().drawRect(fIntBitsToFloat, fIntBitsToFloat2, ((int) (elementData.m13467getSizeYbymL2g() >> 32)) + fIntBitsToFloat, fIntBitsToFloat2 + ((int) (elementData.m13467getSizeYbymL2g() & 4294967295L)), this.transparentPaint);
        }
        TooltipData.Target target = this.tooltipView;
        if (target != null) {
            float x = target.getCoordinates().getX() - this.viewLocation[0];
            float y = target.getCoordinates().getY() - this.viewLocation[1];
            getBitmapCanvas().drawRect(x, y, x + target.getDimensions().getWidth(), y + target.getDimensions().getHeight(), this.transparentPaint);
        }
        canvas.drawBitmap(getBitmap(), 0.0f, 0.0f, (Paint) null);
    }

    public final void resetHighlights() {
        setHighlightedViews(CollectionsKt.emptyList());
        setHighlightedComposables(CollectionsKt.emptyList());
    }
}
