package com.robinhood.android.referral.rewardoffers.referralOffer.details.util;

import android.content.res.Resources;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GetMultiSelectContactSelectionText.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a+\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"getMultiSelectContactSelectionText", "Landroidx/compose/ui/text/AnnotatedString;", "", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactInfo;", "clearSelectionText", "", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "(Ljava/util/Set;Ljava/lang/String;Landroidx/compose/ui/text/LinkInteractionListener;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "MAX_SELECTED_CONTACT_NAMES_TO_DISPLAY", "", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.util.GetMultiSelectContactSelectionTextKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class GetMultiSelectContactSelectionText {
    private static final int MAX_SELECTED_CONTACT_NAMES_TO_DISPLAY = 15;

    public static final AnnotatedString getMultiSelectContactSelectionText(Set<ReferralOfferDetailsViewData.ContactInfo> set, String clearSelectionText, LinkInteractionListener linkInteractionListener, Composer composer, int i, int i2) throws Resources.NotFoundException {
        String strStringResource;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(clearSelectionText, "clearSelectionText");
        composer.startReplaceGroup(477282156);
        LinkInteractionListener linkInteractionListener2 = (i2 & 2) != 0 ? null : linkInteractionListener;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(477282156, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.util.getMultiSelectContactSelectionText (GetMultiSelectContactSelectionText.kt:21)");
        }
        if (set.isEmpty()) {
            AnnotatedString annotatedString = new AnnotatedString("", null, 2, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return annotatedString;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        for (Object obj : set) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ReferralOfferDetailsViewData.ContactInfo contactInfo = (ReferralOfferDetailsViewData.ContactInfo) obj;
            if (i3 < 15) {
                sb.append(contactInfo.getReferralContact().getShortName());
                if (i3 < Integer.min(set.size(), 15) - 1) {
                    sb.append(", ");
                }
            }
            i3 = i4;
        }
        if (set.size() > 15) {
            composer.startReplaceGroup(-1923248034);
            strStringResource = StringResources_androidKt.stringResource(C26659R.string.referral_offer_selection_hint_placeholder_truncated, new Object[]{sb.toString(), Integer.valueOf(set.size() - 15)}, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1923029918);
            strStringResource = StringResources_androidKt.stringResource(C26659R.string.referral_offer_selection_hint_placeholder, new Object[]{sb.toString()}, composer, 0);
            composer.endReplaceGroup();
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(strStringResource);
        builder.append(PlaceholderUtils.XXShortPlaceholderText);
        int iPushLink = builder.pushLink(new LinkAnnotation.Clickable("selectionText", new TextLinkStyles(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null), null, null, null, 14, null), linkInteractionListener2));
        try {
            builder.append(clearSelectionText);
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushLink);
            AnnotatedString annotatedString2 = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return annotatedString2;
        } catch (Throwable th) {
            builder.pop(iPushLink);
            throw th;
        }
    }
}
