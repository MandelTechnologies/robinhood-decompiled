package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.rosetta.eventlogging.ScreenDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import microgram.p507ui.p508v1.BottomSheetBackgroundDto;
import microgram.p507ui.p508v1.BottomSheetContentDto;
import microgram.p507ui.p508v1.LoggingContextDto;

/* compiled from: BottomSheetMessage.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\"/\u0010\u0007\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\"=\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0001*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"/\u0010\u0014\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0015\u0010\u000b\"1\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001a\"1\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001e\u0010\u001f\"1\u0010!\u001a\u0004\u0018\u00010\"*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b#\u0010$*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\"\u0010\u0004\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001¨\u0006&"}, m3636d2 = {"AnyBottomSheetMessage", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/BottomSheetMessage;", "Lmicrogram/ui/v1/BottomSheetOutboundMessageDto;", "AnyBottomSheetPayload", "Lcom/robinhood/microgram/sdui/BottomSheetPayload;", "Lmicrogram/ui/v1/BottomSheetContentDto;", "androidCanDismissWithBackPress", "", "Lcom/robinhood/microgram/sdui/AnyBottomSheetPayload;", "getAndroidCanDismissWithBackPress", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Z", "androidCanDismissWithBackPress$delegate", "Lkotlin/properties/ReadOnlyProperty;", "background", "Lcom/robinhood/microgram/sdui/Background;", "Lmicrogram/ui/v1/BottomSheetBackgroundDto;", "getBackground", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", "background$delegate", "canPassivelyDismiss", "getCanPassivelyDismiss", "canPassivelyDismiss$delegate", "cornerRadius", "", "getCornerRadius", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/Integer;", "cornerRadius$delegate", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getLoggingScreen", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "loggingScreen$delegate", "loggingEventContext", "Lmicrogram/ui/v1/LoggingContextDto;", "getLoggingEventContext", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lmicrogram/ui/v1/LoggingContextDto;", "loggingEventContext$delegate", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.BottomSheetMessageKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class BottomSheetMessage2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BottomSheetMessage2.class, "androidCanDismissWithBackPress", "getAndroidCanDismissWithBackPress(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Z", 1)), Reflection.property1(new PropertyReference1Impl(BottomSheetMessage2.class, "background", "getBackground(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(BottomSheetMessage2.class, "canPassivelyDismiss", "getCanPassivelyDismiss(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Z", 1)), Reflection.property1(new PropertyReference1Impl(BottomSheetMessage2.class, "cornerRadius", "getCornerRadius(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/Integer;", 1)), Reflection.property1(new PropertyReference1Impl(BottomSheetMessage2.class, "loggingScreen", "getLoggingScreen(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/rosetta/eventlogging/ScreenDto;", 1)), Reflection.property1(new PropertyReference1Impl(BottomSheetMessage2.class, "loggingEventContext", "getLoggingEventContext(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lmicrogram/ui/v1/LoggingContextDto;", 1))};
    private static final Interfaces2 androidCanDismissWithBackPress$delegate;
    private static final Interfaces2 background$delegate;
    private static final Interfaces2 canPassivelyDismiss$delegate;
    private static final Interfaces2 cornerRadius$delegate;
    private static final Interfaces2 loggingEventContext$delegate;
    private static final Interfaces2 loggingScreen$delegate;

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        androidCanDismissWithBackPress$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.BottomSheetMessageKt$special$$inlined$identicalProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final Boolean getValue(UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Boolean.valueOf(!Intrinsics.areEqual(((BottomSheetContentDto) ((UiObject.Idl) thisRef).getValue()).getAndroid_can_dismiss_with_back_press(), Boolean.FALSE));
                }
                return Boolean.valueOf(((BottomSheetMessage3) ((UiObject.Legacy) thisRef).getValue()).getAndroidCanDismissWithBackPress());
            }
        };
        background$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.BottomSheetMessageKt$special$$inlined$similarProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<Background, BottomSheetBackgroundDto> getValue(UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BottomSheetBackgroundDto background = ((BottomSheetContentDto) ((UiObject.Idl) thisRef).getValue()).getBackground();
                    if (background != null) {
                        return new UiObject.Idl(background);
                    }
                    return null;
                }
                Background background2 = ((BottomSheetMessage3) ((UiObject.Legacy) thisRef).getValue()).getBackground();
                if (background2 != null) {
                    return new UiObject.Legacy(background2);
                }
                return null;
            }
        };
        canPassivelyDismiss$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.BottomSheetMessageKt$special$$inlined$identicalProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final Boolean getValue(UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Boolean.valueOf(!Intrinsics.areEqual(((BottomSheetContentDto) ((UiObject.Idl) thisRef).getValue()).getCannot_passively_dismiss(), Boolean.TRUE));
                }
                return Boolean.valueOf(((BottomSheetMessage3) ((UiObject.Legacy) thisRef).getValue()).getCanPassivelyDismiss());
            }
        };
        cornerRadius$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.BottomSheetMessageKt$special$$inlined$identicalProperty$3
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final Integer getValue(UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((BottomSheetContentDto) ((UiObject.Idl) thisRef).getValue()).getCorner_radius();
                }
                return ((BottomSheetMessage3) ((UiObject.Legacy) thisRef).getValue()).getCornerRadius();
            }
        };
        loggingScreen$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.BottomSheetMessageKt$special$$inlined$identicalProperty$4
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final ScreenDto getValue(UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (thisRef instanceof UiObject.Legacy) {
                    return null;
                }
                if (!(thisRef instanceof UiObject.Idl)) {
                    throw new NoWhenBranchMatchedException();
                }
                return ((BottomSheetContentDto) ((UiObject.Idl) thisRef).getValue()).getScreen();
            }
        };
        loggingEventContext$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.BottomSheetMessageKt$special$$inlined$identicalProperty$5
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto>) obj, (KProperty<?>) kProperty);
            }

            public final LoggingContextDto getValue(UiObject<? extends BottomSheetMessage3, ? extends BottomSheetContentDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (thisRef instanceof UiObject.Legacy) {
                    return null;
                }
                if (!(thisRef instanceof UiObject.Idl)) {
                    throw new NoWhenBranchMatchedException();
                }
                return ((BottomSheetContentDto) ((UiObject.Idl) thisRef).getValue()).getLogging_context();
            }
        };
    }

    public static final boolean getAndroidCanDismissWithBackPress(UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return ((Boolean) androidCanDismissWithBackPress$delegate.getValue(uiObject, $$delegatedProperties[0])).booleanValue();
    }

    public static final UiObject<Background, BottomSheetBackgroundDto> getBackground(UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) background$delegate.getValue(uiObject, $$delegatedProperties[1]);
    }

    public static final boolean getCanPassivelyDismiss(UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return ((Boolean) canPassivelyDismiss$delegate.getValue(uiObject, $$delegatedProperties[2])).booleanValue();
    }

    public static final Integer getCornerRadius(UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (Integer) cornerRadius$delegate.getValue(uiObject, $$delegatedProperties[3]);
    }

    public static final ScreenDto getLoggingScreen(UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (ScreenDto) loggingScreen$delegate.getValue(uiObject, $$delegatedProperties[4]);
    }

    public static final LoggingContextDto getLoggingEventContext(UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (LoggingContextDto) loggingEventContext$delegate.getValue(uiObject, $$delegatedProperties[5]);
    }
}
