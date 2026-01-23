package com.robinhood.android.crypto.pulse.lib.entry;

import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.robinhood.android.crypto.pulse.lib.C12946R;
import com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CryptoPulseEntryPointStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDataState;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState;", "<init>", "()V", "reduce", "dataState", "lib-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPulseEntryPointStateProvider implements StateProvider<CryptoPulseEntryPointDataState, CryptoPulseEntryPointViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoPulseEntryPointViewState reduce(CryptoPulseEntryPointDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getGetCryptoPulsePreviewResponseDto() == null) {
            return CryptoPulseEntryPointViewState.Gone.INSTANCE;
        }
        if (StringsKt.isBlank(dataState.getGetCryptoPulsePreviewResponseDto().getText())) {
            return CryptoPulseEntryPointViewState.Gone.INSTANCE;
        }
        String title = dataState.getGetCryptoPulsePreviewResponseDto().getTitle();
        String text = dataState.getGetCryptoPulsePreviewResponseDto().getText();
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C12946R.string.crypto_pulse_subtitle, dataState.getUpdatedAtRelativeString(), dataState.getGetCryptoPulsePreviewResponseDto().getSubtitle());
        GetCryptoPulsePreviewResponseDto.TapActionDto tap_action = dataState.getGetCryptoPulsePreviewResponseDto().getTap_action();
        if (tap_action != null) {
            return new CryptoPulseEntryPointViewState.Visible(title, text, stringResourceInvoke, tap_action, dataState.getGetCryptoPulsePreviewResponseDto().getHas_signed_agreement());
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
