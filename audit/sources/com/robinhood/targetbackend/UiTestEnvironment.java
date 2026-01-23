package com.robinhood.targetbackend;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiTestEnvironment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/targetbackend/UiTestEnvironment;", "", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "apolloHostHeader", "", "apolloPortHeader", "<init>", "(Lcom/robinhood/targetbackend/TargetBackend;Ljava/lang/String;Ljava/lang/String;)V", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "getApolloHostHeader", "()Ljava/lang/String;", "getApolloPortHeader", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-target-backend_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class UiTestEnvironment {
    private final String apolloHostHeader;
    private final String apolloPortHeader;
    private final TargetBackend targetBackend;

    public static /* synthetic */ UiTestEnvironment copy$default(UiTestEnvironment uiTestEnvironment, TargetBackend targetBackend, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            targetBackend = uiTestEnvironment.targetBackend;
        }
        if ((i & 2) != 0) {
            str = uiTestEnvironment.apolloHostHeader;
        }
        if ((i & 4) != 0) {
            str2 = uiTestEnvironment.apolloPortHeader;
        }
        return uiTestEnvironment.copy(targetBackend, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final TargetBackend getTargetBackend() {
        return this.targetBackend;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApolloHostHeader() {
        return this.apolloHostHeader;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApolloPortHeader() {
        return this.apolloPortHeader;
    }

    public final UiTestEnvironment copy(TargetBackend targetBackend, String apolloHostHeader, String apolloPortHeader) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        return new UiTestEnvironment(targetBackend, apolloHostHeader, apolloPortHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiTestEnvironment)) {
            return false;
        }
        UiTestEnvironment uiTestEnvironment = (UiTestEnvironment) other;
        return Intrinsics.areEqual(this.targetBackend, uiTestEnvironment.targetBackend) && Intrinsics.areEqual(this.apolloHostHeader, uiTestEnvironment.apolloHostHeader) && Intrinsics.areEqual(this.apolloPortHeader, uiTestEnvironment.apolloPortHeader);
    }

    public int hashCode() {
        int iHashCode = this.targetBackend.hashCode() * 31;
        String str = this.apolloHostHeader;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.apolloPortHeader;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UiTestEnvironment(targetBackend=" + this.targetBackend + ", apolloHostHeader=" + this.apolloHostHeader + ", apolloPortHeader=" + this.apolloPortHeader + ")";
    }

    public UiTestEnvironment(TargetBackend targetBackend, String str, String str2) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.targetBackend = targetBackend;
        this.apolloHostHeader = str;
        this.apolloPortHeader = str2;
    }

    public final TargetBackend getTargetBackend() {
        return this.targetBackend;
    }

    public final String getApolloHostHeader() {
        return this.apolloHostHeader;
    }

    public final String getApolloPortHeader() {
        return this.apolloPortHeader;
    }
}
