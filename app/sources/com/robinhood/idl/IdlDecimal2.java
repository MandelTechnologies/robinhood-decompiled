package com.robinhood.idl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdlDecimal.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toIdlDecimal", "Lcom/robinhood/idl/IdlDecimal;", "Ljava/math/BigDecimal;", "lib-types"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.IdlDecimalKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class IdlDecimal2 {
    public static final IdlDecimal toIdlDecimal(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new IdlDecimal(plainString);
    }
}
