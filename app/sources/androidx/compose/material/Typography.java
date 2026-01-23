package androidx.compose.material;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.TextUnit2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Typography.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b,\u0010!R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b-\u0010!¨\u0006."}, m3636d2 = {"Landroidx/compose/material/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "Landroidx/compose/ui/text/font/FontFamily;", "defaultFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "getH1", "()Landroidx/compose/ui/text/TextStyle;", "getH2", "getH3", "getH4", "getH5", "getH6", "getSubtitle1", "getSubtitle2", "getBody1", "getBody2", "getButton", "getCaption", "getOverline", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class Typography {
    private final TextStyle body1;
    private final TextStyle body2;
    private final TextStyle button;
    private final TextStyle caption;
    private final TextStyle h1;
    private final TextStyle h2;
    private final TextStyle h3;
    private final TextStyle h4;
    private final TextStyle h5;
    private final TextStyle h6;
    private final TextStyle overline;
    private final TextStyle subtitle1;
    private final TextStyle subtitle2;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public final TextStyle getBody2() {
        return this.body2;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        TextStyle textStyleM7655copyp1EtxEg$default;
        TextStyle textStyleM7655copyp1EtxEg$default2;
        TextStyle textStyleM7655copyp1EtxEg$default3;
        TextStyle textStyleM7655copyp1EtxEg$default4;
        TextStyle textStyleM7655copyp1EtxEg$default5;
        TextStyle textStyleM7655copyp1EtxEg$default6;
        TextStyle textStyleM7655copyp1EtxEg$default7;
        TextStyle textStyleM7655copyp1EtxEg$default8;
        TextStyle textStyleM7655copyp1EtxEg$default9;
        TextStyle textStyleM7655copyp1EtxEg$default10;
        TextStyle textStyleM7655copyp1EtxEg$default11;
        TextStyle textStyleM7655copyp1EtxEg$default12;
        TextStyle textStyleM7655copyp1EtxEg$default13;
        FontFamily fontFamily2 = (i & 1) != 0 ? FontFamily.INSTANCE.getDefault() : fontFamily;
        if ((i & 2) != 0) {
            textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(96), FontWeight.INSTANCE.getLight(), null, null, null, null, TextUnit2.getSp(-1.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(112), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default = textStyle;
        }
        if ((i & 4) != 0) {
            textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(60), FontWeight.INSTANCE.getLight(), null, null, null, null, TextUnit2.getSp(-0.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(72), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default2 = textStyle2;
        }
        if ((i & 8) != 0) {
            textStyleM7655copyp1EtxEg$default3 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(48), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(0), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(56), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default3 = textStyle3;
        }
        if ((i & 16) != 0) {
            textStyleM7655copyp1EtxEg$default4 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(34), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(0.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(36), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default4 = textStyle4;
        }
        if ((i & 32) != 0) {
            textStyleM7655copyp1EtxEg$default5 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(24), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(0), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default5 = textStyle5;
        }
        if ((i & 64) != 0) {
            textStyleM7655copyp1EtxEg$default6 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(20), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnit2.getSp(0.15d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default6 = textStyle6;
        }
        if ((i & 128) != 0) {
            textStyleM7655copyp1EtxEg$default7 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(16), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(0.15d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default7 = textStyle7;
        }
        if ((i & 256) != 0) {
            textStyleM7655copyp1EtxEg$default8 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(14), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnit2.getSp(0.1d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default8 = textStyle8;
        }
        if ((i & 512) != 0) {
            textStyleM7655copyp1EtxEg$default9 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(16), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(0.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default9 = textStyle9;
        }
        if ((i & 1024) != 0) {
            textStyleM7655copyp1EtxEg$default10 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(14), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(0.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(20), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default10 = textStyle10;
        }
        if ((i & 2048) != 0) {
            textStyleM7655copyp1EtxEg$default11 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(14), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnit2.getSp(1.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default11 = textStyle11;
        }
        if ((i & 4096) != 0) {
            textStyleM7655copyp1EtxEg$default12 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(12), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(0.4d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default12 = textStyle12;
        }
        if ((i & 8192) != 0) {
            textStyleM7655copyp1EtxEg$default13 = TextStyle.m7655copyp1EtxEg$default(Typography2.getDefaultTextStyle(), 0L, TextUnit2.getSp(10), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(1.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnit2.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM7655copyp1EtxEg$default13 = textStyle13;
        }
        this(fontFamily2, textStyleM7655copyp1EtxEg$default, textStyleM7655copyp1EtxEg$default2, textStyleM7655copyp1EtxEg$default3, textStyleM7655copyp1EtxEg$default4, textStyleM7655copyp1EtxEg$default5, textStyleM7655copyp1EtxEg$default6, textStyleM7655copyp1EtxEg$default7, textStyleM7655copyp1EtxEg$default8, textStyleM7655copyp1EtxEg$default9, textStyleM7655copyp1EtxEg$default10, textStyleM7655copyp1EtxEg$default11, textStyleM7655copyp1EtxEg$default12, textStyleM7655copyp1EtxEg$default13);
    }

    public Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this(Typography2.withDefaultFontFamily(textStyle, fontFamily), Typography2.withDefaultFontFamily(textStyle2, fontFamily), Typography2.withDefaultFontFamily(textStyle3, fontFamily), Typography2.withDefaultFontFamily(textStyle4, fontFamily), Typography2.withDefaultFontFamily(textStyle5, fontFamily), Typography2.withDefaultFontFamily(textStyle6, fontFamily), Typography2.withDefaultFontFamily(textStyle7, fontFamily), Typography2.withDefaultFontFamily(textStyle8, fontFamily), Typography2.withDefaultFontFamily(textStyle9, fontFamily), Typography2.withDefaultFontFamily(textStyle10, fontFamily), Typography2.withDefaultFontFamily(textStyle11, fontFamily), Typography2.withDefaultFontFamily(textStyle12, fontFamily), Typography2.withDefaultFontFamily(textStyle13, fontFamily));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.areEqual(this.h1, typography.h1) && Intrinsics.areEqual(this.h2, typography.h2) && Intrinsics.areEqual(this.h3, typography.h3) && Intrinsics.areEqual(this.h4, typography.h4) && Intrinsics.areEqual(this.h5, typography.h5) && Intrinsics.areEqual(this.h6, typography.h6) && Intrinsics.areEqual(this.subtitle1, typography.subtitle1) && Intrinsics.areEqual(this.subtitle2, typography.subtitle2) && Intrinsics.areEqual(this.body1, typography.body1) && Intrinsics.areEqual(this.body2, typography.body2) && Intrinsics.areEqual(this.button, typography.button) && Intrinsics.areEqual(this.caption, typography.caption) && Intrinsics.areEqual(this.overline, typography.overline);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }
}
