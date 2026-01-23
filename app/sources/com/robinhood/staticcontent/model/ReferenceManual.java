package com.robinhood.staticcontent.model;

import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.model.RichNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferenceManual.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/staticcontent/model/ReferenceManual;", "", "title", "", "identifier", "sections", "", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/ReferenceManual$Section;", "minimumDisplayVersion", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getTitle", "()Ljava/lang/String;", "getIdentifier", "getSections", "()Ljava/util/List;", "getMinimumDisplayVersion", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Section", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ReferenceManual {
    private final String identifier;
    private final int minimumDisplayVersion;
    private final List<ResourceLink<EntryResource<Section>>> sections;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferenceManual copy$default(ReferenceManual referenceManual, String str, String str2, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = referenceManual.title;
        }
        if ((i2 & 2) != 0) {
            str2 = referenceManual.identifier;
        }
        if ((i2 & 4) != 0) {
            list = referenceManual.sections;
        }
        if ((i2 & 8) != 0) {
            i = referenceManual.minimumDisplayVersion;
        }
        return referenceManual.copy(str, str2, list, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<ResourceLink<EntryResource<Section>>> component3() {
        return this.sections;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinimumDisplayVersion() {
        return this.minimumDisplayVersion;
    }

    public final ReferenceManual copy(String title, String identifier, List<ResourceLink<EntryResource<Section>>> sections, int minimumDisplayVersion) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new ReferenceManual(title, identifier, sections, minimumDisplayVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferenceManual)) {
            return false;
        }
        ReferenceManual referenceManual = (ReferenceManual) other;
        return Intrinsics.areEqual(this.title, referenceManual.title) && Intrinsics.areEqual(this.identifier, referenceManual.identifier) && Intrinsics.areEqual(this.sections, referenceManual.sections) && this.minimumDisplayVersion == referenceManual.minimumDisplayVersion;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.sections.hashCode()) * 31) + Integer.hashCode(this.minimumDisplayVersion);
    }

    public String toString() {
        return "ReferenceManual(title=" + this.title + ", identifier=" + this.identifier + ", sections=" + this.sections + ", minimumDisplayVersion=" + this.minimumDisplayVersion + ")";
    }

    public ReferenceManual(String title, String identifier, List<ResourceLink<EntryResource<Section>>> sections, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.title = title;
        this.identifier = identifier;
        this.sections = sections;
        this.minimumDisplayVersion = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<ResourceLink<EntryResource<Section>>> getSections() {
        return this.sections;
    }

    public final int getMinimumDisplayVersion() {
        return this.minimumDisplayVersion;
    }

    /* compiled from: ReferenceManual.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/ReferenceManual$Section;", "", "title", "", "identifier", "displayTitle", "content", "Lcom/robinhood/contentful/model/RichNode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/model/RichNode;)V", "getTitle", "()Ljava/lang/String;", "getIdentifier", "getDisplayTitle", "getContent", "()Lcom/robinhood/contentful/model/RichNode;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Section {
        private final RichNode content;
        private final String displayTitle;
        private final String identifier;
        private final String title;

        public static /* synthetic */ Section copy$default(Section section, String str, String str2, String str3, RichNode richNode, int i, Object obj) {
            if ((i & 1) != 0) {
                str = section.title;
            }
            if ((i & 2) != 0) {
                str2 = section.identifier;
            }
            if ((i & 4) != 0) {
                str3 = section.displayTitle;
            }
            if ((i & 8) != 0) {
                richNode = section.content;
            }
            return section.copy(str, str2, str3, richNode);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final RichNode getContent() {
            return this.content;
        }

        public final Section copy(String title, String identifier, String displayTitle, RichNode content) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
            Intrinsics.checkNotNullParameter(content, "content");
            return new Section(title, identifier, displayTitle, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.identifier, section.identifier) && Intrinsics.areEqual(this.displayTitle, section.displayTitle) && Intrinsics.areEqual(this.content, section.content);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.displayTitle.hashCode()) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "Section(title=" + this.title + ", identifier=" + this.identifier + ", displayTitle=" + this.displayTitle + ", content=" + this.content + ")";
        }

        public Section(String title, String identifier, String displayTitle, RichNode content) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(displayTitle, "displayTitle");
            Intrinsics.checkNotNullParameter(content, "content");
            this.title = title;
            this.identifier = identifier;
            this.displayTitle = displayTitle;
            this.content = content;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        public final RichNode getContent() {
            return this.content;
        }
    }
}
