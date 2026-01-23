package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.converters.brokerage.ManagementTypes2;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.utils.resource.StringResource;
import internal_asset_transfers.proto.p475v1.GetEligibleAccountsResponseDto;
import internal_asset_transfers.proto.p475v1.IATAccount;
import internal_asset_transfers.proto.p475v1.IATAccountDto;
import internal_asset_transfers.proto.p475v1.IATAccountListDto;
import internal_asset_transfers.proto.p475v1.IATIneligibilityReason;
import internal_asset_transfers.proto.p475v1.IATIneligibilityReasonDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: UiEligibleAccounts.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0013\u001a\u00020\u0012*\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATAccountDto;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "toUiModel", "(Linternal_asset_transfers/proto/v1/IATAccountDto;Lj$/time/Clock;)Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "Linternal_asset_transfers/proto/v1/GetEligibleAccountsResponseDto;", "Lcom/robinhood/android/internalassettransfers/accountselection/UiEligibleAccounts;", "(Linternal_asset_transfers/proto/v1/GetEligibleAccountsResponseDto;Lj$/time/Clock;)Lcom/robinhood/android/internalassettransfers/accountselection/UiEligibleAccounts;", "Linternal_asset_transfers/proto/v1/IATAccount;", "toIatAccount", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;)Linternal_asset_transfers/proto/v1/IATAccount;", "toIatAccountDto", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;)Linternal_asset_transfers/proto/v1/IATAccountDto;", "", "isEligible", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "ineligibilityReason", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "toAccountSwitcherRowData", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;ZLinternal_asset_transfers/proto/v1/IATIneligibilityReason;)Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.accountselection.UiEligibleAccountsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UiEligibleAccounts2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final UiIatAccount toUiModel(IATAccountDto iATAccountDto, Clock clock) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(iATAccountDto, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        String rhs_account_number = iATAccountDto.getRhs_account_number();
        String rhf_account_number = iATAccountDto.getRhf_account_number();
        BrokerageAccountType brokerageAccountType = BrokerageAccountTypes3.toBrokerageAccountType((rosetta.account.BrokerageAccountType) iATAccountDto.getBrokerage_account_type().toProto());
        boolean zIs_eligible_source_account = iATAccountDto.is_eligible_source_account();
        boolean zIs_eligible_sink_account = iATAccountDto.is_eligible_sink_account();
        IATIneligibilityReasonDto source_ineligibility_reason = iATAccountDto.getSource_ineligibility_reason();
        IATIneligibilityReason iATIneligibilityReason = source_ineligibility_reason != null ? (IATIneligibilityReason) source_ineligibility_reason.toProto() : null;
        ManagementType managementType = ManagementTypes2.toManagementType((rosetta.account.ManagementType) iATAccountDto.getManagement_type().toProto());
        String nickname = iATAccountDto.getNickname();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(Instant.parse(iATAccountDto.getCreated_at()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Instant instantNow = (Instant) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
        if (instantNow == null) {
            instantNow = Instant.now(clock);
        }
        Instant instant = instantNow;
        Intrinsics.checkNotNull(instant);
        return new UiIatAccount(rhs_account_number, rhf_account_number, brokerageAccountType, zIs_eligible_source_account, zIs_eligible_sink_account, iATIneligibilityReason, managementType, nickname, instant);
    }

    public static final UiEligibleAccounts toUiModel(GetEligibleAccountsResponseDto getEligibleAccountsResponseDto, Clock clock) {
        Collection collectionEmptyList;
        Collection collectionEmptyList2;
        List listEmptyList;
        List<IATAccountDto> accounts2;
        List<IATAccountDto> accounts3;
        List<IATAccountDto> accounts4;
        Intrinsics.checkNotNullParameter(getEligibleAccountsResponseDto, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        IATAccountListDto accounts5 = getEligibleAccountsResponseDto.getAccounts();
        if (accounts5 == null || (accounts4 = accounts5.getAccounts()) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : accounts4) {
                if (((IATAccountDto) obj).is_eligible_source_account()) {
                    arrayList.add(obj);
                }
            }
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(toUiModel((IATAccountDto) it.next(), clock));
            }
        }
        IATAccountListDto accounts6 = getEligibleAccountsResponseDto.getAccounts();
        if (accounts6 == null || (accounts3 = accounts6.getAccounts()) == null) {
            collectionEmptyList2 = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : accounts3) {
                if (((IATAccountDto) obj2).is_eligible_sink_account()) {
                    arrayList2.add(obj2);
                }
            }
            collectionEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                collectionEmptyList2.add(toUiModel((IATAccountDto) it2.next(), clock));
            }
        }
        Map<String, IATAccountListDto> valid_source_to_sink = getEligibleAccountsResponseDto.getValid_source_to_sink();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(valid_source_to_sink.size()));
        Iterator<T> it3 = valid_source_to_sink.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Object key = entry.getKey();
            List<IATAccountDto> accounts7 = ((IATAccountListDto) entry.getValue()).getAccounts();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts7, 10));
            Iterator<T> it4 = accounts7.iterator();
            while (it4.hasNext()) {
                arrayList3.add(toUiModel((IATAccountDto) it4.next(), clock));
            }
            linkedHashMap.put(key, arrayList3);
        }
        Map mapPlus = MapsKt.plus(linkedHashMap, Tuples4.m3642to(null, collectionEmptyList2));
        Map<String, IATAccountListDto> valid_sink_to_source = getEligibleAccountsResponseDto.getValid_sink_to_source();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(valid_sink_to_source.size()));
        Iterator<T> it5 = valid_sink_to_source.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it5.next();
            Object key2 = entry2.getKey();
            List<IATAccountDto> accounts8 = ((IATAccountListDto) entry2.getValue()).getAccounts();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts8, 10));
            Iterator<T> it6 = accounts8.iterator();
            while (it6.hasNext()) {
                arrayList4.add(toUiModel((IATAccountDto) it6.next(), clock));
            }
            linkedHashMap2.put(key2, arrayList4);
        }
        Map mapPlus2 = MapsKt.plus(linkedHashMap2, Tuples4.m3642to(null, collectionEmptyList));
        IATAccountListDto accounts9 = getEligibleAccountsResponseDto.getAccounts();
        if (accounts9 == null || (accounts2 = accounts9.getAccounts()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            List<IATAccountDto> list = accounts2;
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it7 = list.iterator();
            while (it7.hasNext()) {
                listEmptyList.add(toUiModel((IATAccountDto) it7.next(), clock));
            }
        }
        return new UiEligibleAccounts(listEmptyList, mapPlus, mapPlus2);
    }

    public static final IATAccount toIatAccount(UiIatAccount uiIatAccount) {
        Intrinsics.checkNotNullParameter(uiIatAccount, "<this>");
        return new IATAccount(uiIatAccount.getRhsAccountNumber(), BrokerageAccountTypes3.toProtobuf(uiIatAccount.getBrokerageAccountType()), uiIatAccount.isEligibleSink(), uiIatAccount.isEligibleSource(), uiIatAccount.getRhfAccountNumber(), ManagementTypes2.toProtobuf(uiIatAccount.getManagementType()), null, null, null, null, 960, null);
    }

    public static final IATAccountDto toIatAccountDto(UiIatAccount uiIatAccount) {
        Intrinsics.checkNotNullParameter(uiIatAccount, "<this>");
        return IATAccountDto.INSTANCE.fromProto(toIatAccount(uiIatAccount));
    }

    public static /* synthetic */ AccountSwitcherRowData toAccountSwitcherRowData$default(UiIatAccount uiIatAccount, boolean z, IATIneligibilityReason iATIneligibilityReason, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toAccountSwitcherRowData(uiIatAccount, z, iATIneligibilityReason);
    }

    public static final AccountSwitcherRowData toAccountSwitcherRowData(UiIatAccount uiIatAccount, boolean z, IATIneligibilityReason iATIneligibilityReason) {
        Intrinsics.checkNotNullParameter(uiIatAccount, "<this>");
        return new AccountSwitcherRowData.Account(uiIatAccount.getRhsAccountNumber(), uiIatAccount.getBrokerageAccountType(), uiIatAccount.getManagementType(), uiIatAccount.getCreatedAt(), null, AccountDisplayNames.getDisplayName(uiIatAccount.getBrokerageAccountType(), uiIatAccount.getManagementType(), uiIatAccount.getNickname()).getWithInvesting().getTitle(), z ? null : StringResource.INSTANCE.invoke(C18977R.string.not_available_for_transfer, new Object[0]), null, null, AccountDisplayIcons.getDisplayIcon24(uiIatAccount.getBrokerageAccountType(), uiIatAccount.getManagementType()), (z || iATIneligibilityReason != IATIneligibilityReason.REASON_OPEN_FUTURES_POSITION) ? z : true, 400, null);
    }
}
