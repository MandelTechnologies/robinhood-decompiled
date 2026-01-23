package com.robinhood.android.designsystem.pog;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Inflater;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: RdsPogView.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u00015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010'H\u0016J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020!H\u0016J\u0010\u00103\u001a\u00020*2\u0006\u00102\u001a\u00020!H\u0002J\u0010\u00104\u001a\u00020*2\u0006\u00102\u001a\u00020!H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010,\u001a\u0004\u0018\u00010'2\b\u0010\r\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/designsystem/pog/RdsPogView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pictogramView", "Landroid/widget/ImageView;", "textView", "Landroid/widget/TextView;", "numberView", "value", "Landroid/graphics/drawable/Drawable;", "pictogram", "getPictogram", "()Landroid/graphics/drawable/Drawable;", "setPictogram", "(Landroid/graphics/drawable/Drawable;)V", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "", InquiryField.FloatField.TYPE2, "getNumber", "()Ljava/lang/Integer;", "setNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "", "isHero", "()Z", "setHero", "(Z)V", "backgroundTint", "Landroid/content/res/ColorStateList;", "getBackgroundTintList", "setBackgroundTintList", "", "tint", "pictogramTint", "getPictogramTint", "()Landroid/content/res/ColorStateList;", "setPictogramTint", "(Landroid/content/res/ColorStateList;)V", "setEnabled", "enabled", "setEnabledBackgroundTint", "setEnabledPictogramTint", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsPogView extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ColorStateList backgroundTint;
    private boolean isHero;
    private Integer number;
    private final TextView numberView;
    private ColorStateList pictogramTint;
    private final ImageView pictogramView;
    private CharSequence text;
    private final TextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsPogView(Context context, AttributeSet attributeSet) throws IllegalArgumentException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_pog, this);
        View viewFindViewById = findViewById(C13997R.id.pog_pictogram);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.pictogramView = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.pog_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.pog_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.numberView = (TextView) viewFindViewById3;
        int[] RdsPogView = C13997R.styleable.RdsPogView;
        Intrinsics.checkNotNullExpressionValue(RdsPogView, "RdsPogView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsPogView, 0, 0);
        setPictogram(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsPogView_pictogram));
        setPictogramTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsPogView_pictogramTint));
        setText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsPogView_android_text));
        setNumber(TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsPogView_number));
        setHero(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsPogView_isHero, this.isHero));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsPogView_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Drawable getPictogram() {
        return this.pictogramView.getDrawable();
    }

    public final void setPictogram(Drawable drawable) {
        ImageView imageView = this.pictogramView;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(drawable != null ? 0 : 8);
        if (imageView.getVisibility() == 0) {
            this.textView.setVisibility(8);
            this.numberView.setVisibility(8);
        }
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = this.textView;
        this.text = charSequence;
        textView.setText(charSequence);
        textView.setVisibility(charSequence != null ? 0 : 8);
        if (textView.getVisibility() == 0) {
            this.pictogramView.setVisibility(8);
            this.numberView.setVisibility(8);
        }
    }

    public final Integer getNumber() {
        return this.number;
    }

    public final void setNumber(Integer num) {
        TextView textView = this.numberView;
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(1, 99);
        if (num == null || !primitiveRanges2.contains(num.intValue())) {
            num = null;
        }
        this.number = num;
        textView.setText(String.valueOf(num));
        textView.setVisibility(this.number != null ? 0 : 8);
        if (textView.getVisibility() == 0) {
            this.pictogramView.setVisibility(8);
            this.textView.setVisibility(8);
        }
    }

    /* renamed from: isHero, reason: from getter */
    public final boolean getIsHero() {
        return this.isHero;
    }

    public final void setHero(boolean z) throws IllegalArgumentException {
        int i;
        int i2;
        int i3;
        int i4;
        this.isHero = z;
        if (z) {
            i = C13997R.dimen.hero_pog_text_padding;
        } else {
            i = C13997R.dimen.pog_text_padding;
        }
        ViewsKt.setHorizontalPadding(this.textView, ViewsKt.getDimensionPixelSize(this, i));
        TextView textView = this.textView;
        if (z) {
            i2 = C13997R.style.TextAppearance_Mobius_Capsule_Regular_Large_Bold;
        } else {
            i2 = C13997R.style.TextAppearance_Mobius_Capsule_Regular_Small_Bold;
        }
        TextViewsKt.setTextAppearanceCompat(textView, i2);
        if (z) {
            i3 = C13997R.dimen.auto_size_min_text_size_mobius_regular_large;
        } else {
            i3 = C13997R.dimen.auto_size_min_text_size_mobius_regular_small;
        }
        int dimensionPixelSize = ViewsKt.getDimensionPixelSize(this, i3);
        if (z) {
            i4 = C13997R.dimen.text_size_mobius_regular_large;
        } else {
            i4 = C13997R.dimen.text_size_mobius_regular_small;
        }
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this.textView, dimensionPixelSize, ViewsKt.getDimensionPixelSize(this, i4), ViewsKt.getDimensionPixelSize(this, C13997R.dimen.auto_size_step_granularity), 0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.backgroundTint;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList tint) {
        this.backgroundTint = tint;
        setEnabledBackgroundTint(isEnabled());
    }

    public final ColorStateList getPictogramTint() {
        return this.pictogramTint;
    }

    public final void setPictogramTint(ColorStateList colorStateList) {
        this.pictogramTint = colorStateList;
        setEnabledPictogramTint(isEnabled());
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.pictogramView.setEnabled(enabled);
        this.textView.setEnabled(enabled);
        this.numberView.setEnabled(enabled);
        setEnabledBackgroundTint(enabled);
        setEnabledPictogramTint(enabled);
    }

    private final void setEnabledBackgroundTint(boolean enabled) {
        if (enabled) {
            super.setBackgroundTintList(this.backgroundTint);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        super.setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorPogBackground)));
    }

    private final void setEnabledPictogramTint(boolean enabled) {
        if (enabled) {
            this.pictogramView.setImageTintList(this.pictogramTint);
            return;
        }
        ImageView imageView = this.pictogramView;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorPogPictogram)));
    }

    /* compiled from: RdsPogView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/pog/RdsPogView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion implements Inflater<RdsPogView> {
        private final /* synthetic */ Inflater<RdsPogView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsPogView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsPogView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_pog);
        }
    }
}
