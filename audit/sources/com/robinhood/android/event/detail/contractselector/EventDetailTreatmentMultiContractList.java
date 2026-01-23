package com.robinhood.android.event.detail.contractselector;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.detail.C16095R;
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

/* compiled from: EventDetailTreatmentMultiContractList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.ComposableSingletons$EventDetailTreatmentMultiContractListKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailTreatmentMultiContractList {
    public static final EventDetailTreatmentMultiContractList INSTANCE = new EventDetailTreatmentMultiContractList();

    /* renamed from: lambda$-1469429309, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8938lambda$1469429309 = ComposableLambda3.composableLambdaInstance(-1469429309, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$EventDetailTreatmentMultiContractListKt$lambda$-1469429309$1
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
                ComposerKt.traceEventStart(-1469429309, i, -1, "com.robinhood.android.event.detail.contractselector.ComposableSingletons$EventDetailTreatmentMultiContractListKt.lambda$-1469429309.<anonymous> (EventDetailTreatmentMultiContractList.kt:33)");
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

    /* renamed from: lambda$-40466176, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8939lambda$40466176 = ComposableLambda3.composableLambdaInstance(-40466176, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$EventDetailTreatmentMultiContractListKt$lambda$-40466176$1
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
                ComposerKt.traceEventStart(-40466176, i, -1, "com.robinhood.android.event.detail.contractselector.ComposableSingletons$EventDetailTreatmentMultiContractListKt.lambda$-40466176.<anonymous> (EventDetailTreatmentMultiContractList.kt:94)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, "---------------------------", (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer, BentoBaseRowState.$stable << 3, 125);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1108620432, reason: not valid java name */
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f8937lambda$1108620432 = ComposableLambda3.composableLambdaInstance(-1108620432, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$EventDetailTreatmentMultiContractListKt$lambda$-1108620432$1
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
                ComposerKt.traceEventStart(-1108620432, i2, -1, "com.robinhood.android.event.detail.contractselector.ComposableSingletons$EventDetailTreatmentMultiContractListKt.lambda$-1108620432.<anonymous> (EventDetailTreatmentMultiContractList.kt:93)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, EventDetailTreatmentMultiContractList.INSTANCE.m14136getLambda$40466176$feature_event_detail_externalDebug(), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1108620432$feature_event_detail_externalDebug, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m14134getLambda$1108620432$feature_event_detail_externalDebug() {
        return f8937lambda$1108620432;
    }

    /* renamed from: getLambda$-1469429309$feature_event_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14135getLambda$1469429309$feature_event_detail_externalDebug() {
        return f8938lambda$1469429309;
    }

    /* renamed from: getLambda$-40466176$feature_event_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14136getLambda$40466176$feature_event_detail_externalDebug() {
        return f8939lambda$40466176;
    }
}
