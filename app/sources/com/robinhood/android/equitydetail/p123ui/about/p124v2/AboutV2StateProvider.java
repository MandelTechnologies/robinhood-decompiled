package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AboutV2StateProvider.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J&\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002J'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u0014J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2StateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2DataState;", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ViewState;", "<init>", "()V", "reduce", "dataState", "getDescription", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "fundamental", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;", "aboutTextResource", "getFundamentalInfoList", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Info;", "resourceStrings", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ResourceStrings;", "getFundamentalInfoList$feature_equity_detail_externalDebug", "getEtpDetailsInfoList", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "isRhv", "", "getEtpDetailsInfoList$feature_equity_detail_externalDebug", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class AboutV2StateProvider implements StateProvider<AboutV2DataState, AboutV2ViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AboutV2ViewState reduce(AboutV2DataState dataState) {
        ImmutableList3<AboutV2Info> etpDetailsInfoList$feature_equity_detail_externalDebug;
        AboutV2ViewState2 aboutV2ViewState2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Instrument instrument = dataState.getInstrument();
        Fundamental fundamental = dataState.getFundamental();
        AboutV2ResourceStrings resourceStrings = dataState.getResourceStrings();
        String description = getDescription(instrument, fundamental, resourceStrings != null ? resourceStrings.getAboutText() : null);
        if (dataState.getEtpDetails() == null) {
            etpDetailsInfoList$feature_equity_detail_externalDebug = getFundamentalInfoList$feature_equity_detail_externalDebug(dataState.getFundamental(), dataState.getResourceStrings());
        } else {
            EtpDetails etpDetails = dataState.getEtpDetails();
            AboutV2ResourceStrings resourceStrings2 = dataState.getResourceStrings();
            Instrument instrument2 = dataState.getInstrument();
            boolean z = false;
            if (instrument2 != null && instrument2.isRhvCef()) {
                z = true;
            }
            etpDetailsInfoList$feature_equity_detail_externalDebug = getEtpDetailsInfoList$feature_equity_detail_externalDebug(etpDetails, resourceStrings2, z);
        }
        ImmutableList3<AboutV2Info> immutableList3 = etpDetailsInfoList$feature_equity_detail_externalDebug;
        Instrument instrument3 = dataState.getInstrument();
        if (instrument3 == null || !instrument3.isRhvCef()) {
            BigDecimal todayPercentChange = dataState.getTodayPercentChange();
            if (todayPercentChange == null || !BigDecimals7.isPositive(todayPercentChange)) {
                BigDecimal todayPercentChange2 = dataState.getTodayPercentChange();
                aboutV2ViewState2 = (todayPercentChange2 == null || !BigDecimals7.isNegative(todayPercentChange2)) ? AboutV2ViewState2.NONE : AboutV2ViewState2.NEGATIVE;
            } else {
                aboutV2ViewState2 = AboutV2ViewState2.POSITIVE;
            }
        } else {
            aboutV2ViewState2 = AboutV2ViewState2.NONE;
        }
        return new AboutV2ViewState(description, immutableList3, aboutV2ViewState2, dataState.getDoesAboutTextOverflow(), dataState.isExpanded(), dataState.isLoading());
    }

    private final String getDescription(Instrument instrument, Fundamental fundamental, String aboutTextResource) {
        if (instrument == null || fundamental == null || aboutTextResource == null) {
            return "";
        }
        String description = fundamental.getDescription();
        String str = String.format(aboutTextResource, Arrays.copyOf(new Object[]{description, instrument.getSymbol(), StringsKt.trimEnd(instrument.getName(), '.')}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        if (instrument.isRhvCef()) {
            return (description == null || StringsKt.isBlank(description)) ? str : description;
        }
        String simpleName = instrument.getSimpleName();
        return (simpleName == null || StringsKt.isBlank(simpleName) || Intrinsics.areEqual(instrument.getSimpleName(), instrument.getName())) ? description == null ? "" : description : str;
    }

    public final ImmutableList3<AboutV2Info> getFundamentalInfoList$feature_equity_detail_externalDebug(Fundamental fundamental, AboutV2ResourceStrings resourceStrings) {
        String headquartersState;
        if (fundamental == null || resourceStrings == null) {
            return extensions2.persistentListOf();
        }
        ArrayList arrayList = new ArrayList();
        AboutV2StateProvider5.addItem(arrayList, resourceStrings.getCeo(), fundamental.getCeo(), EducationTourElementIds.ABOUT_CEO_ELEMENT_ID);
        AboutV2StateProvider5.addItem(arrayList, resourceStrings.getYearFounded(), fundamental.getYearFounded(), EducationTourElementIds.ABOUT_FOUNDED_YEAR_ELEMENT_ID);
        AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEmployeeCount(), fundamental.getNumEmployees(), EducationTourElementIds.ABOUT_EMPLOYEE_COUNT_ELEMENT_ID, new AboutV2StateProvider4(Formats.getIntegerFormat()));
        String headquartersCity = fundamental.getHeadquartersCity();
        Tuples2 tuples2 = null;
        if (headquartersCity != null && (headquartersState = fundamental.getHeadquartersState()) != null) {
            tuples2 = new Tuples2(headquartersCity, headquartersState);
        }
        final String headquarterFormat = resourceStrings.getHeadquarterFormat();
        AboutV2StateProvider5.addItem(arrayList, resourceStrings.getHeadquarterLabel(), tuples2, EducationTourElementIds.ABOUT_HEADQUARTERS_ELEMENT_ID, new Function1() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2StateProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AboutV2StateProvider.getFundamentalInfoList$lambda$3$lambda$2(headquarterFormat, (Tuples2) obj);
            }
        });
        return extensions2.toPersistentList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFundamentalInfoList$lambda$3$lambda$2(String str, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        String str2 = String.format(str, Arrays.copyOf(new Object[]{(String) tuples2.component1(), (String) tuples2.component2()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* renamed from: getEtpDetailsInfoList$feature_equity_detail_externalDebug$default */
    public static /* synthetic */ ImmutableList3 m1969x52ba79a7(AboutV2StateProvider aboutV2StateProvider, EtpDetails etpDetails, AboutV2ResourceStrings aboutV2ResourceStrings, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return aboutV2StateProvider.getEtpDetailsInfoList$feature_equity_detail_externalDebug(etpDetails, aboutV2ResourceStrings, z);
    }

    public final ImmutableList3<AboutV2Info> getEtpDetailsInfoList$feature_equity_detail_externalDebug(EtpDetails etpDetails, AboutV2ResourceStrings resourceStrings, boolean isRhv) {
        if (etpDetails == null || resourceStrings == null) {
            return extensions2.persistentListOf();
        }
        ArrayList arrayList = new ArrayList();
        if (isRhv) {
            AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEtpCategory(), etpDetails.getCategory(), EducationTourElementIds.ABOUT_CATEGORY_ELEMENT_ID);
            AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEtpTotalHoldings(), etpDetails.getTotalHoldings(), EducationTourElementIds.ABOUT_NUM_HOLDINGS_ELEMENT_ID, new Function1() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2StateProvider$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return String.valueOf(((Integer) obj).intValue());
                }
            });
            AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEtpInceptionDate(), etpDetails.getInceptionDate(), EducationTourElementIds.ABOUT_INCEPTION_DATE_ELEMENT_ID, new AboutV2StateProvider2(LocalDateFormatter.MEDIUM));
        } else {
            AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEtpIndexTracker(), etpDetails.getIndexTracked(), EducationTourElementIds.ABOUT_INDEX_TRACKED_ELEMENT_ID);
            if (etpDetails.isActivelyManaged()) {
                AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEtpManagedLabel(), resourceStrings.getEtpManagedDescription(), EducationTourElementIds.ABOUT_FUND_MANAGEMENT_ELEMENT_ID);
            }
            AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEtpCategory(), etpDetails.getCategory(), EducationTourElementIds.ABOUT_CATEGORY_ELEMENT_ID);
            AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEtpTotalHoldings(), etpDetails.getTotalHoldings(), EducationTourElementIds.ABOUT_NUM_HOLDINGS_ELEMENT_ID, new Function1() { // from class: com.robinhood.android.equitydetail.ui.about.v2.AboutV2StateProvider$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return String.valueOf(((Integer) obj).intValue());
                }
            });
            AboutV2StateProvider5.addItem(arrayList, resourceStrings.getEtpInceptionDate(), etpDetails.getInceptionDate(), EducationTourElementIds.ABOUT_INCEPTION_DATE_ELEMENT_ID, new AboutV2StateProvider3(LocalDateFormatter.MEDIUM));
        }
        return extensions2.toPersistentList(arrayList);
    }
}
