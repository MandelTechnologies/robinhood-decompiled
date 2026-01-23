package com.robinhood.scarlet;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: LocalScarletManager.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalScarletManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/scarlet/ScarletManager;", "getLocalScarletManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.LocalScarletManagerKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class LocalScarletManager {
    private static final CompositionLocal6<ScarletManager> LocalScarletManager = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.scarlet.LocalScarletManagerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalScarletManager.LocalScarletManager$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScarletManager LocalScarletManager$lambda$0() {
        return null;
    }

    public static final CompositionLocal6<ScarletManager> getLocalScarletManager() {
        return LocalScarletManager;
    }
}
