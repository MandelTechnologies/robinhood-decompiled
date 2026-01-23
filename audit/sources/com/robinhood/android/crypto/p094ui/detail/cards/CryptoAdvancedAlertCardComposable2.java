package com.robinhood.android.crypto.p094ui.detail.cards;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.alert.ShownAdvancedAlertCdpCardCountPref;
import com.robinhood.prefs.IntPreference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAdvancedAlertCardComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoAdvancedAlertCardDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "", "shownAdvancedAlertCdpCardCountPref", "Lcom/robinhood/prefs/IntPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoAdvancedAlertCardDuxo, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoAdvancedAlertCardComposable2 extends BaseDuxo4<Unit> {
    public static final int $stable = 8;
    private final IntPreference shownAdvancedAlertCdpCardCountPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAdvancedAlertCardComposable2(@ShownAdvancedAlertCdpCardCountPref IntPreference shownAdvancedAlertCdpCardCountPref, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(shownAdvancedAlertCdpCardCountPref, "shownAdvancedAlertCdpCardCountPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.shownAdvancedAlertCdpCardCountPref = shownAdvancedAlertCdpCardCountPref;
        shownAdvancedAlertCdpCardCountPref.set(shownAdvancedAlertCdpCardCountPref.get() + 1);
    }
}
