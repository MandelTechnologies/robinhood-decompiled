package com.robinhood.utils.extensions;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyEvents.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002¨\u0006\b"}, m3636d2 = {"isDigit", "", "Landroid/view/KeyEvent;", "isDot", "isDotOrPeriod", "isDelete", "isDelimiter", "isMinus", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.KeyEventsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class KeyEvents2 {
    public static final boolean isDigit(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "<this>");
        switch (keyEvent.getKeyCode()) {
            case 144:
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
            case 147:
            case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
            case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
            case 150:
            case 151:
            case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
            case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                return true;
            default:
                return false;
        }
    }

    public static final boolean isDot(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "<this>");
        return keyEvent.getKeyCode() == 158;
    }

    public static final boolean isDotOrPeriod(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "<this>");
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 56 || keyCode == 158;
    }

    public static final boolean isDelete(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "<this>");
        return keyEvent.getKeyCode() == 67;
    }

    public static final boolean isDelimiter(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "<this>");
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 55 || keyCode == 56 || keyCode == 62 || keyCode == 158;
    }

    public static final boolean isMinus(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "<this>");
        return keyEvent.getKeyCode() == 69;
    }
}
