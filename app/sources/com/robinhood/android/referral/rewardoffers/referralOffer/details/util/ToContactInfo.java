package com.robinhood.android.referral.rewardoffers.referralOffer.details.util;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: ToContactInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\b"}, m3636d2 = {"toContactInfo", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactInfo;", "Lcom/robinhood/models/contacts/ReferralContact;", "isRecommended", "", "inviteContactCtaText", "", "query", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.util.ToContactInfoKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ToContactInfo {
    public static /* synthetic */ ReferralOfferDetailsViewData.ContactInfo toContactInfo$default(ReferralContact referralContact, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return toContactInfo(referralContact, z, str, str2);
    }

    public static final ReferralOfferDetailsViewData.ContactInfo toContactInfo(ReferralContact referralContact, boolean z, String inviteContactCtaText, String str) {
        AnnotatedString annotatedString;
        String str2;
        AnnotatedString annotatedString2;
        Either eitherAsRight;
        Intrinsics.checkNotNullParameter(referralContact, "<this>");
        Intrinsics.checkNotNullParameter(inviteContactCtaText, "inviteContactCtaText");
        String strValidDisplayName = referralContact.validDisplayName();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (str == null || str.length() == 0) {
            annotatedString = new AnnotatedString(strValidDisplayName, null, 2, null);
        } else {
            annotatedString = toContactInfo$toAnnotatedString(strValidDisplayName, booleanRef, str);
        }
        Integer num = referralContact.numberOfContactsOnRobinhood;
        int iIntValue = num != null ? num.intValue() : 0;
        if (z && iIntValue > 0) {
            eitherAsRight = Either2.asLeft(StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C26659R.plurals.symmetric_referral_contacts_recommended_subtitle, iIntValue), Integer.valueOf(iIntValue)));
        } else {
            if (referralContact.usePhone()) {
                str2 = referralContact.phoneNumberForDisplay;
            } else {
                str2 = referralContact.email;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str == null || booleanRef.element) {
                annotatedString2 = new AnnotatedString(str2, null, 2, null);
            } else {
                annotatedString2 = toContactInfo$toAnnotatedString(str2, booleanRef, str);
            }
            eitherAsRight = Either2.asRight(annotatedString2);
        }
        return new ReferralOfferDetailsViewData.ContactInfo(referralContact, z, annotatedString, eitherAsRight, inviteContactCtaText);
    }

    private static final AnnotatedString toContactInfo$toAnnotatedString(String str, Ref.BooleanRef booleanRef, String str2) {
        List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{"\\s+"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, str3, 0, true, 2, (Object) null);
            if (iIndexOf$default != -1) {
                booleanRef.element = true;
                arrayList.add(new AnnotatedString.Range(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), iIndexOf$default, str3.length() + iIndexOf$default));
                break;
            }
        }
        return new AnnotatedString(str, arrayList, null, 4, null);
    }
}
