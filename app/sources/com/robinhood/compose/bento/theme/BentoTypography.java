package com.robinhood.compose.bento.theme;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.TextUnit2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoTypography.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0007\u0018\u0000 42\u00020\u0001:\u00014BÁ\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u00065"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoTypography;", "", "bookCoverCapsuleLarge", "Landroidx/compose/ui/text/TextStyle;", "bookCoverNibLarge", "bookCoverMartinaLarge", "bookCoverCapsuleMedium", "bookCoverNibMedium", "bookCoverMartinaMedium", "bookCoverCapsuleSmall", "bookCoverNibSmall", "bookCoverMartinaSmall", "displayCapsuleLarge", "displayNibLarge", "displayMartinaLarge", "displayCapsuleMedium", "displayNibMedium", "displayMartinaMedium", "displayCapsuleSmall", "displayNibSmall", "displayMartinaSmall", "textL", "textM", "textS", "textAnnotation", "currencySwitcher", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBookCoverCapsuleLarge", "()Landroidx/compose/ui/text/TextStyle;", "getBookCoverNibLarge", "getBookCoverMartinaLarge", "getBookCoverCapsuleMedium", "getBookCoverNibMedium", "getBookCoverMartinaMedium", "getBookCoverCapsuleSmall", "getBookCoverNibSmall", "getBookCoverMartinaSmall", "getDisplayCapsuleLarge", "getDisplayNibLarge", "getDisplayMartinaLarge", "getDisplayCapsuleMedium", "getDisplayNibMedium", "getDisplayMartinaMedium", "getDisplayCapsuleSmall", "getDisplayNibSmall", "getDisplayMartinaSmall", "getTextL", "getTextM", "getTextS", "getTextAnnotation", "getCurrencySwitcher", "Companion", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BentoTypography {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TextStyle bookCoverCapsuleLarge;
    private final TextStyle bookCoverCapsuleMedium;
    private final TextStyle bookCoverCapsuleSmall;
    private final TextStyle bookCoverMartinaLarge;
    private final TextStyle bookCoverMartinaMedium;
    private final TextStyle bookCoverMartinaSmall;
    private final TextStyle bookCoverNibLarge;
    private final TextStyle bookCoverNibMedium;
    private final TextStyle bookCoverNibSmall;
    private final TextStyle currencySwitcher;
    private final TextStyle displayCapsuleLarge;
    private final TextStyle displayCapsuleMedium;
    private final TextStyle displayCapsuleSmall;
    private final TextStyle displayMartinaLarge;
    private final TextStyle displayMartinaMedium;
    private final TextStyle displayMartinaSmall;
    private final TextStyle displayNibLarge;
    private final TextStyle displayNibMedium;
    private final TextStyle displayNibSmall;
    private final TextStyle textAnnotation;
    private final TextStyle textL;
    private final TextStyle textM;
    private final TextStyle textS;

    public BentoTypography(TextStyle bookCoverCapsuleLarge, TextStyle bookCoverNibLarge, TextStyle bookCoverMartinaLarge, TextStyle bookCoverCapsuleMedium, TextStyle bookCoverNibMedium, TextStyle bookCoverMartinaMedium, TextStyle bookCoverCapsuleSmall, TextStyle bookCoverNibSmall, TextStyle bookCoverMartinaSmall, TextStyle displayCapsuleLarge, TextStyle displayNibLarge, TextStyle displayMartinaLarge, TextStyle displayCapsuleMedium, TextStyle displayNibMedium, TextStyle displayMartinaMedium, TextStyle displayCapsuleSmall, TextStyle displayNibSmall, TextStyle displayMartinaSmall, TextStyle textL, TextStyle textM, TextStyle textS, TextStyle textAnnotation, TextStyle currencySwitcher) {
        Intrinsics.checkNotNullParameter(bookCoverCapsuleLarge, "bookCoverCapsuleLarge");
        Intrinsics.checkNotNullParameter(bookCoverNibLarge, "bookCoverNibLarge");
        Intrinsics.checkNotNullParameter(bookCoverMartinaLarge, "bookCoverMartinaLarge");
        Intrinsics.checkNotNullParameter(bookCoverCapsuleMedium, "bookCoverCapsuleMedium");
        Intrinsics.checkNotNullParameter(bookCoverNibMedium, "bookCoverNibMedium");
        Intrinsics.checkNotNullParameter(bookCoverMartinaMedium, "bookCoverMartinaMedium");
        Intrinsics.checkNotNullParameter(bookCoverCapsuleSmall, "bookCoverCapsuleSmall");
        Intrinsics.checkNotNullParameter(bookCoverNibSmall, "bookCoverNibSmall");
        Intrinsics.checkNotNullParameter(bookCoverMartinaSmall, "bookCoverMartinaSmall");
        Intrinsics.checkNotNullParameter(displayCapsuleLarge, "displayCapsuleLarge");
        Intrinsics.checkNotNullParameter(displayNibLarge, "displayNibLarge");
        Intrinsics.checkNotNullParameter(displayMartinaLarge, "displayMartinaLarge");
        Intrinsics.checkNotNullParameter(displayCapsuleMedium, "displayCapsuleMedium");
        Intrinsics.checkNotNullParameter(displayNibMedium, "displayNibMedium");
        Intrinsics.checkNotNullParameter(displayMartinaMedium, "displayMartinaMedium");
        Intrinsics.checkNotNullParameter(displayCapsuleSmall, "displayCapsuleSmall");
        Intrinsics.checkNotNullParameter(displayNibSmall, "displayNibSmall");
        Intrinsics.checkNotNullParameter(displayMartinaSmall, "displayMartinaSmall");
        Intrinsics.checkNotNullParameter(textL, "textL");
        Intrinsics.checkNotNullParameter(textM, "textM");
        Intrinsics.checkNotNullParameter(textS, "textS");
        Intrinsics.checkNotNullParameter(textAnnotation, "textAnnotation");
        Intrinsics.checkNotNullParameter(currencySwitcher, "currencySwitcher");
        this.bookCoverCapsuleLarge = bookCoverCapsuleLarge;
        this.bookCoverNibLarge = bookCoverNibLarge;
        this.bookCoverMartinaLarge = bookCoverMartinaLarge;
        this.bookCoverCapsuleMedium = bookCoverCapsuleMedium;
        this.bookCoverNibMedium = bookCoverNibMedium;
        this.bookCoverMartinaMedium = bookCoverMartinaMedium;
        this.bookCoverCapsuleSmall = bookCoverCapsuleSmall;
        this.bookCoverNibSmall = bookCoverNibSmall;
        this.bookCoverMartinaSmall = bookCoverMartinaSmall;
        this.displayCapsuleLarge = displayCapsuleLarge;
        this.displayNibLarge = displayNibLarge;
        this.displayMartinaLarge = displayMartinaLarge;
        this.displayCapsuleMedium = displayCapsuleMedium;
        this.displayNibMedium = displayNibMedium;
        this.displayMartinaMedium = displayMartinaMedium;
        this.displayCapsuleSmall = displayCapsuleSmall;
        this.displayNibSmall = displayNibSmall;
        this.displayMartinaSmall = displayMartinaSmall;
        this.textL = textL;
        this.textM = textM;
        this.textS = textS;
        this.textAnnotation = textAnnotation;
        this.currencySwitcher = currencySwitcher;
    }

    public final TextStyle getBookCoverCapsuleLarge() {
        return this.bookCoverCapsuleLarge;
    }

    public final TextStyle getBookCoverNibLarge() {
        return this.bookCoverNibLarge;
    }

    public final TextStyle getBookCoverMartinaLarge() {
        return this.bookCoverMartinaLarge;
    }

    public final TextStyle getBookCoverCapsuleMedium() {
        return this.bookCoverCapsuleMedium;
    }

    public final TextStyle getBookCoverNibMedium() {
        return this.bookCoverNibMedium;
    }

    public final TextStyle getBookCoverMartinaMedium() {
        return this.bookCoverMartinaMedium;
    }

    public final TextStyle getBookCoverCapsuleSmall() {
        return this.bookCoverCapsuleSmall;
    }

    public final TextStyle getBookCoverNibSmall() {
        return this.bookCoverNibSmall;
    }

    public final TextStyle getBookCoverMartinaSmall() {
        return this.bookCoverMartinaSmall;
    }

    public final TextStyle getDisplayCapsuleLarge() {
        return this.displayCapsuleLarge;
    }

    public final TextStyle getDisplayNibLarge() {
        return this.displayNibLarge;
    }

    public final TextStyle getDisplayMartinaLarge() {
        return this.displayMartinaLarge;
    }

    public final TextStyle getDisplayCapsuleMedium() {
        return this.displayCapsuleMedium;
    }

    public final TextStyle getDisplayNibMedium() {
        return this.displayNibMedium;
    }

    public final TextStyle getDisplayMartinaMedium() {
        return this.displayMartinaMedium;
    }

    public final TextStyle getDisplayCapsuleSmall() {
        return this.displayCapsuleSmall;
    }

    public final TextStyle getDisplayNibSmall() {
        return this.displayNibSmall;
    }

    public final TextStyle getDisplayMartinaSmall() {
        return this.displayMartinaSmall;
    }

    public final TextStyle getTextL() {
        return this.textL;
    }

    public final TextStyle getTextM() {
        return this.textM;
    }

    public final TextStyle getTextS() {
        return this.textS;
    }

    public final TextStyle getTextAnnotation() {
        return this.textAnnotation;
    }

    public final TextStyle getCurrencySwitcher() {
        return this.currencySwitcher;
    }

    /* compiled from: BentoTypography.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0006J\r\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoTypography$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/compose/bento/theme/BentoTypography;", "default$lib_compose_bento_externalRelease", "small", "small$lib_compose_bento_externalRelease", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BentoTypography default$lib_compose_bento_externalRelease() {
            FontFamily fontFamily = BentoTypography2.CapsuleSansBookCoverFamily;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            FontWeight normal = companion.getNormal();
            TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(72), normal, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily2 = BentoTypography2.NibProBookCoverFamily;
            FontWeight light = companion.getLight();
            TextStyle textStyle2 = new TextStyle(0L, TextUnit2.getSp(72), light, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily3 = BentoTypography2.MartinaPlantijiBookCoverFamily;
            FontWeight normal2 = companion.getNormal();
            TextStyle textStyle3 = new TextStyle(0L, TextUnit2.getSp(72), normal2, (FontStyle) null, (FontSynthesis) null, fontFamily3, (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily4 = BentoTypography2.CapsuleSansBookCoverFamily;
            FontWeight normal3 = companion.getNormal();
            TextStyle textStyle4 = new TextStyle(0L, TextUnit2.getSp(56), normal3, (FontStyle) null, (FontSynthesis) null, fontFamily4, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily5 = BentoTypography2.NibProBookCoverFamily;
            FontWeight light2 = companion.getLight();
            TextStyle textStyle5 = new TextStyle(0L, TextUnit2.getSp(56), light2, (FontStyle) null, (FontSynthesis) null, fontFamily5, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily6 = BentoTypography2.MartinaPlantijiBookCoverFamily;
            FontWeight normal4 = companion.getNormal();
            TextStyle textStyle6 = new TextStyle(0L, TextUnit2.getSp(56), normal4, (FontStyle) null, (FontSynthesis) null, fontFamily6, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily7 = BentoTypography2.CapsuleSansBookCoverFamily;
            FontWeight normal5 = companion.getNormal();
            TextStyle textStyle7 = new TextStyle(0L, TextUnit2.getSp(44), normal5, (FontStyle) null, (FontSynthesis) null, fontFamily7, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily8 = BentoTypography2.NibProBookCoverFamily;
            FontWeight light3 = companion.getLight();
            TextStyle textStyle8 = new TextStyle(0L, TextUnit2.getSp(44), light3, (FontStyle) null, (FontSynthesis) null, fontFamily8, (String) null, TextUnit2.getSp(-1), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily9 = BentoTypography2.MartinaPlantijiBookCoverFamily;
            FontWeight normal6 = companion.getNormal();
            TextStyle textStyle9 = new TextStyle(0L, TextUnit2.getSp(44), normal6, (FontStyle) null, (FontSynthesis) null, fontFamily9, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily10 = BentoTypography2.CapsuleSansDisplayFamily;
            FontWeight medium = companion.getMedium();
            TextStyle textStyle10 = new TextStyle(0L, TextUnit2.getSp(32), medium, (FontStyle) null, (FontSynthesis) null, fontFamily10, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.25d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily11 = BentoTypography2.NibProDisplayFamily;
            FontWeight light4 = companion.getLight();
            TextStyle textStyle11 = new TextStyle(0L, TextUnit2.getSp(32), light4, (FontStyle) null, (FontSynthesis) null, fontFamily11, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.25d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily12 = BentoTypography2.MartinaPlantijiDisplayFamily;
            FontWeight normal7 = companion.getNormal();
            TextStyle textStyle12 = new TextStyle(0L, TextUnit2.getSp(32), normal7, (FontStyle) null, (FontSynthesis) null, fontFamily12, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.25d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily13 = BentoTypography2.CapsuleSansDisplayFamily;
            FontWeight medium2 = companion.getMedium();
            TextStyle textStyle13 = new TextStyle(0L, TextUnit2.getSp(24), medium2, (FontStyle) null, (FontSynthesis) null, fontFamily13, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily14 = BentoTypography2.NibProDisplayFamily;
            FontWeight normal8 = companion.getNormal();
            TextStyle textStyle14 = new TextStyle(0L, TextUnit2.getSp(24), normal8, (FontStyle) null, (FontSynthesis) null, fontFamily14, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily15 = BentoTypography2.MartinaPlantijiDisplayFamily;
            FontWeight normal9 = companion.getNormal();
            TextStyle textStyle15 = new TextStyle(0L, TextUnit2.getSp(24), normal9, (FontStyle) null, (FontSynthesis) null, fontFamily15, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily16 = BentoTypography2.CapsuleSansDisplayFamily;
            FontWeight medium3 = companion.getMedium();
            TextStyle textStyle16 = new TextStyle(0L, TextUnit2.getSp(21), medium3, (FontStyle) null, (FontSynthesis) null, fontFamily16, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily17 = BentoTypography2.NibProDisplayFamily;
            FontWeight normal10 = companion.getNormal();
            TextStyle textStyle17 = new TextStyle(0L, TextUnit2.getSp(21), normal10, (FontStyle) null, (FontSynthesis) null, fontFamily17, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily18 = BentoTypography2.MartinaPlantijiDisplayFamily;
            FontWeight normal11 = companion.getNormal();
            TextStyle textStyle18 = new TextStyle(0L, TextUnit2.getSp(21), normal11, (FontStyle) null, (FontSynthesis) null, fontFamily18, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily19 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight normal12 = companion.getNormal();
            TextStyle textStyle19 = new TextStyle(0L, TextUnit2.getSp(18), normal12, (FontStyle) null, (FontSynthesis) null, fontFamily19, (String) null, TextUnit2.getSp(-0.25d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.53d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily20 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight normal13 = companion.getNormal();
            TextStyle textStyle20 = new TextStyle(0L, TextUnit2.getSp(15), normal13, (FontStyle) null, (FontSynthesis) null, fontFamily20, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.6d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily21 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight normal14 = companion.getNormal();
            TextStyle textStyle21 = new TextStyle(0L, TextUnit2.getSp(13), normal14, (FontStyle) null, (FontSynthesis) null, fontFamily21, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.53d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily22 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight normal15 = companion.getNormal();
            TextStyle textStyle22 = new TextStyle(0L, TextUnit2.getSp(11), normal15, (FontStyle) null, (FontSynthesis) null, fontFamily22, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.45d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily23 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight semiBold = companion.getSemiBold();
            return new BentoTypography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, new TextStyle(0L, TextUnit2.getSp(18), semiBold, (FontStyle) null, (FontSynthesis) null, fontFamily23, (String) null, TextUnit2.getSp(-0.25d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.55d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null));
        }

        public final BentoTypography small$lib_compose_bento_externalRelease() {
            FontFamily fontFamily = BentoTypography2.CapsuleSansBookCoverFamily;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            FontWeight normal = companion.getNormal();
            TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(56), normal, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily2 = BentoTypography2.NibProBookCoverFamily;
            FontWeight light = companion.getLight();
            TextStyle textStyle2 = new TextStyle(0L, TextUnit2.getSp(56), light, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily3 = BentoTypography2.MartinaPlantijiBookCoverFamily;
            FontWeight normal2 = companion.getNormal();
            TextStyle textStyle3 = new TextStyle(0L, TextUnit2.getSp(56), normal2, (FontStyle) null, (FontSynthesis) null, fontFamily3, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily4 = BentoTypography2.CapsuleSansBookCoverFamily;
            FontWeight normal3 = companion.getNormal();
            TextStyle textStyle4 = new TextStyle(0L, TextUnit2.getSp(44), normal3, (FontStyle) null, (FontSynthesis) null, fontFamily4, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily5 = BentoTypography2.NibProBookCoverFamily;
            FontWeight light2 = companion.getLight();
            TextStyle textStyle5 = new TextStyle(0L, TextUnit2.getSp(44), light2, (FontStyle) null, (FontSynthesis) null, fontFamily5, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily6 = BentoTypography2.MartinaPlantijiBookCoverFamily;
            FontWeight normal4 = companion.getNormal();
            TextStyle textStyle6 = new TextStyle(0L, TextUnit2.getSp(44), normal4, (FontStyle) null, (FontSynthesis) null, fontFamily6, (String) null, TextUnit2.getSp(-1.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily7 = BentoTypography2.CapsuleSansBookCoverFamily;
            FontWeight normal5 = companion.getNormal();
            TextStyle textStyle7 = new TextStyle(0L, TextUnit2.getSp(37), normal5, (FontStyle) null, (FontSynthesis) null, fontFamily7, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily8 = BentoTypography2.NibProBookCoverFamily;
            FontWeight light3 = companion.getLight();
            TextStyle textStyle8 = new TextStyle(0L, TextUnit2.getSp(37), light3, (FontStyle) null, (FontSynthesis) null, fontFamily8, (String) null, TextUnit2.getSp(-0.800000011920929d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily9 = BentoTypography2.MartinaPlantijiBookCoverFamily;
            FontWeight normal6 = companion.getNormal();
            TextStyle textStyle9 = new TextStyle(0L, TextUnit2.getSp(37), normal6, (FontStyle) null, (FontSynthesis) null, fontFamily9, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.22d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily10 = BentoTypography2.CapsuleSansDisplayFamily;
            FontWeight medium = companion.getMedium();
            TextStyle textStyle10 = new TextStyle(0L, TextUnit2.getSp(28), medium, (FontStyle) null, (FontSynthesis) null, fontFamily10, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.27d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily11 = BentoTypography2.NibProDisplayFamily;
            FontWeight light4 = companion.getLight();
            TextStyle textStyle11 = new TextStyle(0L, TextUnit2.getSp(28), light4, (FontStyle) null, (FontSynthesis) null, fontFamily11, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.27d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily12 = BentoTypography2.MartinaPlantijiDisplayFamily;
            FontWeight normal7 = companion.getNormal();
            TextStyle textStyle12 = new TextStyle(0L, TextUnit2.getSp(28), normal7, (FontStyle) null, (FontSynthesis) null, fontFamily12, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.27d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily13 = BentoTypography2.CapsuleSansDisplayFamily;
            FontWeight medium2 = companion.getMedium();
            TextStyle textStyle13 = new TextStyle(0L, TextUnit2.getSp(24), medium2, (FontStyle) null, (FontSynthesis) null, fontFamily13, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily14 = BentoTypography2.NibProDisplayFamily;
            FontWeight normal8 = companion.getNormal();
            TextStyle textStyle14 = new TextStyle(0L, TextUnit2.getSp(24), normal8, (FontStyle) null, (FontSynthesis) null, fontFamily14, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily15 = BentoTypography2.MartinaPlantijiDisplayFamily;
            FontWeight normal9 = companion.getNormal();
            TextStyle textStyle15 = new TextStyle(0L, TextUnit2.getSp(24), normal9, (FontStyle) null, (FontSynthesis) null, fontFamily15, (String) null, TextUnit2.getSp(-0.33d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily16 = BentoTypography2.CapsuleSansDisplayFamily;
            FontWeight medium3 = companion.getMedium();
            TextStyle textStyle16 = new TextStyle(0L, TextUnit2.getSp(21), medium3, (FontStyle) null, (FontSynthesis) null, fontFamily16, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily17 = BentoTypography2.NibProDisplayFamily;
            FontWeight normal10 = companion.getNormal();
            TextStyle textStyle17 = new TextStyle(0L, TextUnit2.getSp(21), normal10, (FontStyle) null, (FontSynthesis) null, fontFamily17, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily18 = BentoTypography2.MartinaPlantijiDisplayFamily;
            FontWeight normal11 = companion.getNormal();
            TextStyle textStyle18 = new TextStyle(0L, TextUnit2.getSp(21), normal11, (FontStyle) null, (FontSynthesis) null, fontFamily18, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.35d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily19 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight normal12 = companion.getNormal();
            TextStyle textStyle19 = new TextStyle(0L, TextUnit2.getSp(16), normal12, (FontStyle) null, (FontSynthesis) null, fontFamily19, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.5d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily20 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight normal13 = companion.getNormal();
            TextStyle textStyle20 = new TextStyle(0L, TextUnit2.getSp(13), normal13, (FontStyle) null, (FontSynthesis) null, fontFamily20, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.53d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily21 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight normal14 = companion.getNormal();
            TextStyle textStyle21 = new TextStyle(0L, TextUnit2.getSp(11), normal14, (FontStyle) null, (FontSynthesis) null, fontFamily21, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.45d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily22 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight normal15 = companion.getNormal();
            TextStyle textStyle22 = new TextStyle(0L, TextUnit2.getSp(11), normal15, (FontStyle) null, (FontSynthesis) null, fontFamily22, (String) null, TextUnit2.getSp(-0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.45d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
            FontFamily fontFamily23 = BentoTypography2.CapsuleSansTextFamily;
            FontWeight semiBold = companion.getSemiBold();
            return new BentoTypography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, new TextStyle(0L, TextUnit2.getSp(16), semiBold, (FontStyle) null, (FontSynthesis) null, fontFamily23, (String) null, TextUnit2.getSp(-0.25d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getEm(1.55d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null));
        }
    }
}
