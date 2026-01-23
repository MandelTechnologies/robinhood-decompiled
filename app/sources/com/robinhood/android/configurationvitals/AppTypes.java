package com.robinhood.android.configurationvitals;

import bff_vitals.service.p021v1.FetchVitalsRequestDto;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppTypes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"configurationVitalsApplication", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "Lcom/robinhood/shared/app/type/AppType;", "getConfigurationVitalsApplication$annotations", "(Lcom/robinhood/shared/app/type/AppType;)V", "getConfigurationVitalsApplication", "(Lcom/robinhood/shared/app/type/AppType;)Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "lib-configuration-vitals_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.configurationvitals.AppTypesKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class AppTypes {

    /* compiled from: AppTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.configurationvitals.AppTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getConfigurationVitalsApplication$annotations(AppType appType) {
    }

    public static final FetchVitalsRequestDto.AppDto getConfigurationVitalsApplication(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            return FetchVitalsRequestDto.AppDto.APP_ROBINHOOD_WALLET;
        }
        if (i == 2) {
            return FetchVitalsRequestDto.AppDto.APP_ROBINHOOD_GLOBAL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return FetchVitalsRequestDto.AppDto.APP_ROBINHOOD_TRADER;
    }
}
