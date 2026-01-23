package com.robinhood.android.options.lib.simulatedreturn.info;

import com.robinhood.android.brokeragecontent.BrokerageResource;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedReturnsContentful.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/info/OptionsSimulatedReturnsContentful;", "Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "", "contentfulId", "", "ukContentfulId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "getUkContentfulId", "INFO_CONTENTFUL_ID", "PRE_TRADE_CONTENTFUL_ID", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnsContentful implements BrokerageResource<OtherMarkdown> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedReturnsContentful[] $VALUES;
    public static final OptionsSimulatedReturnsContentful INFO_CONTENTFUL_ID = new OptionsSimulatedReturnsContentful("INFO_CONTENTFUL_ID", 0, "4SkJPNNXyAsAc27cjklwxx", null, 2, null);
    public static final OptionsSimulatedReturnsContentful PRE_TRADE_CONTENTFUL_ID = new OptionsSimulatedReturnsContentful("PRE_TRADE_CONTENTFUL_ID", 1, "65Z0Ax5wngRsow8CTk9NsR", "5r0SnnBVAYON99VlSXCbjJ");
    private final String contentfulId;
    private final String ukContentfulId;

    private static final /* synthetic */ OptionsSimulatedReturnsContentful[] $values() {
        return new OptionsSimulatedReturnsContentful[]{INFO_CONTENTFUL_ID, PRE_TRADE_CONTENTFUL_ID};
    }

    public static EnumEntries<OptionsSimulatedReturnsContentful> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedReturnsContentful(String str, int i, String str2, String str3) {
        this.contentfulId = str2;
        this.ukContentfulId = str3;
    }

    /* synthetic */ OptionsSimulatedReturnsContentful(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
        OptionsSimulatedReturnsContentful[] optionsSimulatedReturnsContentfulArr$values = $values();
        $VALUES = optionsSimulatedReturnsContentfulArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedReturnsContentfulArr$values);
    }

    public static OptionsSimulatedReturnsContentful valueOf(String str) {
        return (OptionsSimulatedReturnsContentful) Enum.valueOf(OptionsSimulatedReturnsContentful.class, str);
    }

    public static OptionsSimulatedReturnsContentful[] values() {
        return (OptionsSimulatedReturnsContentful[]) $VALUES.clone();
    }
}
