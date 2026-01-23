package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.ValueProp;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: FlatCashbackInstantAccessStateProvider.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessDataState;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessViewState;", "<init>", "()V", "reduce", "dataState", "getLoadedState", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState$Loaded;", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "accessSource", "Lcom/robinhood/android/cash/flat/cashback/ui/AccessSource;", "trialStatus", "Lcom/robinhood/android/cash/flat/cashback/ui/TrialStatus;", "getContentKeys", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessStateProvider$ContentKeyMapping;", "replaceNull", "", "entry", "ContentKeyMapping", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlatCashbackInstantAccessStateProvider implements StateProvider<FlatCashbackInstantAccessDataState, BaseFlatCashbackViewState<FlatCashbackInstantAccessViewState>> {
    public static final int $stable = 0;

    /* compiled from: FlatCashbackInstantAccessStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrialRequest2.values().length];
            try {
                iArr[TrialRequest2.MANUAL_DIRECT_DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrialRequest2.AUTOMATIC_DIRECT_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrialRequest2.RECURRING_ACH_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public BaseFlatCashbackViewState<FlatCashbackInstantAccessViewState> reduce(FlatCashbackInstantAccessDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getContent() == null || dataState.getTrialStatus() == null) {
            return dataState.getError() != null ? new BaseFlatCashbackViewState.Error(dataState.getError()) : new BaseFlatCashbackViewState.Loading(FlatCashbackInstantAccessViewState.INSTANCE.getMock$feature_cash_flat_cashback_externalDebug());
        }
        return getLoadedState(dataState.getContent(), dataState.getAccessSource(), dataState.getTrialStatus());
    }

    private final BaseFlatCashbackViewState.Loaded<FlatCashbackInstantAccessViewState> getLoadedState(ProductMarketingContent content, TrialRequest2 accessSource, FlatCashbackInstantAccessDataState2 trialStatus) {
        ContentKeyMapping contentKeys = getContentKeys(accessSource, trialStatus);
        for (ProductMarketingContent.Feature feature : content.getFeatures()) {
            if (Intrinsics.areEqual(feature.getIdentifier(), contentKeys.getHeaderIdentifier())) {
                List<ProductMarketingContent.Feature> features = content.getFeatures();
                ArrayList<ProductMarketingContent.Feature> arrayList = new ArrayList();
                for (Object obj : features) {
                    if (StringsKt.startsWith$default(((ProductMarketingContent.Feature) obj).getIdentifier(), contentKeys.getBulletPrefix(), false, 2, (Object) null)) {
                        arrayList.add(obj);
                    }
                }
                String title = feature.getTitle();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (ProductMarketingContent.Feature feature2 : arrayList) {
                    arrayList2.add(new ValueProp(replaceNull(feature2.getTitle()), feature2.getDescription()));
                }
                return new BaseFlatCashbackViewState.Loaded<>(new FlatCashbackInstantAccessViewState(title, arrayList2));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final ContentKeyMapping getContentKeys(TrialRequest2 accessSource, FlatCashbackInstantAccessDataState2 trialStatus) {
        int i = WhenMappings.$EnumSwitchMapping$0[accessSource.ordinal()];
        if (i == 1) {
            if (trialStatus == FlatCashbackInstantAccessDataState2.ACTIVE) {
                return ContentKeyMapping.MANUAL_DIRECT_DEPOSIT_TRIAL_ELIGIBLE;
            }
            return ContentKeyMapping.MANUAL_DIRECT_DEPOSIT_TRIAL_INELIGIBLE;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return ContentKeyMapping.RECURRING_ACH_DEPOSIT;
        }
        if (trialStatus == FlatCashbackInstantAccessDataState2.ACTIVE) {
            return ContentKeyMapping.AUTOMATIC_DIRECT_DEPOSIT_TRIAL_ELIGIBLE;
        }
        return ContentKeyMapping.AUTOMATIC_DIRECT_DEPOSIT_TRIAL_INELIGIBLE;
    }

    private final String replaceNull(String entry) {
        if (Intrinsics.areEqual(entry, "-") || entry.length() == 0) {
            return null;
        }
        return entry;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlatCashbackInstantAccessStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessStateProvider$ContentKeyMapping;", "", "headerIdentifier", "", "bulletPrefix", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getHeaderIdentifier", "()Ljava/lang/String;", "getBulletPrefix", "MANUAL_DIRECT_DEPOSIT_TRIAL_ELIGIBLE", "MANUAL_DIRECT_DEPOSIT_TRIAL_INELIGIBLE", "AUTOMATIC_DIRECT_DEPOSIT_TRIAL_ELIGIBLE", "AUTOMATIC_DIRECT_DEPOSIT_TRIAL_INELIGIBLE", "RECURRING_ACH_DEPOSIT", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContentKeyMapping {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentKeyMapping[] $VALUES;
        private final String bulletPrefix;
        private final String headerIdentifier;
        public static final ContentKeyMapping MANUAL_DIRECT_DEPOSIT_TRIAL_ELIGIBLE = new ContentKeyMapping("MANUAL_DIRECT_DEPOSIT_TRIAL_ELIGIBLE", 0, "dd-manual-title", "dd-manual-item-");
        public static final ContentKeyMapping MANUAL_DIRECT_DEPOSIT_TRIAL_INELIGIBLE = new ContentKeyMapping("MANUAL_DIRECT_DEPOSIT_TRIAL_INELIGIBLE", 1, "dd-manual-no-trial-title", "dd-manual-no-trial-item-");
        public static final ContentKeyMapping AUTOMATIC_DIRECT_DEPOSIT_TRIAL_ELIGIBLE = new ContentKeyMapping("AUTOMATIC_DIRECT_DEPOSIT_TRIAL_ELIGIBLE", 2, "dd-title", "dd-item-");
        public static final ContentKeyMapping AUTOMATIC_DIRECT_DEPOSIT_TRIAL_INELIGIBLE = new ContentKeyMapping("AUTOMATIC_DIRECT_DEPOSIT_TRIAL_INELIGIBLE", 3, "dd-no-trial-title", "dd-no-trial-item-");
        public static final ContentKeyMapping RECURRING_ACH_DEPOSIT = new ContentKeyMapping("RECURRING_ACH_DEPOSIT", 4, "recurring-title", "recurring-item-");

        private static final /* synthetic */ ContentKeyMapping[] $values() {
            return new ContentKeyMapping[]{MANUAL_DIRECT_DEPOSIT_TRIAL_ELIGIBLE, MANUAL_DIRECT_DEPOSIT_TRIAL_INELIGIBLE, AUTOMATIC_DIRECT_DEPOSIT_TRIAL_ELIGIBLE, AUTOMATIC_DIRECT_DEPOSIT_TRIAL_INELIGIBLE, RECURRING_ACH_DEPOSIT};
        }

        public static EnumEntries<ContentKeyMapping> getEntries() {
            return $ENTRIES;
        }

        private ContentKeyMapping(String str, int i, String str2, String str3) {
            this.headerIdentifier = str2;
            this.bulletPrefix = str3;
        }

        public final String getBulletPrefix() {
            return this.bulletPrefix;
        }

        public final String getHeaderIdentifier() {
            return this.headerIdentifier;
        }

        static {
            ContentKeyMapping[] contentKeyMappingArr$values = $values();
            $VALUES = contentKeyMappingArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentKeyMappingArr$values);
        }

        public static ContentKeyMapping valueOf(String str) {
            return (ContentKeyMapping) Enum.valueOf(ContentKeyMapping.class, str);
        }

        public static ContentKeyMapping[] values() {
            return (ContentKeyMapping[]) $VALUES.clone();
        }
    }
}
