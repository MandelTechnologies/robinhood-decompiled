package com.robinhood.android.iav.p154ui.update;

import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidEvent;", "", "<init>", "()V", "LaunchSdk", "PostTransfer", "Error", "Lcom/robinhood/android/iav/ui/update/PlaidEvent$Error;", "Lcom/robinhood/android/iav/ui/update/PlaidEvent$LaunchSdk;", "Lcom/robinhood/android/iav/ui/update/PlaidEvent$PostTransfer;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class PlaidEvent {
    public static final int $stable = 0;

    public /* synthetic */ PlaidEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PlaidEvent() {
    }

    /* compiled from: PlaidEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidEvent$LaunchSdk;", "Lcom/robinhood/android/iav/ui/update/PlaidEvent;", "token", "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchSdk extends PlaidEvent {
        public static final int $stable = 0;
        private final String token;

        public static /* synthetic */ LaunchSdk copy$default(LaunchSdk launchSdk, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = launchSdk.token;
            }
            return launchSdk.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final LaunchSdk copy(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return new LaunchSdk(token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchSdk) && Intrinsics.areEqual(this.token, ((LaunchSdk) other).token);
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        public String toString() {
            return "LaunchSdk(token=" + this.token + ")";
        }

        public final String getToken() {
            return this.token;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchSdk(String token) {
            super(null);
            Intrinsics.checkNotNullParameter(token, "token");
            this.token = token;
        }
    }

    /* compiled from: PlaidEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidEvent$PostTransfer;", "Lcom/robinhood/android/iav/ui/update/PlaidEvent;", "postTransferPages", "", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage;", "<init>", "(Ljava/util/List;)V", "getPostTransferPages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PostTransfer extends PlaidEvent {
        public static final int $stable = 8;
        private final List<ApiPostTransferPage> postTransferPages;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PostTransfer copy$default(PostTransfer postTransfer, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = postTransfer.postTransferPages;
            }
            return postTransfer.copy(list);
        }

        public final List<ApiPostTransferPage> component1() {
            return this.postTransferPages;
        }

        public final PostTransfer copy(List<? extends ApiPostTransferPage> postTransferPages) {
            Intrinsics.checkNotNullParameter(postTransferPages, "postTransferPages");
            return new PostTransfer(postTransferPages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostTransfer) && Intrinsics.areEqual(this.postTransferPages, ((PostTransfer) other).postTransferPages);
        }

        public int hashCode() {
            return this.postTransferPages.hashCode();
        }

        public String toString() {
            return "PostTransfer(postTransferPages=" + this.postTransferPages + ")";
        }

        public final List<ApiPostTransferPage> getPostTransferPages() {
            return this.postTransferPages;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PostTransfer(List<? extends ApiPostTransferPage> postTransferPages) {
            super(null);
            Intrinsics.checkNotNullParameter(postTransferPages, "postTransferPages");
            this.postTransferPages = postTransferPages;
        }
    }

    /* compiled from: PlaidEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidEvent$Error;", "Lcom/robinhood/android/iav/ui/update/PlaidEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends PlaidEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
