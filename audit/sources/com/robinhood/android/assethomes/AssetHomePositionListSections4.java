package com.robinhood.android.assethomes;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.portfolio.position.PositionListItemComposableKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomePositionListSections.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomePositionListSections4 {
    public static final AssetHomePositionListSections4 INSTANCE = new AssetHomePositionListSections4();

    /* renamed from: lambda$-1164719104, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8665lambda$1164719104 = ComposableLambda3.composableLambdaInstance(-1164719104, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt$lambda$-1164719104$1
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
                ComposerKt.traceEventStart(-1164719104, i, -1, "com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt.lambda$-1164719104.<anonymous> (AssetHomePositionListSections.kt:279)");
            }
            AssetHomePositionListSections.AssetHomePositionsHeader(StringResources_androidKt.stringResource(C9612R.string.equities_empty_header, composer, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$648828297 = ComposableLambda3.composableLambdaInstance(648828297, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt$lambda$648828297$1
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
                ComposerKt.traceEventStart(648828297, i2, -1, "com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt.lambda$648828297.<anonymous> (AssetHomePositionListSections.kt:284)");
            }
            PositionListItemComposableKt.PositionListItemPlaceholder(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$513852032 = ComposableLambda3.composableLambdaInstance(513852032, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt$lambda$513852032$1
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
                ComposerKt.traceEventStart(513852032, i, -1, "com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt.lambda$513852032.<anonymous> (AssetHomePositionListSections.kt:338)");
            }
            AssetHomePositionListSections.AssetHomePositionsHeader(StringResources_androidKt.stringResource(C9612R.string.options_empty_header, composer, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-248505783, reason: not valid java name */
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f8666lambda$248505783 = ComposableLambda3.composableLambdaInstance(-248505783, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt$lambda$-248505783$1
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
                ComposerKt.traceEventStart(-248505783, i2, -1, "com.robinhood.android.assethomes.ComposableSingletons$AssetHomePositionListSectionsKt.lambda$-248505783.<anonymous> (AssetHomePositionListSections.kt:343)");
            }
            PositionListItemComposableKt.PositionListItemPlaceholder(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1164719104$feature_asset_homes_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11338getLambda$1164719104$feature_asset_homes_externalDebug() {
        return f8665lambda$1164719104;
    }

    /* renamed from: getLambda$-248505783$feature_asset_homes_externalDebug, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m11339getLambda$248505783$feature_asset_homes_externalDebug() {
        return f8666lambda$248505783;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$513852032$feature_asset_homes_externalDebug() {
        return lambda$513852032;
    }

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$648828297$feature_asset_homes_externalDebug() {
        return lambda$648828297;
    }
}
