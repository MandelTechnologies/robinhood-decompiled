package com.stripe.android.view;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BecsDebitMandateAcceptanceTextFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "", "companyName", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BecsDebitMandateAcceptanceTextFactory {
    private final Context context;

    public BecsDebitMandateAcceptanceTextFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final CharSequence create(String companyName) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        String string2 = this.context.getString(R$string.stripe_becs_mandate_acceptance, companyName);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Spanned spannedFromHtml = Html.fromHtml(string2, 0);
        Intrinsics.checkNotNull(spannedFromHtml);
        return spannedFromHtml;
    }
}
