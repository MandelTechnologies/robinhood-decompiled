package com.robinhood.shared.cards.compose;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.cards.compose.SwipeableStackState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeableStackComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$SwipeableStackComposable$1$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class SwipeableStackComposable4 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ Function6<Row5, T, Boolean, Function0<Unit>, Composer, Integer, Unit> $cardContentAtIndex;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ boolean $isTopCard;

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ SwipeableStackState.CardInStack $listItem;
    final /* synthetic */ SwipeToDismissBoxState $swipeToDismissState;

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function6<-Landroidx/compose/foundation/layout/RowScope;-TT;-Ljava/lang/Boolean;-Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;-Landroidx/compose/runtime/Composer;-Ljava/lang/Integer;Lkotlin/Unit;>;TT;ZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SwipeToDismissBoxState;)V */
    SwipeableStackComposable4(Function6 function6, SwipeableStackState.CardInStack cardInStack, boolean z, CoroutineScope coroutineScope, SwipeToDismissBoxState swipeToDismissBoxState) {
        this.$cardContentAtIndex = function6;
        this.$listItem = cardInStack;
        this.$isTopCard = z;
        this.$coroutineScope = coroutineScope;
        this.$swipeToDismissState = swipeToDismissBoxState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 SwipeToDismissBox, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SwipeToDismissBox, "$this$SwipeToDismissBox");
        if ((i & 6) == 0) {
            i |= composer.changed(SwipeToDismissBox) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1880559000, i, -1, "com.robinhood.shared.cards.compose.SwipeableStackComposable.<anonymous>.<anonymous>.<anonymous> (SwipeableStackComposable.kt:83)");
        }
        Function6<Row5, T, Boolean, Function0<Unit>, Composer, Integer, Unit> function6 = this.$cardContentAtIndex;
        SwipeableStackState.CardInStack cardInStack = this.$listItem;
        Boolean boolValueOf = Boolean.valueOf(this.$isTopCard);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$swipeToDismissState);
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final SwipeToDismissBoxState swipeToDismissBoxState = this.$swipeToDismissState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$SwipeableStackComposable$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SwipeableStackComposable4.invoke$lambda$1$lambda$0(coroutineScope, swipeToDismissBoxState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        function6.invoke(SwipeToDismissBox, cardInStack, boolValueOf, (Function0) objRememberedValue, composer, Integer.valueOf(i & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, SwipeToDismissBoxState swipeToDismissBoxState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SwipeableStackComposable5(swipeToDismissBoxState, null), 3, null);
        return Unit.INSTANCE;
    }
}
