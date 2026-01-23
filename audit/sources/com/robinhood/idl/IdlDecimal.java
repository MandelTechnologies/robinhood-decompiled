package com.robinhood.idl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IdlDecimal.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/idl/IdlDecimal;", "", "stringValue", "", "<init>", "(Ljava/lang/String;)V", "getStringValue", "()Ljava/lang/String;", "toBigDecimalOrNull", "Ljava/math/BigDecimal;", "toBigDecimalOrThrow", "toString", "component1", "copy", "equals", "", "other", "hashCode", "", "lib-types"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class IdlDecimal {
    private final String stringValue;

    public static /* synthetic */ IdlDecimal copy$default(IdlDecimal idlDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idlDecimal.stringValue;
        }
        return idlDecimal.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    public final IdlDecimal copy(String stringValue) {
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        return new IdlDecimal(stringValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IdlDecimal) && Intrinsics.areEqual(this.stringValue, ((IdlDecimal) other).stringValue);
    }

    public int hashCode() {
        return this.stringValue.hashCode();
    }

    public IdlDecimal(String stringValue) {
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        this.stringValue = stringValue;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    public final BigDecimal toBigDecimalOrNull() {
        return StringsKt.toBigDecimalOrNull(this.stringValue);
    }

    public final BigDecimal toBigDecimalOrThrow() {
        return new BigDecimal(this.stringValue);
    }

    public String toString() {
        return this.stringValue;
    }
}
