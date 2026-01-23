package com.robinhood.android.transfers.international.p266ui.util;

import com.robinhood.rosetta.eventlogging.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Moneys.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toRosettaMoney", "Lcom/robinhood/rosetta/eventlogging/Money;", "Lcom/robinhood/models/util/Money;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.util.MoneysKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Moneys3 {
    public static final Money toRosettaMoney(com.robinhood.models.util.Money money) {
        Intrinsics.checkNotNullParameter(money, "<this>");
        String plainString = money.getDecimalValue().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new Money(plainString, Currency2.toRosettaCurrency(money.getCurrency()), null, null, 12, null);
    }
}
