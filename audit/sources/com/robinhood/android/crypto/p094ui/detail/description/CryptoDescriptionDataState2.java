package com.robinhood.android.crypto.p094ui.detail.description;

import android.content.res.Resources;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDescriptionDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDataState;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.description.CryptoDescriptionStateProvider, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDescriptionDataState2 implements StateProvider<CryptoDescriptionDataState, CryptoDescriptionViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public CryptoDescriptionDataState2(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoDescriptionViewState reduce(CryptoDescriptionDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new CryptoDescriptionViewState(dataState.getDescriptionText(), dataState.fundamentalList(this.resources), dataState.shouldShowFundamental(this.resources), dataState.getKeyInfoDoc(), dataState.isVisible(this.resources));
    }
}
