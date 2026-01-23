package com.robinhood.android.brokeragecontent;

import com.robinhood.android.brokeragecontent.BrokerageResource;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.staticcontent.model.Agreement;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrokerageAgreement.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/brokeragecontent/BrokerageAgreement;", "Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "Lcom/robinhood/staticcontent/model/Agreement;", "", "contentfulId", "", "ukContentfulId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "getUkContentfulId", "GOLD", "INSTANT", "OPTIONS", "OPTIONS_INSTANT", "MARGIN_ENABLE", "lib-brokerage-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BrokerageAgreement implements BrokerageResource<Agreement> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrokerageAgreement[] $VALUES;
    private final String contentfulId;
    private final String ukContentfulId;
    public static final BrokerageAgreement GOLD = new BrokerageAgreement("GOLD", 0, "7hQ6U5Ex0T33bjSaTLUVT3", null, 2, null);
    public static final BrokerageAgreement INSTANT = new BrokerageAgreement("INSTANT", 1, "1vBU9yCKiniOq291BoMuJF", null, 2, null);
    public static final BrokerageAgreement OPTIONS = new BrokerageAgreement("OPTIONS", 2, "2ZwPxnAlY4vcVwBX4SJqIS", null, 2, null);
    public static final BrokerageAgreement OPTIONS_INSTANT = new BrokerageAgreement("OPTIONS_INSTANT", 3, "2d5jv6Bd2ZzKvGbuvmzT1y", null, 2, null);
    public static final BrokerageAgreement MARGIN_ENABLE = new BrokerageAgreement("MARGIN_ENABLE", 4, ApiUserAgreement.TYPE_MARGIN_AGREEMENT, ApiUserAgreement.TYPE_MARGIN_AGREEMENT);

    private static final /* synthetic */ BrokerageAgreement[] $values() {
        return new BrokerageAgreement[]{GOLD, INSTANT, OPTIONS, OPTIONS_INSTANT, MARGIN_ENABLE};
    }

    public static EnumEntries<BrokerageAgreement> getEntries() {
        return $ENTRIES;
    }

    private BrokerageAgreement(String str, int i, String str2, String str3) {
        this.contentfulId = str2;
        this.ukContentfulId = str3;
    }

    /* synthetic */ BrokerageAgreement(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
        BrokerageAgreement[] brokerageAgreementArr$values = $values();
        $VALUES = brokerageAgreementArr$values;
        $ENTRIES = EnumEntries2.enumEntries(brokerageAgreementArr$values);
    }

    public static BrokerageAgreement valueOf(String str) {
        return (BrokerageAgreement) Enum.valueOf(BrokerageAgreement.class, str);
    }

    public static BrokerageAgreement[] values() {
        return (BrokerageAgreement[]) $VALUES.clone();
    }
}
