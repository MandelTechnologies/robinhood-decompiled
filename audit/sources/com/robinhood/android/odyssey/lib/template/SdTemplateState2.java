package com.robinhood.android.odyssey.lib.template;

import android.net.Uri;
import androidx.core.text.PrecomputedTextCompat;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponentDataChange;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPopup;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPage;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdTemplateState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "", "preserveLoadingState", "", "<init>", "(Z)V", "getPreserveLoadingState", "()Z", "Error", "CheckpointUpdate", "DeeplinkReceived", "ExitDeeplinkReceived", "PopupReceived", "LoadedContents", "ComponentDataChange", "DeferredPostValidationSuccess", "FileDownloaded", "UpdatePage", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$CheckpointUpdate;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$ComponentDataChange;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$DeeplinkReceived;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$DeferredPostValidationSuccess;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$Error;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$ExitDeeplinkReceived;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$FileDownloaded;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$LoadedContents;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$PopupReceived;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$UpdatePage;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class SdTemplateState2 {
    public static final int $stable = 0;
    private final boolean preserveLoadingState;

    public /* synthetic */ SdTemplateState2(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private SdTemplateState2(boolean z) {
        this.preserveLoadingState = z;
    }

    public final boolean getPreserveLoadingState() {
        return this.preserveLoadingState;
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$Error;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "throwable", "", "reason", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$Error$FailureReason;", "<init>", "(Ljava/lang/Throwable;Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$Error$FailureReason;)V", "getThrowable", "()Ljava/lang/Throwable;", "getReason", "()Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$Error$FailureReason;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "FailureReason", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$Error, reason: from toString */
    public static final /* data */ class Error extends SdTemplateState2 {
        public static final int $stable = 8;
        private final FailureReason reason;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, FailureReason failureReason, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            if ((i & 2) != 0) {
                failureReason = error.reason;
            }
            return error.copy(th, failureReason);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final FailureReason getReason() {
            return this.reason;
        }

        public final Error copy(Throwable throwable, FailureReason reason) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Error(throwable, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.throwable, error.throwable) && this.reason == error.reason;
        }

        public int hashCode() {
            return (this.throwable.hashCode() * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ", reason=" + this.reason + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable, FailureReason reason) {
            super(false, null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.throwable = throwable;
            this.reason = reason;
        }

        public final FailureReason getReason() {
            return this.reason;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SdTemplateState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$Error$FailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKPOINT", "CONTENT_LOADING", "VALIDATION", "FILE_DOWNLOAD", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$Error$FailureReason */
        public static final class FailureReason {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ FailureReason[] $VALUES;
            public static final FailureReason CHECKPOINT = new FailureReason("CHECKPOINT", 0);
            public static final FailureReason CONTENT_LOADING = new FailureReason("CONTENT_LOADING", 1);
            public static final FailureReason VALIDATION = new FailureReason("VALIDATION", 2);
            public static final FailureReason FILE_DOWNLOAD = new FailureReason("FILE_DOWNLOAD", 3);

            private static final /* synthetic */ FailureReason[] $values() {
                return new FailureReason[]{CHECKPOINT, CONTENT_LOADING, VALIDATION, FILE_DOWNLOAD};
            }

            public static EnumEntries<FailureReason> getEntries() {
                return $ENTRIES;
            }

            private FailureReason(String str, int i) {
            }

            static {
                FailureReason[] failureReasonArr$values = $values();
                $VALUES = failureReasonArr$values;
                $ENTRIES = EnumEntries2.enumEntries(failureReasonArr$values);
            }

            public static FailureReason valueOf(String str) {
                return (FailureReason) Enum.valueOf(FailureReason.class, str);
            }

            public static FailureReason[] values() {
                return (FailureReason[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$CheckpointUpdate;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "newPages", "", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "newEntities", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getNewPages", "()Ljava/util/List;", "getNewEntities", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$CheckpointUpdate, reason: from toString */
    public static final /* data */ class CheckpointUpdate extends SdTemplateState2 {
        public static final int $stable = 8;
        private final Map<SdBackendMetadata, ApiSdTypedValue> newEntities;
        private final List<ApiSdPage> newPages;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CheckpointUpdate copy$default(CheckpointUpdate checkpointUpdate, List list, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                list = checkpointUpdate.newPages;
            }
            if ((i & 2) != 0) {
                map = checkpointUpdate.newEntities;
            }
            return checkpointUpdate.copy(list, map);
        }

        public final List<ApiSdPage> component1() {
            return this.newPages;
        }

        public final Map<SdBackendMetadata, ApiSdTypedValue> component2() {
            return this.newEntities;
        }

        public final CheckpointUpdate copy(List<? extends ApiSdPage> newPages, Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities) {
            Intrinsics.checkNotNullParameter(newPages, "newPages");
            Intrinsics.checkNotNullParameter(newEntities, "newEntities");
            return new CheckpointUpdate(newPages, newEntities);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckpointUpdate)) {
                return false;
            }
            CheckpointUpdate checkpointUpdate = (CheckpointUpdate) other;
            return Intrinsics.areEqual(this.newPages, checkpointUpdate.newPages) && Intrinsics.areEqual(this.newEntities, checkpointUpdate.newEntities);
        }

        public int hashCode() {
            return (this.newPages.hashCode() * 31) + this.newEntities.hashCode();
        }

        public String toString() {
            return "CheckpointUpdate(newPages=" + this.newPages + ", newEntities=" + this.newEntities + ")";
        }

        public final List<ApiSdPage> getNewPages() {
            return this.newPages;
        }

        public final Map<SdBackendMetadata, ApiSdTypedValue> getNewEntities() {
            return this.newEntities;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CheckpointUpdate(List<? extends ApiSdPage> newPages, Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities) {
            super(true, null);
            Intrinsics.checkNotNullParameter(newPages, "newPages");
            Intrinsics.checkNotNullParameter(newEntities, "newEntities");
            this.newPages = newPages;
            this.newEntities = newEntities;
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$DeeplinkReceived;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "url", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUrl", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$DeeplinkReceived, reason: from toString */
    public static final /* data */ class DeeplinkReceived extends SdTemplateState2 {
        public static final int $stable = 8;
        private final Uri url;

        public static /* synthetic */ DeeplinkReceived copy$default(DeeplinkReceived deeplinkReceived, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = deeplinkReceived.url;
            }
            return deeplinkReceived.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUrl() {
            return this.url;
        }

        public final DeeplinkReceived copy(Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new DeeplinkReceived(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeeplinkReceived) && Intrinsics.areEqual(this.url, ((DeeplinkReceived) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "DeeplinkReceived(url=" + this.url + ")";
        }

        public final Uri getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeeplinkReceived(Uri url) {
            super(false, null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$ExitDeeplinkReceived;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "url", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUrl", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$ExitDeeplinkReceived, reason: from toString */
    public static final /* data */ class ExitDeeplinkReceived extends SdTemplateState2 {
        public static final int $stable = 8;
        private final Uri url;

        public static /* synthetic */ ExitDeeplinkReceived copy$default(ExitDeeplinkReceived exitDeeplinkReceived, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = exitDeeplinkReceived.url;
            }
            return exitDeeplinkReceived.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUrl() {
            return this.url;
        }

        public final ExitDeeplinkReceived copy(Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new ExitDeeplinkReceived(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExitDeeplinkReceived) && Intrinsics.areEqual(this.url, ((ExitDeeplinkReceived) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "ExitDeeplinkReceived(url=" + this.url + ")";
        }

        public final Uri getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExitDeeplinkReceived(Uri url) {
            super(true, null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$PopupReceived;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "popup", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "<init>", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;)V", "getPopup", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$PopupReceived, reason: from toString */
    public static final /* data */ class PopupReceived extends SdTemplateState2 {
        public static final int $stable = 8;
        private final ApiSdPopup popup;

        public static /* synthetic */ PopupReceived copy$default(PopupReceived popupReceived, ApiSdPopup apiSdPopup, int i, Object obj) {
            if ((i & 1) != 0) {
                apiSdPopup = popupReceived.popup;
            }
            return popupReceived.copy(apiSdPopup);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSdPopup getPopup() {
            return this.popup;
        }

        public final PopupReceived copy(ApiSdPopup popup) {
            Intrinsics.checkNotNullParameter(popup, "popup");
            return new PopupReceived(popup);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PopupReceived) && Intrinsics.areEqual(this.popup, ((PopupReceived) other).popup);
        }

        public int hashCode() {
            return this.popup.hashCode();
        }

        public String toString() {
            return "PopupReceived(popup=" + this.popup + ")";
        }

        public final ApiSdPopup getPopup() {
            return this.popup;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopupReceived(ApiSdPopup popup) {
            super(false, null);
            Intrinsics.checkNotNullParameter(popup, "popup");
            this.popup = popup;
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$LoadedContents;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "loadedInfo", "", "Lkotlin/Pair;", "Landroidx/core/text/PrecomputedTextCompat;", "", "onFinishLoadingAction", "Lkotlin/Function0;", "", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "getLoadedInfo", "()Ljava/util/List;", "getOnFinishLoadingAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$LoadedContents, reason: from toString */
    public static final /* data */ class LoadedContents extends SdTemplateState2 {
        public static final int $stable = 8;
        private final List<Tuples2<PrecomputedTextCompat, String>> loadedInfo;
        private final Function0<Unit> onFinishLoadingAction;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadedContents copy$default(LoadedContents loadedContents, List list, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loadedContents.loadedInfo;
            }
            if ((i & 2) != 0) {
                function0 = loadedContents.onFinishLoadingAction;
            }
            return loadedContents.copy(list, function0);
        }

        public final List<Tuples2<PrecomputedTextCompat, String>> component1() {
            return this.loadedInfo;
        }

        public final Function0<Unit> component2() {
            return this.onFinishLoadingAction;
        }

        public final LoadedContents copy(List<? extends Tuples2<? extends PrecomputedTextCompat, String>> loadedInfo, Function0<Unit> onFinishLoadingAction) {
            Intrinsics.checkNotNullParameter(loadedInfo, "loadedInfo");
            Intrinsics.checkNotNullParameter(onFinishLoadingAction, "onFinishLoadingAction");
            return new LoadedContents(loadedInfo, onFinishLoadingAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadedContents)) {
                return false;
            }
            LoadedContents loadedContents = (LoadedContents) other;
            return Intrinsics.areEqual(this.loadedInfo, loadedContents.loadedInfo) && Intrinsics.areEqual(this.onFinishLoadingAction, loadedContents.onFinishLoadingAction);
        }

        public int hashCode() {
            return (this.loadedInfo.hashCode() * 31) + this.onFinishLoadingAction.hashCode();
        }

        public String toString() {
            return "LoadedContents(loadedInfo=" + this.loadedInfo + ", onFinishLoadingAction=" + this.onFinishLoadingAction + ")";
        }

        public final List<Tuples2<PrecomputedTextCompat, String>> getLoadedInfo() {
            return this.loadedInfo;
        }

        public final Function0<Unit> getOnFinishLoadingAction() {
            return this.onFinishLoadingAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LoadedContents(List<? extends Tuples2<? extends PrecomputedTextCompat, String>> loadedInfo, Function0<Unit> onFinishLoadingAction) {
            super(false, null);
            Intrinsics.checkNotNullParameter(loadedInfo, "loadedInfo");
            Intrinsics.checkNotNullParameter(onFinishLoadingAction, "onFinishLoadingAction");
            this.loadedInfo = loadedInfo;
            this.onFinishLoadingAction = onFinishLoadingAction;
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$ComponentDataChange;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "changes", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponentDataChange;", "<init>", "(Ljava/util/List;)V", "getChanges", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$ComponentDataChange, reason: from toString */
    public static final /* data */ class ComponentDataChange extends SdTemplateState2 {
        public static final int $stable = 8;
        private final List<ApiSdComponentDataChange> changes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComponentDataChange copy$default(ComponentDataChange componentDataChange, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = componentDataChange.changes;
            }
            return componentDataChange.copy(list);
        }

        public final List<ApiSdComponentDataChange> component1() {
            return this.changes;
        }

        public final ComponentDataChange copy(List<? extends ApiSdComponentDataChange> changes) {
            Intrinsics.checkNotNullParameter(changes, "changes");
            return new ComponentDataChange(changes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ComponentDataChange) && Intrinsics.areEqual(this.changes, ((ComponentDataChange) other).changes);
        }

        public int hashCode() {
            return this.changes.hashCode();
        }

        public String toString() {
            return "ComponentDataChange(changes=" + this.changes + ")";
        }

        public final List<ApiSdComponentDataChange> getChanges() {
            return this.changes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ComponentDataChange(List<? extends ApiSdComponentDataChange> changes) {
            super(false, null);
            Intrinsics.checkNotNullParameter(changes, "changes");
            this.changes = changes;
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$DeferredPostValidationSuccess;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "newEntities", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "<init>", "(Ljava/util/Map;)V", "getNewEntities", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$DeferredPostValidationSuccess, reason: from toString */
    public static final /* data */ class DeferredPostValidationSuccess extends SdTemplateState2 {
        public static final int $stable = 8;
        private final Map<SdBackendMetadata, ApiSdTypedValue> newEntities;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeferredPostValidationSuccess copy$default(DeferredPostValidationSuccess deferredPostValidationSuccess, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = deferredPostValidationSuccess.newEntities;
            }
            return deferredPostValidationSuccess.copy(map);
        }

        public final Map<SdBackendMetadata, ApiSdTypedValue> component1() {
            return this.newEntities;
        }

        public final DeferredPostValidationSuccess copy(Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities) {
            Intrinsics.checkNotNullParameter(newEntities, "newEntities");
            return new DeferredPostValidationSuccess(newEntities);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeferredPostValidationSuccess) && Intrinsics.areEqual(this.newEntities, ((DeferredPostValidationSuccess) other).newEntities);
        }

        public int hashCode() {
            return this.newEntities.hashCode();
        }

        public String toString() {
            return "DeferredPostValidationSuccess(newEntities=" + this.newEntities + ")";
        }

        public final Map<SdBackendMetadata, ApiSdTypedValue> getNewEntities() {
            return this.newEntities;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DeferredPostValidationSuccess(Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities) {
            super(true, null);
            Intrinsics.checkNotNullParameter(newEntities, "newEntities");
            this.newEntities = newEntities;
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$FileDownloaded;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "file", "Ljava/io/File;", "contentType", "", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getContentType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$FileDownloaded, reason: from toString */
    public static final /* data */ class FileDownloaded extends SdTemplateState2 {
        public static final int $stable = 8;
        private final String contentType;
        private final File file;

        public static /* synthetic */ FileDownloaded copy$default(FileDownloaded fileDownloaded, File file, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                file = fileDownloaded.file;
            }
            if ((i & 2) != 0) {
                str = fileDownloaded.contentType;
            }
            return fileDownloaded.copy(file, str);
        }

        /* renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        public final FileDownloaded copy(File file, String contentType) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return new FileDownloaded(file, contentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileDownloaded)) {
                return false;
            }
            FileDownloaded fileDownloaded = (FileDownloaded) other;
            return Intrinsics.areEqual(this.file, fileDownloaded.file) && Intrinsics.areEqual(this.contentType, fileDownloaded.contentType);
        }

        public int hashCode() {
            return (this.file.hashCode() * 31) + this.contentType.hashCode();
        }

        public String toString() {
            return "FileDownloaded(file=" + this.file + ", contentType=" + this.contentType + ")";
        }

        public final File getFile() {
            return this.file;
        }

        public final String getContentType() {
            return this.contentType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileDownloaded(File file, String contentType) {
            super(false, null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.file = file;
            this.contentType = contentType;
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$UpdatePage;", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "page", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "<init>", "(Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;)V", "getPage", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoUiEventData$UpdatePage, reason: from toString */
    public static final /* data */ class UpdatePage extends SdTemplateState2 {
        public static final int $stable = 8;
        private final ApiSdPage page;

        public static /* synthetic */ UpdatePage copy$default(UpdatePage updatePage, ApiSdPage apiSdPage, int i, Object obj) {
            if ((i & 1) != 0) {
                apiSdPage = updatePage.page;
            }
            return updatePage.copy(apiSdPage);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSdPage getPage() {
            return this.page;
        }

        public final UpdatePage copy(ApiSdPage page) {
            Intrinsics.checkNotNullParameter(page, "page");
            return new UpdatePage(page);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdatePage) && Intrinsics.areEqual(this.page, ((UpdatePage) other).page);
        }

        public int hashCode() {
            return this.page.hashCode();
        }

        public String toString() {
            return "UpdatePage(page=" + this.page + ")";
        }

        public final ApiSdPage getPage() {
            return this.page;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatePage(ApiSdPage page) {
            super(false, null);
            Intrinsics.checkNotNullParameter(page, "page");
            this.page = page;
        }
    }
}
