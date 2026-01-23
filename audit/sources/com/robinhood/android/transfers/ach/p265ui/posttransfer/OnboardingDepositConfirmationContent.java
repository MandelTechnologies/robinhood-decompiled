package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.transfers.ach.C30082R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingDepositConfirmationContent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/QueuedDepositConfirmationContent;", "", "titleText", "", "doneButton", "detailText", "disclaimerText", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;I)V", "getTitleText", "()I", "getDoneButton", "getDetailText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisclaimerText", "APPROVED_WITH_ALL_INSTANT_DEPOSIT", "APPROVED_WITH_PARTIAL_INSTANT_DEPOSIT", "NOT_APPROVED_DEPOSIT", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.QueuedDepositConfirmationContent, reason: use source file name */
/* loaded from: classes9.dex */
public final class OnboardingDepositConfirmationContent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnboardingDepositConfirmationContent[] $VALUES;
    public static final OnboardingDepositConfirmationContent APPROVED_WITH_ALL_INSTANT_DEPOSIT = new OnboardingDepositConfirmationContent("APPROVED_WITH_ALL_INSTANT_DEPOSIT", 0, C30082R.string.ach_transfer_confirmation_queued_deposit_title_approved, C11048R.string.general_label_continue, Integer.valueOf(C30082R.string.f4998x64eea94d), C30082R.string.f4999x94d05c2b);
    public static final OnboardingDepositConfirmationContent APPROVED_WITH_PARTIAL_INSTANT_DEPOSIT = new OnboardingDepositConfirmationContent("APPROVED_WITH_PARTIAL_INSTANT_DEPOSIT", 1, C30082R.string.ach_transfer_confirmation_queued_deposit_title_approved, C11048R.string.general_label_continue, null, C30082R.string.f5000x17858fcb);
    public static final OnboardingDepositConfirmationContent NOT_APPROVED_DEPOSIT = new OnboardingDepositConfirmationContent("NOT_APPROVED_DEPOSIT", 2, C30082R.string.ach_transfer_confirmation_deposit_not_approved_title, C11048R.string.general_label_continue, Integer.valueOf(C30082R.string.ach_transfer_confirmation_detail_text_revamp_not_approved), C30082R.string.ach_transfer_confirmation_disclaimer_cleanup_unapproved_text);
    private final Integer detailText;
    private final int disclaimerText;
    private final int doneButton;
    private final int titleText;

    private static final /* synthetic */ OnboardingDepositConfirmationContent[] $values() {
        return new OnboardingDepositConfirmationContent[]{APPROVED_WITH_ALL_INSTANT_DEPOSIT, APPROVED_WITH_PARTIAL_INSTANT_DEPOSIT, NOT_APPROVED_DEPOSIT};
    }

    public static EnumEntries<OnboardingDepositConfirmationContent> getEntries() {
        return $ENTRIES;
    }

    private OnboardingDepositConfirmationContent(String str, int i, int i2, int i3, Integer num, int i4) {
        this.titleText = i2;
        this.doneButton = i3;
        this.detailText = num;
        this.disclaimerText = i4;
    }

    public final int getTitleText() {
        return this.titleText;
    }

    public final int getDoneButton() {
        return this.doneButton;
    }

    public final Integer getDetailText() {
        return this.detailText;
    }

    public final int getDisclaimerText() {
        return this.disclaimerText;
    }

    static {
        OnboardingDepositConfirmationContent[] onboardingDepositConfirmationContentArr$values = $values();
        $VALUES = onboardingDepositConfirmationContentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(onboardingDepositConfirmationContentArr$values);
    }

    public static OnboardingDepositConfirmationContent valueOf(String str) {
        return (OnboardingDepositConfirmationContent) Enum.valueOf(OnboardingDepositConfirmationContent.class, str);
    }

    public static OnboardingDepositConfirmationContent[] values() {
        return (OnboardingDepositConfirmationContent[]) $VALUES.clone();
    }
}
