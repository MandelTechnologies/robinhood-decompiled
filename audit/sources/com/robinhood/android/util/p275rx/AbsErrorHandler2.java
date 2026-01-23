package com.robinhood.android.util.p275rx;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: AbsErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\"\u001d\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"LocalErrorHandler", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/util/rx/AbsErrorHandler;", "", "getLocalErrorHandler", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.util.rx.AbsErrorHandlerKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AbsErrorHandler2 {
    private static final CompositionLocal6<AbsErrorHandler<Object>> LocalErrorHandler = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.util.rx.AbsErrorHandlerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsErrorHandler2.LocalErrorHandler$lambda$0();
        }
    });

    public static final CompositionLocal6<AbsErrorHandler<Object>> getLocalErrorHandler() {
        return LocalErrorHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbsErrorHandler LocalErrorHandler$lambda$0() {
        throw new IllegalStateException("CompositionLocal LocalErrorHandler not present");
    }
}
