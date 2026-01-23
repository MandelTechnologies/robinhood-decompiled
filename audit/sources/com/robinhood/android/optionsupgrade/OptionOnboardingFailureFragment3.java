package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import options_product.service.FailureResponseMetadataDto;

/* compiled from: OptionOnboardingFailureFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0007\u001a.\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a6\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a.\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0014\u0010\u0011\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0007¨\u0006\u0013"}, m3636d2 = {"getFailureTitle", "", "resources", "Landroid/content/res/Resources;", "type", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "Lcom/robinhood/android/optionsupgrade/FailureType;", "getFailureMessage", "", "messageOverride", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getFailurePositiveButtonText", "primaryCtaOverride", "source", "Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "getFailureNegativeButtonText", "showLoadingSpinnerOnNegativeButton", "", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingFailureFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingFailureFragment3 {

    /* compiled from: OptionOnboardingFailureFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingFailureFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FailureResponseMetadataDto.FailureTypeDto.values().length];
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.FAILURE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.HARD_REJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.L2_TO_L3_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_IP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_RETRY_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_V2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_MANUAL_REVIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_BOTH_MANUAL_REVIEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_BOTH_L2_MANUAL_REVIEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_L2_MANUAL_REVIEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.MANUAL_REVIEW_L2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.MANUAL_REVIEW_L3.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_COOWNER_MANUAL_REVIEW.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.PENDING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.PROFESSIONAL_TRADER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_NOT_ELIGIBLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_L2_NOT_ELIGIBLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.RHSG_CAR_FAILURE_RETRY_AVAILABLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.IN_REVIEW_NO_ACTION.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getFailureTitle(Resources resources, FailureResponseMetadataDto.FailureTypeDto type2) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type2, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                throw new IllegalStateException("Invalid failure type");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                String string2 = resources.getString(C25121R.string.options_upgrade_failure_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 8:
            case 9:
            case 10:
                String string3 = resources.getString(C25121R.string.option_in_joint_account_failure_manual_reviews_title);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 11:
            case 12:
            case 13:
                String string4 = resources.getString(C25121R.string.options_upgrade_failure_manual_review_title);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 14:
            case 15:
                String string5 = resources.getString(C25121R.string.option_upgrade_status_pending_title);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 16:
                String string6 = resources.getString(C25121R.string.option_upgrade_status_denied_professional_title);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 17:
            case 18:
            case 19:
                String string7 = resources.getString(C25121R.string.options_upgrade_failure_car_title);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 20:
                String string8 = resources.getString(C25121R.string.option_upgrade_status_in_review_no_action_title);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CharSequence getFailureMessage(Resources resources, FailureResponseMetadataDto.FailureTypeDto type2, String str, CountryCode.Supported locality) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        if (str != null && !StringsKt.isBlank(str)) {
            return str;
        }
        boolean zAreEqual = Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE);
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                throw new IllegalStateException("Invalid failure type");
            case 2:
                return "";
            case 3:
                String string2 = resources.getString(C25121R.string.options_upgrade_failure_summary);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 4:
            case 7:
                String string3 = resources.getString(C25121R.string.option_upgrade_status_denied_suitability_detail);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 5:
                String string4 = resources.getString(C25121R.string.option_upgrade_status_ip_failed_detail);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 6:
                String string5 = resources.getString(C25121R.string.options_upgrade_failure_retry_available_summary);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 8:
                CharSequence text = resources.getText(C25121R.string.option_in_joint_account_ja_manual_review);
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                return text;
            case 9:
                CharSequence text2 = resources.getText(C25121R.string.option_in_joint_account_ja_both_manual_review);
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                return text2;
            case 10:
                CharSequence text3 = resources.getText(C25121R.string.option_in_joint_account_ja_both_l2_manual_review);
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                return text3;
            case 11:
                CharSequence text4 = resources.getText(C25121R.string.option_in_joint_account_ja_l2_manual_review);
                Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                return text4;
            case 12:
                if (zAreEqual) {
                    CharSequence text5 = resources.getText(C25121R.string.option_upgrade_status_manual_review_level_2_detail_uk);
                    Intrinsics.checkNotNull(text5);
                    return text5;
                }
                CharSequence text6 = resources.getText(C25121R.string.option_upgrade_status_manual_review_level_2_detail);
                Intrinsics.checkNotNull(text6);
                return text6;
            case 13:
                if (zAreEqual) {
                    CharSequence text7 = resources.getText(C25121R.string.option_upgrade_status_manual_review_level_3_detail_uk);
                    Intrinsics.checkNotNull(text7);
                    return text7;
                }
                CharSequence text8 = resources.getText(C25121R.string.option_upgrade_status_manual_review_level_3_detail);
                Intrinsics.checkNotNull(text8);
                return text8;
            case 14:
                String string6 = resources.getString(C25121R.string.option_in_joint_account_ja_coowner_manual_review);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 15:
                String string7 = resources.getString(C25121R.string.option_upgrade_status_pending_detail);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 16:
                String string8 = resources.getString(C25121R.string.option_upgrade_status_denied_professional_detail);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 17:
                String string9 = resources.getString(C25121R.string.option_in_joint_account_ja_not_eligible);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case 18:
                String string10 = resources.getString(C25121R.string.option_in_joint_account_ja_l2_not_eligible);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case 19:
                String string11 = resources.getString(C25121R.string.options_upgrade_failure_car_summary);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case 20:
                CharSequence text9 = resources.getText(C25121R.string.option_upgrade_status_manual_review_no_action);
                Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
                return text9;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getFailurePositiveButtonText(Resources resources, FailureResponseMetadataDto.FailureTypeDto type2, String str, CountryCode.Supported locality, OptionOnboarding.OptionOnboardingSource source) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(source, "source");
        if (str != null && !StringsKt.isBlank(str)) {
            return str;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                throw new IllegalStateException("Invalid failure type");
            case 2:
            case 15:
            case 16:
            case 18:
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE) || locality.isRhsg()) {
                    String string2 = resources.getString(C11048R.string.general_label_okay);
                    Intrinsics.checkNotNull(string2);
                    return string2;
                }
                String string3 = resources.getString(C11048R.string.general_label_dismiss);
                Intrinsics.checkNotNull(string3);
                return string3;
            case 3:
                String string4 = resources.getString(C25121R.string.options_upgrade_failure_view_profile);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = resources.getString(C11048R.string.general_action_learn_more);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = resources.getString(C25121R.string.options_upgrade_failure_ip_failure);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 6:
            case 19:
                String string7 = resources.getString(C25121R.string.options_upgrade_failure_retry);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = resources.getString(C11048R.string.general_label_okay);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE) || locality.isRhsg()) {
                    String string9 = resources.getString(C25121R.string.option_upgrade_status_schedule_call_btn_gb_or_apac);
                    Intrinsics.checkNotNull(string9);
                    return string9;
                }
                String string10 = resources.getString(C25121R.string.option_upgrade_status_schedule_call_btn);
                Intrinsics.checkNotNull(string10);
                return string10;
            case 14:
            case 17:
                if (source.isFromAcatsJointAccount()) {
                    String string11 = resources.getString(C25121R.string.f4823x3f4aa8e3);
                    Intrinsics.checkNotNull(string11);
                    return string11;
                }
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE) || locality.isRhsg()) {
                    String string12 = resources.getString(C11048R.string.general_label_okay);
                    Intrinsics.checkNotNull(string12);
                    return string12;
                }
                String string13 = resources.getString(C11048R.string.general_label_dismiss);
                Intrinsics.checkNotNull(string13);
                return string13;
            case 20:
                String string14 = resources.getString(C11048R.string.general_label_got_it);
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                return string14;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getFailureNegativeButtonText(Resources resources, FailureResponseMetadataDto.FailureTypeDto type2, CountryCode.Supported locality, OptionOnboarding.OptionOnboardingSource source) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(source, "source");
        CountryCode.Supported.UnitedKingdom unitedKingdom = CountryCode.Supported.UnitedKingdom.INSTANCE;
        boolean z = Intrinsics.areEqual(locality, unitedKingdom) || locality.isRhsg();
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
            case 2:
            case 7:
            case 15:
            case 16:
            case 20:
                return null;
            case 3:
            case 4:
            case 5:
                if (z) {
                    return resources.getString(C11048R.string.general_label_ok);
                }
                return resources.getString(C11048R.string.general_label_dismiss);
            case 6:
                if (Intrinsics.areEqual(locality, unitedKingdom)) {
                    return resources.getString(C11048R.string.general_label_okay);
                }
                return resources.getString(C11048R.string.general_label_got_it);
            case 8:
            case 9:
            case 10:
            case 11:
            case 18:
                if (source.isFromAcatsJointAccount()) {
                    return resources.getString(C25121R.string.f4823x3f4aa8e3);
                }
                if (z) {
                    return resources.getString(C11048R.string.general_label_close);
                }
                return resources.getString(C11048R.string.general_label_dismiss);
            case 12:
            case 13:
                if (z) {
                    return resources.getString(C11048R.string.general_label_close);
                }
                return resources.getString(C11048R.string.general_label_dismiss);
            case 14:
            case 17:
                if (source.isFromAcatsJointAccount()) {
                    return resources.getString(C25121R.string.f4822xeda8c73c);
                }
                return null;
            case 19:
                return resources.getString(C25121R.string.options_upgrade_failure_car_cta_label);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean showLoadingSpinnerOnNegativeButton(FailureResponseMetadataDto.FailureTypeDto type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
        }
        return false;
    }
}
