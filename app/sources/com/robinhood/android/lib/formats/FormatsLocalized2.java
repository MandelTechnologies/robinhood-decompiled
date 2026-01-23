package com.robinhood.android.lib.formats;

import android.icu.text.NumberFormat;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.g11n.CurrencyFormatterLocale;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FormatsLocalized.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\tH\u0082\b\u001aT\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\tH\u0082\b\u001aN\u0010\u000f\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\tH\u0082\b¨\u0006\u0010"}, m3636d2 = {"localizedNumberFormat", "Ljava/lang/ThreadLocal;", "Lcom/robinhood/android/lib/formats/IcuNumberFormatter;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lkotlin/Function1;", "Ljava/util/Locale;", "Landroid/icu/text/NumberFormat;", "init", "", "Lkotlin/ExtensionFunctionType;", "localizedWrappedNumberFormat", "Lcom/robinhood/android/lib/formats/IcuSmallAmountFormatter;", "enableSubPennyFormatting", "", "forceSubPennyTrailingZeros", "getLocalizedWrappedNumberFormat", "lib-formats_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.formats.FormatsLocalizedKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class FormatsLocalized2 {
    private static final ThreadLocal<IcuNumberFormatter> localizedNumberFormat(final Function1<? super Locale, ? extends NumberFormat> function1, final Function1<? super NumberFormat, Unit> function12) {
        ThreadLocals threadLocals = ThreadLocals.INSTANCE;
        return new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalizedKt$localizedNumberFormat$$inlined$lazy$1
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                Object objInvoke = function1.invoke(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                function12.invoke(objInvoke);
                return new IcuNumberFormatter((NumberFormat) objInvoke);
            }
        };
    }

    private static final ThreadLocal<IcuSmallAmountFormatter> localizedWrappedNumberFormat(Function1<? super Locale, ? extends NumberFormat> function1, boolean z, boolean z2, Function1<? super NumberFormat, Unit> function12) {
        ThreadLocals threadLocals = ThreadLocals.INSTANCE;
        return new FormatsLocalizedKt$localizedWrappedNumberFormat$$inlined$lazy$1(function1, function12, z, z2);
    }

    static /* synthetic */ ThreadLocal localizedWrappedNumberFormat$default(Function1 function1, boolean z, boolean z2, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        ThreadLocals threadLocals = ThreadLocals.INSTANCE;
        return new FormatsLocalizedKt$localizedWrappedNumberFormat$$inlined$lazy$1(function1, function12, z, z2);
    }

    private static final IcuSmallAmountFormatter getLocalizedWrappedNumberFormat(Function1<? super Locale, ? extends NumberFormat> function1, boolean z, boolean z2, Function1<? super NumberFormat, Unit> function12) {
        NumberFormat numberFormatInvoke = function1.invoke(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
        function12.invoke(numberFormatInvoke);
        return new IcuSmallAmountFormatter(numberFormatInvoke, z, z2);
    }

    static /* synthetic */ IcuSmallAmountFormatter getLocalizedWrappedNumberFormat$default(Function1 function1, boolean z, boolean z2, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        Object objInvoke = function1.invoke(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
        function12.invoke(objInvoke);
        return new IcuSmallAmountFormatter((NumberFormat) objInvoke, z, z2);
    }
}
