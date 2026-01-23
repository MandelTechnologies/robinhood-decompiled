package com.robinhood.android.gold.lib.hub.api;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiDepositBoostHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0083\u0002\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00072\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiDepositBoostHub;", "", "title", "", "amount", "Lcom/robinhood/android/gold/lib/hub/api/AnimatedAmountContent;", "earningsRowList", "", "Lcom/robinhood/android/gold/lib/hub/api/GoldEarningsSourceRow;", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "payouts", "Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;", "allPayouts", "disclosureMarkdown", "chartData", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsCylinderChartSegment;", "segmentedControl", "Lcom/robinhood/android/gold/lib/hub/api/GoldSegmentedControl;", "jointAccountEarningsRowList", "jointAccountChartData", "jointAccountBanner", "jointAccountPayouts", "jointAccountAllPayouts", "jointAccountDisclosureMarkdown", "jointAccountCta", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/gold/lib/hub/api/AnimatedAmountContent;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/Button;Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Button;)V", "getTitle", "()Ljava/lang/String;", "getAmount", "()Lcom/robinhood/android/gold/lib/hub/api/AnimatedAmountContent;", "getEarningsRowList", "()Ljava/util/List;", "getCta", "()Lcom/robinhood/models/serverdriven/experimental/api/Button;", "getBanner", "()Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "getPayouts", "()Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;", "getAllPayouts", "getDisclosureMarkdown", "getChartData", "getSegmentedControl", "getJointAccountEarningsRowList", "getJointAccountChartData", "getJointAccountBanner", "getJointAccountPayouts", "getJointAccountAllPayouts", "getJointAccountDisclosureMarkdown", "getJointAccountCta", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiDepositBoostHub {
    private final GoldDepositBoostHubPayoutSection allPayouts;
    private final AnimatedAmountContent amount;
    private final InfoBanner<GenericAction> banner;
    private final List<ApiGoldEarningsCylinderChartSegment> chartData;
    private final Button<GenericAction> cta;
    private final String disclosureMarkdown;
    private final List<GoldEarningsSourceRow> earningsRowList;
    private final GoldDepositBoostHubPayoutSection jointAccountAllPayouts;
    private final InfoBanner<GenericAction> jointAccountBanner;
    private final List<ApiGoldEarningsCylinderChartSegment> jointAccountChartData;
    private final Button<GenericAction> jointAccountCta;
    private final String jointAccountDisclosureMarkdown;
    private final List<GoldEarningsSourceRow> jointAccountEarningsRowList;
    private final GoldDepositBoostHubPayoutSection jointAccountPayouts;
    private final GoldDepositBoostHubPayoutSection payouts;
    private final List<GoldSegmentedControl> segmentedControl;
    private final String title;

    public static /* synthetic */ ApiDepositBoostHub copy$default(ApiDepositBoostHub apiDepositBoostHub, String str, AnimatedAmountContent animatedAmountContent, List list, Button button, InfoBanner infoBanner, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection2, String str2, List list2, List list3, List list4, List list5, InfoBanner infoBanner2, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection3, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection4, String str3, Button button2, int i, Object obj) {
        Button button3;
        String str4;
        String str5;
        ApiDepositBoostHub apiDepositBoostHub2;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection5;
        AnimatedAmountContent animatedAmountContent2;
        List list6;
        Button button4;
        InfoBanner infoBanner3;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection6;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection7;
        String str6;
        List list7;
        List list8;
        List list9;
        List list10;
        InfoBanner infoBanner4;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection8;
        String str7 = (i & 1) != 0 ? apiDepositBoostHub.title : str;
        AnimatedAmountContent animatedAmountContent3 = (i & 2) != 0 ? apiDepositBoostHub.amount : animatedAmountContent;
        List list11 = (i & 4) != 0 ? apiDepositBoostHub.earningsRowList : list;
        Button button5 = (i & 8) != 0 ? apiDepositBoostHub.cta : button;
        InfoBanner infoBanner5 = (i & 16) != 0 ? apiDepositBoostHub.banner : infoBanner;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection9 = (i & 32) != 0 ? apiDepositBoostHub.payouts : goldDepositBoostHubPayoutSection;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection10 = (i & 64) != 0 ? apiDepositBoostHub.allPayouts : goldDepositBoostHubPayoutSection2;
        String str8 = (i & 128) != 0 ? apiDepositBoostHub.disclosureMarkdown : str2;
        List list12 = (i & 256) != 0 ? apiDepositBoostHub.chartData : list2;
        List list13 = (i & 512) != 0 ? apiDepositBoostHub.segmentedControl : list3;
        List list14 = (i & 1024) != 0 ? apiDepositBoostHub.jointAccountEarningsRowList : list4;
        List list15 = (i & 2048) != 0 ? apiDepositBoostHub.jointAccountChartData : list5;
        InfoBanner infoBanner6 = (i & 4096) != 0 ? apiDepositBoostHub.jointAccountBanner : infoBanner2;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection11 = (i & 8192) != 0 ? apiDepositBoostHub.jointAccountPayouts : goldDepositBoostHubPayoutSection3;
        String str9 = str7;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection12 = (i & 16384) != 0 ? apiDepositBoostHub.jointAccountAllPayouts : goldDepositBoostHubPayoutSection4;
        String str10 = (i & 32768) != 0 ? apiDepositBoostHub.jointAccountDisclosureMarkdown : str3;
        if ((i & 65536) != 0) {
            str4 = str10;
            button3 = apiDepositBoostHub.jointAccountCta;
            goldDepositBoostHubPayoutSection5 = goldDepositBoostHubPayoutSection12;
            animatedAmountContent2 = animatedAmountContent3;
            list6 = list11;
            button4 = button5;
            infoBanner3 = infoBanner5;
            goldDepositBoostHubPayoutSection6 = goldDepositBoostHubPayoutSection9;
            goldDepositBoostHubPayoutSection7 = goldDepositBoostHubPayoutSection10;
            str6 = str8;
            list7 = list12;
            list8 = list13;
            list9 = list14;
            list10 = list15;
            infoBanner4 = infoBanner6;
            goldDepositBoostHubPayoutSection8 = goldDepositBoostHubPayoutSection11;
            str5 = str9;
            apiDepositBoostHub2 = apiDepositBoostHub;
        } else {
            button3 = button2;
            str4 = str10;
            str5 = str9;
            apiDepositBoostHub2 = apiDepositBoostHub;
            goldDepositBoostHubPayoutSection5 = goldDepositBoostHubPayoutSection12;
            animatedAmountContent2 = animatedAmountContent3;
            list6 = list11;
            button4 = button5;
            infoBanner3 = infoBanner5;
            goldDepositBoostHubPayoutSection6 = goldDepositBoostHubPayoutSection9;
            goldDepositBoostHubPayoutSection7 = goldDepositBoostHubPayoutSection10;
            str6 = str8;
            list7 = list12;
            list8 = list13;
            list9 = list14;
            list10 = list15;
            infoBanner4 = infoBanner6;
            goldDepositBoostHubPayoutSection8 = goldDepositBoostHubPayoutSection11;
        }
        return apiDepositBoostHub2.copy(str5, animatedAmountContent2, list6, button4, infoBanner3, goldDepositBoostHubPayoutSection6, goldDepositBoostHubPayoutSection7, str6, list7, list8, list9, list10, infoBanner4, goldDepositBoostHubPayoutSection8, goldDepositBoostHubPayoutSection5, str4, button3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<GoldSegmentedControl> component10() {
        return this.segmentedControl;
    }

    public final List<GoldEarningsSourceRow> component11() {
        return this.jointAccountEarningsRowList;
    }

    public final List<ApiGoldEarningsCylinderChartSegment> component12() {
        return this.jointAccountChartData;
    }

    public final InfoBanner<GenericAction> component13() {
        return this.jointAccountBanner;
    }

    /* renamed from: component14, reason: from getter */
    public final GoldDepositBoostHubPayoutSection getJointAccountPayouts() {
        return this.jointAccountPayouts;
    }

    /* renamed from: component15, reason: from getter */
    public final GoldDepositBoostHubPayoutSection getJointAccountAllPayouts() {
        return this.jointAccountAllPayouts;
    }

    /* renamed from: component16, reason: from getter */
    public final String getJointAccountDisclosureMarkdown() {
        return this.jointAccountDisclosureMarkdown;
    }

    public final Button<GenericAction> component17() {
        return this.jointAccountCta;
    }

    /* renamed from: component2, reason: from getter */
    public final AnimatedAmountContent getAmount() {
        return this.amount;
    }

    public final List<GoldEarningsSourceRow> component3() {
        return this.earningsRowList;
    }

    public final Button<GenericAction> component4() {
        return this.cta;
    }

    public final InfoBanner<GenericAction> component5() {
        return this.banner;
    }

    /* renamed from: component6, reason: from getter */
    public final GoldDepositBoostHubPayoutSection getPayouts() {
        return this.payouts;
    }

    /* renamed from: component7, reason: from getter */
    public final GoldDepositBoostHubPayoutSection getAllPayouts() {
        return this.allPayouts;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final List<ApiGoldEarningsCylinderChartSegment> component9() {
        return this.chartData;
    }

    public final ApiDepositBoostHub copy(String title, AnimatedAmountContent amount, @Json(name = "earnings_row_list") List<GoldEarningsSourceRow> earningsRowList, Button<? extends GenericAction> cta, InfoBanner<? extends GenericAction> banner, GoldDepositBoostHubPayoutSection payouts, @Json(name = "all_payouts") GoldDepositBoostHubPayoutSection allPayouts, @Json(name = "disclosure_markdown") String disclosureMarkdown, @Json(name = "chart_data") List<ApiGoldEarningsCylinderChartSegment> chartData, @Json(name = "segmented_control") List<GoldSegmentedControl> segmentedControl, @Json(name = "earnings_row_list_ja") List<GoldEarningsSourceRow> jointAccountEarningsRowList, @Json(name = "chart_data_ja") List<ApiGoldEarningsCylinderChartSegment> jointAccountChartData, @Json(name = "banner_ja") InfoBanner<? extends GenericAction> jointAccountBanner, @Json(name = "payouts_ja") GoldDepositBoostHubPayoutSection jointAccountPayouts, @Json(name = "all_payouts_ja") GoldDepositBoostHubPayoutSection jointAccountAllPayouts, @Json(name = "disclosure_markdown_ja") String jointAccountDisclosureMarkdown, @Json(name = "cta_ja") Button<? extends GenericAction> jointAccountCta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(earningsRowList, "earningsRowList");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        return new ApiDepositBoostHub(title, amount, earningsRowList, cta, banner, payouts, allPayouts, disclosureMarkdown, chartData, segmentedControl, jointAccountEarningsRowList, jointAccountChartData, jointAccountBanner, jointAccountPayouts, jointAccountAllPayouts, jointAccountDisclosureMarkdown, jointAccountCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiDepositBoostHub)) {
            return false;
        }
        ApiDepositBoostHub apiDepositBoostHub = (ApiDepositBoostHub) other;
        return Intrinsics.areEqual(this.title, apiDepositBoostHub.title) && Intrinsics.areEqual(this.amount, apiDepositBoostHub.amount) && Intrinsics.areEqual(this.earningsRowList, apiDepositBoostHub.earningsRowList) && Intrinsics.areEqual(this.cta, apiDepositBoostHub.cta) && Intrinsics.areEqual(this.banner, apiDepositBoostHub.banner) && Intrinsics.areEqual(this.payouts, apiDepositBoostHub.payouts) && Intrinsics.areEqual(this.allPayouts, apiDepositBoostHub.allPayouts) && Intrinsics.areEqual(this.disclosureMarkdown, apiDepositBoostHub.disclosureMarkdown) && Intrinsics.areEqual(this.chartData, apiDepositBoostHub.chartData) && Intrinsics.areEqual(this.segmentedControl, apiDepositBoostHub.segmentedControl) && Intrinsics.areEqual(this.jointAccountEarningsRowList, apiDepositBoostHub.jointAccountEarningsRowList) && Intrinsics.areEqual(this.jointAccountChartData, apiDepositBoostHub.jointAccountChartData) && Intrinsics.areEqual(this.jointAccountBanner, apiDepositBoostHub.jointAccountBanner) && Intrinsics.areEqual(this.jointAccountPayouts, apiDepositBoostHub.jointAccountPayouts) && Intrinsics.areEqual(this.jointAccountAllPayouts, apiDepositBoostHub.jointAccountAllPayouts) && Intrinsics.areEqual(this.jointAccountDisclosureMarkdown, apiDepositBoostHub.jointAccountDisclosureMarkdown) && Intrinsics.areEqual(this.jointAccountCta, apiDepositBoostHub.jointAccountCta);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.amount.hashCode()) * 31) + this.earningsRowList.hashCode()) * 31;
        Button<GenericAction> button = this.cta;
        int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
        InfoBanner<GenericAction> infoBanner = this.banner;
        int iHashCode3 = (iHashCode2 + (infoBanner == null ? 0 : infoBanner.hashCode())) * 31;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection = this.payouts;
        int iHashCode4 = (iHashCode3 + (goldDepositBoostHubPayoutSection == null ? 0 : goldDepositBoostHubPayoutSection.hashCode())) * 31;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection2 = this.allPayouts;
        int iHashCode5 = (iHashCode4 + (goldDepositBoostHubPayoutSection2 == null ? 0 : goldDepositBoostHubPayoutSection2.hashCode())) * 31;
        String str = this.disclosureMarkdown;
        int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.chartData.hashCode()) * 31;
        List<GoldSegmentedControl> list = this.segmentedControl;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<GoldEarningsSourceRow> list2 = this.jointAccountEarningsRowList;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ApiGoldEarningsCylinderChartSegment> list3 = this.jointAccountChartData;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        InfoBanner<GenericAction> infoBanner2 = this.jointAccountBanner;
        int iHashCode10 = (iHashCode9 + (infoBanner2 == null ? 0 : infoBanner2.hashCode())) * 31;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection3 = this.jointAccountPayouts;
        int iHashCode11 = (iHashCode10 + (goldDepositBoostHubPayoutSection3 == null ? 0 : goldDepositBoostHubPayoutSection3.hashCode())) * 31;
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection4 = this.jointAccountAllPayouts;
        int iHashCode12 = (iHashCode11 + (goldDepositBoostHubPayoutSection4 == null ? 0 : goldDepositBoostHubPayoutSection4.hashCode())) * 31;
        String str2 = this.jointAccountDisclosureMarkdown;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Button<GenericAction> button2 = this.jointAccountCta;
        return iHashCode13 + (button2 != null ? button2.hashCode() : 0);
    }

    public String toString() {
        return "ApiDepositBoostHub(title=" + this.title + ", amount=" + this.amount + ", earningsRowList=" + this.earningsRowList + ", cta=" + this.cta + ", banner=" + this.banner + ", payouts=" + this.payouts + ", allPayouts=" + this.allPayouts + ", disclosureMarkdown=" + this.disclosureMarkdown + ", chartData=" + this.chartData + ", segmentedControl=" + this.segmentedControl + ", jointAccountEarningsRowList=" + this.jointAccountEarningsRowList + ", jointAccountChartData=" + this.jointAccountChartData + ", jointAccountBanner=" + this.jointAccountBanner + ", jointAccountPayouts=" + this.jointAccountPayouts + ", jointAccountAllPayouts=" + this.jointAccountAllPayouts + ", jointAccountDisclosureMarkdown=" + this.jointAccountDisclosureMarkdown + ", jointAccountCta=" + this.jointAccountCta + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiDepositBoostHub(String title, AnimatedAmountContent amount, @Json(name = "earnings_row_list") List<GoldEarningsSourceRow> earningsRowList, Button<? extends GenericAction> button, InfoBanner<? extends GenericAction> infoBanner, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection, @Json(name = "all_payouts") GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection2, @Json(name = "disclosure_markdown") String str, @Json(name = "chart_data") List<ApiGoldEarningsCylinderChartSegment> chartData, @Json(name = "segmented_control") List<GoldSegmentedControl> list, @Json(name = "earnings_row_list_ja") List<GoldEarningsSourceRow> list2, @Json(name = "chart_data_ja") List<ApiGoldEarningsCylinderChartSegment> list3, @Json(name = "banner_ja") InfoBanner<? extends GenericAction> infoBanner2, @Json(name = "payouts_ja") GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection3, @Json(name = "all_payouts_ja") GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection4, @Json(name = "disclosure_markdown_ja") String str2, @Json(name = "cta_ja") Button<? extends GenericAction> button2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(earningsRowList, "earningsRowList");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.title = title;
        this.amount = amount;
        this.earningsRowList = earningsRowList;
        this.cta = button;
        this.banner = infoBanner;
        this.payouts = goldDepositBoostHubPayoutSection;
        this.allPayouts = goldDepositBoostHubPayoutSection2;
        this.disclosureMarkdown = str;
        this.chartData = chartData;
        this.segmentedControl = list;
        this.jointAccountEarningsRowList = list2;
        this.jointAccountChartData = list3;
        this.jointAccountBanner = infoBanner2;
        this.jointAccountPayouts = goldDepositBoostHubPayoutSection3;
        this.jointAccountAllPayouts = goldDepositBoostHubPayoutSection4;
        this.jointAccountDisclosureMarkdown = str2;
        this.jointAccountCta = button2;
    }

    public /* synthetic */ ApiDepositBoostHub(String str, AnimatedAmountContent animatedAmountContent, List list, Button button, InfoBanner infoBanner, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection2, String str2, List list2, List list3, List list4, List list5, InfoBanner infoBanner2, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection3, GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection4, String str3, Button button2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, animatedAmountContent, list, button, infoBanner, goldDepositBoostHubPayoutSection, goldDepositBoostHubPayoutSection2, str2, list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : list4, (i & 2048) != 0 ? null : list5, (i & 4096) != 0 ? null : infoBanner2, (i & 8192) != 0 ? null : goldDepositBoostHubPayoutSection3, (i & 16384) != 0 ? null : goldDepositBoostHubPayoutSection4, (32768 & i) != 0 ? null : str3, (i & 65536) != 0 ? null : button2);
    }

    public final String getTitle() {
        return this.title;
    }

    public final AnimatedAmountContent getAmount() {
        return this.amount;
    }

    public final List<GoldEarningsSourceRow> getEarningsRowList() {
        return this.earningsRowList;
    }

    public final Button<GenericAction> getCta() {
        return this.cta;
    }

    public final InfoBanner<GenericAction> getBanner() {
        return this.banner;
    }

    public final GoldDepositBoostHubPayoutSection getPayouts() {
        return this.payouts;
    }

    public final GoldDepositBoostHubPayoutSection getAllPayouts() {
        return this.allPayouts;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final List<ApiGoldEarningsCylinderChartSegment> getChartData() {
        return this.chartData;
    }

    public final List<GoldSegmentedControl> getSegmentedControl() {
        return this.segmentedControl;
    }

    public final List<GoldEarningsSourceRow> getJointAccountEarningsRowList() {
        return this.jointAccountEarningsRowList;
    }

    public final List<ApiGoldEarningsCylinderChartSegment> getJointAccountChartData() {
        return this.jointAccountChartData;
    }

    public final InfoBanner<GenericAction> getJointAccountBanner() {
        return this.jointAccountBanner;
    }

    public final GoldDepositBoostHubPayoutSection getJointAccountPayouts() {
        return this.jointAccountPayouts;
    }

    public final GoldDepositBoostHubPayoutSection getJointAccountAllPayouts() {
        return this.jointAccountAllPayouts;
    }

    public final String getJointAccountDisclosureMarkdown() {
        return this.jointAccountDisclosureMarkdown;
    }

    public final Button<GenericAction> getJointAccountCta() {
        return this.jointAccountCta;
    }
}
