package com.robinhood.android.transfers.contracts.transfercontext;

import kotlin.Metadata;

/* compiled from: TransferContext.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/transfercontext/TypeStrings;", "", "<init>", "()V", TransferContext3.AUTOMATIC_DEPOSIT, "", TransferContext3.NORMAL, TransferContext3.RECURRING_INSUFFICIENT_BUYING_POWER, TransferContext3.GOLD_DEPOSIT, TransferContext3.MARGIN_RESOLUTION, TransferContext3.MARGIN_CALL_PREVENTION, TransferContext3.QUEUED_DEPOSIT, TransferContext3.DAY_TRADE_CALL_RESOLUTION, "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.contracts.transfercontext.TypeStrings, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferContext3 {
    public static final String AUTOMATIC_DEPOSIT = "AUTOMATIC_DEPOSIT";
    public static final String DAY_TRADE_CALL_RESOLUTION = "DAY_TRADE_CALL_RESOLUTION";
    public static final String GOLD_DEPOSIT = "GOLD_DEPOSIT";
    public static final TransferContext3 INSTANCE = new TransferContext3();
    public static final String MARGIN_CALL_PREVENTION = "MARGIN_CALL_PREVENTION";
    public static final String MARGIN_RESOLUTION = "MARGIN_RESOLUTION";
    public static final String NORMAL = "NORMAL";
    public static final String QUEUED_DEPOSIT = "QUEUED_DEPOSIT";
    public static final String RECURRING_INSUFFICIENT_BUYING_POWER = "RECURRING_INSUFFICIENT_BUYING_POWER";

    private TransferContext3() {
    }
}
