package com.robinhood.android.pathfinder.corepages.freetext;

import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportTextDescriptionViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0012HÆ\u0003J\u0084\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\tHÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;", "", "inquiryId", "Ljava/util/UUID;", "title", "", "subtitle", "Lcom/robinhood/models/serverdriven/db/RichText;", "formLengthLimit", "", "warningLengthLimit", "placeholderText", "formLengthMinimum", "footerText", "copies", "Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "cachedDescription", "shouldShowLoading", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;Ljava/lang/String;Z)V", "getInquiryId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getFormLengthLimit", "()I", "getWarningLengthLimit", "getPlaceholderText", "getFormLengthMinimum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFooterText", "getCopies", "()Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "getCachedDescription", "getShouldShowLoading", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;Ljava/lang/String;Z)Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;", "equals", "other", "hashCode", "toString", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SupportTextDescriptionViewState {
    public static final int $stable = 8;
    private final String cachedDescription;
    private final CxVoiceContent copies;
    private final String footerText;
    private final int formLengthLimit;
    private final Integer formLengthMinimum;
    private final UUID inquiryId;
    private final String placeholderText;
    private final boolean shouldShowLoading;
    private final RichText subtitle;
    private final String title;
    private final int warningLengthLimit;

    public static /* synthetic */ SupportTextDescriptionViewState copy$default(SupportTextDescriptionViewState supportTextDescriptionViewState, UUID uuid, String str, RichText richText, int i, int i2, String str2, Integer num, String str3, CxVoiceContent cxVoiceContent, String str4, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            uuid = supportTextDescriptionViewState.inquiryId;
        }
        if ((i3 & 2) != 0) {
            str = supportTextDescriptionViewState.title;
        }
        if ((i3 & 4) != 0) {
            richText = supportTextDescriptionViewState.subtitle;
        }
        if ((i3 & 8) != 0) {
            i = supportTextDescriptionViewState.formLengthLimit;
        }
        if ((i3 & 16) != 0) {
            i2 = supportTextDescriptionViewState.warningLengthLimit;
        }
        if ((i3 & 32) != 0) {
            str2 = supportTextDescriptionViewState.placeholderText;
        }
        if ((i3 & 64) != 0) {
            num = supportTextDescriptionViewState.formLengthMinimum;
        }
        if ((i3 & 128) != 0) {
            str3 = supportTextDescriptionViewState.footerText;
        }
        if ((i3 & 256) != 0) {
            cxVoiceContent = supportTextDescriptionViewState.copies;
        }
        if ((i3 & 512) != 0) {
            str4 = supportTextDescriptionViewState.cachedDescription;
        }
        if ((i3 & 1024) != 0) {
            z = supportTextDescriptionViewState.shouldShowLoading;
        }
        String str5 = str4;
        boolean z2 = z;
        String str6 = str3;
        CxVoiceContent cxVoiceContent2 = cxVoiceContent;
        String str7 = str2;
        Integer num2 = num;
        int i4 = i2;
        RichText richText2 = richText;
        return supportTextDescriptionViewState.copy(uuid, str, richText2, i, i4, str7, num2, str6, cxVoiceContent2, str5, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCachedDescription() {
        return this.cachedDescription;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShouldShowLoading() {
        return this.shouldShowLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final RichText getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFormLengthLimit() {
        return this.formLengthLimit;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWarningLengthLimit() {
        return this.warningLengthLimit;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getFormLengthMinimum() {
        return this.formLengthMinimum;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* renamed from: component9, reason: from getter */
    public final CxVoiceContent getCopies() {
        return this.copies;
    }

    public final SupportTextDescriptionViewState copy(UUID inquiryId, String title, RichText subtitle, int formLengthLimit, int warningLengthLimit, String placeholderText, Integer formLengthMinimum, String footerText, CxVoiceContent copies, String cachedDescription, boolean shouldShowLoading) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cachedDescription, "cachedDescription");
        return new SupportTextDescriptionViewState(inquiryId, title, subtitle, formLengthLimit, warningLengthLimit, placeholderText, formLengthMinimum, footerText, copies, cachedDescription, shouldShowLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportTextDescriptionViewState)) {
            return false;
        }
        SupportTextDescriptionViewState supportTextDescriptionViewState = (SupportTextDescriptionViewState) other;
        return Intrinsics.areEqual(this.inquiryId, supportTextDescriptionViewState.inquiryId) && Intrinsics.areEqual(this.title, supportTextDescriptionViewState.title) && Intrinsics.areEqual(this.subtitle, supportTextDescriptionViewState.subtitle) && this.formLengthLimit == supportTextDescriptionViewState.formLengthLimit && this.warningLengthLimit == supportTextDescriptionViewState.warningLengthLimit && Intrinsics.areEqual(this.placeholderText, supportTextDescriptionViewState.placeholderText) && Intrinsics.areEqual(this.formLengthMinimum, supportTextDescriptionViewState.formLengthMinimum) && Intrinsics.areEqual(this.footerText, supportTextDescriptionViewState.footerText) && Intrinsics.areEqual(this.copies, supportTextDescriptionViewState.copies) && Intrinsics.areEqual(this.cachedDescription, supportTextDescriptionViewState.cachedDescription) && this.shouldShowLoading == supportTextDescriptionViewState.shouldShowLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.inquiryId.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.formLengthLimit)) * 31) + Integer.hashCode(this.warningLengthLimit)) * 31;
        String str = this.placeholderText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.formLengthMinimum;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.footerText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CxVoiceContent cxVoiceContent = this.copies;
        return ((((iHashCode4 + (cxVoiceContent != null ? cxVoiceContent.hashCode() : 0)) * 31) + this.cachedDescription.hashCode()) * 31) + Boolean.hashCode(this.shouldShowLoading);
    }

    public String toString() {
        return "SupportTextDescriptionViewState(inquiryId=" + this.inquiryId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", formLengthLimit=" + this.formLengthLimit + ", warningLengthLimit=" + this.warningLengthLimit + ", placeholderText=" + this.placeholderText + ", formLengthMinimum=" + this.formLengthMinimum + ", footerText=" + this.footerText + ", copies=" + this.copies + ", cachedDescription=" + this.cachedDescription + ", shouldShowLoading=" + this.shouldShowLoading + ")";
    }

    public SupportTextDescriptionViewState(UUID inquiryId, String title, RichText subtitle, int i, int i2, String str, Integer num, String str2, CxVoiceContent cxVoiceContent, String cachedDescription, boolean z) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cachedDescription, "cachedDescription");
        this.inquiryId = inquiryId;
        this.title = title;
        this.subtitle = subtitle;
        this.formLengthLimit = i;
        this.warningLengthLimit = i2;
        this.placeholderText = str;
        this.formLengthMinimum = num;
        this.footerText = str2;
        this.copies = cxVoiceContent;
        this.cachedDescription = cachedDescription;
        this.shouldShowLoading = z;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final RichText getSubtitle() {
        return this.subtitle;
    }

    public final int getFormLengthLimit() {
        return this.formLengthLimit;
    }

    public final int getWarningLengthLimit() {
        return this.warningLengthLimit;
    }

    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    public final Integer getFormLengthMinimum() {
        return this.formLengthMinimum;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final CxVoiceContent getCopies() {
        return this.copies;
    }

    public final String getCachedDescription() {
        return this.cachedDescription;
    }

    public final boolean getShouldShowLoading() {
        return this.shouldShowLoading;
    }
}
