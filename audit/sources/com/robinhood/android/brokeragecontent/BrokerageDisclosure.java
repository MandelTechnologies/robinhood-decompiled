package com.robinhood.android.brokeragecontent;

import com.robinhood.staticcontent.model.disclosure.Disclosure;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrokerageDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/brokeragecontent/BrokerageDisclosure;", "Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "", "contentfulId", "", "ukContentfulId", "sgContentfulId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "getUkContentfulId", "getSgContentfulId", "VARIABLE_APY_DISCLOSURE_LEGACY", "CM_GENERAL_APY_DISCLOSURE", "CASH_SWEEP_INTEREST_EARNING_DISCLOSURE", "CM_SPECIFIC_APY_DISCLOSURE", "HOME_SCREEN", "HOME_SCREEN_WITH_FUTURES", "OPTIONS_CHAIN_CHANCE_OF_PROFIT_DISCLOSURE", "OPTIONS_CHAIN_SIDE_BY_SIDE_SPY_ONBOARDING", "OPTIONS_PROFIT_LOSS_DISCLOSURE", "OPTIONS_DETAIL_DISCLOSURE_SHORT", "OPTIONS_DETAIL_DISCLOSURE_FULL", "OPTIONS_DETAIL_DISCLOSURE_PNL_TAXABLE_MEMBER", "OPTIONS_DETAIL_DISCLOSURE_PNL_RETIREMENT_MEMBER", "OPTION_MARKETABILITY_DISCLOSURE", "ADVANCED_CHART", "SCREENERS", "INDEX", "ADVISORY_CASH", "MCW_CASH_EXPLAINER", "lib-brokerage-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BrokerageDisclosure implements BrokerageResource<Disclosure> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrokerageDisclosure[] $VALUES;
    public static final BrokerageDisclosure ADVISORY_CASH;
    public static final BrokerageDisclosure CASH_SWEEP_INTEREST_EARNING_DISCLOSURE;
    public static final BrokerageDisclosure CM_GENERAL_APY_DISCLOSURE;
    public static final BrokerageDisclosure CM_SPECIFIC_APY_DISCLOSURE;
    public static final BrokerageDisclosure INDEX;
    public static final BrokerageDisclosure OPTIONS_CHAIN_SIDE_BY_SIDE_SPY_ONBOARDING;
    public static final BrokerageDisclosure OPTIONS_PROFIT_LOSS_DISCLOSURE;
    public static final BrokerageDisclosure VARIABLE_APY_DISCLOSURE_LEGACY;
    private final String contentfulId;
    private final String sgContentfulId;
    private final String ukContentfulId;
    public static final BrokerageDisclosure HOME_SCREEN = new BrokerageDisclosure("HOME_SCREEN", 4, "1NAwFhjONWqokGTWlqOfXd", "4z3vMeykIBbVz8gOwoMqlS", "2gtYOmPpKe2yChFTEgHoY");
    public static final BrokerageDisclosure HOME_SCREEN_WITH_FUTURES = new BrokerageDisclosure("HOME_SCREEN_WITH_FUTURES", 5, "Mitse9WpAyhLigomZbJhq", "4z3vMeykIBbVz8gOwoMqlS", 0 == true ? 1 : 0, 4, null);
    public static final BrokerageDisclosure OPTIONS_CHAIN_CHANCE_OF_PROFIT_DISCLOSURE = new BrokerageDisclosure("OPTIONS_CHAIN_CHANCE_OF_PROFIT_DISCLOSURE", 6, "6rHEzDiYqd1VRElgiznaXb", "5c9GQ0r14qoZ4Ed3i3UQM9", null, 4, null);
    public static final BrokerageDisclosure OPTIONS_DETAIL_DISCLOSURE_SHORT = new BrokerageDisclosure("OPTIONS_DETAIL_DISCLOSURE_SHORT", 9, "4PD3falDIsHTrq5GEvtGqn", "4NRvwxJv5RyCAaWYsg24gQ", null, 4, null);
    public static final BrokerageDisclosure OPTIONS_DETAIL_DISCLOSURE_FULL = new BrokerageDisclosure("OPTIONS_DETAIL_DISCLOSURE_FULL", 10, "1F9MTO2p1pEYQPFHYp0sTk", "3awUH0ipKKwlGtUYZ26uWJ", null, 4, null);
    public static final BrokerageDisclosure OPTIONS_DETAIL_DISCLOSURE_PNL_TAXABLE_MEMBER = new BrokerageDisclosure("OPTIONS_DETAIL_DISCLOSURE_PNL_TAXABLE_MEMBER", 11, "2gE23fHLK6cBmNTaRK1FVc", "3awUH0ipKKwlGtUYZ26uWJ", null, 4, null);
    public static final BrokerageDisclosure OPTIONS_DETAIL_DISCLOSURE_PNL_RETIREMENT_MEMBER = new BrokerageDisclosure("OPTIONS_DETAIL_DISCLOSURE_PNL_RETIREMENT_MEMBER", 12, "2xv4XQfAto5Kn6wZW31CpR", "3awUH0ipKKwlGtUYZ26uWJ", null, 4, null);
    public static final BrokerageDisclosure OPTION_MARKETABILITY_DISCLOSURE = new BrokerageDisclosure("OPTION_MARKETABILITY_DISCLOSURE", 13, "4e20eUXqTG2yaxD2Piro0J", "1VMS2Z1dCQ2YUJwQsRBo4H", null, 4, null);
    public static final BrokerageDisclosure ADVANCED_CHART = new BrokerageDisclosure("ADVANCED_CHART", 14, "6SnfYwHkG80b4RpX5MOY99", "41N8bq4UZGGA2LNlFJrp84", "15rzS8ap1NrpRqSIzAj7WE");
    public static final BrokerageDisclosure SCREENERS = new BrokerageDisclosure("SCREENERS", 15, "3IuRiOZWJHkq2mkc4MAEiV", "6sst8mm3qd8p9tVi34Hx0T", "oi5g5jZhgc7ptoWqEhVOP");
    public static final BrokerageDisclosure MCW_CASH_EXPLAINER = new BrokerageDisclosure("MCW_CASH_EXPLAINER", 18, "6lTYizd8CR5pmifpgdKnCW", null, null, 6, null);

    private static final /* synthetic */ BrokerageDisclosure[] $values() {
        return new BrokerageDisclosure[]{VARIABLE_APY_DISCLOSURE_LEGACY, CM_GENERAL_APY_DISCLOSURE, CASH_SWEEP_INTEREST_EARNING_DISCLOSURE, CM_SPECIFIC_APY_DISCLOSURE, HOME_SCREEN, HOME_SCREEN_WITH_FUTURES, OPTIONS_CHAIN_CHANCE_OF_PROFIT_DISCLOSURE, OPTIONS_CHAIN_SIDE_BY_SIDE_SPY_ONBOARDING, OPTIONS_PROFIT_LOSS_DISCLOSURE, OPTIONS_DETAIL_DISCLOSURE_SHORT, OPTIONS_DETAIL_DISCLOSURE_FULL, OPTIONS_DETAIL_DISCLOSURE_PNL_TAXABLE_MEMBER, OPTIONS_DETAIL_DISCLOSURE_PNL_RETIREMENT_MEMBER, OPTION_MARKETABILITY_DISCLOSURE, ADVANCED_CHART, SCREENERS, INDEX, ADVISORY_CASH, MCW_CASH_EXPLAINER};
    }

    public static EnumEntries<BrokerageDisclosure> getEntries() {
        return $ENTRIES;
    }

    private BrokerageDisclosure(String str, int i, String str2, String str3, String str4) {
        this.contentfulId = str2;
        this.ukContentfulId = str3;
        this.sgContentfulId = str4;
    }

    /* synthetic */ BrokerageDisclosure(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : str3, (i2 & 4) != 0 ? null : str4);
    }

    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
    public String getContentfulId() {
        return this.contentfulId;
    }

    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
    public String getUkContentfulId() {
        return this.ukContentfulId;
    }

    @Override // com.robinhood.android.brokeragecontent.BrokerageResource
    public String getSgContentfulId() {
        return this.sgContentfulId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = null;
        VARIABLE_APY_DISCLOSURE_LEGACY = new BrokerageDisclosure("VARIABLE_APY_DISCLOSURE_LEGACY", 0, "wyuwqIm7KE3LdUnQMfRbZ", null, str, 6, null);
        CM_GENERAL_APY_DISCLOSURE = new BrokerageDisclosure("CM_GENERAL_APY_DISCLOSURE", 1, "54dl81iaJWY3QKWoYgxgG8", str, null, 6, null);
        String str2 = null;
        CASH_SWEEP_INTEREST_EARNING_DISCLOSURE = new BrokerageDisclosure("CASH_SWEEP_INTEREST_EARNING_DISCLOSURE", 2, "4PtlcQJpYlVd58d0tP8HbY", "3Ok7E3dg0NZjXTstRLba5G", str2, 4, null);
        CM_SPECIFIC_APY_DISCLOSURE = new BrokerageDisclosure("CM_SPECIFIC_APY_DISCLOSURE", 3, "pJ7norIJKJk6tSRrLbEfi", str2, null, 6, null);
        String str3 = null;
        OPTIONS_CHAIN_SIDE_BY_SIDE_SPY_ONBOARDING = new BrokerageDisclosure("OPTIONS_CHAIN_SIDE_BY_SIDE_SPY_ONBOARDING", 7, "0d0amhkbmjhQnvxtHAPGf", "6kB9kmqTdbezcFC6jmvzTM", str3, 4, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        OPTIONS_PROFIT_LOSS_DISCLOSURE = new BrokerageDisclosure("OPTIONS_PROFIT_LOSS_DISCLOSURE", 8, "5y689xUwiho6zXxWidXY8J", str3, null, 6, defaultConstructorMarker);
        INDEX = new BrokerageDisclosure("INDEX", 16, "6I0SuCvI4h35KIFLdvIWA5", "1Lzp8XSiyf6RBCUpmoM8DO", str3, 4, null);
        ADVISORY_CASH = new BrokerageDisclosure("ADVISORY_CASH", 17, "10BVLmn1AyNVt0h0zOstBh", str3, null, 6, defaultConstructorMarker);
        BrokerageDisclosure[] brokerageDisclosureArr$values = $values();
        $VALUES = brokerageDisclosureArr$values;
        $ENTRIES = EnumEntries2.enumEntries(brokerageDisclosureArr$values);
    }

    public static BrokerageDisclosure valueOf(String str) {
        return (BrokerageDisclosure) Enum.valueOf(BrokerageDisclosure.class, str);
    }

    public static BrokerageDisclosure[] values() {
        return (BrokerageDisclosure[]) $VALUES.clone();
    }
}
