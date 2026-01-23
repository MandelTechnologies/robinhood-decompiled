package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import android.content.res.Resources;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.TransactConfiguration;
import com.robinhood.android.libdesignsystem.C20690R;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtomicModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicModule;", "", "<init>", "()V", "provideTransactSdkConfiguration", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration;", "resources", "Landroid/content/res/Resources;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class AtomicModule {
    public static final int $stable = 0;
    public static final AtomicModule INSTANCE = new AtomicModule();

    private AtomicModule() {
    }

    public final TransactConfiguration provideTransactSdkConfiguration(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        TransactConfiguration.AtomicProduct atomicProduct = TransactConfiguration.AtomicProduct.DEPOSIT;
        TransactConfiguration.TransactDeeplink transactDeeplink = new TransactConfiguration.TransactDeeplink(TransactConfiguration.TransactDeeplink.Step.SEARCH_COMPANY, null, null, null, 14, null);
        List listListOf = CollectionsKt.listOf((Object[]) new TransactConfiguration.AtomicPage[]{TransactConfiguration.AtomicPage.EXIT_PROMPT, TransactConfiguration.AtomicPage.AUTHENTICATION_SUCCESS});
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(resources.getColor(C20690R.color.mobius_prime, null) & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new TransactConfiguration(null, atomicProduct, transactDeeplink, listListOf, str, true, false, 1, null);
    }
}
