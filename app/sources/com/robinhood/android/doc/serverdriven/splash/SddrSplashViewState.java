package com.robinhood.android.doc.serverdriven.splash;

import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrSplashViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState$Loaded;", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState$Loading;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface SddrSplashViewState {

    /* compiled from: SddrSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState$Loading;", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements SddrSplashViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1329870410;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: SddrSplashViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState$Loaded;", "Lcom/robinhood/android/doc/serverdriven/splash/SddrSplashViewState;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "primaryMethod", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;", "secondaryMethod", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getPrimaryMethod", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;", "getSecondaryMethod", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements SddrSplashViewState {
        public static final int $stable = 8;
        private final UIComponent<GenericAction> content;
        private final ApiDocumentRequest.AllowedCaptureMethods primaryMethod;
        private final ApiDocumentRequest.AllowedCaptureMethods secondaryMethod;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, UIComponent uIComponent, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods2, int i, Object obj) {
            if ((i & 1) != 0) {
                uIComponent = loaded.content;
            }
            if ((i & 2) != 0) {
                allowedCaptureMethods = loaded.primaryMethod;
            }
            if ((i & 4) != 0) {
                allowedCaptureMethods2 = loaded.secondaryMethod;
            }
            return loaded.copy(uIComponent, allowedCaptureMethods, allowedCaptureMethods2);
        }

        public final UIComponent<GenericAction> component1() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDocumentRequest.AllowedCaptureMethods getPrimaryMethod() {
            return this.primaryMethod;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiDocumentRequest.AllowedCaptureMethods getSecondaryMethod() {
            return this.secondaryMethod;
        }

        public final Loaded copy(UIComponent<? extends GenericAction> content, ApiDocumentRequest.AllowedCaptureMethods primaryMethod, ApiDocumentRequest.AllowedCaptureMethods secondaryMethod) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(primaryMethod, "primaryMethod");
            return new Loaded(content, primaryMethod, secondaryMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.content, loaded.content) && this.primaryMethod == loaded.primaryMethod && this.secondaryMethod == loaded.secondaryMethod;
        }

        public int hashCode() {
            int iHashCode = ((this.content.hashCode() * 31) + this.primaryMethod.hashCode()) * 31;
            ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods = this.secondaryMethod;
            return iHashCode + (allowedCaptureMethods == null ? 0 : allowedCaptureMethods.hashCode());
        }

        public String toString() {
            return "Loaded(content=" + this.content + ", primaryMethod=" + this.primaryMethod + ", secondaryMethod=" + this.secondaryMethod + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(UIComponent<? extends GenericAction> content, ApiDocumentRequest.AllowedCaptureMethods primaryMethod, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(primaryMethod, "primaryMethod");
            this.content = content;
            this.primaryMethod = primaryMethod;
            this.secondaryMethod = allowedCaptureMethods;
        }

        public final UIComponent<GenericAction> getContent() {
            return this.content;
        }

        public final ApiDocumentRequest.AllowedCaptureMethods getPrimaryMethod() {
            return this.primaryMethod;
        }

        public final ApiDocumentRequest.AllowedCaptureMethods getSecondaryMethod() {
            return this.secondaryMethod;
        }
    }
}
