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
import microgram.p507ui.p508v1.InitialScreenDataDto;

/* compiled from: InitialScreenData.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"%\u0010\b\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"%\u0010\f\u001a\u00020\r*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0010\u001a\u00020\u0011*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"/\u0010\u0016\u001a\u00020\u0011*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013\"/\u0010\u0019\u001a\u00020\u0011*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0013*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u001c"}, m3636d2 = {"AnyInitialScreenData", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "legacyScreenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "getLegacyScreenType", "(Lmicrogram/ui/v1/InitialScreenDataDto;)Lcom/robinhood/microgram/sdui/ScreenType;", "screenType", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "getScreenType", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/microgram/sdui/ScreenType;", "theme", "Lcom/robinhood/microgram/sdui/Theme;", "getTheme", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/microgram/sdui/Theme;", "screenIdentifier", "", "getScreenIdentifier", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", "screenIdentifier$delegate", "Lkotlin/properties/ReadOnlyProperty;", "routerIdentifier", "getRouterIdentifier", "routerIdentifier$delegate", "encodedInitialContent", "getEncodedInitialContent", "encodedInitialContent$delegate", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.InitialScreenDataKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class InitialScreenData2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InitialScreenData2.class, "screenIdentifier", "getScreenIdentifier(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(InitialScreenData2.class, "routerIdentifier", "getRouterIdentifier(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(InitialScreenData2.class, "encodedInitialContent", "getEncodedInitialContent(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1))};
    private static final Interfaces2 encodedInitialContent$delegate;
    private static final Interfaces2 routerIdentifier$delegate;
    private static final Interfaces2 screenIdentifier$delegate;

    public static final RouterMessage5 getLegacyScreenType(InitialScreenDataDto initialScreenDataDto) {
        Intrinsics.checkNotNullParameter(initialScreenDataDto, "<this>");
        return RouterMessage5.INSTANCE.fromProtoValue(initialScreenDataDto.getScreen_type());
    }

    public static final RouterMessage5 getScreenType(UiObject<InitialScreenData, InitialScreenDataDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return ((InitialScreenData) ((UiObject.Legacy) uiObject).getValue()).getScreenType();
        }
        if (uiObject instanceof UiObject.Idl) {
            return getLegacyScreenType((InitialScreenDataDto) ((UiObject.Idl) uiObject).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StandardScreen5 getTheme(UiObject<InitialScreenData, InitialScreenDataDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return ((InitialScreenData) ((UiObject.Legacy) uiObject).getValue()).getTheme();
        }
        if (uiObject instanceof UiObject.Idl) {
            return StandardScreen4.toLegacy(((InitialScreenDataDto) ((UiObject.Idl) uiObject).getValue()).getTheme());
        }
        throw new NoWhenBranchMatchedException();
    }

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        screenIdentifier$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.InitialScreenDataKt$special$$inlined$identicalProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((InitialScreenDataDto) ((UiObject.Idl) thisRef).getValue()).getScreen_identifier();
                }
                return ((InitialScreenData) ((UiObject.Legacy) thisRef).getValue()).getScreenIdentifier();
            }
        };
        routerIdentifier$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.InitialScreenDataKt$special$$inlined$identicalProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((InitialScreenDataDto) ((UiObject.Idl) thisRef).getValue()).getRouter_identifier();
                }
                return ((InitialScreenData) ((UiObject.Legacy) thisRef).getValue()).getRouterIdentifier();
            }
        };
        encodedInitialContent$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.InitialScreenDataKt$special$$inlined$identicalProperty$3
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((InitialScreenDataDto) ((UiObject.Idl) thisRef).getValue()).getEncoded_initial_content();
                }
                return ((InitialScreenData) ((UiObject.Legacy) thisRef).getValue()).getEncodedInitialContent();
            }
        };
    }

    public static final String getScreenIdentifier(UiObject<InitialScreenData, InitialScreenDataDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) screenIdentifier$delegate.getValue(uiObject, $$delegatedProperties[0]);
    }

    public static final String getRouterIdentifier(UiObject<InitialScreenData, InitialScreenDataDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) routerIdentifier$delegate.getValue(uiObject, $$delegatedProperties[1]);
    }

    public static final String getEncodedInitialContent(UiObject<InitialScreenData, InitialScreenDataDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) encodedInitialContent$delegate.getValue(uiObject, $$delegatedProperties[2]);
    }
}
