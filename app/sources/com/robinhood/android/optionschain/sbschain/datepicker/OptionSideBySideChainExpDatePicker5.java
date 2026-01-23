package com.robinhood.android.optionschain.sbschain.datepicker;

import androidx.compose.material3.TabRowKt;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainExpDatePicker.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt$RemoveMinTabWidth$1$1", m3645f = "OptionSideBySideChainExpDatePicker.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePickerKt$RemoveMinTabWidth$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionSideBySideChainExpDatePicker5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    OptionSideBySideChainExpDatePicker5(Continuation<? super OptionSideBySideChainExpDatePicker5> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainExpDatePicker5(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionSideBySideChainExpDatePicker5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            int i = TabRowKt.$r8$clinit;
            Field declaredField = TabRowKt.class.getDeclaredField("ScrollableTabRowMinimumTabWidth");
            declaredField.setAccessible(true);
            declaredField.set(AndroidCompositionLocals_androidKt.getLocalContext(), boxing.boxFloat(0.0f));
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
