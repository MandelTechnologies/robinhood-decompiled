package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferDisclosure.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;", "", "Markdown", "MarkdownWithResource", "Resource", "ResourceWithLink", "Sdui", "Action", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Markdown;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$MarkdownWithResource;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Resource;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$ResourceWithLink;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Sdui;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface CreateTransferDisclosure {

    /* compiled from: CreateTransferDisclosure.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Markdown;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;", "rawMarkdown", "", "<init>", "(Ljava/lang/String;)V", "getRawMarkdown", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Markdown implements CreateTransferDisclosure {
        public static final int $stable = 0;
        private final String rawMarkdown;

        public static /* synthetic */ Markdown copy$default(Markdown markdown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = markdown.rawMarkdown;
            }
            return markdown.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRawMarkdown() {
            return this.rawMarkdown;
        }

        public final Markdown copy(String rawMarkdown) {
            Intrinsics.checkNotNullParameter(rawMarkdown, "rawMarkdown");
            return new Markdown(rawMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Markdown) && Intrinsics.areEqual(this.rawMarkdown, ((Markdown) other).rawMarkdown);
        }

        public int hashCode() {
            return this.rawMarkdown.hashCode();
        }

        public String toString() {
            return "Markdown(rawMarkdown=" + this.rawMarkdown + ")";
        }

        public Markdown(String rawMarkdown) {
            Intrinsics.checkNotNullParameter(rawMarkdown, "rawMarkdown");
            this.rawMarkdown = rawMarkdown;
        }

        public final String getRawMarkdown() {
            return this.rawMarkdown;
        }
    }

    /* compiled from: CreateTransferDisclosure.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$MarkdownWithResource;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;", "stringResource", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getStringResource", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarkdownWithResource implements CreateTransferDisclosure {
        public static final int $stable = StringResource.$stable;
        private final StringResource stringResource;

        public static /* synthetic */ MarkdownWithResource copy$default(MarkdownWithResource markdownWithResource, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = markdownWithResource.stringResource;
            }
            return markdownWithResource.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getStringResource() {
            return this.stringResource;
        }

        public final MarkdownWithResource copy(StringResource stringResource) {
            Intrinsics.checkNotNullParameter(stringResource, "stringResource");
            return new MarkdownWithResource(stringResource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarkdownWithResource) && Intrinsics.areEqual(this.stringResource, ((MarkdownWithResource) other).stringResource);
        }

        public int hashCode() {
            return this.stringResource.hashCode();
        }

        public String toString() {
            return "MarkdownWithResource(stringResource=" + this.stringResource + ")";
        }

        public MarkdownWithResource(StringResource stringResource) {
            Intrinsics.checkNotNullParameter(stringResource, "stringResource");
            this.stringResource = stringResource;
        }

        public final StringResource getStringResource() {
            return this.stringResource;
        }
    }

    /* compiled from: CreateTransferDisclosure.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Resource;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;", "stringResource", "Lcom/robinhood/utils/resource/StringResource;", "action", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action;)V", "getStringResource", "()Lcom/robinhood/utils/resource/StringResource;", "getAction", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Resource implements CreateTransferDisclosure {
        public static final int $stable = StringResource.$stable;
        private final Action action;
        private final StringResource stringResource;

        public static /* synthetic */ Resource copy$default(Resource resource, StringResource stringResource, Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = resource.stringResource;
            }
            if ((i & 2) != 0) {
                action = resource.action;
            }
            return resource.copy(stringResource, action);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getStringResource() {
            return this.stringResource;
        }

        /* renamed from: component2, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public final Resource copy(StringResource stringResource, Action action) {
            Intrinsics.checkNotNullParameter(stringResource, "stringResource");
            return new Resource(stringResource, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) other;
            return Intrinsics.areEqual(this.stringResource, resource.stringResource) && Intrinsics.areEqual(this.action, resource.action);
        }

        public int hashCode() {
            int iHashCode = this.stringResource.hashCode() * 31;
            Action action = this.action;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        public String toString() {
            return "Resource(stringResource=" + this.stringResource + ", action=" + this.action + ")";
        }

        public Resource(StringResource stringResource, Action action) {
            Intrinsics.checkNotNullParameter(stringResource, "stringResource");
            this.stringResource = stringResource;
            this.action = action;
        }

        public /* synthetic */ Resource(StringResource stringResource, Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, (i & 2) != 0 ? null : action);
        }

        public final StringResource getStringResource() {
            return this.stringResource;
        }

        public final Action getAction() {
            return this.action;
        }
    }

    /* compiled from: CreateTransferDisclosure.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$ResourceWithLink;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;", "stringResource", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getStringResource", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ResourceWithLink implements CreateTransferDisclosure {
        public static final int $stable = StringResource.$stable;
        private final StringResource stringResource;

        public static /* synthetic */ ResourceWithLink copy$default(ResourceWithLink resourceWithLink, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = resourceWithLink.stringResource;
            }
            return resourceWithLink.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getStringResource() {
            return this.stringResource;
        }

        public final ResourceWithLink copy(StringResource stringResource) {
            Intrinsics.checkNotNullParameter(stringResource, "stringResource");
            return new ResourceWithLink(stringResource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResourceWithLink) && Intrinsics.areEqual(this.stringResource, ((ResourceWithLink) other).stringResource);
        }

        public int hashCode() {
            return this.stringResource.hashCode();
        }

        public String toString() {
            return "ResourceWithLink(stringResource=" + this.stringResource + ")";
        }

        public ResourceWithLink(StringResource stringResource) {
            Intrinsics.checkNotNullParameter(stringResource, "stringResource");
            this.stringResource = stringResource;
        }

        public final StringResource getStringResource() {
            return this.stringResource;
        }
    }

    /* compiled from: CreateTransferDisclosure.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Sdui;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;", "components", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/util/List;)V", "getComponents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sdui implements CreateTransferDisclosure {
        public static final int $stable = 8;
        private final List<UIComponent<GenericAction>> components;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sdui copy$default(Sdui sdui, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = sdui.components;
            }
            return sdui.copy(list);
        }

        public final List<UIComponent<GenericAction>> component1() {
            return this.components;
        }

        public final Sdui copy(List<? extends UIComponent<? extends GenericAction>> components) {
            Intrinsics.checkNotNullParameter(components, "components");
            return new Sdui(components);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sdui) && Intrinsics.areEqual(this.components, ((Sdui) other).components);
        }

        public int hashCode() {
            return this.components.hashCode();
        }

        public String toString() {
            return "Sdui(components=" + this.components + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sdui(List<? extends UIComponent<? extends GenericAction>> components) {
            Intrinsics.checkNotNullParameter(components, "components");
            this.components = components;
        }

        public final List<UIComponent<GenericAction>> getComponents() {
            return this.components;
        }
    }

    /* compiled from: CreateTransferDisclosure.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action;", "", "IraDistributionTaxWithholdingBottomSheet", "LimitsHubDetails", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action$IraDistributionTaxWithholdingBottomSheet;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action$LimitsHubDetails;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Action {

        /* compiled from: CreateTransferDisclosure.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action$IraDistributionTaxWithholdingBottomSheet;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action;", "withholding", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "<init>", "(Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;)V", "getWithholding", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IraDistributionTaxWithholdingBottomSheet implements Action {
            public static final int $stable = 8;
            private final ApiIraDistributionTaxWithholding withholding;

            public static /* synthetic */ IraDistributionTaxWithholdingBottomSheet copy$default(IraDistributionTaxWithholdingBottomSheet iraDistributionTaxWithholdingBottomSheet, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiIraDistributionTaxWithholding = iraDistributionTaxWithholdingBottomSheet.withholding;
                }
                return iraDistributionTaxWithholdingBottomSheet.copy(apiIraDistributionTaxWithholding);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiIraDistributionTaxWithholding getWithholding() {
                return this.withholding;
            }

            public final IraDistributionTaxWithholdingBottomSheet copy(ApiIraDistributionTaxWithholding withholding) {
                Intrinsics.checkNotNullParameter(withholding, "withholding");
                return new IraDistributionTaxWithholdingBottomSheet(withholding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IraDistributionTaxWithholdingBottomSheet) && Intrinsics.areEqual(this.withholding, ((IraDistributionTaxWithholdingBottomSheet) other).withholding);
            }

            public int hashCode() {
                return this.withholding.hashCode();
            }

            public String toString() {
                return "IraDistributionTaxWithholdingBottomSheet(withholding=" + this.withholding + ")";
            }

            public IraDistributionTaxWithholdingBottomSheet(ApiIraDistributionTaxWithholding withholding) {
                Intrinsics.checkNotNullParameter(withholding, "withholding");
                this.withholding = withholding;
            }

            public final ApiIraDistributionTaxWithholding getWithholding() {
                return this.withholding;
            }
        }

        /* compiled from: CreateTransferDisclosure.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action$LimitsHubDetails;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class LimitsHubDetails implements Action {
            public static final int $stable = 0;
            public static final LimitsHubDetails INSTANCE = new LimitsHubDetails();

            private LimitsHubDetails() {
            }
        }
    }
}
