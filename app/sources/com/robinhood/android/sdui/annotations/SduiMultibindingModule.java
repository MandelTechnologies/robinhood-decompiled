package com.robinhood.android.sdui.annotations;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: SduiMultibindingModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001R)\u0010\u0002\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR)\u0010\t\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/sdui/annotations/SduiMultibindingModule;", "", "jsonComponents", "", "Ljava/lang/Class;", "Lcom/robinhood/android/sdui/annotations/SduiComponentRenderer;", "Lkotlin/jvm/JvmSuppressWildcards;", "getJsonComponents", "()Ljava/util/Map;", "protoComponents", "Lcom/robinhood/android/sdui/annotations/SduiComponentRendererIdl;", "getProtoComponents", "lib-sdui-annotations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface SduiMultibindingModule {
    Map<Class<?>, SduiComponentRenderer> getJsonComponents();

    Map<Class<?>, SduiComponentRendererIdl> getProtoComponents();
}
