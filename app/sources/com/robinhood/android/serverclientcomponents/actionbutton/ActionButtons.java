package com.robinhood.android.serverclientcomponents.actionbutton;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.serverdriven.p347db.ActionButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActionButtons.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"colorAttr", "", "Lcom/robinhood/models/serverdriven/db/ActionButton$Style;", "getColorAttr$annotations", "(Lcom/robinhood/models/serverdriven/db/ActionButton$Style;)V", "getColorAttr", "(Lcom/robinhood/models/serverdriven/db/ActionButton$Style;)I", "lib-server-client-components_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.actionbutton.ActionButtonsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ActionButtons {

    /* compiled from: ActionButtons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.serverclientcomponents.actionbutton.ActionButtonsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionButton.Style.values().length];
            try {
                iArr[ActionButton.Style.FILLED_GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionButton.Style.GHOST_GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionButton.Style.FILLED_GOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActionButton.Style.GHOST_GOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActionButton.Style.FILLED_RED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActionButton.Style.GHOST_RED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ActionButton.Style.FILLED_FOREGROUND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ActionButton.Style.GHOST_FOREGROUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getColorAttr$annotations(ActionButton.Style style) {
    }

    public static final int getColorAttr(ActionButton.Style style) {
        Intrinsics.checkNotNullParameter(style, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
            case 2:
                return C20690R.attr.colorPositive;
            case 3:
            case 4:
                return C20690R.attr.colorGold;
            case 5:
            case 6:
                return C20690R.attr.colorNegative;
            case 7:
            case 8:
                return C20690R.attr.colorForeground1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
