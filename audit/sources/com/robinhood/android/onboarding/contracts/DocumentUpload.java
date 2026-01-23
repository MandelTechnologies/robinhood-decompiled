package com.robinhood.android.onboarding.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.DocUploadThanksContext;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentUpload.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016Bk\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003Jm\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020+HÖ\u0001J\t\u00100\u001a\u00020\fHÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/DocumentUpload;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "documentRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "showUnderReview", "", "mockRequests", "showThanks", "Lcom/robinhood/models/api/DocUploadThanksContext;", "skipInquiryVerificationForUnauthedSelfieConsent", ResourceTypes.STYLE, "", "isOnboardingOnly", "theme", "Lcom/robinhood/models/api/ColorTheme;", "exitOnPersonaError", "<init>", "(Ljava/util/List;ZZLcom/robinhood/models/api/DocUploadThanksContext;ZLjava/lang/String;ZLcom/robinhood/models/api/ColorTheme;Z)V", "getDocumentRequests", "()Ljava/util/List;", "getShowUnderReview", "()Z", "getMockRequests", "getShowThanks", "()Lcom/robinhood/models/api/DocUploadThanksContext;", "getSkipInquiryVerificationForUnauthedSelfieConsent", "getStyle", "()Ljava/lang/String;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "getExitOnPersonaError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DocumentUpload implements FragmentKey {
    public static final int RESULT_UNSUCCESSFUL = 2;
    private final List<DocumentRequest> documentRequests;
    private final boolean exitOnPersonaError;
    private final boolean isOnboardingOnly;
    private final boolean mockRequests;
    private final DocUploadThanksContext showThanks;
    private final boolean showUnderReview;
    private final boolean skipInquiryVerificationForUnauthedSelfieConsent;
    private final String style;
    private final ColorTheme theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DocumentUpload> CREATOR = new Creator();

    /* compiled from: DocumentUpload.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<DocumentUpload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentUpload createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(DocumentUpload.class.getClassLoader()));
            }
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new DocumentUpload(arrayList, z2, parcel.readInt() != 0 ? z : false, parcel.readInt() == 0 ? null : DocUploadThanksContext.valueOf(parcel.readString()), parcel.readInt() != 0 ? z : false, parcel.readString(), parcel.readInt() != 0 ? z : false, ColorTheme.valueOf(parcel.readString()), parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentUpload[] newArray(int i) {
            return new DocumentUpload[i];
        }
    }

    public DocumentUpload() {
        this(null, false, false, null, false, null, false, null, false, 511, null);
    }

    public static /* synthetic */ DocumentUpload copy$default(DocumentUpload documentUpload, List list, boolean z, boolean z2, DocUploadThanksContext docUploadThanksContext, boolean z3, String str, boolean z4, ColorTheme colorTheme, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = documentUpload.documentRequests;
        }
        if ((i & 2) != 0) {
            z = documentUpload.showUnderReview;
        }
        if ((i & 4) != 0) {
            z2 = documentUpload.mockRequests;
        }
        if ((i & 8) != 0) {
            docUploadThanksContext = documentUpload.showThanks;
        }
        if ((i & 16) != 0) {
            z3 = documentUpload.skipInquiryVerificationForUnauthedSelfieConsent;
        }
        if ((i & 32) != 0) {
            str = documentUpload.style;
        }
        if ((i & 64) != 0) {
            z4 = documentUpload.isOnboardingOnly;
        }
        if ((i & 128) != 0) {
            colorTheme = documentUpload.theme;
        }
        if ((i & 256) != 0) {
            z5 = documentUpload.exitOnPersonaError;
        }
        ColorTheme colorTheme2 = colorTheme;
        boolean z6 = z5;
        String str2 = str;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        return documentUpload.copy(list, z, z9, docUploadThanksContext, z8, str2, z7, colorTheme2, z6);
    }

    public final List<DocumentRequest> component1() {
        return this.documentRequests;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowUnderReview() {
        return this.showUnderReview;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getMockRequests() {
        return this.mockRequests;
    }

    /* renamed from: component4, reason: from getter */
    public final DocUploadThanksContext getShowThanks() {
        return this.showThanks;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSkipInquiryVerificationForUnauthedSelfieConsent() {
        return this.skipInquiryVerificationForUnauthedSelfieConsent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsOnboardingOnly() {
        return this.isOnboardingOnly;
    }

    /* renamed from: component8, reason: from getter */
    public final ColorTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getExitOnPersonaError() {
        return this.exitOnPersonaError;
    }

    public final DocumentUpload copy(List<DocumentRequest> documentRequests, boolean showUnderReview, boolean mockRequests, DocUploadThanksContext showThanks, boolean skipInquiryVerificationForUnauthedSelfieConsent, String style, boolean isOnboardingOnly, ColorTheme theme, boolean exitOnPersonaError) {
        Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new DocumentUpload(documentRequests, showUnderReview, mockRequests, showThanks, skipInquiryVerificationForUnauthedSelfieConsent, style, isOnboardingOnly, theme, exitOnPersonaError);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentUpload)) {
            return false;
        }
        DocumentUpload documentUpload = (DocumentUpload) other;
        return Intrinsics.areEqual(this.documentRequests, documentUpload.documentRequests) && this.showUnderReview == documentUpload.showUnderReview && this.mockRequests == documentUpload.mockRequests && this.showThanks == documentUpload.showThanks && this.skipInquiryVerificationForUnauthedSelfieConsent == documentUpload.skipInquiryVerificationForUnauthedSelfieConsent && Intrinsics.areEqual(this.style, documentUpload.style) && this.isOnboardingOnly == documentUpload.isOnboardingOnly && this.theme == documentUpload.theme && this.exitOnPersonaError == documentUpload.exitOnPersonaError;
    }

    public int hashCode() {
        int iHashCode = ((((this.documentRequests.hashCode() * 31) + Boolean.hashCode(this.showUnderReview)) * 31) + Boolean.hashCode(this.mockRequests)) * 31;
        DocUploadThanksContext docUploadThanksContext = this.showThanks;
        int iHashCode2 = (((iHashCode + (docUploadThanksContext == null ? 0 : docUploadThanksContext.hashCode())) * 31) + Boolean.hashCode(this.skipInquiryVerificationForUnauthedSelfieConsent)) * 31;
        String str = this.style;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOnboardingOnly)) * 31) + this.theme.hashCode()) * 31) + Boolean.hashCode(this.exitOnPersonaError);
    }

    public String toString() {
        return "DocumentUpload(documentRequests=" + this.documentRequests + ", showUnderReview=" + this.showUnderReview + ", mockRequests=" + this.mockRequests + ", showThanks=" + this.showThanks + ", skipInquiryVerificationForUnauthedSelfieConsent=" + this.skipInquiryVerificationForUnauthedSelfieConsent + ", style=" + this.style + ", isOnboardingOnly=" + this.isOnboardingOnly + ", theme=" + this.theme + ", exitOnPersonaError=" + this.exitOnPersonaError + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<DocumentRequest> list = this.documentRequests;
        dest.writeInt(list.size());
        Iterator<DocumentRequest> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeInt(this.showUnderReview ? 1 : 0);
        dest.writeInt(this.mockRequests ? 1 : 0);
        DocUploadThanksContext docUploadThanksContext = this.showThanks;
        if (docUploadThanksContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(docUploadThanksContext.name());
        }
        dest.writeInt(this.skipInquiryVerificationForUnauthedSelfieConsent ? 1 : 0);
        dest.writeString(this.style);
        dest.writeInt(this.isOnboardingOnly ? 1 : 0);
        dest.writeString(this.theme.name());
        dest.writeInt(this.exitOnPersonaError ? 1 : 0);
    }

    public DocumentUpload(List<DocumentRequest> documentRequests, boolean z, boolean z2, DocUploadThanksContext docUploadThanksContext, boolean z3, String str, boolean z4, ColorTheme theme, boolean z5) {
        Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.documentRequests = documentRequests;
        this.showUnderReview = z;
        this.mockRequests = z2;
        this.showThanks = docUploadThanksContext;
        this.skipInquiryVerificationForUnauthedSelfieConsent = z3;
        this.style = str;
        this.isOnboardingOnly = z4;
        this.theme = theme;
        this.exitOnPersonaError = z5;
    }

    public /* synthetic */ DocumentUpload(List list, boolean z, boolean z2, DocUploadThanksContext docUploadThanksContext, boolean z3, String str, boolean z4, ColorTheme colorTheme, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.listOf(new DocumentRequest(null, null, null, null, false, null, null, null, null, null, null, 2047, null)) : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : docUploadThanksContext, (i & 16) != 0 ? false : z3, (i & 32) == 0 ? str : null, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? ColorTheme.DEFAULT : colorTheme, (i & 256) != 0 ? false : z5);
    }

    public final List<DocumentRequest> getDocumentRequests() {
        return this.documentRequests;
    }

    public final boolean getShowUnderReview() {
        return this.showUnderReview;
    }

    public final boolean getMockRequests() {
        return this.mockRequests;
    }

    public final DocUploadThanksContext getShowThanks() {
        return this.showThanks;
    }

    public final boolean getSkipInquiryVerificationForUnauthedSelfieConsent() {
        return this.skipInquiryVerificationForUnauthedSelfieConsent;
    }

    public final String getStyle() {
        return this.style;
    }

    public final boolean isOnboardingOnly() {
        return this.isOnboardingOnly;
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }

    public final boolean getExitOnPersonaError() {
        return this.exitOnPersonaError;
    }

    /* compiled from: DocumentUpload.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J>\u0010\u0011\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/onboarding/contracts/DocumentUpload$Companion;", "", "<init>", "()V", "RESULT_UNSUCCESSFUL", "", "singleDocStandaloneActivityIntent", "Lcom/robinhood/android/navigation/keys/IntentKey;", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "showUnderReview", "", "showThanks", "Lcom/robinhood/models/api/DocUploadThanksContext;", "shouldPromptForLockscreen", "theme", "Lcom/robinhood/models/api/ColorTheme;", "multiDocStandaloneActivityIntent", "documentRequests", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ IntentKey singleDocStandaloneActivityIntent$default(Companion companion, DocumentRequest documentRequest, boolean z, DocUploadThanksContext docUploadThanksContext, boolean z2, ColorTheme colorTheme, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                docUploadThanksContext = null;
            }
            DocUploadThanksContext docUploadThanksContext2 = docUploadThanksContext;
            if ((i & 8) != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                colorTheme = ColorTheme.DEFAULT;
            }
            return companion.singleDocStandaloneActivityIntent(documentRequest, z3, docUploadThanksContext2, z4, colorTheme);
        }

        public final IntentKey singleDocStandaloneActivityIntent(DocumentRequest documentRequest, boolean showUnderReview, DocUploadThanksContext showThanks, boolean shouldPromptForLockscreen, ColorTheme theme) {
            Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
            Intrinsics.checkNotNullParameter(theme, "theme");
            return multiDocStandaloneActivityIntent(CollectionsKt.listOf(documentRequest), showUnderReview, showThanks, shouldPromptForLockscreen, theme);
        }

        public static /* synthetic */ IntentKey multiDocStandaloneActivityIntent$default(Companion companion, List list, boolean z, DocUploadThanksContext docUploadThanksContext, boolean z2, ColorTheme colorTheme, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                docUploadThanksContext = null;
            }
            DocUploadThanksContext docUploadThanksContext2 = docUploadThanksContext;
            if ((i & 8) != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                colorTheme = ColorTheme.DEFAULT;
            }
            return companion.multiDocStandaloneActivityIntent(list, z3, docUploadThanksContext2, z4, colorTheme);
        }

        public final IntentKey multiDocStandaloneActivityIntent(List<DocumentRequest> documentRequests, boolean showUnderReview, DocUploadThanksContext showThanks, boolean shouldPromptForLockscreen, ColorTheme theme) {
            Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new DocumentUpload(documentRequests, showUnderReview, false, showThanks, false, null, false, theme, false, 372, null), false, false, false, false, shouldPromptForLockscreen, theme == ColorTheme.DARK, 22, null);
        }
    }
}
