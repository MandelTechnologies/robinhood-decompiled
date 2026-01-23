package com.robinhood.android.doc.p109ui.splash;

import com.robinhood.models.api.IdDocument;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadSplashViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState$Error;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState$Loaded;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState$Loading;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class DocUploadSplashViewState {
    public static final int $stable = 0;

    public /* synthetic */ DocUploadSplashViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DocUploadSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState$Loading;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends DocUploadSplashViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private DocUploadSplashViewState() {
    }

    /* compiled from: DocUploadSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState$Loaded;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState;", "titleText", "", "bodyMarkdown", "sides", "", "Lcom/robinhood/models/api/IdDocument$Side;", "takePhoto", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getTitleText", "()Ljava/lang/String;", "getBodyMarkdown", "getSides", "()Ljava/util/List;", "getTakePhoto", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends DocUploadSplashViewState {
        public static final int $stable = 8;
        private final String bodyMarkdown;
        private final List<IdDocument.Side> sides;
        private final UiEvent<Unit> takePhoto;
        private final String titleText;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, List list, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.titleText;
            }
            if ((i & 2) != 0) {
                str2 = loaded.bodyMarkdown;
            }
            if ((i & 4) != 0) {
                list = loaded.sides;
            }
            if ((i & 8) != 0) {
                uiEvent = loaded.takePhoto;
            }
            return loaded.copy(str, str2, list, uiEvent);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBodyMarkdown() {
            return this.bodyMarkdown;
        }

        public final List<IdDocument.Side> component3() {
            return this.sides;
        }

        public final UiEvent<Unit> component4() {
            return this.takePhoto;
        }

        public final Loaded copy(String titleText, String bodyMarkdown, List<? extends IdDocument.Side> sides, UiEvent<Unit> takePhoto) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(bodyMarkdown, "bodyMarkdown");
            Intrinsics.checkNotNullParameter(sides, "sides");
            return new Loaded(titleText, bodyMarkdown, sides, takePhoto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.titleText, loaded.titleText) && Intrinsics.areEqual(this.bodyMarkdown, loaded.bodyMarkdown) && Intrinsics.areEqual(this.sides, loaded.sides) && Intrinsics.areEqual(this.takePhoto, loaded.takePhoto);
        }

        public int hashCode() {
            int iHashCode = ((((this.titleText.hashCode() * 31) + this.bodyMarkdown.hashCode()) * 31) + this.sides.hashCode()) * 31;
            UiEvent<Unit> uiEvent = this.takePhoto;
            return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
        }

        public String toString() {
            return "Loaded(titleText=" + this.titleText + ", bodyMarkdown=" + this.bodyMarkdown + ", sides=" + this.sides + ", takePhoto=" + this.takePhoto + ")";
        }

        public /* synthetic */ Loaded(String str, String str2, List list, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, (i & 8) != 0 ? null : uiEvent);
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public final String getBodyMarkdown() {
            return this.bodyMarkdown;
        }

        public final List<IdDocument.Side> getSides() {
            return this.sides;
        }

        public final UiEvent<Unit> getTakePhoto() {
            return this.takePhoto;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(String titleText, String bodyMarkdown, List<? extends IdDocument.Side> sides, UiEvent<Unit> uiEvent) {
            super(null);
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(bodyMarkdown, "bodyMarkdown");
            Intrinsics.checkNotNullParameter(sides, "sides");
            this.titleText = titleText;
            this.bodyMarkdown = bodyMarkdown;
            this.sides = sides;
            this.takePhoto = uiEvent;
        }
    }

    /* compiled from: DocUploadSplashViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState$Error;", "Lcom/robinhood/android/doc/ui/splash/DocUploadSplashViewState;", "cause", "", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/doc/ui/splash/SplashErrorEvent;", "<init>", "(Ljava/lang/Throwable;Lcom/robinhood/udf/UiEvent;)V", "getCause", "()Ljava/lang/Throwable;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends DocUploadSplashViewState {
        public static final int $stable = 8;
        private final Throwable cause;
        private final UiEvent<DocUploadSplashViewState2> event;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, Throwable th, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.cause;
            }
            if ((i & 2) != 0) {
                uiEvent = error.event;
            }
            return error.copy(th, uiEvent);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final UiEvent<DocUploadSplashViewState2> component2() {
            return this.event;
        }

        public final Error copy(Throwable cause, UiEvent<DocUploadSplashViewState2> event) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Error(cause, event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.cause, error.cause) && Intrinsics.areEqual(this.event, error.event);
        }

        public int hashCode() {
            int iHashCode = this.cause.hashCode() * 31;
            UiEvent<DocUploadSplashViewState2> uiEvent = this.event;
            return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
        }

        public String toString() {
            return "Error(cause=" + this.cause + ", event=" + this.event + ")";
        }

        public /* synthetic */ Error(Throwable th, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : uiEvent);
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final UiEvent<DocUploadSplashViewState2> getEvent() {
            return this.event;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable cause, UiEvent<DocUploadSplashViewState2> uiEvent) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
            this.event = uiEvent;
        }
    }
}
