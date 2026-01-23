package androidx.compose.p011ui.text.font;

import android.graphics.Typeface;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;

/* compiled from: AndroidFontUtils.android.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Landroidx/compose/ui/text/font/TypefaceHelperMethodsApi28;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Landroid/graphics/Typeface;", "typeface", "finalFontWeight", "", "finalFontStyle", "", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class TypefaceHelperMethodsApi28 {
    public static final TypefaceHelperMethodsApi28 INSTANCE = new TypefaceHelperMethodsApi28();

    private TypefaceHelperMethodsApi28() {
    }

    public final Typeface create(Typeface typeface, int finalFontWeight, boolean finalFontStyle) {
        return Typeface.create(typeface, finalFontWeight, finalFontStyle);
    }
}
