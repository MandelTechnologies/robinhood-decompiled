package com.stripe.android.view;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.stripe.android.R$color;
import com.stripe.android.R$integer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemeConfig.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/view/ThemeConfig;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "defaultColor", "colorIfTransparent", "determineColor", "(Landroid/content/Context;II)I", "", "isSelected", "getTintColor$payments_core_release", "(Z)I", "getTintColor", "getTextColor$payments_core_release", "getTextColor", "getTextAlphaColor$payments_core_release", "getTextAlphaColor", "Lcom/stripe/android/view/StripeColorUtils;", "colorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "selectedColorInt", "I", "unselectedColorInt", "unselectedTextColorInt", "selectedTextAlphaColorInt", "unselectedTextAlphaColorInt", "", "textColorValues", "[I", "getTextColorValues$payments_core_release", "()[I", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ThemeConfig {
    private final StripeColorUtils colorUtils;
    private final int selectedColorInt;
    private final int selectedTextAlphaColorInt;
    private final int[] textColorValues;
    private final int unselectedColorInt;
    private final int unselectedTextAlphaColorInt;
    private final int unselectedTextColorInt;

    public ThemeConfig(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StripeColorUtils stripeColorUtils = new StripeColorUtils(context);
        this.colorUtils = stripeColorUtils;
        int iDetermineColor = determineColor(context, stripeColorUtils.getColorAccent(), R$color.stripe_accent_color_default);
        this.selectedColorInt = iDetermineColor;
        this.unselectedColorInt = determineColor(context, stripeColorUtils.getColorControlNormal(), R$color.stripe_control_normal_color_default);
        int iDetermineColor2 = determineColor(context, stripeColorUtils.getTextColorSecondary(), R$color.stripe_color_text_secondary_default);
        this.unselectedTextColorInt = iDetermineColor2;
        int alphaComponent = ColorUtils.setAlphaComponent(iDetermineColor, context.getResources().getInteger(R$integer.stripe_light_text_alpha_hex));
        this.selectedTextAlphaColorInt = alphaComponent;
        int alphaComponent2 = ColorUtils.setAlphaComponent(iDetermineColor2, context.getResources().getInteger(R$integer.stripe_light_text_alpha_hex));
        this.unselectedTextAlphaColorInt = alphaComponent2;
        this.textColorValues = new int[]{iDetermineColor, alphaComponent, iDetermineColor2, alphaComponent2};
    }

    public final int getTintColor$payments_core_release(boolean isSelected) {
        return isSelected ? this.selectedColorInt : this.unselectedColorInt;
    }

    public final int getTextColor$payments_core_release(boolean isSelected) {
        return isSelected ? this.selectedColorInt : this.unselectedTextColorInt;
    }

    public final int getTextAlphaColor$payments_core_release(boolean isSelected) {
        return isSelected ? this.selectedTextAlphaColorInt : this.unselectedTextAlphaColorInt;
    }

    private final int determineColor(Context context, int defaultColor, int colorIfTransparent) {
        return StripeColorUtils.INSTANCE.isColorTransparent(defaultColor) ? ContextCompat.getColor(context, colorIfTransparent) : defaultColor;
    }
}
