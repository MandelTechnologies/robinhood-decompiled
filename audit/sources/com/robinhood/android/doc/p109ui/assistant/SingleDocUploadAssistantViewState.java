package com.robinhood.android.doc.p109ui.assistant;

import com.robinhood.models.p355ui.DocumentRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleDocUploadAssistantViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState$Error;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState$Loaded;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState$Loading;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class SingleDocUploadAssistantViewState {
    public static final int $stable = 0;

    public /* synthetic */ SingleDocUploadAssistantViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SingleDocUploadAssistantViewState() {
    }

    /* compiled from: SingleDocUploadAssistantViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState$Loading;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends SingleDocUploadAssistantViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: SingleDocUploadAssistantViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState$Loaded;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Lcom/robinhood/models/ui/DocumentRequest;)V", "isDocUploadCompleted", "", "()Z", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loaded extends SingleDocUploadAssistantViewState {
        public static final int $stable = 0;
        private final boolean isDocUploadCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(DocumentRequest documentRequest) {
            super(null);
            Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
            Intrinsics.checkNotNull(documentRequest.getState());
            this.isDocUploadCompleted = !r2.isUploadRequiredFromApp();
        }

        /* renamed from: isDocUploadCompleted, reason: from getter */
        public final boolean getIsDocUploadCompleted() {
            return this.isDocUploadCompleted;
        }
    }

    /* compiled from: SingleDocUploadAssistantViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState$Error;", "Lcom/robinhood/android/doc/ui/assistant/SingleDocUploadAssistantViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends SingleDocUploadAssistantViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
