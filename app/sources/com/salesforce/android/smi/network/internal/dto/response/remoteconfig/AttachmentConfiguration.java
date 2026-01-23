package com.salesforce.android.smi.network.internal.dto.response.remoteconfig;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AttachmentConfiguration.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/AttachmentConfiguration;", "", "endUserToAgent", "", "<init>", "(Z)V", "getEndUserToAgent", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AttachmentConfiguration {
    private final boolean endUserToAgent;

    public AttachmentConfiguration() {
        this(false, 1, null);
    }

    public static /* synthetic */ AttachmentConfiguration copy$default(AttachmentConfiguration attachmentConfiguration, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = attachmentConfiguration.endUserToAgent;
        }
        return attachmentConfiguration.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEndUserToAgent() {
        return this.endUserToAgent;
    }

    public final AttachmentConfiguration copy(boolean endUserToAgent) {
        return new AttachmentConfiguration(endUserToAgent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AttachmentConfiguration) && this.endUserToAgent == ((AttachmentConfiguration) other).endUserToAgent;
    }

    public int hashCode() {
        return Boolean.hashCode(this.endUserToAgent);
    }

    public String toString() {
        return "AttachmentConfiguration(endUserToAgent=" + this.endUserToAgent + ")";
    }

    public AttachmentConfiguration(boolean z) {
        this.endUserToAgent = z;
    }

    public /* synthetic */ AttachmentConfiguration(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean getEndUserToAgent() {
        return this.endUserToAgent;
    }
}
