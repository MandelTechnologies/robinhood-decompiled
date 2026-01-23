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

/* compiled from: SelectFromMultipleUsersComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$SelectFromMultipleUsersComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SelectFromMultipleUsersComposable {
    public static final SelectFromMultipleUsersComposable INSTANCE = new SelectFromMultipleUsersComposable();
    private static Function2<Composer, Integer, Unit> lambda$1999103689 = ComposableLambda3.composableLambdaInstance(1999103689, false, SelectFromMultipleUsersComposable3.INSTANCE);

    /* renamed from: lambda$-666451447, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9112lambda$666451447 = ComposableLambda3.composableLambdaInstance(-666451447, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$SelectFromMultipleUsersComposableKt$lambda$-666451447$1
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
                ComposerKt.traceEventStart(-666451447, i, -1, "com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$SelectFromMultipleUsersComposableKt.lambda$-666451447.<anonymous> (SelectFromMultipleUsersComposable.kt:90)");
            }
            CompositionLocal3.CompositionLocalProvider(ProfileAvatar3.getLocalImageLoaderOverride().provides(ImageLoaders.create((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), SelectFromMultipleUsersComposable.INSTANCE.getLambda$1999103689$feature_p2p_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-666451447$feature_p2p_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16436getLambda$666451447$feature_p2p_externalDebug() {
        return f9112lambda$666451447;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1999103689$feature_p2p_externalDebug() {
        return lambda$1999103689;
    }
}
