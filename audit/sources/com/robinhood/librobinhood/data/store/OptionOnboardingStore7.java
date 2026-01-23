package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionsStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.OptionsStatusDto;

/* compiled from: OptionOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, m3636d2 = {"toUiModel", "Lcom/robinhood/models/db/OptionsStatus;", "Loptions_product/service/OptionsStatusDto;", "lib-store-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionOnboardingStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class OptionOnboardingStore7 {

    /* compiled from: OptionOnboardingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOnboardingStoreKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsStatusDto.values().length];
            try {
                iArr[OptionsStatusDto.LEVEL_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsStatusDto.LEVEL_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsStatusDto.LEVEL_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionsStatusDto.ACTION_NEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionsStatusDto.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionsStatusDto.L2_ACTION_NEEDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionsStatusDto.PENDING_APPOINTMENT_SCHEDULED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionsStatusDto.L2_PENDING_APPOINTMENT_SCHEDULED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OptionsStatusDto.L2_PENDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OptionsStatusDto.JA_L0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OptionsStatusDto.JA_L0_INCOMPLETE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OptionsStatusDto.JA_L0_MR_REQUIRED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OptionsStatusDto.JA_L2_MR_REQUIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OptionsStatusDto.JA_L0_PENDING_COOWNER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[OptionsStatusDto.JA_L0_PENDING_COOWNER_MR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[OptionsStatusDto.JA_L2_PENDING_COOWNER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[OptionsStatusDto.JA_L2_PENDING_COOWNER_MR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[OptionsStatusDto.NOT_AVAILABLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[OptionsStatusDto.CUSTODIAL_UNAVAILABLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[OptionsStatusDto.JA_L0_PENDING.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[OptionsStatusDto.JA_L2_PENDING.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[OptionsStatusDto.JA_L0_MR_SCHEDULED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[OptionsStatusDto.JA_L2_MR_SCHEDULED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[OptionsStatusDto.OPTIONS_STATUS_UNSPECIFIED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final OptionsStatus toUiModel(OptionsStatusDto optionsStatusDto) {
        Intrinsics.checkNotNullParameter(optionsStatusDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[optionsStatusDto.ordinal()]) {
            case 1:
                return OptionsStatus.LEVEL_0;
            case 2:
                return OptionsStatus.LEVEL_2;
            case 3:
                return OptionsStatus.LEVEL_3;
            case 4:
                return OptionsStatus.ACTION_NEEDED;
            case 5:
                return OptionsStatus.PENDING;
            case 6:
                return OptionsStatus.L2_ACTION_NEEDED;
            case 7:
                return OptionsStatus.PENDING_APPOINTMENT_SCHEDULED;
            case 8:
                return OptionsStatus.L2_PENDING_APPOINTMENT_SCHEDULED;
            case 9:
                return OptionsStatus.L2_PENDING;
            case 10:
                return OptionsStatus.JA_L0;
            case 11:
                return OptionsStatus.JA_L0_INCOMPLETE;
            case 12:
                return OptionsStatus.JA_L0_MR_REQUIRED;
            case 13:
                return OptionsStatus.JA_L2_MR_REQUIRED;
            case 14:
                return OptionsStatus.JA_L0_PENDING_CO_OWNER;
            case 15:
                return OptionsStatus.JA_L0_PENDING_CO_OWNER_MR;
            case 16:
                return OptionsStatus.JA_L2_PENDING_CO_OWNER;
            case 17:
                return OptionsStatus.JA_L2_PENDING_CO_OWNER_MR;
            case 18:
                return OptionsStatus.NOT_AVAILABLE;
            case 19:
                return OptionsStatus.CUSTODIAL_UNAVAILABLE;
            case 20:
                return OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
            case 21:
                return OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
            case 22:
                return OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
            case 23:
                return OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
            case 24:
                return OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
