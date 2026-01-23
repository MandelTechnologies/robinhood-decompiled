package com.robinhood.android.serverclientcomponents.actionbutton;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.serverdriven.GenericButtonType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericButtonTypes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"styleAttr", "", "Lcom/robinhood/models/serverdriven/GenericButtonType;", "getStyleAttr", "(Lcom/robinhood/models/serverdriven/GenericButtonType;)I", "lib-server-client-components_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.actionbutton.GenericButtonTypesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class GenericButtonTypes {

    /* compiled from: GenericButtonTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.serverclientcomponents.actionbutton.GenericButtonTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericButtonType.values().length];
            try {
                iArr[GenericButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GenericButtonType.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GenericButtonType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStyleAttr(GenericButtonType genericButtonType) {
        Intrinsics.checkNotNullParameter(genericButtonType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[genericButtonType.ordinal()];
        if (i == 1) {
            return C20690R.attr.primaryButtonStyle;
        }
        if (i == 2) {
            return C20690R.attr.secondaryButtonStyle;
        }
        if (i == 3) {
            return C20690R.attr.legacyGhostButtonStyle;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return C20690R.attr.primaryButtonStyle;
    }
}
