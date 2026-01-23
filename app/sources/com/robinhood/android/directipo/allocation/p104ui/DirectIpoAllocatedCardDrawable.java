package com.robinhood.android.directipo.allocation.p104ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.directipo.models.p293ui.UiDirectIpoAllocation;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.text.PillSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectIpoAllocatedCardDrawable.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001OB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010@\u001a\u00020\u001bH\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020\u0018H\u0016J\u0012\u0010G\u001a\u00020B2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020\u0018H\u0016J\b\u0010K\u001a\u00020BH\u0002J\b\u0010L\u001a\u00020BH\u0002J\u0010\u0010M\u001a\u00020N2\u0006\u0010!\u001a\u00020 H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010 @FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R&\u0010&\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedCardDrawable;", "Landroid/graphics/drawable/Drawable;", "baseContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "context", "Landroidx/appcompat/view/ContextThemeWrapper;", "getContext$annotations", "()V", "paddingStart", "", "paddingEnd", "paddingTop", "paddingBottom", "primaryTextTopPadding", "primaryTextBottomPadding", "companyNameTopPadding", "companyNameEndPadding", "pillHorizontalPadding", "pillVerticalPadding", "pillStrokeWidth", "iconSize", "foregroundColor", "", "backgroundCornerRadius", "value", "", "isBackgroundRoundedCorners", "()Z", "setBackgroundRoundedCorners", "(Z)V", "Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$Allocated$Card;", "card", "getCard", "()Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$Allocated$Card;", "setCard", "(Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$Allocated$Card;)V", "animationProgress", "getAnimationProgress", "()F", "setAnimationProgress", "(F)V", "size", "getSize", "()I", "setSize", "(I)V", "iconDrawable", "headerStaticLayout", "Landroid/text/StaticLayout;", "primaryStaticLayout", "symbolStaticLayout", "companyNameStaticLayout", "sharePriceStaticLayout", "unitStaticLayout", "headerTitleTextPaint", "Landroid/text/TextPaint;", "primaryTextPaint", "footerPrimaryTextPaint", "footerSecondaryTextPaint", "linePaint", "Landroid/graphics/Paint;", "backgroundPaint", "isStateful", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "updateSpacing", "updateTextLayouts", "getPrimaryText", "", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoAllocatedCardDrawable extends Drawable {
    private static final float BASE_SIZE = 320.0f;
    private static final int PRIMARY_TEXT_MAX_LINES = 5;
    private static final float RATIO_COMPANY_NAME_END_PADDING = 0.05f;
    private static final float RATIO_COMPANY_NAME_TOP_PADDING = 0.0375f;
    private static final float RATIO_FOOTER_PRIMARY_TEXT_SIZE = 0.05625f;
    private static final float RATIO_FOOTER_SECONDARY_TEXT_SIZE = 0.040625f;
    private static final float RATIO_HEADER_TEXT_SIZE = 0.040625f;
    private static final float RATIO_HORIZONTAL_PADDING = 0.075f;
    private static final float RATIO_ICON_SIZE = 0.075f;
    private static final float RATIO_LINE_STROKE_WIDTH = 0.003125f;
    private static final float RATIO_PILL_HORIZONTAL_PADDING = 0.025f;
    private static final float RATIO_PILL_STROKE_WIDTH = 0.003125f;
    private static final float RATIO_PILL_VERTICAL_PADDING = 0.00625f;
    private static final float RATIO_PRIMARY_TEXT_BOTTOM_PADDING = 0.0875f;
    private static final float RATIO_PRIMARY_TEXT_MAX_HEIGHT = 0.5f;
    private static final float RATIO_PRIMARY_TEXT_SIZE = 0.075f;
    private static final float RATIO_PRIMARY_TEXT_TOP_PADDING = 0.05f;
    private static final float RATIO_VERTICAL_PADDING = 0.075f;
    private static final float SPACING_MULTIPLIER_FOOTER_PRIMARY_TEXT_LINE_HEIGHT = 1.5555556f;
    private static final float SPACING_MULTIPLIER_FOOTER_SECONDARY_TEXT_LINE_HEIGHT = 1.5384616f;
    private static final float SPACING_MULTIPLIER_HEADER_TEXT_LINE_HEIGHT = 1.5384616f;
    private static final float SPACING_MULTIPLIER_PRIMARY_TEXT_LINE_HEIGHT = 1.3333334f;
    private float animationProgress;
    private final float backgroundCornerRadius;
    private final Paint backgroundPaint;
    private UiDirectIpoAllocation.Allocated.Card card;
    private float companyNameEndPadding;
    private StaticLayout companyNameStaticLayout;
    private float companyNameTopPadding;
    private final ContextThemeWrapper context;
    private final TextPaint footerPrimaryTextPaint;
    private final TextPaint footerSecondaryTextPaint;
    private final int foregroundColor;
    private StaticLayout headerStaticLayout;
    private final TextPaint headerTitleTextPaint;
    private Drawable iconDrawable;
    private float iconSize;
    private boolean isBackgroundRoundedCorners;
    private final Paint linePaint;
    private float paddingBottom;
    private float paddingEnd;
    private float paddingStart;
    private float paddingTop;
    private float pillHorizontalPadding;
    private float pillStrokeWidth;
    private float pillVerticalPadding;
    private StaticLayout primaryStaticLayout;
    private float primaryTextBottomPadding;
    private final TextPaint primaryTextPaint;
    private float primaryTextTopPadding;
    private StaticLayout sharePriceStaticLayout;
    private int size;
    private StaticLayout symbolStaticLayout;
    private StaticLayout unitStaticLayout;
    public static final int $stable = 8;

    private static /* synthetic */ void getContext$annotations() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public DirectIpoAllocatedCardDrawable(Context baseContext) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(baseContext, C13997R.style.Theme_Robinhood_DesignSystem);
        this.context = contextThemeWrapper;
        int themeColor = ThemeColors.getThemeColor(contextThemeWrapper, C20690R.attr.colorForeground1);
        this.foregroundColor = themeColor;
        this.backgroundCornerRadius = contextThemeWrapper.getResources().getDimension(C14171R.dimen.direct_ipo_allocated_card_corner_radius);
        this.animationProgress = 1.0f;
        TextPaint textPaint = new TextPaint();
        this.headerTitleTextPaint = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.primaryTextPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.footerPrimaryTextPaint = textPaint3;
        TextPaint textPaint4 = new TextPaint();
        this.footerSecondaryTextPaint = textPaint4;
        Paint paint = new Paint();
        this.linePaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(ThemeColors.getThemeColor(contextThemeWrapper, C13997R.attr.paletteColorXRayLight));
        this.backgroundPaint = paint2;
        Typeface typefaceLoad = RhTypeface.REGULAR.load(contextThemeWrapper);
        Typeface typefaceLoad2 = RhTypeface.BOLD.load(contextThemeWrapper);
        Typeface typefaceLoad3 = RhTypeface.DISPLAY_MEDIUM.load(contextThemeWrapper);
        textPaint.setAntiAlias(true);
        textPaint.setColor(themeColor);
        textPaint.setTypeface(typefaceLoad);
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(themeColor);
        textPaint2.setTypeface(typefaceLoad3);
        textPaint3.setAntiAlias(true);
        textPaint3.setColor(themeColor);
        textPaint3.setTypeface(typefaceLoad2);
        textPaint4.setAntiAlias(true);
        textPaint4.setColor(themeColor);
        textPaint4.setTypeface(typefaceLoad);
        paint.setColor(themeColor);
    }

    /* renamed from: isBackgroundRoundedCorners, reason: from getter */
    public final boolean getIsBackgroundRoundedCorners() {
        return this.isBackgroundRoundedCorners;
    }

    public final void setBackgroundRoundedCorners(boolean z) {
        if (this.isBackgroundRoundedCorners != z) {
            this.isBackgroundRoundedCorners = z;
            invalidateSelf();
        }
    }

    public final UiDirectIpoAllocation.Allocated.Card getCard() {
        return this.card;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCard(UiDirectIpoAllocation.Allocated.Card card) {
        Drawable drawableMutate;
        ServerToBentoAssetMapper2 icon;
        if (Intrinsics.areEqual(this.card, card)) {
            return;
        }
        this.card = card;
        if (card == null || (icon = card.getIcon()) == null) {
            drawableMutate = null;
        } else {
            Drawable drawable = ContextCompat.getDrawable(this.context, icon.getResourceId());
            Intrinsics.checkNotNull(drawable);
            drawableMutate = drawable.mutate();
            if (drawableMutate != null) {
                drawableMutate.setTint(this.foregroundColor);
            }
        }
        this.iconDrawable = drawableMutate;
        invalidateSelf();
    }

    public final float getAnimationProgress() {
        return this.animationProgress;
    }

    public final void setAnimationProgress(float f) {
        if (this.animationProgress == f) {
            return;
        }
        this.animationProgress = f;
        invalidateSelf();
    }

    public final int getSize() {
        return this.size;
    }

    public final void setSize(int i) {
        if (this.size != i) {
            this.size = i;
            int i2 = this.size;
            setBounds(new Rect(0, 0, i2, i2));
            updateSpacing();
            updateTextLayouts();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.size;
        float f = i - (this.paddingStart + this.paddingEnd);
        if (f <= 0.0f) {
            return;
        }
        float f2 = i;
        if (this.isBackgroundRoundedCorners) {
            float f3 = this.backgroundCornerRadius;
            canvas.drawRoundRect(0.0f, 0.0f, f2, f2, f3, f3, this.backgroundPaint);
        } else {
            canvas.drawRect(0.0f, 0.0f, f2, f2, this.backgroundPaint);
        }
        int iSave = canvas.save();
        try {
            canvas.translate(this.paddingStart, this.paddingTop);
            StaticLayout staticLayout = this.headerStaticLayout;
            int height = staticLayout != null ? staticLayout.getHeight() : 0;
            StaticLayout staticLayout2 = this.headerStaticLayout;
            int width = staticLayout2 != null ? staticLayout2.getWidth() : 0;
            float f4 = (this.iconSize / 2) - (height / 2);
            iSave = canvas.save();
            canvas.translate(0.0f, f4);
            try {
                StaticLayout staticLayout3 = this.headerStaticLayout;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
                canvas.restoreToCount(iSave);
                iSave = canvas.save();
                canvas.translate(width, 0.0f);
                try {
                    int i2 = (int) this.iconSize;
                    Drawable drawable = this.iconDrawable;
                    if (drawable != null) {
                        drawable.setBounds(0, 0, i2, i2);
                    }
                    Drawable drawable2 = this.iconDrawable;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    canvas.restoreToCount(iSave);
                    canvas.translate(0.0f, height + this.primaryTextTopPadding);
                    float f5 = 0.5f * f2;
                    float f6 = this.primaryTextBottomPadding + f5;
                    float f7 = f6 - (this.animationProgress * f6);
                    iSave = canvas.save();
                    try {
                        canvas.clipRect(0.0f, 0.0f, f2, f6);
                        canvas.translate(0.0f, f7);
                        StaticLayout staticLayout4 = this.primaryStaticLayout;
                        if (staticLayout4 != null) {
                            staticLayout4.draw(canvas);
                        }
                        canvas.restoreToCount(iSave);
                        canvas.translate(0.0f, f5 + this.primaryTextBottomPadding);
                        canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.linePaint);
                        canvas.translate(0.0f, this.companyNameTopPadding);
                        StaticLayout staticLayout5 = this.symbolStaticLayout;
                        if (staticLayout5 != null) {
                            staticLayout5.draw(canvas);
                        }
                        StaticLayout staticLayout6 = this.symbolStaticLayout;
                        int height2 = staticLayout6 != null ? staticLayout6.getHeight() : 0;
                        StaticLayout staticLayout7 = this.symbolStaticLayout;
                        int width2 = staticLayout7 != null ? staticLayout7.getWidth() : 0;
                        iSave = canvas.save();
                        float f8 = width2;
                        try {
                            canvas.translate(this.companyNameEndPadding + f8, 0.0f);
                            StaticLayout staticLayout8 = this.sharePriceStaticLayout;
                            if (staticLayout8 != null) {
                                staticLayout8.draw(canvas);
                            }
                            canvas.restoreToCount(iSave);
                            canvas.translate(0.0f, height2);
                            StaticLayout staticLayout9 = this.companyNameStaticLayout;
                            if (staticLayout9 != null) {
                                staticLayout9.draw(canvas);
                            }
                            iSave = canvas.save();
                            try {
                                canvas.translate(f8 + this.companyNameEndPadding, 0.0f);
                                StaticLayout staticLayout10 = this.unitStaticLayout;
                                if (staticLayout10 != null) {
                                    staticLayout10.draw(canvas);
                                }
                                canvas.restoreToCount(iSave);
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void updateSpacing() {
        float f = this.size;
        float f2 = 0.075f * f;
        this.paddingStart = f2;
        this.paddingEnd = f2;
        this.paddingTop = f2;
        this.paddingBottom = f2;
        float f3 = 0.05f * f;
        this.primaryTextTopPadding = f3;
        this.primaryTextBottomPadding = RATIO_PRIMARY_TEXT_BOTTOM_PADDING * f;
        this.companyNameTopPadding = RATIO_COMPANY_NAME_TOP_PADDING * f;
        this.companyNameEndPadding = f3;
        this.iconSize = f2;
        this.pillHorizontalPadding = RATIO_PILL_HORIZONTAL_PADDING * f;
        this.pillVerticalPadding = RATIO_PILL_VERTICAL_PADDING * f;
        float f4 = f * 0.003125f;
        this.pillStrokeWidth = f4;
        this.linePaint.setStrokeWidth(f4);
    }

    private final void updateTextLayouts() {
        UiDirectIpoAllocation.Allocated.Card card = this.card;
        if (card == null) {
            return;
        }
        float f = this.size;
        float f2 = f - (this.paddingStart + this.paddingEnd);
        if (f2 <= 0.0f) {
            return;
        }
        float f3 = 0.040625f * f;
        this.headerTitleTextPaint.setTextSize(f3);
        this.headerStaticLayout = StaticLayout.Builder.obtain(card.getHeaderTitle(), 0, card.getHeaderTitle().length(), this.headerTitleTextPaint, (int) (f2 - this.iconSize)).setMaxLines(1).setLineSpacing(0.0f, 1.5384616f).build();
        this.primaryTextPaint.setTextSize(0.075f * f);
        CharSequence primaryText = getPrimaryText(card);
        StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(primaryText, 0, primaryText.length(), this.primaryTextPaint, (int) f2).setMaxLines(5);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        this.primaryStaticLayout = maxLines.setEllipsize(truncateAt).setLineSpacing(0.0f, 1.3333334f).build();
        float f4 = (f2 - this.companyNameEndPadding) / 2;
        this.footerPrimaryTextPaint.setTextSize(f * RATIO_FOOTER_PRIMARY_TEXT_SIZE);
        this.footerSecondaryTextPaint.setTextSize(f3);
        int i = (int) f4;
        this.symbolStaticLayout = StaticLayout.Builder.obtain(card.getFooterTitle(), 0, card.getFooterTitle().length(), this.footerPrimaryTextPaint, i).setMaxLines(1).setEllipsize(truncateAt).setLineSpacing(0.0f, SPACING_MULTIPLIER_FOOTER_PRIMARY_TEXT_LINE_HEIGHT).build();
        this.companyNameStaticLayout = StaticLayout.Builder.obtain(card.getFooterSubtitle(), 0, card.getFooterSubtitle().length(), this.footerSecondaryTextPaint, i).setMaxLines(2).setEllipsize(truncateAt).build();
        StaticLayout.Builder ellipsize = StaticLayout.Builder.obtain(card.getFooterDetail(), 0, card.getFooterDetail().length(), this.footerPrimaryTextPaint, i).setMaxLines(1).setEllipsize(truncateAt);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
        this.sharePriceStaticLayout = ellipsize.setAlignment(alignment).setLineSpacing(0.0f, SPACING_MULTIPLIER_FOOTER_PRIMARY_TEXT_LINE_HEIGHT).build();
        this.unitStaticLayout = StaticLayout.Builder.obtain(card.getFooterSubDetail(), 0, card.getFooterSubDetail().length(), this.footerSecondaryTextPaint, i).setMaxLines(1).setEllipsize(truncateAt).setAlignment(alignment).setLineSpacing(0.0f, 1.5384616f).build();
    }

    private final CharSequence getPrimaryText(UiDirectIpoAllocation.Allocated.Card card) {
        String primaryText = card.getPrimaryText();
        UiDirectIpoAllocation.Allocated.Card.PillInfo primaryTextPillInfo = card.getPrimaryTextPillInfo();
        if (primaryTextPillInfo != null) {
            int location = primaryTextPillInfo.getLocation();
            int length = primaryTextPillInfo.getLength() + location;
            boolean z = location < 0 || location >= primaryText.length();
            boolean z2 = length < 0 || length > primaryText.length();
            boolean z3 = location >= length;
            if (!z && !z2 && !z3) {
                SpannableString spannableString = new SpannableString(primaryText);
                spannableString.setSpan(new PillSpan(this.foregroundColor, null, null, this.pillStrokeWidth, (int) this.pillVerticalPadding, (int) this.pillHorizontalPadding, false, 70, null), location, length, 17);
                return spannableString;
            }
        }
        return primaryText;
    }
}
