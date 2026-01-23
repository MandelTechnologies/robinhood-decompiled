package com.robinhood.compose.bento.theme;

import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import com.robinhood.android.font.C16915R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: BentoTypography.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"CapsuleSansBookCoverFamily", "Landroidx/compose/ui/text/font/FontFamily;", "NibProBookCoverFamily", "CapsuleSansDisplayFamily", "NibProDisplayFamily", "CapsuleSansTextFamily", "MartinaPlantijiBookCoverFamily", "MartinaPlantijiDisplayFamily", "LocalBentoTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/compose/bento/theme/BentoTypography;", "getLocalBentoTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.theme.BentoTypographyKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoTypography2 {
    private static final FontFamily CapsuleSansBookCoverFamily;
    private static final FontFamily CapsuleSansDisplayFamily;
    private static final FontFamily CapsuleSansTextFamily;
    private static final CompositionLocal6<BentoTypography> LocalBentoTypography;
    private static final FontFamily MartinaPlantijiBookCoverFamily;
    private static final FontFamily MartinaPlantijiDisplayFamily;
    private static final FontFamily NibProBookCoverFamily;
    private static final FontFamily NibProDisplayFamily;

    static {
        int i = C16915R.font.capsule_sans_display_book;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        CapsuleSansBookCoverFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i, companion.getNormal(), 0, 0, 12, null));
        NibProBookCoverFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C16915R.font.nib_pro_book_cover_light, companion.getLight(), 0, 0, 12, null));
        CapsuleSansDisplayFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C16915R.font.capsule_sans_display_medium, companion.getMedium(), 0, 0, 12, null));
        NibProDisplayFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C16915R.font.nib_pro_display_light, companion.getLight(), 0, 0, 12, null), Font2.m7691FontYpTlLL0$default(C16915R.font.nib_pro_display_regular, companion.getNormal(), 0, 0, 12, null));
        CapsuleSansTextFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C16915R.font.capsule_sans_text_book, companion.getNormal(), 0, 0, 12, null), Font2.m7691FontYpTlLL0$default(C16915R.font.capsule_sans_text_bold, companion.getBold(), 0, 0, 12, null));
        MartinaPlantijiBookCoverFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C16915R.font.martina_regular, companion.getNormal(), 0, 0, 12, null));
        MartinaPlantijiDisplayFamily = FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C16915R.font.martina_regular, companion.getNormal(), 0, 0, 12, null));
        LocalBentoTypography = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.compose.bento.theme.BentoTypographyKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BentoTypography2.LocalBentoTypography$lambda$0();
            }
        });
    }

    public static final CompositionLocal6<BentoTypography> getLocalBentoTypography() {
        return LocalBentoTypography;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BentoTypography LocalBentoTypography$lambda$0() {
        throw new IllegalStateException("No BentoTypography provided. Wrap composable in BentoTheme.");
    }
}
