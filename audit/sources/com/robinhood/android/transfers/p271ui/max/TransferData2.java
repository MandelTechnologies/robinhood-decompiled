package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.rosetta.converters.cash.Transfers;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.TransferContext;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferData.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"toLoggingContext", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "refId", "Ljava/util/UUID;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "causedByDefault", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "causedByUpsell", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.TransferDataKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferData2 {
    public static /* synthetic */ MAXTransferContext toLoggingContext$default(TransferData transferData, UUID uuid, MAXTransferContext.EntryPoint entryPoint, String str, Boolean r10, Boolean r11, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            r10 = Boolean.BOOLEAN_UNSPECIFIED;
        }
        Boolean r4 = r10;
        if ((i & 16) != 0) {
            r11 = Boolean.BOOLEAN_UNSPECIFIED;
        }
        return toLoggingContext(transferData, uuid, entryPoint, str2, r4, r11);
    }

    public static final MAXTransferContext toLoggingContext(TransferData transferData, UUID refId, MAXTransferContext.EntryPoint entryPoint, String str, Boolean causedByDefault, Boolean causedByUpsell) {
        MAXTransferContext.ACHTransferData aCHTransferData;
        List listEmptyList;
        String str2;
        Intrinsics.checkNotNullParameter(transferData, "<this>");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(causedByDefault, "causedByDefault");
        Intrinsics.checkNotNullParameter(causedByUpsell, "causedByUpsell");
        String string2 = refId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Money moneyForLogging = ExtensionsKt.toMoneyForLogging(transferData.getAmount());
        MAXTransferContext.TransferAccount protobuf = Transfers.toProtobuf(transferData.getSourceAccount());
        MAXTransferContext.TransferAccount protobuf2 = Transfers.toProtobuf(transferData.getSinkAccount());
        TransferContext.Frequency protobuf3 = Transfers.toProtobuf(transferData.getFrequency());
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData = transferData.getIraContributionData();
        MAXTransferContext.IRAContributionData protobuf4 = iraContributionData != null ? Transfers.toProtobuf(iraContributionData) : null;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = transferData.getIraDistributionData();
        MAXTransferContext.IRADistributionData protobuf5 = iraDistributionData != null ? Transfers.toProtobuf(iraDistributionData) : null;
        AchTransferOption achTransferOption = transferData.getAchTransferOption();
        if (achTransferOption != null) {
            aCHTransferData = new MAXTransferContext.ACHTransferData(Booleans2.toProtobuf(Boolean.valueOf(achTransferOption == AchTransferOption.INSTANT)), causedByDefault, causedByUpsell, null, 8, null);
        } else {
            aCHTransferData = null;
        }
        List<BigDecimal> depositSuggestions = transferData.getDepositSuggestions();
        if (depositSuggestions == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            List<BigDecimal> list = depositSuggestions;
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listEmptyList.add(ExtensionsKt.toMoneyForLogging((BigDecimal) it.next()));
            }
        }
        List list2 = listEmptyList;
        if (str == null) {
            String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str2 = lowerCase;
        } else {
            str2 = str;
        }
        return new MAXTransferContext(string2, moneyForLogging, protobuf, protobuf2, protobuf3, protobuf4, entryPoint, protobuf5, null, aCHTransferData, list2, null, null, null, null, str2, null, null, null, null, 1014016, null);
    }
}
