package com.robinhood.android.designsystem.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: RdsChip.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001OB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020'H\u0016J!\u0010A\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010EJ\u0014\u0010F\u001a\u00020?2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020?0HJ\u0006\u0010I\u001a\u00020?J\u001a\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020NH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u000e\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R(\u00100\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chip/RdsChip;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "iconTint", "getIconTint", "()Landroid/content/res/ColorStateList;", "setIconTint", "(Landroid/content/res/ColorStateList;)V", "", "itemCount", "getItemCount", "()Ljava/lang/Integer;", "setItemCount", "(Ljava/lang/Integer;)V", "", "badged", "getBadged", "()Z", "setBadged", "(Z)V", "closable", "getClosable", "setClosable", "trailingIcon", "getTrailingIcon", "setTrailingIcon", "textView", "Landroid/widget/TextView;", "countTextView", "imageView", "Landroid/widget/ImageView;", "badgeView", "closeIconView", "trailingIconView", "normalTypeface", "Landroid/graphics/Typeface;", "selectedTypeface", "setSelected", "", "selected", "loadImage", "httpUrl", "Lokhttp3/HttpUrl;", "errorDrawableRes", "(Lokhttp3/HttpUrl;Ljava/lang/Integer;)V", "onTrailingIconClick", "listener", "Lkotlin/Function0;", "expandTrailingIconTappingAreaIfVisible", "expandTappingAreaForEmbeddedIconIfVisible", "iconView", "Landroid/view/View;", "expandDp", "", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsChip extends Hammer_RdsChip {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ImageView badgeView;
    private ImageView closeIconView;
    private final TextView countTextView;
    private ColorStateList iconTint;
    public ImageLoader imageLoader;
    private ImageView imageView;
    private Typeface normalTypeface;
    private Typeface selectedTypeface;
    private final TextView textView;
    private ImageView trailingIconView;

    public /* synthetic */ RdsChip(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RdsChip(Context context, AttributeSet attributeSet) {
        super((Context) new ScarletContextWrapper(context, null, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.surfaceTheme), 2, null), attributeSet, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_chip, this);
        View viewFindViewById = findViewById(C13997R.id.chip_text_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.textView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.chip_count_text_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.countTextView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.chip_image_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.imageView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C13997R.id.chip_badge_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.badgeView = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C13997R.id.chip_close_image_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.closeIconView = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C13997R.id.chip_trailing_icon_image_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.trailingIconView = (ImageView) viewFindViewById6;
        this.imageView.setClipToOutline(true);
        int[] RdsChip = C13997R.styleable.RdsChip;
        Intrinsics.checkNotNullExpressionValue(RdsChip, "RdsChip");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsChip, 0, 0);
        setText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsChip_android_text));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C13997R.styleable.RdsChip_fontFamilyNormal, 0);
        this.normalTypeface = resourceId != 0 ? ResourcesCompat.getFont(context, resourceId) : null;
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C13997R.styleable.RdsChip_fontFamilySelected, 0);
        this.selectedTypeface = resourceId2 != 0 ? ResourcesCompat.getFont(context, resourceId2) : null;
        setIconDrawable(typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsChip_iconSrc));
        this.badgeView.setVisibility(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsChip_badged, false) ? 0 : 8);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public final CharSequence getText() {
        return this.textView.getText();
    }

    public final void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
        TextView textView = this.textView;
        CharSequence text = getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
    }

    public final Drawable getIconDrawable() {
        return this.imageView.getDrawable();
    }

    public final void setIconDrawable(Drawable drawable) {
        this.imageView.setVisibility(drawable != null ? 0 : 8);
        this.imageView.setImageDrawable(drawable);
    }

    public final ColorStateList getIconTint() {
        return this.iconTint;
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.iconTint = colorStateList;
        this.imageView.setImageTintList(colorStateList);
    }

    public final Integer getItemCount() {
        Number number = Formats.getIntegerFormat().parse(this.countTextView.getText().toString());
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    public final void setItemCount(Integer num) {
        this.countTextView.setVisibility(num != null ? 0 : 8);
        this.countTextView.setText(Formats.getIntegerFormat().format(Integer.valueOf(num != null ? num.intValue() : 0)));
    }

    public final boolean getBadged() {
        return this.badgeView.getVisibility() == 0;
    }

    public final void setBadged(boolean z) {
        this.badgeView.setVisibility(z ? 0 : 8);
    }

    public final boolean getClosable() {
        return this.closeIconView.getVisibility() == 0;
    }

    public final void setClosable(boolean z) {
        this.closeIconView.setVisibility(z ? 0 : 8);
    }

    public final Drawable getTrailingIcon() {
        return this.imageView.getDrawable();
    }

    public final void setTrailingIcon(Drawable drawable) {
        this.trailingIconView.setVisibility(drawable != null ? 0 : 8);
        this.trailingIconView.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        Typeface typeface;
        super.setSelected(selected);
        TextView textView = this.textView;
        if (selected) {
            typeface = this.selectedTypeface;
        } else {
            typeface = this.normalTypeface;
        }
        textView.setTypeface(typeface);
    }

    public final void loadImage(HttpUrl httpUrl, Integer errorDrawableRes) {
        this.imageView.setVisibility(httpUrl != null ? 0 : 8);
        if (httpUrl != null) {
            ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(httpUrl);
            if (errorDrawableRes != null) {
                imageRequestLoad.error(errorDrawableRes.intValue());
            }
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, this.imageView, null, null, 6, null);
        }
    }

    public final void onTrailingIconClick(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        OnClickListeners.onClick(this.trailingIconView, listener);
    }

    public final void expandTrailingIconTappingAreaIfVisible() {
        expandTappingAreaForEmbeddedIconIfVisible$default(this, this.trailingIconView, 0.0f, 2, null);
    }

    static /* synthetic */ void expandTappingAreaForEmbeddedIconIfVisible$default(RdsChip rdsChip, View view, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 8.0f;
        }
        rdsChip.expandTappingAreaForEmbeddedIconIfVisible(view, f);
    }

    private final void expandTappingAreaForEmbeddedIconIfVisible(final View iconView, float expandDp) {
        Object parent = iconView.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        final View view = (View) parent;
        final int iApplyDimension = (int) TypedValue.applyDimension(1, expandDp, Resources.getSystem().getDisplayMetrics());
        view.post(new Runnable() { // from class: com.robinhood.android.designsystem.chip.RdsChip.expandTappingAreaForEmbeddedIconIfVisible.1
            @Override // java.lang.Runnable
            public final void run() {
                Rect rect = new Rect();
                if (iconView.getVisibility() == 0) {
                    iconView.getHitRect(rect);
                    int i = rect.top;
                    int i2 = iApplyDimension;
                    rect.top = i - i2;
                    rect.left -= i2;
                    rect.bottom += i2;
                    rect.right += i2;
                }
                view.setTouchDelegate(new TouchDelegate(rect, iconView));
            }
        });
    }

    /* compiled from: RdsChip.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chip/RdsChip$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsChip> {
        private final /* synthetic */ Inflater<RdsChip> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsChip inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsChip) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_chip);
        }
    }
}
