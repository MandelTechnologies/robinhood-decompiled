package com.robinhood.android.matcha.p177ui.search.contactlookup;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoaders;
import com.robinhood.p2p.common.ProfileAvatar3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ConfirmUserComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$ConfirmUserComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConfirmUserComposable {
    public static final ConfirmUserComposable INSTANCE = new ConfirmUserComposable();
    private static Function2<Composer, Integer, Unit> lambda$719729513 = ComposableLambda3.composableLambdaInstance(719729513, false, ConfirmUserComposable3.INSTANCE);

    /* renamed from: lambda$-984428887, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9111lambda$984428887 = ComposableLambda3.composableLambdaInstance(-984428887, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$ConfirmUserComposableKt$lambda$-984428887$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-984428887, i, -1, "com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$ConfirmUserComposableKt.lambda$-984428887.<anonymous> (ConfirmUserComposable.kt:134)");
            }
            CompositionLocal3.CompositionLocalProvider(ProfileAvatar3.getLocalImageLoaderOverride().provides(ImageLoaders.create((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), ConfirmUserComposable.INSTANCE.getLambda$719729513$feature_p2p_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-984428887$feature_p2p_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16434getLambda$984428887$feature_p2p_externalDebug() {
        return f9111lambda$984428887;
    }

    public final Function2<Composer, Integer, Unit> getLambda$719729513$feature_p2p_externalDebug() {
        return lambda$719729513;
    }
}
