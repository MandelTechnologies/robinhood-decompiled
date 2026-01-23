package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.C11131R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectDepositSplashViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "", "textResId", "", "<init>", "(Ljava/lang/String;II)V", "getTextResId", "()I", "CONTINUE", "SET_UP_DIRECT_DEPOSIT", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashViewPrimaryButtonState, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositSplashViewState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DirectDepositSplashViewState3[] $VALUES;
    public static final DirectDepositSplashViewState3 CONTINUE = new DirectDepositSplashViewState3("CONTINUE", 0, C11048R.string.general_label_continue);
    public static final DirectDepositSplashViewState3 SET_UP_DIRECT_DEPOSIT = new DirectDepositSplashViewState3("SET_UP_DIRECT_DEPOSIT", 1, C11131R.string.set_up_direct_deposit);
    private final int textResId;

    private static final /* synthetic */ DirectDepositSplashViewState3[] $values() {
        return new DirectDepositSplashViewState3[]{CONTINUE, SET_UP_DIRECT_DEPOSIT};
    }

    public static EnumEntries<DirectDepositSplashViewState3> getEntries() {
        return $ENTRIES;
    }

    private DirectDepositSplashViewState3(String str, int i, int i2) {
        this.textResId = i2;
    }

    public final int getTextResId() {
        return this.textResId;
    }

    static {
        DirectDepositSplashViewState3[] directDepositSplashViewState3Arr$values = $values();
        $VALUES = directDepositSplashViewState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(directDepositSplashViewState3Arr$values);
    }

    public static DirectDepositSplashViewState3 valueOf(String str) {
        return (DirectDepositSplashViewState3) Enum.valueOf(DirectDepositSplashViewState3.class, str);
    }

    public static DirectDepositSplashViewState3[] values() {
        return (DirectDepositSplashViewState3[]) $VALUES.clone();
    }
}
