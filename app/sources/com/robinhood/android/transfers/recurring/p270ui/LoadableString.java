package com.robinhood.android.transfers.recurring.p270ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadableString.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/LoadableString;", "", "isLoading", "", "text", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LoadableString {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final String text;

    public static /* synthetic */ LoadableString copy$default(LoadableString loadableString, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loadableString.isLoading;
        }
        if ((i & 2) != 0) {
            str = loadableString.text;
        }
        return loadableString.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final LoadableString copy(boolean isLoading, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new LoadableString(isLoading, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadableString)) {
            return false;
        }
        LoadableString loadableString = (LoadableString) other;
        return this.isLoading == loadableString.isLoading && Intrinsics.areEqual(this.text, loadableString.text);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "LoadableString(isLoading=" + this.isLoading + ", text=" + this.text + ")";
    }

    public LoadableString(boolean z, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.isLoading = z;
        this.text = text;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getText() {
        return this.text;
    }
}
