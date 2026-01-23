package com.robinhood.android.designsystem.style;

import com.robinhood.android.designsystem.C13997R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScarletOverlays.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013j\u0002\b\u0007j\u0002\b\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/designsystem/style/ColorScheme;", "Lcom/robinhood/scarlet/ScarletOverlay;", "", "styleResId", "", "<init>", "(Ljava/lang/String;II)V", "STANDARD", "ALTERNATE", "styleReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "priority", "getPriority", "()I", "isAccessibleAlternate", "", "()Z", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ColorScheme implements ScarletOverlay {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ColorScheme[] $VALUES;
    public static final int PRIORITY = 120;
    private final DirectResourceReference<StyleResource> styleReference;
    public static final ColorScheme STANDARD = new ColorScheme("STANDARD", 0, C13997R.style.ThemeOverlay_Robinhood_DesignSystem_ColorScheme_Standard);
    public static final ColorScheme ALTERNATE = new ColorScheme("ALTERNATE", 1, C13997R.style.ThemeOverlay_Robinhood_DesignSystem_ColorScheme_Alternate);

    /* compiled from: ScarletOverlays.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorScheme.values().length];
            try {
                iArr[ColorScheme.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorScheme.ALTERNATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ ColorScheme[] $values() {
        return new ColorScheme[]{STANDARD, ALTERNATE};
    }

    public static EnumEntries<ColorScheme> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return 120;
    }

    private ColorScheme(String str, int i, int i2) {
        this.styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, i2);
    }

    static {
        ColorScheme[] colorSchemeArr$values = $values();
        $VALUES = colorSchemeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(colorSchemeArr$values);
        INSTANCE = new Companion(null);
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public DirectResourceReference<StyleResource> getStyleReference() {
        return this.styleReference;
    }

    public final boolean isAccessibleAlternate() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static ColorScheme valueOf(String str) {
        return (ColorScheme) Enum.valueOf(ColorScheme.class, str);
    }

    public static ColorScheme[] values() {
        return (ColorScheme[]) $VALUES.clone();
    }
}
