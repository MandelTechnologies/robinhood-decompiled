package com.robinhood.android.matcha.p177ui.p178qr;

import android.graphics.Bitmap;
import com.robinhood.models.p320db.sheriff.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeViewState;", "", "user", "Lcom/robinhood/models/db/sheriff/User;", "qrContent", "", "qrCodeBitmap", "Landroid/graphics/Bitmap;", "isDiscoverabilityEnabled", "", "<init>", "(Lcom/robinhood/models/db/sheriff/User;Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "getUser", "()Lcom/robinhood/models/db/sheriff/User;", "getQrContent", "()Ljava/lang/String;", "getQrCodeBitmap", "()Landroid/graphics/Bitmap;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaQrCodeViewState {
    public static final int $stable = 8;
    private final boolean isDiscoverabilityEnabled;
    private final Bitmap qrCodeBitmap;
    private final String qrContent;
    private final User user;

    public static /* synthetic */ MatchaQrCodeViewState copy$default(MatchaQrCodeViewState matchaQrCodeViewState, User user, String str, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            user = matchaQrCodeViewState.user;
        }
        if ((i & 2) != 0) {
            str = matchaQrCodeViewState.qrContent;
        }
        if ((i & 4) != 0) {
            bitmap = matchaQrCodeViewState.qrCodeBitmap;
        }
        if ((i & 8) != 0) {
            z = matchaQrCodeViewState.isDiscoverabilityEnabled;
        }
        return matchaQrCodeViewState.copy(user, str, bitmap, z);
    }

    /* renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQrContent() {
        return this.qrContent;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDiscoverabilityEnabled() {
        return this.isDiscoverabilityEnabled;
    }

    public final MatchaQrCodeViewState copy(User user, String qrContent, Bitmap qrCodeBitmap, boolean isDiscoverabilityEnabled) {
        return new MatchaQrCodeViewState(user, qrContent, qrCodeBitmap, isDiscoverabilityEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaQrCodeViewState)) {
            return false;
        }
        MatchaQrCodeViewState matchaQrCodeViewState = (MatchaQrCodeViewState) other;
        return Intrinsics.areEqual(this.user, matchaQrCodeViewState.user) && Intrinsics.areEqual(this.qrContent, matchaQrCodeViewState.qrContent) && Intrinsics.areEqual(this.qrCodeBitmap, matchaQrCodeViewState.qrCodeBitmap) && this.isDiscoverabilityEnabled == matchaQrCodeViewState.isDiscoverabilityEnabled;
    }

    public int hashCode() {
        User user = this.user;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.qrContent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.qrCodeBitmap;
        return ((iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDiscoverabilityEnabled);
    }

    public String toString() {
        return "MatchaQrCodeViewState(user=" + this.user + ", qrContent=" + this.qrContent + ", qrCodeBitmap=" + this.qrCodeBitmap + ", isDiscoverabilityEnabled=" + this.isDiscoverabilityEnabled + ")";
    }

    public MatchaQrCodeViewState(User user, String str, Bitmap bitmap, boolean z) {
        this.user = user;
        this.qrContent = str;
        this.qrCodeBitmap = bitmap;
        this.isDiscoverabilityEnabled = z;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getQrContent() {
        return this.qrContent;
    }

    public final Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    public final boolean isDiscoverabilityEnabled() {
        return this.isDiscoverabilityEnabled;
    }
}
