package com.robinhood.android.dashboardpill.p096ui;

import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.SnapshotState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DashboardPillButton.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$rememberStaticWidth$1$1", m3645f = "DashboardPillButton.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboardpill.ui.DashboardPillButtonKt$rememberStaticWidth$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DashboardPillButton9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ int $hoursDigits;
    final /* synthetic */ TextMeasurer $textMeasurer;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ SnapshotState<C2002Dp> $width;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardPillButton9(SnapshotState<C2002Dp> snapshotState, TextMeasurer textMeasurer, TextStyle textStyle, Density density, int i, Continuation<? super DashboardPillButton9> continuation) {
        super(2, continuation);
        this.$width = snapshotState;
        this.$textMeasurer = textMeasurer;
        this.$textStyle = textStyle;
        this.$density = density;
        this.$hoursDigits = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardPillButton9(this.$width, this.$textMeasurer, this.$textStyle, this.$density, this.$hoursDigits, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardPillButton9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Integer next;
        TextStyle textStyle;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(0, 9);
        TextMeasurer textMeasurer = this.$textMeasurer;
        TextStyle textStyle2 = this.$textStyle;
        Density density = this.$density;
        int i = this.$hoursDigits;
        Iterator<Integer> it = primitiveRanges2.iterator();
        C2002Dp c2002DpM7993boximpl = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = next.intValue();
                char c = ':';
                textStyle = textStyle2;
                C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, StringsKt.repeat(String.valueOf(iIntValue), i) + ':' + StringsKt.repeat(String.valueOf(iIntValue), 2) + ':' + StringsKt.repeat(String.valueOf(iIntValue), 2), TextStyle.m7655copyp1EtxEg$default(textStyle2, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32)));
                while (true) {
                    Integer next2 = it.next();
                    int iIntValue2 = next2.intValue();
                    C2002Dp c2002Dp = c2002DpM7993boximpl2;
                    TextStyle textStyle3 = textStyle;
                    textStyle = textStyle3;
                    c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, StringsKt.repeat(String.valueOf(iIntValue2), i) + c + StringsKt.repeat(String.valueOf(iIntValue2), 2) + c + StringsKt.repeat(String.valueOf(iIntValue2), 2), TextStyle.m7655copyp1EtxEg$default(textStyle3, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32)));
                    if (c2002Dp.compareTo(c2002DpM7993boximpl2) < 0) {
                        next = next2;
                    } else {
                        c2002DpM7993boximpl2 = c2002Dp;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    c = ':';
                }
            } else {
                textStyle = textStyle2;
            }
        } else {
            textStyle = textStyle2;
            next = null;
        }
        if (next != null) {
            int iIntValue3 = next.intValue();
            c2002DpM7993boximpl = C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, StringsKt.repeat(String.valueOf(iIntValue3), i) + ':' + StringsKt.repeat(String.valueOf(iIntValue3), 2) + ':' + StringsKt.repeat(String.valueOf(iIntValue3), 2), TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32)));
        }
        this.$width.setValue(C2002Dp.m7993boximpl(c2002DpM7993boximpl != null ? c2002DpM7993boximpl.getValue() : C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()));
        return Unit.INSTANCE;
    }
}
