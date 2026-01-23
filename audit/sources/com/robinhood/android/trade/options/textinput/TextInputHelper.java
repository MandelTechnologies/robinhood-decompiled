package com.robinhood.android.trade.options.textinput;

import android.content.res.Resources;
import android.view.KeyEvent;
import com.robinhood.android.trade.options.C29757R;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TextInputHelper.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"getNumpadString", "", "Landroidx/compose/ui/input/key/KeyEvent;", "getNumpadString-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "validate", "inputType", "Lcom/robinhood/android/trade/options/textinput/InputType;", "format", "resources", "Landroid/content/res/Resources;", "MAX_INPUT_LENGTH", "", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.textinput.TextInputHelperKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TextInputHelper {
    public static final int MAX_INPUT_LENGTH = 10;

    /* compiled from: TextInputHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.textinput.TextInputHelperKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOrderInputComposable2.values().length];
            try {
                iArr[OptionOrderInputComposable2.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrderInputComposable2.QUANTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: getNumpadString-ZmokQxo, reason: not valid java name */
    public static final String m19485getNumpadStringZmokQxo(KeyEvent getNumpadString) {
        Intrinsics.checkNotNullParameter(getNumpadString, "$this$getNumpadString");
        int keyCode = getNumpadString.getKeyCode();
        if (keyCode == 56 || keyCode == 158) {
            return ".";
        }
        switch (keyCode) {
            case 7:
                return "0";
            case 8:
                return Constants.SdidMigrationStatusCodes.ALREADY_SDID;
            case 9:
                return Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED;
            case 10:
                return Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET;
            case 11:
                return Constants.SdidMigrationStatusCodes.MISSING_PARAMS;
            case 12:
                return Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION;
            case 13:
                return "6";
            case 14:
                return "7";
            case 15:
                return "8";
            case 16:
                return "9";
            default:
                switch (keyCode) {
                    case 144:
                        return "0";
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                        return Constants.SdidMigrationStatusCodes.ALREADY_SDID;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                        return Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED;
                    case 147:
                        return Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET;
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                        return Constants.SdidMigrationStatusCodes.MISSING_PARAMS;
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                        return Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION;
                    case 150:
                        return "6";
                    case 151:
                        return "7";
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                        return "8";
                    case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                        return "9";
                    default:
                        return "";
                }
        }
    }

    public static final String validate(String str, OptionOrderInputComposable2 inputType) throws IOException {
        String strTrimStart;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        int i = WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            return StringsKt.take(StringsKt.trimStart(sb.toString(), '0'), 10);
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = str.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char cCharAt2 = str.charAt(i3);
            if (Character.isDigit(cCharAt2) || cCharAt2 == '.') {
                sb2.append(cCharAt2);
            }
        }
        String string2 = sb2.toString();
        int i4 = 0;
        for (int i5 = 0; i5 < string2.length(); i5++) {
            if (string2.charAt(i5) == '.') {
                i4++;
            }
        }
        if (i4 > 1) {
            string2 = string2.substring(0, StringsKt.indexOf$default((CharSequence) string2, '.', StringsKt.indexOf$default((CharSequence) string2, '.', 0, false, 6, (Object) null) + 1, false, 4, (Object) null));
            Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
        }
        if (string2.length() != 0) {
            int i6 = 0;
            while (true) {
                if (i6 >= string2.length()) {
                    strTrimStart = "0";
                    break;
                }
                if (string2.charAt(i6) != '0') {
                    strTrimStart = StringsKt.trimStart(string2, '0');
                    break;
                }
                i6++;
            }
        } else {
            strTrimStart = "";
        }
        if (StringsKt.startsWith$default((CharSequence) strTrimStart, '.', false, 2, (Object) null)) {
            strTrimStart = "0" + strTrimStart;
        }
        String strSubstring = strTrimStart;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strSubstring, '.', 0, false, 6, (Object) null);
        if (iIndexOf$default != -1 && strSubstring.length() - iIndexOf$default > 3) {
            strSubstring = strSubstring.substring(0, iIndexOf$default + 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        return StringsKt.take(strSubstring, 10);
    }

    public static final String format(String str, Resources resources, OptionOrderInputComposable2 inputType) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        int i = WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return str;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (str.length() > 0) {
            String string2 = resources.getString(C29757R.string.dollar_sign_format, str);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        return "";
    }
}
