package com.robinhood.android.settings.settings.account.trustedcontact;

import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailDataState;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailViewState;", "phoneNumberFormatter", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "<init>", "(Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;)V", "reduce", "dataState", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class TrustedContactDetailStateProvider implements StateProvider<TrustedContactDetailDataState, TrustedContactDetailViewState> {
    public static final int $stable = PhoneNumberFormatter.$stable;
    private final PhoneNumberFormatter phoneNumberFormatter;

    public TrustedContactDetailStateProvider(PhoneNumberFormatter phoneNumberFormatter) {
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        this.phoneNumberFormatter = phoneNumberFormatter;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public TrustedContactDetailViewState reduce(TrustedContactDetailDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new TrustedContactDetailViewState(dataState.getLoading(), dataState.getFullName(), dataState.getEmail(), dataState.formatPhoneNumber(this.phoneNumberFormatter), dataState.getAddress(), dataState.isAddressRowVisible());
    }
}
