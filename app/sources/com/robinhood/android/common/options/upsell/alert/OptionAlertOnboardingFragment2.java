package com.robinhood.android.common.options.upsell.alert;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.contracts.OptionAlertOnboardingSource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionAlertOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toAnalyticsString", "", "Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionAlertOnboardingFragment2 {

    /* compiled from: OptionAlertOnboardingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionAlertOnboardingSource.values().length];
            try {
                iArr[OptionAlertOnboardingSource.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionAlertOnboardingSource.UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toAnalyticsString(OptionAlertOnboardingSource optionAlertOnboardingSource) {
        Intrinsics.checkNotNullParameter(optionAlertOnboardingSource, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[optionAlertOnboardingSource.ordinal()];
        if (i == 1) {
            return AnalyticsStrings.SCREEN_DESCRIPTION_OPTION_ALERT_SOURCE_DEEPLINK;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AnalyticsStrings.SCREEN_DESCRIPTION_OPTION_ALERT_SOURCE_UPGRADE;
    }
}
