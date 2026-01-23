package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.equities.p034v1.BorrowChargeDto;
import bonfire.proto.idl.equities.p034v1.StatusChoicesDto;
import com.robinhood.models.api.ApiBorrowCharge3;
import com.robinhood.models.p320db.InstrumentBorrowCharge;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BorrowChargeStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, m3636d2 = {"toInstrumentBorrowCharge", "", "Lcom/robinhood/models/db/InstrumentBorrowCharge;", "Lbonfire/proto/idl/equities/v1/BorrowChargeDto;", "toBorrowChargeStatus", "Lcom/robinhood/models/api/BorrowChargeStatus;", "Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "lib-store-equity-shared_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class BorrowChargeStoreKt {

    /* compiled from: BorrowChargeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusChoicesDto.values().length];
            try {
                iArr[StatusChoicesDto.STATUS_CHOICES_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusChoicesDto.STATUS_CHOICES_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusChoicesDto.STATUS_CHOICES_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusChoicesDto.STATUS_CHOICES_PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StatusChoicesDto.STATUS_CHOICES_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StatusChoicesDto.STATUS_CHOICES_INCONSISTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<InstrumentBorrowCharge> toInstrumentBorrowCharge(List<BorrowChargeDto> list) {
        List<BorrowChargeDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BorrowChargeDto borrowChargeDto : list2) {
            UUID uuid = StringsKt.toUuid(borrowChargeDto.getId());
            UUID uuid2 = StringsKt.toUuid(borrowChargeDto.getInstrument_id());
            String symbol = borrowChargeDto.getSymbol();
            MoneyDto charge = borrowChargeDto.getCharge();
            if (charge == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList.add(new InstrumentBorrowCharge(uuid, uuid2, symbol, Money3.toMoney(charge)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiBorrowCharge3 toBorrowChargeStatus(StatusChoicesDto statusChoicesDto) {
        switch (WhenMappings.$EnumSwitchMapping$0[statusChoicesDto.ordinal()]) {
            case 1:
            case 2:
                return ApiBorrowCharge3.NEW;
            case 3:
                return ApiBorrowCharge3.COMPLETED;
            case 4:
                return ApiBorrowCharge3.PROCESSING;
            case 5:
                return ApiBorrowCharge3.PENDING;
            case 6:
                return ApiBorrowCharge3.INCONSISTENT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
