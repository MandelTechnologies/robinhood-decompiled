package com.robinhood.android.serverclientcomponents.extensions;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.Color;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Colors.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"colorAttr", "", "Lcom/robinhood/models/api/Color;", "getColorAttr", "(Lcom/robinhood/models/api/Color;)I", "lib-server-client-components_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.extensions.ColorsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Colors5 {

    /* compiled from: Colors.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.serverclientcomponents.extensions.ColorsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Color.values().length];
            try {
                iArr[Color.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Color.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Color.LIGHTEST_RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Color.LIGHTEST_GREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Color.FOREGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Color.FOREGROUND_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Color.FOREGROUND_TERTIARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Color.BACKGROUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Color.BACKGROUND_SECONDARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Color.BACKGROUND_TERTIARY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Color.LIGHT_GREEN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Color.LIGHT_RED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getColorAttr(Color color) {
        switch (color == null ? -1 : WhenMappings.$EnumSwitchMapping$0[color.ordinal()]) {
            case -1:
                return C20690R.attr.colorBackground1;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return C20690R.attr.colorNegative;
            case 2:
                return C20690R.attr.colorPositive;
            case 3:
                return C20690R.attr.colorNegativeGhost;
            case 4:
                return C20690R.attr.colorPositiveGhost;
            case 5:
                return C20690R.attr.colorForeground1;
            case 6:
                return C20690R.attr.colorForeground2;
            case 7:
                return C20690R.attr.colorForeground3;
            case 8:
                return C20690R.attr.colorBackground1;
            case 9:
                return C20690R.attr.colorBackground2;
            case 10:
                return C20690R.attr.colorBackground3;
            case 11:
                return C20690R.attr.colorPositive;
            case 12:
                return C20690R.attr.colorNegative;
        }
    }
}
