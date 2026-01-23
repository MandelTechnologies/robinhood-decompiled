package com.robinhood.android.common.recurring.extension;

import android.content.res.Resources;
import com.robinhood.android.ach.format.BankAccountTypes;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.models.p320db.AchRelationship;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchRelationships.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getAccountString", "", "Lcom/robinhood/models/db/AchRelationship;", "resources", "Landroid/content/res/Resources;", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.extension.AchRelationshipsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AchRelationships2 {
    public static final String getAccountString(AchRelationship achRelationship, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C11595R.string.equity_recurring_source_of_funds_account_desc, resources.getString(BankAccountTypes.getLabelResId(achRelationship.getBankAccountType())), achRelationship.getBankAccountNumber());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
