package com.robinhood.android.settings.p254ui;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SectionHeaderView.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"textAppearanceAttrResId", "", "Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;", "getTextAppearanceAttrResId", "(Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;)I", "feature-lib-settings_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.SectionHeaderViewKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SectionHeaderView2 {

    /* compiled from: SectionHeaderView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.ui.SectionHeaderViewKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextStyle.values().length];
            try {
                iArr[TextStyle.TEXT_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextStyle.TEXT_SMALL_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextStyle.TEXT_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextStyle.TEXT_MEDIUM_BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextStyle.TEXT_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextStyle.TEXT_LARGE_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextStyle.DISPLAY_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TextStyle.DISPLAY_MEDIUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TextStyle.DISPLAY_LARGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getTextAppearanceAttrResId(TextStyle textStyle) {
        switch (WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()]) {
            case 1:
                return C20690R.attr.textAppearanceRegularSmall;
            case 2:
                return C20690R.attr.textAppearanceRegularSmallBold;
            case 3:
                return C20690R.attr.textAppearanceRegularMedium;
            case 4:
                return C20690R.attr.textAppearanceRegularMediumBold;
            case 5:
                return C20690R.attr.textAppearanceRegularLarge;
            case 6:
                return C20690R.attr.textAppearanceRegularLargeBold;
            case 7:
                return C20690R.attr.textAppearanceDisplaySmall;
            case 8:
                return C20690R.attr.textAppearanceDisplayMedium;
            case 9:
                return C20690R.attr.textAppearanceDisplayLarge;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
