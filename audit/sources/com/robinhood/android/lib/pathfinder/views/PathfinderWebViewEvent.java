package com.robinhood.android.lib.pathfinder.views;

import android.net.Uri;
import android.os.Message;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.robinhood.models.p355ui.PathfinderStateError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: PathfinderWebViewEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "", "DisableBackNavigation", "DismissEvent", "MailToEvent", "DoneClickEvent", "ShowFileChooserEvent", "LinkEvent", "NativePathfinderWebViewEvent", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$DisableBackNavigation;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$DismissEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$DoneClickEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$MailToEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$ShowFileChooserEvent;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface PathfinderWebViewEvent {

    /* compiled from: PathfinderWebViewEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$DisableBackNavigation;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisableBackNavigation implements PathfinderWebViewEvent {
        public static final int $stable = 0;
        public static final DisableBackNavigation INSTANCE = new DisableBackNavigation();

        private DisableBackNavigation() {
        }
    }

    /* compiled from: PathfinderWebViewEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$DismissEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DismissEvent implements PathfinderWebViewEvent {
        public static final int $stable = 0;
        public static final DismissEvent INSTANCE = new DismissEvent();

        private DismissEvent() {
        }
    }

    /* compiled from: PathfinderWebViewEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$MailToEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MailToEvent implements PathfinderWebViewEvent {
        public static final int $stable = 8;
        private final Uri uri;

        public static /* synthetic */ MailToEvent copy$default(MailToEvent mailToEvent, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = mailToEvent.uri;
            }
            return mailToEvent.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final MailToEvent copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new MailToEvent(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MailToEvent) && Intrinsics.areEqual(this.uri, ((MailToEvent) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "MailToEvent(uri=" + this.uri + ")";
        }

        public MailToEvent(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: PathfinderWebViewEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$DoneClickEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DoneClickEvent implements PathfinderWebViewEvent {
        public static final int $stable = 0;
        public static final DoneClickEvent INSTANCE = new DoneClickEvent();

        private DoneClickEvent() {
        }
    }

    /* compiled from: PathfinderWebViewEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$ShowFileChooserEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "<init>", "(Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)V", "getFilePathCallback", "()Landroid/webkit/ValueCallback;", "getFileChooserParams", "()Landroid/webkit/WebChromeClient$FileChooserParams;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFileChooserEvent implements PathfinderWebViewEvent {
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

    /* compiled from: PathfinderWebViewEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "UriDeepLinkEvent", "NewWebviewEvent", "ExternalUrlEvent", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent$ExternalUrlEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent$NewWebviewEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent$UriDeepLinkEvent;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface LinkEvent extends PathfinderWebViewEvent {

        /* compiled from: PathfinderWebViewEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent$UriDeepLinkEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UriDeepLinkEvent implements LinkEvent {
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

        /* compiled from: PathfinderWebViewEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent$NewWebviewEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent;", "message", "Landroid/os/Message;", "<init>", "(Landroid/os/Message;)V", "getMessage", "()Landroid/os/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NewWebviewEvent implements LinkEvent {
            public static final int $stable = 8;
            private final Message message;

            public static /* synthetic */ NewWebviewEvent copy$default(NewWebviewEvent newWebviewEvent, Message message, int i, Object obj) {
                if ((i & 1) != 0) {
                    message = newWebviewEvent.message;
                }
                return newWebviewEvent.copy(message);
            }

            /* renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            public final NewWebviewEvent copy(Message message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new NewWebviewEvent(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NewWebviewEvent) && Intrinsics.areEqual(this.message, ((NewWebviewEvent) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "NewWebviewEvent(message=" + this.message + ")";
            }

            public NewWebviewEvent(Message message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final Message getMessage() {
                return this.message;
            }
        }

        /* compiled from: PathfinderWebViewEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent$ExternalUrlEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$LinkEvent;", "url", "Lokhttp3/HttpUrl;", "<init>", "(Lokhttp3/HttpUrl;)V", "getUrl", "()Lokhttp3/HttpUrl;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ExternalUrlEvent implements LinkEvent {
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
    }

    /* compiled from: PathfinderWebViewEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "GoBack", "SendUserInput", "UserInputError", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent$GoBack;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent$SendUserInput;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent$UserInputError;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface NativePathfinderWebViewEvent extends PathfinderWebViewEvent {

        /* compiled from: PathfinderWebViewEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent$GoBack;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class GoBack implements NativePathfinderWebViewEvent {
            public static final int $stable = 0;
            public static final GoBack INSTANCE = new GoBack();

            private GoBack() {
            }
        }

        /* compiled from: PathfinderWebViewEvent.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent$SendUserInput;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent;", "userInput", "", "<init>", "(Ljava/lang/String;)V", "getUserInput", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SendUserInput implements NativePathfinderWebViewEvent {
            public static final int $stable = 0;
            private final String userInput;

            public static /* synthetic */ SendUserInput copy$default(SendUserInput sendUserInput, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sendUserInput.userInput;
                }
                return sendUserInput.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserInput() {
                return this.userInput;
            }

            public final SendUserInput copy(String userInput) {
                Intrinsics.checkNotNullParameter(userInput, "userInput");
                return new SendUserInput(userInput);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendUserInput) && Intrinsics.areEqual(this.userInput, ((SendUserInput) other).userInput);
            }

            public int hashCode() {
                return this.userInput.hashCode();
            }

            public String toString() {
                return "SendUserInput(userInput=" + this.userInput + ")";
            }

            public SendUserInput(String userInput) {
                Intrinsics.checkNotNullParameter(userInput, "userInput");
                this.userInput = userInput;
            }

            public final String getUserInput() {
                return this.userInput;
            }
        }

        /* compiled from: PathfinderWebViewEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent$UserInputError;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent$NativePathfinderWebViewEvent;", "error", "Lcom/robinhood/models/ui/PathfinderStateError;", "<init>", "(Lcom/robinhood/models/ui/PathfinderStateError;)V", "getError", "()Lcom/robinhood/models/ui/PathfinderStateError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UserInputError implements NativePathfinderWebViewEvent {
            public static final int $stable = 8;
            private final PathfinderStateError error;

            public static /* synthetic */ UserInputError copy$default(UserInputError userInputError, PathfinderStateError pathfinderStateError, int i, Object obj) {
                if ((i & 1) != 0) {
                    pathfinderStateError = userInputError.error;
                }
                return userInputError.copy(pathfinderStateError);
            }

            /* renamed from: component1, reason: from getter */
            public final PathfinderStateError getError() {
                return this.error;
            }

            public final UserInputError copy(PathfinderStateError error) {
                return new UserInputError(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UserInputError) && Intrinsics.areEqual(this.error, ((UserInputError) other).error);
            }

            public int hashCode() {
                PathfinderStateError pathfinderStateError = this.error;
                if (pathfinderStateError == null) {
                    return 0;
                }
                return pathfinderStateError.hashCode();
            }

            public String toString() {
                return "UserInputError(error=" + this.error + ")";
            }

            public UserInputError(PathfinderStateError pathfinderStateError) {
                this.error = pathfinderStateError;
            }

            public final PathfinderStateError getError() {
                return this.error;
            }
        }
    }
}
