package com.robinhood.android.settings.p254ui.recurring.detail;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/BackupPaymentRowState;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "bold", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Z)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getBold", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BackupPaymentRowState {
    public static final int $stable = StringResource.$stable;
    private final boolean bold;
    private final StringResource text;

    public static /* synthetic */ BackupPaymentRowState copy$default(BackupPaymentRowState backupPaymentRowState, StringResource stringResource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = backupPaymentRowState.text;
        }
        if ((i & 2) != 0) {
            z = backupPaymentRowState.bold;
        }
        return backupPaymentRowState.copy(stringResource, z);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBold() {
        return this.bold;
    }

    public final BackupPaymentRowState copy(StringResource text, boolean bold) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new BackupPaymentRowState(text, bold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupPaymentRowState)) {
            return false;
        }
        BackupPaymentRowState backupPaymentRowState = (BackupPaymentRowState) other;
        return Intrinsics.areEqual(this.text, backupPaymentRowState.text) && this.bold == backupPaymentRowState.bold;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + Boolean.hashCode(this.bold);
    }

    public String toString() {
        return "BackupPaymentRowState(text=" + this.text + ", bold=" + this.bold + ")";
    }

    public BackupPaymentRowState(StringResource text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.bold = z;
    }

    public final StringResource getText() {
        return this.text;
    }

    public final boolean getBold() {
        return this.bold;
    }
}
