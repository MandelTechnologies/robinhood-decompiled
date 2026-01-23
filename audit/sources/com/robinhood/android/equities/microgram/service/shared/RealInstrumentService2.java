package com.robinhood.android.equities.microgram.service.shared;

import com.robinhood.models.p320db.IpoAccessStatus;
import com.robinhood.models.p320db.IssuerType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import rosetta.instrument.IPOAccessStatusDto;
import rosetta.instrument.IssuerTypeDto;

/* compiled from: RealInstrumentService.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002¨\u0006\u0005"}, m3636d2 = {"toDtoModel", "Lrosetta/instrument/IPOAccessStatusDto;", "Lcom/robinhood/models/db/IpoAccessStatus;", "Lrosetta/instrument/IssuerTypeDto;", "Lcom/robinhood/models/db/IssuerType;", "lib-equity-microgram-service-shared_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.microgram.service.shared.RealInstrumentServiceKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RealInstrumentService2 {

    /* compiled from: RealInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.microgram.service.shared.RealInstrumentServiceKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IpoAccessStatus.values().length];
            try {
                iArr[IpoAccessStatus.S1_FILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IpoAccessStatus.PRICE_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IpoAccessStatus.PRICE_FINALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IpoAccessStatus.PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IpoAccessStatus.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IpoAccessStatus.DELAYED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IpoAccessStatus.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IssuerType.values().length];
            try {
                iArr2[IssuerType.RHV_CEF.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[IssuerType.THIRD_PARTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IPOAccessStatusDto toDtoModel(IpoAccessStatus ipoAccessStatus) {
        switch (WhenMappings.$EnumSwitchMapping$0[ipoAccessStatus.ordinal()]) {
            case 1:
                return IPOAccessStatusDto.IPO_ACCESS_STATUS_S1_FILED;
            case 2:
                return IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_INITIALIZED;
            case 3:
                return IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_FINALIZED;
            case 4:
                return IPOAccessStatusDto.IPO_ACCESS_STATUS_PUBLIC;
            case 5:
                return IPOAccessStatusDto.IPO_ACCESS_STATUS_CANCELED;
            case 6:
                return IPOAccessStatusDto.IPO_ACCESS_STATUS_DELAYED;
            case 7:
                return IPOAccessStatusDto.IPO_ACCESS_STATUS_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IssuerTypeDto toDtoModel(IssuerType issuerType) {
        int i = WhenMappings.$EnumSwitchMapping$1[issuerType.ordinal()];
        if (i == 1) {
            return IssuerTypeDto.ISSUER_TYPE_RHV_CEF;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return IssuerTypeDto.ISSUER_TYPE_THIRD_PARTY;
    }
}
