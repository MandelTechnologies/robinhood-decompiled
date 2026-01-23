package com.robinhood.android.blackwidow.p068ui.upsell;

import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontWeight;
import com.robinhood.android.blackwidow.C9859R;
import com.robinhood.android.font.C16915R;
import kotlin.Metadata;

/* compiled from: FontHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/FontHelper;", "", "<init>", "()V", "MartinaFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getMartinaFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "PhonicFontFamily", "getPhonicFontFamily", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FontHelper {
    public static final int $stable = 0;
    public static final FontHelper INSTANCE = new FontHelper();
    private static final FontFamily MartinaFontFamily;
    private static final FontFamily PhonicFontFamily;

    private FontHelper() {
    }

    public final FontFamily getMartinaFontFamily() {
        return MartinaFontFamily;
    }

    static {
        int i = C16915R.font.martina_regular;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        MartinaFontFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i, companion.getNormal(), 0, 0, 12, null));
        PhonicFontFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C9859R.font.rh_phonic_regular, companion.getNormal(), 0, 0, 12, null), Font2.m7691FontYpTlLL0$default(C9859R.font.rh_phonic_bold, companion.getBold(), 0, 0, 12, null), Font2.m7691FontYpTlLL0$default(C9859R.font.rh_phonic_light, companion.getLight(), 0, 0, 12, null));
    }

    public final FontFamily getPhonicFontFamily() {
        return PhonicFontFamily;
    }
}
