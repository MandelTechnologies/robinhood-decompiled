package com.robinhood.android.lib.pathfinder;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.robinhood.models.p355ui.pathfinder.UserViewToast;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStateResultContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: InternalPathfinderEvent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "", "UriDeepLinkEvent", "ExternalUrlEvent", "MailTo", "ShowFileChooserEvent", "StopLoading", "ExitAppLinkEvent", "NewInquiry", "ClosePathfinder", "UserViewStateResult", "UserViewStateShowToast", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$ClosePathfinder;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$ExitAppLinkEvent;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$ExternalUrlEvent;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$MailTo;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$NewInquiry;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$ShowFileChooserEvent;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$StopLoading;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$UriDeepLinkEvent;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$UserViewStateResult;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$UserViewStateShowToast;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface InternalPathfinderEvent {

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$UriDeepLinkEvent;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UriDeepLinkEvent implements InternalPathfinderEvent {
        public static final int $stable = 8;
        private final Uri uri;

        public static /* synthetic */ UriDeepLinkEvent copy$default(UriDeepLinkEvent uriDeepLinkEvent, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = uriDeepLinkEvent.uri;
            }
            return uriDeepLinkEvent.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final UriDeepLinkEvent copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new UriDeepLinkEvent(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UriDeepLinkEvent) && Intrinsics.areEqual(this.uri, ((UriDeepLinkEvent) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "UriDeepLinkEvent(uri=" + this.uri + ")";
        }

        public UriDeepLinkEvent(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$ExternalUrlEvent;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "url", "Lokhttp3/HttpUrl;", "<init>", "(Lokhttp3/HttpUrl;)V", "getUrl", "()Lokhttp3/HttpUrl;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExternalUrlEvent implements InternalPathfinderEvent {
        public static final int $stable = 8;
        private final HttpUrl url;

        public static /* synthetic */ ExternalUrlEvent copy$default(ExternalUrlEvent externalUrlEvent, HttpUrl httpUrl, int i, Object obj) {
            if ((i & 1) != 0) {
                httpUrl = externalUrlEvent.url;
            }
            return externalUrlEvent.copy(httpUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public final ExternalUrlEvent copy(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new ExternalUrlEvent(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExternalUrlEvent) && Intrinsics.areEqual(this.url, ((ExternalUrlEvent) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "ExternalUrlEvent(url=" + this.url + ")";
        }

        public ExternalUrlEvent(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final HttpUrl getUrl() {
            return this.url;
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$MailTo;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MailTo implements InternalPathfinderEvent {
        public static final int $stable = 8;
        private final Uri uri;

        public static /* synthetic */ MailTo copy$default(MailTo mailTo, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = mailTo.uri;
            }
            return mailTo.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final MailTo copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new MailTo(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MailTo) && Intrinsics.areEqual(this.uri, ((MailTo) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "MailTo(uri=" + this.uri + ")";
        }

        public MailTo(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$ShowFileChooserEvent;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "<init>", "(Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)V", "getFilePathCallback", "()Landroid/webkit/ValueCallback;", "getFileChooserParams", "()Landroid/webkit/WebChromeClient$FileChooserParams;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFileChooserEvent implements InternalPathfinderEvent {
        public static final int $stable = 8;
        private final WebChromeClient.FileChooserParams fileChooserParams;
        private final ValueCallback<Uri[]> filePathCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowFileChooserEvent copy$default(ShowFileChooserEvent showFileChooserEvent, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, int i, Object obj) {
            if ((i & 1) != 0) {
                valueCallback = showFileChooserEvent.filePathCallback;
            }
            if ((i & 2) != 0) {
                fileChooserParams = showFileChooserEvent.fileChooserParams;
            }
            return showFileChooserEvent.copy(valueCallback, fileChooserParams);
        }

        public final ValueCallback<Uri[]> component1() {
            return this.filePathCallback;
        }

        /* renamed from: component2, reason: from getter */
        public final WebChromeClient.FileChooserParams getFileChooserParams() {
            return this.fileChooserParams;
        }

        public final ShowFileChooserEvent copy(ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
            Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
            return new ShowFileChooserEvent(filePathCallback, fileChooserParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowFileChooserEvent)) {
                return false;
            }
            ShowFileChooserEvent showFileChooserEvent = (ShowFileChooserEvent) other;
            return Intrinsics.areEqual(this.filePathCallback, showFileChooserEvent.filePathCallback) && Intrinsics.areEqual(this.fileChooserParams, showFileChooserEvent.fileChooserParams);
        }

        public int hashCode() {
            return (this.filePathCallback.hashCode() * 31) + this.fileChooserParams.hashCode();
        }

        public String toString() {
            return "ShowFileChooserEvent(filePathCallback=" + this.filePathCallback + ", fileChooserParams=" + this.fileChooserParams + ")";
        }

        public ShowFileChooserEvent(ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
            Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
            this.filePathCallback = filePathCallback;
            this.fileChooserParams = fileChooserParams;
        }

        public final ValueCallback<Uri[]> getFilePathCallback() {
            return this.filePathCallback;
        }

        public final WebChromeClient.FileChooserParams getFileChooserParams() {
            return this.fileChooserParams;
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$StopLoading;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StopLoading implements InternalPathfinderEvent {
        public static final int $stable = 0;
        public static final StopLoading INSTANCE = new StopLoading();

        private StopLoading() {
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$ExitAppLinkEvent;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "url", "Landroid/net/Uri;", "shouldManuallyDismiss", "", "<init>", "(Landroid/net/Uri;Z)V", "getUrl", "()Landroid/net/Uri;", "getShouldManuallyDismiss", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExitAppLinkEvent implements InternalPathfinderEvent {
        public static final int $stable = 8;
        private final boolean shouldManuallyDismiss;
        private final Uri url;

        public static /* synthetic */ ExitAppLinkEvent copy$default(ExitAppLinkEvent exitAppLinkEvent, Uri uri, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = exitAppLinkEvent.url;
            }
            if ((i & 2) != 0) {
                z = exitAppLinkEvent.shouldManuallyDismiss;
            }
            return exitAppLinkEvent.copy(uri, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldManuallyDismiss() {
            return this.shouldManuallyDismiss;
        }

        public final ExitAppLinkEvent copy(Uri url, boolean shouldManuallyDismiss) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new ExitAppLinkEvent(url, shouldManuallyDismiss);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExitAppLinkEvent)) {
                return false;
            }
            ExitAppLinkEvent exitAppLinkEvent = (ExitAppLinkEvent) other;
            return Intrinsics.areEqual(this.url, exitAppLinkEvent.url) && this.shouldManuallyDismiss == exitAppLinkEvent.shouldManuallyDismiss;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + Boolean.hashCode(this.shouldManuallyDismiss);
        }

        public String toString() {
            return "ExitAppLinkEvent(url=" + this.url + ", shouldManuallyDismiss=" + this.shouldManuallyDismiss + ")";
        }

        public ExitAppLinkEvent(Uri url, boolean z) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.shouldManuallyDismiss = z;
        }

        public final boolean getShouldManuallyDismiss() {
            return this.shouldManuallyDismiss;
        }

        public final Uri getUrl() {
            return this.url;
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$NewInquiry;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "inquiryId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInquiryId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NewInquiry implements InternalPathfinderEvent {
        public static final int $stable = 8;
        private final UUID inquiryId;

        public static /* synthetic */ NewInquiry copy$default(NewInquiry newInquiry, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = newInquiry.inquiryId;
            }
            return newInquiry.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final NewInquiry copy(UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return new NewInquiry(inquiryId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewInquiry) && Intrinsics.areEqual(this.inquiryId, ((NewInquiry) other).inquiryId);
        }

        public int hashCode() {
            return this.inquiryId.hashCode();
        }

        public String toString() {
            return "NewInquiry(inquiryId=" + this.inquiryId + ")";
        }

        public NewInquiry(UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$ClosePathfinder;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ClosePathfinder implements InternalPathfinderEvent {
        public static final int $stable = 0;
        public static final ClosePathfinder INSTANCE = new ClosePathfinder();

        private ClosePathfinder() {
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$UserViewStateResult;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "result", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStateResultContext;", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStateResultContext;)V", "getResult", "()Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStateResultContext;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UserViewStateResult implements InternalPathfinderEvent {
        public static final int $stable = 8;
        private final UserViewStateResultContext result;

        public static /* synthetic */ UserViewStateResult copy$default(UserViewStateResult userViewStateResult, UserViewStateResultContext userViewStateResultContext, int i, Object obj) {
            if ((i & 1) != 0) {
                userViewStateResultContext = userViewStateResult.result;
            }
            return userViewStateResult.copy(userViewStateResultContext);
        }

        /* renamed from: component1, reason: from getter */
        public final UserViewStateResultContext getResult() {
            return this.result;
        }

        public final UserViewStateResult copy(UserViewStateResultContext result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new UserViewStateResult(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserViewStateResult) && Intrinsics.areEqual(this.result, ((UserViewStateResult) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "UserViewStateResult(result=" + this.result + ")";
        }

        public UserViewStateResult(UserViewStateResultContext result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final UserViewStateResultContext getResult() {
            return this.result;
        }
    }

    /* compiled from: InternalPathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent$UserViewStateShowToast;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "toast", "Lcom/robinhood/models/ui/pathfinder/UserViewToast;", "<init>", "(Lcom/robinhood/models/ui/pathfinder/UserViewToast;)V", "getToast", "()Lcom/robinhood/models/ui/pathfinder/UserViewToast;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UserViewStateShowToast implements InternalPathfinderEvent {
        public static final int $stable = 8;
        private final UserViewToast toast;

        public static /* synthetic */ UserViewStateShowToast copy$default(UserViewStateShowToast userViewStateShowToast, UserViewToast userViewToast, int i, Object obj) {
            if ((i & 1) != 0) {
                userViewToast = userViewStateShowToast.toast;
            }
            return userViewStateShowToast.copy(userViewToast);
        }

        /* renamed from: component1, reason: from getter */
        public final UserViewToast getToast() {
            return this.toast;
        }

        public final UserViewStateShowToast copy(UserViewToast toast) {
            Intrinsics.checkNotNullParameter(toast, "toast");
            return new UserViewStateShowToast(toast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserViewStateShowToast) && Intrinsics.areEqual(this.toast, ((UserViewStateShowToast) other).toast);
        }

        public int hashCode() {
            return this.toast.hashCode();
        }

        public String toString() {
            return "UserViewStateShowToast(toast=" + this.toast + ")";
        }

        public UserViewStateShowToast(UserViewToast toast) {
            Intrinsics.checkNotNullParameter(toast, "toast");
            this.toast = toast;
        }

        public final UserViewToast getToast() {
            return this.toast;
        }
    }
}
