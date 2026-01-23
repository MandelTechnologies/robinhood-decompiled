package com.robinhood.android.rollover401k.steps.webview;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Rollover401kWebViewViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewViewState;", "", "isLoading", "", "allowedUrls", "Lkotlinx/collections/immutable/ImmutableList;", "", "hostsToOpenExternally", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "()Z", "getAllowedUrls", "()Lkotlinx/collections/immutable/ImmutableList;", "getHostsToOpenExternally", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Rollover401kWebViewViewState {
    public static final int $stable = 0;
    private final ImmutableList<String> allowedUrls;
    private final ImmutableList<String> hostsToOpenExternally;
    private final boolean isLoading;

    public Rollover401kWebViewViewState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Rollover401kWebViewViewState copy$default(Rollover401kWebViewViewState rollover401kWebViewViewState, boolean z, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rollover401kWebViewViewState.isLoading;
        }
        if ((i & 2) != 0) {
            immutableList = rollover401kWebViewViewState.allowedUrls;
        }
        if ((i & 4) != 0) {
            immutableList2 = rollover401kWebViewViewState.hostsToOpenExternally;
        }
        return rollover401kWebViewViewState.copy(z, immutableList, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ImmutableList<String> component2() {
        return this.allowedUrls;
    }

    public final ImmutableList<String> component3() {
        return this.hostsToOpenExternally;
    }

    public final Rollover401kWebViewViewState copy(boolean isLoading, ImmutableList<String> allowedUrls, ImmutableList<String> hostsToOpenExternally) {
        Intrinsics.checkNotNullParameter(allowedUrls, "allowedUrls");
        Intrinsics.checkNotNullParameter(hostsToOpenExternally, "hostsToOpenExternally");
        return new Rollover401kWebViewViewState(isLoading, allowedUrls, hostsToOpenExternally);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rollover401kWebViewViewState)) {
            return false;
        }
        Rollover401kWebViewViewState rollover401kWebViewViewState = (Rollover401kWebViewViewState) other;
        return this.isLoading == rollover401kWebViewViewState.isLoading && Intrinsics.areEqual(this.allowedUrls, rollover401kWebViewViewState.allowedUrls) && Intrinsics.areEqual(this.hostsToOpenExternally, rollover401kWebViewViewState.hostsToOpenExternally);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + this.allowedUrls.hashCode()) * 31) + this.hostsToOpenExternally.hashCode();
    }

    public String toString() {
        return "Rollover401kWebViewViewState(isLoading=" + this.isLoading + ", allowedUrls=" + this.allowedUrls + ", hostsToOpenExternally=" + this.hostsToOpenExternally + ")";
    }

    public Rollover401kWebViewViewState(boolean z, ImmutableList<String> allowedUrls, ImmutableList<String> hostsToOpenExternally) {
        Intrinsics.checkNotNullParameter(allowedUrls, "allowedUrls");
        Intrinsics.checkNotNullParameter(hostsToOpenExternally, "hostsToOpenExternally");
        this.isLoading = z;
        this.allowedUrls = allowedUrls;
        this.hostsToOpenExternally = hostsToOpenExternally;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ Rollover401kWebViewViewState(boolean z, ImmutableList immutableList, ImmutableList immutableList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? extensions2.persistentListOf() : immutableList, (i & 4) != 0 ? extensions2.persistentListOf() : immutableList2);
    }

    public final ImmutableList<String> getAllowedUrls() {
        return this.allowedUrls;
    }

    public final ImmutableList<String> getHostsToOpenExternally() {
        return this.hostsToOpenExternally;
    }
}
