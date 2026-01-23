package com.robinhood.android.gold.eoy2025;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Eoy2025Event.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Event;", "", "<init>", "()V", "DismissView", "InvokeJavaScript", "ShowSystemShareScreen", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Event$DismissView;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Event$InvokeJavaScript;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Event$ShowSystemShareScreen;", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class Eoy2025Event {
    public static final int $stable = 0;

    public /* synthetic */ Eoy2025Event(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Eoy2025Event.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Event$DismissView;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissView extends Eoy2025Event {
        public static final int $stable = 0;
        public static final DismissView INSTANCE = new DismissView();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissView);
        }

        public int hashCode() {
            return -1773909021;
        }

        public String toString() {
            return "DismissView";
        }

        private DismissView() {
            super(null);
        }
    }

    private Eoy2025Event() {
    }

    /* compiled from: Eoy2025Event.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Event$InvokeJavaScript;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Event;", "javascript", "", "<init>", "(Ljava/lang/String;)V", "getJavascript", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvokeJavaScript extends Eoy2025Event {
        public static final int $stable = 0;
        private final String javascript;

        public static /* synthetic */ InvokeJavaScript copy$default(InvokeJavaScript invokeJavaScript, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invokeJavaScript.javascript;
            }
            return invokeJavaScript.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getJavascript() {
            return this.javascript;
        }

        public final InvokeJavaScript copy(String javascript) {
            Intrinsics.checkNotNullParameter(javascript, "javascript");
            return new InvokeJavaScript(javascript);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvokeJavaScript) && Intrinsics.areEqual(this.javascript, ((InvokeJavaScript) other).javascript);
        }

        public int hashCode() {
            return this.javascript.hashCode();
        }

        public String toString() {
            return "InvokeJavaScript(javascript=" + this.javascript + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvokeJavaScript(String javascript) {
            super(null);
            Intrinsics.checkNotNullParameter(javascript, "javascript");
            this.javascript = javascript;
        }

        public final String getJavascript() {
            return this.javascript;
        }
    }

    /* compiled from: Eoy2025Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Event$ShowSystemShareScreen;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Event;", "contents", "", "", "includeCanvasImage", "", "<init>", "(Ljava/util/List;Z)V", "getContents", "()Ljava/util/List;", "getIncludeCanvasImage", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSystemShareScreen extends Eoy2025Event {
        public static final int $stable = 8;
        private final List<String> contents;
        private final boolean includeCanvasImage;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowSystemShareScreen copy$default(ShowSystemShareScreen showSystemShareScreen, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = showSystemShareScreen.contents;
            }
            if ((i & 2) != 0) {
                z = showSystemShareScreen.includeCanvasImage;
            }
            return showSystemShareScreen.copy(list, z);
        }

        public final List<String> component1() {
            return this.contents;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIncludeCanvasImage() {
            return this.includeCanvasImage;
        }

        public final ShowSystemShareScreen copy(List<String> contents, boolean includeCanvasImage) {
            Intrinsics.checkNotNullParameter(contents, "contents");
            return new ShowSystemShareScreen(contents, includeCanvasImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowSystemShareScreen)) {
                return false;
            }
            ShowSystemShareScreen showSystemShareScreen = (ShowSystemShareScreen) other;
            return Intrinsics.areEqual(this.contents, showSystemShareScreen.contents) && this.includeCanvasImage == showSystemShareScreen.includeCanvasImage;
        }

        public int hashCode() {
            return (this.contents.hashCode() * 31) + Boolean.hashCode(this.includeCanvasImage);
        }

        public String toString() {
            return "ShowSystemShareScreen(contents=" + this.contents + ", includeCanvasImage=" + this.includeCanvasImage + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSystemShareScreen(List<String> contents, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(contents, "contents");
            this.contents = contents;
            this.includeCanvasImage = z;
        }

        public final List<String> getContents() {
            return this.contents;
        }

        public final boolean getIncludeCanvasImage() {
            return this.includeCanvasImage;
        }
    }
}
