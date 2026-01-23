package com.robinhood.android.eventcontracts.hub.p134v2.home;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: HubDefaultCategoryContentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.ComposableSingletons$HubDefaultCategoryContentComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubDefaultCategoryContentComposable {
    public static final HubDefaultCategoryContentComposable INSTANCE = new HubDefaultCategoryContentComposable();

    /* renamed from: lambda$-888768089, reason: not valid java name */
    private static Function4<AnimatedContentScope, ImmutableList<? extends HubDefaultCategoryContentViewState3>, Composer, Integer, Unit> f8955lambda$888768089 = ComposableLambda3.composableLambdaInstance(-888768089, false, new Function4<AnimatedContentScope, ImmutableList<? extends HubDefaultCategoryContentViewState3>, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.ComposableSingletons$HubDefaultCategoryContentComposableKt$lambda$-888768089$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, ImmutableList<? extends HubDefaultCategoryContentViewState3> immutableList, Composer composer, Integer num) {
            invoke(animatedContentScope, immutableList, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, ImmutableList<? extends HubDefaultCategoryContentViewState3> immutableList, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-888768089, i, -1, "com.robinhood.android.eventcontracts.hub.v2.home.ComposableSingletons$HubDefaultCategoryContentComposableKt.lambda$-888768089.<anonymous> (HubDefaultCategoryContentComposable.kt:61)");
            }
            if (immutableList == null || immutableList.isEmpty()) {
                composer.startReplaceGroup(1183299870);
                LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composer, 0, 1);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1183366272);
                HubDefaultCategoryContentComposable4.LoadedLayoutComponents(immutableList, null, composer, (i >> 3) & 14, 2);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$566279186 = ComposableLambda3.composableLambdaInstance(566279186, false, HubDefaultCategoryContentComposable3.INSTANCE);

    /* renamed from: getLambda$-888768089$feature_hub_v2_externalDebug, reason: not valid java name */
    public final Function4<AnimatedContentScope, ImmutableList<? extends HubDefaultCategoryContentViewState3>, Composer, Integer, Unit> m14329getLambda$888768089$feature_hub_v2_externalDebug() {
        return f8955lambda$888768089;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$566279186$feature_hub_v2_externalDebug() {
        return lambda$566279186;
    }
}
