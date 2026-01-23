package com.robinhood.android.brokeragecontent;

import com.robinhood.android.brokeragecontent.BrokerageResource;
import com.robinhood.staticcontent.model.ReferenceManual;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrokerageReferenceManual.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/brokeragecontent/BrokerageReferenceManual;", "Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "Lcom/robinhood/staticcontent/model/ReferenceManual;", "", "contentfulId", "", "ukContentfulId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "getUkContentfulId", "BUY_CALL", "BUY_PUT", "SELL_CALL", "SELL_PUT", "CALL_DEBIT", "PUT_DEBIT", "CALL_CREDIT", "PUT_CREDIT", "STRADDLE_OR_STRANGLE", "IRON_CONDOR", "IRON_BUTTERFLY", "CALENDAR", "UNKNOWN", "lib-brokerage-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BrokerageReferenceManual implements BrokerageResource<ReferenceManual> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrokerageReferenceManual[] $VALUES;
    private final String contentfulId;
    private final String ukContentfulId;
    public static final BrokerageReferenceManual BUY_CALL = new BrokerageReferenceManual("BUY_CALL", 0, "5q28y6cqDODBu7aVoreLyJ", "4kZkuC59fkYtfn7OqBmfT8");
    public static final BrokerageReferenceManual BUY_PUT = new BrokerageReferenceManual("BUY_PUT", 1, "5Qltpe3serGM91xtmZ5dsu", "2XwZuDpXJ28scOfowxSnju");
    public static final BrokerageReferenceManual SELL_CALL = new BrokerageReferenceManual("SELL_CALL", 2, "aKmzfbdnczSGrWhyY3ciq", "5sFRSuCVpMae7upOwsFFSI");
    public static final BrokerageReferenceManual SELL_PUT = new BrokerageReferenceManual("SELL_PUT", 3, "7IPCuDkBsWoO7pxJpTRFU0", "5evYgdxfosEvQ2fdbVJIak");
    public static final BrokerageReferenceManual CALL_DEBIT = new BrokerageReferenceManual("CALL_DEBIT", 4, "5hJJnHzVgUbymyLKVO9VtP", "5bS9e5DwjxTEwMooAokn8C");
    public static final BrokerageReferenceManual PUT_DEBIT = new BrokerageReferenceManual("PUT_DEBIT", 5, "jLx8UuBBgaJl3Kj3vH1Rt", "2Gk9km31aQ4Iyf5RRNk52z");
    public static final BrokerageReferenceManual CALL_CREDIT = new BrokerageReferenceManual("CALL_CREDIT", 6, "257IND71Z5J9JbVWnWpmD9", "40q1qrqzbQaw7IrXoEYOe6");
    public static final BrokerageReferenceManual PUT_CREDIT = new BrokerageReferenceManual("PUT_CREDIT", 7, "3qkIbAosPuuNFd7ubL1Lb6", "3Tg8BOSVapKxdRZSkDr6Fi");
    public static final BrokerageReferenceManual STRADDLE_OR_STRANGLE = new BrokerageReferenceManual("STRADDLE_OR_STRANGLE", 8, "2H9ob7BIPGa9P7rsRid64h", "2H9ob7BIPGa9P7rsRid64h");
    public static final BrokerageReferenceManual IRON_CONDOR = new BrokerageReferenceManual("IRON_CONDOR", 9, "28rrzShvKXHOVbz0O44lN1", "5yNaMk00kifgBnwJLiQCo2");
    public static final BrokerageReferenceManual IRON_BUTTERFLY = new BrokerageReferenceManual("IRON_BUTTERFLY", 10, "30Vx4bezOmENN3vba7xpGM", "2aZFpxbsDOXrCBQaZD6OGB");
    public static final BrokerageReferenceManual CALENDAR = new BrokerageReferenceManual("CALENDAR", 11, "7dCxdRtuVmKRDXwRFCYX4z", "1sG9HShKCWeTlLBFQRfBMp");
    public static final BrokerageReferenceManual UNKNOWN = new BrokerageReferenceManual("UNKNOWN", 12, "unknown", "unknown");

    private static final /* synthetic */ BrokerageReferenceManual[] $values() {
        return new BrokerageReferenceManual[]{BUY_CALL, BUY_PUT, SELL_CALL, SELL_PUT, CALL_DEBIT, PUT_DEBIT, CALL_CREDIT, PUT_CREDIT, STRADDLE_OR_STRANGLE, IRON_CONDOR, IRON_BUTTERFLY, CALENDAR, UNKNOWN};
    }

    public static EnumEntries<BrokerageReferenceManual> getEntries() {
        return $ENTRIES;
    }

    private BrokerageReferenceManual(String str, int i, String str2, String str3) {
        this.contentfulId = str2;
        this.ukContentfulId = str3;
    }

    /* synthetic */ BrokerageReferenceManual(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : str3);
    }

    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
    public String getSgContentfulId() {
        return BrokerageResource.DefaultImpls.getSgContentfulId(this);
    }

    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
    public String getContentfulId() {
        return this.contentfulId;
    }

    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
    public String getUkContentfulId() {
        return this.ukContentfulId;
    }

    static {
        BrokerageReferenceManual[] brokerageReferenceManualArr$values = $values();
        $VALUES = brokerageReferenceManualArr$values;
        $ENTRIES = EnumEntries2.enumEntries(brokerageReferenceManualArr$values);
    }

    public static BrokerageReferenceManual valueOf(String str) {
        return (BrokerageReferenceManual) Enum.valueOf(BrokerageReferenceManual.class, str);
    }

    public static BrokerageReferenceManual[] values() {
        return (BrokerageReferenceManual[]) $VALUES.clone();
    }
}
