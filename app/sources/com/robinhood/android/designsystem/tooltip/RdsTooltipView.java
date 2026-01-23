package com.robinhood.android.designsystem.tooltip;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsTooltipView.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001@B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u0017H\u0014J\u000e\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u000209R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020&@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u00020,2\u0006\u0010\u0011\u001a\u00020,@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010:\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b;\u0010\u001aR\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "tooltipTextView", "Landroid/widget/TextView;", "getTooltipTextView", "()Landroid/widget/TextView;", "upTooltipNib", "Landroid/widget/ImageView;", "downTooltipNib", "lastMeasuredText", "", "value", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "", "maxLines", "getMaxLines", "()I", "setMaxLines", "(I)V", "minLines", "getMinLines", "setMinLines", "", "nibHorizontalBias", "getNibHorizontalBias", "()F", "setNibHorizontalBias", "(F)V", "Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView$NibDirection;", "nibDirection", "getNibDirection", "()Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView$NibDirection;", "setNibDirection", "(Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView$NibDirection;)V", "", "shouldCenter", "getShouldCenter", "()Z", "setShouldCenter", "(Z)V", "forceTextViewFullWidth", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "calculateHeight", "parent", "Landroid/view/View;", "tooltipTextViewLayoutWidth", "getTooltipTextViewLayoutWidth", "staticText", "Landroid/text/StaticLayout;", "getStaticText", "()Landroid/text/StaticLayout;", "NibDirection", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsTooltipView extends ConstraintLayout {
    private final ImageView downTooltipNib;
    private boolean forceTextViewFullWidth;
    private CharSequence lastMeasuredText;
    private NibDirection nibDirection;
    private boolean shouldCenter;
    private final TextView tooltipTextView;
    private final ImageView upTooltipNib;

    public /* synthetic */ RdsTooltipView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_tooltip, this);
        View viewFindViewById = findViewById(C13997R.id.tooltip_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.tooltipTextView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.up_tooltip_nib);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.upTooltipNib = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.down_tooltip_nib);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.downTooltipNib = (ImageView) viewFindViewById3;
        NibDirection nibDirection = NibDirection.f4107UP;
        this.nibDirection = nibDirection;
        int[] RdsTooltipView = C13997R.styleable.RdsTooltipView;
        Intrinsics.checkNotNullExpressionValue(RdsTooltipView, "RdsTooltipView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsTooltipView, 0, 0);
        setText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTooltipView_text));
        setMaxLines(typedArrayObtainStyledAttributes.getInt(C13997R.styleable.RdsTooltipView_maxLines, 2));
        setNibHorizontalBias(typedArrayObtainStyledAttributes.getFloat(C13997R.styleable.RdsTooltipView_nibHorizontalBias, 0.2f));
        setShouldCenter(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTooltipView_shouldCenter, false));
        this.forceTextViewFullWidth = typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsTooltipView_forceTextViewFullWidth, false);
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsTooltipView_nibDirection);
        NibDirection nibDirection2 = intOrNull != null ? NibDirection.values()[intOrNull.intValue()] : null;
        setNibDirection(nibDirection2 != null ? nibDirection2 : nibDirection);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final TextView getTooltipTextView() {
        return this.tooltipTextView;
    }

    public final CharSequence getText() {
        return this.tooltipTextView.getText();
    }

    public final void setText(CharSequence charSequence) {
        this.tooltipTextView.setText(charSequence);
    }

    public final int getMaxLines() {
        return this.tooltipTextView.getMaxLines();
    }

    public final void setMaxLines(int i) {
        this.tooltipTextView.setMaxLines(i);
    }

    public final int getMinLines() {
        return this.tooltipTextView.getMinLines();
    }

    public final void setMinLines(int i) {
        this.tooltipTextView.setMinLines(i);
    }

    public final float getNibHorizontalBias() {
        if (this.nibDirection == NibDirection.f4107UP) {
            ViewGroup.LayoutParams layoutParams = this.upTooltipNib.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return ((ConstraintLayout.LayoutParams) layoutParams).horizontalBias;
        }
        ViewGroup.LayoutParams layoutParams2 = this.downTooltipNib.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        return ((ConstraintLayout.LayoutParams) layoutParams2).horizontalBias;
    }

    public final void setNibHorizontalBias(float f) {
        ImageView imageView = this.upTooltipNib;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.horizontalBias = f;
        imageView.setLayoutParams(layoutParams2);
        ImageView imageView2 = this.downTooltipNib;
        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.horizontalBias = f;
        imageView2.setLayoutParams(layoutParams4);
        this.downTooltipNib.requestLayout();
    }

    public final NibDirection getNibDirection() {
        return this.nibDirection;
    }

    public final void setNibDirection(NibDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.nibDirection = value;
        this.upTooltipNib.setVisibility(value == NibDirection.f4107UP ? 0 : 8);
        this.downTooltipNib.setVisibility(value == NibDirection.DOWN ? 0 : 8);
    }

    public final boolean getShouldCenter() {
        return this.shouldCenter;
    }

    public final void setShouldCenter(boolean z) {
        this.shouldCenter = z;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(C13997R.id.tooltip_text, 7, 0, 7, 0);
        constraintSet.applyTo(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (Intrinsics.areEqual(this.lastMeasuredText, getText())) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = getTooltipTextViewLayoutWidth();
            setLayoutParams(layoutParams);
            this.lastMeasuredText = getText();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final int calculateHeight(View parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TextView textView = this.tooltipTextView;
        int marginStart = ViewsKt.getMarginStart(textView) + ViewsKt.getMarginEnd(textView) + textView.getPaddingStart() + textView.getPaddingEnd();
        int marginTop = ViewsKt.getMarginTop(textView) + ViewsKt.getMarginBottom(textView) + textView.getPaddingTop() + textView.getPaddingBottom();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(textView.getText(), 0, Math.max(0, textView.getText().length()), textView.getPaint(), Math.max(0, parent.getWidth() - marginStart)).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getHeight() + this.upTooltipNib.getHeight() + marginTop;
    }

    public final int getTooltipTextViewLayoutWidth() {
        int lineCount = getStaticText().getLineCount();
        return ((lineCount < 0 || lineCount >= 3) && this.forceTextViewFullWidth) ? -1 : -2;
    }

    public final StaticLayout getStaticText() {
        TextView textView = this.tooltipTextView;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textView.getPaint(), textView.getWidth()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "run(...)");
        return staticLayoutBuild;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RdsTooltipView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView$NibDirection;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NibDirection {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NibDirection[] $VALUES;

        /* renamed from: UP */
        public static final NibDirection f4107UP = new NibDirection("UP", 0);
        public static final NibDirection DOWN = new NibDirection("DOWN", 1);

        private static final /* synthetic */ NibDirection[] $values() {
            return new NibDirection[]{f4107UP, DOWN};
        }

        public static EnumEntries<NibDirection> getEntries() {
            return $ENTRIES;
        }

        private NibDirection(String str, int i) {
        }

        static {
            NibDirection[] nibDirectionArr$values = $values();
            $VALUES = nibDirectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nibDirectionArr$values);
        }

        public static NibDirection valueOf(String str) {
            return (NibDirection) Enum.valueOf(NibDirection.class, str);
        }

        public static NibDirection[] values() {
            return (NibDirection[]) $VALUES.clone();
        }
    }
}
