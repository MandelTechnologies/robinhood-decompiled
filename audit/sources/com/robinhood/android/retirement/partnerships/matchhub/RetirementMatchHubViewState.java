package com.robinhood.android.retirement.partnerships.matchhub;

import com.robinhood.android.models.retirement.api.ApiRetirementMatchHubResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementMatchHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState$Error;", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState$Loaded;", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState$Loading;", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementMatchHubViewState {

    /* compiled from: RetirementMatchHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState$Loading;", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RetirementMatchHubViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -88552111;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: RetirementMatchHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState$Error;", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements RetirementMatchHubViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -801980579;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: RetirementMatchHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState$Loaded;", "Lcom/robinhood/android/retirement/partnerships/matchhub/RetirementMatchHubViewState;", "source", "", "header", "Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse$MatchHubHeader;", "content", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", Footer.f10637type, "loggingIdentifier", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse$MatchHubHeader;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getHeader", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse$MatchHubHeader;", "getContent", "()Lkotlinx/collections/immutable/ImmutableList;", "getFooter", "getLoggingIdentifier", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RetirementMatchHubViewState {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> content;
        private final ImmutableList<UIComponent<GenericAction>> footer;
        private final ApiRetirementMatchHubResponse.MatchHubHeader header;
        private final String loggingIdentifier;
        private final String source;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ApiRetirementMatchHubResponse.MatchHubHeader matchHubHeader, ImmutableList immutableList, ImmutableList immutableList2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.source;
            }
            if ((i & 2) != 0) {
                matchHubHeader = loaded.header;
            }
            if ((i & 4) != 0) {
                immutableList = loaded.content;
            }
            if ((i & 8) != 0) {
                immutableList2 = loaded.footer;
            }
            if ((i & 16) != 0) {
                str2 = loaded.loggingIdentifier;
            }
            String str3 = str2;
            ImmutableList immutableList3 = immutableList;
            return loaded.copy(str, matchHubHeader, immutableList3, immutableList2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiRetirementMatchHubResponse.MatchHubHeader getHeader() {
            return this.header;
        }

        public final ImmutableList<UIComponent<GenericAction>> component3() {
            return this.content;
        }

        public final ImmutableList<UIComponent<GenericAction>> component4() {
            return this.footer;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final Loaded copy(String source, ApiRetirementMatchHubResponse.MatchHubHeader header, ImmutableList<? extends UIComponent<? extends GenericAction>> content, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            return new Loaded(source, header, content, footer, loggingIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.source, loaded.source) && Intrinsics.areEqual(this.header, loaded.header) && Intrinsics.areEqual(this.content, loaded.content) && Intrinsics.areEqual(this.footer, loaded.footer) && Intrinsics.areEqual(this.loggingIdentifier, loaded.loggingIdentifier);
        }

        public int hashCode() {
            return (((((((this.source.hashCode() * 31) + this.header.hashCode()) * 31) + this.content.hashCode()) * 31) + this.footer.hashCode()) * 31) + this.loggingIdentifier.hashCode();
        }

        public String toString() {
            return "Loaded(source=" + this.source + ", header=" + this.header + ", content=" + this.content + ", footer=" + this.footer + ", loggingIdentifier=" + this.loggingIdentifier + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(String source, ApiRetirementMatchHubResponse.MatchHubHeader header, ImmutableList<? extends UIComponent<? extends GenericAction>> content, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            this.source = source;
            this.header = header;
            this.content = content;
            this.footer = footer;
            this.loggingIdentifier = loggingIdentifier;
        }

        public final String getSource() {
            return this.source;
        }

        public final ApiRetirementMatchHubResponse.MatchHubHeader getHeader() {
            return this.header;
        }

        public final ImmutableList<UIComponent<GenericAction>> getContent() {
            return this.content;
        }

        public final ImmutableList<UIComponent<GenericAction>> getFooter() {
            return this.footer;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }
    }
}
