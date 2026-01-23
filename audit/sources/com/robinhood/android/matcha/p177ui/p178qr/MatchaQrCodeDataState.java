package com.robinhood.android.matcha.p177ui.p178qr;

import android.graphics.Bitmap;
import com.robinhood.models.api.identi.OptOutConsentType;
import com.robinhood.models.p320db.matcha.EncryptedUserId;
import com.robinhood.models.p320db.sheriff.User;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDataState;", "", "user", "Lcom/robinhood/models/db/sheriff/User;", "encryptedUserId", "Lcom/robinhood/models/db/matcha/EncryptedUserId;", "qrCodeBitmap", "Landroid/graphics/Bitmap;", "discoverability", "", "Lcom/robinhood/models/api/identi/OptOutConsentType;", "", "<init>", "(Lcom/robinhood/models/db/sheriff/User;Lcom/robinhood/models/db/matcha/EncryptedUserId;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "getUser", "()Lcom/robinhood/models/db/sheriff/User;", "getEncryptedUserId", "()Lcom/robinhood/models/db/matcha/EncryptedUserId;", "getQrCodeBitmap", "()Landroid/graphics/Bitmap;", "getDiscoverability", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaQrCodeDataState {
    public static final int $stable = 8;
    private final Map<OptOutConsentType, Boolean> discoverability;
    private final EncryptedUserId encryptedUserId;
    private final Bitmap qrCodeBitmap;
    private final User user;

    public MatchaQrCodeDataState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchaQrCodeDataState copy$default(MatchaQrCodeDataState matchaQrCodeDataState, User user, EncryptedUserId encryptedUserId, Bitmap bitmap, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            user = matchaQrCodeDataState.user;
        }
        if ((i & 2) != 0) {
            encryptedUserId = matchaQrCodeDataState.encryptedUserId;
        }
        if ((i & 4) != 0) {
            bitmap = matchaQrCodeDataState.qrCodeBitmap;
        }
        if ((i & 8) != 0) {
            map = matchaQrCodeDataState.discoverability;
        }
        return matchaQrCodeDataState.copy(user, encryptedUserId, bitmap, map);
    }

    /* renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final EncryptedUserId getEncryptedUserId() {
        return this.encryptedUserId;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    public final Map<OptOutConsentType, Boolean> component4() {
        return this.discoverability;
    }

    public final MatchaQrCodeDataState copy(User user, EncryptedUserId encryptedUserId, Bitmap qrCodeBitmap, Map<OptOutConsentType, Boolean> discoverability) {
        Intrinsics.checkNotNullParameter(discoverability, "discoverability");
        return new MatchaQrCodeDataState(user, encryptedUserId, qrCodeBitmap, discoverability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaQrCodeDataState)) {
            return false;
        }
        MatchaQrCodeDataState matchaQrCodeDataState = (MatchaQrCodeDataState) other;
        return Intrinsics.areEqual(this.user, matchaQrCodeDataState.user) && Intrinsics.areEqual(this.encryptedUserId, matchaQrCodeDataState.encryptedUserId) && Intrinsics.areEqual(this.qrCodeBitmap, matchaQrCodeDataState.qrCodeBitmap) && Intrinsics.areEqual(this.discoverability, matchaQrCodeDataState.discoverability);
    }

    public int hashCode() {
        User user = this.user;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        EncryptedUserId encryptedUserId = this.encryptedUserId;
        int iHashCode2 = (iHashCode + (encryptedUserId == null ? 0 : encryptedUserId.hashCode())) * 31;
        Bitmap bitmap = this.qrCodeBitmap;
        return ((iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + this.discoverability.hashCode();
    }

    public String toString() {
        return "MatchaQrCodeDataState(user=" + this.user + ", encryptedUserId=" + this.encryptedUserId + ", qrCodeBitmap=" + this.qrCodeBitmap + ", discoverability=" + this.discoverability + ")";
    }

    public MatchaQrCodeDataState(User user, EncryptedUserId encryptedUserId, Bitmap bitmap, Map<OptOutConsentType, Boolean> discoverability) {
        Intrinsics.checkNotNullParameter(discoverability, "discoverability");
        this.user = user;
        this.encryptedUserId = encryptedUserId;
        this.qrCodeBitmap = bitmap;
        this.discoverability = discoverability;
    }

    public final User getUser() {
        return this.user;
    }

    public final EncryptedUserId getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public final Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    public /* synthetic */ MatchaQrCodeDataState(User user, EncryptedUserId encryptedUserId, Bitmap bitmap, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? null : encryptedUserId, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<OptOutConsentType, Boolean> getDiscoverability() {
        return this.discoverability;
    }
}
