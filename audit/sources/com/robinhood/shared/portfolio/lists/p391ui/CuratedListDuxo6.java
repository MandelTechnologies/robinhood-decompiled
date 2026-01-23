package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.bonfire.ApiListsOrder4;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¨\u0006\n"}, m3636d2 = {"toListRecord", "Lcom/robinhood/models/db/bonfire/ListRecord;", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "toCuratedListViewMode", "Lcom/robinhood/models/db/CuratedListViewMode;", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "toPositionInstrumentTypes", "", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "Lcom/robinhood/models/api/CuratedListObjectType;", "lib-lists-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxoKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CuratedListDuxo6 {

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DisplayType.values().length];
            try {
                iArr[DisplayType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayType.LAST_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplayType.PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplayType.TOTAL_PERCENT_CHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CuratedListObjectType.values().length];
            try {
                iArr2[CuratedListObjectType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CuratedListObjectType.CURRENCY_PAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CuratedListObjectType.FUTURES_CONTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CuratedListObjectType.INSTRUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CuratedListObjectType.PERPETUALS_CONTRACT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CuratedListObjectType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CuratedListObjectType.OPTION_STRATEGY.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CuratedListObjectType.INDEX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ListRecord toListRecord(CuratedListDuxo7 curatedListDuxo7) {
        ApiListsOrder4 apiListsOrder4;
        Intrinsics.checkNotNullParameter(curatedListDuxo7, "<this>");
        UUID id = curatedListDuxo7.getId();
        if (curatedListDuxo7 instanceof CuratedListDuxo7.CuratedItem) {
            apiListsOrder4 = ApiListsOrder4.ROBINHOOD;
        } else if (curatedListDuxo7 instanceof CuratedListDuxo7.ScreenerItem) {
            apiListsOrder4 = ApiListsOrder4.SCREENER;
        } else {
            if (!(curatedListDuxo7 instanceof CuratedListDuxo7.WatchlistItem)) {
                throw new NoWhenBranchMatchedException();
            }
            apiListsOrder4 = ApiListsOrder4.CUSTOM;
        }
        return new ListRecord(id, apiListsOrder4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListViewMode toCuratedListViewMode(DisplayType displayType) {
        int i = WhenMappings.$EnumSwitchMapping$0[displayType.ordinal()];
        if (i == 1) {
            return CuratedListViewMode.LAST_PRICE;
        }
        if (i == 2) {
            return CuratedListViewMode.LAST_PRICE;
        }
        if (i == 3) {
            return CuratedListViewMode.PERCENT_CHANGE;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return CuratedListViewMode.TOTAL_PERCENT_CHANGE;
    }

    public static final List<PositionInstrumentType> toPositionInstrumentTypes(List<? extends CuratedListObjectType> list) {
        PositionInstrumentType positionInstrumentType;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends CuratedListObjectType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$1[((CuratedListObjectType) it.next()).ordinal()]) {
                case 1:
                    positionInstrumentType = PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS;
                    break;
                case 2:
                    positionInstrumentType = PositionInstrumentType.CRYPTO;
                    break;
                case 3:
                    positionInstrumentType = PositionInstrumentType.FUTURES;
                    break;
                case 4:
                    positionInstrumentType = PositionInstrumentType.EQUITY;
                    break;
                case 5:
                    positionInstrumentType = PositionInstrumentType.CRYPTO_PERPETUALS;
                    break;
                case 6:
                case 7:
                case 8:
                    positionInstrumentType = PositionInstrumentType.UNKNOWN;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(positionInstrumentType);
        }
        return arrayList;
    }
}
