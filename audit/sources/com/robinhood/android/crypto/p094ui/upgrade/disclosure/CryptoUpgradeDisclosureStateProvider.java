package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import com.robinhood.android.crypto.p094ui.upgrade.disclosure.CryptoUpgradeDisclosureDataState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosure.CryptoUpgradeDisclosureViewState;
import com.robinhood.android.udf.StateProvider;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureViewState;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Lio/noties/markwon/Markwon;)V", "reduce", "dataState", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureStateProvider implements StateProvider<CryptoUpgradeDisclosureDataState, CryptoUpgradeDisclosureViewState> {
    public static final int $stable = 8;
    private final Markwon markwon;

    public CryptoUpgradeDisclosureStateProvider(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoUpgradeDisclosureViewState reduce(CryptoUpgradeDisclosureDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState instanceof CryptoUpgradeDisclosureDataState.Loading) {
            return CryptoUpgradeDisclosureViewState.Loading.INSTANCE;
        }
        if (!(dataState instanceof CryptoUpgradeDisclosureDataState.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        return new CryptoUpgradeDisclosureViewState.Loaded(((CryptoUpgradeDisclosureDataState.Loaded) dataState).getSpannedMarkdown(this.markwon));
    }
}
