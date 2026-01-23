package com.robinhood.android.linking;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MobileLinkingCollapsedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.linking.ComposableSingletons$MobileLinkingCollapsedComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MobileLinkingCollapsedComposable {
    public static final MobileLinkingCollapsedComposable INSTANCE = new MobileLinkingCollapsedComposable();
    private static Function2<Composer, Integer, Unit> lambda$1500872922 = ComposableLambda3.composableLambdaInstance(1500872922, false, MobileLinkingCollapsedComposable2.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1500872922$lib_mobile_linking_externalDebug() {
        return lambda$1500872922;
    }
}
