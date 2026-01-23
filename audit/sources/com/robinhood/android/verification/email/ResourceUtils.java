package com.robinhood.android.verification.email;

import android.content.res.Resources;
import android.text.Spannable;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.lib.verification.C20682R;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getEmailVerificationDisclosure", "Landroid/text/Spannable;", "Landroid/content/res/Resources;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "feature-lib-verification_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.ResourceUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ResourceUtils {

    /* compiled from: ResourceUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.ResourceUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Spannable getEmailVerificationDisclosure(Resources resources, AppType appType) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(appType, "appType");
        if (WhenMappings.$EnumSwitchMapping$0[appType.ordinal()] == 1) {
            i = C20682R.string.gated_crypto_email_verification_privacy_disclosure_message_rhc;
        } else {
            i = C20682R.string.email_verification_privacy_disclosure_message;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return HtmlCompat.fromHtml$default(string2, 0, 2, null);
    }
}
