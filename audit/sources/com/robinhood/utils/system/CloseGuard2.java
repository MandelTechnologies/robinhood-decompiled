package com.robinhood.utils.system;

import com.robinhood.utils.system.CloseGuard;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloseGuard.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/system/NativeCloseGuard;", "Lcom/robinhood/utils/system/CloseGuard;", "instance", "", "methods", "Lcom/robinhood/utils/system/CloseGuard$Methods;", "<init>", "(Ljava/lang/Object;Lcom/robinhood/utils/system/CloseGuard$Methods;)V", "open", "", "closer", "", "warnIfOpen", "close", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.system.NativeCloseGuard, reason: use source file name */
/* loaded from: classes12.dex */
final class CloseGuard2 extends CloseGuard {
    private final Object instance;
    private final CloseGuard.Methods methods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseGuard2(Object instance, CloseGuard.Methods methods) {
        super(null);
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.instance = instance;
        this.methods = methods;
    }

    @Override // com.robinhood.utils.system.CloseGuard
    public void open(String closer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(closer, "closer");
        this.methods.getOpenMethod().invoke(this.instance, closer);
    }

    @Override // com.robinhood.utils.system.CloseGuard
    public void warnIfOpen() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.methods.getWarnIfOpenMethod().invoke(this.instance, null);
    }

    @Override // com.robinhood.utils.system.CloseGuard
    public void close() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.methods.getCloseMethod().invoke(this.instance, null);
    }
}
