package com.robinhood.android.redesign.accounttab.interop;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorAndroidFragmentFromKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/interop/ResumedFragmentIdCache;", "", "<init>", "()V", "resumedIds", "", "", "kotlin.jvm.PlatformType", "", "add", "", "id", "remove", "contains", "", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesign.accounttab.interop.ResumedFragmentIdCache, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorAndroidFragmentFromKey2 {
    public static final AccountSelectorAndroidFragmentFromKey2 INSTANCE = new AccountSelectorAndroidFragmentFromKey2();
    private static final Set<String> resumedIds = Collections.synchronizedSet(new LinkedHashSet());
    public static final int $stable = 8;

    private AccountSelectorAndroidFragmentFromKey2() {
    }

    public final void add(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Set<String> resumedIds2 = resumedIds;
        Intrinsics.checkNotNullExpressionValue(resumedIds2, "resumedIds");
        resumedIds2.add(id);
    }

    public final void remove(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Set<String> resumedIds2 = resumedIds;
        Intrinsics.checkNotNullExpressionValue(resumedIds2, "resumedIds");
        resumedIds2.remove(id);
    }

    public final boolean contains(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return resumedIds.contains(id);
    }
}
