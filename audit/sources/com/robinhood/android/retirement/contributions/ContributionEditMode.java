package com.robinhood.android.retirement.contributions;

import android.view.KeyEvent;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import java.math.BigDecimal;
import kotlin.Metadata;
import p479j$.time.Year;

/* compiled from: ContributionEditMode.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionEditCallbacks;", "", "Ljava/math/BigDecimal;", "amount", "j$/time/Year", "taxYear", "", "onUntilMaxClicked", "(Ljava/math/BigDecimal;Lj$/time/Year;)V", "Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;", "chip", "onChipPressed", "(Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;)V", "onEditContinueClicked", "()V", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "event", "onKeyPressed", "(Landroid/view/KeyEvent;)V", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contributions.ContributionEditCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
public interface ContributionEditMode {
    void onChipPressed(KeypadChip chip);

    void onEditContinueClicked();

    void onKeyPressed(KeyEvent event);

    void onUntilMaxClicked(BigDecimal amount, Year taxYear);
}
