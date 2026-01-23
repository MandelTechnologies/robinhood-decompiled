package com.robinhood.microgram.sdui;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.NavigationBarConfiguration;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import microgram.p507ui.p508v1.AndroidAttributesDto;
import microgram.p507ui.p508v1.LoggingContextDto;
import microgram.p507ui.p508v1.NavigationBarConfigurationDto;
import microgram.p507ui.p508v1.ProgressBarDto;
import microgram.p507ui.p508v1.StandardScreenContentDto;
import microgram.p507ui.p508v1.ThemeDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: StandardScreen.kt */
@Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u00103\u001a\u000200*\u000204\u001a<\u00106\u001a$\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020908\u0012\u0004\u0012\u00020:0\u0001j\b\u0012\u0004\u0012\u000209`;07*\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0001j\u0002`#\u001a<\u0010<\u001a$\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020908\u0012\u0004\u0012\u00020:0\u0001j\b\u0012\u0004\u0012\u000209`;07*\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0001j\u0002`#\u001a\f\u00103\u001a\u00020>*\u0004\u0018\u00010A\u001a\f\u00103\u001a\u00020I*\u0004\u0018\u00010L\u001a3\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002HP0O07\"\u000e\b\u0000\u0010P\u0018\u0001*\u0006\u0012\u0002\b\u00030Q*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030Q0RH\u0082\b\u001a?\u0010S\u001a\b\u0012\u0004\u0012\u0002HP07\"\u0004\b\u0000\u0010T\"\b\b\u0001\u0010P*\u00020U*\b\u0012\u0004\u0012\u0002HT0R2\u0014\u0010V\u001a\u0010\u0012\u0004\u0012\u0002HT\u0012\u0006\u0012\u0004\u0018\u0001HP0WH\u0082\b\u001a9\u0010X\u001a\b\u0012\u0004\u0012\u0002HP07\"\u0004\b\u0000\u0010T\"\u0004\b\u0001\u0010P*\b\u0012\u0004\u0012\u0002HT0R2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u0002HT\u0012\u0004\u0012\u0002HP0WH\u0082\b\"C\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\"=\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0001*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0010\u0010\n\"/\u0010\u0012\u001a\u00020\u0013*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015\"/\u0010\u0017\u001a\u00020\u0018*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a\"1\u0010\u001c\u001a\u0004\u0018\u00010\u0018*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001d\u0010\u001e\"C\u0010 \u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010\u0001j\u0004\u0018\u0001`#*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b$\u0010\n\"1\u0010&\u001a\u0004\u0018\u00010'*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b(\u0010)\"C\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0001j\u0004\u0018\u0001`,*\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0001j\u0002`#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b-\u0010\n\"'\u0010/\u001a\u0004\u0018\u000100*\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0001j\u0002`#8F¢\u0006\u0006\u001a\u0004\b1\u00102\"%\u0010=\u001a\u00020>*\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0001j\u0002`#8F¢\u0006\u0006\u001a\u0004\b?\u0010@\"C\u0010B\u001a\u0016\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0018\u00010\u0001j\u0004\u0018\u0001`E*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bF\u0010\n\"'\u0010H\u001a\u0004\u0018\u00010I*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010K*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\"\u00105\"\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0001*\"\u0010M\"\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0\u00012\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0\u0001¨\u0006Y"}, m3636d2 = {"AnyStandardScreen", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/StandardScreen;", "Lmicrogram/ui/v1/StandardScreenContentDto;", "androidAttributes", "Lcom/robinhood/microgram/sdui/AndroidAttributes;", "Lmicrogram/ui/v1/AndroidAttributesDto;", "Lcom/robinhood/microgram/sdui/AnyAndroidAttributes;", "Lcom/robinhood/microgram/sdui/AnyStandardScreen;", "getAndroidAttributes", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", "androidAttributes$delegate", "Lkotlin/properties/ReadOnlyProperty;", "backgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackgroundColor", "backgroundColor$delegate", "bodyLastIndex", "", "getBodyLastIndex", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)I", "bodyLastIndex$delegate", "hasFooter", "", "getHasFooter", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Z", "hasFooter$delegate", "hidesBackButton", "getHidesBackButton", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/Boolean;", "hidesBackButton$delegate", "navConfig", "Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "Lcom/robinhood/microgram/sdui/AnyNavigationBarConfiguration;", "getNavConfig", "navConfig$delegate", "title", "", "getTitle", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", "title$delegate", "tintColor", "Lcom/robinhood/android/shared/serverui/utils/AnyThemedColor;", "getTintColor", "tintColor$delegate", "progressBar", "Lcom/robinhood/microgram/sdui/ProgressBar;", "getProgressBar", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/microgram/sdui/ProgressBar;", "toLegacy", "Lmicrogram/ui/v1/ProgressBarDto;", "AnyNavigationBarConfiguration", "leftButtons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "Lrh_server_driven_ui/v1/ButtonDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyButton;", "rightButtons", ResourceTypes.STYLE, "Lcom/robinhood/microgram/sdui/NavigationBarConfiguration$Style;", "getStyle", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/microgram/sdui/NavigationBarConfiguration$Style;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/microgram/sdui/LoggingContext;", "Lmicrogram/ui/v1/LoggingContextDto;", "Lcom/robinhood/microgram/sdui/AnyLoggingContext;", "getLoggingContext", "loggingContext$delegate", "theme", "Lcom/robinhood/microgram/sdui/Theme;", "getTheme", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/microgram/sdui/Theme;", "Lmicrogram/ui/v1/ThemeDto;", "AnyLoggingContext", "filterComponents", "Lcom/robinhood/android/shared/serverui/utils/UiObject$Legacy;", "R", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "", "mapNotNullToImmutable", "T", "", "transform", "Lkotlin/Function1;", "mapToImmutable", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.StandardScreenKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class StandardScreen4 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, "androidAttributes", "getAndroidAttributes(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, "backgroundColor", "getBackgroundColor(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, "bodyLastIndex", "getBodyLastIndex(Lcom/robinhood/android/shared/serverui/utils/UiObject;)I", 1)), Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, "hasFooter", "getHasFooter(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Z", 1)), Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, "hidesBackButton", "getHidesBackButton(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/Boolean;", 1)), Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, "navConfig", "getNavConfig(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, "title", "getTitle(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, "tintColor", "getTintColor(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(StandardScreen4.class, RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "getLoggingContext(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1))};
    private static final Interfaces2 androidAttributes$delegate;
    private static final Interfaces2 backgroundColor$delegate;
    private static final Interfaces2 bodyLastIndex$delegate;
    private static final Interfaces2 hasFooter$delegate;
    private static final Interfaces2 hidesBackButton$delegate;
    private static final Interfaces2 loggingContext$delegate;
    private static final Interfaces2 navConfig$delegate;
    private static final Interfaces2 tintColor$delegate;
    private static final Interfaces2 title$delegate;

    /* compiled from: StandardScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.StandardScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NavigationBarConfigurationDto.StyleDto.values().length];
            try {
                iArr[NavigationBarConfigurationDto.StyleDto.STYLE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationBarConfigurationDto.StyleDto.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationBarConfigurationDto.StyleDto.TRANSPARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ThemeDto.CommonThemeDto.values().length];
            try {
                iArr2[ThemeDto.CommonThemeDto.THEME_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ThemeDto.CommonThemeDto.THEME_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ThemeDto.CommonThemeDto.THEME_ACHROMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ThemeDto.CommonThemeDto.THEME_CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ThemeDto.CommonThemeDto.THEME_LIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ThemeDto.CommonThemeDto.THEME_DARK.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ThemeDto.CommonThemeDto.THEME_DARK_ACHROMATIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ThemeDto.CommonThemeDto.THEME_LIGHT_ACHROMATIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        androidAttributes$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$similarProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends StandardScreen, ? extends StandardScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<AndroidAttributes, AndroidAttributesDto> getValue(UiObject<? extends StandardScreen, ? extends StandardScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AndroidAttributesDto android_attributes = ((StandardScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getAndroid_attributes();
                    if (android_attributes != null) {
                        return new UiObject.Idl(android_attributes);
                    }
                    return null;
                }
                AndroidAttributes androidAttributes = ((StandardScreen) ((UiObject.Legacy) thisRef).getValue()).getAndroidAttributes();
                if (androidAttributes != null) {
                    return new UiObject.Legacy(androidAttributes);
                }
                return null;
            }
        };
        backgroundColor$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$similarProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends StandardScreen, ? extends StandardScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<ThemedColor, ThemedColorDto> getValue(UiObject<? extends StandardScreen, ? extends StandardScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ThemedColorDto background_color = ((StandardScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getBackground_color();
                    if (background_color != null) {
                        return new UiObject.Idl(background_color);
                    }
                    return null;
                }
                ThemedColor backgroundColor = ((StandardScreen) ((UiObject.Legacy) thisRef).getValue()).getBackgroundColor();
                if (backgroundColor != null) {
                    return new UiObject.Legacy(backgroundColor);
                }
                return null;
            }
        };
        bodyLastIndex$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$identicalProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends StandardScreen, ? extends StandardScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final Integer getValue(UiObject<? extends StandardScreen, ? extends StandardScreenContentDto> thisRef, KProperty<?> kProperty) {
                List body;
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    body = ((StandardScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getBody();
                } else {
                    body = ((StandardScreen) ((UiObject.Legacy) thisRef).getValue()).getBody();
                }
                return Integer.valueOf(CollectionsKt.getLastIndex(body));
            }
        };
        hasFooter$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$identicalProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends StandardScreen, ? extends StandardScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final Boolean getValue(UiObject<? extends StandardScreen, ? extends StandardScreenContentDto> thisRef, KProperty<?> kProperty) {
                Collection footer;
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    footer = ((StandardScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getFooter();
                } else {
                    footer = ((StandardScreen) ((UiObject.Legacy) thisRef).getValue()).getFooter();
                }
                return Boolean.valueOf(!footer.isEmpty());
            }
        };
        hidesBackButton$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$identicalProperty$3
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends StandardScreen, ? extends StandardScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final Boolean getValue(UiObject<? extends StandardScreen, ? extends StandardScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NavigationBarConfigurationDto nav_config = ((StandardScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getNav_config();
                    if (nav_config != null) {
                        return Boolean.valueOf(nav_config.getHides_back_button());
                    }
                    return null;
                }
                return ((StandardScreen) ((UiObject.Legacy) thisRef).getValue()).getHidesBackButton();
            }
        };
        navConfig$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$similarProperty$3
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends StandardScreen, ? extends StandardScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> getValue(UiObject<? extends StandardScreen, ? extends StandardScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NavigationBarConfigurationDto nav_config = ((StandardScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getNav_config();
                    if (nav_config != null) {
                        return new UiObject.Idl(nav_config);
                    }
                    return null;
                }
                NavigationBarConfiguration navConfig = ((StandardScreen) ((UiObject.Legacy) thisRef).getValue()).getNavConfig();
                if (navConfig != null) {
                    return new UiObject.Legacy(navConfig);
                }
                return null;
            }
        };
        title$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$identicalProperty$4
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends StandardScreen, ? extends StandardScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends StandardScreen, ? extends StandardScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((StandardScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getTitle();
                }
                return ((StandardScreen) ((UiObject.Legacy) thisRef).getValue()).getTitle();
            }
        };
        tintColor$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$similarProperty$4
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends NavigationBarConfiguration, ? extends NavigationBarConfigurationDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<ThemedColor, ThemedColorDto> getValue(UiObject<? extends NavigationBarConfiguration, ? extends NavigationBarConfigurationDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ThemedColorDto tint_color = ((NavigationBarConfigurationDto) ((UiObject.Idl) thisRef).getValue()).getTint_color();
                    if (tint_color != null) {
                        return new UiObject.Idl(tint_color);
                    }
                    return null;
                }
                ThemedColor tintColor = ((NavigationBarConfiguration) ((UiObject.Legacy) thisRef).getValue()).getTintColor();
                if (tintColor != null) {
                    return new UiObject.Legacy(tintColor);
                }
                return null;
            }
        };
        loggingContext$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.StandardScreenKt$special$$inlined$similarProperty$5
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends StandardScreen, ? extends StandardScreenContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<LoggingContext, LoggingContextDto> getValue(UiObject<? extends StandardScreen, ? extends StandardScreenContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LoggingContextDto logging_context = ((StandardScreenContentDto) ((UiObject.Idl) thisRef).getValue()).getLogging_context();
                    if (logging_context != null) {
                        return new UiObject.Idl(logging_context);
                    }
                    return null;
                }
                LoggingContext loggingContext = ((StandardScreen) ((UiObject.Legacy) thisRef).getValue()).getLoggingContext();
                if (loggingContext != null) {
                    return new UiObject.Legacy(loggingContext);
                }
                return null;
            }
        };
    }

    public static final UiObject<AndroidAttributes, AndroidAttributesDto> getAndroidAttributes(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) androidAttributes$delegate.getValue(uiObject, $$delegatedProperties[0]);
    }

    public static final UiObject<ThemedColor, ThemedColorDto> getBackgroundColor(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) backgroundColor$delegate.getValue(uiObject, $$delegatedProperties[1]);
    }

    public static final int getBodyLastIndex(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return ((Number) bodyLastIndex$delegate.getValue(uiObject, $$delegatedProperties[2])).intValue();
    }

    public static final boolean getHasFooter(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return ((Boolean) hasFooter$delegate.getValue(uiObject, $$delegatedProperties[3])).booleanValue();
    }

    public static final Boolean getHidesBackButton(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (Boolean) hidesBackButton$delegate.getValue(uiObject, $$delegatedProperties[4]);
    }

    public static final UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> getNavConfig(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) navConfig$delegate.getValue(uiObject, $$delegatedProperties[5]);
    }

    public static final String getTitle(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) title$delegate.getValue(uiObject, $$delegatedProperties[6]);
    }

    public static final UiObject<ThemedColor, ThemedColorDto> getTintColor(UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) tintColor$delegate.getValue(uiObject, $$delegatedProperties[7]);
    }

    public static final ProgressBar getProgressBar(UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return ((NavigationBarConfiguration) ((UiObject.Legacy) uiObject).getValue()).getProgressBar();
        }
        if (!(uiObject instanceof UiObject.Idl)) {
            throw new NoWhenBranchMatchedException();
        }
        ProgressBarDto progress_bar = ((NavigationBarConfigurationDto) ((UiObject.Idl) uiObject).getValue()).getProgress_bar();
        if (progress_bar != null) {
            return toLegacy(progress_bar);
        }
        return null;
    }

    public static final ProgressBar toLegacy(ProgressBarDto progressBarDto) {
        Intrinsics.checkNotNullParameter(progressBarDto, "<this>");
        return new ProgressBar((float) progressBarDto.getProgress(), progressBarDto.getSegments_number());
    }

    public static final ImmutableList<UiObject<Button<MicrogramAction>, ButtonDto>> leftButtons(UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (!(uiObject instanceof UiObject.Legacy)) {
            if (!(uiObject instanceof UiObject.Idl)) {
                throw new NoWhenBranchMatchedException();
            }
            List<ButtonDto> left_buttons = ((NavigationBarConfigurationDto) ((UiObject.Idl) uiObject).getValue()).getLeft_buttons();
            ImmutableList3.Builder builder = extensions2.persistentListOf().builder();
            Iterator<T> it = left_buttons.iterator();
            while (it.hasNext()) {
                builder.add(new UiObject.Idl((ButtonDto) it.next()));
            }
            return builder.build();
        }
        List<UIComponent<MicrogramAction>> leftButtons = ((NavigationBarConfiguration) ((UiObject.Legacy) uiObject).getValue()).getLeftButtons();
        ImmutableList3.Builder builder2 = extensions2.persistentListOf().builder();
        Iterator<T> it2 = leftButtons.iterator();
        while (it2.hasNext()) {
            UIComponent uIComponent = (UIComponent) it2.next();
            if (!(uIComponent instanceof Button)) {
                uIComponent = null;
            }
            Button button = (Button) uIComponent;
            UiObject.Legacy legacy = button != null ? new UiObject.Legacy(button) : null;
            if (legacy != null) {
                builder2.add(legacy);
            }
        }
        return builder2.build();
    }

    public static final ImmutableList<UiObject<Button<MicrogramAction>, ButtonDto>> rightButtons(UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (!(uiObject instanceof UiObject.Legacy)) {
            if (!(uiObject instanceof UiObject.Idl)) {
                throw new NoWhenBranchMatchedException();
            }
            List<ButtonDto> right_buttons = ((NavigationBarConfigurationDto) ((UiObject.Idl) uiObject).getValue()).getRight_buttons();
            ImmutableList3.Builder builder = extensions2.persistentListOf().builder();
            Iterator<T> it = right_buttons.iterator();
            while (it.hasNext()) {
                builder.add(new UiObject.Idl((ButtonDto) it.next()));
            }
            return builder.build();
        }
        List<UIComponent<MicrogramAction>> rightButtons = ((NavigationBarConfiguration) ((UiObject.Legacy) uiObject).getValue()).getRightButtons();
        ImmutableList3.Builder builder2 = extensions2.persistentListOf().builder();
        Iterator<T> it2 = rightButtons.iterator();
        while (it2.hasNext()) {
            UIComponent uIComponent = (UIComponent) it2.next();
            if (!(uIComponent instanceof Button)) {
                uIComponent = null;
            }
            Button button = (Button) uIComponent;
            UiObject.Legacy legacy = button != null ? new UiObject.Legacy(button) : null;
            if (legacy != null) {
                builder2.add(legacy);
            }
        }
        return builder2.build();
    }

    public static final NavigationBarConfiguration.Style getStyle(UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return ((NavigationBarConfiguration) ((UiObject.Legacy) uiObject).getValue()).getStyle();
        }
        if (uiObject instanceof UiObject.Idl) {
            return toLegacy(((NavigationBarConfigurationDto) ((UiObject.Idl) uiObject).getValue()).getStyle());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final NavigationBarConfiguration.Style toLegacy(NavigationBarConfigurationDto.StyleDto styleDto) {
        int i = styleDto == null ? -1 : WhenMappings.$EnumSwitchMapping$0[styleDto.ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            return NavigationBarConfiguration.Style.STANDARD;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return NavigationBarConfiguration.Style.TRANSPARENT;
    }

    public static final UiObject<LoggingContext, LoggingContextDto> getLoggingContext(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) loggingContext$delegate.getValue(uiObject, $$delegatedProperties[8]);
    }

    public static final StandardScreen5 getTheme(UiObject<StandardScreen, StandardScreenContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return ((StandardScreen) ((UiObject.Legacy) uiObject).getValue()).getTheme();
        }
        if (uiObject instanceof UiObject.Idl) {
            return toLegacy(((StandardScreenContentDto) ((UiObject.Idl) uiObject).getValue()).getTheme());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StandardScreen5 toLegacy(ThemeDto themeDto) {
        ThemeDto.ConcreteDto concrete = themeDto != null ? themeDto.getConcrete() : null;
        if (!(concrete instanceof ThemeDto.ConcreteDto.Common)) {
            if (concrete != null) {
                throw new NoWhenBranchMatchedException();
            }
            return StandardScreen5.DEFAULT;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[((ThemeDto.ConcreteDto.Common) concrete).getValue().ordinal()]) {
            case 1:
            case 2:
                return StandardScreen5.DEFAULT;
            case 3:
                return StandardScreen5.ACHROMATIC;
            case 4:
                return StandardScreen5.CRYPTO;
            case 5:
                return StandardScreen5.LIGHT;
            case 6:
                return StandardScreen5.DARK;
            case 7:
                return StandardScreen5.DARK_ACHROMATIC;
            case 8:
                return StandardScreen5.LIGHT_ACHROMATIC;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final /* synthetic */ <R extends UIComponent<?>> ImmutableList<UiObject.Legacy<R>> filterComponents(Iterable<? extends UIComponent<?>> iterable) {
        ImmutableList3.Builder builder = extensions2.persistentListOf().builder();
        Iterator<? extends UIComponent<?>> it = iterable.iterator();
        while (it.hasNext()) {
            UIComponent<?> next = it.next();
            Intrinsics.reifiedOperationMarker(2, "R");
            UiObject.Legacy legacy = next != null ? new UiObject.Legacy(next) : null;
            if (legacy != null) {
                builder.add(legacy);
            }
        }
        return builder.build();
    }

    private static final <T, R> ImmutableList<R> mapNotNullToImmutable(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        ImmutableList3.Builder builder = extensions2.persistentListOf().builder();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = function1.invoke(it.next());
            if (rInvoke != null) {
                builder.add(rInvoke);
            }
        }
        return builder.build();
    }

    private static final <T, R> ImmutableList<R> mapToImmutable(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        ImmutableList3.Builder builder = extensions2.persistentListOf().builder();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            builder.add(function1.invoke(it.next()));
        }
        return builder.build();
    }
}
