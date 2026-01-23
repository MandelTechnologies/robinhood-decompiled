package com.robinhood.microgram.sdui;

import android.os.Parcelable;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.idl.Dto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import microgram.p507ui.p508v1.AndroidAttributesDto;
import microgram.p507ui.p508v1.BottomSheetContentDto;
import microgram.p507ui.p508v1.HtmlCanvasScreenContentDto;
import microgram.p507ui.p508v1.LoggingContextDto;
import microgram.p507ui.p508v1.NavigationBarConfigurationDto;
import microgram.p507ui.p508v1.StandardScreenContentDto;
import microgram.p507ui.p508v1.ThemeDto;

/* compiled from: AnyScreen.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\"?\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"?\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0001j\u0004\u0018\u0001`\u000e*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\b\"#\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001j\u0002`\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"#\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001j\u0002`\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"#\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001j\u0002`\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c*\u001a\u0010\u0000\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001¨\u0006\u001d"}, m3636d2 = {"AnyScreen", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "androidAttributes", "Lcom/robinhood/microgram/sdui/AndroidAttributes;", "Lmicrogram/ui/v1/AndroidAttributesDto;", "Lcom/robinhood/microgram/sdui/AnyAndroidAttributes;", "Lcom/robinhood/microgram/sdui/AnyScreen;", "getAndroidAttributes", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", "androidAttributes$delegate", "Lkotlin/properties/ReadOnlyProperty;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/microgram/sdui/LoggingContext;", "Lmicrogram/ui/v1/LoggingContextDto;", "Lcom/robinhood/microgram/sdui/AnyLoggingContext;", "getLoggingContext", "loggingContext$delegate", "theme", "Lcom/robinhood/microgram/sdui/Theme;", "getTheme", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/microgram/sdui/Theme;", "title", "", "getTitle", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", "hidesBackButton", "", "getHidesBackButton", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/Boolean;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.AnyScreenKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class AnyScreen {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AnyScreen.class, "androidAttributes", "getAndroidAttributes(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(AnyScreen.class, RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "getLoggingContext(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1))};
    private static final Interfaces2 androidAttributes$delegate;
    private static final Interfaces2 loggingContext$delegate;

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        androidAttributes$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.AnyScreenKt$special$$inlined$similarProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends Parcelable, ? extends Object>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<AndroidAttributes, AndroidAttributesDto> getValue(UiObject<? extends Parcelable, ? extends Object> thisRef, KProperty<?> kProperty) {
                AndroidAttributesDto android_attributes;
                AndroidAttributes androidAttributes;
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Dto value = ((UiObject.Idl) thisRef).getValue();
                    if (value instanceof StandardScreenContentDto) {
                        android_attributes = ((StandardScreenContentDto) value).getAndroid_attributes();
                    } else {
                        if (!(value instanceof HtmlCanvasScreenContentDto)) {
                            throw new IllegalStateException(("Unknown screen type: " + value).toString());
                        }
                        android_attributes = ((HtmlCanvasScreenContentDto) value).getAndroid_attributes();
                    }
                    if (android_attributes != null) {
                        return new UiObject.Idl(android_attributes);
                    }
                    return null;
                }
                Parcelable value2 = ((UiObject.Legacy) thisRef).getValue();
                if (value2 instanceof StandardScreen) {
                    androidAttributes = ((StandardScreen) value2).getAndroidAttributes();
                } else {
                    if (!(value2 instanceof HtmlCanvasScreen)) {
                        throw new IllegalStateException(("Unknown screen type: " + value2).toString());
                    }
                    androidAttributes = ((HtmlCanvasScreen) value2).getAndroidAttributes();
                }
                if (androidAttributes != null) {
                    return new UiObject.Legacy(androidAttributes);
                }
                return null;
            }
        };
        loggingContext$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.AnyScreenKt$special$$inlined$similarProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends Parcelable, ? extends Object>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<LoggingContext, LoggingContextDto> getValue(UiObject<? extends Parcelable, ? extends Object> thisRef, KProperty<?> kProperty) {
                LoggingContextDto logging_context;
                LoggingContext loggingContext;
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Dto value = ((UiObject.Idl) thisRef).getValue();
                    if (value instanceof StandardScreenContentDto) {
                        logging_context = ((StandardScreenContentDto) value).getLogging_context();
                    } else {
                        if (!(value instanceof HtmlCanvasScreenContentDto)) {
                            throw new IllegalStateException(("Unknown screen type: " + value).toString());
                        }
                        logging_context = ((HtmlCanvasScreenContentDto) value).getLogging_context();
                    }
                    if (logging_context != null) {
                        return new UiObject.Idl(logging_context);
                    }
                    return null;
                }
                Parcelable value2 = ((UiObject.Legacy) thisRef).getValue();
                if (value2 instanceof StandardScreen) {
                    loggingContext = ((StandardScreen) value2).getLoggingContext();
                } else {
                    if (!(value2 instanceof HtmlCanvasScreen)) {
                        throw new IllegalStateException(("Unknown screen type: " + value2).toString());
                    }
                    loggingContext = ((HtmlCanvasScreen) value2).getLoggingContext();
                }
                if (loggingContext != null) {
                    return new UiObject.Legacy(loggingContext);
                }
                return null;
            }
        };
    }

    public static final UiObject<AndroidAttributes, AndroidAttributesDto> getAndroidAttributes(UiObject<?, ?> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) androidAttributes$delegate.getValue(uiObject, $$delegatedProperties[0]);
    }

    public static final UiObject<LoggingContext, LoggingContextDto> getLoggingContext(UiObject<?, ?> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) loggingContext$delegate.getValue(uiObject, $$delegatedProperties[1]);
    }

    public static final StandardScreen5 getTheme(UiObject<?, ?> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        Object value = uiObject.getValue();
        if (value instanceof StandardScreen) {
            return ((StandardScreen) value).getTheme();
        }
        if (value instanceof StandardScreenContentDto) {
            ThemeDto theme = ((StandardScreenContentDto) value).getTheme();
            if (theme != null) {
                return StandardScreen4.toLegacy(theme);
            }
            return null;
        }
        if (value instanceof HtmlCanvasScreen) {
            return ((HtmlCanvasScreen) value).getTheme();
        }
        if (value instanceof HtmlCanvasScreenContentDto) {
            ThemeDto theme2 = ((HtmlCanvasScreenContentDto) value).getTheme();
            if (theme2 != null) {
                return StandardScreen4.toLegacy(theme2);
            }
            return null;
        }
        if (value instanceof BottomSheetContentDto) {
            ThemeDto theme3 = ((BottomSheetContentDto) value).getTheme();
            if (theme3 != null) {
                return StandardScreen4.toLegacy(theme3);
            }
            return null;
        }
        if (value instanceof BottomSheetMessage3) {
            return ((BottomSheetMessage3) value).getTheme();
        }
        throw new IllegalStateException(("Unknown screen type: " + uiObject).toString());
    }

    public static final String getTitle(UiObject<?, ?> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        Object value = uiObject.getValue();
        if (value instanceof StandardScreen) {
            return ((StandardScreen) value).getTitle();
        }
        if (value instanceof StandardScreenContentDto) {
            return ((StandardScreenContentDto) value).getTitle();
        }
        if (value instanceof HtmlCanvasScreen) {
            return ((HtmlCanvasScreen) value).getTitle();
        }
        if (value instanceof HtmlCanvasScreenContentDto) {
            return ((HtmlCanvasScreenContentDto) value).getTitle();
        }
        throw new IllegalStateException(("Unknown screen type: " + uiObject).toString());
    }

    public static final Boolean getHidesBackButton(UiObject<?, ?> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        Object value = uiObject.getValue();
        if (value instanceof StandardScreen) {
            return ((StandardScreen) value).getHidesBackButton();
        }
        if (value instanceof StandardScreenContentDto) {
            NavigationBarConfigurationDto nav_config = ((StandardScreenContentDto) value).getNav_config();
            if (nav_config != null) {
                return Boolean.valueOf(nav_config.getHides_back_button());
            }
            return null;
        }
        if (value instanceof HtmlCanvasScreen) {
            return ((HtmlCanvasScreen) value).getHidesBackButton();
        }
        if (value instanceof HtmlCanvasScreenContentDto) {
            return null;
        }
        throw new IllegalStateException(("Unknown screen type: " + uiObject).toString());
    }
}
