package com.robinhood.android.util.extensions;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: BannerVisibility.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalBannerVisible", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalBannerVisible", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.util.extensions.BannerVisibilityKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BannerVisibility {
    private static final CompositionLocal6<Boolean> LocalBannerVisible = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.util.extensions.BannerVisibilityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(BannerVisibility.LocalBannerVisible$lambda$0());
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalBannerVisible$lambda$0() {
        return false;
    }

    public static final CompositionLocal6<Boolean> getLocalBannerVisible() {
        return LocalBannerVisible;
    }
}
