package com.robinhood.android.ach.format;

import android.content.res.Resources;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AchRelationships.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m3636d2 = {"getAchRelationshipDisplayNameResource", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/AchRelationship;", "getAchRelationshipDisplayName", "", "resources", "Landroid/content/res/Resources;", "getDisplayTitle", "displayTitleResource", "getDisplayTitleResource", "(Lcom/robinhood/models/db/AchRelationship;)Lcom/robinhood/utils/resource/StringResource;", "getTypeAndLastFourDisplayStringResource", "getTypeAndLastFourDisplayString", "lib-utils-ach-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.ach.format.AchRelationshipsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AchRelationships {
    public static final StringResource getAchRelationshipDisplayNameResource(AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        String bankAccountNickname = achRelationship.getBankAccountNickname();
        if (StringsKt.equals(Constants2.DEFAULT_BANK_ACCOUNT_NICKNAME, bankAccountNickname, true)) {
            return getTypeAndLastFourDisplayStringResource(achRelationship);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C8331R.string.ach_relationship_account_summary;
        if (bankAccountNickname == null) {
            bankAccountNickname = "";
        }
        return companion.invoke(i, bankAccountNickname, achRelationship.getBankAccountNumber());
    }

    public static final String getAchRelationshipDisplayName(AchRelationship achRelationship, Resources resources) {
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getAchRelationshipDisplayNameResource(achRelationship).getText(resources).toString();
    }

    public static final String getDisplayTitle(AchRelationship achRelationship, Resources resources) {
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String bankAccountNickname = achRelationship.getBankAccountNickname();
        return bankAccountNickname == null ? getTypeAndLastFourDisplayString(achRelationship, resources) : bankAccountNickname;
    }

    public static final StringResource getDisplayTitleResource(AchRelationship achRelationship) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        String bankAccountNickname = achRelationship.getBankAccountNickname();
        return (bankAccountNickname == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(bankAccountNickname)) == null) ? getTypeAndLastFourDisplayStringResource(achRelationship) : stringResourceInvoke;
    }

    public static final StringResource getTypeAndLastFourDisplayStringResource(AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        return BankAccountTypes.getTypeAndLastFourDisplayStringResource(achRelationship.getBankAccountType(), achRelationship.getBankAccountNumber());
    }

    public static final String getTypeAndLastFourDisplayString(AchRelationship achRelationship, Resources resources) {
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return BankAccountTypes.getTypeAndLastFourDisplayStringResource(achRelationship.getBankAccountType(), achRelationship.getBankAccountNumber()).getText(resources).toString();
    }

    public static final StringResource getTypeAndLastFourDisplayStringResource(AchRelationship achRelationship, Resources resources) {
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return StringResource.INSTANCE.invoke(getTypeAndLastFourDisplayString(achRelationship, resources));
    }
}
