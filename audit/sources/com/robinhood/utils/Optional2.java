package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;

/* compiled from: Optional.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\b\b\u0000\u0010\u0007*\u00020\bH\u0007¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/None;", "Lcom/robinhood/utils/Optional;", "", "<init>", "()V", "getOrNull", "dontCallThisFromKotlin", "T", "", "ofType", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.None, reason: use source file name */
/* loaded from: classes21.dex */
public final class Optional2 extends Optional {
    public static final Optional2 INSTANCE = new Optional2();

    @Override // com.robinhood.utils.Optional
    public Void getOrNull() {
        return null;
    }

    private Optional2() {
        super(null);
    }

    @JvmStatic
    @JvmName
    public static final <T> Optional<T> ofType() {
        return INSTANCE;
    }
}
