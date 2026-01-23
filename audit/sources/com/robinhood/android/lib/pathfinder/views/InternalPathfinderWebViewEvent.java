package com.robinhood.android.lib.pathfinder.views;

import android.webkit.ValueCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalPathfinderWebViewEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/InternalPathfinderWebViewEvent;", "", "<init>", "()V", "JavascriptExecutionEvent", "Lcom/robinhood/android/lib/pathfinder/views/InternalPathfinderWebViewEvent$JavascriptExecutionEvent;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class InternalPathfinderWebViewEvent {
    public static final int $stable = 0;

    public /* synthetic */ InternalPathfinderWebViewEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InternalPathfinderWebViewEvent() {
    }

    /* compiled from: InternalPathfinderWebViewEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/InternalPathfinderWebViewEvent$JavascriptExecutionEvent;", "Lcom/robinhood/android/lib/pathfinder/views/InternalPathfinderWebViewEvent;", "javascriptString", "", "callback", "Landroid/webkit/ValueCallback;", "<init>", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "getJavascriptString", "()Ljava/lang/String;", "getCallback", "()Landroid/webkit/ValueCallback;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class JavascriptExecutionEvent extends InternalPathfinderWebViewEvent {
        public static final int $stable = 8;
        private final ValueCallback<String> callback;
        private final String javascriptString;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JavascriptExecutionEvent copy$default(JavascriptExecutionEvent javascriptExecutionEvent, String str, ValueCallback valueCallback, int i, Object obj) {
            if ((i & 1) != 0) {
                str = javascriptExecutionEvent.javascriptString;
            }
            if ((i & 2) != 0) {
                valueCallback = javascriptExecutionEvent.callback;
            }
            return javascriptExecutionEvent.copy(str, valueCallback);
        }

        /* renamed from: component1, reason: from getter */
        public final String getJavascriptString() {
            return this.javascriptString;
        }

        public final ValueCallback<String> component2() {
            return this.callback;
        }

        public final JavascriptExecutionEvent copy(String javascriptString, ValueCallback<String> callback) {
            Intrinsics.checkNotNullParameter(javascriptString, "javascriptString");
            return new JavascriptExecutionEvent(javascriptString, callback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JavascriptExecutionEvent)) {
                return false;
            }
            JavascriptExecutionEvent javascriptExecutionEvent = (JavascriptExecutionEvent) other;
            return Intrinsics.areEqual(this.javascriptString, javascriptExecutionEvent.javascriptString) && Intrinsics.areEqual(this.callback, javascriptExecutionEvent.callback);
        }

        public int hashCode() {
            int iHashCode = this.javascriptString.hashCode() * 31;
            ValueCallback<String> valueCallback = this.callback;
            return iHashCode + (valueCallback == null ? 0 : valueCallback.hashCode());
        }

        public String toString() {
            return "JavascriptExecutionEvent(javascriptString=" + this.javascriptString + ", callback=" + this.callback + ")";
        }

        public final String getJavascriptString() {
            return this.javascriptString;
        }

        public final ValueCallback<String> getCallback() {
            return this.callback;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavascriptExecutionEvent(String javascriptString, ValueCallback<String> valueCallback) {
            super(null);
            Intrinsics.checkNotNullParameter(javascriptString, "javascriptString");
            this.javascriptString = javascriptString;
            this.callback = valueCallback;
        }
    }
}
