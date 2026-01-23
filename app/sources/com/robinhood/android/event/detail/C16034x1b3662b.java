package com.robinhood.android.event.detail;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventDetailMultiContractList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt$lambda$-1299864577$1 */
/* loaded from: classes3.dex */
final class C16034x1b3662b implements Function2<Composer, Integer, Unit> {
    public static final C16034x1b3662b INSTANCE = new C16034x1b3662b();

    C16034x1b3662b() {
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
            ComposerKt.traceEventStart(-1299864577, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt.lambda$-1299864577.<anonymous> (EventDetailMultiContractList.kt:327)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt$lambda$-1299864577$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16034x1b3662b.invoke$lambda$4$lambda$3((LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 805306368, 511);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        EventDetailMultiContractListKt.eventDetailContractList(null, 3, new Function0() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt$lambda$-1299864577$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, new Function1() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt$lambda$-1299864577$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C16034x1b3662b.invoke$lambda$4$lambda$3$lambda$1((UUID) obj);
            }
        }, new Function0() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailMultiContractListKt$lambda$-1299864577$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }).invoke(LazyColumn);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$1(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
