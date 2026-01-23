package com.robinhood.android.common.recurring.date;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import com.robinhood.utils.extensions.Intents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: RecurringDatePickerResultContract.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/date/RecurringDatePickerResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/robinhood/android/common/recurring/date/RecurringDatePickerArgs;", "j$/time/LocalDate", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/robinhood/android/common/recurring/date/RecurringDatePickerArgs;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lj$/time/LocalDate;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringDatePickerResultContract extends ActivityResultContract<RecurringDatePickerArgs, LocalDate> {
    public static final RecurringDatePickerResultContract INSTANCE = new RecurringDatePickerResultContract();
    public static final int $stable = 8;

    private RecurringDatePickerResultContract() {
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, RecurringDatePickerArgs input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return RecurringDatePickerActivity.INSTANCE.getIntent(context, input.getSelectedDate(), input.isCrypto());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public LocalDate parseResult(int resultCode, Intent intent) {
        if (intent != null) {
            return (LocalDate) Intents.getSerializable(intent, RecurringDatePickerActivity.ARG_SELECTED_DATE);
        }
        return null;
    }
}
