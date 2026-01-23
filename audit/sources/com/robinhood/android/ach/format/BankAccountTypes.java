package com.robinhood.android.ach.format;

import android.content.res.Resources;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankAccountTypes.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "getLabelResId", "(Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;)I", "getTypeAndLastFourDisplayString", "", "resources", "Landroid/content/res/Resources;", "accountLastFour", "getTypeAndLastFourDisplayStringResource", "Lcom/robinhood/utils/resource/StringResource;", "lib-utils-ach-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ach.format.BankAccountTypesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class BankAccountTypes {

    /* compiled from: BankAccountTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.ach.format.BankAccountTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAchRelationship.BankAccountType.values().length];
            try {
                iArr[ApiAchRelationship.BankAccountType.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAchRelationship.BankAccountType.SAVINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAchRelationship.BankAccountType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getLabelResId(ApiAchRelationship.BankAccountType bankAccountType) {
        Intrinsics.checkNotNullParameter(bankAccountType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()];
        if (i == 1) {
            return C8331R.string.ach_relationship_bank_account_type_checking;
        }
        if (i == 2) {
            return C8331R.string.ach_relationship_bank_account_type_savings;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C8331R.string.ach_relationship_bank_account_type_unknown;
    }

    public static final String getTypeAndLastFourDisplayString(ApiAchRelationship.BankAccountType bankAccountType, Resources resources, String str) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = bankAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()];
        if (i == -1) {
            String string2 = resources.getString(C8331R.string.ach_relationship_n_a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 1) {
            String string3 = resources.getString(C8331R.string.ach_relationship_summary_checking_account, str);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i == 2) {
            String string4 = resources.getString(C8331R.string.ach_relationship_summary_savings_account, str);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String string5 = resources.getString(C8331R.string.ach_relationship_summary_unknown_account, str);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return string5;
    }

    public static final StringResource getTypeAndLastFourDisplayStringResource(ApiAchRelationship.BankAccountType bankAccountType, String str) {
        int i = bankAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()];
        if (i == -1) {
            return StringResource.INSTANCE.invoke(C8331R.string.ach_relationship_n_a, new Object[0]);
        }
        if (i == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = C8331R.string.ach_relationship_summary_checking_account;
            if (str == null) {
                str = "";
            }
            return companion.invoke(i2, str);
        }
        if (i == 2) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i3 = C8331R.string.ach_relationship_summary_savings_account;
            if (str == null) {
                str = "";
            }
            return companion2.invoke(i3, str);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion3 = StringResource.INSTANCE;
        int i4 = C8331R.string.ach_relationship_summary_unknown_account;
        if (str == null) {
            str = "";
        }
        return companion3.invoke(i4, str);
    }
}
