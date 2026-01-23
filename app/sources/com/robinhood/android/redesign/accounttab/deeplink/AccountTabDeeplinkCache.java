package com.robinhood.android.redesign.accounttab.deeplink;

import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTabDeeplinkCache.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u000bJ;\u0010\r\u001a\u00020\u000b\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u00052!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000b0\u0010H\u0086\bø\u0001\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCache;", "", "<init>", "()V", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "getTabIntentKey", "()Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "setTabIntentKey", "(Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;)V", "updatePendingIntentKey", "", "clear", "consumeDeeplink", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountTabDeeplinkCache {
    private static TabLinkIntentKey tabIntentKey;
    public static final AccountTabDeeplinkCache INSTANCE = new AccountTabDeeplinkCache();
    public static final int $stable = 8;

    private AccountTabDeeplinkCache() {
    }

    public final TabLinkIntentKey getTabIntentKey() {
        return tabIntentKey;
    }

    public final void setTabIntentKey(TabLinkIntentKey tabLinkIntentKey) {
        tabIntentKey = tabLinkIntentKey;
    }

    public final void updatePendingIntentKey(TabLinkIntentKey tabIntentKey2) {
        Intrinsics.checkNotNullParameter(tabIntentKey2, "tabIntentKey");
        tabIntentKey = tabIntentKey2;
    }

    public final void clear() {
        tabIntentKey = null;
    }

    public final /* synthetic */ <T extends TabLinkIntentKey> void consumeDeeplink(Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TabLinkIntentKey tabIntentKey2 = getTabIntentKey();
        Intrinsics.reifiedOperationMarker(2, "T");
        if (tabIntentKey2 != null) {
            block.invoke(tabIntentKey2);
            INSTANCE.setTabIntentKey(null);
        }
    }
}
