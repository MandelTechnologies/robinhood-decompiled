package com.robinhood.android.account.modelsaccountswitcher;

import account_aggregation.service.models.p004v1.AccountSwitcherLocationDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherLocation.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toDbModel", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;", "lib-models-account-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherLocationKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountSwitcherLocation3 {

    /* compiled from: AccountSwitcherLocation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherLocationKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSwitcherLocationDto.values().length];
            try {
                iArr[AccountSwitcherLocationDto.ASL_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountSwitcherLocationDto.ASL_INDEX_DETAIL_TRADE_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AccountSwitcherLocation toDbModel(AccountSwitcherLocationDto accountSwitcherLocationDto) {
        Intrinsics.checkNotNullParameter(accountSwitcherLocationDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[accountSwitcherLocationDto.ordinal()];
        if (i == 1) {
            return AccountSwitcherLocation.UNSPECIFIED;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AccountSwitcherLocation.INDEX_DETAIL_TRADE_BAR;
    }
}
