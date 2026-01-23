package com.robinhood.android.transfers.p271ui.updaterecurring;

import com.robinhood.android.transfers.C30065R;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferFrequencyRowItem.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/updaterecurring/TransferFrequencyRowItem;", "", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "title", "", "description", "occurrenceLabel", "<init>", "(Ljava/lang/String;ILcom/robinhood/models/api/bonfire/TransferFrequency;III)V", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getTitle", "()I", "getDescription", "getOccurrenceLabel", "WEEKLY", "BIWEEKLY", "MONTHLY", "QUARTERLY", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferFrequencyRowItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferFrequencyRowItem[] $VALUES;
    private final int description;
    private final ApiCreateTransferRequest2 frequency;
    private final int occurrenceLabel;
    private final int title;
    public static final TransferFrequencyRowItem WEEKLY = new TransferFrequencyRowItem("WEEKLY", 0, ApiCreateTransferRequest2.WEEKLY, C30065R.string.update_recurring_deposit_frequency_weekly_title, C30065R.string.update_recurring_deposit_frequency_weekly_description, C30065R.string.update_recurring_deposit_frequency_occurrence_weekly_label);
    public static final TransferFrequencyRowItem BIWEEKLY = new TransferFrequencyRowItem("BIWEEKLY", 1, ApiCreateTransferRequest2.BIWEEKLY, C30065R.string.update_recurring_deposit_frequency_biweekly_title, C30065R.string.update_recurring_deposit_frequency_biweekly_description, C30065R.string.update_recurring_deposit_frequency_occurrence_biweekly_label);
    public static final TransferFrequencyRowItem MONTHLY = new TransferFrequencyRowItem("MONTHLY", 2, ApiCreateTransferRequest2.MONTHLY, C30065R.string.update_recurring_deposit_frequency_monthly_title, C30065R.string.update_recurring_deposit_frequency_monthly_description, C30065R.string.update_recurring_deposit_frequency_occurrence_monthly_label);
    public static final TransferFrequencyRowItem QUARTERLY = new TransferFrequencyRowItem("QUARTERLY", 3, ApiCreateTransferRequest2.QUARTERLY, C30065R.string.update_recurring_deposit_frequency_quarterly_tile, C30065R.string.update_recurring_deposit_frequency_quarterly_description, C30065R.string.update_recurring_deposit_frequency_occurrence_quarterly_label);

    private static final /* synthetic */ TransferFrequencyRowItem[] $values() {
        return new TransferFrequencyRowItem[]{WEEKLY, BIWEEKLY, MONTHLY, QUARTERLY};
    }

    public static EnumEntries<TransferFrequencyRowItem> getEntries() {
        return $ENTRIES;
    }

    private TransferFrequencyRowItem(String str, int i, ApiCreateTransferRequest2 apiCreateTransferRequest2, int i2, int i3, int i4) {
        this.frequency = apiCreateTransferRequest2;
        this.title = i2;
        this.description = i3;
        this.occurrenceLabel = i4;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getDescription() {
        return this.description;
    }

    public final int getOccurrenceLabel() {
        return this.occurrenceLabel;
    }

    static {
        TransferFrequencyRowItem[] transferFrequencyRowItemArr$values = $values();
        $VALUES = transferFrequencyRowItemArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferFrequencyRowItemArr$values);
    }

    public static TransferFrequencyRowItem valueOf(String str) {
        return (TransferFrequencyRowItem) Enum.valueOf(TransferFrequencyRowItem.class, str);
    }

    public static TransferFrequencyRowItem[] values() {
        return (TransferFrequencyRowItem[]) $VALUES.clone();
    }
}
