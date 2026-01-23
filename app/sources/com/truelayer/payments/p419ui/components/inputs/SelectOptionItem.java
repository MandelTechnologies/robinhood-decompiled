package com.truelayer.payments.p419ui.components.inputs;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.screens.formflows.model.SelectOption;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectOptionItem.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.inputs.ComposableSingletons$SelectOptionItemKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SelectOptionItem {
    public static final SelectOptionItem INSTANCE = new SelectOptionItem();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<BoxScope, Composer, Integer, Unit> f9568lambda1 = ComposableLambda3.composableLambdaInstance(163060609, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.ComposableSingletons$SelectOptionItemKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope EncircledProviderImage, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(EncircledProviderImage, "$this$EncircledProviderImage");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(163060609, i, -1, "com.truelayer.payments.ui.components.inputs.ComposableSingletons$SelectOptionItemKt.lambda-1.<anonymous> (SelectOptionItem.kt:48)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9569lambda2 = ComposableLambda3.composableLambdaInstance(2108177826, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.ComposableSingletons$SelectOptionItemKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2108177826, i, -1, "com.truelayer.payments.ui.components.inputs.ComposableSingletons$SelectOptionItemKt.lambda-2.<anonymous> (SelectOptionItem.kt:64)");
                }
                SelectOptionItem4.SelectOptionItem(null, new SelectOption("id", "Test Option", null, null, null, CollectionsKt.emptyList(), 16, null), new Function1<SelectOption, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.ComposableSingletons$SelectOptionItemKt$lambda-2$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SelectOption selectOption) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SelectOption selectOption) {
                        invoke2(selectOption);
                        return Unit.INSTANCE;
                    }
                }, composer, 448, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m27053getLambda1$payments_ui_release() {
        return f9568lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27054getLambda2$payments_ui_release() {
        return f9569lambda2;
    }
}
