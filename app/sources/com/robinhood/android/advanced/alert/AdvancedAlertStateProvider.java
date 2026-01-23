package com.robinhood.android.advanced.alert;

import com.robinhood.android.advanced.alert.AdvancedAlertViewState;
import com.robinhood.android.advanced.alert.utils.AlertHubUiResources2;
import com.robinhood.android.advanced.alert.utils.AlertSettingWithResource2;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResourcesContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AdvancedAlertStateProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertDataState;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState;", "<init>", "()V", "reduce", "dataState", "replaceAlertCount", "", "count", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedAlertStateProvider implements StateProvider<AdvancedAlertDataState, AdvancedAlertViewState> {
    public static final int $stable = 0;

    /* compiled from: AdvancedAlertStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertType.values().length];
            try {
                iArr[AlertType.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertType.INDICATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f1 A[PHI: r16
      0x01f1: PHI (r16v4 java.lang.String) = (r16v1 java.lang.String), (r16v6 java.lang.String) binds: [B:113:0x0209, B:104:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdvancedAlertViewState reduce(AdvancedAlertDataState dataState) {
        List listEmptyList;
        List listEmptyList2;
        List list;
        String indicatorAlertsLimitReachedMessage;
        AlertHubUiResourcesContent content;
        AlertHubUiResourcesContent content2;
        AlertHubUiResourcesContent content3;
        AlertHubUiResourcesContent content4;
        String indicatorTabTitle;
        AlertHubUiResourcesContent content5;
        String priceTabTitle;
        AlertHubUiResourcesContent content6;
        AdvancedAlertViewState.AlertSettingWithResource alertSettingWithResource;
        AdvancedAlertViewState.AlertSettingWithResource listDisplayResource;
        List<AlertHubSettingItem> settings;
        List listFilterNotNull;
        List<AlertHubSettingItem> settings2;
        List listFilterNotNull2;
        String id;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean indicatorAlertsLimitReached = false;
        boolean z = dataState.getActiveAlertType() == AlertType.PRICE;
        AdvancedAlert advancedAlert = dataState.getAdvancedAlert();
        if (advancedAlert == null || (settings2 = advancedAlert.getSettings()) == null || (listFilterNotNull2 = CollectionsKt.filterNotNull(settings2)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : listFilterNotNull2) {
                AlertHubSettingItem alertHubSettingItem = (AlertHubSettingItem) obj;
                if (CollectionsKt.contains(AdvancedAlertViewState.INSTANCE.getPRICE_ALERT_TYPES(), alertHubSettingItem.getSettingType()) && (id = alertHubSettingItem.getId()) != null && id.length() > 0) {
                    listEmptyList.add(obj);
                }
            }
        }
        List list2 = listEmptyList;
        AdvancedAlert advancedAlert2 = dataState.getAdvancedAlert();
        if (advancedAlert2 == null || (settings = advancedAlert2.getSettings()) == null || (listFilterNotNull = CollectionsKt.filterNotNull(settings)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            listEmptyList2 = new ArrayList();
            for (Object obj2 : listFilterNotNull) {
                if (!CollectionsKt.contains(AdvancedAlertViewState.INSTANCE.getPRICE_ALERT_TYPES(), ((AlertHubSettingItem) obj2).getSettingType())) {
                    listEmptyList2.add(obj2);
                }
            }
        }
        List list3 = listEmptyList2;
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getActiveAlertType().ordinal()];
        if (i == 1) {
            list = list2;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            list = list3;
        }
        List<IndicatorState> indicatorStates = dataState.getIndicatorStateList().getIndicatorStates();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indicatorStates, 10));
        Iterator<T> it = indicatorStates.iterator();
        while (it.hasNext()) {
            arrayList.add(((IndicatorState) it.next()).getApiTechnicalIndicator());
        }
        List<AlertHubSettingItem> list4 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (AlertHubSettingItem alertHubSettingItem2 : list4) {
            AlertHubUiResources uiResource = dataState.getUiResource();
            if (uiResource == null || (listDisplayResource = AlertHubUiResources2.getListDisplayResource(uiResource, alertHubSettingItem2, dataState.getMaximumFractionDigits())) == null || (alertSettingWithResource = AlertSettingWithResource2.addIndicator(listDisplayResource, arrayList)) == null) {
                alertSettingWithResource = new AdvancedAlertViewState.AlertSettingWithResource(alertHubSettingItem2, "", "", null, false, 16, null);
            }
            alertSettingWithResource.setAppNotificationEnabled(dataState.isAppNotificationEnabled());
            arrayList2.add(alertSettingWithResource);
        }
        AlertHubUiResources uiResource2 = dataState.getUiResource();
        AdvancedAlertViewState.PriceAlertSelectorState priceAlertSelectorState = new AdvancedAlertViewState.PriceAlertSelectorState(z, (uiResource2 == null || (content6 = uiResource2.getContent()) == null) ? null : content6.getPrice());
        AdvancedAlertViewState.AlertSelectorState alertSelectorState = new AdvancedAlertViewState.AlertSelectorState(z, dataState.getUiResource());
        AdvancedAlert advancedAlert3 = dataState.getAdvancedAlert();
        String uiResourcesDigest = advancedAlert3 != null ? advancedAlert3.getUiResourcesDigest() : null;
        AlertType activeAlertType = dataState.getActiveAlertType();
        AlertHubUiResources uiResource3 = dataState.getUiResource();
        String strReplaceAlertCount = (uiResource3 == null || (content5 = uiResource3.getContent()) == null || (priceTabTitle = content5.getPriceTabTitle()) == null) ? null : replaceAlertCount(priceTabTitle, list2.size());
        AlertHubUiResources uiResource4 = dataState.getUiResource();
        AdvancedAlertViewState.SegmentedControlState segmentedControlState = new AdvancedAlertViewState.SegmentedControlState(activeAlertType, strReplaceAlertCount, (uiResource4 == null || (content4 = uiResource4.getContent()) == null || (indicatorTabTitle = content4.getIndicatorTabTitle()) == null) ? null : replaceAlertCount(indicatorTabTitle, list3.size()), list.size());
        AlertHubUiResources uiResource5 = dataState.getUiResource();
        String addAlertButtonTitle = (uiResource5 == null || (content3 = uiResource5.getContent()) == null) ? null : content3.getAddAlertButtonTitle();
        String str = "";
        if (addAlertButtonTitle == null) {
            addAlertButtonTitle = "";
        }
        if (z) {
            AlertHubUiResources uiResource6 = dataState.getUiResource();
            indicatorAlertsLimitReachedMessage = (uiResource6 == null || (content2 = uiResource6.getContent()) == null) ? null : content2.getPriceAlertsLimitReachedMessage();
            if (indicatorAlertsLimitReachedMessage != null) {
                str = indicatorAlertsLimitReachedMessage;
            }
        } else {
            AlertHubUiResources uiResource7 = dataState.getUiResource();
            indicatorAlertsLimitReachedMessage = (uiResource7 == null || (content = uiResource7.getContent()) == null) ? null : content.getIndicatorAlertsLimitReachedMessage();
            if (indicatorAlertsLimitReachedMessage != null) {
            }
        }
        if (z) {
            AdvancedAlert advancedAlert4 = dataState.getAdvancedAlert();
            if (advancedAlert4 != null) {
                indicatorAlertsLimitReached = advancedAlert4.getPriceAlertsLimitReached();
            }
        } else {
            AdvancedAlert advancedAlert5 = dataState.getAdvancedAlert();
            if (advancedAlert5 != null) {
                indicatorAlertsLimitReached = advancedAlert5.getIndicatorAlertsLimitReached();
            }
        }
        return new AdvancedAlertViewState(z, list2, list3, list, arrayList2, priceAlertSelectorState, alertSelectorState, uiResourcesDigest, segmentedControlState, new AdvancedAlertViewState.AddAlertTypeState(addAlertButtonTitle, str, indicatorAlertsLimitReached, dataState.isAppNotificationEnabled()), dataState.getAdvancedAlert(), dataState.getUiResource());
    }

    private final String replaceAlertCount(String str, int i) {
        if (i != 0) {
            return StringsKt.replace$default(str, AlertHubUiResources.ALERT_COUNT_PARAM, String.valueOf(i), false, 4, (Object) null);
        }
        return StringsKt.replace$default(str, AlertHubUiResources.ALERT_COUNT_PARAM_WITH_BRACKET, "", false, 4, (Object) null);
    }
}
