package com.robinhood.android.shared.serverui.utils;

import android.os.Parcelable;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ButtonIcon;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: AnyButton.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"_\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\n\u0012\u0004\u0012\u0002H\u0001\u0018\u0001`\u0007\"\b\b\u0000\u0010\u0001*\u00020\b*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\"7\u0010\u000e\u001a\u00020\u000f*\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0006\u0012\u0002\b\u0003`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"K\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002j\u0004\u0018\u0001`\u0016*\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0006\u0012\u0002\b\u0003`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0017\u0010\u000b\"9\u0010\u0019\u001a\u0004\u0018\u00010\u000f*\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0006\u0012\u0002\b\u0003`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001a\u0010\u0011\"K\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0002j\u0004\u0018\u0001`\u001f*\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0006\u0012\u0002\b\u0003`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b \u0010\u000b*4\u0010\u0000\u001a\u0004\b\u0000\u0010\u0001\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\"\u0010\"\"\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00022\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0002¨\u0006#"}, m3636d2 = {"AnyButton", "ActionT", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lrh_server_driven_ui/v1/ButtonDto;", "action", "Lrh_server_driven_ui/v1/ActionDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyAction;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/shared/serverui/utils/AnyButton;", "getAction", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", "action$delegate", "Lkotlin/properties/ReadOnlyProperty;", AnnotatedPrivateKey.LABEL, "", "getLabel", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", "label$delegate", "icon", "Lcom/robinhood/models/serverdriven/experimental/api/ButtonIcon;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyButtonIcon;", "getIcon", "icon$delegate", "loggingIdentifier", "getLoggingIdentifier", "loggingIdentifier$delegate", "tintColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyThemedColor;", "getTintColor", "tintColor$delegate", "AnyButtonIcon", "lib-sdui-utils_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.shared.serverui.utils.AnyButtonKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AnyButton {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AnyButton.class, "action", "getAction(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(AnyButton.class, AnnotatedPrivateKey.LABEL, "getLabel(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(AnyButton.class, "icon", "getIcon(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1)), Reflection.property1(new PropertyReference1Impl(AnyButton.class, "loggingIdentifier", "getLoggingIdentifier(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1)), Reflection.property1(new PropertyReference1Impl(AnyButton.class, "tintColor", "getTintColor(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/android/shared/serverui/utils/UiObject;", 1))};
    private static final Interfaces2 action$delegate;
    private static final Interfaces2 icon$delegate;
    private static final Interfaces2 label$delegate;
    private static final Interfaces2 loggingIdentifier$delegate;
    private static final Interfaces2 tintColor$delegate;

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        action$delegate = new Interfaces2() { // from class: com.robinhood.android.shared.serverui.utils.AnyButtonKt$special$$inlined$similarProperty$1
            @Override // kotlin.properties.Interfaces2
            public final UiObject getValue(UiObject thisRef, KProperty kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActionDto action = ((ButtonDto) ((UiObject.Idl) thisRef).getValue()).getAction();
                    if (action != null) {
                        return new UiObject.Idl(action);
                    }
                    return null;
                }
                Parcelable action2 = ((Button) ((UiObject.Legacy) thisRef).getValue()).getAction();
                if (action2 != null) {
                    return new UiObject.Legacy(action2);
                }
                return null;
            }
        };
        label$delegate = new Interfaces2() { // from class: com.robinhood.android.shared.serverui.utils.AnyButtonKt$special$$inlined$identicalProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends Button<?>, ? extends ButtonDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends Button<?>, ? extends ButtonDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((ButtonDto) ((UiObject.Idl) thisRef).getValue()).getLabel();
                }
                return ((Button) ((UiObject.Legacy) thisRef).getValue()).getLabel();
            }
        };
        icon$delegate = new Interfaces2() { // from class: com.robinhood.android.shared.serverui.utils.AnyButtonKt$special$$inlined$similarProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends Button<?>, ? extends ButtonDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<ButtonIcon, ButtonDto.ButtonIconDto> getValue(UiObject<? extends Button<?>, ? extends ButtonDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ButtonDto.ButtonIconDto icon = ((ButtonDto) ((UiObject.Idl) thisRef).getValue()).getIcon();
                    if (icon != null) {
                        return new UiObject.Idl(icon);
                    }
                    return null;
                }
                ButtonIcon icon2 = ((Button) ((UiObject.Legacy) thisRef).getValue()).getIcon();
                if (icon2 != null) {
                    return new UiObject.Legacy(icon2);
                }
                return null;
            }
        };
        loggingIdentifier$delegate = new Interfaces2() { // from class: com.robinhood.android.shared.serverui.utils.AnyButtonKt$special$$inlined$identicalProperty$2
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends Button<?>, ? extends ButtonDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends Button<?>, ? extends ButtonDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((ButtonDto) ((UiObject.Idl) thisRef).getValue()).getLogging_identifier();
                }
                return ((Button) ((UiObject.Legacy) thisRef).getValue()).getLogging_identifier();
            }
        };
        tintColor$delegate = new Interfaces2() { // from class: com.robinhood.android.shared.serverui.utils.AnyButtonKt$special$$inlined$similarProperty$3
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends Button<?>, ? extends ButtonDto>) obj, (KProperty<?>) kProperty);
            }

            public final UiObject<ThemedColor, ThemedColorDto> getValue(UiObject<? extends Button<?>, ? extends ButtonDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ThemedColorDto tint_color = ((ButtonDto) ((UiObject.Idl) thisRef).getValue()).getTint_color();
                    if (tint_color != null) {
                        return new UiObject.Idl(tint_color);
                    }
                    return null;
                }
                ThemedColor tint_color2 = ((Button) ((UiObject.Legacy) thisRef).getValue()).getTint_color();
                if (tint_color2 != null) {
                    return new UiObject.Legacy(tint_color2);
                }
                return null;
            }
        };
    }

    public static final <ActionT extends Parcelable> UiObject<ActionT, ActionDto> getAction(UiObject<? extends Button<? extends ActionT>, ButtonDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) action$delegate.getValue(uiObject, $$delegatedProperties[0]);
    }

    public static final String getLabel(UiObject<? extends Button<?>, ButtonDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) label$delegate.getValue(uiObject, $$delegatedProperties[1]);
    }

    public static final UiObject<ButtonIcon, ButtonDto.ButtonIconDto> getIcon(UiObject<? extends Button<?>, ButtonDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) icon$delegate.getValue(uiObject, $$delegatedProperties[2]);
    }

    public static final String getLoggingIdentifier(UiObject<? extends Button<?>, ButtonDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) loggingIdentifier$delegate.getValue(uiObject, $$delegatedProperties[3]);
    }

    public static final UiObject<ThemedColor, ThemedColorDto> getTintColor(UiObject<? extends Button<?>, ButtonDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (UiObject) tintColor$delegate.getValue(uiObject, $$delegatedProperties[4]);
    }
}
