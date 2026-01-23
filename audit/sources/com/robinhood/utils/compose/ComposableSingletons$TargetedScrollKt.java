package com.robinhood.utils.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: TargetedScroll.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$TargetedScrollKt {
    public static final ComposableSingletons$TargetedScrollKt INSTANCE = new ComposableSingletons$TargetedScrollKt();
    private static Function3<TargetedScrollRowScope<Integer>, Composer, Integer, Unit> lambda$746506159 = ComposableLambda3.composableLambdaInstance(746506159, false, ComposableSingletons$TargetedScrollKt$lambda$746506159$1.INSTANCE);

    /* renamed from: lambda$-980148648, reason: not valid java name */
    private static Function3<TargetedScrollRowScope<Integer>, Composer, Integer, Unit> f9546lambda$980148648 = ComposableLambda3.composableLambdaInstance(-980148648, false, ComposableSingletons$TargetedScrollKt$lambda$980148648$1.INSTANCE);
    private static Function3<TargetedScrollColumnScope<Integer>, Composer, Integer, Unit> lambda$754068548 = ComposableLambda3.composableLambdaInstance(754068548, false, ComposableSingletons$TargetedScrollKt$lambda$754068548$1.INSTANCE);

    /* renamed from: lambda$-918731859, reason: not valid java name */
    private static Function3<TargetedScrollColumnScope<Integer>, Composer, Integer, Unit> f9545lambda$918731859 = ComposableLambda3.composableLambdaInstance(-918731859, false, ComposableSingletons$TargetedScrollKt$lambda$918731859$1.INSTANCE);

    /* renamed from: getLambda$-918731859$lib_utils_compose_externalDebug, reason: not valid java name */
    public final Function3<TargetedScrollColumnScope<Integer>, Composer, Integer, Unit> m26589getLambda$918731859$lib_utils_compose_externalDebug() {
        return f9545lambda$918731859;
    }

    /* renamed from: getLambda$-980148648$lib_utils_compose_externalDebug, reason: not valid java name */
    public final Function3<TargetedScrollRowScope<Integer>, Composer, Integer, Unit> m26590getLambda$980148648$lib_utils_compose_externalDebug() {
        return f9546lambda$980148648;
    }

    public final Function3<TargetedScrollRowScope<Integer>, Composer, Integer, Unit> getLambda$746506159$lib_utils_compose_externalDebug() {
        return lambda$746506159;
    }

    public final Function3<TargetedScrollColumnScope<Integer>, Composer, Integer, Unit> getLambda$754068548$lib_utils_compose_externalDebug() {
        return lambda$754068548;
    }
}
