package com.robinhood.android.matcha.p177ui.history.detail.request;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaRequestDetailState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/Sender;", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState;", "request", "Lcom/robinhood/models/db/matcha/MatchaRequest;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaRequest;)V", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "primaryAction", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$ButtonAction;", "getPrimaryAction", "()Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$ButtonAction;", "secondaryAction", "getSecondaryAction", "getSummaryText", "context", "Landroid/content/Context;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.history.detail.request.Sender, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaRequestDetailState5 extends MatchaRequestDetailState4 {
    public static final int $stable = 8;
    private final MatchaRequestDetailState4.ButtonAction primaryAction;
    private final MatchaRequestDetailState4.ButtonAction secondaryAction;
    private final StringResource title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaRequestDetailState5(MatchaRequest request) {
        super(request, null);
        Intrinsics.checkNotNullParameter(request, "request");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C21284R.string.matcha_request_detail_sender_subtitle;
        String displayName = request.getTransactor().getDisplayName();
        BigDecimal amount = request.getAmount();
        Currency currency = Currencies.USD;
        this.title = companion.invoke(i, displayName, Money.format$default(Money3.toMoney(amount, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        this.primaryAction = MatchaRequestDetailState2.isUnaccepted(request) ? new MatchaRequestDetailState4.ButtonAction(MatchaRequestDetailState4.Action.ACCEPT, companion.invoke(C21284R.string.matcha_request_pay_amount, Money.format$default(Money3.toMoney(request.getAmount(), currency), null, false, null, false, 0, null, false, null, false, false, 1023, null))) : null;
        this.secondaryAction = MatchaRequestDetailState2.isUnaccepted(request) ? new MatchaRequestDetailState4.ButtonAction(MatchaRequestDetailState4.Action.DECLINE, companion.invoke(C21284R.string.matcha_pending_transaction_action_decline, new Object[0])) : null;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4
    public StringResource getTitle() {
        return this.title;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4
    public MatchaRequestDetailState4.ButtonAction getPrimaryAction() {
        return this.primaryAction;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4
    public MatchaRequestDetailState4.ButtonAction getSecondaryAction() {
        return this.secondaryAction;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4
    public StringResource getSummaryText(Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        StringResource.Companion companion = StringResource.INSTANCE;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iRequireThemeAttribute = ContextsUiExtensions.requireThemeAttribute(context, C20690R.attr.textAppearanceRegularSmallBold);
        int themeColor = ThemeColors.getThemeColor(context, C20690R.attr.colorForeground2);
        Object[] objArr = {new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), new TextAppearanceSpan(context, iRequireThemeAttribute)};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) context.getString(C21284R.string.matcha_transfer_summary_label));
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
        spannableStringBuilder.append('\n');
        Object[] objArr2 = {new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), new ForegroundColorSpan(themeColor)};
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) context.getString(C21284R.string.matcha_request_detail_sender_summary, getRequest().getTransactor().getDisplayName(), Money.format$default(Money3.toMoney(getRequest().getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
        for (int i2 = 0; i2 < 2; i2++) {
            spannableStringBuilder.setSpan(objArr2[i2], length2, spannableStringBuilder.length(), 17);
        }
        StringResource stringResourceInvoke = companion.invoke(new SpannedString(spannableStringBuilder));
        if (MatchaRequestDetailState2.isUnaccepted(getRequest())) {
            return stringResourceInvoke;
        }
        return null;
    }
}
