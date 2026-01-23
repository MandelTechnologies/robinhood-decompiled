package com.robinhood.android.advanced.alert.alerthubsettings;

import com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingsItem;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AlertHubSettingsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDataState;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState;", "<init>", "()V", "reduce", "dataState", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AlertHubSettingsStateProvider implements StateProvider<AlertHubSettingsDataState, AlertHubSettingsViewState> {
    public static final int $stable = 0;

    /* compiled from: AlertHubSettingsStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertHubSettings2.values().length];
            try {
                iArr[AlertHubSettings2.STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertHubSettings2.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public AlertHubSettingsViewState reduce(AlertHubSettingsDataState dataState) {
        AlertHubSettings2 entityType;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AlertHubSettings alertHubSettings = dataState.getAlertHubSettings();
        if (alertHubSettings == null || (entityType = alertHubSettings.getEntityType()) == null) {
            return new AlertHubSettingsViewState.Loading(!dataState.getAreNotificationsEnabled());
        }
        ArrayList arrayList = new ArrayList();
        int i = WhenMappings.$EnumSwitchMapping$0[entityType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            List<Instrument> instruments = dataState.getInstruments();
            if (instruments == null) {
                return new AlertHubSettingsViewState.Loading(!dataState.getAreNotificationsEnabled());
            }
            for (Object obj : dataState.getAlertHubSettings().getAlertSettings()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AlertHubSettingsItem alertHubSettingsItem = (AlertHubSettingsItem) obj;
                Iterator<T> it = instruments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((Instrument) next).getId(), alertHubSettingsItem.getEntityId())) {
                        break;
                    }
                }
                Instrument instrument = (Instrument) next;
                if (instrument != null) {
                    arrayList.add(new AlertHubSettingsViewState.Item.InstrumentItem(instrument, dataState.getAlertHubSettings().getAlertSettings().get(i2).getSubtitle(), dataState.getAlertHubSettings().getEntityType(), dataState.getAlertHubSettings().getAlertSettings().get(i2).getLoggingIdentifier()));
                }
                i2 = i3;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List<UiCurrencyPair> currencyPairs = dataState.getCurrencyPairs();
            if (currencyPairs == null) {
                return new AlertHubSettingsViewState.Loading(!dataState.getAreNotificationsEnabled());
            }
            for (Object obj2 : dataState.getAlertHubSettings().getAlertSettings()) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AlertHubSettingsItem alertHubSettingsItem2 = (AlertHubSettingsItem) obj2;
                Iterator<T> it2 = currencyPairs.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(((UiCurrencyPair) next2).getId(), alertHubSettingsItem2.getEntityId())) {
                        break;
                    }
                }
                UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) next2;
                if (uiCurrencyPair != null) {
                    arrayList.add(new AlertHubSettingsViewState.Item.CryptoItem(uiCurrencyPair, dataState.getAlertHubSettings().getAlertSettings().get(i2).getSubtitle(), dataState.getAlertHubSettings().getEntityType(), dataState.getAlertHubSettings().getAlertSettings().get(i2).getLoggingIdentifier()));
                }
                i2 = i4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!dataState.getItemsToBeRemoved().contains(((AlertHubSettingsViewState.Item) obj3).getId())) {
                arrayList2.add(obj3);
            }
        }
        return new AlertHubSettingsViewState.Loaded(dataState.getAlertHubSettings().getTitle(), dataState.getAlertHubSettings().getDisclosureContentfulId(), arrayList2, dataState.getAlertHubSettings().getNoAlertsTitle(), dataState.getAlertHubSettings().getNoAlertsSubtitle(), !dataState.getAreNotificationsEnabled());
    }
}
