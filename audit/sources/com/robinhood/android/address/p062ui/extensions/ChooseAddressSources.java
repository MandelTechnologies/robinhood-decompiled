package com.robinhood.android.address.p062ui.extensions;

import com.robinhood.android.address.p062ui.C8360R;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseAddressSources.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0018\u0010\u000b\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m3636d2 = {OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "getTitleRes", "(Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;)I", "hintRes", "getHintRes", "fallbackRes", "getFallbackRes", "disclaimerRes", "getDisclaimerRes", "addressPromptRes", "getAddressPromptRes", "tag", "", "getTag", "(Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;)Ljava/lang/String;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "feature-address_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.address.ui.extensions.ChooseAddressSourcesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class ChooseAddressSources {

    /* compiled from: ChooseAddressSources.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.address.ui.extensions.ChooseAddressSourcesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChooseAddressSource.values().length];
            try {
                iArr[ChooseAddressSource.CASH_MANAGEMENT_RESIDENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChooseAddressSource.SETTINGS_MODIFY_RESIDENTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChooseAddressSource.CASH_MANAGEMENT_SHIPPING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChooseAddressSource.CASH_MANAGEMENT_PAY_BY_CHECK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChooseAddressSource.SETTINGS_TRUSTED_CONTACT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getTitleRes(ChooseAddressSource chooseAddressSource) {
        Intrinsics.checkNotNullParameter(chooseAddressSource, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[chooseAddressSource.ordinal()];
        if (i == 1 || i == 2) {
            return C8360R.string.residential_address_title;
        }
        if (i == 3 || i == 4 || i == 5) {
            return C8360R.string.mailing_address_title;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getHintRes(ChooseAddressSource chooseAddressSource) {
        Intrinsics.checkNotNullParameter(chooseAddressSource, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[chooseAddressSource.ordinal()];
        if (i == 1 || i == 2) {
            return C8360R.string.residential_address_hint;
        }
        if (i == 3) {
            return C8360R.string.mailing_address_hint;
        }
        if (i == 4) {
            return C8360R.string.payee_address_hint;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C8360R.string.trusted_contact_hint;
    }

    public static final int getFallbackRes(ChooseAddressSource chooseAddressSource) {
        Intrinsics.checkNotNullParameter(chooseAddressSource, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[chooseAddressSource.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return C8360R.string.address_not_found_action;
        }
        if (i == 4 || i == 5) {
            return C8360R.string.payee_address_not_found;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getDisclaimerRes(ChooseAddressSource chooseAddressSource) {
        Intrinsics.checkNotNullParameter(chooseAddressSource, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[chooseAddressSource.ordinal()];
        if (i == 1) {
            return C8360R.string.cash_management_residential_disclaimer;
        }
        if (i == 2 || i == 3 || i == 4) {
            return C8360R.string.address_disclaimer;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C8360R.string.trusted_contact_empty_disclaimer;
    }

    private static final int getAddressPromptRes(ChooseAddressSource chooseAddressSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[chooseAddressSource.ordinal()];
        if (i == 1 || i == 2) {
            return C8360R.string.required_information_disclaimer;
        }
        if (i == 3) {
            return C8360R.string.cash_management_mailing_manual_prompt;
        }
        if (i == 4) {
            return C8360R.string.payee_manual_prompt;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C8360R.string.trusted_contact_prompt;
    }

    public static final String getTag(ChooseAddressSource chooseAddressSource) {
        Intrinsics.checkNotNullParameter(chooseAddressSource, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[chooseAddressSource.ordinal()];
        if (i == 1) {
            return "cash_management_residential";
        }
        if (i == 2) {
            return "settings_modify_residential";
        }
        if (i == 3) {
            return "cash_management_shipping";
        }
        if (i == 4) {
            return "cash_management_pay_by_check";
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return "trusted_contact_address";
    }

    public static final int getAddressPromptRes(ChooseAddressSource chooseAddressSource, CountryCode.Supported locality) {
        Intrinsics.checkNotNullParameter(chooseAddressSource, "<this>");
        Intrinsics.checkNotNullParameter(locality, "locality");
        if (chooseAddressSource == ChooseAddressSource.SETTINGS_TRUSTED_CONTACT) {
            if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                return getAddressPromptRes(chooseAddressSource);
            }
            return C8360R.string.trusted_contact_prompt_uk;
        }
        return getAddressPromptRes(chooseAddressSource);
    }
}
