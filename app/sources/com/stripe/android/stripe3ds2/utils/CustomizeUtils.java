package com.stripe.android.stripe3ds2.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.robinhood.utils.extensions.ResourceTypes;
import com.stripe.android.stripe3ds2.init.p418ui.Customization;
import com.stripe.android.stripe3ds2.init.p418ui.UiCustomization;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CustomizeUtils.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0015\u0010!¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;", "", "<init>", "()V", "Landroid/widget/ProgressBar;", "progressBar", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "uiCustomization", "", "applyProgressBarColor$3ds2sdk_release", "(Landroid/widget/ProgressBar;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "applyProgressBarColor", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "statusBarColor", "setStatusBarColor", "(Landroidx/appcompat/app/AppCompatActivity;I)V", ResourceTypes.COLOR, "", "factor", "darken$3ds2sdk_release", "(IF)I", "darken", "Landroid/content/Context;", "context", "", "text", "Lcom/stripe/android/stripe3ds2/init/ui/Customization;", "customization", "Landroid/text/SpannableString;", "buildStyledText", "(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/Customization;)Landroid/text/SpannableString;", "(I)I", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CustomizeUtils {
    public static final CustomizeUtils INSTANCE = new CustomizeUtils();

    private CustomizeUtils() {
    }

    public final void applyProgressBarColor$3ds2sdk_release(ProgressBar progressBar, UiCustomization uiCustomization) {
        String accentColor;
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        if (uiCustomization == null || (accentColor = uiCustomization.getAccentColor()) == null) {
            return;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(accentColor)));
    }

    public final void setStatusBarColor(AppCompatActivity activity, int statusBarColor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().setStatusBarColor(statusBarColor);
    }

    public final int darken$3ds2sdk_release(int color, float factor) {
        return Color.argb(Color.alpha(color), Math.min(Math.max((int) (Color.red(color) * factor), 0), 255), Math.min(Math.max((int) (Color.green(color) * factor), 0), 255), Math.min(Math.max((int) (Color.blue(color) * factor), 0), 255));
    }

    public final SpannableString buildStyledText(Context context, String text, Customization customization) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(customization, "customization");
        SpannableString spannableString = new SpannableString(text);
        String textColor = customization.getTextColor();
        if (textColor != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(textColor)), 0, spannableString.length(), 0);
        }
        Integer numValueOf = Integer.valueOf(customization.getTextFontSize());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, numValueOf.intValue(), context.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String textFontName = customization.getTextFontName();
        if (textFontName != null) {
            spannableString.setSpan(new TypefaceSpan(textFontName), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public final int darken$3ds2sdk_release(int color) {
        return darken$3ds2sdk_release(color, 0.8f);
    }
}
