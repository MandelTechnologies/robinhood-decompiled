package com.robinhood.android.optionsupgrade;

import com.robinhood.android.common.options.C11303R;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingUpsellAllSetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"getOptionOnboardingUpsellAllSetImageResId", "", ResourceTypes.STYLE, "Lcom/robinhood/android/optionsupgrade/OptionOnboardingStyle;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellAllSetFragment2 {

    /* compiled from: OptionOnboardingUpsellAllSetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragmentKt$WhenMappings */
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

    public static final int getOptionOnboardingUpsellAllSetImageResId(OptionOnboardingStyles style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            return C11303R.drawable.svg_all_set_individual;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C11303R.drawable.svg_all_set_retirement;
    }
}
