package com.robinhood.android.lib.formats;

import android.icu.text.NumberFormat;
import com.robinhood.g11n.CurrencyFormatterLocale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThreadLocals.kt */
@Metadata(m3635d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\r\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0003¨\u0006\u0004¸\u0006\u0000"}, m3636d2 = {"com/robinhood/android/lib/formats/ThreadLocals$lazy$1", "Ljava/lang/ThreadLocal;", "initialValue", "()Ljava/lang/Object;", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class FormatsLocalizedKt$localizedWrappedNumberFormat$$inlined$lazy$1 extends ThreadLocal<IcuSmallAmountFormatter> {
    final /* synthetic */ Function1 $create$inlined;
    final /* synthetic */ boolean $enableSubPennyFormatting$inlined;
    final /* synthetic */ boolean $forceSubPennyTrailingZeros$inlined;
    final /* synthetic */ Function1 $init$inlined;

    public FormatsLocalizedKt$localizedWrappedNumberFormat$$inlined$lazy$1(Function1 function1, Function1 function12, boolean z, boolean z2) {
        this.$create$inlined = function1;
        this.$init$inlined = function12;
        this.$enableSubPennyFormatting$inlined = z;
        this.$forceSubPennyTrailingZeros$inlined = z2;
    }

    @Override // java.lang.ThreadLocal
    protected IcuSmallAmountFormatter initialValue() {
        Object objInvoke = this.$create$inlined.invoke(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
        this.$init$inlined.invoke(objInvoke);
        return new IcuSmallAmountFormatter((NumberFormat) objInvoke, this.$enableSubPennyFormatting$inlined, this.$forceSubPennyTrailingZeros$inlined);
    }
}
