package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.ToastData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import microgram.p507ui.p508v1.ActionDto;
import microgram.p507ui.p508v1.ToastDto;

/* compiled from: Toast.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"/\u0010\u0004\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"/\u0010\u000b\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\"C\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"/\u0010\u0016\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0001j\u0002`\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0017\u0010\b\"=\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0001*\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0001j\u0002`\u00118GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\u0013*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\"\u0010\u0015\"\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u00012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0001¨\u0006\u001d"}, m3636d2 = {"AnyToast", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/ToastData;", "Lmicrogram/ui/v1/ToastDto;", "id", "", "Lcom/robinhood/microgram/sdui/AnyToast;", "getId", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", "id$delegate", "Lkotlin/properties/ReadOnlyProperty;", "text", "getText", "text$delegate", "action", "Lcom/robinhood/microgram/sdui/ToastData$ActionData;", "Lmicrogram/ui/v1/ToastDto$ActionDataDto;", "Lcom/robinhood/microgram/sdui/AnyToastActionData;", "anyToastAction", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", "action$delegate", "AnyToastActionData", "title", "getTitle", "title$delegate", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "Lmicrogram/ui/v1/ActionDto;", "anyToastActionDataAction", "action$delegate$1", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.ToastKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class Toast3 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Toast3.class, "id", "getId(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(Toast3.class, "text", "getText(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(Toast3.class, "action", "anyToastAction(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(Toast3.class, "title", "getTitle(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(Toast3.class, "action", "anyToastActionDataAction(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1))};
    private static final Interfaces2 action$delegate;
    private static final Interfaces2 action$delegate$1;
    private static final Interfaces2 id$delegate;
    private static final Interfaces2 text$delegate;
    private static final Interfaces2 title$delegate;

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        id$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.ToastKt$special$$inlined$identicalProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends ToastData, ? extends ToastDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends ToastData, ? extends ToastDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (thisRef instanceof UiObject.Legacy) {
                    return ((ToastData) ((UiObject.Legacy) thisRef).getValue()).getId();
                }
                if (thisRef instanceof UiObject.Idl) {
                    return ((ToastDto) ((UiObject.Idl) thisRef).getValue()).getId();
                }
                throw new NoWhenBranchMatchedException();
            }
        };
        text$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.ToastKt$special$$inlined$identicalProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends ToastData, ? extends ToastDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends ToastData, ? extends ToastDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (thisRef instanceof UiObject.Legacy) {
                    return ((ToastData) ((UiObject.Legacy) thisRef).getValue()).getText();
                }
                if (thisRef instanceof UiObject.Idl) {
                    return ((ToastDto) ((UiObject.Idl) thisRef).getValue()).getText();
                }
                throw new NoWhenBranchMatchedException();
            }
        };
        action$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.ToastKt$special$$inlined$similarProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends ToastData, ? extends ToastDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<ToastData.ActionData, ToastDto.ActionDataDto> getValue(UiObject<? extends ToastData, ? extends ToastDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ToastDto.ActionDataDto action_data = ((ToastDto) ((UiObject.Idl) thisRef).getValue()).getAction_data();
                    if (action_data != null) {
                        return new UiObject.Idl(action_data);
                    }
                    return null;
                }
                ToastData.ActionData actionData = ((ToastData) ((UiObject.Legacy) thisRef).getValue()).getActionData();
                if (actionData != null) {
                    return new UiObject.Legacy(actionData);
                }
                return null;
            }
        };
        title$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.ToastKt$special$$inlined$identicalProperty$3
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends ToastData.ActionData, ? extends ToastDto.ActionDataDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends ToastData.ActionData, ? extends ToastDto.ActionDataDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((ToastDto.ActionDataDto) ((UiObject.Idl) thisRef).getValue()).getTitle();
                }
                return ((ToastData.ActionData) ((UiObject.Legacy) thisRef).getValue()).getTitle();
            }
        };
        action$delegate$1 = new Interfaces2() { // from class: com.robinhood.microgram.sdui.ToastKt$special$$inlined$similarProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends ToastData.ActionData, ? extends ToastDto.ActionDataDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<MicrogramAction, ActionDto> getValue(UiObject<? extends ToastData.ActionData, ? extends ToastDto.ActionDataDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActionDto action = ((ToastDto.ActionDataDto) ((UiObject.Idl) thisRef).getValue()).getAction();
                    if (action != null) {
                        return new UiObject.Idl(action);
                    }
                    return null;
                }
                MicrogramAction action2 = ((ToastData.ActionData) ((UiObject.Legacy) thisRef).getValue()).getAction();
                if (action2 != null) {
                    return new UiObject.Legacy(action2);
                }
                return null;
            }
        };
    }

    public static final String getId(UiObject<ToastData, ToastDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) id$delegate.getValue(uiObject, $$delegatedProperties[0]);
    }

    public static final String getText(UiObject<ToastData, ToastDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) text$delegate.getValue(uiObject, $$delegatedProperties[1]);
    }

    @JvmName
    public static final UiObject<ToastData.ActionData, ToastDto.ActionDataDto> anyToastAction(UiObject<ToastData, ToastDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) action$delegate.getValue(uiObject, $$delegatedProperties[2]);
    }

    public static final String getTitle(UiObject<ToastData.ActionData, ToastDto.ActionDataDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) title$delegate.getValue(uiObject, $$delegatedProperties[3]);
    }

    @JvmName
    public static final UiObject<MicrogramAction, ActionDto> anyToastActionDataAction(UiObject<ToastData.ActionData, ToastDto.ActionDataDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) action$delegate$1.getValue(uiObject, $$delegatedProperties[4]);
    }
}
