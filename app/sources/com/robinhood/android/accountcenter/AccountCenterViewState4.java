package com.robinhood.android.accountcenter;

import android.graphics.Bitmap;
import com.robinhood.udf.UiEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;", "", "<init>", "()V", "Updating", "Success", "FailedMediaUpload", "FailedProfileUpdate", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus$FailedMediaUpload;", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus$FailedProfileUpdate;", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus$Success;", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus$Updating;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.UpdateProfilePictureStatus, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AccountCenterViewState4 {
    public static final int $stable = 0;

    public /* synthetic */ AccountCenterViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AccountCenterViewState4() {
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus$Updating;", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.UpdateProfilePictureStatus$Updating */
    public static final /* data */ class Updating extends AccountCenterViewState4 {
        public static final int $stable = 0;
        public static final Updating INSTANCE = new Updating();

        public boolean equals(Object other) {
            return this == other || (other instanceof Updating);
        }

        public int hashCode() {
            return 1736033444;
        }

        public String toString() {
            return "Updating";
        }

        private Updating() {
            super(null);
        }
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus$Success;", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;", "event", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.UpdateProfilePictureStatus$Success */
    public static final class Success extends AccountCenterViewState4 {
        public static final int $stable = 8;
        private final UiEvent<Unit> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UiEvent<Unit> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final UiEvent<Unit> getEvent() {
            return this.event;
        }
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus$FailedMediaUpload;", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;", "bitmap", "Landroid/graphics/Bitmap;", "event", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Landroid/graphics/Bitmap;Lcom/robinhood/udf/UiEvent;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.UpdateProfilePictureStatus$FailedMediaUpload */
    public static final class FailedMediaUpload extends AccountCenterViewState4 {
        public static final int $stable = 8;
        private final Bitmap bitmap;
        private final UiEvent<Throwable> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedMediaUpload(Bitmap bitmap, UiEvent<Throwable> event) {
            super(null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(event, "event");
            this.bitmap = bitmap;
            this.event = event;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final UiEvent<Throwable> getEvent() {
            return this.event;
        }
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus$FailedProfileUpdate;", "Lcom/robinhood/android/accountcenter/UpdateProfilePictureStatus;", "mediaId", "Ljava/util/UUID;", "event", "Lcom/robinhood/udf/UiEvent;", "", "profilePictureLocal", "Landroid/graphics/Bitmap;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/udf/UiEvent;Landroid/graphics/Bitmap;)V", "getMediaId", "()Ljava/util/UUID;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "getProfilePictureLocal", "()Landroid/graphics/Bitmap;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.UpdateProfilePictureStatus$FailedProfileUpdate */
    public static final class FailedProfileUpdate extends AccountCenterViewState4 {
        public static final int $stable = 8;
        private final UiEvent<Throwable> event;
        private final UUID mediaId;
        private final Bitmap profilePictureLocal;

        public final UiEvent<Throwable> getEvent() {
            return this.event;
        }

        public final UUID getMediaId() {
            return this.mediaId;
        }

        public final Bitmap getProfilePictureLocal() {
            return this.profilePictureLocal;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedProfileUpdate(UUID mediaId, UiEvent<Throwable> event, Bitmap bitmap) {
            super(null);
            Intrinsics.checkNotNullParameter(mediaId, "mediaId");
            Intrinsics.checkNotNullParameter(event, "event");
            this.mediaId = mediaId;
            this.event = event;
            this.profilePictureLocal = bitmap;
        }
    }
}
