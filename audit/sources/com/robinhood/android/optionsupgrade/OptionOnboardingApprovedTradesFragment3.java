package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.ApprovedTradesResponseMetadataDto;

/* compiled from: OptionOnboardingApprovedTradesFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u001a8\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0007¨\u0006\u0012"}, m3636d2 = {"getApprovedTradesSpreadsDrawableResId", "", "optionLevel", "Loptions_product/service/ApprovedTradesResponseMetadataDto$OptionLevelDto;", "Lcom/robinhood/android/optionsupgrade/ApprovedTradesOptionLevel;", "getApprovedTradesSpreadsColorAttrId", "getApprovedTradesLevel", "", "resources", "Landroid/content/res/Resources;", "getApprovedTradesConfirmationText", "accountDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "accountTypeInCopy", "Loptions_product/service/ApprovedTradesResponseMetadataDto$AccountTypeInCopyDto;", "Lcom/robinhood/android/optionsupgrade/ApprovedTradesAccountTypeInCopy;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingApprovedTradesFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingApprovedTradesFragment3 {

    /* compiled from: OptionOnboardingApprovedTradesFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingApprovedTradesFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApprovedTradesResponseMetadataDto.OptionLevelDto.values().length];
            try {
                iArr[ApprovedTradesResponseMetadataDto.OptionLevelDto.OPTION_LEVEL_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApprovedTradesResponseMetadataDto.OptionLevelDto.f7151L2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApprovedTradesResponseMetadataDto.OptionLevelDto.f7152L3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getApprovedTradesSpreadsDrawableResId(ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevel) {
        Intrinsics.checkNotNullParameter(optionLevel, "optionLevel");
        int i = WhenMappings.$EnumSwitchMapping$0[optionLevel.ordinal()];
        if (i == 1) {
            throw new IllegalStateException(("Unsupported option level: " + optionLevel).toString());
        }
        if (i == 2) {
            return C11048R.drawable.svg_ic_close_18dp;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C11048R.drawable.svg_ic_check_18dp;
    }

    public static final int getApprovedTradesSpreadsColorAttrId(ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevel) {
        Intrinsics.checkNotNullParameter(optionLevel, "optionLevel");
        int i = WhenMappings.$EnumSwitchMapping$0[optionLevel.ordinal()];
        if (i == 1) {
            throw new IllegalStateException(("Unsupported option level: " + optionLevel).toString());
        }
        if (i == 2) {
            return C20690R.attr.colorNegative;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C20690R.attr.colorPositive;
    }

    public static final String getApprovedTradesLevel(ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevel, Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(optionLevel, "optionLevel");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i2 = WhenMappings.$EnumSwitchMapping$0[optionLevel.ordinal()];
        if (i2 == 2) {
            i = C25121R.string.options_upgrade_confirmation_level_2;
        } else if (i2 == 3) {
            i = C25121R.string.option_upgrade_confirmation_level_3;
        } else {
            Preconditions.INSTANCE.failUnknownEnumKotlin(optionLevel);
            throw new ExceptionsH();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getApprovedTradesConfirmationText(Resources resources, DisplayName accountDisplayName, ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto accountTypeInCopy, CountryCode.Supported locality, ApprovedTradesResponseMetadataDto.OptionLevelDto optionLevel) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountDisplayName, "accountDisplayName");
        Intrinsics.checkNotNullParameter(accountTypeInCopy, "accountTypeInCopy");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(optionLevel, "optionLevel");
        if (locality.isRhsg()) {
            String string2 = resources.getString(C25121R.string.option_upgrade_confirmation_detail_success_sg);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (accountTypeInCopy == ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.NONE || accountTypeInCopy == ApprovedTradesResponseMetadataDto.AccountTypeInCopyDto.ACCOUNT_TYPE_UNSPECIFIED) {
            String string3 = resources.getString(C25121R.string.option_upgrade_confirmation_detail_success_new, getApprovedTradesLevel(optionLevel, resources));
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        String string4 = resources.getString(C25121R.string.option_upgrade_confirmation_detail_success_with_account_type, getApprovedTradesLevel(optionLevel, resources), accountDisplayName.getWithAccount().getInSentence().getText(resources));
        Intrinsics.checkNotNull(string4);
        return string4;
    }
}
