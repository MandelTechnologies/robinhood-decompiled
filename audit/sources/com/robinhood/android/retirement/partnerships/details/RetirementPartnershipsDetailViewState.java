package com.robinhood.android.retirement.partnerships.details;

import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementPartnershipDetailResponse;
import com.robinhood.models.serverdriven.experimental.api.RetirementPartnershipDetailAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementPartnershipsDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;", "", "Loading", "Loaded", "Error", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState$Error;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState$Loaded;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState$Loading;", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementPartnershipsDetailViewState {

    /* compiled from: RetirementPartnershipsDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState$Loading;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RetirementPartnershipsDetailViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -303668009;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: RetirementPartnershipsDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState$Loaded;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;", "source", "", "loggingIdentifier", "header", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailHeader;", "bodyContent", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementPartnershipDetailAction;", DirectDepositBrokerageExperimentPage.FOOTER_CONTENT, "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailFooter;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailHeader;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailFooter;)V", "getSource", "()Ljava/lang/String;", "getLoggingIdentifier", "getHeader", "()Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailHeader;", "getBodyContent", "()Lkotlinx/collections/immutable/ImmutableList;", "getFooterContent", "()Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailFooter;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RetirementPartnershipsDetailViewState {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<RetirementPartnershipDetailAction>> bodyContent;
        private final ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter footerContent;
        private final ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader header;
        private final String loggingIdentifier;
        private final String source;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader partnershipDetailHeader, ImmutableList immutableList, ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter partnershipDetailFooter, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.source;
            }
            if ((i & 2) != 0) {
                str2 = loaded.loggingIdentifier;
            }
            if ((i & 4) != 0) {
                partnershipDetailHeader = loaded.header;
            }
            if ((i & 8) != 0) {
                immutableList = loaded.bodyContent;
            }
            if ((i & 16) != 0) {
                partnershipDetailFooter = loaded.footerContent;
            }
            ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter partnershipDetailFooter2 = partnershipDetailFooter;
            ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader partnershipDetailHeader2 = partnershipDetailHeader;
            return loaded.copy(str, str2, partnershipDetailHeader2, immutableList, partnershipDetailFooter2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader getHeader() {
            return this.header;
        }

        public final ImmutableList<UIComponent<RetirementPartnershipDetailAction>> component4() {
            return this.bodyContent;
        }

        /* renamed from: component5, reason: from getter */
        public final ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter getFooterContent() {
            return this.footerContent;
        }

        public final Loaded copy(String source, String loggingIdentifier, ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader header, ImmutableList<? extends UIComponent<? extends RetirementPartnershipDetailAction>> bodyContent, ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter footerContent) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(bodyContent, "bodyContent");
            Intrinsics.checkNotNullParameter(footerContent, "footerContent");
            return new Loaded(source, loggingIdentifier, header, bodyContent, footerContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.source, loaded.source) && Intrinsics.areEqual(this.loggingIdentifier, loaded.loggingIdentifier) && Intrinsics.areEqual(this.header, loaded.header) && Intrinsics.areEqual(this.bodyContent, loaded.bodyContent) && Intrinsics.areEqual(this.footerContent, loaded.footerContent);
        }

        public int hashCode() {
            return (((((((this.source.hashCode() * 31) + this.loggingIdentifier.hashCode()) * 31) + this.header.hashCode()) * 31) + this.bodyContent.hashCode()) * 31) + this.footerContent.hashCode();
        }

        public String toString() {
            return "Loaded(source=" + this.source + ", loggingIdentifier=" + this.loggingIdentifier + ", header=" + this.header + ", bodyContent=" + this.bodyContent + ", footerContent=" + this.footerContent + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(String source, String loggingIdentifier, ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader header, ImmutableList<? extends UIComponent<? extends RetirementPartnershipDetailAction>> bodyContent, ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter footerContent) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(bodyContent, "bodyContent");
            Intrinsics.checkNotNullParameter(footerContent, "footerContent");
            this.source = source;
            this.loggingIdentifier = loggingIdentifier;
            this.header = header;
            this.bodyContent = bodyContent;
            this.footerContent = footerContent;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader getHeader() {
            return this.header;
        }

        public final ImmutableList<UIComponent<RetirementPartnershipDetailAction>> getBodyContent() {
            return this.bodyContent;
        }

        public final ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter getFooterContent() {
            return this.footerContent;
        }
    }

    /* compiled from: RetirementPartnershipsDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState$Error;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements RetirementPartnershipsDetailViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        public Error(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
