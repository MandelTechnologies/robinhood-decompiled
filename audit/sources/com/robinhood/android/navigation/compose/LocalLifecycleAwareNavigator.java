package com.robinhood.android.navigation.compose;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: LocalLifecycleAwareNavigator.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"LocalLifecycleAwareNavigator", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/navigation/compose/LifecycleAwareNavigator;", "getLocalLifecycleAwareNavigator", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalOptionalLifecycleAwareNavigator", "getLocalOptionalLifecycleAwareNavigator", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigatorKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class LocalLifecycleAwareNavigator {
    private static final CompositionLocal6<LifecycleAwareNavigator> LocalLifecycleAwareNavigator = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigatorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalLifecycleAwareNavigator.LocalLifecycleAwareNavigator$lambda$0();
        }
    });
    private static final CompositionLocal6<LifecycleAwareNavigator> LocalOptionalLifecycleAwareNavigator = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigatorKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalLifecycleAwareNavigator.LocalOptionalLifecycleAwareNavigator$lambda$1();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleAwareNavigator LocalOptionalLifecycleAwareNavigator$lambda$1() {
        return null;
    }

    public static final CompositionLocal6<LifecycleAwareNavigator> getLocalLifecycleAwareNavigator() {
        return LocalLifecycleAwareNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleAwareNavigator LocalLifecycleAwareNavigator$lambda$0() {
        throw new IllegalStateException("No navigator provided");
    }

    public static final CompositionLocal6<LifecycleAwareNavigator> getLocalOptionalLifecycleAwareNavigator() {
        return LocalOptionalLifecycleAwareNavigator;
    }
}
