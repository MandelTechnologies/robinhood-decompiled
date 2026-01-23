package com.robinhood.shared.crypto.perpetuals.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PerpetualsReferenceManualPage.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsReferenceManualPage;", "", "contentfulIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContentfulIdentifier", "()Ljava/lang/String;", "OVERVIEW", "BUYING_POWER", "CONTRACT_DETAILS", "POSITION_DETAILS", "RISK_MANAGEMENT", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PerpetualsReferenceManualPage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PerpetualsReferenceManualPage[] $VALUES;
    private final String contentfulIdentifier;
    public static final PerpetualsReferenceManualPage OVERVIEW = new PerpetualsReferenceManualPage("OVERVIEW", 0, "perps-overview");
    public static final PerpetualsReferenceManualPage BUYING_POWER = new PerpetualsReferenceManualPage("BUYING_POWER", 1, "perps-buying-power");
    public static final PerpetualsReferenceManualPage CONTRACT_DETAILS = new PerpetualsReferenceManualPage("CONTRACT_DETAILS", 2, "perps-contract-details");
    public static final PerpetualsReferenceManualPage POSITION_DETAILS = new PerpetualsReferenceManualPage("POSITION_DETAILS", 3, "perps-position-details");
    public static final PerpetualsReferenceManualPage RISK_MANAGEMENT = new PerpetualsReferenceManualPage("RISK_MANAGEMENT", 4, "perps-risk-management");

    private static final /* synthetic */ PerpetualsReferenceManualPage[] $values() {
        return new PerpetualsReferenceManualPage[]{OVERVIEW, BUYING_POWER, CONTRACT_DETAILS, POSITION_DETAILS, RISK_MANAGEMENT};
    }

    public static EnumEntries<PerpetualsReferenceManualPage> getEntries() {
        return $ENTRIES;
    }

    private PerpetualsReferenceManualPage(String str, int i, String str2) {
        this.contentfulIdentifier = str2;
    }

    public final String getContentfulIdentifier() {
        return this.contentfulIdentifier;
    }

    static {
        PerpetualsReferenceManualPage[] perpetualsReferenceManualPageArr$values = $values();
        $VALUES = perpetualsReferenceManualPageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(perpetualsReferenceManualPageArr$values);
    }

    public static PerpetualsReferenceManualPage valueOf(String str) {
        return (PerpetualsReferenceManualPage) Enum.valueOf(PerpetualsReferenceManualPage.class, str);
    }

    public static PerpetualsReferenceManualPage[] values() {
        return (PerpetualsReferenceManualPage[]) $VALUES.clone();
    }
}
