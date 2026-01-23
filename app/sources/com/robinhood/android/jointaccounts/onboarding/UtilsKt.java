package com.robinhood.android.jointaccounts.onboarding;

import android.content.Intent;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\n\u001a\u00020\b*\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, m3636d2 = {"takeMostRelevantState", "Lcom/robinhood/store/AsyncResult;", "T", "incoming", "shareData", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "content", "", "emailSubject", "applyAccountNumberTemplate", "accountNumber", "feature-joint-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> AsyncResult<T> takeMostRelevantState(AsyncResult<? extends T> asyncResult, AsyncResult<? extends T> incoming) {
        Intrinsics.checkNotNullParameter(asyncResult, "<this>");
        Intrinsics.checkNotNullParameter(incoming, "incoming");
        return (!(incoming instanceof AsyncResult.Success) && (asyncResult instanceof AsyncResult.Success)) ? asyncResult : incoming;
    }

    public static final void shareData(BaseFragment baseFragment, String content, String emailSubject) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(emailSubject, "emailSubject");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", content);
        intent.putExtra("android.intent.extra.SUBJECT", emailSubject);
        intent.setType("text/plain");
        baseFragment.startActivity(Intent.createChooser(intent, null));
    }

    public static final String applyAccountNumberTemplate(String str, String accountNumber) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return StringsKt.replace$default(str, "{account_number}", accountNumber, false, 4, (Object) null);
    }
}
