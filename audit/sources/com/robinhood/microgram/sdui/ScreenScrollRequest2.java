package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.ScreenScrollRequest;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import microgram.p507ui.p508v1.screen_events.ScrollRequestDto;

/* compiled from: ScreenScrollRequest.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"/\u0010\u0004\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"%\u0010\u0010\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0013"}, m3636d2 = {"AnyScrollRequest", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/ScreenScrollRequest;", "Lmicrogram/ui/v1/screen_events/ScrollRequestDto;", "identifier", "", "Lcom/robinhood/microgram/sdui/AnyScrollRequest;", "getIdentifier", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", "identifier$delegate", "Lkotlin/properties/ReadOnlyProperty;", "idlValue", "Lmicrogram/ui/v1/screen_events/ScrollRequestDto$AlignmentDto;", "Lcom/robinhood/microgram/sdui/ScreenScrollRequest$Alignment;", "getIdlValue", "(Lcom/robinhood/microgram/sdui/ScreenScrollRequest$Alignment;)Lmicrogram/ui/v1/screen_events/ScrollRequestDto$AlignmentDto;", "alignment", "getAlignment", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Lmicrogram/ui/v1/screen_events/ScrollRequestDto$AlignmentDto;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.ScreenScrollRequestKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class ScreenScrollRequest2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ScreenScrollRequest2.class, "identifier", "getIdentifier(Lcom/robinhood/android/shared/serverui/utils/UiObject;)Ljava/lang/String;", 1))};
    private static final Interfaces2 identifier$delegate;

    /* compiled from: ScreenScrollRequest.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.ScreenScrollRequestKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenScrollRequest.Alignment.values().length];
            try {
                iArr[ScreenScrollRequest.Alignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenScrollRequest.Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenScrollRequest.Alignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        UiObject.Companion companion = UiObject.INSTANCE;
        identifier$delegate = new Interfaces2() { // from class: com.robinhood.microgram.sdui.ScreenScrollRequestKt$special$$inlined$identicalProperty$1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((UiObject<? extends ScreenScrollRequest, ? extends ScrollRequestDto>) obj, (KProperty<?>) kProperty);
            }

            public final String getValue(UiObject<? extends ScreenScrollRequest, ? extends ScrollRequestDto> thisRef, KProperty<?> kProperty) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                if (!(thisRef instanceof UiObject.Legacy)) {
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return ((ScrollRequestDto) ((UiObject.Idl) thisRef).getValue()).getIdentifier();
                }
                return ((ScreenScrollRequest) ((UiObject.Legacy) thisRef).getValue()).getId();
            }
        };
    }

    public static final String getIdentifier(UiObject<ScreenScrollRequest, ScrollRequestDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        return (String) identifier$delegate.getValue(uiObject, $$delegatedProperties[0]);
    }

    public static final ScrollRequestDto.AlignmentDto getIdlValue(ScreenScrollRequest.Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i == 1) {
            return ScrollRequestDto.AlignmentDto.ALIGNMENT_TOP;
        }
        if (i == 2) {
            return ScrollRequestDto.AlignmentDto.ALIGNMENT_CENTER;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ScrollRequestDto.AlignmentDto.ALIGNMENT_BOTTOM;
    }

    public static final ScrollRequestDto.AlignmentDto getAlignment(UiObject<ScreenScrollRequest, ScrollRequestDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return getIdlValue(((ScreenScrollRequest) ((UiObject.Legacy) uiObject).getValue()).getAlignment());
        }
        if (uiObject instanceof UiObject.Idl) {
            return ((ScrollRequestDto) ((UiObject.Idl) uiObject).getValue()).getAlignment();
        }
        throw new NoWhenBranchMatchedException();
    }
}
