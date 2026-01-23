package com.robinhood.utils.compose;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.fragment.app.FragmentActivity;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: LocalActivity.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"LocalActivity", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/fragment/app/FragmentActivity;", "getLocalActivity$annotations", "()V", "getLocalActivity", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.compose.LocalActivityKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LocalActivity3 {
    private static final CompositionLocal6<FragmentActivity> LocalActivity = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.utils.compose.LocalActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalActivity3.LocalActivity$lambda$0();
        }
    });

    @Deprecated
    public static /* synthetic */ void getLocalActivity$annotations() {
    }

    public static final CompositionLocal6<FragmentActivity> getLocalActivity() {
        return LocalActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FragmentActivity LocalActivity$lambda$0() {
        throw new IllegalStateException("No activity provided");
    }
}
