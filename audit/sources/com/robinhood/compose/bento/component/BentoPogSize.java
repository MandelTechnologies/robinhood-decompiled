package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.PogStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BentoPog.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogSize;", "", "sizeDp", "Landroidx/compose/ui/unit/Dp;", "horizontalTextPadding", "maxLines", "", "<init>", "(Ljava/lang/String;IFFI)V", "getSizeDp-D9Ej5fM", "()F", "F", "getHorizontalTextPadding-D9Ej5fM", "getMaxLines", "()I", "ExtraSmall", "Standard", "Hero", "ExtraLarge", "Number", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoPogSize {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BentoPogSize[] $VALUES;
    public static final BentoPogSize ExtraLarge;
    public static final BentoPogSize ExtraSmall;
    public static final BentoPogSize Hero;
    public static final BentoPogSize Number;
    public static final BentoPogSize Standard;
    private final float horizontalTextPadding;
    private final int maxLines;
    private final float sizeDp;

    /* compiled from: BentoPog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoPogSize.values().length];
            try {
                iArr[BentoPogSize.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoPogSize.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BentoPogSize.Hero.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BentoPogSize.ExtraLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BentoPogSize.ExtraSmall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ BentoPogSize[] $values() {
        return new BentoPogSize[]{ExtraSmall, Standard, Hero, ExtraLarge, Number};
    }

    public static EnumEntries<BentoPogSize> getEntries() {
        return $ENTRIES;
    }

    private BentoPogSize(String str, int i, float f, float f2, int i2) {
        this.sizeDp = f;
        this.horizontalTextPadding = f2;
        this.maxLines = i2;
    }

    /* synthetic */ BentoPogSize(String str, int i, float f, float f2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, f, f2, (i3 & 4) != 0 ? 2 : i2);
    }

    /* renamed from: getSizeDp-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSizeDp() {
        return this.sizeDp;
    }

    /* renamed from: getHorizontalTextPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalTextPadding() {
        return this.horizontalTextPadding;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    static {
        BentoPogDefaults bentoPogDefaults = BentoPogDefaults.INSTANCE;
        ExtraSmall = new BentoPogSize("ExtraSmall", 0, bentoPogDefaults.m20666getExtraSmallPogSizeD9Ej5fM(), bentoPogDefaults.m20667getExtraSmallTextPogPaddingHorizontalD9Ej5fM(), 1);
        Standard = new BentoPogSize("Standard", 1, bentoPogDefaults.m20672getStandardPogSizeD9Ej5fM(), bentoPogDefaults.m20673getStandardTextPogPaddingHorizontalD9Ej5fM(), 0, 4, null);
        Hero = new BentoPogSize("Hero", 2, bentoPogDefaults.m20668getHeroPogSizeD9Ej5fM(), bentoPogDefaults.m20669getHeroTextPogPaddingHorizontalD9Ej5fM(), 0, 4, null);
        ExtraLarge = new BentoPogSize("ExtraLarge", 3, bentoPogDefaults.m20664getExtraLargePogSizeD9Ej5fM(), bentoPogDefaults.m20665getExtraLargeTextPogPaddingHorizontalD9Ej5fM(), 0, 4, null);
        Number = new BentoPogSize("Number", 4, bentoPogDefaults.m20670getNumberPogSizeDpD9Ej5fM(), bentoPogDefaults.m20671getNumberPoghorizontalPaddingD9Ej5fM(), 0, 4, null);
        BentoPogSize[] bentoPogSizeArr$values = $values();
        $VALUES = bentoPogSizeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(bentoPogSizeArr$values);
    }

    public final TextStyle textStyle(Composer composer, int i) {
        TextStyle standard;
        composer.startReplaceGroup(-386010811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-386010811, i, -1, "com.robinhood.compose.bento.component.BentoPogSize.textStyle (BentoPog.kt:345)");
        }
        PogStyle.PogTextStyle textStyle = ((Styles) composer.consume(Styles2.getLocalStyles())).getPog(composer, 0).getTextStyle();
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1 || i2 == 2) {
            standard = textStyle.getStandard();
        } else if (i2 == 3) {
            standard = textStyle.getHero();
        } else if (i2 == 4) {
            standard = textStyle.getExtraLarge();
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            standard = textStyle.getExtraSmall();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return standard;
    }

    public static BentoPogSize valueOf(String str) {
        return (BentoPogSize) Enum.valueOf(BentoPogSize.class, str);
    }

    public static BentoPogSize[] values() {
        return (BentoPogSize[]) $VALUES.clone();
    }
}
