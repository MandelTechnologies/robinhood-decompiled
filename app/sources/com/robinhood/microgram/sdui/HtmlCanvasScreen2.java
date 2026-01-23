package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import microgram.p507ui.p508v1.AndroidAttributesDto;
import microgram.p507ui.p508v1.HtmlCanvasScreenContentDto;
import microgram.p507ui.p508v1.NavigationBarConfigurationDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: HtmlCanvasScreen.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"1\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"C\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0001j\u0004\u0018\u0001`\u000e*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010\"=\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0001*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0015\u0010\u0010\"/\u0010\u0017\u001a\u00020\u0018*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001a\"1\u0010\u001c\u001a\u0004\u0018\u00010\u0018*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001e\"C\u0010 \u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010\u0001j\u0004\u0018\u0001`#*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\u0010\"1\u0010&\u001a\u0004\u0018\u00010\u0005*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b'\u0010\b*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006)"}, m3636d2 = {"AnyHtmlCanvasScreen", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/HtmlCanvasScreen;", "Lmicrogram/ui/v1/HtmlCanvasScreenContentDto;", "canvasUrl", "", "Lcom/robinhood/microgram/sdui/AnyHtmlCanvasScreen;", "getCanvasUrl", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", "canvasUrl$delegate", "Lkotlin/properties/ReadOnlyProperty;", "androidAttributes", "Lcom/robinhood/microgram/sdui/AndroidAttributes;", "Lmicrogram/ui/v1/AndroidAttributesDto;", "Lcom/robinhood/microgram/sdui/AnyAndroidAttributes;", "getAndroidAttributes", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", "androidAttributes$delegate", "backgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackgroundColor", "backgroundColor$delegate", "hasFooter", "", "getHasFooter", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Z", "hasFooter$delegate", "hidesBackButton", "getHidesBackButton", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/Boolean;", "hidesBackButton$delegate", "navConfig", "Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "Lcom/robinhood/microgram/sdui/AnyNavigationBarConfiguration;", "getNavConfig", "navConfig$delegate", "title", "getTitle", "title$delegate", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.HtmlCanvasScreenKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class HtmlCanvasScreen2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HtmlCanvasScreen2.class, "canvasUrl", "getCanvasUrl(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(HtmlCanvasScreen2.class, "androidAttributes", "getAndroidAttributes(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(HtmlCanvasScreen2.class, "backgroundColor", "getBackgroundColor(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(HtmlCanvasScreen2.class, "hasFooter", "getHasFooter(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Z", 1)), Reflection.property1(new PropertyReference1Impl(HtmlCanvasScreen2.class, "hidesBackButton", "getHidesBackButton(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/Boolean;", 1)), Reflection.property1(new PropertyReference1Impl(HtmlCanvasScreen2.class, "navConfig", "getNavConfig(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(HtmlCanvasScreen2.class, "title", "getTitle(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1))};
    private static final Interfaces2 androidAttributes$delegate;
    private static final Interfaces2 backgroundColor$delegate;
    private static final Interfaces2 canvasUrl$delegate;
    private static final Interfaces2 hasFooter$delegate;
    private static final Interfaces2 hidesBackButton$delegate;
    private static final Interfaces2 navConfig$delegate;
    private static final Interfaces2 title$delegate;

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        canvasUrl$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.HtmlCanvasScreenKt$special$$inlined$identicalProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((HtmlCanvasScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getCanvas_url();
                }
                return ((HtmlCanvasScreen) ((UiObject.Legacy) thisRef).getValue()).getCanvasUrl();
            }
        };
        androidAttributes$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.HtmlCanvasScreenKt$special$$inlined$similarProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<AndroidAttributes, AndroidAttributesDto> getValue(UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AndroidAttributesDto android_attributes = ((HtmlCanvasScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getAndroid_attributes();
                    if (android_attributes != null) {
                        return new UiObject.Idl(android_attributes);
                    }
                    return null;
                }
                AndroidAttributes androidAttributes = ((HtmlCanvasScreen) ((UiObject.Legacy) thisRef).getValue()).getAndroidAttributes();
                if (androidAttributes != null) {
                    return new UiObject.Legacy(androidAttributes);
                }
                return null;
            }
        };
        backgroundColor$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.HtmlCanvasScreenKt$special$$inlined$similarProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<ThemedColor, ThemedColorDto> getValue(UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ThemedColorDto background_color = ((HtmlCanvasScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getBackground_color();
                    if (background_color != null) {
                        return new UiObject.Idl(background_color);
                    }
                    return null;
                }
                ThemedColor backgroundColor = ((HtmlCanvasScreen) ((UiObject.Legacy) thisRef).getValue()).getBackgroundColor();
                if (backgroundColor != null) {
                    return new UiObject.Legacy(backgroundColor);
                }
                return null;
            }
        };
        hasFooter$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.HtmlCanvasScreenKt$special$$inlined$identicalProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final Boolean getValue(UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Boolean.valueOf(!((HtmlCanvasScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getFooter().isEmpty());
                }
                return Boolean.valueOf(!((HtmlCanvasScreen) ((UiObject.Legacy) thisRef).getValue()).getFooter().isEmpty());
            }
        };
        hidesBackButton$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.HtmlCanvasScreenKt$special$$inlined$identicalProperty$3
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final Boolean getValue(UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return null;
                }
                return ((HtmlCanvasScreen) ((UiObject.Legacy) thisRef).getValue()).getHidesBackButton();
            }
        };
        navConfig$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.HtmlCanvasScreenKt$special$$inlined$similarProperty$3
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> getValue(UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NavigationBarConfigurationDto nav_config = ((HtmlCanvasScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getNav_config();
                    if (nav_config != null) {
                        return new UiObject.Idl(nav_config);
                    }
                    return null;
                }
                NavigationBarConfiguration navConfig = ((HtmlCanvasScreen) ((UiObject.Legacy) thisRef).getValue()).getNavConfig();
                if (navConfig != null) {
                    return new UiObject.Legacy(navConfig);
                }
                return null;
            }
        };
        title$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.HtmlCanvasScreenKt$special$$inlined$identicalProperty$4
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends HtmlCanvasScreen, ? extends HtmlCanvasScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((HtmlCanvasScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getTitle();
                }
                return ((HtmlCanvasScreen) ((UiObject.Legacy) thisRef).getValue()).getTitle();
            }
        };
    }

    public static final String getCanvasUrl(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) canvasUrl$delegate.getValue(uiObject, $$delegatedProperties[0]);
    }

    public static final UiObject<AndroidAttributes, AndroidAttributesDto> getAndroidAttributes(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) androidAttributes$delegate.getValue(uiObject, $$delegatedProperties[1]);
    }

    public static final UiObject<ThemedColor, ThemedColorDto> getBackgroundColor(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) backgroundColor$delegate.getValue(uiObject, $$delegatedProperties[2]);
    }

    public static final boolean getHasFooter(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return ((Boolean) hasFooter$delegate.getValue(uiObject, $$delegatedProperties[3])).booleanValue();
    }

    public static final Boolean getHidesBackButton(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (Boolean) hidesBackButton$delegate.getValue(uiObject, $$delegatedProperties[4]);
    }

    public static final UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> getNavConfig(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) navConfig$delegate.getValue(uiObject, $$delegatedProperties[5]);
    }

    public static final String getTitle(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) title$delegate.getValue(uiObject, $$delegatedProperties[6]);
    }
}
