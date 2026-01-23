package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtherMarkdownStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "", "Loading", "Ready", "Error", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownViewState, reason: use source file name */
/* loaded from: classes5.dex */
public interface OtherMarkdownStateProvider3 {

    /* compiled from: OtherMarkdownStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState$Loading;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "<init>", "()V", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownViewState$Loading */
    public static final class Loading implements OtherMarkdownStateProvider3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: OtherMarkdownStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState$Ready;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "titleMarkdown", "", "bodyMarkdown", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitleMarkdown", "()Ljava/lang/String;", "getBodyMarkdown", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownViewState$Ready, reason: from toString */
    public static final /* data */ class Ready implements OtherMarkdownStateProvider3 {
        public static final int $stable = 0;
        private final String bodyMarkdown;
        private final String titleMarkdown;

        public static /* synthetic */ Ready copy$default(Ready ready, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ready.titleMarkdown;
            }
            if ((i & 2) != 0) {
                str2 = ready.bodyMarkdown;
            }
            return ready.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitleMarkdown() {
            return this.titleMarkdown;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBodyMarkdown() {
            return this.bodyMarkdown;
        }

        public final Ready copy(String titleMarkdown, String bodyMarkdown) {
            Intrinsics.checkNotNullParameter(titleMarkdown, "titleMarkdown");
            Intrinsics.checkNotNullParameter(bodyMarkdown, "bodyMarkdown");
            return new Ready(titleMarkdown, bodyMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.titleMarkdown, ready.titleMarkdown) && Intrinsics.areEqual(this.bodyMarkdown, ready.bodyMarkdown);
        }

        public int hashCode() {
            return (this.titleMarkdown.hashCode() * 31) + this.bodyMarkdown.hashCode();
        }

        public String toString() {
            return "Ready(titleMarkdown=" + this.titleMarkdown + ", bodyMarkdown=" + this.bodyMarkdown + ")";
        }

        public Ready(String titleMarkdown, String bodyMarkdown) {
            Intrinsics.checkNotNullParameter(titleMarkdown, "titleMarkdown");
            Intrinsics.checkNotNullParameter(bodyMarkdown, "bodyMarkdown");
            this.titleMarkdown = titleMarkdown;
            this.bodyMarkdown = bodyMarkdown;
        }

        public final String getTitleMarkdown() {
            return this.titleMarkdown;
        }

        public final String getBodyMarkdown() {
            return this.bodyMarkdown;
        }
    }

    /* compiled from: OtherMarkdownStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState$Error;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "<init>", "()V", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownViewState$Error */
    public static final class Error implements OtherMarkdownStateProvider3 {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }
}
