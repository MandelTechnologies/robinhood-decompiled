package com.robinhood.android.common.recurring.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.utils.text.Spans;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringInvestmentIntroUtils.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/utils/RecurringInvestmentIntroUtils;", "", "<init>", "()V", "showDisclosureDialog", "", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "viewCustomerAgreementLink", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringInvestmentIntroUtils {
    public static final int $stable = 0;
    public static final RecurringInvestmentIntroUtils INSTANCE = new RecurringInvestmentIntroUtils();

    private RecurringInvestmentIntroUtils() {
    }

    public final void showDisclosureDialog(final Context context, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) resources.getString(C11595R.string.recurring_investment_intro_disclosure_dialog_message));
        String string2 = resources.getString(C11595R.string.recurring_investment_intro_disclosure_dialog_message_clickable);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        spannableStringBuilder.append((CharSequence) "\n");
        Spans spans = Spans.INSTANCE;
        final boolean z = false;
        final boolean z2 = true;
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.common.recurring.utils.RecurringInvestmentIntroUtils$showDisclosureDialog$lambda$1$$inlined$appendClickableSpan$default$1
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                textPaint.setColor(textPaint.linkColor);
                textPaint.setUnderlineText(z);
                if (z2) {
                    textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                }
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                RecurringInvestmentIntroUtils.INSTANCE.viewCustomerAgreementLink(context);
            }
        };
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(clickableSpan, length, spannableStringBuilder.length(), 17);
        ((RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, resources.getString(C11595R.string.recurring_investment_graph_disclosure_dialog_title), null, new SpannedString(spannableStringBuilder), null, resources.getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null))).show(fragmentManager, "recurring-investment-graph-disclosure-dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void viewCustomerAgreementLink(Context context) {
        WebUtils.viewUrl$default(context, context.getResources().getString(C11595R.string.f4047xbbbdddb0), 0, 4, (Object) null);
    }
}
