package com.robinhood.rosetta.converters.brokerage;

import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.ApiTaxLot;
import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethod;
import com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okio.ByteString;

/* compiled from: TaxLots.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelection;", "Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/ApiTaxLot;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.converters.brokerage.TaxLotsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class TaxLots2 {

    /* compiled from: TaxLots.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.brokerage.TaxLotsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxLotSelectionType.values().length];
            try {
                iArr[TaxLotSelectionType.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxLotSelectionType.FIFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaxLotSelectionType.LIFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaxLotSelectionType.HIGHEST_COST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TaxLotSelectionType.LOWEST_COST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DisposalMethod toProtobuf(TaxLotSelectionType taxLotSelectionType) {
        int i = taxLotSelectionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[taxLotSelectionType.ordinal()];
        if (i == -1) {
            return DisposalMethod.METHOD_UNSPECIFIED;
        }
        if (i == 1) {
            return DisposalMethod.CUSTOM;
        }
        if (i == 2) {
            return DisposalMethod.FIFO;
        }
        if (i == 3) {
            return DisposalMethod.LIFO;
        }
        if (i == 4) {
            return DisposalMethod.HIGH_COST;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return DisposalMethod.LOW_COST;
    }

    public static final List<TaxLotSelection> toProtobuf(List<ApiTaxLot> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ApiTaxLot> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ApiTaxLot apiTaxLot : list2) {
            ByteString.Companion companion = ByteString.INSTANCE;
            String string2 = apiTaxLot.getOpen_lot_id().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            byte[] bytes = string2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            ByteString byteStringOf$default = ByteString.Companion.of$default(companion, bytes, 0, 0, 3, null);
            String string3 = apiTaxLot.getQuantity().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            arrayList.add(new TaxLotSelection(byteStringOf$default, string3, null, 4, null));
        }
        return arrayList;
    }
}
