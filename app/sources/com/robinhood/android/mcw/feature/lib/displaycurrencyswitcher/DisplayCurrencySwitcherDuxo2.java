package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: DisplayCurrencySwitcherDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$tryOpenFxDropdown$state$1", m3645f = "DisplayCurrencySwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherDuxo$tryOpenFxDropdown$state$1, reason: use source file name */
/* loaded from: classes8.dex */
final class DisplayCurrencySwitcherDuxo2 extends ContinuationImpl7 implements Function2<DisplayCurrencySwitcherViewState, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    DisplayCurrencySwitcherDuxo2(Continuation<? super DisplayCurrencySwitcherDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DisplayCurrencySwitcherDuxo2 displayCurrencySwitcherDuxo2 = new DisplayCurrencySwitcherDuxo2(continuation);
        displayCurrencySwitcherDuxo2.L$0 = obj;
        return displayCurrencySwitcherDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DisplayCurrencySwitcherViewState displayCurrencySwitcherViewState, Continuation<? super Boolean> continuation) {
        return ((DisplayCurrencySwitcherDuxo2) create(displayCurrencySwitcherViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(((DisplayCurrencySwitcherViewState) this.L$0).getMcwDisplayCurrencies() != null);
    }
}
