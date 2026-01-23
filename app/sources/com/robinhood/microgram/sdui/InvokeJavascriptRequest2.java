package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import microgram.p507ui.p508v1.screen_events.InvokeJavascriptRequestDto;

/* compiled from: InvokeJavascriptRequest.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"/\u0010\u0004\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u000b"}, m3636d2 = {"AnyInvokeJavascriptRequest", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InvokeJavascriptRequest;", "Lmicrogram/ui/v1/screen_events/InvokeJavascriptRequestDto;", "script", "", "Lcom/robinhood/microgram/sdui/AnyInvokeJavascriptRequest;", "getScript", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", "script$delegate", "Lkotlin/properties/ReadOnlyProperty;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.InvokeJavascriptRequestKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class InvokeJavascriptRequest2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvokeJavascriptRequest2.class, "script", "getScript(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1))};
    private static final Interfaces2 script$delegate;

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        script$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.InvokeJavascriptRequestKt$special$$inlined$identicalProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends InvokeJavascriptRequest, ? extends InvokeJavascriptRequestDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends InvokeJavascriptRequest, ? extends InvokeJavascriptRequestDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((InvokeJavascriptRequestDto) ((UiObject.Idl) thisRef).getValue()).getScript();
                }
                return ((InvokeJavascriptRequest) ((UiObject.Legacy) thisRef).getValue()).getScript();
            }
        };
    }

    public static final String getScript(UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) script$delegate.getValue(uiObject, $$delegatedProperties[0]);
    }
}
