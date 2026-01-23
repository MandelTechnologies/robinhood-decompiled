package com.robinhood.android.common.composebottomsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhContentBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/composebottomsheet/PreviewState;", "", "title", "", "subtitle", "description", "primaryButtonText", "secondaryButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDescription", "getPrimaryButtonText", "getSecondaryButtonText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
final /* data */ class PreviewState {
    private final String description;
    private final String primaryButtonText;
    private final String secondaryButtonText;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ PreviewState copy$default(PreviewState previewState, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewState.title;
        }
        if ((i & 2) != 0) {
            str2 = previewState.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = previewState.description;
        }
        if ((i & 8) != 0) {
            str4 = previewState.primaryButtonText;
        }
        if ((i & 16) != 0) {
            str5 = previewState.secondaryButtonText;
        }
        String str6 = str5;
        String str7 = str3;
        return previewState.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final PreviewState copy(String title, String subtitle, String description, String primaryButtonText, String secondaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        return new PreviewState(title, subtitle, description, primaryButtonText, secondaryButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewState)) {
            return false;
        }
        PreviewState previewState = (PreviewState) other;
        return Intrinsics.areEqual(this.title, previewState.title) && Intrinsics.areEqual(this.subtitle, previewState.subtitle) && Intrinsics.areEqual(this.description, previewState.description) && Intrinsics.areEqual(this.primaryButtonText, previewState.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, previewState.secondaryButtonText);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31;
        String str2 = this.secondaryButtonText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PreviewState(title=" + this.title + ", subtitle=" + this.subtitle + ", description=" + this.description + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ")";
    }

    public PreviewState(String title, String str, String description, String primaryButtonText, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.title = title;
        this.subtitle = str;
        this.description = description;
        this.primaryButtonText = primaryButtonText;
        this.secondaryButtonText = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }
}
