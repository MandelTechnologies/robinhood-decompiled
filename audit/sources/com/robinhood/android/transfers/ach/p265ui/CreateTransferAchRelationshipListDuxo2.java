package com.robinhood.android.transfers.ach.p265ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreateTransferAchRelationshipListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/AchRelationshipState;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPTED", "NEED_TO_VERIFY_MICRODEPOSITS", "UNVERIFIED_BUT_NO_PATH", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.AchRelationshipState, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferAchRelationshipListDuxo2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreateTransferAchRelationshipListDuxo2[] $VALUES;
    public static final CreateTransferAchRelationshipListDuxo2 ACCEPTED = new CreateTransferAchRelationshipListDuxo2("ACCEPTED", 0);
    public static final CreateTransferAchRelationshipListDuxo2 NEED_TO_VERIFY_MICRODEPOSITS = new CreateTransferAchRelationshipListDuxo2("NEED_TO_VERIFY_MICRODEPOSITS", 1);
    public static final CreateTransferAchRelationshipListDuxo2 UNVERIFIED_BUT_NO_PATH = new CreateTransferAchRelationshipListDuxo2("UNVERIFIED_BUT_NO_PATH", 2);

    private static final /* synthetic */ CreateTransferAchRelationshipListDuxo2[] $values() {
        return new CreateTransferAchRelationshipListDuxo2[]{ACCEPTED, NEED_TO_VERIFY_MICRODEPOSITS, UNVERIFIED_BUT_NO_PATH};
    }

    public static EnumEntries<CreateTransferAchRelationshipListDuxo2> getEntries() {
        return $ENTRIES;
    }

    private CreateTransferAchRelationshipListDuxo2(String str, int i) {
    }

    static {
        CreateTransferAchRelationshipListDuxo2[] createTransferAchRelationshipListDuxo2Arr$values = $values();
        $VALUES = createTransferAchRelationshipListDuxo2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(createTransferAchRelationshipListDuxo2Arr$values);
    }

    public static CreateTransferAchRelationshipListDuxo2 valueOf(String str) {
        return (CreateTransferAchRelationshipListDuxo2) Enum.valueOf(CreateTransferAchRelationshipListDuxo2.class, str);
    }

    public static CreateTransferAchRelationshipListDuxo2[] values() {
        return (CreateTransferAchRelationshipListDuxo2[]) $VALUES.clone();
    }
}
