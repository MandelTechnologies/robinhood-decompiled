package com.robinhood.android.crypto.tab.p093ui;

import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPoint;
import com.robinhood.android.crypto.tab.p093ui.disclosures.CryptoHomeBottomDisclosuresComposable;
import com.robinhood.android.crypto.tab.p093ui.disclosures.CryptoHomeDisclosuresComposable;
import com.robinhood.android.crypto.tab.p093ui.education.CryptoHomeEducationComposable;
import com.robinhood.android.crypto.tab.p093ui.nux.CryptoHomeNuxComposable3;
import com.robinhood.android.crypto.tab.p093ui.rewards.banner.CryptoHomeRewardsComposable;
import com.robinhood.android.crypto.tab.p093ui.rewards.card.CryptoHomeRewardsCardComposable3;
import com.robinhood.android.crypto.tab.p093ui.support.CryptoHomeSupportComposable;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.librobinhood.data.store.identi.SortingHatQueryArgs;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CryptoHomeComposableKt {
    public static final ComposableSingletons$CryptoHomeComposableKt INSTANCE = new ComposableSingletons$CryptoHomeComposableKt();

    /* renamed from: lambda$-2127179621, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8831lambda$2127179621 = ComposableLambda3.composableLambdaInstance(-2127179621, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$-2127179621$1
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
                ComposerKt.traceEventStart(-2127179621, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$-2127179621.<anonymous> (CryptoHomeComposable.kt:296)");
            }
            ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), CryptoHomeComposableKt.CryptoHomeError), null, 0, null, null, null, null, false, composer, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1509284483, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8829lambda$1509284483 = ComposableLambda3.composableLambdaInstance(-1509284483, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$-1509284483$1
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
                ComposerKt.traceEventStart(-1509284483, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$-1509284483.<anonymous> (CryptoHomeComposable.kt:330)");
            }
            CryptoHomeNuxComposable3.CryptoHomeNuxComposable(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$981447412 = ComposableLambda3.composableLambdaInstance(981447412, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$981447412$1
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
                ComposerKt.traceEventStart(981447412, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$981447412.<anonymous> (CryptoHomeComposable.kt:397)");
            }
            CryptoHomeEducationComposable.CryptoHomeEducationComposable(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1263262219, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8827lambda$1263262219 = ComposableLambda3.composableLambdaInstance(-1263262219, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$-1263262219$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1263262219, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$-1263262219.<anonymous> (CryptoHomeComposable.kt:401)");
            }
            MenuOfOptionsComposableKt.MenuOfOptionsComposable(new SortingHatQueryArgs(null, null, false, 7, null), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, false, null, null, composer, 0, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1457714185, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8828lambda$1457714185 = ComposableLambda3.composableLambdaInstance(-1457714185, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$-1457714185$1
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
                ComposerKt.traceEventStart(-1457714185, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$-1457714185.<anonymous> (CryptoHomeComposable.kt:420)");
            }
            CryptoHomeRewardsComposable.CryptoHomeRewardsComposable(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$592543480 = ComposableLambda3.composableLambdaInstance(592543480, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$592543480$1
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
                ComposerKt.traceEventStart(592543480, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$592543480.<anonymous> (CryptoHomeComposable.kt:424)");
            }
            CryptoHomeRewardsCardComposable3.CryptoHomeRewardsCardComposable(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1664467414, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8830lambda$1664467414 = ComposableLambda3.composableLambdaInstance(-1664467414, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$-1664467414$1
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
                ComposerKt.traceEventStart(-1664467414, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$-1664467414.<anonymous> (CryptoHomeComposable.kt:441)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$114925587 = ComposableLambda3.composableLambdaInstance(114925587, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$114925587$1
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
                ComposerKt.traceEventStart(114925587, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$114925587.<anonymous> (CryptoHomeComposable.kt:479)");
            }
            CryptoHomeSupportComposable.CryptoHomeSupportComposable(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1776279320 = ComposableLambda3.composableLambdaInstance(1776279320, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$1776279320$1
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
                ComposerKt.traceEventStart(1776279320, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$1776279320.<anonymous> (CryptoHomeComposable.kt:535)");
            }
            CryptoHomeDisclosuresComposable.CryptoHomeDisclosuresComposable(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-751596238, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8832lambda$751596238 = ComposableLambda3.composableLambdaInstance(-751596238, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$-751596238$1
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
                ComposerKt.traceEventStart(-751596238, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$-751596238.<anonymous> (CryptoHomeComposable.kt:580)");
            }
            CryptoPulseEntryPoint.CryptoPulseEntryPoint(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-884003582, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8833lambda$884003582 = ComposableLambda3.composableLambdaInstance(-884003582, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt$lambda$-884003582$1
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
                ComposerKt.traceEventStart(-884003582, i, -1, "com.robinhood.android.crypto.tab.ui.ComposableSingletons$CryptoHomeComposableKt.lambda$-884003582.<anonymous> (CryptoHomeComposable.kt:623)");
            }
            CryptoHomeBottomDisclosuresComposable.CryptoHomeBottomDisclosuresComposable(com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1263262219$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12983getLambda$1263262219$feature_crypto_tab_externalDebug() {
        return f8827lambda$1263262219;
    }

    /* renamed from: getLambda$-1457714185$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12984getLambda$1457714185$feature_crypto_tab_externalDebug() {
        return f8828lambda$1457714185;
    }

    /* renamed from: getLambda$-1509284483$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12985getLambda$1509284483$feature_crypto_tab_externalDebug() {
        return f8829lambda$1509284483;
    }

    /* renamed from: getLambda$-1664467414$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12986getLambda$1664467414$feature_crypto_tab_externalDebug() {
        return f8830lambda$1664467414;
    }

    /* renamed from: getLambda$-2127179621$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12987getLambda$2127179621$feature_crypto_tab_externalDebug() {
        return f8831lambda$2127179621;
    }

    /* renamed from: getLambda$-751596238$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12988getLambda$751596238$feature_crypto_tab_externalDebug() {
        return f8832lambda$751596238;
    }

    /* renamed from: getLambda$-884003582$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12989getLambda$884003582$feature_crypto_tab_externalDebug() {
        return f8833lambda$884003582;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$114925587$feature_crypto_tab_externalDebug() {
        return lambda$114925587;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1776279320$feature_crypto_tab_externalDebug() {
        return lambda$1776279320;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$592543480$feature_crypto_tab_externalDebug() {
        return lambda$592543480;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$981447412$feature_crypto_tab_externalDebug() {
        return lambda$981447412;
    }
}
