package com.salesforce.android.smi.network.data.domain.prechat;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreChatLabels.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;", "", "display", "", "<init>", "(Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PreChatLabels {
    private final String display;

    /* JADX WARN: Multi-variable type inference failed */
    public PreChatLabels() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PreChatLabels copy$default(PreChatLabels preChatLabels, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preChatLabels.display;
        }
        return preChatLabels.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    public final PreChatLabels copy(String display) {
        Intrinsics.checkNotNullParameter(display, "display");
        return new PreChatLabels(display);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreChatLabels) && Intrinsics.areEqual(this.display, ((PreChatLabels) other).display);
    }

    public int hashCode() {
        return this.display.hashCode();
    }

    public String toString() {
        return "PreChatLabels(display=" + this.display + ")";
    }

    public PreChatLabels(String display) {
        Intrinsics.checkNotNullParameter(display, "display");
        this.display = display;
    }

    public /* synthetic */ PreChatLabels(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getDisplay() {
        return this.display;
    }
}
