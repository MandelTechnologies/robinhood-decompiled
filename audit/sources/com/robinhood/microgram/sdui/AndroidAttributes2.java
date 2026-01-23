package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.p508v1.AndroidAttributesDto;
import microgram.p507ui.p508v1.StatusBarStyleDto;

/* compiled from: AndroidAttributes.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\"'\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"'\u0010\u000b\u001a\u0004\u0018\u00010\f*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u000f"}, m3636d2 = {"AnyAndroidAttributes", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/AndroidAttributes;", "Lmicrogram/ui/v1/AndroidAttributesDto;", "toLegacy", "Lcom/robinhood/microgram/sdui/StatusBarStyle;", "Lmicrogram/ui/v1/StatusBarStyleDto;", "statusBarStyle", "Lcom/robinhood/microgram/sdui/AnyAndroidAttributes;", "getStatusBarStyle", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lcom/robinhood/microgram/sdui/StatusBarStyle;", "addNavigationBarsPadding", "", "getAddNavigationBarsPadding", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/Boolean;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.AndroidAttributesKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class AndroidAttributes2 {

    /* compiled from: AndroidAttributes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.AndroidAttributesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusBarStyleDto.values().length];
            try {
                iArr[StatusBarStyleDto.STATUS_BAR_STYLE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusBarStyleDto.STATUS_BAR_STYLE_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusBarStyleDto.STATUS_BAR_STYLE_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AndroidAttributes3 toLegacy(StatusBarStyleDto statusBarStyleDto) {
        Intrinsics.checkNotNullParameter(statusBarStyleDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[statusBarStyleDto.ordinal()];
        if (i == 1 || i == 2) {
            return AndroidAttributes3.LIGHT;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return AndroidAttributes3.DARK;
    }

    public static final AndroidAttributes3 getStatusBarStyle(UiObject<AndroidAttributes, AndroidAttributesDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return ((AndroidAttributes) ((UiObject.Legacy) uiObject).getValue()).getStatusBarStyle();
        }
        if (!(uiObject instanceof UiObject.Idl)) {
            throw new NoWhenBranchMatchedException();
        }
        StatusBarStyleDto status_bar_style = ((AndroidAttributesDto) ((UiObject.Idl) uiObject).getValue()).getStatus_bar_style();
        if (status_bar_style != null) {
            return toLegacy(status_bar_style);
        }
        return null;
    }

    public static final Boolean getAddNavigationBarsPadding(UiObject<AndroidAttributes, AndroidAttributesDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return ((AndroidAttributes) ((UiObject.Legacy) uiObject).getValue()).getAddNavigationBarsPadding();
        }
        if (uiObject instanceof UiObject.Idl) {
            return ((AndroidAttributesDto) ((UiObject.Idl) uiObject).getValue()).getAdd_navigation_bars_padding();
        }
        throw new NoWhenBranchMatchedException();
    }
}
