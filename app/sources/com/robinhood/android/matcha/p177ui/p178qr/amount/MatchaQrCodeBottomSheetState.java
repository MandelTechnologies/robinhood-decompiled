package com.robinhood.android.matcha.p177ui.p178qr.amount;

import android.graphics.Bitmap;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/qr/amount/MatchaQrCodeBottomSheetState;", "", "user", "Lcom/robinhood/models/db/sheriff/User;", "qrCodeBitmap", "Landroid/graphics/Bitmap;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/db/sheriff/User;Landroid/graphics/Bitmap;Lcom/robinhood/udf/UiEvent;)V", "getUser", "()Lcom/robinhood/models/db/sheriff/User;", "getQrCodeBitmap", "()Landroid/graphics/Bitmap;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaQrCodeBottomSheetState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> errorEvent;
    private final Bitmap qrCodeBitmap;
    private final User user;

    public MatchaQrCodeBottomSheetState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchaQrCodeBottomSheetState copy$default(MatchaQrCodeBottomSheetState matchaQrCodeBottomSheetState, User user, Bitmap bitmap, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            user = matchaQrCodeBottomSheetState.user;
        }
        if ((i & 2) != 0) {
            bitmap = matchaQrCodeBottomSheetState.qrCodeBitmap;
        }
        if ((i & 4) != 0) {
            uiEvent = matchaQrCodeBottomSheetState.errorEvent;
        }
        return matchaQrCodeBottomSheetState.copy(user, bitmap, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    public final UiEvent<Throwable> component3() {
        return this.errorEvent;
    }

    public final MatchaQrCodeBottomSheetState copy(User user, Bitmap qrCodeBitmap, UiEvent<Throwable> errorEvent) {
        return new MatchaQrCodeBottomSheetState(user, qrCodeBitmap, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaQrCodeBottomSheetState)) {
            return false;
        }
        MatchaQrCodeBottomSheetState matchaQrCodeBottomSheetState = (MatchaQrCodeBottomSheetState) other;
        return Intrinsics.areEqual(this.user, matchaQrCodeBottomSheetState.user) && Intrinsics.areEqual(this.qrCodeBitmap, matchaQrCodeBottomSheetState.qrCodeBitmap) && Intrinsics.areEqual(this.errorEvent, matchaQrCodeBottomSheetState.errorEvent);
    }

    public int hashCode() {
        User user = this.user;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        Bitmap bitmap = this.qrCodeBitmap;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "MatchaQrCodeBottomSheetState(user=" + this.user + ", qrCodeBitmap=" + this.qrCodeBitmap + ", errorEvent=" + this.errorEvent + ")";
    }

    public MatchaQrCodeBottomSheetState(User user, Bitmap bitmap, UiEvent<Throwable> uiEvent) {
        this.user = user;
        this.qrCodeBitmap = bitmap;
        this.errorEvent = uiEvent;
    }

    public /* synthetic */ MatchaQrCodeBottomSheetState(User user, Bitmap bitmap, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? null : uiEvent);
    }

    public final User getUser() {
        return this.user;
    }

    public final Bitmap getQrCodeBitmap() {
        return this.qrCodeBitmap;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }
}
