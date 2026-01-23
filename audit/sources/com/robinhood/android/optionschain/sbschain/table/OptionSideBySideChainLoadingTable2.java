package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: OptionSideBySideChainLoadingTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$OptionSideBySideChainLoadingTable$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionSideBySideChainLoadingTable2 implements PointerInputEventHandler {
    public static final OptionSideBySideChainLoadingTable2 INSTANCE = new OptionSideBySideChainLoadingTable2();

    OptionSideBySideChainLoadingTable2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Offset offset) {
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainLoadingTableKt$OptionSideBySideChainLoadingTable$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionSideBySideChainLoadingTable2.invoke$lambda$0((Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }
}
