package com.robinhood.android.designsystem.sparkle;

import android.content.res.ColorStateList;
import com.robinhood.android.graphics.Gradient;
import kotlin.Metadata;

/* compiled from: Sparkleable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "", "sparkleGradient", "Lcom/robinhood/android/graphics/Gradient;", "getSparkleGradient", "()Lcom/robinhood/android/graphics/Gradient;", "setSparkleGradient", "(Lcom/robinhood/android/graphics/Gradient;)V", "sparkleOverride", "Landroid/content/res/ColorStateList;", "getSparkleOverride", "()Landroid/content/res/ColorStateList;", "setSparkleOverride", "(Landroid/content/res/ColorStateList;)V", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface Sparkleable {
    Gradient getSparkleGradient();

    ColorStateList getSparkleOverride();

    void setSparkleGradient(Gradient gradient);

    void setSparkleOverride(ColorStateList colorStateList);
}
