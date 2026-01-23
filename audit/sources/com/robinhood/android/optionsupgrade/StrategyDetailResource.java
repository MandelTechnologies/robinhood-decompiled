package com.robinhood.android.optionsupgrade;

import com.robinhood.android.brokeragecontent.BrokerageReferenceManual;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StrategyDetailResource.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/StrategyDetailResource;", "", "titleStringRes", "", "summaryStringRes", "dayLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "nightLottieUrl", "referenceManualTopic", "Lcom/robinhood/android/brokeragecontent/BrokerageReferenceManual;", "<init>", "(Ljava/lang/String;IIILcom/robinhood/shared/remote/assets/LottieUrl;Lcom/robinhood/shared/remote/assets/LottieUrl;Lcom/robinhood/android/brokeragecontent/BrokerageReferenceManual;)V", "getTitleStringRes", "()I", "getSummaryStringRes", "getDayLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getNightLottieUrl", "getReferenceManualTopic", "()Lcom/robinhood/android/brokeragecontent/BrokerageReferenceManual;", "CALENDAR", "CALL_CREDIT", "CALL_DEBIT", "IRON_BUTTERFLY", "IRON_CONDOR", "PUT_CREDIT", "PUT_DEBIT", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class StrategyDetailResource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StrategyDetailResource[] $VALUES;
    public static final StrategyDetailResource CALENDAR = new StrategyDetailResource("CALENDAR", 0, C25121R.string.options_upgrade_calendar_title, C25121R.string.option_discover_strategy_calendar_body, LottieUrl.CALENDAR_SPREAD_DAY, LottieUrl.CALENDAR_SPREAD_NIGHT, BrokerageReferenceManual.CALENDAR);
    public static final StrategyDetailResource CALL_CREDIT = new StrategyDetailResource("CALL_CREDIT", 1, C25121R.string.options_upgrade_call_credit_title, C25121R.string.option_discover_strategy_call_credit_spread_body, LottieUrl.CALL_CREDIT_SPREAD_DAY, LottieUrl.CALL_CREDIT_SPREAD_NIGHT, BrokerageReferenceManual.CALL_CREDIT);
    public static final StrategyDetailResource CALL_DEBIT = new StrategyDetailResource("CALL_DEBIT", 2, C25121R.string.options_upgrade_call_debit_title, C25121R.string.option_discover_strategy_call_debit_spread_body, LottieUrl.CALL_DEBIT_SPREAD_DAY, LottieUrl.CALL_DEBIT_SPREAD_NIGHT, BrokerageReferenceManual.CALL_DEBIT);
    public static final StrategyDetailResource IRON_BUTTERFLY = new StrategyDetailResource("IRON_BUTTERFLY", 3, C25121R.string.options_upgrade_iron_butterfly_title, C25121R.string.option_discover_strategy_iron_butterfly_body, LottieUrl.IRON_BUTTERFLY_DAY, LottieUrl.IRON_BUTTERFLY_NIGHT, BrokerageReferenceManual.IRON_BUTTERFLY);
    public static final StrategyDetailResource IRON_CONDOR = new StrategyDetailResource("IRON_CONDOR", 4, C25121R.string.options_upgrade_iron_condor_title, C25121R.string.option_discover_strategy_iron_condor_body, LottieUrl.IRON_CONDOR_DAY, LottieUrl.IRON_CONDOR_NIGHT, BrokerageReferenceManual.IRON_CONDOR);
    public static final StrategyDetailResource PUT_CREDIT = new StrategyDetailResource("PUT_CREDIT", 5, C25121R.string.options_upgrade_put_credit_title, C25121R.string.option_discover_strategy_put_credit_spread_body, LottieUrl.PUT_CREDIT_SPREAD_DAY, LottieUrl.PUT_CREDIT_SPREAD_NIGHT, BrokerageReferenceManual.PUT_CREDIT);
    public static final StrategyDetailResource PUT_DEBIT = new StrategyDetailResource("PUT_DEBIT", 6, C25121R.string.options_upgrade_put_debit_title, C25121R.string.option_discover_strategy_put_debit_spread_body, LottieUrl.PUT_DEBIT_SPREAD_DAY, LottieUrl.PUT_DEBIT_SPREAD_NIGHT, BrokerageReferenceManual.PUT_DEBIT);
    private final LottieUrl dayLottieUrl;
    private final LottieUrl nightLottieUrl;
    private final BrokerageReferenceManual referenceManualTopic;
    private final int summaryStringRes;
    private final int titleStringRes;

    private static final /* synthetic */ StrategyDetailResource[] $values() {
        return new StrategyDetailResource[]{CALENDAR, CALL_CREDIT, CALL_DEBIT, IRON_BUTTERFLY, IRON_CONDOR, PUT_CREDIT, PUT_DEBIT};
    }

    public static EnumEntries<StrategyDetailResource> getEntries() {
        return $ENTRIES;
    }

    private StrategyDetailResource(String str, int i, int i2, int i3, LottieUrl lottieUrl, LottieUrl lottieUrl2, BrokerageReferenceManual brokerageReferenceManual) {
        this.titleStringRes = i2;
        this.summaryStringRes = i3;
        this.dayLottieUrl = lottieUrl;
        this.nightLottieUrl = lottieUrl2;
        this.referenceManualTopic = brokerageReferenceManual;
    }

    public final int getTitleStringRes() {
        return this.titleStringRes;
    }

    public final int getSummaryStringRes() {
        return this.summaryStringRes;
    }

    public final LottieUrl getDayLottieUrl() {
        return this.dayLottieUrl;
    }

    public final LottieUrl getNightLottieUrl() {
        return this.nightLottieUrl;
    }

    public final BrokerageReferenceManual getReferenceManualTopic() {
        return this.referenceManualTopic;
    }

    static {
        StrategyDetailResource[] strategyDetailResourceArr$values = $values();
        $VALUES = strategyDetailResourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(strategyDetailResourceArr$values);
    }

    public static StrategyDetailResource valueOf(String str) {
        return (StrategyDetailResource) Enum.valueOf(StrategyDetailResource.class, str);
    }

    public static StrategyDetailResource[] values() {
        return (StrategyDetailResource[]) $VALUES.clone();
    }
}
