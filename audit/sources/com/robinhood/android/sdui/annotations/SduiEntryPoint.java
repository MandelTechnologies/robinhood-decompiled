package com.robinhood.android.sdui.annotations;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: SduiEntryPoint.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0003H&J\u001d\u0010\u0007\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/sdui/annotations/SduiEntryPoint;", "", "jsonComponents", "", "Ljava/lang/Class;", "Lcom/robinhood/android/sdui/annotations/SduiComponentRenderer;", "Lkotlin/jvm/JvmSuppressWildcards;", "protoComponents", "Lcom/robinhood/android/sdui/annotations/SduiComponentRendererIdl;", "lib-sdui-annotations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface SduiEntryPoint {
    Map<Class<?>, SduiComponentRenderer> jsonComponents();

    Map<Class<?>, SduiComponentRendererIdl> protoComponents();
}
