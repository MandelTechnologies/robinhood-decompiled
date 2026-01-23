package com.robinhood.android.directdeposit.p101ui.p102v3;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.directdeposit.C14044R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectDepositV3ManualSetupViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/EmailStatus;", "", "stringRes", "", "<init>", "(Ljava/lang/String;II)V", "getStringRes", "()I", "READY_TO_EMAIL", "EMAIL_SENDING", "EMAIL_SENT", "EMAIL_FAILED", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.v3.EmailStatus, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositV3ManualSetupViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DirectDepositV3ManualSetupViewState2[] $VALUES;
    private final int stringRes;
    public static final DirectDepositV3ManualSetupViewState2 READY_TO_EMAIL = new DirectDepositV3ManualSetupViewState2("READY_TO_EMAIL", 0, C14044R.string.direct_deposit_email_status_ready_to_send);
    public static final DirectDepositV3ManualSetupViewState2 EMAIL_SENDING = new DirectDepositV3ManualSetupViewState2("EMAIL_SENDING", 1, C11048R.string.general_status_loading);
    public static final DirectDepositV3ManualSetupViewState2 EMAIL_SENT = new DirectDepositV3ManualSetupViewState2("EMAIL_SENT", 2, C14044R.string.direct_deposit_email_status_sent);
    public static final DirectDepositV3ManualSetupViewState2 EMAIL_FAILED = new DirectDepositV3ManualSetupViewState2("EMAIL_FAILED", 3, C14044R.string.direct_deposit_email_status_failed);

    private static final /* synthetic */ DirectDepositV3ManualSetupViewState2[] $values() {
        return new DirectDepositV3ManualSetupViewState2[]{READY_TO_EMAIL, EMAIL_SENDING, EMAIL_SENT, EMAIL_FAILED};
    }

    public static EnumEntries<DirectDepositV3ManualSetupViewState2> getEntries() {
        return $ENTRIES;
    }

    private DirectDepositV3ManualSetupViewState2(String str, int i, int i2) {
        this.stringRes = i2;
    }

    public final int getStringRes() {
        return this.stringRes;
    }

    static {
        DirectDepositV3ManualSetupViewState2[] directDepositV3ManualSetupViewState2Arr$values = $values();
        $VALUES = directDepositV3ManualSetupViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(directDepositV3ManualSetupViewState2Arr$values);
    }

    public static DirectDepositV3ManualSetupViewState2 valueOf(String str) {
        return (DirectDepositV3ManualSetupViewState2) Enum.valueOf(DirectDepositV3ManualSetupViewState2.class, str);
    }

    public static DirectDepositV3ManualSetupViewState2[] values() {
        return (DirectDepositV3ManualSetupViewState2[]) $VALUES.clone();
    }
}
