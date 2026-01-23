package com.robinhood.android.investFlow.utils;

import com.robinhood.android.ach.format.BankAccountTypes;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetAccountStringResource.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"getAccountStringResource", "Lcom/robinhood/utils/resource/StringResource$Join;", "Lcom/robinhood/models/db/AchRelationship;", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.utils.GetAccountStringResourceKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GetAccountStringResource {
    public static final StringResource.Join getAccountStringResource(AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        return new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{companion.invoke(BankAccountTypes.getLabelResId(achRelationship.getBankAccountType()), new Object[0]), companion.invoke(C19349R.string.invest_flow_payment_method_account_desc_sep, new Object[0]), companion.invoke(achRelationship.getBankAccountNumber())}), PlaceholderUtils.XXShortPlaceholderText);
    }
}
