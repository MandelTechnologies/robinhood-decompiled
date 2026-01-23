package com.robinhood.android.referral.rewardoffers.referralOffer.details.model;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* compiled from: ReferralOfferDetailsViewData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "", "<init>", "()V", "Spacing", "HeaderImage", "TitleText", "SubtitleText", "SearchField", "ContactSectionHeader", "ContactItem", "ContactInfo", "ShimmeredContactInfo", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactItem;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactSectionHeader;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$HeaderImage;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SearchField;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$Spacing;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SubtitleText;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$TitleText;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class ReferralOfferDetailsViewData {
    public static final int $stable = 0;

    public /* synthetic */ ReferralOfferDetailsViewData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ReferralOfferDetailsViewData() {
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$Spacing;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "size", "Landroidx/compose/ui/unit/Dp;", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSize-D9Ej5fM", "()F", "F", "component1", "component1-D9Ej5fM", "copy", "copy-0680j_4", "(F)Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$Spacing;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing extends ReferralOfferDetailsViewData {
        public static final int $stable = 0;
        private final float size;

        public /* synthetic */ Spacing(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        /* renamed from: copy-0680j_4$default, reason: not valid java name */
        public static /* synthetic */ Spacing m18082copy0680j_4$default(Spacing spacing, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacing.size;
            }
            return spacing.m18084copy0680j_4(f);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSize() {
            return this.size;
        }

        /* renamed from: copy-0680j_4, reason: not valid java name */
        public final Spacing m18084copy0680j_4(float size) {
            return new Spacing(size, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Spacing) && C2002Dp.m7997equalsimpl0(this.size, ((Spacing) other).size);
        }

        public int hashCode() {
            return C2002Dp.m7998hashCodeimpl(this.size);
        }

        public String toString() {
            return "Spacing(size=" + C2002Dp.m7999toStringimpl(this.size) + ")";
        }

        private Spacing(float f) {
            super(null);
            this.size = f;
        }

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public final float m18085getSizeD9Ej5fM() {
            return this.size;
        }
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$HeaderImage;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", MarkdownText4.TagImageUrl, "Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "aspectRatio", "", "<init>", "(Lcom/robinhood/models/serverdriven/db/ThemedImageSource;D)V", "getImageUrl", "()Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "getAspectRatio", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HeaderImage extends ReferralOfferDetailsViewData {
        public static final int $stable = 8;
        private final double aspectRatio;
        private final ThemedImageSource imageUrl;

        public static /* synthetic */ HeaderImage copy$default(HeaderImage headerImage, ThemedImageSource themedImageSource, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                themedImageSource = headerImage.imageUrl;
            }
            if ((i & 2) != 0) {
                d = headerImage.aspectRatio;
            }
            return headerImage.copy(themedImageSource, d);
        }

        /* renamed from: component1, reason: from getter */
        public final ThemedImageSource getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final double getAspectRatio() {
            return this.aspectRatio;
        }

        public final HeaderImage copy(ThemedImageSource imageUrl, double aspectRatio) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new HeaderImage(imageUrl, aspectRatio);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderImage)) {
                return false;
            }
            HeaderImage headerImage = (HeaderImage) other;
            return Intrinsics.areEqual(this.imageUrl, headerImage.imageUrl) && Double.compare(this.aspectRatio, headerImage.aspectRatio) == 0;
        }

        public int hashCode() {
            return (this.imageUrl.hashCode() * 31) + Double.hashCode(this.aspectRatio);
        }

        public String toString() {
            return "HeaderImage(imageUrl=" + this.imageUrl + ", aspectRatio=" + this.aspectRatio + ")";
        }

        public final ThemedImageSource getImageUrl() {
            return this.imageUrl;
        }

        public final double getAspectRatio() {
            return this.aspectRatio;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderImage(ThemedImageSource imageUrl, double d) {
            super(null);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.aspectRatio = d;
        }
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$TitleText;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "text", "Lcom/robinhood/models/serverdriven/db/RichText;", "isLarge", "", "<init>", "(Lcom/robinhood/models/serverdriven/db/RichText;Z)V", "getText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TitleText extends ReferralOfferDetailsViewData {
        public static final int $stable = 8;
        private final boolean isLarge;
        private final RichText text;

        public static /* synthetic */ TitleText copy$default(TitleText titleText, RichText richText, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                richText = titleText.text;
            }
            if ((i & 2) != 0) {
                z = titleText.isLarge;
            }
            return titleText.copy(richText, z);
        }

        /* renamed from: component1, reason: from getter */
        public final RichText getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLarge() {
            return this.isLarge;
        }

        public final TitleText copy(RichText text, boolean isLarge) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TitleText(text, isLarge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleText)) {
                return false;
            }
            TitleText titleText = (TitleText) other;
            return Intrinsics.areEqual(this.text, titleText.text) && this.isLarge == titleText.isLarge;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + Boolean.hashCode(this.isLarge);
        }

        public String toString() {
            return "TitleText(text=" + this.text + ", isLarge=" + this.isLarge + ")";
        }

        public final RichText getText() {
            return this.text;
        }

        public final boolean isLarge() {
            return this.isLarge;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleText(RichText text, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isLarge = z;
        }
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SubtitleText;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "text", "Lcom/robinhood/models/serverdriven/db/RichText;", "additionalInfoText", "<init>", "(Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/RichText;)V", "getText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getAdditionalInfoText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubtitleText extends ReferralOfferDetailsViewData {
        public static final int $stable = 8;
        private final RichText additionalInfoText;
        private final RichText text;

        public static /* synthetic */ SubtitleText copy$default(SubtitleText subtitleText, RichText richText, RichText richText2, int i, Object obj) {
            if ((i & 1) != 0) {
                richText = subtitleText.text;
            }
            if ((i & 2) != 0) {
                richText2 = subtitleText.additionalInfoText;
            }
            return subtitleText.copy(richText, richText2);
        }

        /* renamed from: component1, reason: from getter */
        public final RichText getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final RichText getAdditionalInfoText() {
            return this.additionalInfoText;
        }

        public final SubtitleText copy(RichText text, RichText additionalInfoText) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new SubtitleText(text, additionalInfoText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubtitleText)) {
                return false;
            }
            SubtitleText subtitleText = (SubtitleText) other;
            return Intrinsics.areEqual(this.text, subtitleText.text) && Intrinsics.areEqual(this.additionalInfoText, subtitleText.additionalInfoText);
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            RichText richText = this.additionalInfoText;
            return iHashCode + (richText == null ? 0 : richText.hashCode());
        }

        public String toString() {
            return "SubtitleText(text=" + this.text + ", additionalInfoText=" + this.additionalInfoText + ")";
        }

        public final RichText getText() {
            return this.text;
        }

        public final RichText getAdditionalInfoText() {
            return this.additionalInfoText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubtitleText(RichText text, RichText richText) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.additionalInfoText = richText;
        }
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$SearchField;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "placeholderText", "", "isEditing", "", "<init>", "(Ljava/lang/String;Z)V", "getPlaceholderText", "()Ljava/lang/String;", "()Z", "setEditing", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SearchField extends ReferralOfferDetailsViewData {
        public static final int $stable = 8;
        private boolean isEditing;
        private final String placeholderText;

        public static /* synthetic */ SearchField copy$default(SearchField searchField, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = searchField.placeholderText;
            }
            if ((i & 2) != 0) {
                z = searchField.isEditing;
            }
            return searchField.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPlaceholderText() {
            return this.placeholderText;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEditing() {
            return this.isEditing;
        }

        public final SearchField copy(String placeholderText, boolean isEditing) {
            Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
            return new SearchField(placeholderText, isEditing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchField)) {
                return false;
            }
            SearchField searchField = (SearchField) other;
            return Intrinsics.areEqual(this.placeholderText, searchField.placeholderText) && this.isEditing == searchField.isEditing;
        }

        public int hashCode() {
            return (this.placeholderText.hashCode() * 31) + Boolean.hashCode(this.isEditing);
        }

        public String toString() {
            return "SearchField(placeholderText=" + this.placeholderText + ", isEditing=" + this.isEditing + ")";
        }

        public /* synthetic */ SearchField(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final String getPlaceholderText() {
            return this.placeholderText;
        }

        public final boolean isEditing() {
            return this.isEditing;
        }

        public final void setEditing(boolean z) {
            this.isEditing = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchField(String placeholderText, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
            this.placeholderText = placeholderText;
            this.isEditing = z;
        }
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactSectionHeader;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContactSectionHeader extends ReferralOfferDetailsViewData {
        public static final int $stable = StringResource.$stable;
        private final StringResource text;

        public static /* synthetic */ ContactSectionHeader copy$default(ContactSectionHeader contactSectionHeader, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = contactSectionHeader.text;
            }
            return contactSectionHeader.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        public final ContactSectionHeader copy(StringResource text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ContactSectionHeader(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContactSectionHeader) && Intrinsics.areEqual(this.text, ((ContactSectionHeader) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "ContactSectionHeader(text=" + this.text + ")";
        }

        public final StringResource getText() {
            return this.text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactSectionHeader(StringResource text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactItem;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ContactItem extends ReferralOfferDetailsViewData {
        public static final int $stable = 0;

        public ContactItem() {
            super(null);
        }
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010#\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactInfo;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactItem;", "referralContact", "Lcom/robinhood/models/contacts/ReferralContact;", "isRecommended", "", "primaryText", "Landroidx/compose/ui/text/AnnotatedString;", "secondaryText", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/utils/resource/StringResource;", "inviteCtaText", "", "<init>", "(Lcom/robinhood/models/contacts/ReferralContact;ZLandroidx/compose/ui/text/AnnotatedString;Lcom/robinhood/utils/Either;Ljava/lang/String;)V", "getReferralContact", "()Lcom/robinhood/models/contacts/ReferralContact;", "()Z", "getPrimaryText", "()Landroidx/compose/ui/text/AnnotatedString;", "getSecondaryText", "()Lcom/robinhood/utils/Either;", "getInviteCtaText", "()Ljava/lang/String;", "equals", "other", "", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContactInfo extends ContactItem {
        public static final int $stable = 8;
        private final String inviteCtaText;
        private final boolean isRecommended;
        private final AnnotatedString primaryText;
        private final ReferralContact referralContact;
        private final Either<StringResource, AnnotatedString> secondaryText;

        public static /* synthetic */ ContactInfo copy$default(ContactInfo contactInfo, ReferralContact referralContact, boolean z, AnnotatedString annotatedString, Either either, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                referralContact = contactInfo.referralContact;
            }
            if ((i & 2) != 0) {
                z = contactInfo.isRecommended;
            }
            if ((i & 4) != 0) {
                annotatedString = contactInfo.primaryText;
            }
            if ((i & 8) != 0) {
                either = contactInfo.secondaryText;
            }
            if ((i & 16) != 0) {
                str = contactInfo.inviteCtaText;
            }
            String str2 = str;
            AnnotatedString annotatedString2 = annotatedString;
            return contactInfo.copy(referralContact, z, annotatedString2, either, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferralContact getReferralContact() {
            return this.referralContact;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRecommended() {
            return this.isRecommended;
        }

        /* renamed from: component3, reason: from getter */
        public final AnnotatedString getPrimaryText() {
            return this.primaryText;
        }

        public final Either<StringResource, AnnotatedString> component4() {
            return this.secondaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getInviteCtaText() {
            return this.inviteCtaText;
        }

        public final ContactInfo copy(ReferralContact referralContact, boolean isRecommended, AnnotatedString primaryText, Either<? extends StringResource, AnnotatedString> secondaryText, String inviteCtaText) {
            Intrinsics.checkNotNullParameter(referralContact, "referralContact");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(inviteCtaText, "inviteCtaText");
            return new ContactInfo(referralContact, isRecommended, primaryText, secondaryText, inviteCtaText);
        }

        public String toString() {
            ReferralContact referralContact = this.referralContact;
            boolean z = this.isRecommended;
            AnnotatedString annotatedString = this.primaryText;
            return "ContactInfo(referralContact=" + referralContact + ", isRecommended=" + z + ", primaryText=" + ((Object) annotatedString) + ", secondaryText=" + this.secondaryText + ", inviteCtaText=" + this.inviteCtaText + ")";
        }

        public final ReferralContact getReferralContact() {
            return this.referralContact;
        }

        public final boolean isRecommended() {
            return this.isRecommended;
        }

        public final AnnotatedString getPrimaryText() {
            return this.primaryText;
        }

        public final Either<StringResource, AnnotatedString> getSecondaryText() {
            return this.secondaryText;
        }

        public final String getInviteCtaText() {
            return this.inviteCtaText;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContactInfo(ReferralContact referralContact, boolean z, AnnotatedString primaryText, Either<? extends StringResource, AnnotatedString> secondaryText, String inviteCtaText) {
            Intrinsics.checkNotNullParameter(referralContact, "referralContact");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(inviteCtaText, "inviteCtaText");
            this.referralContact = referralContact;
            this.isRecommended = z;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.inviteCtaText = inviteCtaText;
        }

        public boolean equals(Object other) {
            return (other instanceof ContactInfo) && Intrinsics.areEqual(this.referralContact, ((ContactInfo) other).referralContact);
        }

        public int hashCode() {
            return this.referralContact.getContactId();
        }
    }

    /* compiled from: ReferralOfferDetailsViewData.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ShimmeredContactInfo;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactItem;", "seed", "", "<init>", "(I)V", "getSeed", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShimmeredContactInfo extends ContactItem {
        public static final int $stable = 0;
        private final int seed;

        public ShimmeredContactInfo() {
            this(0, 1, null);
        }

        public static /* synthetic */ ShimmeredContactInfo copy$default(ShimmeredContactInfo shimmeredContactInfo, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = shimmeredContactInfo.seed;
            }
            return shimmeredContactInfo.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSeed() {
            return this.seed;
        }

        public final ShimmeredContactInfo copy(int seed) {
            return new ShimmeredContactInfo(seed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShimmeredContactInfo) && this.seed == ((ShimmeredContactInfo) other).seed;
        }

        public int hashCode() {
            return Integer.hashCode(this.seed);
        }

        public String toString() {
            return "ShimmeredContactInfo(seed=" + this.seed + ")";
        }

        public /* synthetic */ ShimmeredContactInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Random.INSTANCE.nextInt() : i);
        }

        public final int getSeed() {
            return this.seed;
        }

        public ShimmeredContactInfo(int i) {
            this.seed = i;
        }
    }
}
