package com.robinhood.android.futures.trade.extensions;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001aG\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "showTooltip", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function0;", "", "onDismiss", "", "autodismissDuration", "content", "popupAutodismissTooltip", "(Landroidx/compose/ui/Modifier;ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ModifiersKt {
    public static /* synthetic */ Modifier popupAutodismissTooltip$default(Modifier modifier, boolean z, CoroutineScope coroutineScope, Function0 function0, long j, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            j = 3000;
        }
        return popupAutodismissTooltip(modifier, z, coroutineScope, function0, j, function2);
    }

    public static final Modifier popupAutodismissTooltip(Modifier modifier, boolean z, final CoroutineScope coroutineScope, final Function0<Unit> onDismiss, final long j, final Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return PopupTooltipKt.m26519popupTooltipBgaGok8(modifier, (16232 & 1) != 0 ? Boolean.TRUE : Boolean.valueOf(z), (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : new Function0() { // from class: com.robinhood.android.futures.trade.extensions.ModifiersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifiersKt.popupAutodismissTooltip$lambda$0(objectRef, onDismiss);
            }
        }, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : new Function0() { // from class: com.robinhood.android.futures.trade.extensions.ModifiersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifiersKt.popupAutodismissTooltip$lambda$1(objectRef, coroutineScope, j, onDismiss);
            }
        }, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : null, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.composableLambdaInstance(-1194181732, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.extensions.ModifiersKt.popupAutodismissTooltip.3
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
                    ComposerKt.traceEventStart(-1194181732, i, -1, "com.robinhood.android.futures.trade.extensions.popupAutodismissTooltip.<anonymous> (Modifiers.kt:31)");
                }
                content.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, kotlinx.coroutines.Job] */
    public static final Unit popupAutodismissTooltip$lambda$1(Ref.ObjectRef objectRef, CoroutineScope coroutineScope, long j, Function0 function0) {
        objectRef.element = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModifiersKt$popupAutodismissTooltip$2$1(j, function0, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit popupAutodismissTooltip$lambda$0(Ref.ObjectRef objectRef, Function0 function0) {
        Job job = (Job) objectRef.element;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
