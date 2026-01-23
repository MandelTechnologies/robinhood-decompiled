package com.robinhood.android.event.detail;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailMultiContractList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EventDetailMultiContractListKt {
    public static final ComposableSingletons$EventDetailMultiContractListKt INSTANCE = new ComposableSingletons$EventDetailMultiContractListKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1387346 = ComposableLambda3.composableLambdaInstance(1387346, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt$lambda$1387346$1
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
                ComposerKt.traceEventStart(1387346, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt.lambda$1387346.<anonymous> (EventDetailMultiContractList.kt:60)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C16095R.string.event_detail_multi_contract_header, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$986914741 = ComposableLambda3.composableLambdaInstance(986914741, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt$lambda$986914741$1
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
                ComposerKt.traceEventStart(986914741, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt.lambda$986914741.<anonymous> (EventDetailMultiContractList.kt:126)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, "- ------- ----- ---", (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("-------"), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer, BentoBaseRowState.$stable << 3, 125);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$1538812741 = ComposableLambda3.composableLambdaInstance(1538812741, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt$lambda$1538812741$1
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
                ComposerKt.traceEventStart(1538812741, i2, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt.lambda$1538812741.<anonymous> (EventDetailMultiContractList.kt:125)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$EventDetailMultiContractListKt.INSTANCE.getLambda$986914741$feature_event_detail_externalDebug(), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1210729213, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8934lambda$1210729213 = ComposableLambda3.composableLambdaInstance(-1210729213, false, C16033xf5e107a1.INSTANCE);

    /* renamed from: lambda$-1299864577, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8935lambda$1299864577 = ComposableLambda3.composableLambdaInstance(-1299864577, false, C16034x1b3662b.INSTANCE);

    /* renamed from: getLambda$-1210729213$feature_event_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14097getLambda$1210729213$feature_event_detail_externalDebug() {
        return f8934lambda$1210729213;
    }

    /* renamed from: getLambda$-1299864577$feature_event_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14098getLambda$1299864577$feature_event_detail_externalDebug() {
        return f8935lambda$1299864577;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1387346$feature_event_detail_externalDebug() {
        return lambda$1387346;
    }

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$1538812741$feature_event_detail_externalDebug() {
        return lambda$1538812741;
    }

    public final Function2<Composer, Integer, Unit> getLambda$986914741$feature_event_detail_externalDebug() {
        return lambda$986914741;
    }
}
