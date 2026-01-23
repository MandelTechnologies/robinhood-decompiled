package com.robinhood.shared.order.type.timeInForce;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.order.type.timeInForce.SelectTimeInForceViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SelectTimeInForceComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt$lambda$-1042624849$1, reason: use source file name */
/* loaded from: classes6.dex */
final class SelectTimeInForceComposable2 implements Function2<Composer, Integer, Unit> {
    public static final SelectTimeInForceComposable2 INSTANCE = new SelectTimeInForceComposable2();

    SelectTimeInForceComposable2() {
    }

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
            ComposerKt.traceEventStart(-1042624849, i, -1, "com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt.lambda$-1042624849.<anonymous> (SelectTimeInForceComposable.kt:123)");
        }
        OrderTimeInForce orderTimeInForce = OrderTimeInForce.GTC;
        StringResource.Companion companion = StringResource.INSTANCE;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new SelectTimeInForceViewState.RowState(orderTimeInForce, companion.invoke("Good til canceled (GTC)"), companion.invoke("<Description>"), true), new SelectTimeInForceViewState.RowState(orderTimeInForce, companion.invoke("Good til day (GTD)"), companion.invoke("<Description>"), false));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt$lambda$-1042624849$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelectTimeInForceComposable2.invoke$lambda$1$lambda$0((OrderTimeInForce) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt$lambda$-1042624849$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        SelectTimeInForceComposable5.MainContent(immutableList3PersistentListOf, function1, (Function0) objRememberedValue2, PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 1, null), composer, StringResource.$stable | 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OrderTimeInForce it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
