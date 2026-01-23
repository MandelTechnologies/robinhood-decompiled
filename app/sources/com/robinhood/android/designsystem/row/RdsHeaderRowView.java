package com.robinhood.android.designsystem.row;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsHeaderRowView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0011R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsHeaderRowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "textView", "Landroid/widget/TextView;", "paddingTopPixels", "", "paddingTopPixelsInTopPosition", "value", "", "isUsingDisplayStyle", "setUsingDisplayStyle", "(Z)V", "isInTopPosition", "()Z", "setInTopPosition", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "labelIconTint", "getLabelIconTint", "()Landroid/content/res/ColorStateList;", "setLabelIconTint", "(Landroid/content/res/ColorStateList;)V", "iconTint", "getIconTint", "setIconTint", "bind", "", "text", "", "inTopPosition", "useDisplayStyle", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsHeaderRowView extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Drawable iconDrawable;
    private ColorStateList iconTint;
    private boolean isInTopPosition;
    private boolean isUsingDisplayStyle;
    private final int paddingTopPixels;
    private final int paddingTopPixelsInTopPosition;
    private final TextView textView;

    public /* synthetic */ RdsHeaderRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsHeaderRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_section_header, this);
        View viewFindViewById = findViewById(C13997R.id.header_row_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.textView = (TextView) viewFindViewById;
        this.paddingTopPixels = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xlarge);
        this.paddingTopPixelsInTopPosition = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
        int[] RdsHeaderRowView = C13997R.styleable.RdsHeaderRowView;
        Intrinsics.checkNotNullExpressionValue(RdsHeaderRowView, "RdsHeaderRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsHeaderRowView, 0, 0);
        bind$default(this, typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsHeaderRowView_primaryText), typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsHeaderRowView_inTopPosition, false), typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsHeaderRowView_useDisplayStyle, false), null, null, 24, null);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setUsingDisplayStyle(boolean z) {
        int i;
        if (this.isUsingDisplayStyle != z) {
            this.isUsingDisplayStyle = z;
            TextView textView = this.textView;
            ThemeNode currentThemeNode = ScarletManager2.getScarletManager(this).getCurrentThemeNode();
            ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
            if (this.isUsingDisplayStyle) {
                i = C20690R.attr.textAppearanceDisplayMedium;
            } else {
                i = C20690R.attr.textAppearanceRegularMediumBold;
            }
            TextViewsKt.setTextAppearanceCompat(textView, ((StyleResource) currentThemeNode.getResourceOrThrow(new ThemedResourceReference(style, i))).getResId());
            TextView textView2 = this.textView;
            textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), getResources().getDimensionPixelSize(z ? C13997R.dimen.rds_spacing_small : C13997R.dimen.rds_spacing_xsmall));
        }
    }

    /* renamed from: isInTopPosition, reason: from getter */
    public final boolean getIsInTopPosition() {
        return this.isInTopPosition;
    }

    public final void setInTopPosition(boolean z) {
        if (this.isInTopPosition != z) {
            this.isInTopPosition = z;
            TextView textView = this.textView;
            textView.setPadding(textView.getPaddingLeft(), z ? this.paddingTopPixelsInTopPosition : this.paddingTopPixels, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    public final void setIconDrawable(Drawable drawable) {
        if (Intrinsics.areEqual(this.iconDrawable, drawable)) {
            return;
        }
        this.iconDrawable = drawable;
        this.textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.textView.setCompoundDrawablePadding(getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xsmall));
    }

    public final ColorStateList getLabelIconTint() {
        return this.textView.getCompoundDrawableTintList();
    }

    public final void setLabelIconTint(ColorStateList colorStateList) {
        this.textView.setCompoundDrawableTintList(colorStateList);
    }

    public final ColorStateList getIconTint() {
        return this.iconTint;
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.iconTint = colorStateList;
        this.textView.setCompoundDrawableTintList(colorStateList);
    }

    public static /* synthetic */ void bind$default(RdsHeaderRowView rdsHeaderRowView, CharSequence charSequence, boolean z, boolean z2, Drawable drawable, ColorStateList colorStateList, int i, Object obj) {
        if ((i & 2) != 0) {
            z = rdsHeaderRowView.isInTopPosition;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = rdsHeaderRowView.isUsingDisplayStyle;
        }
        rdsHeaderRowView.bind(charSequence, z3, z2, (i & 8) != 0 ? null : drawable, (i & 16) != 0 ? null : colorStateList);
    }

    public final void bind(CharSequence text, boolean inTopPosition, boolean useDisplayStyle, Drawable iconDrawable, ColorStateList iconTint) {
        this.textView.setText(text);
        setInTopPosition(inTopPosition);
        setUsingDisplayStyle(useDisplayStyle);
        setIconDrawable(iconDrawable);
        setIconTint(iconTint);
    }

    /* compiled from: RdsHeaderRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsHeaderRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/row/RdsHeaderRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsHeaderRowView> {
        private final /* synthetic */ Inflater<RdsHeaderRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsHeaderRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsHeaderRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_section_header_row);
        }
    }
}
