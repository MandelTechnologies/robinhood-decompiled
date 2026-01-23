package com.robinhood.android.optionsupgrade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOnboardingStyles.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0007J\u0006\u0010\f\u001a\u00020\rj\u0002\b\u0004j\u0002\b\u0005¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "", "<init>", "(Ljava/lang/String;I)V", "INDIVIDUAL", "RETIREMENT", "getComposeColor", "Landroidx/compose/ui/graphics/Color;", "getComposeColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getAttrColorId", "", "useLightStatusBar", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingStyle, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingStyles {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOnboardingStyles[] $VALUES;
    public static final OptionOnboardingStyles INDIVIDUAL = new OptionOnboardingStyles("INDIVIDUAL", 0);
    public static final OptionOnboardingStyles RETIREMENT = new OptionOnboardingStyles("RETIREMENT", 1);

    /* compiled from: OptionOnboardingStyles.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingStyle$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOnboardingStyles.values().length];
            try {
                iArr[OptionOnboardingStyles.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOnboardingStyles.RETIREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OptionOnboardingStyles[] $values() {
        return new OptionOnboardingStyles[]{INDIVIDUAL, RETIREMENT};
    }

    public static EnumEntries<OptionOnboardingStyles> getEntries() {
        return $ENTRIES;
    }

    private OptionOnboardingStyles(String str, int i) {
    }

    static {
        OptionOnboardingStyles[] optionOnboardingStylesArr$values = $values();
        $VALUES = optionOnboardingStylesArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOnboardingStylesArr$values);
    }

    /* renamed from: getComposeColor-WaAFU9c, reason: not valid java name */
    public final long m17424getComposeColorWaAFU9c(Composer composer, int i) {
        long ion;
        composer.startReplaceGroup(-1805184697);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1805184697, i, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingStyle.getComposeColor (OptionOnboardingStyles.kt:45)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(384297610);
            ion = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIon();
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(384295871);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(384299147);
            ion = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getJade();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return ion;
    }

    public final int getAttrColorId() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return C13997R.attr.paletteColorIon;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C13997R.attr.paletteColorJade;
    }

    public final boolean useLightStatusBar() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static OptionOnboardingStyles valueOf(String str) {
        return (OptionOnboardingStyles) Enum.valueOf(OptionOnboardingStyles.class, str);
    }

    public static OptionOnboardingStyles[] values() {
        return (OptionOnboardingStyles[]) $VALUES.clone();
    }
}
