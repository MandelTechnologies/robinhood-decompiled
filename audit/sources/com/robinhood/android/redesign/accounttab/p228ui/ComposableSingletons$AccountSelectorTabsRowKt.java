package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$AccountSelectorTabsRowKt {
    public static final ComposableSingletons$AccountSelectorTabsRowKt INSTANCE = new ComposableSingletons$AccountSelectorTabsRowKt();
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$227779924 = ComposableLambda3.composableLambdaInstance(227779924, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.ComposableSingletons$AccountSelectorTabsRowKt$lambda$227779924$1
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
                ComposerKt.traceEventStart(227779924, i2, -1, "com.robinhood.android.redesign.accounttab.ui.ComposableSingletons$AccountSelectorTabsRowKt.lambda$227779924.<anonymous> (AccountSelectorTabsRow.kt:160)");
            }
            AccountSelectorLoadingTab.AccountSelectorLoadingTab(Modifier.INSTANCE, null, composer, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-883502792, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9191lambda$883502792 = ComposableLambda3.composableLambdaInstance(-883502792, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.ComposableSingletons$AccountSelectorTabsRowKt$lambda$-883502792$1
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
                ComposerKt.traceEventStart(-883502792, i, -1, "com.robinhood.android.redesign.accounttab.ui.ComposableSingletons$AccountSelectorTabsRowKt.lambda$-883502792.<anonymous> (AccountSelectorTabsRow.kt:261)");
            }
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32)) / 2)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$940331125 = ComposableLambda3.composableLambdaInstance(940331125, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.ComposableSingletons$AccountSelectorTabsRowKt$lambda$940331125$1
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
                ComposerKt.traceEventStart(940331125, i, -1, "com.robinhood.android.redesign.accounttab.ui.ComposableSingletons$AccountSelectorTabsRowKt.lambda$940331125.<anonymous> (AccountSelectorTabsRow.kt:551)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1475109548, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9190lambda$1475109548 = ComposableLambda3.composableLambdaInstance(-1475109548, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.ComposableSingletons$AccountSelectorTabsRowKt$lambda$-1475109548$1
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
                ComposerKt.traceEventStart(-1475109548, i, -1, "com.robinhood.android.redesign.accounttab.ui.ComposableSingletons$AccountSelectorTabsRowKt.lambda$-1475109548.<anonymous> (AccountSelectorTabsRow.kt:555)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1475109548$lib_account_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17902getLambda$1475109548$lib_account_tab_externalDebug() {
        return f9190lambda$1475109548;
    }

    /* renamed from: getLambda$-883502792$lib_account_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m17903getLambda$883502792$lib_account_tab_externalDebug() {
        return f9191lambda$883502792;
    }

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$227779924$lib_account_tab_externalDebug() {
        return lambda$227779924;
    }

    public final Function2<Composer, Integer, Unit> getLambda$940331125$lib_account_tab_externalDebug() {
        return lambda$940331125;
    }
}
