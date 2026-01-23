package com.robinhood.android.optionsupgrade;

import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOnboardingEducationSpreadFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/SpreadResource;", "", "descriptionResId", "", "dayLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "nightLottieUrl", "<init>", "(Ljava/lang/String;IILcom/robinhood/shared/remote/assets/LottieUrl;Lcom/robinhood/shared/remote/assets/LottieUrl;)V", "getDescriptionResId", "()I", "getDayLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getNightLottieUrl", "VERTICAL", "HORIZONTAL", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.SpreadResource, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingEducationSpreadFragment4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOnboardingEducationSpreadFragment4[] $VALUES;
    private final LottieUrl dayLottieUrl;
    private final int descriptionResId;
    private final LottieUrl nightLottieUrl;
    public static final OptionOnboardingEducationSpreadFragment4 VERTICAL = new OptionOnboardingEducationSpreadFragment4("VERTICAL", 0, C25121R.string.options_upgrade_comparison_vertical_description, LottieUrl.VERTICAL_SPREAD_DAY, LottieUrl.VERTICAL_SPREAD_NIGHT);
    public static final OptionOnboardingEducationSpreadFragment4 HORIZONTAL = new OptionOnboardingEducationSpreadFragment4("HORIZONTAL", 1, C25121R.string.options_upgrade_comparison_horizontal_description, LottieUrl.HORIZONTAL_SPREAD_DAY, LottieUrl.HORIZONTAL_SPREAD_NIGHT);

    private static final /* synthetic */ OptionOnboardingEducationSpreadFragment4[] $values() {
        return new OptionOnboardingEducationSpreadFragment4[]{VERTICAL, HORIZONTAL};
    }

    public static EnumEntries<OptionOnboardingEducationSpreadFragment4> getEntries() {
        return $ENTRIES;
    }

    private OptionOnboardingEducationSpreadFragment4(String str, int i, int i2, LottieUrl lottieUrl, LottieUrl lottieUrl2) {
        this.descriptionResId = i2;
        this.dayLottieUrl = lottieUrl;
        this.nightLottieUrl = lottieUrl2;
    }

    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    public final LottieUrl getDayLottieUrl() {
        return this.dayLottieUrl;
    }

    public final LottieUrl getNightLottieUrl() {
        return this.nightLottieUrl;
    }

    static {
        OptionOnboardingEducationSpreadFragment4[] optionOnboardingEducationSpreadFragment4Arr$values = $values();
        $VALUES = optionOnboardingEducationSpreadFragment4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOnboardingEducationSpreadFragment4Arr$values);
    }

    public static OptionOnboardingEducationSpreadFragment4 valueOf(String str) {
        return (OptionOnboardingEducationSpreadFragment4) Enum.valueOf(OptionOnboardingEducationSpreadFragment4.class, str);
    }

    public static OptionOnboardingEducationSpreadFragment4[] values() {
        return (OptionOnboardingEducationSpreadFragment4[]) $VALUES.clone();
    }
}
