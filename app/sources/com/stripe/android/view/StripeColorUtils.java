package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeColorUtils.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014R\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0006J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0006H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b¨\u0006\u001c"}, m3636d2 = {"Lcom/stripe/android/view/StripeColorUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "colorAccent", "", "getColorAccent", "()I", "colorControlNormal", "getColorControlNormal", "colorPrimary", "getColorPrimary", "textColorPrimary", "getTextColorPrimary", "textColorSecondary", "getTextColorSecondary", "getTintedIconWithAttribute", "Landroid/graphics/drawable/Drawable;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeResource", "iconResourceId", "getTypedValue", "Landroid/util/TypedValue;", "idRes", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class StripeColorUtils {
    private final int colorAccent;
    private final int colorControlNormal;
    private final int colorPrimary;
    private final Context context;
    private final int textColorPrimary;
    private final int textColorSecondary;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public StripeColorUtils(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.colorAccent = getTypedValue(R.attr.colorAccent).data;
        this.colorControlNormal = getTypedValue(R.attr.colorControlNormal).data;
        this.textColorPrimary = getTypedValue(R.attr.textColorPrimary).data;
        this.textColorSecondary = getTypedValue(R.attr.textColorSecondary).data;
        this.colorPrimary = getTypedValue(R.attr.colorPrimary).data;
    }

    public final int getColorAccent() {
        return this.colorAccent;
    }

    public final int getColorControlNormal() {
        return this.colorControlNormal;
    }

    public final int getTextColorPrimary() {
        return this.textColorPrimary;
    }

    public final int getTextColorSecondary() {
        return this.textColorSecondary;
    }

    public final int getColorPrimary() {
        return this.colorPrimary;
    }

    private final TypedValue getTypedValue(int idRes) {
        TypedValue typedValue = new TypedValue();
        this.context.getTheme().resolveAttribute(idRes, typedValue, true);
        return typedValue;
    }

    public final Drawable getTintedIconWithAttribute(Resources.Theme theme, int attributeResource, int iconResourceId) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(attributeResource, typedValue, true);
        int i = typedValue.data;
        Drawable drawable = ContextCompat.getDrawable(this.context, iconResourceId);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "wrap(...)");
        DrawableCompat.setTint(drawableWrap.mutate(), i);
        return drawableWrap;
    }

    /* compiled from: StripeColorUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/view/StripeColorUtils$Companion;", "", "()V", "isColorDark", "", ResourceTypes.COLOR, "", "isColorTransparent", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isColorTransparent(int color) {
            return Color.alpha(color) < 16;
        }

        public final boolean isColorDark(int color) {
            return (((((double) Color.red(color)) * 0.299d) + (((double) Color.green(color)) * 0.587d)) + (((double) Color.blue(color)) * 0.114d)) / ((double) 255) <= 0.5d;
        }
    }
}
