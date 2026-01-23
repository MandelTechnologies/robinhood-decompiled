package com.robinhood.android.brokeragecontent;

import com.robinhood.android.brokeragecontent.BrokerageResource;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrokerageOtherMarkdown.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/brokeragecontent/BrokerageOtherMarkdown;", "Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "", "contentfulId", "", "ukContentfulId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "getUkContentfulId", "GOLD_BILLING", "DAY_TRADE", "MARGIN_UPGRADE_SPLASH", "MARGIN_UPGRADE_SPLASH_WITH_GOLD", "MARGIN_GAINS_EDUCATION", "MARGIN_LOSSES_EDUCATION", "LIMITED_MARGIN_RISK", "lib-brokerage-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BrokerageOtherMarkdown implements BrokerageResource<OtherMarkdown> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrokerageOtherMarkdown[] $VALUES;
    private final String contentfulId;
    private final String ukContentfulId;
    public static final BrokerageOtherMarkdown GOLD_BILLING = new BrokerageOtherMarkdown("GOLD_BILLING", 0, "2CAmHp7f5KwH0l6SCUmacy", null, 2, null);
    public static final BrokerageOtherMarkdown DAY_TRADE = new BrokerageOtherMarkdown("DAY_TRADE", 1, "3HOAQeve7uOZvqiDzzZGAV", "180DE9VpsSnXQzIDJMgrwg");
    public static final BrokerageOtherMarkdown MARGIN_UPGRADE_SPLASH = new BrokerageOtherMarkdown("MARGIN_UPGRADE_SPLASH", 2, "6MWJbc0LTat9p8zEGLPc4z", "5JUu1xwi7vcOMnuboZXwD2");
    public static final BrokerageOtherMarkdown MARGIN_UPGRADE_SPLASH_WITH_GOLD = new BrokerageOtherMarkdown("MARGIN_UPGRADE_SPLASH_WITH_GOLD", 3, "3oEIq7rHWlj806n3cP38Y2", null, 2, null);
    public static final BrokerageOtherMarkdown MARGIN_GAINS_EDUCATION = new BrokerageOtherMarkdown("MARGIN_GAINS_EDUCATION", 4, "20wls0DQ0AteaQmT0384k9", null, 2, null);
    public static final BrokerageOtherMarkdown MARGIN_LOSSES_EDUCATION = new BrokerageOtherMarkdown("MARGIN_LOSSES_EDUCATION", 5, "1OSF1j7KexHo6wj9wByi9a", null, 2, null);
    public static final BrokerageOtherMarkdown LIMITED_MARGIN_RISK = new BrokerageOtherMarkdown("LIMITED_MARGIN_RISK", 6, "7fodrIkmiBYzWKT2b29Hdb", null, 2, null);

    private static final /* synthetic */ BrokerageOtherMarkdown[] $values() {
        return new BrokerageOtherMarkdown[]{GOLD_BILLING, DAY_TRADE, MARGIN_UPGRADE_SPLASH, MARGIN_UPGRADE_SPLASH_WITH_GOLD, MARGIN_GAINS_EDUCATION, MARGIN_LOSSES_EDUCATION, LIMITED_MARGIN_RISK};
    }

    public static EnumEntries<BrokerageOtherMarkdown> getEntries() {
        return $ENTRIES;
    }

    private BrokerageOtherMarkdown(String str, int i, String str2, String str3) {
        this.contentfulId = str2;
        this.ukContentfulId = str3;
    }

    /* synthetic */ BrokerageOtherMarkdown(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
        BrokerageOtherMarkdown[] brokerageOtherMarkdownArr$values = $values();
        $VALUES = brokerageOtherMarkdownArr$values;
        $ENTRIES = EnumEntries2.enumEntries(brokerageOtherMarkdownArr$values);
    }

    public static BrokerageOtherMarkdown valueOf(String str) {
        return (BrokerageOtherMarkdown) Enum.valueOf(BrokerageOtherMarkdown.class, str);
    }

    public static BrokerageOtherMarkdown[] values() {
        return (BrokerageOtherMarkdown[]) $VALUES.clone();
    }
}
