package com.robinhood.android.pathfinder.corepages.pendingdeposits;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PendingDepositsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.pendingdeposits.ComposableSingletons$PendingDepositsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PendingDepositsComposable {
    public static final PendingDepositsComposable INSTANCE = new PendingDepositsComposable();

    /* renamed from: lambda$-1656645130, reason: not valid java name */
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f9167lambda$1656645130 = ComposableLambda3.composableLambdaInstance(-1656645130, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.ComposableSingletons$PendingDepositsComposableKt$lambda$-1656645130$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1656645130, i2, -1, "com.robinhood.android.pathfinder.corepages.pendingdeposits.ComposableSingletons$PendingDepositsComposableKt.lambda$-1656645130.<anonymous> (PendingDepositsComposable.kt:47)");
            }
            PendingDepositsComposable4.Heading(composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
            PendingDepositsComposable4.Subheading(composer, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
            PendingDepositsComposable4.SectionHeader(composer, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1931061412 = ComposableLambda3.composableLambdaInstance(1931061412, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.ComposableSingletons$PendingDepositsComposableKt$lambda$1931061412$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1931061412, i, -1, "com.robinhood.android.pathfinder.corepages.pendingdeposits.ComposableSingletons$PendingDepositsComposableKt.lambda$1931061412.<anonymous> (PendingDepositsComposable.kt:55)");
            }
            PendingDepositsComposable4.EmptyState(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1656645130$feature_pathfinder_core_pages_externalDebug */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m2366x2472b9f7() {
        return f9167lambda$1656645130;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1931061412$feature_pathfinder_core_pages_externalDebug() {
        return lambda$1931061412;
    }
}
