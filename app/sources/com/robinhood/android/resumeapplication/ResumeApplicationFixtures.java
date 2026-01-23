package com.robinhood.android.resumeapplication;

import com.robinhood.models.api.bonfire.ChurnedFundingV2Content;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse8;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.FundAccountAction;
import com.robinhood.models.serverdriven.experimental.api.FundAccountAndCryptoTransferAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.ImageSource;
import com.robinhood.models.serverdriven.experimental.api.ResumeApplicationChurnedAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.ThemedImageSource;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithIcon;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ResumeApplicationFixtures.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m3636d2 = {"createResumeApplicationChurnedV2Response", "Lcom/robinhood/models/api/bonfire/ResumeApplicationResponse;", "ctaAction", "Lcom/robinhood/models/serverdriven/experimental/api/ResumeApplicationChurnedAction;", "variant", "Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "showWelcomeBack", "", "createResumeApplicationChurnedV2IntentKey", "Lcom/robinhood/android/resumeapplication/ResumeApplication;", "createResumeApplicationCryptoTransferIntentKey", "feature-lib-resume-application_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.resumeapplication.ResumeApplicationFixturesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ResumeApplicationFixtures {
    public static /* synthetic */ ResumeApplicationResponse createResumeApplicationChurnedV2Response$default(ResumeApplicationChurnedAction resumeApplicationChurnedAction, ResumeApplicationResponse8 resumeApplicationResponse8, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            resumeApplicationChurnedAction = new ResumeApplicationChurnedAction.FundAccountAction(new FundAccountAction("test_or_debug_drawer"));
        }
        if ((i & 2) != 0) {
            resumeApplicationResponse8 = ResumeApplicationResponse8.CHURNED_V2;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return createResumeApplicationChurnedV2Response(resumeApplicationChurnedAction, resumeApplicationResponse8, z);
    }

    public static final ResumeApplicationResponse createResumeApplicationChurnedV2Response(ResumeApplicationChurnedAction ctaAction, ResumeApplicationResponse8 variant, boolean z) {
        Intrinsics.checkNotNullParameter(ctaAction, "ctaAction");
        Intrinsics.checkNotNullParameter(variant, "variant");
        ThemedImageSource themedImageSource = new ThemedImageSource(new ImageSource("https://i.ytimg.com/vi/PF7WPPM75Yk/maxresdefault.jpg", "https://i.ytimg.com/vi/PF7WPPM75Yk/maxresdefault.jpg", "https://i.ytimg.com/vi/PF7WPPM75Yk/maxresdefault.jpg"), new ImageSource("https://i.ytimg.com/vi/bz4IB_6LPj4/hqdefault.jpg", "https://i.ytimg.com/vi/bz4IB_6LPj4/hqdefault.jpg", "https://i.ytimg.com/vi/bz4IB_6LPj4/hqdefault.jpg"));
        Icon icon = Icon.INFO_24;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new ValuePropWithIcon(icon, "row_1_title", "row_1_subtitle_markdown", null, null, null, null, null, null, 504, null), new ValuePropWithIcon(icon, "row_2_title", "row_2_subtitle_markdown", null, null, null, null, null, null, 504, null));
        RichText richText = new RichText("*IRA transfers and rollovers receive a 1% match. Keep your 3% IRA match by staying with Robinhood Gold for >1 year. Gold is first 30 days free, then $3.XX/month. Y.YY% APY on brokerage cash does not apply to IRA. IRA match limitations", CollectionsKt.emptyList());
        Color color = Color.f5853FG;
        ThemedColor themedColor = new ThemedColor(color, color);
        Color color2 = Color.f5843BG;
        return new ResumeApplicationResponse(variant, z, null, "Check out what’s new", "Just add money to jump back in", null, new ChurnedFundingV2Content(themedImageSource, immutableList3PersistentListOf, richText, new Button("Fund Account", null, ctaAction, false, "resume_application_churned_v2", null, null, themedColor, new ThemedColor(color2, color2), null, 618, null), "ChurnedFundingV2Content"), "m3a-churned-zero-variant2", null, null, null, null, null, null, null, 32544, null);
    }

    public static final ResumeApplication createResumeApplicationChurnedV2IntentKey() {
        ResumeApplicationResponse8 resumeApplicationResponse8 = ResumeApplicationResponse8.CHURNED_ZERO_M3A;
        ResumeApplicationResponse resumeApplicationResponseCreateResumeApplicationChurnedV2Response$default = createResumeApplicationChurnedV2Response$default(new ResumeApplicationChurnedAction.FundAccountAction(new FundAccountAction("test_or_debug_drawer")), resumeApplicationResponse8, false, 4, null);
        ResumeApplicationResponse8 variant = resumeApplicationResponseCreateResumeApplicationChurnedV2Response$default.getVariant();
        if (variant == null) {
            variant = resumeApplicationResponse8;
        }
        return new ResumeApplication(variant, resumeApplicationResponseCreateResumeApplicationChurnedV2Response$default.getShowWelcomeBack(), resumeApplicationResponseCreateResumeApplicationChurnedV2Response$default.getFirstName(), resumeApplicationResponseCreateResumeApplicationChurnedV2Response$default.getTitle(), resumeApplicationResponseCreateResumeApplicationChurnedV2Response$default.getSubtitle(), null, null, resumeApplicationResponseCreateResumeApplicationChurnedV2Response$default.getChurnedFundingV2Content(), resumeApplicationResponseCreateResumeApplicationChurnedV2Response$default.getFundingUpsellVariant(), null, null, null, null, 7776, null);
    }

    public static final ResumeApplication createResumeApplicationCryptoTransferIntentKey() {
        ResumeApplicationResponse8 resumeApplicationResponse8 = ResumeApplicationResponse8.CRYPTO_TRANSFERS;
        ResumeApplicationResponse resumeApplicationResponseCreateResumeApplicationChurnedV2Response = createResumeApplicationChurnedV2Response(new ResumeApplicationChurnedAction.FundAccountAndCryptoTransferAction(new FundAccountAndCryptoTransferAction("test_or_debug_drawer")), resumeApplicationResponse8, false);
        ResumeApplicationResponse8 variant = resumeApplicationResponseCreateResumeApplicationChurnedV2Response.getVariant();
        if (variant == null) {
            variant = resumeApplicationResponse8;
        }
        return new ResumeApplication(variant, resumeApplicationResponseCreateResumeApplicationChurnedV2Response.getShowWelcomeBack(), resumeApplicationResponseCreateResumeApplicationChurnedV2Response.getFirstName(), resumeApplicationResponseCreateResumeApplicationChurnedV2Response.getTitle(), resumeApplicationResponseCreateResumeApplicationChurnedV2Response.getSubtitle(), null, null, resumeApplicationResponseCreateResumeApplicationChurnedV2Response.getChurnedFundingV2Content(), resumeApplicationResponseCreateResumeApplicationChurnedV2Response.getFundingUpsellVariant(), null, null, null, null, 7776, null);
    }
}
