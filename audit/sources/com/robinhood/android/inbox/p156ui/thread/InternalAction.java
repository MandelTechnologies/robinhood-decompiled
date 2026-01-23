package com.robinhood.android.inbox.p156ui.thread;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "", "text", "", "uri", "Landroid/net/Uri;", "<init>", "(Ljava/lang/CharSequence;Landroid/net/Uri;)V", "getText", "()Ljava/lang/CharSequence;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAction {
    private final CharSequence text;
    private final Uri uri;

    public static /* synthetic */ InternalAction copy$default(InternalAction internalAction, CharSequence charSequence, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = internalAction.text;
        }
        if ((i & 2) != 0) {
            uri = internalAction.uri;
        }
        return internalAction.copy(charSequence, uri);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public final InternalAction copy(CharSequence text, Uri uri) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new InternalAction(text, uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAction)) {
            return false;
        }
        InternalAction internalAction = (InternalAction) other;
        return Intrinsics.areEqual(this.text, internalAction.text) && Intrinsics.areEqual(this.uri, internalAction.uri);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.uri.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.text;
        return "InternalAction(text=" + ((Object) charSequence) + ", uri=" + this.uri + ")";
    }

    public InternalAction(CharSequence text, Uri uri) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.text = text;
        this.uri = uri;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final Uri getUri() {
        return this.uri;
    }
}
