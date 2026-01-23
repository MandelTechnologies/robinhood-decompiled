package com.robinhood.android.eventcontracts.sharedeventui;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: PlaceholderUtils.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"XLongPlaceholderText", "", "getXLongPlaceholderText", "()Ljava/lang/String;", "LongPlaceholderText", "getLongPlaceholderText", "MediumPlaceholderText", "getMediumPlaceholderText", "ShortPlaceholderText", "getShortPlaceholderText", "XShortPlaceholderText", "getXShortPlaceholderText", "XXShortPlaceholderText", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PlaceholderUtils {
    public static final String XXShortPlaceholderText = " ";
    private static final String XLongPlaceholderText = StringsKt.repeat(XXShortPlaceholderText, 100);
    private static final String LongPlaceholderText = StringsKt.repeat(XXShortPlaceholderText, 50);
    private static final String MediumPlaceholderText = StringsKt.repeat(XXShortPlaceholderText, 20);
    private static final String ShortPlaceholderText = StringsKt.repeat(XXShortPlaceholderText, 10);
    private static final String XShortPlaceholderText = StringsKt.repeat(XXShortPlaceholderText, 5);

    public static final String getXLongPlaceholderText() {
        return XLongPlaceholderText;
    }

    public static final String getLongPlaceholderText() {
        return LongPlaceholderText;
    }

    public static final String getMediumPlaceholderText() {
        return MediumPlaceholderText;
    }

    public static final String getShortPlaceholderText() {
        return ShortPlaceholderText;
    }

    public static final String getXShortPlaceholderText() {
        return XShortPlaceholderText;
    }
}
