package com.robinhood.utils.compose;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: LocalRootNavController.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalRootNavController", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/navigation/NavHostController;", "getLocalRootNavController", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.compose.LocalRootNavControllerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LocalRootNavController {
    private static final CompositionLocal6<NavHostController> LocalRootNavController = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.utils.compose.LocalRootNavControllerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalRootNavController.LocalRootNavController$lambda$0();
        }
    });

    public static final CompositionLocal6<NavHostController> getLocalRootNavController() {
        return LocalRootNavController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController LocalRootNavController$lambda$0() {
        throw new IllegalStateException("No nav controller provided");
    }
}
