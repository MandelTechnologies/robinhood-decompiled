package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DisplayCurrencySwitcher.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$1$3$1$2$1$1$1", m3645f = "DisplayCurrencySwitcher.kt", m3646l = {204, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherKt$DisplayCurrencySwitcher$5$1$3$1$2$1$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class DisplayCurrencySwitcher5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DisplayCurrencySwitcherDuxo $duxo;
    final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
    final /* synthetic */ FormattedDisplayCurrency $formattedDisplayCurrency;
    final /* synthetic */ InteractionSource3 $interactionSource;
    final /* synthetic */ Function0<Unit> $onDropdownDismissed;
    final /* synthetic */ SnapshotState<Boolean> $performClick$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisplayCurrencySwitcher5(FormattedDisplayCurrency formattedDisplayCurrency, InteractionSource3 interactionSource3, SnapshotState<Boolean> snapshotState, DisplayCurrencySwitcherDuxo displayCurrencySwitcherDuxo, Function0<Unit> function0, SnapshotState<Boolean> snapshotState2, Continuation<? super DisplayCurrencySwitcher5> continuation) {
        super(2, continuation);
        this.$formattedDisplayCurrency = formattedDisplayCurrency;
        this.$interactionSource = interactionSource3;
        this.$performClick$delegate = snapshotState;
        this.$duxo = displayCurrencySwitcherDuxo;
        this.$onDropdownDismissed = function0;
        this.$expanded$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DisplayCurrencySwitcher5(this.$formattedDisplayCurrency, this.$interactionSource, this.$performClick$delegate, this.$duxo, this.$onDropdownDismissed, this.$expanded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DisplayCurrencySwitcher5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r8) != r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PressInteraction.Press press;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (DisplayCurrencySwitcher.DisplayCurrencySwitcher$lambda$13(this.$performClick$delegate) && !this.$formattedDisplayCurrency.isSelected()) {
                press = new PressInteraction.Press(Offset.INSTANCE.m6553getZeroF1C5BW0(), null);
                InteractionSource3 interactionSource3 = this.$interactionSource;
                this.L$0 = press;
                this.label = 1;
                if (interactionSource3.emit(press, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            press = (PressInteraction.Press) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DisplayCurrencySwitcher4.C217362.invoke$lambda$8$selectCurrencyAndDismiss(this.$duxo, this.$formattedDisplayCurrency, this.$onDropdownDismissed, this.$expanded$delegate);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 3;
        }
        InteractionSource3 interactionSource32 = this.$interactionSource;
        PressInteraction.Release release = new PressInteraction.Release(press);
        this.L$0 = null;
        this.label = 2;
        if (interactionSource32.emit(release, this) != coroutine_suspended) {
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
