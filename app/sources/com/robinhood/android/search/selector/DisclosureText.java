package com.robinhood.android.search.selector;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchSelectorViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/search/selector/DisclosureText;", "", "disclosureText", "Lcom/robinhood/utils/resource/StringResource;", "disclosureBottomSheetTitle", "disclosureBottomSheetDescription", "disclosureBottomSheetTag", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getDisclosureText", "()Lcom/robinhood/utils/resource/StringResource;", "getDisclosureBottomSheetTitle", "getDisclosureBottomSheetDescription", "getDisclosureBottomSheetTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DisclosureText {
    private final StringResource disclosureBottomSheetDescription;
    private final String disclosureBottomSheetTag;
    private final StringResource disclosureBottomSheetTitle;
    private final StringResource disclosureText;

    public static /* synthetic */ DisclosureText copy$default(DisclosureText disclosureText, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = disclosureText.disclosureText;
        }
        if ((i & 2) != 0) {
            stringResource2 = disclosureText.disclosureBottomSheetTitle;
        }
        if ((i & 4) != 0) {
            stringResource3 = disclosureText.disclosureBottomSheetDescription;
        }
        if ((i & 8) != 0) {
            str = disclosureText.disclosureBottomSheetTag;
        }
        return disclosureText.copy(stringResource, stringResource2, stringResource3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getDisclosureText() {
        return this.disclosureText;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getDisclosureBottomSheetTitle() {
        return this.disclosureBottomSheetTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getDisclosureBottomSheetDescription() {
        return this.disclosureBottomSheetDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosureBottomSheetTag() {
        return this.disclosureBottomSheetTag;
    }

    public final DisclosureText copy(StringResource disclosureText, StringResource disclosureBottomSheetTitle, StringResource disclosureBottomSheetDescription, String disclosureBottomSheetTag) {
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        Intrinsics.checkNotNullParameter(disclosureBottomSheetTitle, "disclosureBottomSheetTitle");
        Intrinsics.checkNotNullParameter(disclosureBottomSheetDescription, "disclosureBottomSheetDescription");
        Intrinsics.checkNotNullParameter(disclosureBottomSheetTag, "disclosureBottomSheetTag");
        return new DisclosureText(disclosureText, disclosureBottomSheetTitle, disclosureBottomSheetDescription, disclosureBottomSheetTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureText)) {
            return false;
        }
        DisclosureText disclosureText = (DisclosureText) other;
        return Intrinsics.areEqual(this.disclosureText, disclosureText.disclosureText) && Intrinsics.areEqual(this.disclosureBottomSheetTitle, disclosureText.disclosureBottomSheetTitle) && Intrinsics.areEqual(this.disclosureBottomSheetDescription, disclosureText.disclosureBottomSheetDescription) && Intrinsics.areEqual(this.disclosureBottomSheetTag, disclosureText.disclosureBottomSheetTag);
    }

    public int hashCode() {
        return (((((this.disclosureText.hashCode() * 31) + this.disclosureBottomSheetTitle.hashCode()) * 31) + this.disclosureBottomSheetDescription.hashCode()) * 31) + this.disclosureBottomSheetTag.hashCode();
    }

    public String toString() {
        return "DisclosureText(disclosureText=" + this.disclosureText + ", disclosureBottomSheetTitle=" + this.disclosureBottomSheetTitle + ", disclosureBottomSheetDescription=" + this.disclosureBottomSheetDescription + ", disclosureBottomSheetTag=" + this.disclosureBottomSheetTag + ")";
    }

    public DisclosureText(StringResource disclosureText, StringResource disclosureBottomSheetTitle, StringResource disclosureBottomSheetDescription, String disclosureBottomSheetTag) {
        Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
        Intrinsics.checkNotNullParameter(disclosureBottomSheetTitle, "disclosureBottomSheetTitle");
        Intrinsics.checkNotNullParameter(disclosureBottomSheetDescription, "disclosureBottomSheetDescription");
        Intrinsics.checkNotNullParameter(disclosureBottomSheetTag, "disclosureBottomSheetTag");
        this.disclosureText = disclosureText;
        this.disclosureBottomSheetTitle = disclosureBottomSheetTitle;
        this.disclosureBottomSheetDescription = disclosureBottomSheetDescription;
        this.disclosureBottomSheetTag = disclosureBottomSheetTag;
    }

    public final StringResource getDisclosureText() {
        return this.disclosureText;
    }

    public final StringResource getDisclosureBottomSheetTitle() {
        return this.disclosureBottomSheetTitle;
    }

    public final StringResource getDisclosureBottomSheetDescription() {
        return this.disclosureBottomSheetDescription;
    }

    public final String getDisclosureBottomSheetTag() {
        return this.disclosureBottomSheetTag;
    }
}
