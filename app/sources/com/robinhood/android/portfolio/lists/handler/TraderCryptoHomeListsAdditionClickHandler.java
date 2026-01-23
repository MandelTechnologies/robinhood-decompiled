package com.robinhood.android.portfolio.lists.handler;

import android.content.Context;
import com.android.shared.portfolio.lists.handler.CryptoHomeListsAdditionClickHandler;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderCryptoHomeListsAdditionClickHandler.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/portfolio/lists/handler/TraderCryptoHomeListsAdditionClickHandler;", "Lcom/android/shared/portfolio/lists/handler/CryptoHomeListsAdditionClickHandler;", "<init>", "()V", "onClick", "", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "lib-lists-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TraderCryptoHomeListsAdditionClickHandler implements CryptoHomeListsAdditionClickHandler {
    public static final TraderCryptoHomeListsAdditionClickHandler INSTANCE = new TraderCryptoHomeListsAdditionClickHandler();

    private TraderCryptoHomeListsAdditionClickHandler() {
    }

    @Override // com.android.shared.portfolio.lists.handler.CryptoHomeListsAdditionClickHandler
    public void onClick(Context context, Navigator navigator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        throw new Standard2("This should only be invoked from :rhc");
    }
}
