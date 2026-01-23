package com.robinhood.android.eventcontracts.hub.p134v2.root;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubInitialLoadingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubInitialLoadingComposable {
    public static final HubInitialLoadingComposable INSTANCE = new HubInitialLoadingComposable();
    private static Function2<Composer, Integer, Unit> lambda$305694325 = ComposableLambda3.composableLambdaInstance(305694325, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt$lambda$305694325$1
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
                ComposerKt.traceEventStart(305694325, i, -1, "com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt.lambda$305694325.<anonymous> (HubInitialLoadingComposable.kt:24)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$966764489 = ComposableLambda3.composableLambdaInstance(966764489, false, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt$lambda$966764489$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(966764489, i, -1, "com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt.lambda$966764489.<anonymous> (HubInitialLoadingComposable.kt:24)");
            }
            ConditionalBackIcon.ConditionalBackIcon(BentoAppBar, composer, (i & 14) | BentoAppBarScope.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-823674360, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8957lambda$823674360 = ComposableLambda3.composableLambdaInstance(-823674360, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt$lambda$-823674360$1
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
                ComposerKt.traceEventStart(-823674360, i, -1, "com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt.lambda$-823674360.<anonymous> (HubInitialLoadingComposable.kt:24)");
            }
            HubInitialLoadingComposable hubInitialLoadingComposable = HubInitialLoadingComposable.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(hubInitialLoadingComposable.getLambda$305694325$feature_hub_v2_externalDebug(), null, hubInitialLoadingComposable.getLambda$966764489$feature_hub_v2_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1812423213, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f8956lambda$1812423213 = ComposableLambda3.composableLambdaInstance(-1812423213, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt$lambda$-1812423213$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1812423213, i, -1, "com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubInitialLoadingComposableKt.lambda$-1812423213.<anonymous> (HubInitialLoadingComposable.kt:27)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1812423213$feature_hub_v2_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m14337getLambda$1812423213$feature_hub_v2_externalDebug() {
        return f8956lambda$1812423213;
    }

    /* renamed from: getLambda$-823674360$feature_hub_v2_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14338getLambda$823674360$feature_hub_v2_externalDebug() {
        return f8957lambda$823674360;
    }

    public final Function2<Composer, Integer, Unit> getLambda$305694325$feature_hub_v2_externalDebug() {
        return lambda$305694325;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$966764489$feature_hub_v2_externalDebug() {
        return lambda$966764489;
    }
}
