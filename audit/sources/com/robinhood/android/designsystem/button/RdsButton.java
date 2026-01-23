package com.robinhood.android.designsystem.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.helper.DrawableRenderHelper;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.android.plt.contract.ViewsKt;
import com.robinhood.scarlet.view.DefStyleProvider;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RdsButton.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 O2\u00020\u0001:\u0001OB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0007H\u0014J\u0010\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u001bH\u0014J\b\u0010;\u001a\u00020<H\u0014J(\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u0007H\u0014J\u0010\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0014J\b\u0010E\u001a\u00020<H\u0014J\b\u0010F\u001a\u00020<H\u0014J\u0010\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020<H\u0002J\u0018\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0002J\u0018\u0010N\u001a\u00020<2\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b#\u0010$R$\u0010%\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010$R\u000e\u0010(\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010)\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR(\u0010,\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b8D@DX\u0084\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u000e\u0010/\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/designsystem/button/RdsButton;", "Lcom/google/android/material/button/MaterialButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "getPltManager", "()Lcom/robinhood/android/plt/contract/PltManager;", "setPltManager", "(Lcom/robinhood/android/plt/contract/PltManager;)V", "initialized", "", "progressBarDrawableHelper", "Lcom/robinhood/android/designsystem/helper/DrawableRenderHelper;", "value", "Landroid/content/res/ColorStateList;", "progressBarTint", "getProgressBarTint", "()Landroid/content/res/ColorStateList;", "setProgressBarTint", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/drawable/Drawable;", "progressBarDrawable", "getProgressBarDrawable", "()Landroid/graphics/drawable/Drawable;", "setProgressBarDrawable", "(Landroid/graphics/drawable/Drawable;)V", "progressBarSize", "busy", "setBusy", "(Z)V", "isLoading", "()Z", "setLoading", "contentIconDrawableHelper", "contentIconTint", "getContentIconTint", "setContentIconTint", "contentIconDrawable", "getContentIconDrawable", "setContentIconDrawable", "contentIconSize", "contentIconContentDescription", "", "getContentIconContentDescription", "()Ljava/lang/CharSequence;", "setContentIconContentDescription", "(Ljava/lang/CharSequence;)V", "onCreateDrawableState", "", "extraSpace", "verifyDrawable", "who", "drawableStateChanged", "", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onAttachedToWindow", "onDetachedFromWindow", "onPopulateAccessibilityEvent", "event", "Landroid/view/accessibility/AccessibilityEvent;", "updateAnimation", "updateProgressBarBounds", "width", "height", "updateContentIconBounds", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class RdsButton extends Hammer_RdsButton {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int[] STATE_LOADING = {C13997R.attr.state_loading};
    private boolean busy;
    private CharSequence contentIconContentDescription;
    private DrawableRenderHelper contentIconDrawableHelper;
    private int contentIconSize;
    private final boolean initialized;
    private boolean isLoading;
    public PltManager pltManager;
    private DrawableRenderHelper progressBarDrawableHelper;
    private int progressBarSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RdsButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RdsButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RdsButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? INSTANCE.getDefStyleAttr() : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RdsButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.initialized = true;
        this.progressBarDrawableHelper = new DrawableRenderHelper(this);
        this.contentIconDrawableHelper = new DrawableRenderHelper(this);
        int[] RdsButton = C13997R.styleable.RdsButton;
        Intrinsics.checkNotNullExpressionValue(RdsButton, "RdsButton");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsButton, i, 0);
        this.progressBarSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13997R.styleable.RdsButton_progressBarSize, 0);
        setProgressBarTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsButton_progressBarTint));
        setProgressBarDrawable(typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsButton_progressBar));
        this.contentIconSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13997R.styleable.RdsButton_contentIconSize, 0);
        setContentIconTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsButton_contentIconTint));
        setContentIconDrawable(typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsButton_contentIcon));
        this.contentIconContentDescription = typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsButton_contentIconContentDescription);
        setLoading(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsButton_loading, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final PltManager getPltManager() {
        PltManager pltManager = this.pltManager;
        if (pltManager != null) {
            return pltManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pltManager");
        return null;
    }

    public final void setPltManager(PltManager pltManager) {
        Intrinsics.checkNotNullParameter(pltManager, "<set-?>");
        this.pltManager = pltManager;
    }

    public final ColorStateList getProgressBarTint() {
        return this.progressBarDrawableHelper.getTint();
    }

    public final void setProgressBarTint(ColorStateList colorStateList) {
        this.progressBarDrawableHelper.setTint(colorStateList);
    }

    private final Drawable getProgressBarDrawable() {
        return this.progressBarDrawableHelper.getDrawable();
    }

    private final void setProgressBarDrawable(Drawable drawable) {
        this.progressBarDrawableHelper.setDrawable(drawable);
    }

    private final void setBusy(boolean z) {
        if (this.busy != z) {
            if (z) {
                IdlingResourceCounters2.increment(IdlingResourceType.RDS_BUTTON_ISLOADING);
            } else {
                IdlingResourceCounters2.decrement(IdlingResourceType.RDS_BUTTON_ISLOADING);
            }
            this.busy = z;
        }
    }

    /* renamed from: isLoading, reason: from getter */
    public boolean getIsLoading() {
        return this.isLoading;
    }

    public void setLoading(boolean z) {
        if (this.isLoading != z) {
            ViewsKt.recordLoadingState$default(this, z, getPltManager(), null, 4, null);
            setBusy(z);
            this.isLoading = z;
            setClickable(!z);
            refreshDrawableState();
            updateAnimation();
        }
    }

    public final ColorStateList getContentIconTint() {
        return this.contentIconDrawableHelper.getTint();
    }

    public final void setContentIconTint(ColorStateList colorStateList) {
        this.contentIconDrawableHelper.setTint(colorStateList);
    }

    protected final Drawable getContentIconDrawable() {
        return this.contentIconDrawableHelper.getDrawable();
    }

    protected final void setContentIconDrawable(Drawable drawable) {
        this.contentIconDrawableHelper.setDrawable(drawable);
    }

    public final CharSequence getContentIconContentDescription() {
        return this.contentIconContentDescription;
    }

    public final void setContentIconContentDescription(CharSequence charSequence) {
        this.contentIconContentDescription = charSequence;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        if (getIsLoading()) {
            int[] iArrMergeDrawableStates = View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), STATE_LOADING);
            Intrinsics.checkNotNull(iArrMergeDrawableStates);
            return iArrMergeDrawableStates;
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace);
        Intrinsics.checkNotNull(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        if (super.verifyDrawable(who)) {
            return true;
        }
        if (this.initialized && this.progressBarDrawableHelper.verifyDrawable(who)) {
            return true;
        }
        return this.initialized && this.contentIconDrawableHelper.verifyDrawable(who);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.initialized) {
            this.progressBarDrawableHelper.drawableStateChanged();
            this.contentIconDrawableHelper.drawableStateChanged();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateProgressBarBounds(w, h);
        updateContentIconBounds(w, h);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable progressBarDrawable;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (getIsLoading() && (progressBarDrawable = getProgressBarDrawable()) != null) {
            progressBarDrawable.draw(canvas);
        }
        Drawable contentIconDrawable = getContentIconDrawable();
        if (contentIconDrawable != null) {
            contentIconDrawable.draw(canvas);
        }
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBusy(getIsLoading());
        updateAnimation();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        updateAnimation();
        setBusy(false);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onPopulateAccessibilityEvent(event);
        CharSequence charSequence = this.contentIconContentDescription;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            return;
        }
        event.getText().add(charSequence);
    }

    private final void updateAnimation() {
        Drawable progressBarDrawable = getProgressBarDrawable();
        AnimatedVectorDrawable animatedVectorDrawable = progressBarDrawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) progressBarDrawable : null;
        if (animatedVectorDrawable == null) {
            return;
        }
        if (isAttachedToWindow()) {
            if (getIsLoading()) {
                animatedVectorDrawable.start();
                return;
            } else {
                animatedVectorDrawable.stop();
                return;
            }
        }
        animatedVectorDrawable.stop();
    }

    private final void updateProgressBarBounds(int width, int height) {
        Drawable progressBarDrawable = getProgressBarDrawable();
        if (progressBarDrawable != null) {
            int intrinsicWidth = this.progressBarSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = progressBarDrawable.getIntrinsicWidth();
            }
            int i = (width - intrinsicWidth) / 2;
            int intrinsicHeight = this.progressBarSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = progressBarDrawable.getIntrinsicHeight();
            }
            int i2 = (height - intrinsicHeight) / 2;
            progressBarDrawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
    }

    private final void updateContentIconBounds(int width, int height) {
        Drawable contentIconDrawable = getContentIconDrawable();
        if (contentIconDrawable != null) {
            int intrinsicWidth = this.contentIconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = contentIconDrawable.getIntrinsicWidth();
            }
            int i = (width - intrinsicWidth) / 2;
            int intrinsicHeight = this.contentIconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = contentIconDrawable.getIntrinsicHeight();
            }
            int i2 = (height - intrinsicHeight) / 2;
            contentIconDrawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
    }

    /* compiled from: RdsButton.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/button/RdsButton$Companion;", "Lcom/robinhood/scarlet/view/DefStyleProvider;", "<init>", "()V", "STATE_LOADING", "", "defStyleAttr", "", "getDefStyleAttr", "()I", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DefStyleProvider {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleAttr() {
            return 0;
        }

        private Companion() {
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleRes() {
            return DefStyleProvider.DefaultImpls.getDefStyleRes(this);
        }
    }
}
