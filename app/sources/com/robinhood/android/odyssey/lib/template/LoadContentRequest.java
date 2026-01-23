package com.robinhood.android.odyssey.lib.template;

import androidx.core.text.PrecomputedTextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadContentRequest.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "", "<init>", "()V", "precomputedTextParams", "Landroidx/core/text/PrecomputedTextCompat$Params;", "getPrecomputedTextParams", "()Landroidx/core/text/PrecomputedTextCompat$Params;", "componentTag", "", "getComponentTag", "()Ljava/lang/String;", "FancyAgreement", "Markdown", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$FancyAgreement;", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$Markdown;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class LoadContentRequest {
    public static final int $stable = 0;

    public /* synthetic */ LoadContentRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getComponentTag();

    public abstract PrecomputedTextCompat.Params getPrecomputedTextParams();

    private LoadContentRequest() {
    }

    /* compiled from: LoadContentRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$FancyAgreement;", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "componentTag", "", "precomputedTextParams", "Landroidx/core/text/PrecomputedTextCompat$Params;", "contentfulId", "<init>", "(Ljava/lang/String;Landroidx/core/text/PrecomputedTextCompat$Params;Ljava/lang/String;)V", "getComponentTag", "()Ljava/lang/String;", "getPrecomputedTextParams", "()Landroidx/core/text/PrecomputedTextCompat$Params;", "getContentfulId", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FancyAgreement extends LoadContentRequest {
        public static final int $stable = 8;
        private final String componentTag;
        private final String contentfulId;
        private final PrecomputedTextCompat.Params precomputedTextParams;

        @Override // com.robinhood.android.odyssey.lib.template.LoadContentRequest
        public String getComponentTag() {
            return this.componentTag;
        }

        @Override // com.robinhood.android.odyssey.lib.template.LoadContentRequest
        public PrecomputedTextCompat.Params getPrecomputedTextParams() {
            return this.precomputedTextParams;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FancyAgreement(String componentTag, PrecomputedTextCompat.Params precomputedTextParams, String contentfulId) {
            super(null);
            Intrinsics.checkNotNullParameter(componentTag, "componentTag");
            Intrinsics.checkNotNullParameter(precomputedTextParams, "precomputedTextParams");
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            this.componentTag = componentTag;
            this.precomputedTextParams = precomputedTextParams;
            this.contentfulId = contentfulId;
        }
    }

    /* compiled from: LoadContentRequest.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$Markdown;", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "precomputedTextParams", "Landroidx/core/text/PrecomputedTextCompat$Params;", "componentTag", "", "markdownUrl", "shouldAppendTrailingNewline", "", "<init>", "(Landroidx/core/text/PrecomputedTextCompat$Params;Ljava/lang/String;Ljava/lang/String;Z)V", "getPrecomputedTextParams", "()Landroidx/core/text/PrecomputedTextCompat$Params;", "getComponentTag", "()Ljava/lang/String;", "getMarkdownUrl", "getShouldAppendTrailingNewline", "()Z", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Markdown extends LoadContentRequest {
        public static final int $stable = 8;
        private final String componentTag;
        private final String markdownUrl;
        private final PrecomputedTextCompat.Params precomputedTextParams;
        private final boolean shouldAppendTrailingNewline;

        @Override // com.robinhood.android.odyssey.lib.template.LoadContentRequest
        public PrecomputedTextCompat.Params getPrecomputedTextParams() {
            return this.precomputedTextParams;
        }

        @Override // com.robinhood.android.odyssey.lib.template.LoadContentRequest
        public String getComponentTag() {
            return this.componentTag;
        }

        public final String getMarkdownUrl() {
            return this.markdownUrl;
        }

        public final boolean getShouldAppendTrailingNewline() {
            return this.shouldAppendTrailingNewline;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Markdown(PrecomputedTextCompat.Params precomputedTextParams, String componentTag, String markdownUrl, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(precomputedTextParams, "precomputedTextParams");
            Intrinsics.checkNotNullParameter(componentTag, "componentTag");
            Intrinsics.checkNotNullParameter(markdownUrl, "markdownUrl");
            this.precomputedTextParams = precomputedTextParams;
            this.componentTag = componentTag;
            this.markdownUrl = markdownUrl;
            this.shouldAppendTrailingNewline = z;
        }
    }
}
