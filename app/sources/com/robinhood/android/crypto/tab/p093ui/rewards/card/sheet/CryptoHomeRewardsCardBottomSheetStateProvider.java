package com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet;

import com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.contentful.markdown.MarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeRewardsCardBottomSheetStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetDataState;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeRewardsCardBottomSheetStateProvider implements StateProvider<CryptoHomeRewardsCardBottomSheetDataState, CryptoHomeRewardsCardBottomSheetViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoHomeRewardsCardBottomSheetViewState reduce(CryptoHomeRewardsCardBottomSheetDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        String title = dataState.getTitle();
        MarkdownContent body = dataState.getBody();
        String cta = dataState.getCta();
        if (title == null || body == null || cta == null) {
            return CryptoHomeRewardsCardBottomSheetViewState.Loading.INSTANCE;
        }
        return new CryptoHomeRewardsCardBottomSheetViewState.Loaded(title, body, cta);
    }
}
