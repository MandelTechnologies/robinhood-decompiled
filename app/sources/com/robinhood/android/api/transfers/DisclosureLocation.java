package com.robinhood.android.api.transfers;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisclosureLocation.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/api/transfers/DisclosureLocation;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "LINK_ACCOUNT", "CREATE_TRANSFER_REVIEW_PAGE", "CREATE_TRANSFER_EDIT_PAGE", "DEBIT_CARD_LINKING_UPSELL_INTRO", "SG_REVIEW_TRANSFER", "UK_REVIEW_TRANSFER", "UK_QUEUED_DEPOSIT", "Companion", "lib-api-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DisclosureLocation implements RhEnum<DisclosureLocation> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisclosureLocation[] $VALUES;
    private final String serverValue;
    public static final DisclosureLocation UNKNOWN = new DisclosureLocation("UNKNOWN", 0, "unknown");
    public static final DisclosureLocation LINK_ACCOUNT = new DisclosureLocation("LINK_ACCOUNT", 1, "link_account");
    public static final DisclosureLocation CREATE_TRANSFER_REVIEW_PAGE = new DisclosureLocation("CREATE_TRANSFER_REVIEW_PAGE", 2, "create_transfer_review_page");
    public static final DisclosureLocation CREATE_TRANSFER_EDIT_PAGE = new DisclosureLocation("CREATE_TRANSFER_EDIT_PAGE", 3, "create_transfer_edit_page");
    public static final DisclosureLocation DEBIT_CARD_LINKING_UPSELL_INTRO = new DisclosureLocation("DEBIT_CARD_LINKING_UPSELL_INTRO", 4, "debit_card_linking_upsell_intro");
    public static final DisclosureLocation SG_REVIEW_TRANSFER = new DisclosureLocation("SG_REVIEW_TRANSFER", 5, "sg_review_transfer");
    public static final DisclosureLocation UK_REVIEW_TRANSFER = new DisclosureLocation("UK_REVIEW_TRANSFER", 6, "uk_review_transfer");
    public static final DisclosureLocation UK_QUEUED_DEPOSIT = new DisclosureLocation("UK_QUEUED_DEPOSIT", 7, "uk_queued_deposit");

    private static final /* synthetic */ DisclosureLocation[] $values() {
        return new DisclosureLocation[]{UNKNOWN, LINK_ACCOUNT, CREATE_TRANSFER_REVIEW_PAGE, CREATE_TRANSFER_EDIT_PAGE, DEBIT_CARD_LINKING_UPSELL_INTRO, SG_REVIEW_TRANSFER, UK_REVIEW_TRANSFER, UK_QUEUED_DEPOSIT};
    }

    public static EnumEntries<DisclosureLocation> getEntries() {
        return $ENTRIES;
    }

    private DisclosureLocation(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        DisclosureLocation[] disclosureLocationArr$values = $values();
        $VALUES = disclosureLocationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(disclosureLocationArr$values);
        INSTANCE = new Companion(null);
    }

    public static DisclosureLocation valueOf(String str) {
        return (DisclosureLocation) Enum.valueOf(DisclosureLocation.class, str);
    }

    public static DisclosureLocation[] values() {
        return (DisclosureLocation[]) $VALUES.clone();
    }
}
